package collection_;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_ {
    public static void main(String[] args) {
        // HashSet实际上是基于 HashMap 实现的
        // hashset并不是线程安全的
        HashSet<Number> hs = new HashSet<Number>();

        hs.add(1);
        hs.add(1);
        hs.add(1);
        hs.add(2);
        // 输出的结果不会有重复的
        System.out.println(hs);

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("***********************8");
        HashSet_ inst = new HashSet_();
        inst.demo1();

    }

    public void demo1() {
        HashSet set = new HashSet();
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("Rose"));

        set.remove("john");
        System.out.println("set=" + set);

        set = new HashSet();
        System.out.println("set=" + set);

        set.add("lucy");
        set.add("lucy");
        set.add(new Dog("tom"));
        set.add(new Dog("tom"));
        System.out.println("set=" + set);

        set.add(new String("hsp"));
        set.add(new String("hsp")); // 
        System.out.println("set=" + set);
    }
}

class Dog { // 定义了Dog 类
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
