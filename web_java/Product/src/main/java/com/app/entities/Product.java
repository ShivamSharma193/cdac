package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "products")
@ToString
public class Product extends BaseEntity{

	@Column(length=30, nullable=false)
	@Min(value = 1)
	
	private String name  ;
	@Column(unique = true , nullable = false)
	private String productCode ;
	@Column(nullable=false)
	@Min(value = 10)
	private LocalDate manufactureDate ;
	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	private Category category ;
}







