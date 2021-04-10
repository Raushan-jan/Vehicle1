package type.body;

import type.VehcileType;

public class VehicleTypeByBodyType extends VehcileType {
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VehicleTypeByBodyType that  = (VehicleTypeByBodyType) obj;
        return attribute != null && attribute.equals(that.attribute);
    }
}