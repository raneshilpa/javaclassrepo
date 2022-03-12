package inheritanceClass;

public class FatherClass {
    public FatherClass() {
    }

    private String surName;
    private String address;
    private long assetValue;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(long assetValue) {
        this.assetValue = assetValue;
    }

    public FatherClass(String surName, String address, long assetValue) {
        this.surName = surName;
        this.address = address;
        this.assetValue = assetValue;
    }

    @Override
    public String toString() {
        return "FatherClass{" +
                "surName='" + surName + '\'' +
                ", address='" + address + '\'' +
                ", assetValue=" + assetValue +
                '}';
    }
}
