package ru.iteco.patterns.impl;

import ru.iteco.patterns.FSItem;

import java.util.List;

public class Directory implements FSItem {
    List<FSItem> children;
    String name;

    List<FSItem> getChildren() {
        return null;
    }

    boolean isFileSystem() {
        return true;
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
