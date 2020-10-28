package interfac;

public class TestPhone {
    public static void main(String[] args) {
            SmartPhone phone=new SmartPhone();
            CellPhone phone1=new CellPhone();
            phone.call();
            phone.sendMessage();
            phone1.call();
            phone1.sendMessage();
    }
}
