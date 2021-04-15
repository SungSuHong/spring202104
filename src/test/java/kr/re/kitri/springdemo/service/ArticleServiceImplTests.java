package kr.re.kitri.springdemo.service;

import kr.re.kitri.springdemo.model.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ArticleServiceImplTests {

    @Autowired
    private ArticleService articleService;

    @Test
    public void testGetAllArticles() {
        // 성공조건 - 조회결과의 리스트 사이즈가 1이상이면 성공..
        // 성공조건 - 조회결과의 리스트 3번항목의 작성자가 김순곤이면 성공..
        List<Article> result = articleService.getAllArticles();
        for (Article article : result) {
            if (article.getArticleNo() == 3) {
                assertTrue(article.getAuthor().equals("김순곤"));
            }
        }
    }

    @Test
    public void testGetArticleByArticleId() {
        // 성공조건 : 4번글로 조회시 작성자가 이경규 이면 통과
        Article article = articleService.getArticleByArticleId(4);
        assertEquals("이경규", article.getAuthor());
    }

}
