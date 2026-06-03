package ma.fsr.jakartaee.jaxrs.client;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.Response;

public class TestPOST {

	public static void main(String[] args) {
		Sport sport = new Sport(); 
        sport.setNom("squash"); 
        sport.setNombreJoueurs(2); 
        Entity<Form> entitySport =Entity.form(new Form() 
							            .param("nom", sport.getNom()) 
							            .param("nombreJoueurs",  
							            		String.valueOf(sport.getNombreJoueurs()))); 
        Client client = ClientBuilder.newClient(); 
        Response reponse = client.target("http://localhost:8080/ProjetREST/REST/SportsTest") 
        						 .request()
        						 .post(entitySport);
        
        System.out.println(reponse.readEntity(String.class)); 
        
        client.target("http://localhost:8080/ProjetREST/REST/SportsTest").request().put(Entity.json(sport));
	}

}
