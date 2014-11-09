package com.ficus.dictionary.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="entrycategory")
public class Entrycategory {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String description;
	
	@OneToMany(mappedBy="entrycategory")
	private List<Entry> entries;
}
