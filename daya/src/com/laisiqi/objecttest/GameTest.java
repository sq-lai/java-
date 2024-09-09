package com.laisiqi.objecttest;
//练习1：游戏的测试类
public class GameTest {
    public static void main(String[] args) {
        Role role1 = new Role("乔峰",100);
        Role role2 = new Role("张三",100);
        //进入一个无限循环，直到把他打死为止
        while(true){
            role1.attack(role2);
            if(role2.getBlood() == 0){
                System.out.println(role1.getName() + " K.O了" + role2.getName());
                break;
            }



        }


    }
}
