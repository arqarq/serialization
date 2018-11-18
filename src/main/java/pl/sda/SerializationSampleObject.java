package pl.sda;

import java.io.Serializable;

public class SerializationSampleObject implements Serializable {
    public static final long serialVersionUID = 2L;

    static {
        System.out.println("Initialization");
    }

    private String stringValue;
    private transient String transientStringValue;
    private int intValue;
    private transient int transientIntValue;

    public SerializationSampleObject() {
        System.out.println("ConstructorInvoked");
    }

    public String getStringValue() {
        return stringValue;
    }

    public SerializationSampleObject setStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    public String getTransientStringValue() {
        return transientStringValue;
    }

    public SerializationSampleObject setTransientStringValue(String transientStringValue) {
        this.transientStringValue = transientStringValue;
        return this;
    }

    public int getIntValue() {
        return intValue;
    }

    public SerializationSampleObject setIntValue(int intValue) {
        this.intValue = intValue;
        return this;
    }

    public int getTransientIntValue() {
        return transientIntValue;
    }

    public SerializationSampleObject setTransientIntValue(int transientIntValue) {
        this.transientIntValue = transientIntValue;
        return this;
    }

    @Override
    public String toString() {
        return "SerializationSampleObject{" +
                "stringValue='" + stringValue + '\'' +
                ", transientStringValue='" + transientStringValue + '\'' +
                ", intValue=" + intValue +
                ", transientIntValue=" + transientIntValue +
                '}';
    }
}
