package sesion14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TestTime {

    public static void main(String[] args) {
//        pruebaTime();
//        diferencias();
        minus();
    }

    public  void pruebaTime() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate fecha1 = LocalDate.of(2020, Month.OCTOBER, 15);
        System.out.println(fecha1);
        LocalDate fecha2 = LocalDate.of(2020, 10, 15);
        System.out.println(fecha2);
        LocalTime hora = LocalTime.of(10, 10);
        System.out.println("hora: " + hora);
        LocalTime hora1 = LocalTime.of(10, 10, 10);
        System.out.println("hora1: " + hora1);
        LocalTime hora2 = LocalTime.of(10, 10, 10, 10);
        System.out.println("hora1: " + hora2);
    }

    public static void diferencias() {
        LocalDate localTmp = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println("1: " + localTmp);
        localTmp.plusDays(2);
        System.out.println("2: " + localTmp);
        localTmp = localTmp.plusDays(2);
        System.out.println("2: " + localTmp);
        localTmp = localTmp.plusWeeks(2);
        System.out.println("2: " + localTmp);
        localTmp = localTmp.plusMonths(2);
        System.out.println("2: " + localTmp);
        localTmp = localTmp.plusYears(2);
        System.out.println("2: " + localTmp);

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        ahora = ahora.plusSeconds(1);
        System.out.println(ahora);
    }
    
    public static void minus() {
        LocalDate localTmp = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println("1: " + localTmp);
        localTmp.minusDays(2);
        System.out.println("2: " + localTmp);
        localTmp = localTmp.minusDays(2);
        System.out.println("2: " + localTmp);
        localTmp = localTmp.minusWeeks(2);
        System.out.println("2: " + localTmp);
        localTmp = localTmp.minusMonths(2);
        System.out.println("2: " + localTmp);
        localTmp = localTmp.minusYears(2);
        System.out.println("2: " + localTmp);

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        ahora = ahora.minusSeconds(1);
        System.out.println(ahora);
    }
}
