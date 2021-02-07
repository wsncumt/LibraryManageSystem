package LibraryManage.Operation;

import LibraryManage.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void operation(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("系统提示：借阅书籍！");
        System.out.println("请输入要借阅的书籍名称：");
        String borrowBook = scanner.next();
        int index = 0;
        for (index = 0; index < bookList.getSize(); index++) {
            if (bookList.getBook(index).getName().equals(borrowBook)){
                break;
            }
        }
        if (index >= bookList.getSize()){
            System.out.println("未找到书籍，请检查名称是否有误！");
            return;
        }
        if (bookList.getBook(index).getIsBorrowed()){
            System.out.println("系统提示：该书已借出！无法借阅。");
            System.out.println("借阅失败！");
            return;
        }
        bookList.getBook(index).setBorrowed(true);
        System.out.println("系统提示：借阅成功，请在规定时间归还！");
    }
}
