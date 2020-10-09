import com.yang.entity.Book;
import com.yang.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

//        bookService.deleteBook(1);

//        int count = bookService.findCount();
//        System.out.println(count);

//        Book one = bookService.findOne(123);
//        System.out.println(one);
//        List<Book> bookList = bookService.queryAll();
//        bookList.forEach(System.out::println);
        List<Object[]> batchArgs= new ArrayList<>();
        Object[] o1 = {200};
        Object[] o2 = {201};
        Object[] o3 = {202};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);
    }
}
