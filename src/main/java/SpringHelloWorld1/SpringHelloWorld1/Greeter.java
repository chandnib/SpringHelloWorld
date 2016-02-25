package SpringHelloWorld1.SpringHelloWorld1;
import java.util.List;

/**
 * 
 */

/**
 * @author Parteek
 *
 */
public interface Greeter {
			void setNames(List<String> names); // names of the authors
			List<String> getNames();
			String getGreeting();

}
