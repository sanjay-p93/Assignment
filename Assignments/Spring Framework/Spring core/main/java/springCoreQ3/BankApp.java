package springCoreQ3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springCoreQ2.QuestionApplication;

public class BankApp {

	private static Logger LOGGER = LoggerFactory.getLogger(QuestionApplication.class);
	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			BankAccountContoller bankAccountContoller = applicationContext.getBean(BankAccountContoller.class);

			LOGGER.info("{}", bankAccountContoller);
			LOGGER.info("{}", bankAccountContoller.getBalance(103));
			LOGGER.info("{}", bankAccountContoller.deposit(101, 123));
			LOGGER.info("{}", bankAccountContoller.wihtdraw(101, 124));
			LOGGER.info("{}", bankAccountContoller.fundTransfer(101, 102, 123));

		}

	}

}
