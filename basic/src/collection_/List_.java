package collection_;

import java.io.Console;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<Number>();
        list.add(1);
        list.add(2);
        list.add(3);
        // 索引为1的位置加上值99
        list.add(1, 99);
        System.out.println(list.get(1));

        ArrayList<Number> list2 = new ArrayList<Number>();
        list2.add(10);
        list2.add(11);
        list2.add(13);
        list2.add(99);
        list2.add(2);

        // 从位置1 开始加入 list2的元素
        list.addAll(1, list2);
        System.out.println(list);

        // 99 第一次出现的索引位置
        System.out.println(list.indexOf(99));
        // 最后一个 99 出现的索引位置
        System.out.println(list.lastIndexOf(99));

        list.remove(0);
        System.out.println(list);

        // 删除所有在 list2中有的值
        list.removeAll(list2);
        System.out.println(list);

        // 不能超过长度范围
        list.set(0, 100);
        System.out.println(list);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        List<Number> subList = list.subList(1, 3);
        System.out.println(subList);

        // 三种遍历方式
        System.out.println("********************");
        for (Object i : list) {
            System.out.println(i);
        }

        System.out.println("********************");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("********************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
