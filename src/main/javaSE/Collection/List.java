package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello" + " ");
        }
        System.out.println("=====原list集合=======");
        System.out.println(list);
        System.out.println("=====在二号位插入元素=======");
        list.add(1,"hsp");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.print(next);
        }
        System.out.println(list.get(4));
        list.remove(5);
        System.out.println(list);
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.print(next + " ");
        }
        System.out.println(" ");
        list.set(6,"7");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.print(next + " ");
        }
    }
}
