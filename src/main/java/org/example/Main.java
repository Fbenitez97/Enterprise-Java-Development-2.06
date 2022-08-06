package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student stu1 = new Student("Francisco Benitez", 86);
        Student stu2 = new Student("Xuran Zhou", 97);
        Student stu3 = new Student("Carlos Celis", -68);
        Student stu4 = new Student("Andrea Martinez", 101);

        students.put("0001", new Student("Francisco Benitez", 86));
        students.put("0002", new Student("Xuran Zhou", 97));
        students.put("0003", new Student("Carlos Celis", -68));
        students.put("0004", new Student("Andrea Martinez", 101));

        stu1.increase(students);
        stu1.printStudents(students);
        }
    }

