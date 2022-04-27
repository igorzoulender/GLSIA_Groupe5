package GroupeFive.Gestion_stocks.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Vente")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Vente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int idVente;
    @Column(nullable = false, updatable = false)
    private LocalDate dateVente;


    @ManyToOne()
    @JoinColumn(name ="clientId", insertable = false, updatable = false)
    private  Client client;
    private  int clientId;

    @ManyToOne()
    @JoinColumn(name ="LigneVenteId", insertable = false, updatable = false)
    private  LigneVente ligneVente;
    private  int LigneVenteId;
    
    public Vente() {
       
    }
    public int getIdVente() {
        return idVente;
    }
    public void setIdVente(int idVente) {
        this.idVente = idVente;
    }
    public LocalDate getDateVente() {
        return dateVente;
    }
    public void setDateVente(LocalDate dateVente) {
        this.dateVente = dateVente;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public int getClientId() {
        return clientId;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    public LigneVente getLigneVente() {
        return ligneVente;
    }
    public void setLigneVente(LigneVente ligneVente) {
        this.ligneVente = ligneVente;
    }
    public int getLigneVenteId() {
        return LigneVenteId;
    }
    public void setLigneVenteId(int ligneVenteId) {
        LigneVenteId = ligneVenteId;
    }
    
    public Vente(int idVente, LocalDate dateVente, Client client, int clientId, LigneVente ligneVente,
            int ligneVenteId) {
        this.idVente = idVente;
        this.dateVente = dateVente;
        this.client = client;
        this.clientId = clientId;
        this.ligneVente = ligneVente;
        LigneVenteId = ligneVenteId;
    }
    
    @Override
    public String toString() {
        return "Vente [LigneVenteId=" + LigneVenteId + ", client=" + client + ", clientId=" + clientId + ", dateVente="
                + dateVente + ", idVente=" + idVente + ", ligneVente=" + ligneVente + "]";
    }

    
}
