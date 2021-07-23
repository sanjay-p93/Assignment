package springCoreQ10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ContextAwareApp {
	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ContextAwareApp.class)) {

			ApplicationContextAwareComponent contextAwareComponent = (ApplicationContextAwareComponent) applicationContext
					.getBean(ApplicationContextAwareComponent.class);
			// getting context from component
			ApplicationContext appContext = contextAwareComponent.getContext();
			SomeComponet someComponetBean = (SomeComponet) appContext.getBean(SomeComponet.class);

			someComponetBean.memberMethod();

			applicationContext.registerShutdownHook();
		}
	}
}