package GroupeFive.Gestion_stocks.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import GroupeFive.Gestion_stocks.Repo.*;
import GroupeFive.Gestion_stocks.Model.*;


@Service
public class AprovisionementService {
    @Autowired
    public final AprovisionementRepo aprovisionementRepo;

    // @Autowired
    // private  ArticleRepo articleRepo;

    public AprovisionementService(AprovisionementRepo aprovisionementRepo){
        this.aprovisionementRepo = aprovisionementRepo;
    }

    public void Faireaprovisionement(Aprovisionement aprovisionement){
        aprovisionementRepo.save(aprovisionement);
        // articleRepo.aprovisionerstockArticle(aprovisionement.getQuantite(), aprovisionement.getArticleId());
    }
    public List<Aprovisionement> AfficherArticleaprovisioner(){
        return  aprovisionementRepo.findAll();
    }

    public Aprovisionement Updateaprovisionement(Aprovisionement aprovisionement){
        return aprovisionementRepo.save(aprovisionement);
    }

    public Aprovisionement SelectionAprivionement(int id){
        return  aprovisionementRepo.findById(id).get();
    }

    public Aprovisionement FindAprovisionementById(Integer idAprovisionement){

        Optional<Aprovisionement> optional = aprovisionementRepo.findById(idAprovisionement);
        Aprovisionement aprovisionement = null;
        if(optional.isPresent())
        {
            aprovisionement = optional.get();
        }else
        {
            throw new RuntimeException("id introuvable");
        }
        return  aprovisionement;
        
    }

    public void deleteApprovisionnement(int id){
        aprovisionementRepo.deleteById(id);
    }

    
}
