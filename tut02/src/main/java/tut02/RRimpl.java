package tut02;
import jakarta.jws.WebService;

@WebService(endpointInterface = "tut02.RR")
public class RRimpl implements RR {

	public String regReq(boolean receipt) {
		if(receipt) {
			return "Confirmed";
		} else {
			return "Denied";
		}
	}

}
