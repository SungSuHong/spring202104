package kr.re.kitri.springdemo.dao;

import kr.re.kitri.springdemo.model.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

// article 테이블에 매핑되는 클래스
// CRUD 작업
@Repository
public class ArticleDao {
    // 모든 글 조회
    public List<Article> selectAllArticles() {
        // query 수행... later..
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
    public String insertArticle() {
        return "글쓰기가 완료되었습니다. from dao";
    }
}
