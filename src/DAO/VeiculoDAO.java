package DAO;

import Exception.NaoEncontrado;


import View.ConnectionFactory;
import View.LeituraDeArquivo;
import model.Veiculo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class VeiculoDAO {

    public List<Veiculo> read(){
        List<Veiculo> veiculos = new LinkedList<>();
        Connection conn = null;
        PreparedStatement p = null;
        ResultSet rs = null;
        try{
            conn= ConnectionFactory.getConnection();
            p= conn.prepareStatement("SELECT * FROM veiculo");
            rs= p.executeQuery();

            while(rs.next()){
                Veiculo v  = new Veiculo(rs.getString("placa"),
                        rs.getString("modelo"),
                        rs.getString("cor"));
                veiculos.add(v);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionFactory.closeConnection(conn,p,rs);
        }
        return veiculos;
    }

    public void addUrl(String url){
        LeituraDeArquivo leitura= new LeituraDeArquivo(url,3);
        String veiculos[]= leitura.divide();

        Connection c = null;
        PreparedStatement p= null;

        try{

            c = ConnectionFactory.getConnection();
            String sql = "INSERT INTO veiculo(placa,modelo,cor) VALUES(?,?,?)";
            p= c.prepareStatement(sql);
            while(veiculos != null){
                p.setString(1,veiculos[0]);
                p.setString(2,veiculos[1]);
                p.setString(3,veiculos[2]);
                p.executeUpdate();
                veiculos= leitura.divide();
            }
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            ConnectionFactory.closeConnection(c,p);
        }
    }

    public Veiculo search(String placa) throws NaoEncontrado {
        Veiculo v = null;

        Connection c = null;
        PreparedStatement p= null;
        ResultSet r = null;

        try{
            c = ConnectionFactory.getConnection();
            String sql="SELECT * FROM veiculo WHERE placa= ?";
            p= c.prepareStatement(sql);
            p.setString(1,placa);

            r= p.executeQuery();

            if(r.next()){
                v= new Veiculo(r.getString("placa"), r.getString("modelo"), r.getString("cor"));
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(c,p,r);
        }
        if(v == null){
            throw new NaoEncontrado();
        }

        return v;
    }
}
