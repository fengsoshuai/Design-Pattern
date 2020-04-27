package org.feng.pattern.permission.dao;

import org.feng.pattern.permission.vo.UserVO;

/**
 * 模拟用户数据访问类
 * @author Feng
 */
public class UserDAO {
    /**
     * 获取权限值
     * @param userVO 用户视图对象
     * @return 权限值（0/1）
     */
    public int getPermission(UserVO userVO){
        final String name = "admin";
        final String password = "123456";
        if(name.equals(userVO.getName()) && password.equals(userVO.getPassword())){
            return 1;
        } else {
            return 0;
        }
    }
}
