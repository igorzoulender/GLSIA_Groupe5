package GroupeFive.Gestion_stocks.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import GroupeFive.Gestion_stocks.Model.Aprovisionement;

public interface AprovisionementRepo extends JpaRepository<Aprovisionement, Integer> {
    
}

