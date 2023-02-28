package collection_;

import java.util.ArrayList;
import java.util.HashMap;

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
        ArrayList list2
        list1.addAll();

        // HashMap map = new HashMap();
        // map.put('a', "tom");
        // map.put(1, false);

    }
}
