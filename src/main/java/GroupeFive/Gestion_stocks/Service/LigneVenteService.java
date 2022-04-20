package GroupeFive.Gestion_stocks.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import GroupeFive.Gestion_stocks.Repo.*;
import java.util.List;
import java.util.Optional;
import GroupeFive.Gestion_stocks.Model.*;

@Service
public class LigneVenteService {
    @Autowired
    private final LigneVenteRepo ligneVenteRepo;
    
    public LigneVenteService(LigneVenteRepo ligneVenteRepo){
        this.ligneVenteRepo = ligneVenteRepo;
    }
    
    public LigneVente AjouterLigneVente(LigneVente ligneVente){
        return ligneVenteRepo.save(ligneVente);
    }

    public List<LigneVente> AfficherLigneVente() {
        return ligneVenteRepo.findAll();
    }

    public LigneVente UpdateLigneVente(LigneVente ligneVente){
        return ligneVenteRepo.save(ligneVente);
    }

    public LigneVente FindLigneVenteById(Integer idLigneVente){

        Optional<LigneVente> optional = ligneVenteRepo.findById(idLigneVente);
        LigneVente ligneVente = null;
        if(optional.isPresent())
        {
            ligneVente = optional.get();
        }else
        {
            throw new RuntimeException("id introuvable");
        }
        return  ligneVente;
        
    }

    public void DeleteLigneVente(Integer idLigneVente){
        ligneVenteRepo.deleteById(idLigneVente);
    }
}
