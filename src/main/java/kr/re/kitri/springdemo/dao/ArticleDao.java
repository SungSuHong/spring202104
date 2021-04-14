package kr.re.kitri.springdemo.dao;

import kr.re.kitri.springdemo.model.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

// article 테이블에 매핑되는 클래스
// CRUD 작업
@Repository
@Mapper
public interface ArticleDao {

    List<Article> selectAllArticles();
    String insertArticle(Article article);
    Article selectArticleByArticleId(long articleId);
}
