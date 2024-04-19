package basic07;

import org.springframework.stereotype.Component;

import basic05.FileOutputter;

@Component
public class MessageBeanKr implements MessageBean {
	private String name;
	private String age;
	private Outputter outputter;
	
	public MessageBeanKr() {}
	public MessageBeanKr(String name, String age, Outputter outputter) {
		this.name = name;
		this.age = age;
		this.outputter = outputter;
		
	}
		
	public void sayHello() {
			String msg = "나의 이름은 " + name + " 이고 나이는 " + age + " 살 입니다 ";
			System.out.println(msg);
			
			try {
				outputter.output(msg);

				}catch(Exception e) {
				e.printStackTrace();
				}
		
	}
}
