package desafio.dio;

public class Curso {

    private String title;
    private String descrition;
    private int courseLoad;

    public Curso() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public int getCourseLoad() {
        return courseLoad;
    }

    public void setCourseLoad(int courseLoad) {
        this.courseLoad = courseLoad;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "title='" + title + '\'' +
                ", descrition='" + descrition + '\'' +
                ", courseLoad=" + courseLoad +
                '}';
    }
}
