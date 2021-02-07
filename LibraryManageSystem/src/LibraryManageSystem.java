import LibraryManage.Admin;
import LibraryManage.BookList;
import LibraryManage.NormalUser;
import LibraryManage.User;

import java.util.Scanner;

public class LibraryManageSystem {
    public static void main(String[] args) {
        //1.先准备好书籍的数据
        BookList bookList = new BookList();
        //2.创建用户
        //不关注用户具体是谁
        User user = login();
        //3.进入主循环
        while (true){
            //多态：到底调用哪种方法取决于user实际指向的类型
            int choice = user.menu();
            //根据用户的输入选择执行具体的操作
            user.doOperation(choice,bookList);
        }
    }
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = scanner.next();
        System.out.println("请输入您的角色(0.管理员 1.普通用户)：");
        int who = scanner.nextInt();
        if (who == 0){
            return new Admin(name);
        }
        return new NormalUser(name);
    }
}
