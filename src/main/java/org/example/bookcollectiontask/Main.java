package org.example.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Micul Print", "Author 1");
        Book book2 = new Book("De la idei la bani", "Napoleon Hill");
        Book book3 = new Book("Contele de monte Cristo", "Alexandr D.");

        Library library001 = new Library("Carturesti Mall");
        Library library002 = new Library("Fat Frumos");

        library001.addBook(book1);
        library001.addBook(book1);
        library001.addBook(book1);

        System.out.println(library001.getTotalNumberOfBooks());
        System.out.println(library002.getTotalNumberOfBooks());

        library002.addBook(book1);
        library002.addBook(book2);
        library002.addBook(book3);
        library002.addBooksFromAnotherList(library001.bookList);

        library002.removeBookFromTheStock(book2);

        System.out.println(library002.getTotalNumberOfBooks());

        library002.displayTheBookTitles();

        Map<String, Library> reteauaDeLibrarii = new HashMap<>();

        reteauaDeLibrarii.put("Arborilor 22/1", library001);
        reteauaDeLibrarii.put("Stefan cel Mare 143", library002);

        reteauaDeLibrarii.get("Arborilor 22/1").displayTheBookTitles();
        reteauaDeLibrarii.get("Stefan cel Mare 143").displayTheBookTitles();

        int[] integers = new int[5];
        integers[0] = 3;
        integers[1] = 7;
        integers[2] = 8;
        integers[3] = 3424;
        integers[4] = 21;
        System.out.println(integers.length);
        System.out.println(IntNumberArrayService.maxIntFromArray(integers));
        System.out.println(IntNumberArrayService.arithmeticAverage(integers));

    }
}
