package pro.sky.skyprospringdemo.domain;

public class Driver extends Person {
    private String driverLisenseNumber;

    public Driver(String name, String surname, String passport, int professionNumber, String driverLisenseNumber) {
        super(name, surname, passport, professionNumber);
        this.driverLisenseNumber = driverLisenseNumber;
    }

    public String getDriverLisenseNumber(){
        return driverLisenseNumber;

    }

    public void setDriverLisenseNumber(String driverLisenseNumber) {
        this.driverLisenseNumber = driverLisenseNumber;
    }
}
