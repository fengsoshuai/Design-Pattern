package org.feng.pattern.lol;

import lombok.Data;

/**
 * 游戏角色类
 *
 * @author Feng
 * @date 2020/4/29 13:15
 */
@Data
public class Role {
    /**角色名*/
    private String name;
    /**角色类型*/
    private RoleType type;
    /**性别*/
    private Sex sex;
    /**脸型*/
    private String face;
    /**服饰*/
    private String cloth;
    /**发型*/
    private String hair;

    /**
     * 枚举性别
     */
    public enum  Sex{
        /**男*/
        MALE,
        /**女*/
        FEMALE
    }
}
