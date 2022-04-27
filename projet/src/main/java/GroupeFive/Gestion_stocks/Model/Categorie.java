package GroupeFive.Gestion_stocks.Model;
// import lombok.AllArgsConstructor;
import lombok.Data;
// import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "Categorie")
@Data
// @NoArgsConstructor
// @AllArgsConstructor
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int idCategorie;
    private String designation;

    public Categorie() {
    
    }
    
    public Categorie(int idCategorie, String designation) {
        this.idCategorie = idCategorie;
        this.designation = designation;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
   
    

}
