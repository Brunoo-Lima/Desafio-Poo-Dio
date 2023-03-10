package desafio.dio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
    private String name;
    private String description;
    private final LocalDate dateStart = LocalDate.now();
    private final LocalDate dateFinal = dateStart.plusDays(45);

    private Set<Dev> devsRegisters = new LinkedHashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public LocalDate getDateFinal() {
        return dateFinal;
    }

    public Set<Dev> getDevsRegisters() {
        return devsRegisters;
    }

    public void setDevsRegisters(Set<Dev> devsRegisters) {
        this.devsRegisters = devsRegisters;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(name, bootCamp.name) && Objects.equals(description, bootCamp.description) && Objects.equals(dateStart, bootCamp.dateStart) && Objects.equals(dateFinal, bootCamp.dateFinal) && Objects.equals(devsRegisters, bootCamp.devsRegisters) && Objects.equals(contents, bootCamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dateStart, dateFinal, devsRegisters, contents);
    }
}
