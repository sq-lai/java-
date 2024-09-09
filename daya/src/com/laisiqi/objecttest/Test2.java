package com.laisiqi.objecttest;
//要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁*/

public class Test2 {

    public static void main(String[] args) {

        //1.创建一个数组用来存储学生对象
        Student[] arr = new Student[3];
        //2.创建学生对象并添加到数组当中
        Student stu1 = new Student("zhangsan", 12, 2);
        Student stu2 = new Student("lisi", 22, 1);
        Student stu3 = new Student("wangwu", 23, 3);

        //3.把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        int index = getIndex(arr,2);

        if(index >= 0){
            Student stu = arr[index];

            int newAge = stu.getAge() + 1;
            stu.setAge(newAge);
            printArr(arr);

        }else{

            System.out.println("当前id不存在，修改失败");

        }


    }

    public static int getIndex(Student[] arr , int id){
        for (int i = 0; i < arr.length; i++) {
            //依次得到每一个学生对象
            Student stu = arr[i];
            //对stu进行一个非空判断
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return i;
                }
            }
        }

        //当循环结束之后，还没有找到就表示不存在
        return -1;
    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());
            }
        }
    }


}
