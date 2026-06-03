package ma.fsr.jakartaee.jaxrs.client;

import java.io.IOException;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;

@Provider 
public class RequestClient implements ClientRequestFilter  
{ 
    @Override 
    public void filter(ClientRequestContext requestContext) throws IOException  
    { 
        System.out.println("Une requête va être envoyée"); 
    } 
    
    public static void main(String[] args)  
    { 
        Client client = ClientBuilder.newClient(); 
        Response reponse = client.target("http://localhost:8080/ProjetREST/REST/SportsTest") 
						            .register(RequestClient.class) 
						            .request() 
						            .get(); 
        System.out.println(reponse.readEntity(String.class)); 
    }

}

