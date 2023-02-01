package unit13.dateandtimeapi.day48.periodandduration;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExamples {
    public static void main(String[] args) {
        Period twoMonth = Period.ofMonths(2);

        System.out.println(twoMonth.getMonths());

        Period ofCustomPeriod = Period.of(2,5,12);
        System.out.println(ofCustomPeriod);
        LocalDate johnBirthDate = LocalDate.of(1999, Month.OCTOBER,19);
        System.out.println(Period.between(johnBirthDate,LocalDate.now()).getYears());

        LocalDate myBirthDate = LocalDate.of(1984, Month.NOVEMBER,06);
        System.out.println(Period.between(myBirthDate,LocalDate.now()).getYears());
    }
}
