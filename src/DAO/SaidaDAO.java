package DAO;

import View.ConnectionFactory;
import model.Entrada;
import model.Saida;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SaidaDAO {

    public void add(Saida saida){
        Connection c = null;
        PreparedStatement p =null;

        try{
            c= ConnectionFactory.getConnection();
            String sql="INSERT INTO saida(placa,id_estacionamento, date ,hora) values(?,?,?,?)";
            p= c.prepareStatement(sql);

            p.setString(1, saida.getVeiculo().getPlaca());
            p.setInt(2, saida.getEstacionamento().getId());
            p.setDate(3,saida.getData());
            p.setString(4, saida.getHorario());

            p.executeUpdate();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(c,p);
        }
    }
}
