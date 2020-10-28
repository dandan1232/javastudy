package Computer;

public class AmdCpu implements CPU{
    @Override
    public String getBrand() {
        return "Amd";
    }

    @Override
    public double Frequency() {
        return 4.0;
    }
}
