package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LionTest {
    @Test
    void testGetFood() throws Exception {
        Predator predator = Mockito.mock(Predator.class);
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы"));
        Lion lion = new Lion("Самец", predator);
        assertEquals(List.of("Животные", "Птицы"), lion.getFood());
    }

    @Test
    void testInvalidSexThrowsException() {
        Predator predator = Mockito.mock(Predator.class);
        Exception exception = assertThrows(Exception.class, () -> new Lion("Неизвестно", predator));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}