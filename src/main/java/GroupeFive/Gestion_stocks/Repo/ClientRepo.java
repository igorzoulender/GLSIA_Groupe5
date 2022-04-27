package GroupeFive.Gestion_stocks.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import GroupeFive.Gestion_stocks.Model.Client;

public interface ClientRepo extends JpaRepository<Client, Integer> {
    
}
