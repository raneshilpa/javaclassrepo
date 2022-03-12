package inheritanceClass;

public class SonClass extends FatherClass
{
    private String hobby;

    public SonClass(String surName, String address, long assetValue, String hobby) {
        super(surName, address, assetValue);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
