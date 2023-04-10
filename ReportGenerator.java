public class ReportGenerator {
        private List<Student> students;
        public ReportGenerator(List<Student> students) {
            this.students = students;
        }

        public void generateReport() {
            double sum = 0;
            double highestGrade = 10;
            double lowestGrade = 4;
            Student highestGradeStudent = null;
            Student lowestGradeStudent = null;

            for (Student student : students) {
                double grade = student.getGrade();
                sum += grade;

                if (grade > highestGrade) {
                    highestGrade = grade;
                    highestGradeStudent = student;
                }

                if (grade < lowestGrade) {
                    lowestGrade = grade;
                    lowestGradeStudent = student;
                }
            }

            double averageGrade = sum / students.size();

            try (PrintWriter writer = new PrintWriter("grade-reports.out")) {
                writer.println("Highest grade: \"Student with the highest grade is " + highestGradeStudent.getName() + " with a grade of " + highestGrade + ".\"");
                writer.println("Average grade: \"The average grade is " + averageGrade + ".\"");
                writer.println("Lowest grade: \"Student with the lowest grade is " + lowestGradeStudent.getName() + " with a grade of " + lowestGrade + ".\"");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
