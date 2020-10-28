package interfac;

public class TestThelfPoor {
    public static void main(String[] args) {
/*        ThelfPoor tpf=new ThelfPoor("铸诚防盗门");
        tpf.close();
        tpf.lockup();

        tpf.takePicture();

        tpf.openlock();
        tpf.open();*/
 TheifPoorFinger tpfd=new TheifPoorFinger("盼盼");
 tpfd.openByFingerprint();
 tpfd.openlock();
/*Bell bell1=new TheifPoorFinger("现代");
bell1.takePicture();*/
        LockFingerprint lfp=new TheifPoorFinger("现代");
        System.out.println(lfp.standard);
        //lfp.standard="美标;" //final的属性为常量，除定义处，其他地方不能赋值
        System.out.println(LockFingerprint.standard);//是static属性，直接可以通过接口名，属性名来访问
    }
}
