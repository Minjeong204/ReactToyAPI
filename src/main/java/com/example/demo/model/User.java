package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "test_nana0813_User")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Column(name = "USER_NM")
	private String name;

	@Id
	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "pw")
	private String pw;

	@Column(name = "REGI_USER")
	private String regiUser;

	@Column(name = "REGI_DT")
	private LocalDateTime regiDt;

	@Column(name = "UPDA_DT")
	private LocalDateTime updaDt;

	@Column(name = "UPDA_USER")
	private String updaUser;

	@Column(name = "USE_YN")
	private String useYn;

	

}
