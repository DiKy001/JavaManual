import java.time.DayOfWeek;
import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(date);
        System.out.println(dayOfWeek);
        System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);

        LocalDate date1 = LocalDate.of(1914, 12, 31);
        System.out.println(date1);

        LocalDate date2 = LocalDate.of(1914, 7, 28);

        date2 = date2.plusYears(4);
        date2 = date2.plusMonths(3);
        date2 = date2.plusDays(14);
        System.out.println(date2);   // 1918-11-11

        date2 = date2.minusMonths(10);
        date2 = date2.minusDays(3);
        System.out.println(date2);   // 1918-01-08
    }
}