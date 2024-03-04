package com.cis.batch33.library.controller;

import com.cis.batch33.library.model.CheckoutDTO;
import com.cis.batch33.library.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {

    @Autowired
    private CheckoutService checkoutService;

    @GetMapping("/{id}")
    public CheckoutDTO getCheckout(@PathVariable int id){
        return checkoutService.getCheckout(id);
    }

    @GetMapping
    public List<CheckoutDTO> getAllCheckouts(){
        return checkoutService.getAllCheckouts();
    }
    @PostMapping
    public CheckoutDTO createCheckout(@RequestBody CheckoutDTO checkoutDTO){
        return checkoutService.createCheckout(checkoutDTO);
    }

    @PutMapping("/{id}")
    public CheckoutDTO updateCheckout(@PathVariable int id, @RequestBody CheckoutDTO checkoutDTO){
        // Set the memberId for the member object to be updated
        return checkoutService.updateCheckout(id,checkoutDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCheckout(@PathVariable int id){
        checkoutService.deleteCheckout(id);
    }
}