package o10_24_WorkingWithAbstraction.p03StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {

    private final Map<String, Student> studentByName;

    public StudentRepository(){
        this.studentByName = new HashMap<>();
    }

    public void create(Student student){
        studentByName.putIfAbsent(student.getName(), student);
    }

    public Student get(String name) {
        return studentByName.get(name);
    }
}
