package com.baeldung.avroschemasfromjavaclasses.avroreflectapi;

import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;

import com.baeldung.avroschemasfromjavaclasses.avroreflectapi.simplerecord.BankAccount;

public class ConverterApp {

    public static void main(String[] args) {
        ReflectData reflectData = ReflectData.get();
        Schema bankAccountSchema = reflectData.getSchema(BankAccount.class);

        String bankAccountSchemaJson = bankAccountSchema.toString(true);
        System.out.println(bankAccountSchemaJson);
    }
}