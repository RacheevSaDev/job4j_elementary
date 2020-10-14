package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book ball = new Book("Колобок", 5);
        Book cleanCode = new Book("Clean code", 1853);
        Book gameOfThrones = new Book("Game of thrones", 3567);
        Book greenBook = new Book("Green book", 1000);
        Book[] books = {ball, cleanCode, gameOfThrones, greenBook};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i].toString());
            }
        }
    }
}
