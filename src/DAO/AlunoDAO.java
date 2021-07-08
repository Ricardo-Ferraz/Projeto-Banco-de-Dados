package DAO;

import Exception.NaoEncontrado;

import View.ConnectionFactory;
import View.LeituraDeArquivo;
import model.Aluno;
import model.Curso;
import model.Departamento;
import model.Veiculo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class AlunoDAO {

    public List<Aluno> read(){
        int aux=-1;
        int idCurso=-1;
        int idDep= -1;
        String placa= "";
        String modelo= "";
        String cor= "";
        String nomeCurso= "";
        String nomeDep="";
        List<Aluno> alunos = new LinkedList<>();
        Connection conn = null;
        PreparedStatement p = null;
        PreparedStatement pv = null;
        PreparedStatement pc= null;
        PreparedStatement pd= null;
        ResultSet rs = null;
        ResultSet rv = null;
        ResultSet rc = null;
        ResultSet rd= null;

        try{
            conn= ConnectionFactory.getConnection();
            p= conn.prepareStatement("SELECT * FROM aluno");
            pv= conn.prepareStatement("SELECT * FROM veiculo WHERE placa= ?");
            pc= conn.prepareStatement("SELECT * FROM curso WHERE id_curso= ?");
            pd= conn.prepareStatement("SELECT * FROM departamento WHERE id= ?");
            rs= p.executeQuery();

            while(rs.next()){
                pv.setString(1,rs.getString("placa_car"));
                pc.setInt(1,rs.getInt("id_curso"));
                rv = pv.executeQuery();
                while(rv.next()){
                    placa= rv.getString("placa");
                    modelo= rv.getString("modelo");
                    cor= rv.getString("cor");
                }
                rc= pc.executeQuery();
                while(rc.next()){
                    idCurso= rc.getInt("id_curso");
                   aux=  rc.getInt("id_dep");
                   nomeCurso= rc.getString("nome");
                }
                pd.setInt(1, aux);
                rd= pd.executeQuery();
                while(rd.next()){
                    idDep= rd.getInt("id");
                    nomeDep= rd.getString("nome");
                }
                Aluno a = new Aluno(rs.getString("nome"), rs.getString("sobrenome"), rs.getString("sexo").charAt(0), rs.getString("rua"),
                              rs.getString("numero_rua"), rs.getString("complemento"),new Veiculo(placa,modelo, cor),
                               rs.getString("matricula"),
                               new Curso(idCurso,nomeCurso, new Departamento(idDep, nomeDep)),rs.getString("fone1"), rs.getString("fone2"));
                alunos.add(a);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(conn,p,rs);
            try{
                pv.close();
                pc.close();
                pd.close();
                rv.close();
                rc.close();
                rd.close();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao acessar o banco!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        return alunos;
    }

    public boolean search(String matricula) throws NaoEncontrado{
        Connection c = null;
        PreparedStatement p= null;
        ResultSet r = null;

        try{
            c = ConnectionFactory.getConnection();
            String sql="SELECT * FROM aluno WHERE matricula= ?";
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
        LeituraDeArquivo leitura= new LeituraDeArquivo(url,11);
        String alunos[]= leitura.divide();

        Connection c = null;
        PreparedStatement p= null;

        try{

            c = ConnectionFactory.getConnection();
            String sql = "INSERT INTO aluno(matricula,nome,sobrenome,sexo,bairro,numero_rua,complemento,fone1,fone2,placa_car,id_curso) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            p= c.prepareStatement(sql);
            while(alunos != null){
                p.setString(1,alunos[0]);
                p.setString(2,alunos[1]);
                p.setString(3,alunos[2]);
                p.setString(4,alunos[3]);
                p.setString(5,alunos[4]);
                p.setString(6,alunos[5]);
                p.setString(7,alunos[6]);
                p.setString(8,alunos[7]);
                p.setString(9,alunos[8]);
                p.setString(10, alunos[9]);
                p.setString(11,alunos[10]);
                p.executeUpdate();
                alunos= leitura.divide();
            }

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            ConnectionFactory.closeConnection(c,p);
        }
    }

}
