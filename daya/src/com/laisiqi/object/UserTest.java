package com.laisiqi.object;
//测试类
public class UserTest {
    public static void main(String[] args) {
        User user = new User("张三", "213213", "www.231.com",
                "男", 19);

        //因为是变量的形式输出，所以逗号用字符串的形式！！！
        System.out.println(user.getUserName() + "," + user.getAge() + "," + user.getEmail() + "," + user.getGender() + "," + user.getPassWord());

    }
}
