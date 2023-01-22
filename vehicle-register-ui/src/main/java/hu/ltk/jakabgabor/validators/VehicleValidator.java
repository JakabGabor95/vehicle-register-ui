package hu.ltk.jakabgabor.validators;

import hu.ltk.jakabgabor.exceptions.VehicleNotFoundException;
import hu.ltk.jakabgabor.models.VehicleModel;
import hu.ltk.jakabgabor.parser.JsonParser;

public class VehicleValidator {
    private JsonParser jsonParser = new JsonParser();
    public VehicleModel vehicleIsNull(String vehicleJson) {
            try {
                if (jsonParser.parseJsonToVehicleModel(vehicleJson) == null) {
                    throw new VehicleNotFoundException();
                }
                else{
                    return jsonParser.parseJsonToVehicleModel(vehicleJson);
                }
            } catch (VehicleNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
}
