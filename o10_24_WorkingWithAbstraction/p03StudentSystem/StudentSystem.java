package o10_24_WorkingWithAbstraction.p03StudentSystem;

public class StudentSystem {
    private StudentRepository studentRepository;

    public StudentSystem() {

        this.studentRepository = new StudentRepository();
    }

    public void parseCommand (String[] args) {

        String name = args[1];

        if (args[0].equals("Create")) {
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);

            Student student = new Student(name, age, grade);
            studentRepository.create(student);

        } else if (args[0].equals("Show")) {

            Student student = studentRepository.get(name);
            if (student != null) {
               System.out.println(student);
            }
        }
    }
}
