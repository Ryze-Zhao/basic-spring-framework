package com.ryzezhao.example3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Boss {
    private String name;
    private Staff staff;
    private String[] books;
    private List<String> hobbies;
    private Map<String,String> card;
    private Set<String> skill;
    private Integer age;
    private Properties info;
}
