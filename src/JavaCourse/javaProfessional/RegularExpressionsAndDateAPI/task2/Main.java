package JavaCourse.javaProfessional.RegularExpressionsAndDateAPI.task2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse("27.09.2000", formatter);
        LocalDate endDate = LocalDate.parse("26.07.2021", formatter);
        Period period = Period.between(startDate,endDate);

        System.out.println("You are " + period.getYears() + " years old, " +
                period.getMonths() + " months and " + period.getDays() + " days old");
    }
}
