package com.example.intellitourist;

import android.app.Activity;
import android.app.Instrumentation;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.assertNotNull;

//Integration Test
public class GuidedActivityTest {

    @Rule
    public ActivityTestRule<GuidedActivity> mGuidedActivityTestRule = new ActivityTestRule <GuidedActivity>(GuidedActivity.class);

    private GuidedActivity mguidedactivity = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(QuestionnaireActivity.class.getName(),null,false);

    Instrumentation.ActivityMonitor monitor1 = getInstrumentation().addMonitor(TouristPointsMapsActivity.class.getName(),null,false);


    @Before
    public void setUp() throws Exception {
        mguidedactivity = mGuidedActivityTestRule.getActivity();
    }

    @Test
    public void testLaunchOfQuestionnaireActivityOnButtonClick() {
        assertNotNull(mguidedactivity.findViewById(R.id.travelBtn));

        onView(withId(R.id.travelBtn)).perform(click());

        Activity questionnaireActivity =  getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(questionnaireActivity);

        questionnaireActivity.finish();

    }

    @Test
    public void testLaunchOfTouristPointsMapsActivityOnButtonClick() {
        assertNotNull(mguidedactivity.findViewById(R.id.Guidebtn));

        onView(withId(R.id.Guidebtn)).perform(click());

        Activity touristsPointsMapsActivity =  getInstrumentation().waitForMonitorWithTimeout(monitor1,5000);

        assertNotNull(touristsPointsMapsActivity);

        touristsPointsMapsActivity.finish();

    }

    @After
    public void tearDown() throws Exception {
        mguidedactivity = null;
    }
}