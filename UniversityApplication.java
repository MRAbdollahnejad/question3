package maktab_question_three;

import java.util.Arrays;

public class UniversityApplication {
    public static void main(String[] args) {
        Student[] totalStudentsForLesson = new Student[2];
        Student[] totalStudentsForLesson2 = new Student[1];


        Student student1 = new Student("ali", 30, 2);
        Student student2 = new Student("hasan", 31, 1);

        totalStudentsForLesson[0] = student1;
        totalStudentsForLesson[1] = student2;
        totalStudentsForLesson2[0] = student1;

        Master master1 = new Master("j.w", 1, 2);
        Master master2 = new Master("m.r", 2, 1);

        Lesson[] master1Lessons = new Lesson[master1.getNumberOfLessons()];
        master1Lessons[0] = new Lesson("math1", 91, master1, totalStudentsForLesson);
        master1Lessons[1] = new Lesson("math2", 92, master1, totalStudentsForLesson);

        Lesson[] master2Lessons = new Lesson[master2.getNumberOfLessons()];
        master2Lessons[0] = new Lesson("chemistry", 95, master2, totalStudentsForLesson2);


        master1.setLessonsString(master1Lessons);
//        System.out.println(master1);

        System.out.println(Arrays.toString(master2Lessons[0].getStudents()));
        System.out.println(Arrays.toString(master1Lessons[0].getStudents()));
        System.out.println(Arrays.toString(master1Lessons[1].getStudents()));

        master2.setLessonsString(master2Lessons);
//        System.out.println(master2);


        Lesson[] lessons1 = new Lesson[student1.getNumberOfLessons()];
        lessons1[0] = master1Lessons[0];
        lessons1[1] = master1Lessons[1];

        student1.setLessonsString(lessons1);
//        System.out.println(student1);




    }
}
