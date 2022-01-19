package com.behavioral.iterator;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/19 21:50
 */
public class TopicIterator implements MyIterator<Topic>{
    private Topic[] topics;
    private int position;

    public TopicIterator(Topic[] topics) {
        this.topics = topics;
        this.position = 0;
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public Topic next() {
        return topics[position++];
    }

    @Override
    public Topic currentItem() {
        return topics[position];
    }

    @Override
    public boolean hasNext() {
        return position < topics.length;
    }
}
