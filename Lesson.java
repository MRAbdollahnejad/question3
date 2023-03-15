package maktab_question_three;

public class Lesson {
    private String name;
    private int id;
    private Master master;
    private Student[] students;

    public Lesson(String name, int id, Master master, Student[] students) {
        this.name = name;
        this.id = id;
        this.master = master;
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
