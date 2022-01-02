package exercises.java.data.structures.priority.queue;

public class Student implements Comparable<Student>{
    private String name;
    private int id;
    private double cgpa;

    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student other){
        // compareTo should return < 0 if this is supposed to be
        // less than other, > 0 if this is supposed to be greater than
        // other and 0 if they are supposed to be equal
        if(this.cgpa==other.getCGPA()){
            int nameRank = this.name.compareTo(other.getName());
            if (nameRank==0){
                return this.id-other.getId();
            }
            else {
                return nameRank;
            }
        }
        else {
            return (this.cgpa-other.getCGPA())<0 ? 1 : -1;
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getCGPA() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}