package pl.sda;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("About to create SSO object");
        SerializationSampleObject sso = new SerializationSampleObject();
        sso.setIntValue(1337);
        sso.setStringValue("Lubie Jave");
        sso.setTransientIntValue(4567);
        sso.setTransientStringValue("Lubie .Net");
        System.out.println(sso);
        try (ObjectOutputStream objectOutputStream = // automatyczny close() z resource blokiem
                     new ObjectOutputStream(
                             new FileOutputStream("SerializedSampleObject.ser"))) {
            System.out.println("About to serialize object");
            objectOutputStream.writeObject(sso);
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=============================");
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(
                             new FileInputStream("SerializedSampleObject.ser"))) {
            System.out.println("About to deserialize object");
            SerializationSampleObject deserialized = (SerializationSampleObject) objectInputStream.readObject();
            System.out.println("Object deserialized");
            System.out.println(deserialized);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }/* catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
    }
}
