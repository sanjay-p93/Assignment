package springCoreQ2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class QuestionApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(QuestionApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
		
			Question question = applicationContext.getBean(Question.class);
			question.dispaly();

		}

	}

}
