package com.dhiren.root.designpatterns.factory.websites;

import com.dhiren.root.designpatterns.factory.pages.*;

public class Shopping extends Website {
    @Override
    protected void createWebsite() {
        pageList.add(new HomePage());
        pageList.add(new AboutPage());
        pageList.add(new PaymentPage());
        pageList.add(new CartPage());
        pageList.add(new CheckoutPage());
        pageList.add(new SearchPage());
    }
}
