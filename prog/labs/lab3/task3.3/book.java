import java.util.ArrayList;;

public class BookStack{

	private ArrayList<Book> books = new ArrayList<>();


	public void push(Book book)
	{
		books.add(book);
	}

	public Book top()
	{
		return books.get(books.size()-1);
	}

	public void pop()
	{
		books.remove(books.size()-1);
	}
}