import java.util.*;
import java.time.*;
//https://dev-coco.tistory.com/31
public class Main{
    public static void main(String args[]){
        LocalDate now=LocalDate.now();


        int year=now.getYear();
        int month=now.getMonthValue();
        int day=now.getDayOfMonth();
        System.out.printf("%04d-%02d-%02d",year,month,day);
    }
}