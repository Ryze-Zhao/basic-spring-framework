package com.ryzezhao.example4;

import org.springframework.stereotype.Component;

/**
 * 真实角色
 */
@Component
public class UserServiceImpl implements UserService {
    @Override
    public void select() {System.out.println("UserServiceImpl:::::select");}
    @Override
    public void save() {System.out.println("UserServiceImpl:::::save");}
    @Override
    public void delete() {System.out.println("UserServiceImpl:::::delete");}
    @Override
    public void update() {System.out.println("UserServiceImpl:::::update");}
}
