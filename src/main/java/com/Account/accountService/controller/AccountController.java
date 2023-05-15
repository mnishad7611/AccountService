package com.Account.accountService.controller;
import com.Account.accountService.model.Account;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping("/account")
	public Account getAccount(){
		Account acc =new Account("Monika","011","00000");
		return acc;

	}
	@GetMapping("/accounts")
	public List<Account> getAccounts(){
		
		List<Account> accList= new ArrayList<Account>();
		Account acc = new Account("Dheeraj","102","00001");
		Account acc1 = new Account("Payal","102","00001");

		accList.add(acc);
		accList.add(acc1);
		accList.add(new Account("Mom","102","00001"));
		return accList;
	}

	
}
