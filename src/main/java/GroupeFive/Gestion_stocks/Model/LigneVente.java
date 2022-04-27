package GroupeFive.Gestion_stocks.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "LigneVente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LigneVente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int idLigneVente;
    private int quantite;
    private double prixUnitaire;
    
    @ManyToOne()
    @JoinColumn(name ="articleId", insertable = false, updatable = false)
    private  Article article;
    private  int articleId;
    
        public LigneVente() {
            
        }
    
    public int getIdLigneVente() {
        return idLigneVente;
    }

    public void setIdLigneVente(int idLigneVente) {
        this.idLigneVente = idLigneVente;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
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

    public LigneVente(int idLigneVente, int quantite, double prixUnitaire, Article article, int articleId) {
        this.idLigneVente = idLigneVente;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.article = article;
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        return "LigneVente [article=" + article + ", articleId=" + articleId + ", idLigneVente=" + idLigneVente
                + ", prixUnitaire=" + prixUnitaire + ", quantite=" + quantite + "]";
    }
    
    

    
}
