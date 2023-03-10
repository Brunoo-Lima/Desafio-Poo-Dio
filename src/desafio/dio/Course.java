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
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", courseLoad=" + courseLoad +
                '}';
    }
}
