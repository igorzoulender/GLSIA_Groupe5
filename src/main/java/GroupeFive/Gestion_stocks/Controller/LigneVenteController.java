package GroupeFive.Gestion_stocks.Controller;

import GroupeFive.Gestion_stocks.Model.*;
import GroupeFive.Gestion_stocks.Service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Controller
@RequestMapping("/LigneVente")
public class LigneVenteController {
    @Autowired
    private LigneVenteService ligneVenteService;

    @GetMapping("/All")
    public ResponseEntity<List<LigneVente>> GetAllLigneVente() {
        List<LigneVente> LigneVente = ligneVenteService.AfficherLigneVente();
        return new ResponseEntity<>(LigneVente, HttpStatus.OK);
    }

    @PostMapping("/Create")
    public ResponseEntity<LigneVente> addLigneVente(@RequestBody LigneVente ligneVente) {
        LigneVente newLigneVente = ligneVenteService.AjouterLigneVente(ligneVente);
        return new ResponseEntity<>(newLigneVente, HttpStatus.CREATED);
    }

    @GetMapping("/Find/{id}")
    public ResponseEntity<LigneVente> TrouverLigneVentebyId(@PathVariable("idLigneVente") Integer idLigneVente){
        LigneVente FindLigneVente = ligneVenteService.FindLigneVenteById(idLigneVente);
        return new ResponseEntity<>(FindLigneVente,HttpStatus.OK); 
    }

    @PutMapping("/Update")
    public ResponseEntity<LigneVente> UpdateLigneVente(@RequestBody LigneVente ligneVente){
        LigneVente updateLigneVente = ligneVenteService.UpdateLigneVente(ligneVente);
        return new ResponseEntity<>(updateLigneVente,HttpStatus.OK); 
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<LigneVente> DeleteLigneVente(@PathVariable("id_LigneVente") Integer idLigneVente){
        ligneVenteService.DeleteLigneVente(idLigneVente);
        return new ResponseEntity<>(HttpStatus.OK); 
    }
    
}
