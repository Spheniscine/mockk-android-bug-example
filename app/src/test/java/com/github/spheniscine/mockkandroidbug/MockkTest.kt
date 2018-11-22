package com.github.spheniscine.mockkandroidbug

import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test

class MockkTest {
    val classUnderTest : ClassUnderTest = mockk()

    @Test
    fun propertyTest() {
        every {classUnderTest.property} returns "Hello MockK" // passes here unlike Android

        assertEquals("Hello MockK", classUnderTest.property)
    }

    @Test
    fun openPropertyTest() {
        every {classUnderTest.openProperty} returns "Hello MockK" // passes

        assertEquals("Hello MockK", classUnderTest.openProperty)
    }

    @Test
    fun functionTest() {
        every {classUnderTest.function()} returns "Hello MockK" // passes here unlike Android

        assertEquals("Hello MockK", classUnderTest.function())
    }

    @Test
    fun openFunctionTest() {
        every {classUnderTest.openFunction()} returns "Hello MockK" // passes

        assertEquals("Hello MockK", classUnderTest.openFunction())
    }

    @Test
    fun indyFunctionTest() {
        every {classUnderTest.indyFunction()} returns "Hello MockK" // passes here unlike Android

        assertEquals("Hello MockK", classUnderTest.indyFunction())
    }

    @Test
    fun openIndyFunctionTest() {
        every {classUnderTest.openIndyFunction()} returns "Hello MockK" // passes

        assertEquals("Hello MockK", classUnderTest.openIndyFunction())
    }
}