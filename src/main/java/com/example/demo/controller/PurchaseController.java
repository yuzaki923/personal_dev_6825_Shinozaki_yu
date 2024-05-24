package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Order;
import com.example.demo.entity.Purchase;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.PurchaseRepository;

@Controller
public class PurchaseController {

	@Autowired
	ItemRepository itemRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	PurchaseRepository purchaseRepository;

	@GetMapping("/PurchaseHistory")
	public String index(
			@RequestParam(value = "categoryId", defaultValue = "") Integer categoryId,
			Model model) {

		List<Order> orderList = null;
		//                      *

		orderList = orderRepository.findAll();
		model.addAttribute("orders", orderList);
		//model.addAttributeとはどういう意味？（""の中身が＄｛｝からのもので、htmlで出力。後者は＊？）

		return "/PurchaseHistory";
	}

	@GetMapping("/ParchaseDetail/{id}")
	public String purchase(@PathVariable("id") Integer id,
			Model model) {

		List<Purchase> lirekiList = purchaseRepository.findlireki(id);
		model.addAttribute("lirekis", lirekiList);
		return "lireki";
	}

}

//findAll()はfindByCategoryId()のような記述の仕方はしない？
//List<Item> itemList = null; はどういう意味？