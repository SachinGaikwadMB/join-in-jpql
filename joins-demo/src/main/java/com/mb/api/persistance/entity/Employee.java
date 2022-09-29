package com.mb.api.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "employee")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee
{

	@Id
	private Integer employeeId;
	
	@Column(name = "employee_name")
	private String name;
	
	@Column(name = "employee_salry")
	private Double salary;
	
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department department;

}
