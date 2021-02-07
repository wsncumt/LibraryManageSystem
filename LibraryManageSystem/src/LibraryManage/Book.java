package LibraryManage;

/**
 * 表示一本书的信息
 * 一本书的基本信息包括
 * 书名、作者、价格、类型、出版信息等
 * 由于出版信息太复杂，这里不写出版社
 */
public class Book {
    private String name;
    private String author;
    private double price;
    private String type;
    private boolean isBorrowed = false;

    public Book(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        String isBorrowing;
        if (isBorrowed == true){
            isBorrowing = "借出";
        }else {
            isBorrowing = "在馆";
        }
        return "书名：《" + name + "》，" +"作者："+ author + "，价格"+ price +
                "元,书籍分类："+ type +"，借阅状态："+ isBorrowing;
    }
}
