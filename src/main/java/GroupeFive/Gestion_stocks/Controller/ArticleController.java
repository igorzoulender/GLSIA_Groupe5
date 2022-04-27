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
@RequestMapping("/Article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @GetMapping("/All")
    public ResponseEntity<List<Article>> GetAllArticle() {
       List<Article> article = articleService.AfficherArticle();
       return new ResponseEntity<>(article, HttpStatus.OK);
    }

    @PostMapping("/Create")
    public ResponseEntity<Article> addArticle(@RequestBody Article article) {
        Article newArticle = articleService.AjouterArticle(article);
        return new ResponseEntity<>(newArticle, HttpStatus.CREATED);
    }

    @GetMapping("/Find/{id}")
    public ResponseEntity<Article> TrouverArticlebyId(@PathVariable("idArticle") Integer idArticle){
        Article FindArticle =  articleService.FindArticleById(idArticle);
        return new ResponseEntity<>(FindArticle,HttpStatus.OK); 
    }

    @PutMapping("/Update")
    public ResponseEntity<Article> UpdateCategorie(@RequestBody Article Article){
        Article updateArticle = articleService.UpdateArticle(Article);
        return new ResponseEntity<>(updateArticle,HttpStatus.OK); 
    }


    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Article> DeleteArticle(@PathVariable("idArticle") Integer idArticle){
        articleService.DeleteArticle(idArticle);
        return new ResponseEntity<>(HttpStatus.OK); 
    }
}
