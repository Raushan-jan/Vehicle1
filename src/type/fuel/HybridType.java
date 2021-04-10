package type.fuel;

import type.VehcileTypeEnume;

public class HybridType extends VehicleTypeByFuelType {
    @Override
    public String getTypeName() {
        return VehcileTypeEnume.HYBRID.name();
    }

}
