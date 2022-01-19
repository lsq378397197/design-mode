package com.behavioral.iterator;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/19 21:56
 */
public class TopicList implements MyList<Topic> {
    private Topic[] topics;

    public TopicList(Topic[] topics) {
        this.topics = topics;
    }

    @Override
    public MyIterator<Topic> iterator() {
        return new TopicIterator(topics);
    }

}
