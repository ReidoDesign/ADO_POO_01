
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vitor Rodrigues
 */
public class lab1 {

    public static void main(String[] args) {

        // nome do arquivo
        String nomeDoArquivo1 = "pib.txt";
        String nomeDoArquivo2 = "regioes.txt";

        // linha temporaria
        String linha = null;

        /*      ------------------------------------- */
 /*      Abertura de arquivo e loop de leitura */
 /*      ------------------------------------- */
        try {
            FileReader fileReader = new FileReader(nomeDoArquivo1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            FileReader fileReader2 = new FileReader(nomeDoArquivo2);
            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
   
            // loop por cada linha do arquivo
            double soma = 0;
            while ((linha = bufferedReader.readLine()) != null) {
                //System.out.println(linha);
                
                String aux[] = linha.split(";");
                double valoresDouble[] = new double[aux.length];
                valoresDouble[1] = Double.parseDouble(aux[1]);
                //System.out.println(valoresDouble[1]); 
                soma += valoresDouble[1];
                
                double fim = valoresDouble[1] * 0.024201;
                System.out.println(fim);
                
            }
            
            double PorcTotal = 100 / soma;
            //System.out.println(PorcTotal);
            
            
            // feche o arquivo
            bufferedReader.close();
            
            /*
            while ((linha = bufferedReader2.readLine()) != null) {
                //System.out.println(linha);
                String aux[] = linha.split("\n\r");
               //System.out.println(aux[0]);
                
            }
            // feche o arquivo
            bufferedReader2.close();
            */
            
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + nomeDoArquivo1 + "'");
        } catch (IOException ex) {
            System.out.println("Erro lendo o arquivo '" + nomeDoArquivo1 + "'");
        }
        
        
       

        /*      ------------------------------------- */
 /*      Exemplo de escrita em arquivo         */
 /*      ------------------------------------- */
        String arquivoDeSaida = "saida.txt";

        try {

            FileWriter fileWriter = new FileWriter(arquivoDeSaida);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("pib da regiao X = $$$$");
            bufferedWriter.newLine();
            bufferedWriter.write("pib da regiao Y = $$$$");

            // feche o arquivo
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Erro de escrita em '" + arquivoDeSaida + "'");
        }

    }
}
