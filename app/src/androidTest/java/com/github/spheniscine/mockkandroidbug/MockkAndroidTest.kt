package com.github.spheniscine.mockkandroidbug

import android.support.test.runner.AndroidJUnit4
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MockkAndroidTest {
    val classUnderTest : ClassUnderTest = mockk()

    @Test
    fun propertyTest() {
        every {classUnderTest.property} returns "Hello MockK" // fails with NullPointerException

        assertEquals("Hello MockK", classUnderTest.property)
    }

    @Test
    fun openPropertyTest() {
        every {classUnderTest.openProperty} returns "Hello MockK" // passes

        assertEquals("Hello MockK", classUnderTest.openProperty)
    }

    @Test
    fun functionTest() {
        every {classUnderTest.function()} returns "Hello MockK" // fails with NullPointerException

        assertEquals("Hello MockK", classUnderTest.function())
    }

    @Test
    fun openFunctionTest() {
        every {classUnderTest.openFunction()} returns "Hello MockK" // passes

        assertEquals("Hello MockK", classUnderTest.openFunction())
    }

    @Test
    fun indyFunctionTest() {
        every {classUnderTest.indyFunction()} returns "Hello MockK" // fails with "Missing calls inside every{...} block"

        assertEquals("Hello MockK", classUnderTest.indyFunction())
    }

    @Test
    fun openIndyFunctionTest() {
        every {classUnderTest.openIndyFunction()} returns "Hello MockK" // passes

        assertEquals("Hello MockK", classUnderTest.openIndyFunction())
    }
}