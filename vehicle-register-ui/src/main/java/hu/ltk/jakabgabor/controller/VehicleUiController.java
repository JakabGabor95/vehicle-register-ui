package hu.ltk.jakabgabor.controller;

import com.google.gson.Gson;
import hu.ltk.jakabgabor.entities.Vehicle;
import hu.ltk.jakabgabor.enums.VehicleType;
import hu.ltk.jakabgabor.interfaces.VehicleRegisterInteractorInterface;

import java.util.Scanner;

public class VehicleUiController {
    private Scanner scanner;
    private VehicleRegisterInteractorInterface vehicleRegisterInteractorInterface;
    private Gson gson = new Gson();
    public VehicleUiController(Scanner scanner, VehicleRegisterInteractorInterface vehicleRegisterInteractorInterface) {
        this.scanner = scanner;
        this.vehicleRegisterInteractorInterface = vehicleRegisterInteractorInterface;
    }
    public void run()  {
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
                    System.out.println("Add meg az autó típusát:");
                    String model = scanner.next();
                    vehicle.setModel(model);
                    System.out.println("Add meg az autó ülőhelyeinek számát:");
                    int numberOfSeats = scanner.nextInt();
                    vehicle.setNumberOfSeats(numberOfSeats);
                    System.out.println("Add meg az autó kategóriáját:");
                    VehicleType type = VehicleType.valueOf(scanner.next());
                    vehicle.setVehicleType(type);
                    vehicleRegisterInteractorInterface.createNewVehicle(gson.toJson(vehicle));
                    break;
                case "r":
                    System.out.println("Add meg az autó rendszámát:");
                    String vehicleRegistrationNumber = scanner.next();
                    vehicleRegisterInteractorInterface.getVehicleByRegistrationNumber(gson.toJson(vehicleRegistrationNumber));
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
}
