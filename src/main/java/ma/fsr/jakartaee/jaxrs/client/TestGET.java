package ma.fsr.jakartaee.jaxrs.client;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.Response;

public class TestGET {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient(); 
        Response reponse =  client.target("http://localhost:8080/ProjetREST/REST/SportsTest") 
                       //client.target("http://localhost:8080/ProjetREST/REST/Sports/ExportCSV")
							        .request() 
							        .get(); 
        System.out.println(reponse.readEntity(String.class)); 

	}

}
