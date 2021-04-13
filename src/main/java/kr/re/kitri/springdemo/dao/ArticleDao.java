package kr.re.kitri.springdemo.dao;

import org.springframework.stereotype.Repository;

// article 테이블에 매핑되는 클래스
// CRUD 작업
@Repository
public class ArticleDao {
    // 모든 글 조회
    public String selectAllArticles() {
        // query 수행... later..
        return "모든 글입니다. from dao..";
    }
}
