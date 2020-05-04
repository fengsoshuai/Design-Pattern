package org.feng.pattern.similar;

/**
 * 相似对象的测试：使用克隆模式获得对象，只需要修改一部分属性即可。
 * 目标对象的大多数属性相同称之为相似对象。
 *
 * @author Feng
 * @date 2020/5/3 15:01
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("Feng", 10, "西安", "西安工业大学","软件工程专业");
        // 得到相似对象
        Student student1 = (Student)student.clone();

        student1.setName("Feng2");
        student1.setAge(11);

        System.out.println(student);
        System.out.println(student1);
    }
}
