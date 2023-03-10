import desafio.dio.BootCamp;
import desafio.dio.Course;
import desafio.dio.Dev;
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
        //mentoring.setTitle("Mentoria Java");
        //mentoring.setDescription("Java");
        //mentoring.setDate(LocalDate.now());
        //System.out.println(mentoring);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setName("BootCamp Java Developer");
        bootCamp.setDescription("Curso de Java Developer");
        bootCamp.getContents().add(course);
        bootCamp.getContents().add(mentoring);

        Dev dev1 = new Dev();
        dev1.setName("Bruno");
        dev1.registerBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos " + dev1.getName() + " " +
                dev1.getContentRegistered());

        System.out.println(" ");

        Dev dev2 = new Dev();
        dev2.setName("Gabriel");
        dev2.registerBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos " + dev2.getName() + " " +
                dev2.getContentRegistered());

    }
}