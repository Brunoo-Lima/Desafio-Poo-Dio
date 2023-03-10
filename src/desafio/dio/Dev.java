package desafio.dio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> contentRegistered = new LinkedHashSet<>();
    private Set<Content> contentCompleted = new LinkedHashSet<>();

    public void registerBootCamp(BootCamp bootcamp){
         this.contentRegistered.addAll(bootcamp.getContents());
         bootcamp.getDevsRegisters().add(this);
    }

    public void progress(){
        Optional<Content> content = this.contentRegistered.stream().findFirst();
        if(content.isPresent()) {
            this.contentCompleted.add(content.get());
            this.contentRegistered.remove(content.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }

    public double calculateTotalXp() {
        return this.contentCompleted
                .stream()
                .mapToDouble(content -> content.calculateXp())
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentRegistered() {
        return contentRegistered;
    }

    public void setContentRegistered(Set<Content> contentRegistered) {
        this.contentRegistered = contentRegistered;
    }

    public Set<Content> getContentCompleted() {
        return contentCompleted;
    }

    public void setContentCompleted(Set<Content> contentCompleted) {
        this.contentCompleted = contentCompleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentRegistered, dev.contentRegistered) && Objects.equals(contentCompleted, dev.contentCompleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentRegistered, contentCompleted);
    }
}
