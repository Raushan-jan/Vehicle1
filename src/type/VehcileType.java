package type;

public class VehcileType {
    protected String attribute;

    public VehcileType(String attribute) {
        this.attribute = attribute;
    }
    public String getAttributeOfType() {
        return attribute;
    }

    public String getTypeName() {
        return "Vehicle type name";
    }
}