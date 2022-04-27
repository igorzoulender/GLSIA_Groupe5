package GroupeFive.Gestion_stocks.Model;
// import lombok.AllArgsConstructor;
import lombok.Data;
// import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Article")
@Data
// @NoArgsConstructor
// @AllArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int idArticle;
    private String libelle;
    private int qteStock;
    private int qteSeuil;
    private double prix;
    private LocalDate dateCreation;
    @ManyToOne()
    @JoinColumn(name = "categorieId", insertable = false, updatable = false)
    private Categorie categorie;
    private int categorieId;

    public Article() {
       
    }

    public int getIdArticle() {
        return idArticle;
    }
    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public int getQteStock() {
        return qteStock;
    }
    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }
    public int getQteSeuil() {
        return qteSeuil;
    }
    public void setQteSeuil(int qteSeuil) {
        this.qteSeuil = qteSeuil;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public LocalDate getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }
    public Categorie getCategorie() {
        return categorie;
    }
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    public int getCategorieId() {
        return categorieId;
    }
    public void setCategorieId(int categorieId) {
        this.categorieId = categorieId;
    }

    public Article(int idArticle, String libelle, int qteStock, int qteSeuil, double prix, LocalDate dateCreation,
            Categorie categorie, int categorieId) {
        this.idArticle = idArticle;
        this.libelle = libelle;
        this.qteStock = qteStock;
        this.qteSeuil = qteSeuil;
        this.prix = prix;
        this.dateCreation = dateCreation;
        this.categorie = categorie;
        this.categorieId = categorieId;
    }
    @Override
    public String toString() {
        return "Article [categorie=" + categorie + ", categorieId=" + categorieId + ", dateCreation=" + dateCreation
                + ", idArticle=" + idArticle + ", libelle=" + libelle + ", prix=" + prix + ", qteSeuil=" + qteSeuil
                + ", qteStock=" + qteStock + "]";
    }

    
    
    
    
    
}
