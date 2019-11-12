package com.dhiren.root.designpatterns.factory;

import com.dhiren.root.designpatterns.factory.websites.Blog;
import com.dhiren.root.designpatterns.factory.websites.Shopping;
import com.dhiren.root.designpatterns.factory.websites.Social;
import com.dhiren.root.designpatterns.factory.websites.Website;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType type) {
        switch (type) {
            case BLOG:
                return new Blog();
            case SOCIAL:
                return new Social();
            case SHOPPING:
                return new Shopping();
            default:
                return null;
        }
    }

}
