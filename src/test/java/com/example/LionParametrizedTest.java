package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

class LionParameterizedTest {
    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    void testDoesHaveMane(String sex, boolean expectedHasMane) throws Exception {
        Predator predator = Mockito.mock(Predator.class);
        Lion lion = new Lion(sex, predator);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}