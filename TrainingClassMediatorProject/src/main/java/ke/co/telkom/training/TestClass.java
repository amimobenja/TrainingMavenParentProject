package ke.co.telkom.training;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class TestClass extends AbstractMediator { 

	public boolean mediate(MessageContext context) { 
		// TODO Implement your mediation logic here 
		
		System.out.println("Mediator -> "+context.getProperty("xLogTwo"));
		context.setProperty("xLogTwo", "Bye Telkom");
		return true;
	}
}
