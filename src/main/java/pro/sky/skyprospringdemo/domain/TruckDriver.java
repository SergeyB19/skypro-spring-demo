package pro.sky.skyprospringdemo.domain;

public class TruckDriver extends Driver {
    public TruckDriver(String name, String surname, String passport, int professionNumber, String driverLisenseNumber) {
        super(name, surname, passport, professionNumber, driverLisenseNumber);
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        if (driverLicenseNumber != null && driverLicenseNumber.startsWith("2")) {
            super.setDriverLisenseNumber(driverLicenseNumber);
        }
    }
}
