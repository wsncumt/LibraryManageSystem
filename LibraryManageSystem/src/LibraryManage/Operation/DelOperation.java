package LibraryManage.Operation;

import LibraryManage.Book;
import LibraryManage.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void operation(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        if(bookList.getSize() == 0){
            System.out.println("系统提示：书库中没有书籍！");
            System.out.println("删除失败！");
            return;
        }
        System.out.println("请输入要删除书籍的名字：");
        String delBook = scanner.next();
        int index = 0;
        for (index = 0; index < bookList.getSize(); index++) {
            if (delBook.equals(bookList.getBook(index).getName())){
                break;
            }
        }
        if (index >= bookList.getSize()){
            //没找到
            System.out.println("系统提示：未找到书籍，请检查书名是否输入正确！");
            return;
        }
        //找到了
        if (index == bookList.getSize() -1){
            //如果是最后一本，直接size--即可
            bookList.setSize(bookList.getSize() - 1);
            System.out.println("系统提示：删除成功！");
            return;
        }
        //如果是中间的，交换最后一本和这一本
        //Book tmpBook = bookList.getBook(index);
        bookList.setBook(index,bookList.getBook(bookList.getSize() - 1));
        bookList.setSize(bookList.getSize() - 1);
        System.out.println("系统提示：删除成功！");
    }
}
