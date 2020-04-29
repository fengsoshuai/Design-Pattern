package org.feng.pattern.lol.impl;

import org.feng.pattern.lol.AbstractRoleBuilder;
import org.feng.pattern.lol.Role;
import org.feng.pattern.lol.RoleType;

/**
 * 建造坦克的建造器
 *
 * @author Feng
 * @date 2020/4/29 13:28
 */
public class TankRoleBuilder extends AbstractRoleBuilder {
    @Override
    public void setRoleName() {
        System.out.println("建造坦克的名字！");
        role.setName("诺克萨斯之爪");
    }

    @Override
    public void setRoleSex() {
        System.out.println("建造坦克的性别！");
        role.setSex(Role.Sex.MALE);
    }

    @Override
    public void setRoleCloth() {
        System.out.println("建造坦克的服饰！");
        role.setCloth("红色皮衣");
    }

    @Override
    public void setRoleHair() {
        System.out.println("建造坦克的发型！");
        role.setHair("黑长直");
    }

    @Override
    public void setRoleType() {
        System.out.println("建造坦克的类型！");
        role.setType(RoleType.TANK);
    }

    @Override
    public void setRoleFace() {
        System.out.println("建造坦克的脸型！");
        role.setFace("长方形脸");
    }
}
