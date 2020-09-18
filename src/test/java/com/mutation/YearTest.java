package com.mutation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YearTest {
    private Year year;

    @Before
    public void setup() {
        year = new Year();
    }

    @Test
    public void testYearNotDivBy4InCommonYear() {
        assertEquals("Not a Leap Year", year.isLeapYear(2015));
    }

    @Test
    public void testYearDivBy2NotDivBy4InCommonYear() {
        assertEquals("Not a Leap Year", year.isLeapYear(1970));
    }

    @Test
    public void testYearDivBy4NotDivBy100InYear() {
        assertEquals("Leap Year", year.isLeapYear(1996));
    }

    @Test
    public void testYearDivBy4And5InLeapYear() {
        assertEquals("Leap Year", year.isLeapYear(1960));
    }

    @Test
    public void testYearDivBy100NotDivBy400InCommonYear() {
        assertEquals("Not a Leap Year", year.isLeapYear(2100));
    }

    @Test
    public void testYearDivBy100NotDivBy3IsNotLeapYear() {
        assertEquals("Not a Leap Year", year.isLeapYear(1900));
    }

    @Test
    public void testYearDivBy400InLeapYear() {
        assertEquals("Leap Year", year.isLeapYear(2000));
    }

    @Test
    public void testYearDivBy400NotDivBy125IsLeapYear() {
        assertEquals("Leap Year", year.isLeapYear(2400));
    }

    @Test
    public void testYearDivBy200NotDivBy400InCommonYear() {
        assertEquals("Not a Leap Year", year.isLeapYear(1800));
    }

    @Test
    public void GivenYearIsEvenCentury() {
        assertEquals(20, year.findCentury(2000));
    }

    @Test
    public void GivenYearIsOddCentury() {
        assertEquals(21, year.findCentury(2020));
    }

    @Test
    public void GreaterThan100() {
        assertEquals(2, year.findCentury(125));
    }

    @Test
    public void EqualTo100() {
        assertEquals(1, year.findCentury(100));
    }

    @Test
    public void NotEqualTo100() {
        assertEquals(1, year.findCentury(1));
    }

    @Test
    public void testYearDivBy100GreaterThanZero() {
        assertEquals("Not a Leap Year",year.isLeapYear(2022));
    }

   @Test
    public void testYearDivByFourLessThanZero() {
        assertEquals("Leap Year",year.isLeapYear(-124));
    }

    @Test
    public void testYearDivByFourGreaterThanZero() {
        assertEquals("Not a Leap Year", year.isLeapYear(-125));
    }

    @Test
    public void LesserThan100() {
        assertEquals(0, year.findCentury(-125));

    }

}

