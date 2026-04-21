package com.pluralsight;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args){
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        LocalDateTime local = LocalDateTime.now();
        DateTimeFormatter gmt1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter gmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter gmt3 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
        DateTimeFormatter gmt4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy hh:mm");
        System.out.println("GMT Date and Time");
        System.out.println(gmt.format(gmt1));
        System.out.println(gmt.format(gmt2));
        System.out.println(gmt.format(gmt3));
        System.out.println(gmt.format(gmt4));
        System.out.println("Local Date and Time");
        System.out.println(local.format(gmt1));
        System.out.println(local.format(gmt2));
        System.out.println(local.format(gmt3));
        System.out.println(local.format(gmt4));
    }
}