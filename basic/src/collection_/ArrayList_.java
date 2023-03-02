package collection_;

import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {
        // ArrayList 是线程不安全的，执行效率高
        ArrayList<Number> al = new ArrayList<Number>();
        // 初始时容量为0，第一次执行添加后容量变为10，
        al.add(1);
        // 之后的添加 容量扩展为原来的 1.5 倍
        al.add(2);

    }
}