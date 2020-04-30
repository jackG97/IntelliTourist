package com.example.intellitourist;

import android.app.Instrumentation;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiSelector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

//Integration Test
public class MuseumsTypeMapsActivityTest {
    public ActivityTestRule<MuseumsTypeMapsActivity> mMuseumsTypeMapsActivityTestRule = new ActivityTestRule <MuseumsTypeMapsActivity>(MuseumsTypeMapsActivity.class);

    private MuseumsTypeMapsActivity mmuseumstypemapsactivity = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(MuseumsTypeMapsActivity.class.getName(),null,false);


    @Before
    public void setUp() throws Exception {
        mmuseumstypemapsactivity = mMuseumsTypeMapsActivityTestRule.getActivity();
    }

    //integration test to launch the maps activity for museums by type
    @Test
    public void launchMuseumsTypeMap() throws UiObjectNotFoundException {

        UiDevice device = UiDevice.getInstance(getInstrumentation());
        UiObject marker = device.findObject(new UiSelector().descriptionContains("The Hugh Lane, Art Museum"));


        UiDevice device1 = UiDevice.getInstance(getInstrumentation());
        UiObject marker1 = device1.findObject(new UiSelector().descriptionContains("National Gallery, Art Museum"));


        UiDevice device2 = UiDevice.getInstance(getInstrumentation());
        UiObject marker2 = device2.findObject(new UiSelector().descriptionContains("Irish Famine Exhibition, History Museum"));


        UiDevice device3 = UiDevice.getInstance(getInstrumentation());
        UiObject marker3 = device3.findObject(new UiSelector().descriptionContains("EPIC The Irish Emigration Museum, History Museum"));


        UiDevice device4 = UiDevice.getInstance(getInstrumentation());
        UiObject marker4 = device4.findObject(new UiSelector().descriptionContains("Science Gallery Dublin, Science Museum"));


        UiDevice device5 = UiDevice.getInstance(getInstrumentation());
        UiObject marker5 = device5.findObject(new UiSelector().descriptionContains("Science Gallery International, Science Museum"));

    }

    // UI/system test for testing the filtering buttons on the museums maps activity.
    @Test
    public void filterArtMuseumsOnly() {

        assertNotNull(mmuseumstypemapsactivity.findViewById(R.id.ArtBtn));

        Espresso.onView(withId(R.id.ArtBtn)).perform(scrollTo()).perform(click());

        UiDevice device = UiDevice.getInstance(getInstrumentation());
        UiObject marker = device.findObject(new UiSelector().descriptionContains("The Hugh Lane, Art Museum"));


        UiDevice device1 = UiDevice.getInstance(getInstrumentation());
        UiObject marker1 = device1.findObject(new UiSelector().descriptionContains("National Gallery, Art Museum"));

    }

    @Test
    public void filterScienceMuseumsOnly() throws UiObjectNotFoundException {

        assertNotNull(mmuseumstypemapsactivity.findViewById(R.id.ScienceBtn));

        onView(withId(R.id.ScienceBtn)).perform(scrollTo()).perform(click());

        UiDevice device = UiDevice.getInstance(getInstrumentation());
        UiObject marker = device.findObject(new UiSelector().descriptionContains("Science Gallery Dublin, Science Museum"));
        assertTrue(marker.click());

        UiDevice device1 = UiDevice.getInstance(getInstrumentation());
        UiObject marker1 = device1.findObject(new UiSelector().descriptionContains("Science Gallery International, Science Museum"));
        assertTrue(marker1.click());

    }

    @Test
    public void filterHistoryMuseumsOnly() throws UiObjectNotFoundException {

        assertNotNull(mmuseumstypemapsactivity.findViewById(R.id.HistoryBtn));

        onView(withId(R.id.HistoryBtn)).perform(scrollTo()).perform(click());

        UiDevice device = UiDevice.getInstance(getInstrumentation());
        UiObject marker = device.findObject(new UiSelector().descriptionContains("EPIC The Irish Emigration Museum, History Museum"));
        assertTrue(marker.click());

        UiDevice device1 = UiDevice.getInstance(getInstrumentation());
        UiObject marker1 = device1.findObject(new UiSelector().descriptionContains("Irish Famine Exhibition, History Museum"));
        assertTrue(marker1.click());

    }

    @After
    public void tearDown() throws Exception {
        mmuseumstypemapsactivity = null;
    }
}