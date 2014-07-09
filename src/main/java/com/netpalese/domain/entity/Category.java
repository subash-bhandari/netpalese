package com.netpalese.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
@NamedQueries(value = {
		@NamedQuery(name = "getCategoryByName", query = "select c from Category c where c.category=:name"),
		@NamedQuery(name = "getCategoriesByNames", query = "select c from Category c where c.category in (:names)")})
public class Category extends AbstractEntity {	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String category;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="category")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
