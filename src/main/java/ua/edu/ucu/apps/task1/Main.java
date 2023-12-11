package ua.edu.ucu.apps.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder()
                        .name("Bohdan")
                        // .grades(Arrays.asList(61, 62, 63))
                        .grade(61)
                        .grade(62)
                        .age(18)
                        .build();
        System.out.println(user);
    }
}