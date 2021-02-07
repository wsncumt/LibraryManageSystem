package LibraryManage.Operation;

import LibraryManage.BookList;

public class DisplayOperation implements IOperation{
    @Override
    public void operation(BookList bookList) {
        //显示书籍列表
        if(bookList.getSize() == 0){
            System.out.println("系统提示：书库中没有书籍");
            return;
        }
        for (int i = 0;i < bookList.getSize(); i++) {
            System.out.print((i + 1) + ".");
            System.out.println(bookList.getBook(i).toString());
        }
    }
}
