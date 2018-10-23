package com.yph.iterator;

/**
 * 遍历对象{@link BookShelf}的实现可以是数组、也可以是集合
 * 切换实现方式后，当前类无需修改
 */
public class Main {

    public static void main(String[] args) {
        // write your code here

        BookShelf shelf = new BookShelf(10);
        shelf.appendBook(new Book("book-1"));
        shelf.appendBook(new Book("book-2"));
        shelf.appendBook(new Book("book-3"));
        shelf.appendBook(new Book("book-4"));
        shelf.appendBook(new Book("book-5"));
        shelf.appendBook(new Book("book-6"));
        shelf.appendBook(new Book("book-7"));
        shelf.appendBook(new Book("book-8"));
        shelf.appendBook(new Book("book-9"));
        shelf.appendBook(new Book("book-10"));
        shelf.appendBook(new Book("book-11"));
        shelf.appendBook(new Book("book-12"));
        shelf.appendBook(new Book("book-13"));
        shelf.appendBook(new Book("book-14"));

        Iterator<Book> iterator = shelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.toString());
        }
    }
}
