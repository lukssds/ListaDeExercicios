package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Library;

public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
