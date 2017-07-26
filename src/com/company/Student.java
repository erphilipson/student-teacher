package com.company;

import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by Ethan on 7/26/17.
 */
public class Student {

    private String firstName;
    private String lastName;
    private int id;
    private int grade;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object id) {
        if (this == id) return true;
        if (id == null || getClass() != id.getClass()) return false;

        Student student = (Student) id;

        if (!id.equals(student.id)) return false;
        if (grade != student.grade) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        return lastName != null ? lastName.equals(student.lastName) : student.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + grade;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }

    public static void addRandomStudents(List firstGradeStudents, Set fiveStudentsSet){
        Random random = new Random();
        int i = random.nextInt(firstGradeStudents.size());
        fiveStudentsSet.add(firstGradeStudents.get(i));
        firstGradeStudents.remove(i);
    }
}
