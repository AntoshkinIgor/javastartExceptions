package com.javastart.exceptions;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //List <Account> accountList = new ArrayList<>();
        AccountRepository accountRepository = AccountRepository.getInstance();
        //AccountRepository.getInstance();
        Account account = new Account(1L,"Lori",10000);
        Account account1 = new Account(2L,"Lori",20000);
        Account account2 = new Account(3L,"Lori",30000);
        System.out.println(accountRepository);

        accountRepository.add(account);
        accountRepository.add(account1);
        accountRepository.add(account2);
        System.out.println(accountRepository);
        try {
            accountRepository.getById(2L);
        } catch (AccountNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
