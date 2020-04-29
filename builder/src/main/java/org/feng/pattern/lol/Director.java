package org.feng.pattern.lol;

/**
 * 组装者
 *
 * @author Feng
 * @date 2020/4/29 13:35
 */
public class Director {
    private AbstractRoleBuilder roleBuilder;

    public Director(AbstractRoleBuilder roleBuilder) {
        this.roleBuilder = roleBuilder;
    }

    public void setRoleBuilder(AbstractRoleBuilder roleBuilder) {
        this.roleBuilder = roleBuilder;
    }

    public Role construct(){
        roleBuilder.setRoleType();
        roleBuilder.setRoleCloth();
        roleBuilder.setRoleFace();
        roleBuilder.setRoleHair();
        roleBuilder.setRoleName();
        roleBuilder.setRoleSex();

        return roleBuilder.getRole();
    }
}
