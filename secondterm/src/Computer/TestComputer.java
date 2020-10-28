package Computer;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer=new Computer();
        CPU cpu=null;
        EMS ems=null;
        HardDisk hardDisk=null;
        //品牌：Inter，主频：8.0Hz，内存：8.0G,硬盘：168.0G
        cpu=new InterCpu();
        ems=new Ems8G();
        hardDisk=new Hard168G();
        computer.setCpu(cpu);
        computer.setEms(ems);
        computer.setHardDisk(hardDisk);
        computer.print("CPU品牌Inter，主频8.0Hz，内存8.0G,硬盘168.0G");

        //品牌：Amd，主频：4.0Hz，内存：16.0G,硬盘：256.0G
        cpu=new AmdCpu();
        ems=new Ems16G();
        hardDisk=new Hard256G();
        computer.setCpu(cpu);
        computer.setEms(ems);
        computer.setHardDisk(hardDisk);
        computer.print("CPU品牌Amd，主频4.0Hz，内存16.0G,硬盘256.0G");

        //品牌：Inter，主频：8.0Hz，内存：8.0G,硬盘：256.0G
        cpu=new InterCpu();
        ems=new Ems8G();
        hardDisk=new Hard256G();
        computer.setCpu(cpu);
        computer.setEms(ems);
        computer.setHardDisk(hardDisk);
        computer.print("CPU品牌Inter，主频8.0Hz，内存8.0G,硬盘256.0G");
    }

}
