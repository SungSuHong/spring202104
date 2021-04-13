package kr.re.kitri.springdemo.model;

import java.util.List;

// immutable (변경불가)
public class Article {
    private long articleNo;
    private String title;
    private String author;
    private String content;
    private List<String> tags;
    private int likes;

    public Article() {}

    public Article(long articleNo, String title, String author, String content, List<String> tags, int likes) {
        this.articleNo = articleNo;
        this.title = title;
        this.author = author;
        this.content = content;
        this.tags = tags;
        this.likes = likes;
    }

    public long getArticleNo() {
        return articleNo;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public List<String> getTags() {
        return tags;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleNo=" + articleNo +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", tags=" + tags +
                ", likes=" + likes +
                '}';
    }
}
