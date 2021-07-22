package springCoreQ1;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
@SpringBootTest
class CoustomerApplicationTest {

	@Autowired
	Customer customer1;

	@Test
	public void testBasicScenario() {

		assertAll(

				() -> assertEquals("John", customer1.getCustomerName()),
				() -> assertEquals(123, customer1.getCustomerId()),
				() -> assertEquals(987654321, customer1.getCustomerContact()),
				() -> assertEquals("street2", customer1.getCustomerAddress().getStreet()),
				() -> assertEquals("Cochin", customer1.getCustomerAddress().getCity()),
				() -> assertEquals("Kerala", customer1.getCustomerAddress().getState()),
				() -> assertEquals("India", customer1.getCustomerAddress().getCountry()),
				() -> assertEquals(683678, customer1.getCustomerAddress().getZip()));
	}

}
