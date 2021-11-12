import java.util.LinkedList;
import java.util.List;

public class Faculty {

    private String name;
    private List<Student> students = new LinkedList<>();
    private List<Student> grandStudent = new LinkedList<>();

    public Faculty(String name, List<Student> students) {
        this.name = name;
        this.students.addAll(students);
        initializeGrandStudent(students);
    }

    public void enrollStudent(Student... students){
        this.students.addAll(List.of(students));
        initializeGrandStudent(List.of(students));
    }

    public void expelStudent(Student... students){
        this.students.removeAll(List.of(students));
        this.grandStudent.removeAll(List.of(students));
    }

    private void initializeGrandStudent(List<Student> students){
        for(Student student : students){
            if(student.getAverageScore()>95){
                grandStudent.add(student);
            }
        }
    }

    public List<Student> getGrantsStudent(){
        return List.copyOf(grandStudent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return List.copyOf(students);
    }

    public int getNumberOfStudents(){
        return students.size();
    }

    public void setStudents(List<Student> students) {
        this.students = new LinkedList<>(students);
    }
}
