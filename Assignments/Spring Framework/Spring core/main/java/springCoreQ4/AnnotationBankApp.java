package springCoreQ4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springCoreQ2.QuestionApplication;

@Configuration
@ComponentScan
public class AnnotationBankApp {

	@Bean
	public AnnotationBankAccounts getAnnotationBankAccounts() {
		return new AnnotationBankAccounts();
	}

	@Bean
	public AnnotationBankAccountRepositoryImpl getAnnotationBankAccountRepositoryImpl() {
		return new AnnotationBankAccountRepositoryImpl();
	}

	@Bean
	public AnnotationBankAccountServiceImpl getAnnotationBankAccountServiceImpl() {
		return new AnnotationBankAccountServiceImpl();
	}

	private static Logger LOGGER = LoggerFactory.getLogger(QuestionApplication.class);
	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				AnnotationBankApp.class)) {
			

			AnnotationBankAccountContoller bankAccountContoller = applicationContext.getBean(AnnotationBankAccountContoller.class);

			LOGGER.info("{}", bankAccountContoller);
			LOGGER.info("{}", bankAccountContoller.getBalance(103));
			LOGGER.info("{}", bankAccountContoller.deposit(101, 123));
			LOGGER.info("{}", bankAccountContoller.wihtdraw(101, 124));
			LOGGER.info("{}", bankAccountContoller.fundTransfer(101, 102, 123));

		}

	}

}
