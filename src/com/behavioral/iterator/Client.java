package com.behavioral.iterator;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/19 22:00
 */
public class Client {
    public static void main(String[] args) {
        Topic[] topics = new Topic[5];
        topics[0] = new Topic("topic1");
        topics[1] = new Topic("topic2");
        topics[2] = new Topic("topic3");
        topics[3] = new Topic("topic4");
        topics[4] = new Topic("topic5");

        MyList<Topic> list = new TopicList(topics);
        MyIterator<Topic> iterator = list.iterator();
        while (iterator.hasNext()) {
            Topic currentTopic = iterator.next();
            System.out.println(currentTopic.getName());
        }
    }
}
