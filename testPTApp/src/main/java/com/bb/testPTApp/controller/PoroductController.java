package com.bb.testPTApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import com.bb.testPTApp.model.Product;
import com.bb.testPTApp.service.ProductFactory;
import com.bb.testPTApp.service.ProductService;

//@RestController
//@RequestMapping(path = "api")
@Controller
public class PoroductController {

    private final ProductService productService;
    private final ProductFactory productFactory;

    @Autowired
    public PoroductController(ProductService productService, ProductFactory productFactory) {
        this.productService = productService;
        this.productFactory = productFactory;

    }

    @GetMapping(path = "products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @RequestMapping("/login")
    public String loginMassage() {
        return "login";
    }

    @RequestMapping(path = "/product-list", method = RequestMethod.GET)
    public String listProducts(ModelMap model) {
        model.put("products", productService.getProducts());
        return "list-products";
    }

    @RequestMapping(path = "/add-product", method = RequestMethod.GET)
    public String showAddProductPage(ModelMap model) {
        return "add-product";
    }

    @RequestMapping(path = "/add-product", method = RequestMethod.POST)
    public String addProduct(ModelMap model, @RequestParam String link) {
        Product product = productFactory.scrapeProduct(link);
        productService.addNewProduct(product);
        return "redirect:/product-list"; // redirect to URL, not .jsp
    }

    @RequestMapping(path = "/delete-product", method = RequestMethod.GET)
    public String deleteProduct(@RequestParam Long ID) {
        productService.removeProduct(ID);
        return "redirect:/product-list";
    }

    // @GetMapping
    // public List<Product> getProducts() {
    // return productService.getProducts();
    // }

    // @PostMapping
    // public void addNewProduct(@RequestBody Product product) {
    // productService.addNewProduct(product);
    // }

    // @DeleteMapping(path = "{productId}")
    // public void removeProduct(@PathVariable("productId") Long productId) {
    // productService.removeProduct(productId);

    // }

    // @PutMapping(path = "{productId}")
    // public void updateProduct(@PathVariable("productId") Long productId,
    // @PathVariable(required = false) Double price,
    // @PathVariable(required = false) LocalDateTime lastUpdate) {
    // productService.updateProduct(productId, price, lastUpdate);
    // }
}
