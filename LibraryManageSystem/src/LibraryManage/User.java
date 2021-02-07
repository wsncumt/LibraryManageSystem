package LibraryManage;

import LibraryManage.Operation.IOperation;

abstract public class User {
    protected String name;
    protected IOperation[] operations;
    //用来打印该用户的菜单
    //不同用户支持的操作不一样，菜单类容不一样，左乘抽象方法，由子类重写具体实现
    public User(String name){
        this.name = name;
    }
    public abstract int menu();

    public void doOperation(int choice,BookList bookList){
        this.operations[choice - 1].operation(bookList);
    }
}
