import java.time.LocalDate;
public class Date{
    public static void main(String[]args){
        LocalDate today=LocalDate.now();
       System.out.println(today);
       System.out.println(today.getYear());
       System.out.println(today.getDayOfYear());
       System.out.println(today.getDayOfMonth());
       System.out.println(today.getDayOfWeek());
       System.out.println(today.getMonth());
       System.out.println(today.plusDays(2));
       System.out.println(today.minusDays(3));
       System.out.println(today.plusWeeks(2));
       System.out.println(today.minusMonths(2));
    }
}