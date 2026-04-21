package com.pluralsight;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args){
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        LocalDateTime local = LocalDateTime.now();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy hh:mm");
        System.out.println("GMT Date and Time");
        System.out.println(gmt.format(fmt1));
        System.out.println(gmt.format(fmt2));
        System.out.println(gmt.format(fmt3));
        System.out.println(gmt.format(fmt4));
        System.out.println("Local Date and Time");
        System.out.println(local.format(fmt1));
        System.out.println(local.format(fmt2));
        System.out.println(local.format(fmt3));
        System.out.println(local.format(fmt4));
    }
}