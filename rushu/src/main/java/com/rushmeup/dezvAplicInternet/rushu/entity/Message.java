package com.rushmeup.dezvAplicInternet.rushu.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long 		id;	
	@NotNull
	private String 		content;
	@ManyToOne(cascade=CascadeType.ALL)  
	@NotNull
	private Conversation conversation;
	private LocalDate 	sendTime;
	private LocalDate 	receiveTime;
	private LocalDate 	readTime;
}
