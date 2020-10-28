package interfac;

public class TestHandset {
    public static void main(String[] args) {
        CommonHandset comhand=new CommonHandset("索尼爱立信","G520");
        comhand.info();
        comhand.play("《认真的雪》");
        comhand.call();
        comhand.sendInfo();
        System.out.println("---------------------------------------");

        AptitudeHandset apthand=new AptitudeHandset("华为","p30pro");
        apthand.info();
        apthand.call();
        apthand.takePicture();
        apthand.sendInfo();
        apthand.netWorkConn();

    }
}
