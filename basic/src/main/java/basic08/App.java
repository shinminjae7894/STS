package basic08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext ctx;
	
    public static void main( String[] args ){
    	
    	
    	/*
    	MessageBeanImpl bean = new MessageBeanImpl();
    	FileOutputter outputter = new FileOutputter();
    	outputter.setFilePath("C:\\Users\\user\\Desktop\\BackEnd\\SpringWork\\greeting5.txt");
    	bean.setOutputter(outputter);
    	bean.setName("홍길동");
    	bean.setAge(20);
    	
    	bean.sayHello();
    	*/
    	
    	ctx = new ClassPathXmlApplicationContext("config/basic08_config.xml");
    	
    	MessageBean bean = ctx.getBean("messageBean", MessageBean.class);
    	bean.sayHello();
    	
    }
}
