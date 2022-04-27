package GroupeFive.Gestion_stocks.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import GroupeFive.Gestion_stocks.Model.LigneVente;

public interface LigneVenteRepo extends JpaRepository<LigneVente, Integer> {
    
}
