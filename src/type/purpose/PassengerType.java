package type.purpose;

import type.VehcileTypeEnume;

public class PassengerType extends VehicleTypeByPurpose{
    @Override
    public String getTypeName() {
        return VehcileTypeEnume.PASSENGER.name();
    }

}
