package type.purpose;

import type.VehcileType;

public class VehicleTypeByPurpose extends VehcileType {
    public VehicleTypeByPurpose() {
        super("Vehicle type by purpose");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VehicleTypeByPurpose that  = (VehicleTypeByPurpose) obj;
        return attribute != null && attribute.equals(that.attribute);
    }
}