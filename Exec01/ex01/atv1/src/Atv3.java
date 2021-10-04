import java.io.*;
import java.util.Date;

class Atv3 {
  public static void main(String[] args) throws Exception {
    String arquivoOrigem = args[0];
    String arquivoDestino = args[1];
    String textoFinal = "";
    Date date = new Date();
    Long inicio, fim, total;

    Integer cont = 0;

    inicio = date.getTime();
    InputStream is = new FileInputStream("../../../"+arquivoOrigem+".txt");
    InputStreamReader txt = new InputStreamReader(is);
    Integer textoOrigem = txt.read();

    while(cont <= 100) {
      textoFinal += textoOrigem + "\n";
      textoOrigem = txt.read();
      cont += 1;
    }

    OutputStream os = new FileOutputStream("./"+arquivoDestino+".txt", true);
    OutputStreamWriter txtD = new OutputStreamWriter(os);

    txtD.write(textoFinal);

    fim = date.getTime();
    
    total = fim - inicio;
    
    System.out.println("Tempo em milisegundos: " + total);

    txt.close();
    txtD.close();
  }

}
