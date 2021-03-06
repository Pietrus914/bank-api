package com.example.Bankaccount.controller;


import com.example.Bankaccount.model.Exchange;
import com.example.Bankaccount.model.UserAccount;
import com.example.Bankaccount.service.ExchangeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExchangeController {

    private ExchangeService exchangeService;

    public ExchangeController(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }

    @PostMapping("/transfer-to-usd")
    Exchange getPlnTransaction(@RequestBody Exchange newTransaction) {
        return exchangeService.transactionPln(newTransaction);
    }

    @PostMapping("/transfer-to-pln")
    Exchange getUsdTransaction(@RequestBody Exchange newTransaction) {
        return exchangeService.transactionUsd(newTransaction);
    }
}
