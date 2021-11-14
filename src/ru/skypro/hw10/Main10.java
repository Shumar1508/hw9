package ru.skypro.hw10;

public class Main10 {

    public static void main(String[] args) {
        System.out.println("AUTOR");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author alexanderPushkin = new Author("Alexandr", "Pushkin");
        System.out.println("stephenKing.equals() = " + stephenKing.equals(stephenKing2));
        System.out.println("stephenKing.hashCode() = " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("alexanderPushkin.equals() = " + alexanderPushkin.equals(stephenKing));
        System.out.println("alexanderPushkin.hashCode() = " + (alexanderPushkin.hashCode() == stephenKing.hashCode()));

        System.out.println("BOOK");
        Book it = new Book("It", stephenKing, 1986 );
        Book it2 = new Book("It",stephenKing, 1986);
        Book ruslanAndLyudmila = new Book("Ruslan And Lyudmila",alexanderPushkin,1820);
        System.out.println("it.equals() = " + it.equals(it2));
        System.out.println("it.hashCode() = " + (it.hashCode() == it2.hashCode()));
        System.out.println("ruslanAndLyudmila.equals() = " + ruslanAndLyudmila.equals(it));
        System.out.println("ruslanAndLyudmila.hashCode() = " + (ruslanAndLyudmila.hashCode() == it.hashCode()));

    }
}
