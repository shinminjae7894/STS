package basic07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import basic05.Outputter;

@Configuration
public class ApplicationContextConfigure {
	private FileOutputter outputter;
	
	@Bean
	public MessageBean getMessageKr() throws Exception{
		outputter = new FileOutputter();
		outputter.setFilePath("C:\\Users\\user\\Desktop\\BackEnd\\SpringWork\\greeting3.txt");
		outputter.output("홍길동");
		MessageBeanKr kr = new MessageBeanKr("홍길동","40", outputter);
		return kr;
	}
	
	@Bean
	public MessageBean getMessageEn() throws Exception{
		outputter = new FileOutputter();
		outputter.setFilePath("C:\\Users\\user\\Desktop\\BackEnd\\SpringWork\\greeting4.txt");
		MessageBeanEn en = new MessageBeanEn();
		en.setAge("30");
		en.setName("Tom");
		en.setOutputter(outputter);
		return en;
	}

	
}
