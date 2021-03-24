package com.lionhuynh.spring5restwebflux.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Vendor {

    @Id
    private Long id;
    private String firstname;
    private String lastname;
}
