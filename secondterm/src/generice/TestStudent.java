package generice;

public class TestStudent {
    public static void main(String[] args) {
        Student<IdCard,Integer> student=new Student<>(new IdCard("身份证"),1234123);
        System.out.println(student);

        Student<StudentCard,Integer> student1=new Student<>(new StudentCard("学生证"),20190915);
        System.out.println(student1);

        Student<RiceCard,Integer> student2=new Student<>(new RiceCard("饭卡"),231231312);
        System.out.println(student2);
    }
}
