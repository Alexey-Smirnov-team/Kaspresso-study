package com.kaspersky.kaspresso.tutorial

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.kaspersky.kaspresso.tutorial.screen.FlakyScreen
import com.kaspersky.kaspresso.tutorial.screen.MainScreen
import org.junit.Rule
import org.junit.Test

class FlakyScreenTest : TestCase() {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun checkFlakyScreen() = run {
        step("Open flaky screen") {
            MainScreen {
                flakyActivityButton {
                    isVisible()
                    isClickable()
                    click()
                }
            }
        }
        step("Check initial elements") {
            FlakyScreen {
                text1.isVisible()
                text2.isVisible()
                text3.isVisible()
                text4.isVisible()
                text5.isVisible()
                progressBar1.isVisible()
                progressBar2.isVisible()
                progressBar3.isVisible()
                progressBar4.isVisible()
                progressBar5.isVisible()
            }
        }
        step("Check first element after loading") {
            FlakyScreen {
                flakySafely(3000) {
                    text1.hasText(R.string.text_1)
                    progressBar1.isGone() // Проверяем, что ProgressBar невидимый
                }
            }
        }
    }
}