package com.example.intellitourist;

import android.app.Activity;
import android.app.Instrumentation;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.assertNotNull;

//Integration Test
public class RegisterActivityTest {

    @Rule
    public ActivityTestRule<RegisterActivity> mRegisterActivityTestRule = new ActivityTestRule <RegisterActivity>(RegisterActivity.class);

    private RegisterActivity mregisteractivity = null ;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(LoginActivity.class.getName(),null,false);

    Instrumentation.ActivityMonitor monitor1 = getInstrumentation().addMonitor(OptionsActivity.class.getName(),null,false);


    @Before
    public void setUp() throws Exception {

        mregisteractivity = mRegisterActivityTestRule.getActivity();
    }


    // UI/system test for registering.
    @Test
    public void registerAccountOnButtonClick(){
        Espresso.onView(withId(R.id.UserNameTF)).perform(typeText("Jack678"));
        Espresso.onView(withId(R.id.EmailAddressTF)).perform(typeText("Jackgallaher78907@gmail.com"));
        Espresso.onView(withId(R.id.PassTF)).perform(typeText("access123"));
        Espresso.closeSoftKeyboard();

        onView(withId(R.id.regBtn)).perform(scrollTo()).perform(click());

        Activity optionsActivity =  getInstrumentation().waitForMonitorWithTimeout(monitor1,5000);

        assertNotNull(optionsActivity);

        optionsActivity.finish();

    }

    // Integration test for testing the launch of login activity from register activity
    @Test
    public void testLaunchOfLoginActivityOnButtonClick(){
        assertNotNull(mregisteractivity.findViewById(R.id.button));

        onView(withId(R.id.button)).perform(click());

        Activity loginActivity =  getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(loginActivity);

        loginActivity.finish();


    }


    @After
    public void tearDown() throws Exception {
        mregisteractivity = null;
    }
}