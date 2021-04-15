package kr.re.kitri.springdemo.dao;

import kr.re.kitri.springdemo.model.Article;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ArticleDaoTests {

    Logger log = LoggerFactory.getLogger(ArticleDaoTests.class);

    @Autowired
    private ArticleDao articleDao;

    @Test
    public void testSelectAllArticles() {
        List<Article> list = articleDao.selectAllArticles();
        log.info(list.toString());
        assertTrue(list.size() > 0);
    }

    @Test
    public void testSelectArticleByArticleId() {

    }
}
