import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Harry", "Potter", 0, 95.1);
        Student student1 = new Student("George", "Weasley", 1, 83);
        Student student2 = new Student("Hermione", "Granger", 2, 95.2);
        Student student3 = new Student("Fred", "Weasley", 3, 90);
        Student student4 = new Student("Draco", "Malfoy", 4, 99);
        Student student5 = new Student("Narcissa", "Malfoy", 5, 87);
        Student student6 = new Student("Gregory", "Goyle", 6, 84);

        Faculty gryffindor = new Faculty("Gryffindor", List.of(student, student1, student2, student3));
        Faculty slytherin = new Faculty("Slytherin", List.of(student4, student5, student6));

        Institute institute = new Institute("Hogwarts", List.of(slytherin, gryffindor));

        IParser parser = new Parser();
        System.out.println();
        System.out.printf("number of students in %s: %d \n\n", institute.getName(), institute.getNumberOfStudents());
        System.out.printf("most popular faculty is %s. %d students study there\n\n", institute.getPopularFaculty().getName(), institute.getPopularFaculty().getNumberOfStudents());
        System.out.printf("here are the best %s students: \n%s", institute.getName(), parser.listToString(institute.getGrantsStudent()));

    }
}

