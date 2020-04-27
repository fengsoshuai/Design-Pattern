package org.feng.pattern.permission;

import lombok.Data;

/**
 * 抽象用户类
 * @author Feng
 */
@Data
public abstract class AbstractUser {
    private String username;
    private String password;
    /**
     * 公用的方法
     */
    public void operation(){
        System.out.println("修改个人资料");
    }

    /**
     * 其他操作
     */
    public abstract void otherOperation();
}
