package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 100) {
            grade = 100;
        } else if (this.grade < 0) {
            grade = 0;
        }
        this.grade = grade;
    }

    public void increase(Map<String, Student> students) {
        for (String key : students.keySet()) {
            int currentGrade = students.get(key).getGrade();
            int percentage = (int) (currentGrade * 0.10);
            students.get(key).setGrade(currentGrade + percentage);
        }
    }
    public static void printStudents(HashMap<String, Student> students){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String texto = gson.toJson(students);
        System.out.println(texto);
    }
}
