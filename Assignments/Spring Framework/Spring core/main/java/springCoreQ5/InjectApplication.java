package springCoreQ5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class InjectApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(InjectApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				InjectApplication.class)) {
		
		SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

		LOGGER.info("{}     dao-{}", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());
	}

	}

}
