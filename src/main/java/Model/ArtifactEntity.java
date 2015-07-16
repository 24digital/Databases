package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ArtifactEntity {
    @Id
    private Long id;

    private String work;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
