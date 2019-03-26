package last2_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import last2_2.Book;

public class Library {

	Book[] books;
	int booksAdded;

	public Library ( int size )
	{
		books = new Book[size];
		booksAdded = 0;
	}

	public void addBook ( Book book ) 
	{
		if(booksAdded < books.length) 
		{
			books[booksAdded++] = book;
		}
		else
		{
			System.out.println("The library is full");
		}

	}

	public void printLibrary ()
	{
		for(int j=0;j<books.length;j++) 
		{
			System.out.println(books[j]);
		}

	}

	public void searchAuthor(String author)
	{
		System.out.println("Search library for books by " + author);
		for(int j=0;j<books.length;j++) 
		{
			if(!author.isEmpty() && author.equalsIgnoreCase(books[j].getAuthor()))
			{
				System.out.println(books[j]);
			}
		}
	}

	public void searchTitle(String title) 
	{
		System.out.println("Search library for books titled " + title);
		for(int j=0;j<books.length;j++) 
		{
			if(!title.isEmpty() && title.equalsIgnoreCase(books[j].getTitle()))
			{
				System.out.println(books[j]);
			}
		}
	}

    public void searchYear(int year)
	{
    	System.out.println("Search library for books published in " + year);
    	for(int j=0;j<books.length;j++) 
		{
			if(year == books[j].getYear())
			{
				System.out.println(books[j]);
			}
		}
    }

    public void sort () 
	{
    	Collections.sort(Arrays.asList(books), new Comparator<Book>() 
		{
			@Override
			public int compare(Book b1, Book b2) 
			{
				if(b1.getAuthor().compareTo(b2.getAuthor()) < 0) 
				{
					return -1;
				}
				else if(b1.getAuthor().compareTo(b2.getAuthor()) > 0) 
				{
					return 1;
				}
				else 
				{
				if(b1.getTitle().compareTo(b2.getTitle()) < 0) 
				{
					return -1;
				}
				else if(b1.getTitle().compareTo(b2.getTitle()) > 0) 
				{
					return 1;
				}
				else 
				{
					return Integer.compare(b1.getYear(), b2.getYear());
				}
				}
		}});
    }

}
