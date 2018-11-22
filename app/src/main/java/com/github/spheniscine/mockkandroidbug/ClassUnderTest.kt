package com.github.spheniscine.mockkandroidbug

open class ClassUnderTest {
    private val dependency = Dependency()

    val property get() = dependency.generateAnswer()

    open val openProperty get() = dependency.generateAnswer()

    fun function() =  dependency.generateAnswer()

    open fun openFunction() = dependency.generateAnswer()

    val indyProperty = "Hello Kotlin"

    open val openIndyProperty = "Hello Kotlin"

    fun indyFunction() = "Hello Kotlin"

    open fun openIndyFunction() = "Hello Kotlin"
}