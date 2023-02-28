package com.juaracoding.FYI_JavaWeb.configuration;/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Moh. Ikhsan a.k.a. Fitriyani
Java Developer
Created on 2/27/2023 7:58 PM
@Last Modified 2/27/2023 7:58 PM
Version 1.0
*/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:other.properties")
public class OtherConfig {
    private static String flagLogging;//additionForLogging


    private static String flagTestDebug;

    private static String flagBcrypt;

    private static String flagMaxCounter;

    public static String getFlagMaxCounter() {
        return flagMaxCounter;
    }

    @Value("${flag.max.counter.login}")
    private void setFlagMaxCounter(String flagMaxCounter) {
        OtherConfig.flagMaxCounter = flagMaxCounter;
    }

    public static String getFlagBcrypt() {
        return flagBcrypt;
    }

    @Value("${flag.bcrypts}")
    private void setFlagBcrypt(String flagBcrypt) {
        OtherConfig.flagBcrypt = flagBcrypt;
    }

    public static String getFlagTestDebug() {
        return flagTestDebug;
    }

    @Value("${flag.test.debug}")
    private void setFlagTestDebug(String flagTestDebug) {
        OtherConfig.flagTestDebug = flagTestDebug;
    }

    public static String getFlagLogging() {
        return flagLogging;
    }

    @Value("${flag.logging}")
    private void setFlagLogging(String flagLogging) {
        this.flagLogging = flagLogging;
    }

}