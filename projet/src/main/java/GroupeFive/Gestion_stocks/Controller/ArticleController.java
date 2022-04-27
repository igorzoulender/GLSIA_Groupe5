package GroupeFive.Gestion_stocks.Controller;
import GroupeFive.Gestion_stocks.Model.*;
import GroupeFive.Gestion_stocks.Service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CategorieService categorieService;

    @GetMapping("/all")
    public String GetAllArticle(Model model) {
       model.addAttribute("articles", articleService.AfficherArticle());
       return "Article/ListArticle";   
    }

    @PostMapping("/create")
    public String addArticle(Article article) {
       article.setQteStock(0);
       article.setDateCreation(LocalDate.now());
       articleService.AjouterArticle(article);
       return "redirect:/article/all";
    }

    @GetMapping("/formulaire")
    public String Formulaire(Model model){
        model.addAttribute("ListCategorie", categorieService.AfficherCategorie());
       return "Article/CreateArticle";
    }

    @GetMapping("/edit/{IdArticle}")
    public String TrouverArticlebyId(@PathVariable("IdArticle") Integer IdArticle, Model model){
        model.addAttribute("articles", articleService.FindArticleById(IdArticle));
        model.addAttribute("ListCategorie", categorieService.AfficherCategorie());

        return "Article/UpdateArticle"; 
    }

    @PostMapping("/update")
    public String UpdateCategorie(@ModelAttribute("articles") Article article){
       articleService.AjouterArticle(article);
       return "redirect:/article/all";
    }

    @GetMapping("/delete/{IdArticle}")
    public String DeleteArticle(@PathVariable("IdArticle") Integer IdArticle){
        articleService.DeleteArticle(IdArticle);
        return "redirect:/article/all"; 
    }
}
