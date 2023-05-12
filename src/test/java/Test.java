import dependency_injection.Beans.Clazz;
import dependency_injection.Beans.ProgrammingLanguage;
import dependency_injection.Beans.Student;
import dependency_injection.Service.OrderService;
import dependency_injection.Service.Service;
import dependency_injection.jdbc.MyDataSource;
import dependency_injection.jdbc.MyDataSource1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.logging.SimpleFormatter;

public class Test {
    @org.junit.Test
    public void TestSpringLoadConfig(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config1.xml");
        Object userBean = applicationContext.getBean("user");
        System.out.println(userBean);

        Date time = applicationContext.getBean("time", Date.class);
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = simpleFormatter.format(time);
        System.out.println(strTime);
    }

    @org.junit.Test
    public void setDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di.xml");
        Service service = applicationContext.getBean("service",Service.class);
        service.saveUser();
    }
    @org.junit.Test
    public void orderService(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setDi.xml");
        OrderService orderService = applicationContext.getBean("orderServiceBean",OrderService.class);
        orderService.generate();
    }

    @org.junit.Test
    public void testDataSource(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dataSourceConfig.xml");
        MyDataSource myDataSource = applicationContext.getBean("dataSource",MyDataSource.class);
        System.out.println(myDataSource);

    }

    @org.junit.Test
    public void testCascadeProperties(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cascadeProperties.xml");
        Student student = applicationContext.getBean("student",Student.class);
        Clazz clazz = applicationContext.getBean("clazz",Clazz.class);
        System.out.println(student);
        System.out.println(clazz);
    }
    @org.junit.Test
    public void testProgrammingLanguage(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setArrayDI.xml");
        ProgrammingLanguage programmingLanguage = applicationContext.getBean("pl", ProgrammingLanguage.class);
        System.out.println(programmingLanguage);
        Map<String, Integer> map = programmingLanguage.getRating();
        System.out.println(map.get("python")+1);
    }

    @org.junit.Test
    public void testUtilNamespace(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("utilNamespace.xml");
        MyDataSource1 myDataSource1 = applicationContext.getBean("ds1",MyDataSource1.class);
        System.out.println(myDataSource1);
    }

    @org.junit.Test
    public void testAutowire(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire.xml");
        OrderService orderService = applicationContext.getBean("orderService",OrderService.class);
        orderService.generate();
    }
}
