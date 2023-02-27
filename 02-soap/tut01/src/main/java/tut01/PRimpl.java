package tut01;
import jakarta.jws.WebService;

@WebService(endpointInterface = "tut01.PR")
public class PRimpl implements PR {

	public String req(int request) {
		if(request == -1) {
			return "Payment not possible";
		} else {
			return "Payment is getting processed";
		}
	}

}
