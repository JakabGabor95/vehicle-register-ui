package hu.ltk.jakabgabor.controller;

import hu.ltk.jakabgabor.domain.Vehicle;
import hu.ltk.jakabgabor.domain.VehicleType;
import hu.ltk.jakabgabor.interfaces.VehicleRegisterInteractorInterface;

import java.util.Scanner;

public class VehicleUiController implements VehicleRegisterInteractorInterface {
    private Scanner scanner;

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            printMenu();
            String command = scanner.next();
            switch (command) {
                case "l":
                    Vehicle vehicle = new Vehicle();
                    System.out.println("Add meg az autó rendszámát:");
                    String registrationNumber = scanner.next();
                    vehicle.setRegistrationNumber(registrationNumber);
                    System.out.println("Add meg az autó gyártmányát:");
                    String make = scanner.next();
                    vehicle.setMake(make);
                    System.out.println("Add meg az autó kategóriáját:");
                    VehicleType type = VehicleType.valueOf(scanner.next());
                    vehicle.setVehicleType(type);
                    System.out.println("Add meg az autó ülőhelyeinek számát:");
                    int numberOfSeats = scanner.nextInt();
                    vehicle.setNumberOfSeats(numberOfSeats);
                    System.out.println("Add meg az autó típusát:");
                    String model = scanner.next();
                    vehicle.setModel(model);
                    break;
                case "r":
                    System.out.println("Add meg az autó rendszámát:");
                    String vehicleRegistrationNumber = scanner.next();
                    break;
                default:
                    System.out.println("Érvénytelen parancs!");
                    isRunning = false;
                    break;
            }
            System.out.println("--------------------------------------");
        }
    }

    private void printMenu() {
        System.out.println("Válassz tevékenységet!");
        System.out.println("létrehozás (l), lekérdezés rendszám alapján (r)");
    }


    @Override
    public void createNewVehicle(String s) {

    }

    @Override
    public void listVehicleByRegistrationNumber(String s) {

    }


}
