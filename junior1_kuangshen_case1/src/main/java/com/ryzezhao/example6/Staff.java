package com.ryzezhao.example6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

//这里不能用lombok的@Data注解，因为该注解会重写hasCode方法，导致观察不出prototype的区别。
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    private String name;
    private Integer age;
}
