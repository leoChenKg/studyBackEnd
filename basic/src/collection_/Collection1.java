package collection_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Collection1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("jack");
        list1.add(1);
        list1.add('c');
        int[] a = new int[] { 1, 2 };
        list1.add(a);
        list1.remove(a);
        list1.remove(1);
        System.out.println(list1);
        System.out.println(list1.contains(1));
        System.out.println(list1.size());
        System.out.println(list1.isEmpty());
        list1.clear();
        System.out.println(list1);
        ArrayList list2 = new ArrayList();
        list2.add('x');
        list2.add(1);
        list2.add(true);
        list2.add("xx");
        list1.addAll(list2);

        // 迭代器
        Iterator it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // 重置迭代器，从头开始遍历
        it = list1.iterator();
        System.out.println(it.next());
        System.out.println("--------------");

        // 增强for循环
        for (Object item : list1) {
            System.out.println(item);
        }

        // HashMap map = new HashMap();
        // map.put('a', "tom");
        // map.put(1, false);

    }
}
