package Exception;

import javax.swing.*;

public class NaoEncontrado extends Exception{

    @Override
    public void printStackTrace(){
        JOptionPane.showMessageDialog(null, "Dado Não encontrado no Banco!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
