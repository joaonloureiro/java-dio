package one.digitalinnovation.gof.factory;

public class PC extends Computer {
    private final String ram;
    private final String hd;
    private final String cpu;

    public PC(String ram, String hd, String cpu) {
        this.ram = ram;
        this.hd = hd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return null;
    }

    @Override
    public String getHD() {
        return null;
    }

    @Override
    public String getCPU() {
        return null;
    }
}
