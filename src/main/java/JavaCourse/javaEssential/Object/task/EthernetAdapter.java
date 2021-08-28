package JavaCourse.javaEssential.Object.task;

import java.util.Objects;

public class EthernetAdapter extends Device{

    private int speed;
    private String mac;

    public EthernetAdapter(int speed, String mac, String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String getManufacturer() {
        return super.getManufacturer();
    }

    @Override
    public void setManufacturer(String manufacturer) {
        super.setManufacturer(manufacturer);
    }

    @Override
    public float getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(float price) {
        super.setPrice(price);
    }

    @Override
    public String getSerialNumber() {
        return super.getSerialNumber();
    }

    @Override
    public void setSerialNumber(String serialNumber) {
        super.setSerialNumber(serialNumber);
    }

    //Переопределил equals, где сравнимается значение speed;
    @Override
    public boolean equals(Object o) {
        Device device = (EthernetAdapter) o;

        return this.speed == ((EthernetAdapter) o).speed;
    }

    @Override
    public int hashCode() {
        int result = 17;


        result = 37 * result + (getSerialNumber() == null ? 0 :getSerialNumber().hashCode());
        result = 37 * result + (getManufacturer() == null ? 0 :getManufacturer().hashCode());
        result = 37 * result + Float.floatToIntBits(getPrice());
        result = 37 * result + speed;
        result = 37 * result + (mac == null ? 0: mac.hashCode());

        return result;
    }
}
