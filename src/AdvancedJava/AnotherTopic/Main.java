package AdvancedJava.AnotherTopic;

import java.util.TimeZone;

//public class Main {
//    public static void main(String[] args) {
//        TimeZone timeZone = TimeZone.getDefault();
//        System.out.println("Time Zone ID: " + timeZone.getID());
//        System.out.println("Display Name: " + timeZone.getDisplayName());
//    }
//}
import java.time.ZoneId;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime currentDateTime = ZonedDateTime.now(); // Поточний час у системній тайм-зоні
        String formattedDateTime = currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"));

        System.out.println("Time Zone: " + currentDateTime.getZone());
        System.out.println("Current Time: " + formattedDateTime);
    }
}
