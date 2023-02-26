package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Expense;
//import com.app.pojos.Expense;
import com.app.repository.ExpenseRepo;

@Service
@Transactional
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	private ExpenseRepo exprepo;

	@Override
	public List<Expense> getAllExpense() {
		return exprepo.findAll();
	}

	@Override
	public Expense addExpense(Expense addExpense) {
		return exprepo.save(addExpense);
	}

	@Override
	public String deleteExpense(Long id) {
		if(exprepo.existsById(id)){
			exprepo.deleteById(id);
			return "Expense Deleted Sucessfullyy...";
		}
		return "Deletion Failed";
	}

	@Override
	public Expense updateExpense(Expense updateExp) {
		if(exprepo.existsById(updateExp.getExpenseid())) {
		return exprepo.save(updateExp);
	}
	return null;
	}
	
	

}
