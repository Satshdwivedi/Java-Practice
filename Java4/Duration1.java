import java.time.LocalTime;
import java.time.Duration;
public class Duration1{
 public static void main(String[] args) {
    LocalTime t1=LocalTime.of(9,47,23);
    LocalTime t2=LocalTime.now();
    Duration d=Duration.between(t1,t2);
    System.out.println(d.toHours());//yahan per yadi duration 2.30 hours hai tho to.hours()=2
    System.out.println(d.toMinutes());// and toMinutes()=150
    System.out.println(d.toSeconds());// and toSeconds()=9000 hoga matlab ye total dete hai 
 }
}