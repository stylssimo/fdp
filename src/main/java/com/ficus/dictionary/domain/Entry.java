package com.ficus.dictionary.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="entry")
public class Entry {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Long parent_id;
	
	private String word;
	
	private String description;
	
	private String pronounciation;
	
	private String hansa;
	
	private String audio;
	
	private String language;
	
	private Date created;
	
	private Date updated;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne 
	@JoinColumn(name="entrycategory_id")
	Entrycategory entrycategory;
	

}
