package maktab_question_three;

import java.util.Arrays;

public class Student {
    private String name;
    private int id;
    private int numberOfLessons;
    private Lesson[] lessonsString=new Lesson[numberOfLessons];

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    public Student(String name, int id, int numberOfLessons) {
        this.name = name;
        this.id = id;
        this.numberOfLessons = numberOfLessons;
    }

    public void setLessonsString(Lesson[] lessonsString) {
        this.lessonsString = lessonsString;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", numberOfLessons=" + numberOfLessons +
                ", lessonsString=" + Arrays.toString(lessonsString) +
                '}';
    }
}
