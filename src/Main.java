import desafio.dio.Curso;
import desafio.dio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso course = new Curso();
        Mentoria mentoria = new Mentoria();

        course.setTitle("Curso Java");
        course.setDescrition("Java");
        course.setCourseLoad(8);

        System.out.println(course);

        mentoria.setTitle("Mentoria Java");
        mentoria.setDescrition("Java");
        mentoria.setDate(LocalDate.now());

        System.out.println(mentoria);
    }
}