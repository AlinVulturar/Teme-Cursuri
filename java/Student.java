package curs11Teme.java;
import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {
        // create the map with student names and grades
        Map<String, Integer> grades = new HashMap<>();
        grades.put("John", 85);
        grades.put("Sarah", 92);
        grades.put("Mike", 79);
        grades.put("Emily", 96);
        grades.put("David", 88);

        // print all students and their grades
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // find the student with the highest grade
        int highestGrade = Integer.MIN_VALUE;
        String highestGradeStudent = "";
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            if (entry.getValue() > highestGrade) {
                highestGrade = entry.getValue();
                highestGradeStudent = entry.getKey();
            }
        }
        System.out.println(highestGradeStudent + " has the highest grade with a score of " + highestGrade);
    }
}