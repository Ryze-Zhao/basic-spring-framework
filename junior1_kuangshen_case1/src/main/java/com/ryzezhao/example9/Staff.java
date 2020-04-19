package com.ryzezhao.example9;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
//等价于<bean id="staff" class="com.ryzezhao.example9.Staff"/>
@Component
//bean作用域,默认就是单例

@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Staff {
    //    相当于<property name="name" value="员工"/>,该注解也可用到setter方法中
    @Value("员工")
    private String name;
    //    相当于<property name="age" value="18"/>,该注解也可用到setter方法中
    @Value("18")
    private Integer age;
}
