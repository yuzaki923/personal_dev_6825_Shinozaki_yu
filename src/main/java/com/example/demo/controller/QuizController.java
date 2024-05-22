package com.example.demo.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuizController {

	@GetMapping("/quiz1")
	public String quiz(String quiz) {
		Random rand = new Random();
		int dice = rand.nextInt(3);

		switch (dice) {
		case 1:
			return "quiz";

		case 2:
			return "quiz1";

		default:
			return "quiz2";
		}
	}

	@PostMapping("/quiz") //解答なしで送信した場合エラー
	public String quiz(
			@RequestParam("answer") String answer,
			Model model) {
		if (answer.equals("a")) {
			model.addAttribute("message",
					"正解です!買わなきゃよかったリストは<a href='/baditems'>こちら<a>");
		} else {
			model.addAttribute("message", "不正解です");
		}
		return "/quiz";

	}

	@PostMapping("/quiz1") //解答なしで送信した場合エラー
	public String quiz1(
			@RequestParam("answer") String answer,
			Model model) {
		if (answer.equals("b")) {
			model.addAttribute("message", "正解です!買わなきゃよかったリストは<a href='/baditems'>こちら</a>");
		} else {
			model.addAttribute("message", "不正解です");
		}
		return "/quiz1";

	}

	@PostMapping("/quiz2") //解答なしで送信した場合エラー
	public String quiz2(
			@RequestParam("answer") String answer,
			Model model) {
		if (answer.equals("a")) {
			model.addAttribute("message", "正解です!買わなきゃよかったリストは<a href='/baditems'>こちら<a>");
		} else {
			model.addAttribute("message", "不正解です!");
		}
		return "/quiz2";
	}
}