import dao.ICustomer;
import entity.Bean;
import entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class TestBean {
    ApplicationContext context;
    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("bean.xml");
    }
    @Test
    public void getBean(){
        User user=(User) context.getBean("user");
        User user1=(User) context.getBean("user1");
        //spring 默认是单例
        user.talk();
        user1.talk();
    }
    //使用静态工厂方法
    @Test
    public void createBeanByFactory(){
        Bean bean=(Bean) context.getBean("factory");
        bean.test1();
    }
    //测试使用实例工厂类创建对象
    @Test
    public void create1(){
        User bean= context.getBean(User.class);
        System.out.println(bean);
    }

    @Test
    public void testinstancefactory() {
        Bean bean=(Bean) context.getBean("bean");
        bean.test2();

    }
    @Test
    public void testUser(){
        UserService userService=(UserService) context.getBean("userservice");
        userService.addUser();
    }
    @Test
    public void test2(){
        ICustomer icu=(ICustomer)context.getBean("icu");
        icu.havaDinner();
    }
}
