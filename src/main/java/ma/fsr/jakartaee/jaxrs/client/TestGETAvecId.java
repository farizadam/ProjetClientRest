package ma.fsr.jakartaee.jaxrs.client;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.Response;

public class TestGETAvecId  
{ 
    public static void main(String[] args)  
    { 
        Client client = ClientBuilder.newClient(); 
        int idSport=10; 
        Response reponse = client.target("http://localhost:8080/ProjetREST/REST/SportsTest") 
        .path(String.valueOf(idSport)) 
        .request() 
        .get(); 
        System.out.println(reponse.readEntity(String.class)); 
    } 
}

