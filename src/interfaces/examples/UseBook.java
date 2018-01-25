package interfaces.examples;

import main.java.packages.interfaces.bookpack.*;

// Use the Book Class from bookpack.
class UseBook {
    public static void main(String args[]) {
        Book books[] = new Book [5];

        books[0] = new main.java.packages.interfaces.bookpack.Book("Java: A Beginner's Guide",
                "Schildt", 2014);
        books[1] = new main.java.packages.interfaces.bookpack.Book("Java: The Complete Reference",
                "Schildt", 2014);
        books[2] = new main.java.packages.interfaces.bookpack.Book("The Art of Java",
                "Schildt and Holmes", 2003);
        books[3] = new main.java.packages.interfaces.bookpack.Book("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new main.java.packages.interfaces.bookpack.Book("On the Road",
                "Kerouac", 1955);

        for(int i=0; i < books.length; i++) books[i].show();
    }
}