package com.wkrzywiec.spring.libraryrest.model;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class ErrorRespond {
	
	private String status;
	
	private String message;
	
	private String details;
}
