package View;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraDeArquivo {
    private String[] array;
    private BufferedReader buffer;

    public LeituraDeArquivo(String url, int qtdColunas) {
        try {
            buffer= new BufferedReader(new FileReader(url));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        array= new String[qtdColunas];
    }

    public String[] divide(){
        String aux= null;
        try {
            aux = lerLinha();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(aux == null){
            return null;
        }
        int cont = 0;
        for(int j = 0; j < array.length; j++){
            array[j] = "";
            for(int i=cont; i < aux.length(); i++){
                if(aux.charAt(i) == ','){
                    cont++;
                    break;
                }
                else{
                    cont++;
                    array[j]= array[j]+aux.charAt(i);
                }
            }
        }
        return array;
    }


    public String lerLinha() throws IOException {
        return buffer.readLine();
    }
}
