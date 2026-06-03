package ma.fsr.jakartaee.jaxrs.client;

import java.util.List;


import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class TestGETJSON {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient(); 
        Response reponse =  client.target("http://localhost:8080/ProjetREST/REST/SportsTest") 
							        .request() 
							        .header("Accept", MediaType.APPLICATION_JSON)
							        .get(); 
        List<Sport> sports = reponse.readEntity(new GenericType<List<Sport>>() {});
        sports.forEach(s->System.out.println(s));  
	}
}
