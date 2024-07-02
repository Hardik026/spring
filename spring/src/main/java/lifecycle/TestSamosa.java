package lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSamosa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycle/config.xml");
		Samosa samosa=(Samosa) context.getBean("s1");
		System.out.println(samosa);
		context.registerShutdownHook();
		
		Pepsi pepsi=(Pepsi) context.getBean("p1");
		System.out.println(pepsi);

	}

}
