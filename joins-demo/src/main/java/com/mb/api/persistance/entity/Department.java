package com.mb.api.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "department")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department
{
	@Id
	private Integer deptId;
	
	@Column(name = "department_code")
	private String code;
	
	@Column(name = "department_note")
	private String note;
	
}
