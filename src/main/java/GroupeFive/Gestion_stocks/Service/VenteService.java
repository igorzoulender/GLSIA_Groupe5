package GroupeFive.Gestion_stocks.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import GroupeFive.Gestion_stocks.Repo.*;
import java.util.List;
import java.util.Optional;
import GroupeFive.Gestion_stocks.Model.*;

@Service
public class VenteService {
    @Autowired
    private final VenteRepo venteRepo;
    
    public VenteService(VenteRepo venteRepo){
        this.venteRepo = venteRepo;
    }
    
    public Vente AjouterVente(Vente vente){
        return venteRepo.save(vente);
    }

    public List<Vente> AfficherVente() {
        return venteRepo.findAll();
    }

    public Vente UpdateVente(Vente vente){
        return venteRepo.save(vente);
    }

    public Vente FindVenteById(Integer idVente){

        Optional<Vente> optional = venteRepo.findById(idVente);
        Vente vente = null;
        if(optional.isPresent())
        {
            vente = optional.get();
        }else
        {
            throw new RuntimeException("id introuvable");
        }
        return  vente;
        
    }

    public void DeleteVente(Integer idVente){
        venteRepo.deleteById(idVente);
    }
}
