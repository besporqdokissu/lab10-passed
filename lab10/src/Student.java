public class Student {

    private String name;
    private String surname;
    private int recordBookID;
    private double averageScore;

    public Student(String name, String surname, int recordBookID, double averageScore) {
        this.name = name;
        this.surname = surname;
        this.recordBookID = recordBookID;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getRecordBookID() {
        return recordBookID;
    }

    public void setRecordBookID(int recordBookID) {
        this.recordBookID = recordBookID;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String toString(){
        return new String("name: " + name + " " + surname + ", average score: " + averageScore + ", record book: " + recordBookID);
    }
}
