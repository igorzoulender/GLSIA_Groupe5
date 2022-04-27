package GroupeFive.Gestion_stocks.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;



@Entity
@Table(name = "Aprovisionement")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aprovisionement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int idAprovisionement;
    private int quantite;
    private LocalDate dateApprovision;

    @ManyToOne()
    @JoinColumn(name ="articleId", insertable = false, updatable = false)
    private  Article article;
    private  int articleId;

    @ManyToOne()
    @JoinColumn(name ="EmployeId", insertable = false, updatable = false)
    private  Employer employer;
    private  int EmployeId;

    public Aprovisionement() {
    }

    public int getIdAprovisionement() {
        return idAprovisionement;
    }
    public void setIdAprovisionement(int idAprovisionement) {
        this.idAprovisionement = idAprovisionement;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public LocalDate getDateApprovision() {
        return dateApprovision;
    }
    public void setDateApprovision(LocalDate dateApprovision) {
        this.dateApprovision = dateApprovision;
    }
    public Article getArticle() {
        return article;
    }
    public void setArticle(Article article) {
        this.article = article;
    }
    public int getArticleId() {
        return articleId;
    }
    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }
    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    public int getEmployeId() {
        return EmployeId;
    }
    public void setEmployeId(int employeId) {
        EmployeId = employeId;
    }

    public Aprovisionement(int idAprovisionement, int quantite, LocalDate dateApprovision, Article article,
            int articleId, Employer employer, int employeId) {
        this.idAprovisionement = idAprovisionement;
        this.quantite = quantite;
        this.dateApprovision = dateApprovision;
        this.article = article;
        this.articleId = articleId;
        this.employer = employer;
        EmployeId = employeId;
    }
    @Override
    public String toString() {
        return "Aprovisionement [EmployeId=" + EmployeId + ", article=" + article + ", articleId=" + articleId
                + ", dateApprovision=" + dateApprovision + ", employer=" + employer + ", idAprovisionement="
                + idAprovisionement + ", quantite=" + quantite + "]";
    }

    
}
