package DAO;

import Exception.NaoEncontrado;

import View.ConnectionFactory;
import View.LeituraDeArquivo;
import model.Departamento;
import model.Funcionario;
import model.Veiculo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class FuncionarioDAO {

    public List<Funcionario> read(){
        List<Funcionario> funcionarios = new LinkedList<>();
        String placa="";
        String modelo="";
        String cor="";
        int id= -1;
        String nome="";


        Connection conn= null;
        PreparedStatement p= null;
        PreparedStatement pv= null;
        PreparedStatement pd= null;
        ResultSet r= null;
        ResultSet rv= null;
        ResultSet rd= null;

        try{
            conn = ConnectionFactory.getConnection();
            p= conn.prepareStatement("SELECT * FROM funcionario");
            pv= conn.prepareStatement("SELECT * FROM veiculo WHERE placa= ?");
            pd= conn.prepareStatement("SELECT * FROM departamento WHERE id= ?");
            r= p.executeQuery();


            while(r.next()){
                pv.setString(1, r.getString("placa_car"));
                rv= pv.executeQuery();
                while(rv.next()){
                    placa= rv.getString("placa");
                    modelo= rv.getString("modelo");
                    cor= rv.getString("cor");
                }
                pd.setString(1,r.getString("id_dep"));
                rd= pd.executeQuery();
                while(rd.next()){
                    id= rd.getInt("id");
                    nome= rd.getString("nome");
                }
                Funcionario f = new Funcionario(r.getString("nome"), r.getString("sobrenome"), r.getString("sexo").charAt(0),
                                               r.getString("rua"),r.getString("numero_rua"),r.getString("complemento"),
                                               new Veiculo(placa,modelo,cor),r.getString("matricula"), new Departamento(id,nome),rd.getString("fone1"), rd.getString("fone2"));

                funcionarios.add(f);
            }


        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(conn,p,r);
            try{
                pv.close();
                pd.close();
                rv.close();
                rd.close();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }




        return funcionarios;
    }

    public boolean search(String matricula) throws NaoEncontrado {

        Connection c = null;
        PreparedStatement p= null;
        ResultSet r = null;

        try{
            c = ConnectionFactory.getConnection();
            String sql="SELECT * FROM funcionario WHERE matricula= ?";
            p= c.prepareStatement(sql);
            p.setString(1,matricula);

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
        LeituraDeArquivo leitura= new LeituraDeArquivo(url,12);
        String fun[]= leitura.divide();

        Connection c = null;
        PreparedStatement p= null;

        try{

            c = ConnectionFactory.getConnection();
            String sql = "INSERT INTO funcionario(matricula,nome,sobrenome,sexo,bairro,numero_rua,complemento,tipo,fone1,fone2,placa_car,id_dep) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            p= c.prepareStatement(sql);
            while(fun != null){
                p.setString(1,fun[0]);
                p.setString(2,fun[1]);
                p.setString(3,fun[2]);
                p.setString(4,fun[3]);
                p.setString(5,fun[4]);
                p.setString(6,fun[5]);
                p.setString(7,fun[6]);
                p.setString(8,fun[7]);
                p.setString(9,fun[8]);
                p.setString(10,fun[9]);
                p.setString(11,fun[10]);
                p.setString(12,fun[11]);
                p.executeUpdate();
                fun= leitura.divide();
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);

        }finally {
            ConnectionFactory.closeConnection(c,p);
        }
    }
}
