import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.Files;
import java.io.IOException;
public class Files1{
 public static void main(String[] args) throws IOException {
    Path p=Path.of("Practice2.txt");
    Files.writeString(p,"Java is Plateform Independent.\n"+"Java is useful in coding.\n"
    + "That'swhy every progrommer must learn Java.",StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    String d=Files.readString(p);
    System.out.println(d);
    Path q = Path.of("Practice3.txt");
    //Files.copy(p,q);
    //System.out.println(Files.exists(p));
    //System.out.println(Files.exists(q));
    Path s=Path.of("Practice4.txt");
   // Files.move(p,s);// yahan per practice2 practice 4 me chali gayi 
   // System.out.println(Files.exists(p));// isliye false dega
    //System.out.println(Files.exists(s));
    Files.delete(q);
    Files.delete(s);
 
 }
}
