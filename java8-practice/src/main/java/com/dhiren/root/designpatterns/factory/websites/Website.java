package com.dhiren.root.designpatterns.factory.websites;

import com.dhiren.root.designpatterns.factory.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pageList = new ArrayList<>();

    public List<Page> getPageList() {
        return pageList;
    }

    public Website() {
        this.createWebsite();
    }

    protected abstract void createWebsite();
}
