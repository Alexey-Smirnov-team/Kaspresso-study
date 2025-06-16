package com.kaspersky.kaspresso.tutorial

import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Test

class GooglePlayTest : TestCase() {

    @Test
    fun testNotSignIn() = run {

    }

    companion object {

        private const val GOOGLE_PLAY_PACKAGE = "com.android.vending"
    }
}