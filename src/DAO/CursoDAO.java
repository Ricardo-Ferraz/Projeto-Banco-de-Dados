package DAO;

import View.ConnectionFactory;
import java.sql.Connection;
import model.Curso;
import model.Departamento;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class CursoDAO {

    public List<Curso> read(){
        List<Curso> cursos = new LinkedList<>();
        int id= -1;
        String nome= "";

        Connection conn = null;
        PreparedStatement p= null;
        ResultSet r = null;
        PreparedStatement pd= null;
        ResultSet rd= null;

        try{

            conn= ConnectionFactory.getConnection();
            p = conn.prepareStatement("SELECT * FROM curso");
            pd= conn.prepareStatement("SELECT * FROM departamento WHERE id = ?");
            r = p.executeQuery();

            while(r.next()){
                pd.setInt(1,r.getInt("id_dep"));
                rd = pd.executeQuery();
                while(rd.next()){
                    id= rd.getInt("id");
                    nome= rd.getString("nome");
                }
                //int id, String nome, Departamento departamento
                Curso c = new Curso(r.getInt("id_curso"), r.getString("nome"), new Departamento(id, nome));
                cursos.add(c);
            }


        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);

        }finally {
            ConnectionFactory.closeConnection(conn,p,r);
            try{
                pd.close();
                rd.close();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }


        return cursos;
    }
}
