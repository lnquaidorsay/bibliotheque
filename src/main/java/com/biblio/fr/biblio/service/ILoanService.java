package com.biblio.fr.biblio.service;

import java.time.LocalDate;
import java.util.List;

import com.biblio.fr.biblio.entite.Loan;
import com.biblio.fr.biblio.entite.LoanStatus;
import com.biblio.fr.biblio.entite.SimpleLoanDTO;

public interface ILoanService {
	public List<Loan> findAllLoansByEndDateBefore(LocalDate maxEndDate);

	public List<Loan> getAllOpenLoansOfThisCustomer(String email, LoanStatus status);

	public Loan getOpenedLoan(SimpleLoanDTO simpleLoanDTO);

	public boolean checkIfLoanExists(SimpleLoanDTO simpleLoanDTO);

	public Loan saveLoan(Loan loan);

	public void closeLoan(Loan loan);
}
