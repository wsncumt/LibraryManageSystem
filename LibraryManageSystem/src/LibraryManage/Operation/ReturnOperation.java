package LibraryManage.Operation;

import LibraryManage.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void operation(BookList bookList) {
        System.out.println("系统提示：还书！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要还的书籍名称：");
        String returnBook = scanner.next();
        int index = 0;
        for (index = 0; index < bookList.getSize(); index++) {
            if (bookList.getBook(index).getName().equals(returnBook)){
                break;
            }
        }
        if (index >= bookList.getSize()){
            System.out.println("未找到书籍，请检查名称是否有误！");
            return;
        }
        if (!bookList.getBook(index).getIsBorrowed()){
            System.out.println("系统提示：该书已归还！");
            System.out.println("还书失败！");
            return;
        }
        bookList.getBook(index).setBorrowed(false);
        System.out.println("系统提示：还书成功！");
    }
}
