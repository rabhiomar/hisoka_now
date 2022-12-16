package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Manga;

public interface MangaRepositorie extends JpaRepository<Manga, Integer> {

}
