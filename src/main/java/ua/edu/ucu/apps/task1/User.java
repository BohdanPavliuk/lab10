package ua.edu.ucu.apps.task1;

import java.util.List;


import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


enum Gender {
    MALE, FEMALE
}
@SuperBuilder @ToString
public class User {
    public String name;
    public int age;
    public Gender gender;
    public double weight;
    public double height;

}
