package springCoreQ2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
@SpringBootTest
class QuestionApplicationTest {

	@Autowired
	Question question1;

	@Test
	public void testAnswerSet() {
		List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Orange", "Banana"));
		assertArrayEquals(fruits.toArray(), question1.getAnswerList().toArray());
	}
}
