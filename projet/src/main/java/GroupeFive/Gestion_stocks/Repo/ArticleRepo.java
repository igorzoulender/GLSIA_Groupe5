package GroupeFive.Gestion_stocks.Repo;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import GroupeFive.Gestion_stocks.Model.Article;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Integer> {

    @Transactional
    @Modifying
    @Query("update Article set qte_stock = qte_stock+ :qte where id_article = :id_article")
    public void updateStockArticle(@Param("qte") int qte_stock, @Param("id_article") int id_article);
  
}
