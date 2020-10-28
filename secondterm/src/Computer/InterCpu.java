package Computer;

public class InterCpu implements CPU {

    @Override
    public String getBrand() {
        return "Inter";
    }

    @Override
    public double Frequency() {
        return 8.0;
    }
}
