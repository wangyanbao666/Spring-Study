import BeanInstantiation.Star;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryTest {
    @Test
    public void testBeanFactory(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean factory.xml");
        Star star = applicationContext.getBean("starBean",Star.class);
        Star star2 = applicationContext.getBean("starBean",Star.class);

    }
}
