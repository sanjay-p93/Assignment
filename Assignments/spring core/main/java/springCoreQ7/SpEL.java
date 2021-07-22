package springCoreQ7;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpEL {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();

		Expression exp = parser.parseExpression("'SPEL'");
		String message = (String) exp.getValue();
		System.out.println(message);

		exp = parser.parseExpression("'SPEL'.concat(' test')");
		message = (String) exp.getValue();
		System.out.println(message);

	}

}
