package Student_Manager;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_System {

    public static void main(String[] args) {

        ArrayList<Student> array = new ArrayList<Student>();
        //创建一个集合用于储存学生

        while (true) {

        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：查看学生");
        System.out.println("4：修改学生");
        System.out.println("5：退出");
        System.out.println("--------------------------------");

        Scanner sn = new Scanner(System.in);

        System.out.print("请输入指令：");
        String line = sn.nextLine();


            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("删除学生");
                    delStudent(array);
                    break;
                case "3":
                    System.out.println("查看学生");
                    getStudent(array);
                    break;
                case "4":
                    System.out.println("修改学生");
                    lookStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
            }
        }
    }

    public static void addStudent (ArrayList<Student> array){

        Scanner sc2 = new Scanner(System.in);
        //新建一个输入，用于输入学生信息

        System.out.println("请输入学生姓名：");
        String name = sc2.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc2.nextLine();
        System.out.println("请输入学生学号：");
        String sid = sc2.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc2.nextLine();
        //输入学生信息

        Student s1 = new Student();
        //新建一个学生对象，用于储存学生信息

        s1.setName(name);
        s1.setAge(age);
        s1.setSid(sid);
        s1.setAddress(address);
        //把输入好的学生信息添加至s1学生对象当中

        array.add(s1);
        //把s1学生对象添加至array学生集合当中

        System.out.println("添加学生成功！");
    }
    //该方法用于添加学生
    public static void getStudent (ArrayList<Student> array){

        if (array.size()==0){
            System.out.println("无信息，请先添加后再查询!");
        }else {
            System.out.println("姓名\t\t年龄\t\t学号\t\t居住地");
            //打印格式，增添美观
        }

        for (int i = 0 ;i<array.size();i++){
            //遍历数组

            Student s1 = array.get(i);
            //把遍历好的值赋值给s1

            System.out.println(s1.getName()+"\t\t"+s1.getAge()+"岁\t"+s1.getSid()+"\t\t"+s1.getAddress());
            //打印s1中的各类信息
        }
    }
    //该方法用于查看学生
    public static void delStudent (ArrayList<Student> array){

        Scanner sn3 = new Scanner(System.in);

        if (array.size()==0){
            System.out.println("无信息，请先添加后再删除!");
        }else {
            System.out.println("请输入需要删除的学生学号");
            String s2 = sn3.nextLine();

            for (int i = 0 ;i<array.size();i++){
                Student s = array.get(i);

                if (s.getSid().equals(s2)){
                    array.remove(i);
                    System.out.println("删除学生成功！");
                    break;
                }
            }
        }
    }
    //该方法用于删除学生
    public static void lookStudent (ArrayList<Student> array){

        Scanner sn4 = new Scanner(System.in);

        if (array.size()==0){
            System.out.println("无信息，请先添加后再修改!");
        }else {
            System.out.println("请输入需要被修改的学生学号");
            String s3 = sn4.nextLine();

            Student s1 = new Student();

            System.out.println("请输入修改学生姓名：");
            String name = sn4.nextLine();
            System.out.println("请输入修改学生年龄：");
            String age = sn4.nextLine();
            System.out.println("请输入修改学生学号：");
            String sid = sn4.nextLine();
            System.out.println("请输入修改学生居住地：");
            String address = sn4.nextLine();

            s1.setName(name);
            s1.setAge(age);
            s1.setSid(sid);
            s1.setAddress(address);

            for (int i = 0 ;i<array.size();i++){
                Student s = array.get(i);

                if (s.getSid().equals(s3)){
                    array.set(i,s1);
                    System.out.println("修改学生成功！");
                    break;
                }
            }
        }
    }
    //该方法用于修改学生
}
