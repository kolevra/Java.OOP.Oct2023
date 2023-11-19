package o10_24_WorkingWithAbstraction.p03StudentSystem;

public class Student {

    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }


    @Override
    public String toString() {
        return String.format("%s is %s years old.", name, age) + getGradeCommentary();
    }

    private String getGradeCommentary() {

        if (grade >= 5.00) {
            return " Excellent student.";
        } else if (grade < 5.00 && grade >= 3.50) {
            return " Average student.";
        }
        return " Very nice person.";

    }
}
