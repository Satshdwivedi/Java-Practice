import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class File2{
    public static void main(String[] args) throws IOException{
        File f=new File("Practice.txt");
        boolean result=f.createNewFile();
        System.out.println(result);
        System.out.println(f.exists());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.length());
        FileWriter fw=new FileWriter(f);
        fw.write("Java is a programming Language");
        fw.close();
        FileWriter fw1=new FileWriter(f,true);
        //fw.write(System.lineSeparator());
        fw1.write("\nWelcome");
        fw1.close();
        FileReader fr=new FileReader(f);
       /* * int ch;  yahan hum charactor by charactor print kara rahe the neche hum line by 
                               line print ker rahe hai 
        ch=fr.read();
        while(ch!=-1){
            System.out.print((char)ch);
            ch=fr.read();
        }
        fr.close();*/
       BufferedReader br=new BufferedReader(fr);
       String line;
       while((line=br.readLine())!=null){
        System.out.println(line);
       }
       br.close();

    }
}