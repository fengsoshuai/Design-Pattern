package org.feng.pattern.lol;

/**
 * 抽象的角色建造器
 *
 * @author Feng
 * @date 2020/4/29 13:23
 */
public abstract class AbstractRoleBuilder {
    protected Role role;

    public AbstractRoleBuilder() {
        this.role = new Role();
    }

    public abstract void setRoleName();
    public abstract void setRoleSex();
    public abstract void setRoleCloth();
    public abstract void setRoleHair();
    public abstract void setRoleType();
    public abstract void setRoleFace();

    public Role getRole(){
        return role;
    }
}
