package com.example.intellitourist;

import android.app.Activity;
import android.app.Instrumentation;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

public class AgeActivityTest {

    public ActivityTestRule<AgeActivity> mAgeActivityTestRule = new ActivityTestRule <AgeActivity>(AgeActivity.class);

    private AgeActivity mageactivity = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(QuestionnaireActivity.class.getName(),null,false);

    Instrumentation.ActivityMonitor monitor1 = getInstrumentation().addMonitor(BarsViewsActivity.class.getName(),null,false);


    @Before
    public void setUp() throws Exception {
        mageactivity = mAgeActivityTestRule.getActivity();
    }

    //Integration test, testing the launch of the questionnaire activity from the age activity if user is not over 18 Button
    @Test
    public void testLaunchOfQuestionnaireActivityOnButtonClick() {
        assertNotNull(mageactivity.findViewById(R.id.button14));;

        onView(withId(R.id.button14)).perform(click());

        Activity questionnaireActivity =  getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(questionnaireActivity);

        questionnaireActivity.finish();

    }

    //Integration test, testing the launch of the bars type activity from the age activity if user is over 18 Button
    @Test
    public void testLaunchOfBarsViewActivityOnButtonClick() {
        assertNotNull(mageactivity.findViewById(R.id.over18Btn));

        onView(withId(R.id.over18Btn)).perform(click());

        Activity barsViewsActivity =  getInstrumentation().waitForMonitorWithTimeout(monitor1,5000);

        assertNotNull(barsViewsActivity);

        barsViewsActivity.finish();

    }


    @After
    public void tearDown() throws Exception {
        mageactivity = null;
    }
}