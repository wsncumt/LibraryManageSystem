package LibraryManage.Operation;
import LibraryManage.Book;
import LibraryManage.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{

    @Override
    public void operation(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("系统提示书：新增书籍！");
        if (bookList.getSize() < bookList.getCapacity()) {
            System.out.println("请输入书籍的名称：");
            String name = scanner.next();
            System.out.println("请输入书籍的作者：");
            String author = scanner.next();
            System.out.println("请输入书籍的价格：");
            double price = scanner.nextDouble();
            System.out.println("请输入书籍的分类：");
            String type = scanner.next();
            Book newBook = new Book(name,author,price,type);
            bookList.setBook(bookList.getSize(), newBook);
            bookList.setSize(bookList.getSize() + 1);
            System.out.println("系统提示：添加成功！");
        }else{
            System.out.println("系统提示：空间已满，请删除部分书籍后再进行添加！");
            System.out.println("添加失败!");
        }
    }
}
