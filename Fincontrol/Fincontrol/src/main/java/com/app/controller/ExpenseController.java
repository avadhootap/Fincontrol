package com.app.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Expense;
import com.app.pojos.ExpenseCategoryType;
import com.app.pojos.User;
//import com.app.pojos.Expense;
import com.app.service.ExpenseService;

@RestController
@RequestMapping("/Expense")
public class ExpenseController {
	
	@Autowired
	private ExpenseService expserv;
	
	@GetMapping
	public List<Expense>getAllExpense(){
		return expserv.getAllExpense();
	}
	
	//GetExpenseByDate
	@PostMapping("/getExpByDate")
	List<Expense> getExpByDate(@RequestBody LocalDate date,User user) {
		return expserv.getExpenseByDate(date,user);
	}
	
	@GetMapping("/getExpByAmount")
	public List<Expense>getAllAmount(double amount,User user){
		return expserv.getExpenseByAmount(amount,user);
	}
	
	@PostMapping("/getExpByCategory")
	public List<Expense> getExpenseByCategory(@RequestBody ExpenseCategoryType getcategory, User user) {
		return expserv.getExpenseByCategory(getcategory, user);
	}
	
	@PostMapping
	Expense addExpense(@RequestBody Expense addExpense) {
		return expserv.addExpense(addExpense);
	}
	
	@GetMapping("/getUserExp")
	public List<Expense>getAllUserExp(User user){
		return expserv.getByUser(user);
	}
	
	@DeleteMapping("/{id}")
	String deleteuser(@PathVariable Long id) {
		return expserv.deleteExpense(id);
		
	}
	
	@PutMapping
	Expense updateExpense(@RequestBody Expense updateexp) {
		return expserv.updateExpense(updateexp);
	}
}
