import java.time.LocalDateTime;
public class DateTime{
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
          System.out.println(dt.getYear());
            System.out.println(dt.getHour());
              System.out.println(dt.getDayOfMonth());
                System.out.println(dt.getMonthValue());
                  System.out.println(dt.getMinute());
                     System.out.println(dt.getSecond());
                       System.out.println(dt.plusYears(3));
                          System.out.println(dt.plusMonths(7));
                             System.out.println(dt.minusMonths(5));
                              System.out.println(dt.plusHours(2).plusMinutes(39));
                               System.out.println(dt.minusHours(4).minusMinutes(53));
    }
}