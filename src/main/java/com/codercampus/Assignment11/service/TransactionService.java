package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> findAll (){
      return  transactionRepository.findAll().stream()
              .sorted(Comparator
              .comparing(Transaction::getDate))
              .collect(Collectors.toList());
        //return transactionRepository.findAll();
    }

    public Optional <Transaction>findById(Long id) {
        return transactionRepository.findById()
                .stream()
                .filter(a->a.getId()
                .equals(id))
                .findFirst();
    }
}
