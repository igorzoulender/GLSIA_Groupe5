package GroupeFive.Gestion_stocks.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Entity
@Table(name = "Client")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int idClient;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;

    public Client() {

    }
    public int getIdClient() {
        return idClient;
    }
    public void setIdClient(int idClient) {
        this.idClient = idClient;
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
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public Client(int idClient, String nom, String prenom, String adresse, String telephone) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
    }
    @Override
    public String toString() {
        return "Client [adresse=" + adresse + ", idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom
                + ", telephone=" + telephone + "]";
    }
   
    
    
    
}

