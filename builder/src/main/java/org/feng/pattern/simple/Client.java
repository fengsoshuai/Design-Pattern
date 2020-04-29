package org.feng.pattern.simple;

import java.time.LocalDate;

/**
 * 用户建造者的测试
 *
 * @author Feng
 * @date 2020/4/29 13:56
 */
public class Client {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setName("小冯")
                .setAge(25)
                .setAddress("北京")
                .setBirthday(LocalDate.of(2008, 10, 1))
                .setHobbies(new String[]{"唱","跳","Rap","篮球"})
                .setInfo("暂无")
                .build();

        // User{name='小冯', hobbies=[唱, 跳, Rap, 篮球], age=25, address='北京', birthday=2008-10-01, info='暂无'}
        System.out.println(user);
    }
}
