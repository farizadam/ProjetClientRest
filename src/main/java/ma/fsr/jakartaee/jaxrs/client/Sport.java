package ma.fsr.jakartaee.jaxrs.client;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;



public class Sport implements Serializable{
	private int identifiant;
	private String nom;
	private int nombreJoueurs;
	private List<Terrain> terrainsCompatibles;
	
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNombreJoueurs() {
		return nombreJoueurs;
	}
	public void setNombreJoueurs(int nombreJoueurs) {
		this.nombreJoueurs = nombreJoueurs;
	}
	
	public List<Terrain> getTerrainsCompatibles() {
		return terrainsCompatibles;
	}
	public void setTerrainsCompatibles(List<Terrain> terrainsCompatibles) {
		this.terrainsCompatibles = terrainsCompatibles;
	}
	public Sport() {
		// TODO Auto-generated constructor stub
	}
	public Sport(String nom, int nombreJoueurs) {
		super();
		this.nom = nom;
		this.nombreJoueurs = nombreJoueurs;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nom, nombreJoueurs);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sport other = (Sport) obj;
		return Objects.equals(nom, other.nom) && nombreJoueurs == other.nombreJoueurs;
	}
	@Override
	public String toString() {
		return "Sport [identifiant=" + identifiant + ", nom=" + nom + ", nombreJoueurs=" + nombreJoueurs + "]";
	}
	
}
