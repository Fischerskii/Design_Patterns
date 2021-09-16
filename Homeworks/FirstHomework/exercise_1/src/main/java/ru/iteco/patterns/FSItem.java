package ru.iteco.patterns;

public interface FSItem {
    String getName();
    void setName();
    String getPath();
    FSItem getParent();
}