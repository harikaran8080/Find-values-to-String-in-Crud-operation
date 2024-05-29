package com.StringNameUse.String.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "StringUse")
@Data
@NoArgsConstructor
public class StringUse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name ="name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "department")
	private String department;

}
