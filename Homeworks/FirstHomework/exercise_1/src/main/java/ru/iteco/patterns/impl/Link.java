package ru.iteco.patterns.impl;

import ru.iteco.patterns.FSItem;

public class Link implements FSItem {
    private static volatile String name;
    private static volatile FSItem link;

    public Link() {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName() {

    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public FSItem getParent() {
        return null;
    }
}
