
package com.dhiren.root.designpatterns.factory;

import com.dhiren.root.designpatterns.factory.websites.Website;

public class DriverClass {

	public static void main(String[] args) {
		Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.err.println(blog.getPageList());

		Website social = WebsiteFactory.getWebsite(WebsiteType.SOCIAL);
		System.err.println(social.getPageList());

		Website shopping = WebsiteFactory.getWebsite(WebsiteType.SHOPPING);
		System.err.println(shopping.getPageList());
	}

}
