package LibraryManage;
/*
*用于存放多本书的信息
*/
public class BookList {
    private final int capacity = 5;
    private Book[] books = new Book[capacity];
    private int size = 0;

    public BookList() {
        books[size++] = new Book("野草","鲁迅",12.5,"诗集");
        books[size++] = new Book("呐喊","鲁迅",13,"小说集");
        books[size++] = new Book("坟","鲁迅",12.5,"杂文集");
    }
    //获取书的信息
    public Book getBook(int index){
        return books[index];
    }

    public void setBook(int index, Book book){
        books[index] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int getCapacity(){
        return capacity;
    }
}
