package kr.re.kitri.springdemo.dao;

import kr.re.kitri.springdemo.model.Article;
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
public class ArticleDao {

    @Autowired
    private DataSource ds;

    // 모든 글 조회
    public List<Article> selectAllArticles() {
        // query 수행... later..
        // java9 미만 버전일 때 아래 코드 사용
        List<Article> list2 = Arrays.asList(
                new Article(1, "title", "kim", "오늘은 좋은날", null, 0),
                new Article(2, "title", "lee", "오늘은 좋은날2", null, 0),
                new Article(3, "title", "park", "오늘은 좋은날23", null, 0),
                new Article(4, "title", "choi", "오늘은 좋은날4", null, 0),
                new Article(5, "title", "kwon", "오늘은 좋은날5", null, 0)
        );

        List<Article> list  = List.of(
                new Article(1, "title", "kim", "오늘은 좋은날", null, 0),
                new Article(2, "title", "lee", "오늘은 좋은날2", null, 0),
                new Article(3, "title", "park", "오늘은 좋은날23", null, 0),
                new Article(4, "title", "choi", "오늘은 좋은날4", null, 0),
                new Article(5, "title", "kwon", "오늘은 좋은날5", null, 0)
        );
        return list;
    }

    // 글쓰기
    public String insertArticle(Article article) {
        System.out.println(article + " from dao..");
        return "글쓰기가 완료되었습니다. from dao";
    }

    public Article selectArticleByArticleId(long articleId) {

        try {
            Connection conn = ds.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select * from article");
            ResultSet rs = pstmt.executeQuery();
            // ..
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return new Article(articleId, "aaa", "aaa", "aaaa", null, 10);
    }
}
