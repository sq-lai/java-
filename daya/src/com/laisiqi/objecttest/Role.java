package com.laisiqi.objecttest;

import java.util.Random;

//javabean类游戏的
//需求:
//
//	格斗游戏，每个游戏角色的姓名，血量，都不相同，在选定人物的时候（new对象的时候），这些信息就应该被确定下来。
public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    //练习：定义攻击方式，调用方法的打方法的参数

    public void attack(Role role) {

        Random sr  = new Random();
        int hurt = sr.nextInt(20) + 1;

        int remainblood = role.getBlood() - hurt;

        remainblood = remainblood < 0 ? 0 : remainblood;

        role.setBlood(remainblood);

        //this表示方法的调用者,从大局出发，this在attack方法里面！！！

        System.out.println(this.getName() + " attacked " + role.getName() + "造成了" + hurt + "伤害" +"," + role.getName() + "还剩下" + remainblood);



    }








}
