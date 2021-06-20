package JavaCourse.javaEssential.Object.task;

import java.util.Objects;

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;

    public Monitor(int resolutionX, int resolutionY, String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
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

    @Override
    public String toString() {
        return "Monitor: " +
                "manufacturer = " + getManufacturer() +
                ", price = " + getPrice() +
                ", serialNumber = " + getSerialNumber() +
                ", resolutionX = " + resolutionX +
                ", resolutionY = " + resolutionY;
    }

    // Переопределил equals, где сравнимается значение resolutionX;
    @Override
    public boolean equals(Object o) {
        Device device = (Monitor) o;

        return this.resolutionX == ((Monitor) o).resolutionX;
    }

    @Override
    public int hashCode() {
        int result = 17;


        result = 37 * result + (getSerialNumber() == null ? 0 :getSerialNumber().hashCode());
        result = 37 * result + (getManufacturer() == null ? 0 :getManufacturer().hashCode());
        result = 37 * result + Float.floatToIntBits(getPrice());
        result = 37 * result + resolutionX;
        result = 37 * result + resolutionY;

        return result;
    }
}
