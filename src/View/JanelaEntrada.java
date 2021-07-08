package View;

import DAO.*;
import model.Entrada;
import model.Estacionamento;
import model.Veiculo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.sql.Date;

public class JanelaEntrada extends JFrame implements ActionListener {

    private Calendar data = Calendar.getInstance();

    private JTextField text = new JTextField(20);
    private JTextField text2= new JTextField(20);

    private Object[] entradas = {"Placa: ", text, "Matrícula: ", text2};
    private Object[] entradasConvidado = {"Placa: ", text, "Cpf: ", text2};

    private VeiculoDAO v = new VeiculoDAO();
    private AlunoDAO a = new AlunoDAO();
    private CursoDAO c = new CursoDAO();
    private ConvidadoDAO cd= new ConvidadoDAO();
    private FuncionarioDAO fun= new FuncionarioDAO();
    private EntradaDAO entradaDAO= new EntradaDAO();

    private JButton b1= new JButton("Bloco G");
    private JButton b6= new JButton("Interno");
    private JButton b7= new JButton("Convidado");

    public JanelaEntrada() {
        this.setLayout(null);
        this.b1.setBounds(100, 30, 100, 50);
        this.b1.addActionListener(this);
        this.b6.setBounds(200, 220, 100, 50);
        this.b6.addActionListener(this);
        this.b7.setBounds(200, 100, 100, 50);
        this.b7.addActionListener(this);
        this.getContentPane().add(b1);
        this.getContentPane().add(b6);
        this.getContentPane().add(b7);


        this.setSize(500, 500);
        this.setTitle("Entrada");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){ //Bloco G
            int opcao = JOptionPane.showConfirmDialog(null, this.entradas, "Dados", JOptionPane.OK_CANCEL_OPTION);
            if(opcao == JOptionPane.OK_OPTION){
                try{
                    Veiculo aux= v.search(text.getText());
                    if(text2.getText().length() < 11){
                        fun.search(text2.getText());
                    }
                    else{
                        a.search(text2.getText());
                    }
                    data= Calendar.getInstance();
                    entradaDAO.add(new Entrada(new Date(data.getTime().getYear(),data.getTime().getMonth(),data.get(Calendar.DAY_OF_MONTH)), data.getTime().getHours()+":"+data.getTime().getMinutes()+":"+data.getTime().getSeconds(),
                                   aux, new Estacionamento(1,"Bloco G",200)));
                    JOptionPane.showMessageDialog(null, "Entrada Liberada!","Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
            text.setText("");
            text2.setText("");
        }

        else if(e.getSource() == b6){ //Entrada interno
            int opcao = JOptionPane.showConfirmDialog(null, this.entradas, "Dados", JOptionPane.OK_CANCEL_OPTION);
            if(opcao == JOptionPane.OK_OPTION){
                try{
                    Veiculo aux= v.search(text.getText());
                    fun.search(text2.getText());
                    data= Calendar.getInstance();
                    entradaDAO.add(new Entrada(new Date(data.getTime().getYear(),data.getTime().getMonth(),data.get(Calendar.DAY_OF_MONTH)), data.getTime().getHours()+":"+data.getTime().getMinutes()+":"+data.getTime().getSeconds(),
                            aux, new Estacionamento(2,"Interno",180)));
                    JOptionPane.showMessageDialog(null, "Entrada Liberada!","Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
            text.setText("");
            text2.setText("");
        }

        else if(e.getSource() == b7){ //Entrada convidado
            int opcao = JOptionPane.showConfirmDialog(null, this.entradasConvidado, "Dados", JOptionPane.OK_CANCEL_OPTION);
            if(opcao == JOptionPane.OK_OPTION){
                try{
                    Veiculo aux= v.search(text.getText());
                    cd.search(text2.getText());
                    data= Calendar.getInstance();
                    entradaDAO.add(new Entrada(new Date(data.getTime().getYear(),data.getTime().getMonth(),data.get(Calendar.DAY_OF_MONTH)), data.getTime().getHours()+":"+data.getTime().getMinutes()+":"+data.getTime().getSeconds(),
                            aux, new Estacionamento(1,"Bloco G",200)));
                    JOptionPane.showMessageDialog(null, "Entrada Liberada!","Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
            text.setText("");
            text2.setText("");
        }
    }
}
