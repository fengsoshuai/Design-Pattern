package org.feng.pattern.permission;

import org.feng.pattern.permission.dao.UserDAO;
import org.feng.pattern.permission.vo.UserVO;

import java.util.Optional;

/**
 * 权限工厂测试
 * @author Feng
 */
public class Client {
    public static void main(String[] args) {
        // 创建用户视图
        UserVO userVO = new UserVO();
        userVO.setName("admin");
        userVO.setPassword("123456");

        UserDAO userDAO = new UserDAO();
        // 获取权限值
        int permission = userDAO.getPermission(userVO);
        // 通过权限值获得用户对象实例
        Optional<AbstractUser> user = UserFactory.getUser(permission);
        // 当用户对象不为空，调用 AbstractUser.otherOperation() 方法
        user.ifPresent(AbstractUser::otherOperation);
    }
}
