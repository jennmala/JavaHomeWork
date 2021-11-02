package com.pb.malakhova.hw5;

public class Reader {
    private String name;
    private String libraryCard;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader (String name, String libraryCard, String faculty, String dateOfBirth, String phoneNumber) {
        this(name, libraryCard, faculty);
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public Reader (String name, String libraryCard, String faculty) {
        this.name = name;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
    }

    public String getInfo() {
        return "ФИО: " + name + ", номер читательского билета: " + libraryCard + ", факультет: "
                + faculty + ", дата рождения: " + dateOfBirth + ", телефон: " + phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(name + " взял " + numberOfBooks + " книги");
    }

    public void takeBook(String... names) {
        System.out.println(this.name + " взял книги:");
        for (String name : names) {
            System.out.println("- " + name);
        }
    }

    public void takeBook(Book... book) {
        System.out.println(this.name + " взял книги:");
        for (int i=0; i<book.length; i++) {
            System.out.println("- " + book[i].getInfo());
        }
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(name + " вернул " + numberOfBooks + " книги");
    }

    public void returnBook(String... names) {
        System.out.println(this.name + " вернул книги:");
        for (String name : names) {
            System.out.println("- " + name);
        }
    }

    public void returnBook(Book... book) {
        System.out.println(this.name + " вернул книги:");
        for (int i=0; i<book.length; i++) {
            System.out.println("- " + book[i].getInfo());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(String libraryCard) {
        this.libraryCard = libraryCard;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

