package springCoreQ8n9;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BeanApplication {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
		
			BeanLife bean = applicationContext.getBean(BeanLife.class);
			bean.getMessage();
			applicationContext.registerShutdownHook();

		}

	}

}
