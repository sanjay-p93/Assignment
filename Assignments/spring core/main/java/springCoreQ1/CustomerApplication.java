package springCoreQ1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;



//@Configuration
//@ComponentScan
public class CustomerApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(CustomerApplication.class);

	public static void main(String[] args) {

// 		//spring-core configuration
//		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
//				CustomerApplication.class)) {

		// XML based configuration
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
		
			Customer customer = applicationContext.getBean(Customer.class);

			customer.getDetails();
		}


	}

}
