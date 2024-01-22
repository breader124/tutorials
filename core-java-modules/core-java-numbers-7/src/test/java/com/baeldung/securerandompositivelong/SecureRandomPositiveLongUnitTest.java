package com.baeldung.securerandompositivelong;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.assertj.core.api.Assertions.assertThat;

public class SecureRandomPositiveLongUnitTest {

    @Test
    void whenGenerateRecureRandom_thenGetExpectedValue() {
        SecureRandom secureRandom = new SecureRandom();
        long randomPositiveLong = Math.abs(secureRandom.nextLong());

        assertThat(randomPositiveLong).isPositive();
    }
}
