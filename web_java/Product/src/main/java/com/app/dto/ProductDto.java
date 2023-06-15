package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import com.app.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ProductDto {
	@NotBlank(message="Product name can't be blank ")
	private String name  ;
	@NotBlank(message= "product code can't be blank")
	private String productCode ;
	@NotBlank(message= "product code can't be blank")
	private LocalDate manufactureDate ;
	private Category category ;
}
