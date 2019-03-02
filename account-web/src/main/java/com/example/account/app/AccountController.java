package com.example.account.app;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.account.domain.model.Account;
import com.example.account.domain.service.AccountService;


@Controller
@RequestMapping("abc")
public class AccountController {

     @Inject
    AccountService accountService;
    
    @ModelAttribute("form")
    public AccountForm setUpForm() {
        AccountForm form = new AccountForm();
        return form;
    }
    
    // Handling request of "/abc/create?form"
    @RequestMapping(value = "create", params = "form")
    public String createForm(AccountForm form, Model model) {
        // omitted
        return "app/createForm";
    }

    // Handling request of "POST /abc/create?confirm"
    @RequestMapping(value = "create", method = RequestMethod.POST, params = "confirm")
    public String createConfirm(@Validated AccountForm form, BindingResult result,
            Model model) {
        if (result.hasErrors()) {
            return createRedo(form, model);
        }
        // omitted
        return "app/createConfirm";
    }

    // Handling request of "POST /abc/create?redo"
    @RequestMapping(value = "create", method = RequestMethod.POST, params = "redo")
    public String createRedo(AccountForm form, Model model) {
        // omitted
        return "app/createForm";
    }

    // Handling request of "POST /abc/create"
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(@Validated AccountForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return createRedo(form, model);
        }
        
        Account account = new Account();
        account.setAddress(form.getAddress());
        account.setBirthDay(form.getBirthDay());
        account.setPhoneNumber(form.getPhoneNumber());
        account.setUserId(form.getUserId());
        account.setUserName(form.getUserName());
        accountService.register(account);
        // omitted
        return "redirect:/abc/create?complete";
    }

    // Handling request of "/abc/create?complete"
    @RequestMapping(value = "create", params = "complete")
    public String createComplete() {
        // omitted
        return "app/createComplete";
    }

}