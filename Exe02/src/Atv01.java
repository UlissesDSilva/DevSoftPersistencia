import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Date;

public class Atv01 {
    public static void main(String[] args) throws Exception {
        String origem = args[0];
        String destino = args[1];
        Date date = new Date();
        Long inicio, fim, total;
        
        inicio = date.getTime();
        try {
            File txt = new File(origem);
            byte[] bytes = Files.readAllBytes(txt.toPath());
            String arq = new String(bytes, "UTF-8");
            PrintWriter write = new PrintWriter(destino+".txt");
            write.println(arq);
            write.close();
        } catch (Exception e) {
            System.out.println("Erro na cópia do arquivo");
        }

        fim = date.getTime();
        total = fim - inicio;
        System.out.println("Tempo de " + total + " ms para copiar");
    }
}
