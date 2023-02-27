package tut01;

@jakarta.jws.WebService
public interface PR {
	@jakarta.jws.WebMethod
    public String req(int request);
}
