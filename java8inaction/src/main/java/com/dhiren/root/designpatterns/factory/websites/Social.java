
package com.dhiren.root.designpatterns.factory.websites;

import com.dhiren.root.designpatterns.factory.pages.HomePage;
import com.dhiren.root.designpatterns.factory.pages.SearchPage;

public class Social extends Website {
	@Override
	protected void createWebsite() {
		pageList.add(new HomePage());
		pageList.add(new SearchPage());
	}
}
