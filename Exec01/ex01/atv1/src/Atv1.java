import java.io.*;
import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) throws Exception {
        Scanner texto = new Scanner(System.in);
        String arquivoName;
        String S;
        System.out.println("Digite o nome do arquivo:");

        arquivoName = texto.nextLine();

        System.out.println("Palavra a ser procurada:");
        S = texto.nextLine();
    
        InputStream is = new FileInputStream("./"+arquivoName);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
    
        String t = br.readLine();

        while(t != null) {
            if(t.contains(S)) System.out.println(t);
            t = br.readLine();
        }

        br.close();
        texto.close();
    }
}