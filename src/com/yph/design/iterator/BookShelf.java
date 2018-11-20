package com.yph.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 书架类
 * 如果BookShelf简单粗暴的实现Iterator接口，易造成职责不清晰
 */
public class BookShelf implements Aggregate<Book> {
    private List<Book> books;

    public BookShelf(int size) {
        books = new ArrayList<>(size);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
