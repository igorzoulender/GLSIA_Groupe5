package GroupeFive.Gestion_stocks.Controller;
import GroupeFive.Gestion_stocks.Model.Categorie;
import GroupeFive.Gestion_stocks.Service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@Controller
@RequestMapping("/Categorie")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("/All")
    public ResponseEntity<List<Categorie>> GetAllCategorie() {
        List<Categorie> categorie = categorieService.AfficherCategorie();
        return new ResponseEntity<>(categorie, HttpStatus.OK);
    }
    
    @GetMapping("/Create")
    public ResponseEntity<Categorie> addCategorie(@RequestBody Categorie categorie){
        Categorie newCategorie = categorieService.AjouterCategorie(categorie);
        return new ResponseEntity<>(newCategorie,HttpStatus.CREATED); 
    }

    @GetMapping("/Find/{id}")
    public ResponseEntity<Categorie> TrouverCategoriebyId(@PathVariable("idCategorie") Integer idCategorie){
        Categorie FindCategorie =  categorieService.FindCategorieById(idCategorie);
        return new ResponseEntity<>(FindCategorie,HttpStatus.OK); 
    }

    @PutMapping("/Update")
    public ResponseEntity<Categorie> UpdateCategorie(@RequestBody Categorie categorie){
        Categorie updateCategorie = categorieService.UpdateCategorie(categorie);
        return new ResponseEntity<>(updateCategorie,HttpStatus.OK); 
    }
    
    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Categorie> DeleteCategorie(@PathVariable("id") Integer idCategorie){
         categorieService.DeleteCategorie(idCategorie);
        return new ResponseEntity<>(HttpStatus.OK); 
    }
    

    
}
