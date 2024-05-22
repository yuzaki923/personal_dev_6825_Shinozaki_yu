package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Baditems;

public interface BaditemsRepository extends JpaRepository<Baditems, Integer> {

}
