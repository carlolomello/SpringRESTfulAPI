package com.restful.tutorial.entity.contact_key;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContactKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7699047239283212700L;
	
	@Column(name = "kind")
	private String kind;
	@Column(name = "value")
	private String value;
	@Column(name = "cf")
	private String cf;
	
	public ContactKey() {
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}
	
}
