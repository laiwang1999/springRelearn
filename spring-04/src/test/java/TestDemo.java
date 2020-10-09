import com.yang.aopanno.User;
import com.yang.aopxml.Book;
import com.yang.config.MyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
