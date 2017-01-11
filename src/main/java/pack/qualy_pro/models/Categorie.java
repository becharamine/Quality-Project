package pack.qualy_pro.models;
// Generated 11 janv. 2017 14:16:40 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Categorie generated by hbm2java
 */
public class Categorie implements java.io.Serializable {

	private int idCategorie;
	private String nomCategorie;
	private Set<Produit> produits = new HashSet<Produit>(0);

	public Categorie() {
	}

	public Categorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public Categorie(int idCategorie, String nomCategorie, Set<Produit> produits) {
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.produits = produits;
	}

	public int getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return this.nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public Set<Produit> getProduits() {
		return this.produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

}
