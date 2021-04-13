package kr.re.kitri.springdemo.controller;

import kr.re.kitri.springdemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    // 전체보기
    @GetMapping("/articles")
    public String viewAllArticles() {
        return articleService.getAllArticles();
    }

    // 글쓰기
    @PostMapping("/articles")
    public String registArticle() {
        return articleService.registArticle();
    }

}
