package com.behavioral.iterator;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/19 21:42
 */
public interface MyIterator<E> {
    /**
     * 重置为第一个元素
     */
    void reset();

    /**
     * 获取下一个元素
     */
    E next();

    /**
     * 检索当前元素
     *
     */
    E currentItem();

    boolean hasNext();


}
