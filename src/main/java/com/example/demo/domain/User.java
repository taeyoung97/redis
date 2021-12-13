package com.example.demo.domain;



import java.io.Serializable;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
	@Id
    private String id;
    private String name;
    private Long salary;
}