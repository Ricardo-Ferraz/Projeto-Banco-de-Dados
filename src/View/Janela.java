package View;

import DAO.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame implements ActionListener {
    private VeiculoDAO v = new VeiculoDAO();
    private AlunoDAO a = new AlunoDAO();
    private CursoDAO c = new CursoDAO();
    private ConvidadoDAO cd= new ConvidadoDAO();
    private FuncionarioDAO fun= new FuncionarioDAO();

    private JButton b1= new JButton("Entrada");
    private JButton b2= new JButton("Saída");
    private JButton b3= new JButton("P/ Projeto");


    public Janela(){
        this.setLayout(null);
        this.b1.setBounds(100, 30, 100,50);
        this.b1.addActionListener(this);
        this.b2.setBounds(300,30,100,50);
        this.b2.addActionListener(this);
        this.b3.setBounds(100, 300, 100, 50);
        this.b3.addActionListener(this);

        this.getContentPane().add(b1);
        this.getContentPane().add(b2);
        this.getContentPane().add(b3);

        this.setSize(500,500);
        this.setTitle("Unicar");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            new JanelaEntrada();
        }
        else if(e.getSource() == b2){
            new JanelaSaida();
        }
        else if(e.getSource() == b3){
            new JanelaProjeto();
        }
    }
}
