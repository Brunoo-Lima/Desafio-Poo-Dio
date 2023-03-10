package desafio.dio;

public class Course extends Content {

    private int courseLoad;

    @Override
    public double calculateXp() {
        return XP_STANDARD * courseLoad;
    }

    public Course() {
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
                "title='" + getTitle() + '\'' +
                ", descrition='" + getDescription() + '\'' +
                ", courseLoad=" + courseLoad +
                '}';
    }
}
