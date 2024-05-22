package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import com.example.demo.entity.Item;

@Component
@SessionScope
public class Cart {

	private List<Item> itemList = new ArrayList<>();

	public List<Item> getItems() {
		return itemList;
	}

	public int getTotalPrice() {
		// 合計金額
		int total = 0;
		for (Item item : itemList) {
			total += item.getPrice() * item.getQuantity();
		}
		return total;
	}

	// カート追加
	public void add(Item newItem) {
		Item existsItem = null;
		// 現在のカートの商品から同一IDの商品を探す
		for (Item item : itemList) {
			if (item.getId() == newItem.getId()) {
				existsItem = item;
				break;
			}
		}

		// カート内に商品が存在しなかった場合はカート追加
		// 存在した場合は、個数の更新を行う
		if (existsItem == null) {
			itemList.add(newItem);
		} else {
			existsItem.setQuantity(
					existsItem.getQuantity() + newItem.getQuantity());
		}
	}

	// カートから商品を削除
	public void delete(int itemId) {
		// 現在のカートの商品から同一IDの商品を探す
		for (Item item : itemList) {
			// 対象の商品IDが見つかった場合削除する
			if (item.getId() == itemId) {
				itemList.remove(item);
				break;
			}
		}

	}

	public void clear() {
		//		itemList = new ArrayList<>();
		itemList.clear();
	}
}
