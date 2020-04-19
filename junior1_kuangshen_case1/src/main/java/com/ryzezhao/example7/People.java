package com.ryzezhao.example7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    private String name;
    private Dog dog;
    private Cat cat;
}
