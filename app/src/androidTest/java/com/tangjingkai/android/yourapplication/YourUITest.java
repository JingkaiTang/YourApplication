package com.tangjingkai.android.yourapplication;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Jingkai Tang on 6/13/16.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class YourUITest {

    @Rule
    public ActivityTestRule<MainActivity> main = new ActivityTestRule(MainActivity.class);


    @Test
    public void testYourActivity() throws Exception {
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("YourActivity")).perform(click());

        onView(withId(R.id.ya_txt)).check(matches(withText("Hello You!")));
    }
}
