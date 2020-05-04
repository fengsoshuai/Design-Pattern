package org.feng.pattern.similar;

/**
 * 学生类：实现Cloneable 接口
 *
 * @author Feng
 * @date 2020/5/3 14:57
 * @see Cloneable
 */
public class Student implements Cloneable{
    private String name;
    private Integer age;
    private String address;
    private String school;
    /**
     * 专业
     */
    private String specialty;

    public Student(String name, Integer age, String address, String school, String specialty) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.school = school;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
