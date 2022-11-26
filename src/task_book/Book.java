package task_book;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        System.out.println("Введіть назву книги: ");
        Scanner scanner1 = new Scanner(System.in);
        String titleName = scanner1.nextLine();
        System.out.println("Введіть автора книги: ");
        Scanner scanner2 = new Scanner(System.in);
        String authorName = scanner2.nextLine();
        System.out.println("Введіть зміст книги: ");
        Scanner scanner3 = new Scanner(System.in);
        String contentName = scanner3.nextLine();

        title.setTitle(titleName);
        author.setAuthor(authorName);
        content.setContent(contentName);

        System.out.println("Атрибути книги: ");
        title.show();
        author.show();
        content.show();

    }
}
