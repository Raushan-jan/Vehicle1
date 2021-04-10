package type.body;

import type.VehcileTypeEnume;

public class PickupType extends VehicleTypeByBodyType {
    @Override
    public String getTypeName() {
        return VehcileTypeEnume.PICKUP.name();
    }
}