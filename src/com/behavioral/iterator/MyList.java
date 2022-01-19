package com.behavioral.iterator;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/19 21:45
 */
public interface MyList<E> {
    MyIterator<E> iterator();
}
