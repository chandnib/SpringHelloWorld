package SpringHelloWorld1.SpringHelloWorld1;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * @author Parteek
 *
 */
public class GreeterImpl implements Greeter {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Greeter greeter = (Greeter) context.getBean("greeter");
		String greeting = greeter.getGreeting();
	    for(String name : greeter.getNames())
	    	System.out.println(greeting+" from "+ name);
		
	}

    private List<String> names;
    
    private String greeting;

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void setNames(List<String> names) {
		this.names=names;

	}

	public String getGreeting() {
		
		return this.greeting;
	}

	public List<String> getNames() {
		return this.names;
	}
	
	

}
