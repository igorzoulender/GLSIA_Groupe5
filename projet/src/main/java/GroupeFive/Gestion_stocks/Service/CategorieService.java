package GroupeFive.Gestion_stocks.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import GroupeFive.Gestion_stocks.Repo.CategorieRepo;
import java.util.List;
import java.util.Optional;
import GroupeFive.Gestion_stocks.Model.Categorie;



@Service
public class CategorieService {
    
    @Autowired
    private final CategorieRepo categorieRepo;
    
    public CategorieService(CategorieRepo categorieRepo){
        this.categorieRepo = categorieRepo;
    }

    public Categorie AjouterCategorie(Categorie categorie){
        return categorieRepo.save(categorie);
    }

    public List<Categorie> AfficherCategorie() {
        return categorieRepo.findAll();
    }

    public Categorie UpdateCategorie(Categorie categorie){
        return categorieRepo.save(categorie);
    }

    public Categorie FindCategorieById(Integer idCategorie){

        Optional<Categorie> optional = categorieRepo.findById(idCategorie);
        Categorie categorie = null;
        if(optional.isPresent())
        {
            categorie = optional.get();
        }else
        {
            throw new RuntimeException("id introuvable");
        }
        return  categorie;
        
    }

    public void DeleteCategorie(Integer idCategorie){
        categorieRepo.deleteById(idCategorie);
    }
}
