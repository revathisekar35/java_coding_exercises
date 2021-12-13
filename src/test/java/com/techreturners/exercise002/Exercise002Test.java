package com.techreturners.exercise002;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise002Test {

    @Test
    public void checkIsFromManchester() {
        Exercise002 ex002 = new Exercise002();

        Person p1 = new Person("Peter", "Smith", "Manchester", 23);
        Person p2 = new Person("Susan", "Farmer", "Leeds", 23);
        Person p3 = new Person("Jack", "Farmer", null, 23);
        Person p4 = new Person("Jack", "Farmer", "", 23);
        assertEquals(true, ex002.isFromManchester( p1 ));
        assertEquals(false, ex002.isFromManchester( p2 ));
        assertEquals(false, ex002.isFromManchester( p3 ));
        assertEquals(false, ex002.isFromManchester( p4 ));
        
    }

    @Test
    public void checkCanWatchFilm() {
        Exercise002 ex002 = new Exercise002();

        Person p1 = new Person("Peter", "Smith", "Manchester", 17);
        Person p2 = new Person("Francis", "Farmer", "Leeds", 18);
        Person p3 = new Person("Francis", "Farmer", "Leeds", 50);
        assertEquals(false, ex002.canWatchFilm( p1, 18));
        assertEquals(true, ex002.canWatchFilm( p2, 18));
        assertEquals(true, ex002.canWatchFilm( p3, 18));
    }
}
