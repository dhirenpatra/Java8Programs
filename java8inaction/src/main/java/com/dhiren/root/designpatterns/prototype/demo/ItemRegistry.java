
package com.dhiren.root.designpatterns.prototype.demo;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {

	private Map<String, Item> items = new HashMap<>();

	public ItemRegistry() {
		loadRegistry();
	}

	public Item createItem(String type) {
		try {
			return (Item) items.get(type)
			        .clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private void loadRegistry() {
		Book book = new Book();
		book.setNoOfPages(122);
		book.setPrice(126.32);
		book.setTitle("Java Design Patterns in Practice");
		book.setUrl("books:url");

		Movie movie = new Movie();
		movie.setDuration(231);
		movie.setTitle("Badla");
		movie.setUrl("movie:url");
        book.setPrice(12.32);

		items.put("movie", movie);
		items.put("book", book);
	}
}
