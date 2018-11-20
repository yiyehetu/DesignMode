package com.yph.design.iterator;

/**
 * 集合接口
 */
public interface Aggregate<T> {

    Iterator<T> iterator();
}
