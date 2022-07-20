package com.ivanfranchin.researchservice.service;

import com.ivanfranchin.researchservice.model.Article;

import java.util.List;

public interface ArticleService {

    List<Article> getAllArticles();

    Article validateAndGetArticle(Long id);

    Article saveArticle(Article article);

    void deleteArticle(Article article);
}
