package DAO;

import View.ConnectionFactory;
import model.Entrada;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class EntradaDAO {

    public void add(Entrada entrada){
        Connection c = null;
        PreparedStatement p =null;

        try{
            c= ConnectionFactory.getConnection();
            String sql="INSERT INTO entrada(placa,id_estacionamento, date ,hora) values(?,?,?,?)";
            p= c.prepareStatement(sql);

            p.setString(1,entrada.getVeiculo().getPlaca());
            p.setInt(2, entrada.getEstacionamento().getId());
            p.setDate(3,entrada.getData());
            p.setString(4, entrada.getHorario());

            p.executeUpdate();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(c,p);
        }
    }
}
