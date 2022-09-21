package br.com.fiap.epictaskapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
public class Task {
    
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
   @Id
    private Long id;
    
    @NotBlank
    private String title;
    
    @Size(min = 10, message = "melhore essa descrição")
    private String description;
    private int score = 100;
    private int status = 0;

    public Task(){}
    
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task [description=" + description + ", id=" + id + ", score=" + score + ", status=" + status
                + ", title=" + title + "]";
    }

    

}
