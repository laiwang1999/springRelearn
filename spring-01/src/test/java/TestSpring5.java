import com.yang.Book;
import com.yang.Orders;
import com.yang.User;
import com.yang.bean.Emp;
import com.yang.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void testAdd() {
        //加载spring的配置文件
        BeanFactory applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //传值为xml中的id值
        Orders orders = applicationContext.getBean("orders", Orders.class);
        orders.test();
        //获取配置创建的对象
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();
    }
}
