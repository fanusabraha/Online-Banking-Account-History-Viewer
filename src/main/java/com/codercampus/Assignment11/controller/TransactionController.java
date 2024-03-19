package com.codercampus.Assignment11.controller;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    @GetMapping("/transactions")
    public String getTransaction (ModelMap model){
        List<Transaction> payments = transactionService.findAll();
    model.put("transactions",payments);
    return "transactions";}

    @GetMapping("/transactions/{transactionId}")
    public String getTransactionId (ModelMap modelId, @PathVariable Long transactionId){
    Optional<Transaction> specificId = transactionService.findById(transactionId);

        if (specificId.isPresent()) {
            Transaction transaction = specificId.get();
            modelId.addAttribute("transaction", transaction);
        }
        return "detail";}
}
