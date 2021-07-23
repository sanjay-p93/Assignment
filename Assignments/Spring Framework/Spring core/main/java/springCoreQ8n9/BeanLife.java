package springCoreQ8n9;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class BeanLife {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	@PostConstruct
	public void post() {
		System.out.println("this right after construction  ");
	}

	public void getMessage() {
		System.out.println("I got initilized " + message);
	}

	public void init() {
		System.out.println("Bean is initializing.");
	}

	@PreDestroy
	public void pre() {
		System.out.println("this right berfore destroy  ");
	}

	public void destroy() {
		System.out.println("Bean will now be destroyed.");
	}

}
