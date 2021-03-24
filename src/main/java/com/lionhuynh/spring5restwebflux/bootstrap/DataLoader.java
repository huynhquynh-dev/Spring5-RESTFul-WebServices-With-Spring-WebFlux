package com.lionhuynh.spring5restwebflux.bootstrap;

import com.lionhuynh.spring5restwebflux.model.Category;
import com.lionhuynh.spring5restwebflux.model.Vendor;
import com.lionhuynh.spring5restwebflux.repositories.CategoryRepository;
import com.lionhuynh.spring5restwebflux.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final VendorRepository vendorRepository;

    public DataLoader(CategoryRepository categoryRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) {

        if(categoryRepository.count().block() == 0) {
            //load data
            System.out.println("#### LOADING DATA ON BOOTSTRAP #####");

            categoryRepository.save(Category.builder().description("Spring").build()).block();

            categoryRepository.save(Category.builder().description("Nuts").build()).block();

            categoryRepository.save(Category.builder().description("Breads").build()).block();

            categoryRepository.save(Category.builder().description("Meats").build()).block();

            categoryRepository.save(Category.builder().description("Eggs").build()).block();

            System.out.println("Loaded Categories: " + categoryRepository.count().block());

            vendorRepository.save(Vendor.builder().firstName("Joe").lastName("Buck").build()).block();

            vendorRepository.save(Vendor.builder().firstName("Micheal").lastName("Weston").build()).block();

            vendorRepository.save(Vendor.builder().firstName("Jessie").lastName("Waters").build()).block();

            vendorRepository.save(Vendor.builder().firstName("Bill").lastName("Nershi").build()).block();

            vendorRepository.save(Vendor.builder().firstName("Jimmy").lastName("Buffett").build()).block();

            System.out.println("Loaded Vendors: " + vendorRepository.count().block());
        }
    }
}
