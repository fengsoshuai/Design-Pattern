package org.feng.pattern.simple;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * 简化建造对象的过程；
 * 这是一个用户类
 *
 * @author Feng
 * @date 2020/4/29 13:46
 */
@Getter
public class User {
    /**名字*/
    private final String name;
    /**爱好*/
    private final String[] hobbies;
    /**年龄*/
    private final Integer age;
    /**地址*/
    private final String address;
    /**生日*/
    private final LocalDate birthday;
    /**备注*/
    private final String info;

    private User(String name, String[] hobbies, Integer age, String address, LocalDate birthday, String info) {
        this.name = name;
        this.hobbies = hobbies;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
        this.info = info;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", info='" + info + '\'' +
                '}';
    }

    /**
     * 用户建造者
     */
    public static class UserBuilder {
        /*
         * 在这里定义与User类相同的属性，注意不能用 final
         */
        /**名字*/
        private String name;
        /**爱好*/
        private String[] hobbies;
        /**年龄*/
        private Integer age;
        /**地址*/
        private String address;
        /**生日*/
        private LocalDate birthday;
        /**备注*/
        private String info;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setHobbies(String[] hobbies) {
            this.hobbies = hobbies;
            return this;
        }

        public UserBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setBirthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public UserBuilder setInfo(String info) {
            this.info = info;
            return this;
        }

        public User build(){
            return new User(name, hobbies, age, address, birthday, info);
        }
    }
}
