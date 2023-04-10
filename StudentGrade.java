
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

   public class StudentGrade {
        private String name;
        private String discipline;
        private int grade;

        public StudentGrade(String name, String discipline, int grade) {
            this.name = name;
            this.discipline = discipline;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public String getDiscipline() {
            return discipline;
        }

        public int getGrade() {
            return grade;
        }
    }
public class Classroom {
    private List<StudentGrade> studentGrades;

    public Classroom(List<StudentGrade> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade grade : studentGrades) {
            if (grade.getDiscipline().equals(discipline)) {
                grades.add(grade.getGrade());
            }
        }
        return grades;
    }

    public List<Integer> getGradesForStudent(String studentName) {
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade grade : studentGrades) {
            if (grade.getName().equals(studentName)) {
                grades.add(grade.getGrade());
            }
        }
        return grades;
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade maxGrade = null;
        for (StudentGrade grade : studentGrades) {
            if (grade.getDiscipline().equals(discipline)) {
                if (maxGrade == null || grade.getGrade() > maxGrade.getGrade()) {
                    maxGrade = grade;
                }
            }
        }
        return maxGrade;
    }

    public StudentGrade getMinGrade(String discipline) {
        StudentGrade minGrade = null;
        for (StudentGrade grade : studentGrades) {
            if (grade.getDiscipline().equals(discipline)) {
                if (minGrade == null || grade.getGrade() < minGrade.getGrade()) {
                    minGrade = grade;
                }
            }
        }
        return minGrade;
    }

    public double getAverageGrade(String discipline) {
    }
}