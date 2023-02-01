package unit09.inheritance.day35.constructorreview;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Cracking the SDET interview");
        TextBook tb = new TextBook("OOP with JAVA", "Computer Science");
        Novel novel = new Novel("Harry Potter","Fantastic");

        System.out.println(novel.getName() + " is written in "+novel.getGenre()+" genre.");
    }
}
