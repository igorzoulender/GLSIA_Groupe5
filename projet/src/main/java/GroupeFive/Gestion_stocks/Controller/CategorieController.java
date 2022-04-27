package GroupeFive.Gestion_stocks.Controller;
import GroupeFive.Gestion_stocks.Model.Categorie;
import GroupeFive.Gestion_stocks.Service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/categorie")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("/all")
    public String GetAllCategorie(Model model) {
           model.addAttribute("ListCategorie", categorieService.AfficherCategorie());
            return "Categorie/Listcategorie";
    }
    
    @PostMapping("/create")
    public String addCategorie(Categorie categorie){
       categorieService.AjouterCategorie(categorie);
       return "redirect:/categorie/all";
       
    }

    @GetMapping("/formulaire")
    public String Formulaire(){
       return "Categorie/Createcategorie";
    }

    @GetMapping("/edit/{IdCategorie}")
    public String TrouverCategoriebyId(@PathVariable("IdCategorie") Integer Idcategorie, Model model){
       model.addAttribute("categorie", categorieService.FindCategorieById(Idcategorie));
       return "Categorie/Updatecategorie";
    }

    @PostMapping("/update")
    public String UpdateCategorie(@ModelAttribute("categorie") Categorie categorie){
       categorieService.AjouterCategorie(categorie);
       return "redirect:/categorie/all";
    }
    
    @GetMapping("/delete/{IdCategorie}")
    public String DeleteCategorie(@PathVariable("IdCategorie") Integer IdCategorie){
         categorieService.DeleteCategorie(IdCategorie);
        return "redirect:/categorie/all";
    }
    

    
}
