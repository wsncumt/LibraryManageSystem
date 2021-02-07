package LibraryManage;

import LibraryManage.Operation.*;

import java.util.Scanner;

public class Admin extends User{
    public Admin(String name) {
        super(name);
        this.operations = new IOperation[]{
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
                new ExitOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("===================================================");
        System.out.println(this.name + "您好!" + "欢迎使用图书管理系统~");
        System.out.println("1.查阅书籍信息");
        System.out.println("2.新增书籍信息");
        System.out.println("3.删除书籍信息");
        System.out.println("4.打印书籍列表");
        System.out.println("5.退出系统");
        System.out.println("===================================================");
        System.out.println("请输入您的选择(1、2、3、4、5):>");
        Scanner scanner = new Scanner(System.in);
        int choice = 5;
        try{
        choice = scanner.nextInt();
        }catch(Exception e){
            System.out.println("请输入1~5之间的数字：");
            choice = scanner.nextInt();
        }
        return choice;
    }


}
