import java.util.ArrayList;
import java.util.Arrays;

public class Library
{
    ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book)
    {
        books.add(book);
    }

    public void findByAuthor(String author)
    {
        for (Book book : books)
        {
            if(book.author.equals(author))
            {
                System.out.println(book.title);
                System.out.println(book.author);
                System.out.println(book.year);
            }
        }
    }

    public void findByYear(int year)
    {
        for (Book book : books)
        {
            if(book.year == year)
            {
                System.out.println(book.title);
                System.out.println(book.author);
                System.out.println(book.year);
            }
        }
    }
}
