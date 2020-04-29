package com.example.intellitourist;

import androidx.test.rule.ActivityTestRule;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiSelector;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

//Integration Test
public class TouristPointsMapsActivityTest {

    @Rule
    public ActivityTestRule<TouristPointsMapsActivity> mTouristPointsMapsActivityTestRule = new ActivityTestRule <TouristPointsMapsActivity>(TouristPointsMapsActivity.class);

    private TouristPointsMapsActivity mtouristpointsmapsactivity = null;

    @Before
    public void setUp() throws Exception {

        mtouristpointsmapsactivity = mTouristPointsMapsActivityTestRule.getActivity();
    }

    @Test
    public void testLaunchOfTouristPointsMapsActivity() throws UiObjectNotFoundException {

        UiDevice device = UiDevice.getInstance(getInstrumentation());
        UiObject marker = device.findObject(new UiSelector().descriptionContains("Dublin Visitor Centre, O'Connell Street").descriptionContains("Tourist Guide point"));
        marker.click();

        UiDevice device1 = UiDevice.getInstance(getInstrumentation());
        UiObject marker1 = device.findObject(new UiSelector().descriptionContains("Posto Turismo").descriptionContains("Tourist Guide point"));
        marker1.click();

        UiDevice device2 = UiDevice.getInstance(getInstrumentation());
        UiObject marker2 = device.findObject(new UiSelector().descriptionContains("Dublin Visitor Centre, Dame Street").descriptionContains("Tourist Guide point"));
        marker2.click();

    }


    @After
    public void tearDown() throws Exception {

        mtouristpointsmapsactivity = null;
    }
}