package com.laisiqi.interfacetest;
//实现类
public class C implements A,B{
    @Override
    public void cry() {
        System.out.println("有人哭了");
    }

    @Override
    public void run() {
        System.out.println("我在奔跑");

    }
}
