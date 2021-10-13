import java.io.*;
import java.util.Scanner;

public class Atv2 {
  public static void main(String[] args) throws Exception{
    Scanner scan = new Scanner(System.in);
    String arq1, arq2, arq3;
    String textoFinal = "";

    System.out.print("Nome do primeiro arquivo: ");
    arq1 = scan.nextLine();

    System.out.print("Nome do segundo arquivo: ");
    arq2 = scan.nextLine();

    System.out.print("Nom do arquivo final: ");
    arq3 = scan.nextLine();

    OutputStream os = new FileOutputStream("./"+arq3+".txt", true);
    OutputStreamWriter osw = new OutputStreamWriter(os);
    BufferedWriter bw = new BufferedWriter(osw);

    InputStream txt01 = new FileInputStream("./"+arq1+".txt");
    InputStreamReader txtR01 = new InputStreamReader(txt01);
    BufferedReader txtBr01 = new BufferedReader(txtR01);
    String texto01 = txtBr01.readLine();

    InputStream txt02 = new FileInputStream("./"+arq2+".txt");
    InputStreamReader txtR02 = new InputStreamReader(txt02);
    BufferedReader txtBr02 = new BufferedReader(txtR02);
    String texto02 = txtBr02.readLine();

    while(texto01 !=  null){
      textoFinal += texto01 + "\n";
      texto01 = txtBr01.readLine();
    }

    textoFinal += "\n";
    textoFinal += "\n";

    while(texto02 !=  null){
      textoFinal += texto02 + "\n";
      texto02 = txtBr02.readLine();
    }

    

    bw.write(textoFinal);
    bw.newLine(); 

    txt01.close();
    txt02.close();
    bw.close();
    scan.close();
  }
}
