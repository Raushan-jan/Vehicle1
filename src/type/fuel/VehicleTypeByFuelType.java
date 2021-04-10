package type.fuel;

import type.VehcileType;

public class VehicleTypeByFuelType extends VehcileType {
    public VehicleTypeByFuelType() {
        super("Vehicle type by fuel type");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VehicleTypeByFuelType that  = (VehicleTypeByFuelType) obj;
        return attribute != null && attribute.equals(that.attribute);
    }

}