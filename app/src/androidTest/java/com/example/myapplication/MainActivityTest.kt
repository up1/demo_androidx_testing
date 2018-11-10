package com.example.myapplication

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test fun hello_with_somkiat() {
        ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.name_textview)).perform(replaceText("somkiat"), closeSoftKeyboard())
        onView(withId(R.id.hello_button)).perform(click())
    }
}