package Abnormal;

public class TestAgelnputException {
    public static void main(String[] args) {
        Person per = new Person();
        try{
            per.setAge(101);
        }catch (AgelnputException ag){
            ag.printStackTrace();
        }
    }

}
