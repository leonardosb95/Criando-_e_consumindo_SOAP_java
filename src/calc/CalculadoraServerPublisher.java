package calc;
import javax.xml.ws.Endpoint;
		 
public class CalculadoraServerPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		    Endpoint.publish("http://127.0.0.1:9876/calc",new CalculadoraServerImpl());
	
		

	}

}
