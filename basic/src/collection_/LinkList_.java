package collection_;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList_ {
    public static void main(String[] args) {
        // LinkList 实现了双向连表和双端队列的
        // 线程不安全 没有实现同步

        // 链表改查效率低 增删的效率高
        LinkedList<Number> ll = new LinkedList<Number>();

        ll.add(1);
        ll.add(2);

        // 默认删除第一个
        ll.remove();
        ll.set(0, 99);
        System.out.println(ll);

        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        System.out.println(ll.get(3));

        Iterator it = ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
