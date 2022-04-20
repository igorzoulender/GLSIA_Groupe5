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
@RequestMapping("/Vente")

public class VenteController {
    @Autowired
    private VenteService venteService;

    @GetMapping("/All")
    public ResponseEntity<List<Vente>> GetAllVente() {
        List<Vente> Vente = venteService.AfficherVente();
        return new ResponseEntity<>(Vente, HttpStatus.OK);
    }

    @PostMapping("/Create")
    public ResponseEntity<Vente> addVente(@RequestBody Vente vente) {
        Vente newVente = venteService.AjouterVente(vente);
        return new ResponseEntity<>(newVente, HttpStatus.CREATED);
    }

    @GetMapping("/Find/{id}")
    public ResponseEntity<Vente> TrouverVentebyId(@PathVariable("idVente") Integer idVente){
        Vente FindVente = venteService.FindVenteById(idVente);
        return new ResponseEntity<>(FindVente,HttpStatus.OK); 
    }

    @PutMapping("/Update")
    public ResponseEntity<Vente> UpdateVente(@RequestBody Vente vente){
        Vente updateVente = venteService.UpdateVente(vente);
        return new ResponseEntity<>(updateVente,HttpStatus.OK); 
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Vente> DeleteVente(@PathVariable("id_Vente") Integer idVente){
        venteService.DeleteVente(idVente);
        return new ResponseEntity<>(HttpStatus.OK); 
    }
}
