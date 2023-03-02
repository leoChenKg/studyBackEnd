package collection_;

import java.util.Vector;

public class Vector_ {
    public static void main(String[] args) {
        // 是线程同步的 ，线程安全的 效率相比 ArrayList 更低，
        // 无参构造初始长度为容量为 10
        Vector<Number> ve = new Vector<Number>();

        ve.add(1);
        ve.add(1);
        ve.add(1);
        ve.add(1);
        ve.add(1);
        ve.add(1);
        ve.add(1);
        ve.add(1);
        ve.add(1);
        ve.add(1);

        // 如果后续容量超过 10 ，就扩容为之前的 2倍
        ve.add(1);

    }
}
