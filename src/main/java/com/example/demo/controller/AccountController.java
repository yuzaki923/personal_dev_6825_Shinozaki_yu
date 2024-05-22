package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Item;
import com.example.demo.model.Account;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ItemRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class AccountController {

	@Autowired
	HttpSession session;

	@Autowired
	Account account;

	@Autowired
	ItemRepository itemRepository;

	@Autowired
	CustomerRepository customerRepository;

	@GetMapping("/login") //ログイン処理
	public String index(Model model) {
		return "/login";
	}

	@GetMapping("/form")
	public String form(Model model) {
		return "/form";
	}

	@PostMapping("/form") //ログイン処理
	public String login(
			@RequestParam(name = "email", defaultValue = "") String email,
			@RequestParam(name = "pass", defaultValue = "") String pass,
			Model model) {

		if (email.length() == 0 || pass.length() == 0) {
			model.addAttribute("message", "入力してください");
			return "form";
		}
		List<Customer> customerList = customerRepository.findByEmailAndPass(email, pass);
		if (customerList == null || customerList.size() == 0) {
			// 存在しなかった場合
			model.addAttribute("message", "メールアドレスもしくはパスワードが一致しませんでした");
			return "form";
		}
		//ここから追加のログイン処理

		Customer customer = customerList.get(0);
		account.setId(customer.getId());//ここでTableからsessionに保存
		account.setName(customer.getName());
		account.setAddress(customer.getAddress());
		account.setTel(customer.getTel());
		account.setEmail(customer.getEmail());
		account.setPass(customer.getPass());

		List<Item> itemList = itemRepository.findAll();

		model.addAttribute("items", itemList);

		return "redirect:/items";

	}

	@GetMapping("/account") //②新規登録画面
	public String createcustomer(Model model) {
		return "/customerAdd";
	}

	@PostMapping("/customerAdd")
	public String store(
			@RequestParam("name") String name, //ここで入力された情報がTableに保存
			@RequestParam("address") String address,
			@RequestParam("tel") String tel,
			@RequestParam("email") String email,
			@RequestParam("pass") String pass,
			Model model) {

		// エラーチェック
		List<String> errorList = new ArrayList<>();
		if (name.length() == 0) {
			errorList.add("名前は必須です");
		}
		if (address.length() == 0) {
			errorList.add("住所は必須です");
		}
		if (address.length() == 0) {
			errorList.add("電話番号は必須です");
		}
		if (email.length() == 0) {
			errorList.add("メールアドレスは必須です");
		}
		// メールアドレス存在チェック
		List<Customer> customerList = customerRepository.findByEmail(email);
		if (customerList != null && customerList.size() > 0) {
			// 登録済みのメールアドレスが存在した場合
			errorList.add("登録済みのメールアドレスです");
		}
		if (pass.length() == 0) {
			errorList.add("パスワードは必須です");
		}

		// エラー発生時はお問い合わせフォームに戻す
		if (errorList.size() > 0) {
			model.addAttribute("errorList", errorList);
			model.addAttribute("name", name);
			model.addAttribute("address", address);
			model.addAttribute("tel", tel);
			model.addAttribute("email", email);
			return "customerAdd";
		}

		Customer customer = new Customer(name, address, tel, email, pass);
		customerRepository.save(customer);
		return "redirect:/form";
	}
}
