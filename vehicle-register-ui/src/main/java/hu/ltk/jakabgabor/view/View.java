package hu.ltk.jakabgabor.view;

import hu.ltk.jakabgabor.controller.VehicleUiController;
import hu.ltk.jakabgabor.enums.VehicleType;
import hu.ltk.jakabgabor.models.VehicleModel;

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);
    private VehicleUiController vehicleUiController;

    public View(VehicleUiController vehicleUiController) {
        this.vehicleUiController = vehicleUiController;
    }

    public void run()  {
        boolean isRunning = true;
        while (isRunning) {
            printMenu();
            String command = scanner.next();
            switch (command) {
                case "r":
                    System.out.println("Add meg az autó rendszámát:");
                    String registrationNumber = scanner.next();
                    System.out.println("Add meg az autó gyártmányát:");
                    String make = scanner.next();
                    System.out.println("Add meg az autó típusát:");
                    String model = scanner.next();
                    System.out.println("Add meg az autó ülőhelyeinek számát:");
                    int numberOfSeats = scanner.nextInt();
                    System.out.println("Add meg az autó kategóriáját:");
                    VehicleType type = VehicleType.valueOf(scanner.next());
                    VehicleModel vehicle = new VehicleModel();
                    vehicle.setRegistrationNumber(registrationNumber);
                    vehicle.setVehicleType(type);
                    vehicle.setModel(model);
                    vehicle.setNumberOfSeats(numberOfSeats);
                    vehicle.setMake(make);
                    vehicleUiController.createNewVehicle(vehicle);
                    break;
                case "l":
                    System.out.println("Add meg az autó rendszámát:");
                    String vehicleRegistrationNumber = scanner.next();
                    vehicleUiController.getVehicleByRegistrationNumber(vehicleRegistrationNumber);
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
        System.out.println("Jármű rögzítése (r), Jármű lekérdezése rendszám alapján (l)");
    }
    public void display(VehicleModel vehicleModel) {
        String vehicleDisplay = "";
        vehicleDisplay += "Rendszám: " + vehicleModel.getRegistrationNumber() + " \n";
        vehicleDisplay += "Gyártmány: " + vehicleModel.getMake() + " \n";
        vehicleDisplay += "Típus: " + vehicleModel.getModel() + "\n";
        vehicleDisplay += "Ülőhelyek száma: " + vehicleModel.getNumberOfSeats() + "\n";
        vehicleDisplay += "Jármű kategória: " + vehicleModel.getVehicleType() + "\n";

        System.out.println(vehicleDisplay);
    }
}
