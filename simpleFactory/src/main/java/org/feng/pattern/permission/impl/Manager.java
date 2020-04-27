package org.feng.pattern.permission.impl;

import org.feng.pattern.permission.AbstractUser;

/**
 * 经理
 * @author Feng
 */
public class Manager extends AbstractUser {
    @Override
    public void otherOperation() {
        System.out.println("经理指导员工干活！");
    }
}
