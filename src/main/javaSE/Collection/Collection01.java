package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings("all")
public class Collection01 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(new Book("java",200));
        coll.add(new Book("C++",200));

        // Iterator iterator = coll.iterator();
        // while (iterator.hasNext()) {
        //     Object next = iterator.next();
        //     System.out.println(next);
        // }
        for (Object o : coll) {
            System.out.println(o);
        }

    }

}
class Book{
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
