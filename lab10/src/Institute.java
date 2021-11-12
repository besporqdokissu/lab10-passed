import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Institute {

    private String name;
    private List<Faculty> faculties = new ArrayList<>();

    public Institute(String name, List<Faculty> faculties) {
        this.name = name;
        this.faculties.addAll(faculties);
    }

    public void addFaculty(Faculty... faculty) {
        faculties.addAll(List.of(faculty));
    }

    public void removeFaculty(Faculty... faculties) {
        this.faculties.removeAll(List.of(faculties));
    }

    //1) Знайти загальну кількість студентів, що навчається в інституті, типізований ітератор
    public int getNumberOfStudents() {
        int counter = 0;

        Iterator<Faculty> facultyIterator = this.getFaculties().iterator();
        while (facultyIterator.hasNext()) {
            Faculty faculty = facultyIterator.next();
            counter += faculty.getNumberOfStudents();
        }
        return counter;
    }

    //2) Знайти факультет, на якому навчається найбільша кількість студентів, типізований цикл «for-each».
    public Faculty getPopularFaculty() {
        int counter = 0;
        Faculty popularFaculty = null;
        for (Faculty faculty : this.getFaculties()) {
            if (faculty.getNumberOfStudents() > counter) {
                counter = faculty.getNumberOfStudents();
                popularFaculty = faculty;
            }
        }
        return popularFaculty;
    }

    //3) Скласти список студентів, у яких середній бал >95 нетипізований ітератор;
    public List<Student> getGrantsStudent() {
        List<Student> grandStudents = new LinkedList<>();

        Iterator facultyIterator = this.getFaculties().iterator();
        while (facultyIterator.hasNext()) {
            Faculty faculty = (Faculty) facultyIterator.next();
            grandStudents.addAll(faculty.getGrantsStudent());
        }
        return grandStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFaculties() {
        return List.copyOf(faculties);
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = new ArrayList<>(faculties);
    }
}
