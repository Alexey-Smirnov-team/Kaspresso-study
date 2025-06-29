package com.kaspersky.kaspresso.tutorial

import com.kaspersky.kaspresso.internal.exceptions.AdbServerException
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Assert
import org.junit.Test

class AdbTest : TestCase() {

    @Test
    fun test() {
        val result = adbServer.performAdb("devices")
        Assert.assertTrue("emulator" in result.first())

        val command = "undefined_command"
        try {
            adbServer.performAdb(command)
        } catch (e: AdbServerException) {
            Assert.assertTrue("unknown command $command" in e.message)
        }
    }
}