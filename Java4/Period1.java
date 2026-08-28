import java.time.LocalDate;
import java.time.Period;

public class Period1 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(1988, 12, 27);
        LocalDate d2 = LocalDate.now();
        Period p = Period.between(d1, d2);
        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());

    }
}