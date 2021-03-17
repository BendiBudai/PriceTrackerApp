package com.bb.testPTApp.configuration;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import com.bb.testPTApp.model.Product;
import com.bb.testPTApp.repository.ProductRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            Product tv = new Product("MSI GeForce RTX 3090 24GB GDDR6X (RTX 3090 SUPRIM X 24G)", 1099990d, "https://www.arukereso.hu/led-tv-lcd-tv-plazma-tv-c3164/lg/oled55cx3la-p553608180/", LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES));

            Product gpu = new Product("MAG B550 Tomahawk", 54990d, "https://www.arukereso.hu/videokartya-c3142/gigabyte/geforce-rtx-3060-gaming-oc-12gb-gddr6-192bit-gv-n3060gaming-oc-12gd-p642255846/", LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES));
            productRepository.saveAll(List.of(tv, gpu));
        };
    }
}

