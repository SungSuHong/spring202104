package kr.re.kitri.springdemo.service;

import kr.re.kitri.springdemo.dao.ArticleDao;
import kr.re.kitri.springdemo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 기능 수행 - 트랜잭션 처리
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    // 전체글보기
    @Override
    public List<Article> getAllArticles() {
        // DB에 접근해서 전체 글 데이터를 가져온다.
        // select * from aritlce;
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
