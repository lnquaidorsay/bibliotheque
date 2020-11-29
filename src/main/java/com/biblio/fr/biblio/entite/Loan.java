package com.biblio.fr.biblio.entite;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "LOAN")
public class Loan implements Serializable {
	private static final long serialVersionUID = 144293603488149743L;

	private LoanId pk = new LoanId();

	private LocalDate beginDate;

	private LocalDate endDate;

	private LoanStatus status;

	@EmbeddedId
	public LoanId getPk() {
		return pk;
	}

	public void setPk(LoanId pk) {
		this.pk = pk;
	}

	@Column(name = "BEGIN_DATE", nullable = false)
	public LocalDate getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}

	@Column(name = "END_DATE", nullable = false)
	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS")
	public LoanStatus getStatus() {
		return status;
	}

	public void setStatus(LoanStatus status) {
		this.status = status;
	}
}
