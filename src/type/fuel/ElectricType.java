package type.fuel;

import type.VehcileTypeEnume;

public class ElectricType extends VehicleTypeByFuelType {
    @Override
    public String getTypeName() {
        return VehcileTypeEnume.ELECTRIC.name();
    }
}
