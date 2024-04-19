package basic07;

import org.springframework.stereotype.Component;


@Component("msgEn")
public class MessageBeanEn implements MessageBean {
	private String name;
	private String age;
	private Outputter outputter;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}
	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}
	
	@Override
	public void sayHello() {
		String msg = "my name is " + name + " and age is " + age ;
		System.out.println(msg);
		
			try {
				outputter.output(msg);

				}catch(Exception e) {
				e.printStackTrace();
				}
		
		
		}
}
