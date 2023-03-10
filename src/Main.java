import desafio.dio.Course;
import desafio.dio.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setTitle("Curso Java");
        course.setDescription("Java");
        course.setCourseLoad(8);

        System.out.println(course);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoria Java");
        mentoring.setDescription("Java");
        mentoring.setDate(LocalDate.now());

        System.out.println(mentoring);
    }
}