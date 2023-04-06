package Object.Easy.Homework;

public class homework03_Book {
    public static void main(String[] args) {
        Book book = new Book();
        int bookPrice = 160;
        int price = book.updatePrice(bookPrice);
        System.out.println(price);
    }
}
class Book{
    public int updatePrice(int price){
        if (price > 150){
            price = 150;
        }else {
            price = 100;
        }
        return price;
    }
}
