package ru.skypro.hw9;

public class Main {


    public static void main(String[] args) {
        Book();
        Author();

    }

    public static void Book() {
        Book book  = new Book("It", Author(), 1986);
        System.out.println("book.title = " + book.getTitle());
        System.out.println("book.yearOfPublication = " + book.getYearOfPublication());
        book.setYearOfPublication(1987);
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());


    }

    public static  Author Author() {
        Author author = new Author("Stephen ", "King");
        System.out.println("author.name = " + author.getName() + author.getSurname());

        return author;
    }
}
