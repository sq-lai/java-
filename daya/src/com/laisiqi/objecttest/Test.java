package com.laisiqi.objecttest;

//复杂数组练习的测试类1
public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student("张三",23,1);
        Student stu2 = new Student("李四",24,2);

        arr[0] = stu1;
        arr[1] = stu2;

        //要求一：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。

        Student stu3 = new Student("momo",25,3);

        //唯一性判断
        //已存在 --- 不用添加
        //不存在 --- 就可以把学生对象添加进数组
        boolean flag = Contains(arr,stu3.getId());
        if(flag){
            System.out.println("当前id重复，请修改id后再进行添加");

        }else{
            //不存在 --- 就可以把学生对象添加进数组
            //把stu4添加到数组当中
            //1.数组已经存满 --- 只能创建一个新的数组，新数组的长度 = 老数组 + 1
            //2.数组没有存满 --- 直接添加
            int count = getCount(arr);
            if(count == arr.length){

                Student[] newArr = creatNewArr(arr);

                newArr[count] = stu3;

                printArr(newArr);



            }else{
                arr[count] = stu3;
                printArr(arr);


            }


        }



    }
    //打印对象数组里面对象的信息
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());
            }



        }


    }

    //创建新的数组
    public static Student[] creatNewArr(Student[] arr){

        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {

            newArr[i] = arr[i];



        }
        return newArr;

    }
    //统计对象数组里面非空的有几个
    public static int getCount(Student[] arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

                if(arr[i] != null){

                    count++;
                }


        }

        return count;

    }
    //检索数组里面有无这个id
    public static boolean Contains(Student[] arr,int id){

            for (int i = 0; i < arr.length; i++) {

               Student stu = arr[i];
                if(stu != null) {
                    if (stu.getId() == id) {
                        return true;
                    }

                }



            }

            return false;



    }
}
