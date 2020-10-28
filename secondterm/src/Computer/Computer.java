package Computer;

public class Computer {
    private CPU cpu = null;
    private EMS ems = null;
    private HardDisk hardDisk = null;

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setEms(EMS ems) {
        this.ems = ems;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Computer(CPU cpu, EMS ems, HardDisk hardDisk) {
        this.cpu = cpu;
        this.ems = ems;
        this.hardDisk = hardDisk;
    }

    public Computer() {
    }

    public void print(String assemble) {//组装
        System.out.println("电脑正在使用的CPU品牌为：" +
                cpu.getBrand() + ",它的主频为："
                + cpu.Frequency() + "Hz"
                +",内存容量为："
                + ems.Capacity() + "GB,硬盘容量为："
                + hardDisk.Capacity()+"GB。");
        System.out.println("综上总结：该电脑由"+assemble+"组装而成。");
        System.out.println("-------------------------------------------------------------------------------");
    }
}
