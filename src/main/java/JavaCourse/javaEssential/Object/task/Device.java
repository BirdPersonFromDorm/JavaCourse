package JavaCourse.javaEssential.Object.task;

import java.util.Objects;

public class Device {

    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " +
                "manufacturer = " + manufacturer  +
                ", price= " + price +
                ", serialNumber= " + serialNumber;
    }

    // Переопределил equals, где сравнимается значение manufacturer;
    @Override
    public boolean equals(Object o) {
        Device device = (Device) o;

        return this.manufacturer.equals(device.manufacturer);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (serialNumber == null ? 0 :serialNumber.hashCode());
        result = 37 * result + (manufacturer == null ? 0 :manufacturer.hashCode());
        result = 37 * result + Float.floatToIntBits(price);

        return result;
    }
}
