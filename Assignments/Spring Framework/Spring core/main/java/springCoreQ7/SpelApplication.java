package springCoreQ7;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpelApplication {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
		
			SpelObj obj1 = applicationContext.getBean(SpelObj.class);
			obj1.dispaly();

		}

	}

}
