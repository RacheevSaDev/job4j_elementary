package ru.job4j.pojo;

public class Book {
    private String name;
    private int pagesNum;

    public Book(String name, int pagesNum) {
        this.name = name;
        this.pagesNum = pagesNum;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", pagesNum=" + pagesNum + '}';
    }
}
