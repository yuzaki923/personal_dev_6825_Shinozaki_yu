package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
	@Query(value = "SELECT d.id,i.name,i.price FROM order_details d INNER JOIN items i ON d.item_id = i.id where d.order_id = :id", nativeQuery = true)
	List<Purchase> findlireki(Integer id);
}
