import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
 
public class File3{
    public static void main(String[] args) throws IOException {
        File f1=new File("Practice1.txt");
        boolean r=f1.createNewFile();
        System.out.println(r);
        System.out.println(f1.getName());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.exists());
        FileWriter fw1=new FileWriter(f1);
        BufferedWriter bw1=new BufferedWriter(fw1);
        bw1.write("Java is Good");
        bw1.newLine();
        bw1.write("Java is very essential for coding");
        bw1.newLine();
        bw1.write("For this reason every programmer must learn Java");
        bw1.close();
        FileReader fr1=new FileReader(f1);
        BufferedReader br1=new BufferedReader(fr1);
        String l;
        while((l=br1.readLine())!=null){
            System.out.println(l);
        }
        br1.close();
        System.out.println(f1.length());
    }
}