package com.app.service;

import java.util.List;

import com.app.pojos.Expense;

//import com.app.pojos.Expense;

public interface ExpenseService {
	
    List<Expense>getAllExpense();
	
	Expense addExpense(Expense addExpense);
	
	String deleteExpense(Long id);
	
	Expense updateExpense(Expense updateExp);

}
