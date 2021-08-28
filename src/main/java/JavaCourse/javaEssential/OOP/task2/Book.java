package JavaCourse.javaEssential.OOP.task2;

public class Book {
    public static void main(String[] args) {
    Title title = new Title();
    Author author = new Author();
    Content content = new Content();

    title.setTitle("War and Peace");
    author.setAuthor("lev Tolstoy");
    content.setContent("4 volumes");

    title.show();
    author.show();
    content.show();


    }
}
