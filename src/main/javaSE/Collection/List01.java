package Collection;

import java.util.*;
import java.util.List;

@SuppressWarnings("all")
public class List01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book01("java",200.0,"hsp"));
        list.add(new Book01("C语言",1197.0,"hsp"));
        list.add(new Book01("C++20",100.0,"hsp"));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object books = iterator.next();
            System.out.println(books);
        }
        // Collections.sort(list,new Comparator() {
        //     @Override
        //     public int compare(Object o1, Object o2) {
        //         Book01 a = (Book01)o1;
        //         Book01 b = (Book01)o2;
        //         return (int) (b.getPrice() - a.getPrice());
        //     }
        // });
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book01 a = (Book01)o1;
                Book01 b = (Book01)o2;
                return (int) (a.getPrice() - b.getPrice());
            }
        });
        System.out.println("======按价格排序=======");
        for (Object o : list) {
            System.out.println(o + " ");
        }
    }
}
class Book01 {
    private String name;
    private double price;
    private String author;

    public Book01(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return name + "\t\t"
                + price + "\t"
                + author;
    }
}
