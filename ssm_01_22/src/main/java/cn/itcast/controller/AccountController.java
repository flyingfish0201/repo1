package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import cn.itcast.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Account> list = accountService.findAll();
        ModelAndView view = new ModelAndView();
        view.addObject("list",list);
        view.setViewName("list");

        return view;
    }
    @RequestMapping("/testAjax")
public @ResponseBody Account testAjax(@RequestBody Account account){
        return account;
}


}
