package kr.re.kitri.springdemo.service;

import kr.re.kitri.springdemo.dao.ArticleDao;
import kr.re.kitri.springdemo.model.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

// 기능 수행 - 트랜잭션 처리
@Service
public class ArticleServiceImpl implements ArticleService {

    public static Logger log = LoggerFactory.getLogger(ArticleServiceImpl.class);

    @Autowired
    private ArticleDao articleDao;

    // 전체글보기
    @Override
    public List<Article> getAllArticles() {
        // DB에 접근해서 전체 글 데이터를 가져온다.
        // select * from aritlce;

//        int a = new Random().nextInt(3);
//        int b = 3 / a;
//        log.debug(a + "");

        return articleDao.selectAllArticles();
    }

    @Override
    public Article getArticleByArticleId(long articleId) {
        return articleDao.selectArticleByArticleId(articleId);
    }

    // 글 등록하기
    @Override
    public String registArticle(Article article) {
        // DB에 insert into article values (...)
        articleDao.insertArticle(article);
        return "insert ok..";
    }
}
