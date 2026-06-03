package ma.fsr.jakartaee.jaxrs.client;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Response;

public class TestPOSTJSON {

	public static void main(String[] args) {
		Sport sport = new Sport(); 
        sport.setNom("squash"); 
        sport.setNombreJoueurs(2); 
        
        Client client = ClientBuilder.newClient(); 
        Response reponse = client.target("http://localhost:8080/ProjetREST/REST/SportsTest")
        						 .request()
        						 .post(Entity.json(sport));
        
        System.out.println(reponse.readEntity(String.class));      
	}

}
