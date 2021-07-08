package DAO;

import Exception.NaoEncontrado;

import View.ConnectionFactory;
import View.LeituraDeArquivo;
import model.Convidado;
import model.Veiculo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class ConvidadoDAO {

    public List<Convidado> read(){
        List<Convidado> c = new LinkedList<>();

        String placa="";
        String modelo="";
        String cor="";

        Connection conn= null;
        PreparedStatement p= null;
        PreparedStatement pr= null;
        ResultSet r= null;
        ResultSet rr= null;

        try{

            conn= ConnectionFactory.getConnection();
            p= conn.prepareStatement("SELECT * FROM convidado");
            pr= conn.prepareStatement("SELECT * FROM veiculo WHERE placa= ?");
            r = p.executeQuery();

            while(r.next()){
                pr.setString(1, r.getString("placa_car"));
                rr= pr.executeQuery();
                while(rr.next()){
                    placa= rr.getString("placa");
                    modelo= rr.getString("modelo");
                    cor= rr.getString("cor");
                }
                Convidado convidado = new Convidado(r.getString("nome"), r.getDate("data_entrada"), r.getString("sobrenome"),
                                      r.getString("sexo").charAt(0), r.getString("rua"), r.getString("numero_rua"),
                                      r.getString("complemento"), new Veiculo(placa, modelo, cor), r.getString("cpf"),rr.getString("fone1"), rr.getString("fone2"));
                c.add(convidado);
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);

        }finally {
            ConnectionFactory.closeConnection(conn, p, r);
            try{
                pr.close();
                rr.close();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }


        return c;
    }

    public boolean search(String cpf) throws NaoEncontrado{
        Connection c = null;
        PreparedStatement p= null;
        ResultSet r = null;

        try{
            c = ConnectionFactory.getConnection();
            String sql="SELECT * FROM convidado WHERE cpf= ?";
            p= c.prepareStatement(sql);
            p.setString(1,cpf);

            r= p.executeQuery();

            if(r.next()){
                return true;
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(c,p,r);
        }


        throw new NaoEncontrado();
    }

    public void addUrl(String url){
        LeituraDeArquivo leitura= new LeituraDeArquivo(url,11);
        String con[]= leitura.divide();

        Connection c = null;
        PreparedStatement p= null;

        try{

            c = ConnectionFactory.getConnection();
            String sql = "INSERT INTO convidado(cpf,data_entrada,nome,sobrenome,sexo,bairro,numero_rua,complemento,fone1,fone2,placa_car) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            p= c.prepareStatement(sql);
            while(con != null){
                p.setString(1,con[0]);
                p.setString(2,con[1]);
                p.setString(3,con[2]);
                p.setString(4,con[3]);
                p.setString(5,con[4]);
                p.setString(6,con[5]);
                p.setString(7,con[6]);
                p.setString(8,con[7]);
                p.setString(9,con[8]);
                p.setString(10,con[9]);
                p.setString(11,con[10]);
                p.executeUpdate();
                con= leitura.divide();
            }

        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);

        }finally {
            ConnectionFactory.closeConnection(c,p);
        }
    }

}
