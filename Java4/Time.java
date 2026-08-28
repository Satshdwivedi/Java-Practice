import java.time.LocalTime;
public class Time{
    public static void main(String[] args) {
        LocalTime now=LocalTime.now();
        System.out.println(now);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.plusHours(2));
        System.out.println(now.minusMinutes(45));
    }
}