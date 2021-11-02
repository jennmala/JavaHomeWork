package com.pb.malakhova.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Приключения", "Иванов И. И.", "2000 г.");
        Book book2 = new Book("Словарь", "Сидоров А. В ", "1980 г.");
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", "2010 г.");

        Reader reader1 = new Reader("Петров В. В.", "11111145", "economy faculty",
                "11.11.1999 г.", "0980010020");
        Reader reader2 = new Reader("Лебедев А. А.", "11113378", "faculty of foreign languages");
        Reader reader3 = new Reader("Голубев К. К.", "11111890", "economy faculty");


        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());

        System.out.println(reader1.getInfo());
        System.out.println(reader2.getInfo());
        System.out.println(reader3.getInfo());


        reader1.takeBook(3);

        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");

        reader2.takeBook(book1, book2, book3);


        reader3.returnBook(2);

        reader1.returnBook("Приключения", "Энциклопедия");

        reader2.returnBook(book1, book2);

    }
}
