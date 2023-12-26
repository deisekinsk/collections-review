//searchOperation
package listCollections;

public class Book {

    private String title;
    private String author;
    private int yearPubli;

    public Book(String title, String author, int yearPubli){
        this.title = title;
        this.author = author;
        this.yearPubli = yearPubli;
    }

    public String getTitle(){
        return  title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearPubli(){
        return yearPubli;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "\uD83D\uDCD5'" + title + '\'' +
                " \uD83C\uDFFF'" + author + '\'' +
                " \uD83D\uDCC5 " + yearPubli +
                '}';
    }
}
