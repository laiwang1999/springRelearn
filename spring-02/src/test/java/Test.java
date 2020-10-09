import com.yang.autowire.Emp;
import com.yang.bean.Orders;
import com.yang.collectionType.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        Course course = context.getBean("myBean", Course.class);
//        System.out.println(course);
        Book book = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book);
        System.out.println(book2);
    }
    @org.junit.Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四部，获取创建bean实例的对象");
        System.out.println(orders);
        //手动销毁bean实例
        context.close();
    }
    @org.junit.Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
