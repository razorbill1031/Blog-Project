package me.kimhejoong.springbootdeveloper.repository;

import me.kimhejoong.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}