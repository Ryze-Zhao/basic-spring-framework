package com.ryzezhao.example8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog {
    @Autowired
    @Qualifier(value = "dogName")
    private String name;
}
