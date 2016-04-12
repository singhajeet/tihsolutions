/**
 * 
 */
package com.tihs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author ajeet
 *
 */
@Entity
@Table(name = "service")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Service implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	
	@Column(name = "service_name")
	private String serviceName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image_url")
	private String imageURL;
	
	@Column(name = "visiting_charges")
	private String visitingCharges;
	
	@Column(name = "min_charges")
	private String minimumCharges;
	
	@Column(name = "max_charges")
	private String maximumCharges;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the imageURL
	 */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * @param imageURL the imageURL to set
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	/**
	 * @return the visitingCharges
	 */
	public String getVisitingCharges() {
		return visitingCharges;
	}

	/**
	 * @param visitingCharges the visitingCharges to set
	 */
	public void setVisitingCharges(String visitingCharges) {
		this.visitingCharges = visitingCharges;
	}

	/**
	 * @return the minimumCharges
	 */
	public String getMinimumCharges() {
		return minimumCharges;
	}

	/**
	 * @param minimumCharges the minimumCharges to set
	 */
	public void setMinimumCharges(String minimumCharges) {
		this.minimumCharges = minimumCharges;
	}

	/**
	 * @return the maximumCharges
	 */
	public String getMaximumCharges() {
		return maximumCharges;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Service [id=" + id + ", serviceName=" + serviceName
				+ ", description=" + description + ", imageURL=" + imageURL
				+ ", visitingCharges=" + visitingCharges + ", minimumCharges="
				+ minimumCharges + ", maximumCharges=" + maximumCharges + "]";
	}

	/**
	 * @param maximumCharges the maximumCharges to set
	 */
	public void setMaximumCharges(String maximumCharges) {
		this.maximumCharges = maximumCharges;
	}
	
	

}
