package pack.qualy_pro.models;
// Generated 11 janv. 2017 14:16:40 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Prix generated by hbm2java
 */
public class Prix implements java.io.Serializable {

	private int idPrix;
	private Produit produit;
	private Date dateAttribution;
	private Integer pu;
	private Boolean promotion;
	private Integer crevient;
	private String description;

	public Prix() {
	}

	public Prix(int idPrix) {
		this.idPrix = idPrix;
	}

	public Prix(int idPrix, Produit produit, Date dateAttribution, Integer pu,
			Boolean promotion, Integer crevient, String description) {
		this.idPrix = idPrix;
		this.produit = produit;
		this.dateAttribution = dateAttribution;
		this.pu = pu;
		this.promotion = promotion;
		this.crevient = crevient;
		this.description = description;
	}

	public int getIdPrix() {
		return this.idPrix;
	}

	public void setIdPrix(int idPrix) {
		this.idPrix = idPrix;
	}

	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Date getDateAttribution() {
		return this.dateAttribution;
	}

	public void setDateAttribution(Date dateAttribution) {
		this.dateAttribution = dateAttribution;
	}

	public Integer getPu() {
		return this.pu;
	}

	public void setPu(Integer pu) {
		this.pu = pu;
	}

	public Boolean getPromotion() {
		return this.promotion;
	}

	public void setPromotion(Boolean promotion) {
		this.promotion = promotion;
	}

	public Integer getCrevient() {
		return this.crevient;
	}

	public void setCrevient(Integer crevient) {
		this.crevient = crevient;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}