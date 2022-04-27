package GroupeFive.Gestion_stocks.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import GroupeFive.Gestion_stocks.Repo.*;
import java.util.List;
import java.util.Optional;
import GroupeFive.Gestion_stocks.Model.*;


@Service
public class ArticleService {
    
    @Autowired
    private final ArticleRepo articleRepo;
    
    public ArticleService(ArticleRepo articleRepo){
        this.articleRepo = articleRepo;
    }
    
    public Article AjouterArticle(Article article){
        return articleRepo.save(article);
    }

    public List<Article> AfficherArticle() {
        return articleRepo.findAll();
    }

    public Article UpdateArticle(Article article){
        return articleRepo.save(article);
    }

    public Article FindArticleById(Integer idArticle){

        Optional<Article> optional = articleRepo.findById(idArticle);
        Article article = null;
        if(optional.isPresent())
        {
            article = optional.get();
        }else
        {
            throw new RuntimeException("id introuvable");
        }
        return  article;
        
    }

    public void DeleteArticle(Integer idArticle){
        articleRepo.deleteById(idArticle);
    }
}
