package com.example.myapplication

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityWithRobolectricTest {

    @Test fun hello_with_somkiat() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.name_textview)).perform(replaceText("somkiat"))
        onView(withId(R.id.hello_button)).perform(click())
    }
}