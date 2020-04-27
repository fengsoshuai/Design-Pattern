package org.feng.pattern.permission.impl;

import org.feng.pattern.permission.AbstractUser;

/**
 * 员工类
 * @author Feng
 */
public class Employee extends AbstractUser {
    @Override
    public void otherOperation() {
        System.out.println("员工可以干活！");
    }
}
