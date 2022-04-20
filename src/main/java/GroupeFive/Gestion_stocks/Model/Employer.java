package GroupeFive.Gestion_stocks.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Entity
@Table(name = "Employer")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int idUser;
    private String nom;
    private String prenom;
    private String password;
    private String email;
    private String telephone;

    public Employer() {
        
    }
    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public Employer(int idUser, String nom, String prenom, String password, String email, String telephone) {
        this.idUser = idUser;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
    }
    
    @Override
    public String toString() {
        return "Employer [email=" + email + ", idUser=" + idUser + ", nom=" + nom + ", password=" + password
                + ", prenom=" + prenom + ", telephone=" + telephone + "]";
    }
    
   

    
    
}
