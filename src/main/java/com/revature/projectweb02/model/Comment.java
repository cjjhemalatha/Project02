package com.revature.projectweb02.model;

import java.time.Instant;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

public class Comment {
	
	@Id
	@GeneratedValue(strategy=IDENTITY)
	private Long id;
	@NotEmpty
	private String text;
	@ManyToOne(fetch=LAZY)
	@JoinColumn(name="postId",referencedColumnName="postId")
	private Post post;
	private Instant createdDate;
	@ManyToOne(fetch=LAZY)
	@JoinColumn(name="userId",referencedColumnName="userId")
	private User user;

}
