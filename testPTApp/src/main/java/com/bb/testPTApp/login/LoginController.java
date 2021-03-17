package com.bb.testPTApp.login;

import java.util.List;

import com.bb.testPTApp.model.Product;
import com.bb.testPTApp.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    private final ProductService productService;

    @Autowired
    public LoginController(ProductService productService) {
        this.productService = productService;
    }
  
}
