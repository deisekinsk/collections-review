package list;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    private List<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int yearPubli){
        Book book = new Book(title,author,yearPubli);
        bookList.add(book);
    }

    public List<Book> getBookByAuthor(String author){

        List<Book> bookByAuthor = new ArrayList<>();

        for(int i = 0; i<bookList.size();i++){
            Book book = bookList.get(i);

            if(book.getAuthor().toLowerCase().contains(author.toLowerCase())){
                //local variable
                bookByAuthor.add(book);
            }
        }
        return bookByAuthor;
    }

    public List<Book> getRangeOfYears(int startYear, int endYear){
        List<Book> bookByYear = new ArrayList<>();
        for(int i =0; i<bookList.size(); i++){
            Book book = bookList.get(i);

            if(book.getYearPubli() >= startYear && book.getYearPubli() <= endYear) {
                bookByYear.add(book);
                }
            }
            return bookByYear;
    }


    public List<Book> getBookByTitle(String title){

        List<Book> bookByTitle = new ArrayList<>();

        for(int i = 0; i<bookList.size();i++){
            Book book = bookList.get(i);

            if(book.getTitle().toLowerCase().contains(title.toLowerCase())){
                //local variable
                bookByTitle.add(book);
            }
        }
        return bookByTitle;
    }



}

