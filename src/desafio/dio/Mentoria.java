package desafio.dio;

import java.time.LocalDate;

public class Mentoria {

    private String title;
    private String descrition;
    private LocalDate date;

    public Mentoria() {
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

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + title + '\'' +
                ", descrition='" + descrition + '\'' +
                ", date=" + date +
                '}';
    }
}
