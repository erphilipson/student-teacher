package com.company;

import java.util.*;
import java.util.Random;

import static com.company.Student.addRandomStudents;

public class Main {

    public static void main(String[] args) {
        List<Student> firstGradeStudents = new ArrayList<>();
        List<Teacher> firstGradeTeachers = new ArrayList<>();

        Set<Student> fiveStudentsSet = new HashSet<>();
        Set<Student> fiveStudentsSet1 = new HashSet<>();
        Set<Student> fiveStudentsSet2 = new HashSet<>();

        Map<Teacher, Set> teacherStudentMap = new HashMap<>();

        String[] studentFirstNames = {"Bob", "Bill", "Brad", "James", "Sarah", "Carly", "Rachel", "Aaron", "Thomas", "Phil", "Angela", "Rob", "Ethan", "Jimmy", "Manfred"};
        String[] studentLastNames = {"Last1", "Last2", "Last3", "Last4", "Last5", "Last6", "Last7", "Last8", "Last9", "Last10", "Last11", "Last12", "Last13", "Last14", "Last 15"};
        String[] teacherFirstNames = {"Jan", "Kyle", "Susan"};
        String[] teacherLastNames = {"Smith", "Stevens", "Rogers"};

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();
        Student student9 = new Student();
        Student student10 = new Student();
        Student student11 = new Student();
        Student student12 = new Student();
        Student student13 = new Student();
        Student student14 = new Student();
        Student student15 = new Student();

        firstGradeStudents.add(student1);
        firstGradeStudents.add(student2);
        firstGradeStudents.add(student3);
        firstGradeStudents.add(student4);
        firstGradeStudents.add(student5);
        firstGradeStudents.add(student6);
        firstGradeStudents.add(student7);
        firstGradeStudents.add(student8);
        firstGradeStudents.add(student9);
        firstGradeStudents.add(student10);
        firstGradeStudents.add(student11);
        firstGradeStudents.add(student12);
        firstGradeStudents.add(student13);
        firstGradeStudents.add(student14);
        firstGradeStudents.add(student15);

        for (int i=0; i<firstGradeStudents.size(); i++) {
            firstGradeStudents.get(i).setFirstName(studentFirstNames[i]);
            firstGradeStudents.get(i).setLastName(studentLastNames[i]);
            firstGradeStudents.get(i).setId(i+1);
            firstGradeStudents.get(i).setGrade(1);
        }

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Teacher teacher3 = new Teacher();

        firstGradeTeachers.add(teacher1);
        firstGradeTeachers.add(teacher2);
        firstGradeTeachers.add(teacher3);

        for (int i=0; i<firstGradeTeachers.size(); i++) {
            firstGradeTeachers.get(i).setFirstName(teacherFirstNames[i]);
            firstGradeTeachers.get(i).setLastName(teacherLastNames[i]);
            firstGradeTeachers.get(i).setId(i+1);
            firstGradeTeachers.get(i).setGrade(1);
        }

        // ADD FIVE RANDOM STUDENTS TO fiveStudentsSet(s)
        while (fiveStudentsSet.size() < 5) {
            addRandomStudents(firstGradeStudents, fiveStudentsSet);
            addRandomStudents(firstGradeStudents, fiveStudentsSet1);
            addRandomStudents(firstGradeStudents, fiveStudentsSet2);
        }

        teacherStudentMap.put(firstGradeTeachers.get(0), fiveStudentsSet);
        teacherStudentMap.put(firstGradeTeachers.get(1), fiveStudentsSet1);
        teacherStudentMap.put(firstGradeTeachers.get(2), fiveStudentsSet2);


        System.out.println(teacherStudentMap.keySet());
        System.out.println(teacherStudentMap.values());
        System.out.println(teacherStudentMap.entrySet());

    }
}
