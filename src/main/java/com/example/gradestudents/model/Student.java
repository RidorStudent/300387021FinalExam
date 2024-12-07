package com.example.gradestudents.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double gpa;

    private String courseName;
    private Integer units;
    private Character grade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    public double calculateGPA (){
        double gradePoints=0;


        switch(grade) {
            case 'A':
                gradePoints = 4.00;
                break;
            case 'B':
                gradePoints = 3.00;
                break;
            case 'C':
                gradePoints = 2.00;
            case 'D':
                gradePoints = 1.00;
                break;
            case 'F':
                gradePoints = 0.00;
                break;

        }

    return gradePoints*units;
    }
}



