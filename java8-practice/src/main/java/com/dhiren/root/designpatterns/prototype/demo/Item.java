
package com.dhiren.root.designpatterns.prototype.demo;

public abstract class Item implements Cloneable {
	public String title;
	public String url;
	public double price;

	@Override
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
