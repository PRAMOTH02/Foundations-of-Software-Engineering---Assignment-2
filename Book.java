public class Book
{
    private String author;
    private String title;
    private int year;

    public Book (String author, String title, int year) {

        this.author=author;
        this.title=title;
        this.year=year;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getYear(){
        return year;
    }

    public boolean equals(Book other)
     {
       return (p1.this.author.equals(other.author)) && (p1.this.title.equals(other.title)) && (p1.this.year==other.year);
     }

    public String toString()
    {
      return  author +": "+ title + "("+year+")";
    }
}
