import java.util.List;

public class Parser implements IParser{

     public String listToString(List<Student> students){
        StringBuilder sb = new StringBuilder();
        for(Student student : students){
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }
}
