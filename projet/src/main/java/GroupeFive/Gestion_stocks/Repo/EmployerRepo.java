package GroupeFive.Gestion_stocks.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import GroupeFive.Gestion_stocks.Model.Employer;

public interface EmployerRepo extends JpaRepository<Employer, Integer> {
    
}
