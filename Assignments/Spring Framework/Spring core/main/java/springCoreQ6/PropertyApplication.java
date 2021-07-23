package springCoreQ6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class PropertyApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				PropertyApplication.class)) {
		
			PropertyService obj1 = applicationContext.getBean(PropertyService.class);
			System.out.println(obj1.returnSerivce());

		}

	}

}
