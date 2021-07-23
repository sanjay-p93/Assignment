package springCoreQ3;

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
class BankAppTest {

	@Autowired
	BankAccountContoller bankAccountContoller1;

	@Test
	public void getBlance() {
		assertEquals(100000.0, bankAccountContoller1.getBalance(101), "the methord should get balance");
	}

	@Test
	public void deposit() {
		assertEquals(300123, bankAccountContoller1.deposit(102, 123), "the methord should deposit");
	}

	@Test
	public void wihtdraw() {
		assertEquals(900000, bankAccountContoller1.wihtdraw(103, 100000), "the methord should add wihtdraw");
	}

	@Test
	public void fundTransfer() {
		assertEquals(true, bankAccountContoller1.fundTransfer(104, 105, 123), "the methord should transfer");
	}
}
