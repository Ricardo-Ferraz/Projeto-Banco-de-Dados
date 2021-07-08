package View;

import DAO.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaProjeto extends JFrame implements ActionListener {

    private JTextField text = new JTextField(100);

    private Object[] entradas = {"Url: ", text};

    private VeiculoDAO v = new VeiculoDAO();
    private AlunoDAO a = new AlunoDAO();
    private CursoDAO c = new CursoDAO();
    private ConvidadoDAO cd= new ConvidadoDAO();
    private FuncionarioDAO fun= new FuncionarioDAO();
    private EntradaDAO entradaDAO= new EntradaDAO();

    private JButton b1= new JButton("Add Aluno");
    private JButton b2= new JButton("Add Funcionário");
    private JButton b3= new JButton("Add Veiculo");
    private JButton b4= new JButton("Add Convidado");


    public JanelaProjeto(){
        this.setLayout(null);
        this.b1.setBounds(100, 30, 100, 50);
        this.b1.addActionListener(this);
        this.b2.setBounds(300, 30, 100, 50);
        this.b2.addActionListener(this);
        this.b3.setBounds(100, 300, 100, 50);
        this.b3.addActionListener(this);
        this.b4.setBounds(300, 300, 100, 50);
        this.b4.addActionListener(this);
        this.getContentPane().add(b1);
        this.getContentPane().add(b2);
        this.getContentPane().add(b3);
        this.getContentPane().add(b4);


        this.setSize(500, 500);
        this.setTitle("Projeto");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){ //Add aluno
            int opcao = JOptionPane.showConfirmDialog(null, this.entradas, "Add Aluno", JOptionPane.OK_CANCEL_OPTION);
            if(opcao == JOptionPane.OK_OPTION){
                try{
                    a.addUrl(text.getText());
                    JOptionPane.showMessageDialog(null, "Sucesso!","Sucesso!", JOptionPane.INFORMATION_MESSAGE);

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(e.getSource() == b2){ //Add funcionario
            int opcao = JOptionPane.showConfirmDialog(null, this.entradas, "Add Funcionário", JOptionPane.OK_CANCEL_OPTION);
            if(opcao == JOptionPane.OK_OPTION){
                try{
                    fun.addUrl(text.getText());
                    JOptionPane.showMessageDialog(null, "Sucesso!","Sucesso!", JOptionPane.INFORMATION_MESSAGE);

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        else if(e.getSource() == b3){ //Add veiculo
            int opcao = JOptionPane.showConfirmDialog(null, this.entradas, "Add Veículo", JOptionPane.OK_CANCEL_OPTION);
            if(opcao == JOptionPane.OK_OPTION){
                try{
                    v.addUrl(text.getText());
                    JOptionPane.showMessageDialog(null, "Sucesso!","Sucesso!", JOptionPane.INFORMATION_MESSAGE);

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(e.getSource() == b4){ //Add convidado
            int opcao = JOptionPane.showConfirmDialog(null, this.entradas, "Add Convidado", JOptionPane.OK_CANCEL_OPTION);
            if(opcao == JOptionPane.OK_OPTION){
                try{
                    cd.addUrl(text.getText());
                    JOptionPane.showMessageDialog(null, "Sucesso!","Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        text.setText("");
    }
}
