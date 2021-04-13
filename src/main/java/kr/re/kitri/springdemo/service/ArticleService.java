package kr.re.kitri.springdemo.service;

import kr.re.kitri.springdemo.model.Article;

import java.util.List;

public interface ArticleService {

    String registArticle(Article article);
    List<Article> getAllArticles();
}
