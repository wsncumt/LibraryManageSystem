package LibraryManage.Operation;

import LibraryManage.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void operation(BookList bookList) {
        System.out.println("系统提示：程序退出！");
        //通过exit方法就可以直接结束当前程序（结束当前jvm对应的进程）。
        System.exit(0);
    }
}
