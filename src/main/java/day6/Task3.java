package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Галина Петровна", "черчение");
        Student student = new Student("Иванов");
        //просто для визуализации разных ответов
        teacher.evaluate(student);
        teacher.evaluate(student);
        teacher.evaluate(student);
        teacher.evaluate(student);
        teacher.evaluate(student);
    }
}

class Teacher {
    private final String name;
    private final String course;

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    void evaluate(Student student) {
        int a = 2;
        int b = 5;
        String mark = null;
        //int x= a + (int)(Math.random() * ((b - a) + 1));
        Random random = new Random();
        int x = a + random.nextInt(b - a + 1);
        switch (x) {
            case 5 -> mark = "отлично";
            case 4 -> mark = "хорошо";
            case 3 -> mark = "удовлетворительно";
            case 2 -> mark = "неудовлетворительно";
        }

        System.out.println("Преподаватель " + this.getName() + " оценил студента с именем " + student.getName() + " по предмету " +
                this.getCourse() + " на оценку " + mark);
    }
}

class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}