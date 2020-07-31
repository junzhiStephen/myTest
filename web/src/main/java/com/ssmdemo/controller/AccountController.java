package com.ssmdemo.controller;

import com.ssmdemo.Account;
import com.ssmdemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
   /* @RequestMapping("/findAll")
    public String findAll(){
        List<Account> all = accountService.findAll();
        System.out.println("all = " + all);
        return "success";
    }*/
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        List<Account> list =accountService.findAll();
        modelAndView.addObject("accounts",list);
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping("/insert")
    public String insert(Account account){
        System.out.println("account = " + account);
        accountService.insert(account);
        return "redirect:/account/findAll";
    }

}
