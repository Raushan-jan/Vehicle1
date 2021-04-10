package type.purpose;

import type.VehcileTypeEnume;

public class TruckType extends VehicleTypeByPurpose{
    @Override
    public String getTypeName() {
        return VehcileTypeEnume.TRUCK.name();
    }
}