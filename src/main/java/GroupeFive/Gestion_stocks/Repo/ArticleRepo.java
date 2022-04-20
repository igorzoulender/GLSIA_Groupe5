package GroupeFive.Gestion_stocks.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import GroupeFive.Gestion_stocks.Model.Article;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Integer> {

  
}
