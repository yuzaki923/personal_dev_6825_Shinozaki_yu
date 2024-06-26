package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Baditems;
import com.example.demo.entity.Item;
import com.example.demo.model.Account;
import com.example.demo.model.Cart;
import com.example.demo.repository.BaditemsRepository;
import com.example.demo.repository.ItemRepository;

@Controller
public class ItemController {

	@Autowired
	Cart cart;

	@Autowired
	ItemRepository itemRepository;

	@Autowired
	Account account;

	@Autowired
	BaditemsRepository baditemsRepository;

	@GetMapping("/items")
	public String index(
			@RequestParam(value = "categoryId", defaultValue = "") Integer categoryId,
			Model model) {

		List<Item> itemList = null;
		if (categoryId == null) {
			itemList = itemRepository.findAll();
		} else {
			itemList = itemRepository.findByCategoryId(categoryId);
		}
		model.addAttribute("items", itemList);

		return "items";

	}

	@GetMapping("/baditems")
	public String bad(
			@RequestParam(value = "categoryId", defaultValue = "") Integer categoryId,
			Model model) {

		List<Baditems> itemList = null;

		itemList = baditemsRepository.findAll();

		model.addAttribute("baditems", itemList);

		return "baditems";

	}

}
