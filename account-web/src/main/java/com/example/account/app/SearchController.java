package com.example.account.app;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.account.domain.repository.SearchCondition;
import com.example.account.domain.service.AccountService;

//AccountService accountService;

//@ModelAttribute("searchform")



@Controller
@RequestMapping("abc")
public class SearchController {

    @Autowired
    private Mapper mapper;

    @Autowired
    private AccountService accountService;

    @GetMapping
    public String find(@Validated SearchForm form, BindingResult bindingResult,
            @PageableDefault Pageable pageable, Model model) {

        if (bindingResult.hasErrors()) {
            return "app/searchList";
        }

        SearchCondition condition = mapper.map(form, SearchCondition.class);
        model.addAttribute("page", accountService.getAccountByCriteria(condition, pageable));
        return "app/searchList";
    }
}