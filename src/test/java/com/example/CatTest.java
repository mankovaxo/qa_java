package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    void testGetSound() {
        Cat cat = new Cat(Mockito.mock(Feline.class));
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void testGetFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы"));
        Cat cat = new Cat(feline);
        assertEquals(List.of("Животные", "Птицы"), cat.getFood());
    }
}