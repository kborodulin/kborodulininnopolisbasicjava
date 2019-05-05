package ru.kborodulin.task7.lombok;

/**
 * test lombok
 */
public class AppBook {
    public static void main(String[] args) {
        Book1 b1 = new Book1();
        b1.setId(20);
        System.out.println(b1.getId());
        System.out.println(b1.toString());

        Book2 b2 = new Book2();
        b2.setId(30);
        System.out.println(b2.getId());

        Book3 b3 = new Book3();
        System.out.println(b3.getId());
        System.out.println(b3.getAuthor());

        Book4 b4 = new Book4("Test12345");
        System.out.println(b4.getName());
    }
}