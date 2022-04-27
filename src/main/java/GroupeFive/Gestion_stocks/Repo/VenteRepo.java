package GroupeFive.Gestion_stocks.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import GroupeFive.Gestion_stocks.Model.Vente;

public interface VenteRepo extends JpaRepository<Vente, Integer> {
    
}
