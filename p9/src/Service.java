public class Service implements Priceable {
    private String serviceName;
    private double hourlyRate;
    private int hours;

    public Service(String serviceName, double hourlyRate, int hours) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public double getPrice() {
        return hourlyRate * hours;
    }
}