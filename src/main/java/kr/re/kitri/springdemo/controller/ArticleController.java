package kr.re.kitri.springdemo.controller;

import kr.re.kitri.springdemo.model.Article;
import kr.re.kitri.springdemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    // 전체보기
    @GetMapping("/articles")
    public List<Article> viewAllArticles() {
        return articleService.getAllArticles();
    }

    // 글쓰기
    @PostMapping("/articles")
    public String registArticle(@RequestBody Article article) {
        return articleService.registArticle(article);
    }

    @GetMapping("/articles/{articleId}")
    public Article viewArticleDetailByArticleId(@PathVariable long articleId) {
        return articleService.getArticleByArticleId(articleId);
    }

}
