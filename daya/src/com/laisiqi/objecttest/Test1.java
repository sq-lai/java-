package com.laisiqi.objecttest;
//测试类的练习3-4
//要求3：通过id删除学生信息
//       如果存在，则删除，如果不存在，则提示删除失败。
//       要求4：删除完毕之后，遍历所有学生信息。
public class Test1 {
    public static void main(String[] args) {
        //1.创建一个数组用来存储学生对象
        Student[] arr = new Student[3];
        //2.创建学生对象并添加到数组当中
        Student stu1 = new Student("zhangsan",23, 1);
        Student stu2 = new Student("lisi", 22, 2);
        Student stu3 = new Student("wangwu", 32, 3);

        //3.把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        int index = getIndex(arr,2);
        if(index >= 0){
            arr[index] = null;
            printArr(arr);

        }else {

            System.out.println("当前id不存在，删除失败");


        }





    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {

            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());
            }



        }



    }

    public static int getIndex(Student[] arr, int index){
        for (int i = 0; i < arr.length; i++) {

            Student stu = arr[i];
            if(stu != null){

                int sid = stu.getId();
                if(sid == index){
                    return i;
                }


            }
        }
        return -1;

    }


}
