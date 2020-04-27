package org.feng.pattern.permission;

import org.feng.pattern.permission.impl.Employee;
import org.feng.pattern.permission.impl.Manager;

import java.util.Optional;

/**
 * 用户工厂类
 * @author Feng
 */
public class UserFactory {
    /**
     * 通过 permission 权限值获取对应的用户实例
     * @param permission 权限值（0=员工，1=经理）
     * @return Optional<AbstractUser>
     */
    public static Optional<AbstractUser> getUser(int permission){
        if(0 == permission){
            return Optional.of(new Employee());
        }

        if(1 == permission){
            return Optional.of(new Manager());
        }

        return Optional.empty();
    }
}
