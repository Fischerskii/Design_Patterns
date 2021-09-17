package ru.iteco.patterns.impl;

import ru.iteco.patterns.FSItem;

public class File implements FSItem {
    String name;

    private File() {
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
