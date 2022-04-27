package GroupeFive.Gestion_stocks.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import GroupeFive.Gestion_stocks.Model.Categorie;

public interface CategorieRepo extends JpaRepository<Categorie, Integer> {
   
}
