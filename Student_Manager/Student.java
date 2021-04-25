package Student_Manager;
//定义一个学生类

public class Student {
    private String name;
    //定义姓名成员变量

    private String age;
    //定义年龄成员变量

    private String sid;
    //定义学号成员变量

    private String address;
    //定义居住地成员变量


    public Student() {
    }

    public Student(String name, String age, String sid, String address) {
        this.name = name;
        this.age = age;
        this.sid = sid;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
