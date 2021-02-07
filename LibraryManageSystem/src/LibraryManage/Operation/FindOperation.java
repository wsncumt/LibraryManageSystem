package LibraryManage.Operation;

import LibraryManage.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void operation(BookList bookList) {
        if (bookList.getSize() == 0){
            System.out.println("系统提示：书库中没有书籍！");
            System.out.println("查找失败");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("系统提示：查找书籍！");
        System.out.println("请输入要查找的书籍名称：");
        String findBook = scanner.next();
        int index = 0;
        int sum = 0;
        for ( index = 0; index < bookList.getSize(); index++) {
            if (bookList.getBook(index).getName().contains(findBook)){
                sum++;
                System.out.println(bookList.getBook(index).toString());
            }
        }
        System.out.println("系统提示：共找到 " + sum + " 本书。");
        if (sum == 0){
            System.out.println("系统提示：未找到相关书籍，请检查书名是否输入正确！");
        }
    }
}
