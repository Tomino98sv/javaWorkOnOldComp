package genericType;

public class Mobile {
    private String brand;
    private int network;
    private String OS;
    private int RAM;

    public Mobile(String brand, int network, String OS, int RAM){
        this.brand=brand;
        this.network=network;
        this.OS=OS;
        this.RAM=RAM;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNetwork() {
        return network;
    }

    public void setNetwork(int network) {
        this.network = network;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

}
