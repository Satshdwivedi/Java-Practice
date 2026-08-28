import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DDMMYY{
    public static void main(String[] args) {
   LocalDateTime dt=LocalDateTime.now();
   DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy  hh:mm:ss a");
   //yahan per hh-gives 12 hour formate HH gives 24 hours formate a gives am/pm
   System.out.println(dt.format(f));       
    }
}