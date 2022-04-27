package GroupeFive.Gestion_stocks.Controller;

import GroupeFive.Gestion_stocks.Model.*;
import GroupeFive.Gestion_stocks.Service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Controller
@RequestMapping("/Aprovisionement")
public class AprovisionementController {
    @Autowired
    private AprovisionementService aprovisionementService;

     @Autowired
     private ArticleService articleService;

    @GetMapping("/All")
    public ResponseEntity<List<Aprovisionement>> GetAllAprovisionement() {
        List<Aprovisionement> Aprovisionement = aprovisionementService.AfficherArticleaprovisioner();
        return new ResponseEntity<>(Aprovisionement, HttpStatus.OK);
    }  

    @GetMapping("/Update/{id}")
    public ResponseEntity<Aprovisionement> UpdateAprovisionement(@RequestBody Aprovisionement aprovisionement){
        Aprovisionement updateaprovisionement = aprovisionementService.Updateaprovisionement(aprovisionement);
        return new ResponseEntity<>(updateaprovisionement,HttpStatus.OK); 
    
    }
    
    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Aprovisionement> DeleteAprovisionement(@PathVariable("id_aprovisionement") Integer idAprovisionement){
        aprovisionementService.deleteApprovisionnement(idAprovisionement);
        return new ResponseEntity<>(HttpStatus.OK); 
    
    }

    @PostMapping("/Aprovisioner")
    public ResponseEntity<Aprovisionement> AprovisionerArticle(Aprovisionement aprovisionement, RedirectAttributes attributes, @RequestParam("article") int idArticle) {
        aprovisionement.setDateApprovision(LocalDate.now());
        Article article= articleService.FindArticleById(idArticle);
        article.setQteStock(article.getQteStock() + aprovisionement.getIdAprovisionement());
        articleService.AjouterArticle(article);
        aprovisionement.setArticle(article);
        aprovisionementService.Updateaprovisionement(aprovisionement);
        attributes.addAttribute("idArticle",article.getIdArticle());
        return new ResponseEntity<>(HttpStatus.OK); 
     
  }
}
