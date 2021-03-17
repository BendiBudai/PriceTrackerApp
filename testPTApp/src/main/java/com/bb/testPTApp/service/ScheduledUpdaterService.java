package com.bb.testPTApp.service;

import java.util.List;

import com.bb.testPTApp.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledUpdaterService {

    @Autowired
    private final ProductRepository productRepository;

    public ScheduledUpdaterService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // TODO update Products in db at a fix rate
    //check if price change -> update Entiy in db
    @Scheduled(fixedRate = 1000)
    public void scheduleFixedDelayTask() {
        System.out.println("Fixed delay task - " + System.currentTimeMillis() / 1000);
    }
}
