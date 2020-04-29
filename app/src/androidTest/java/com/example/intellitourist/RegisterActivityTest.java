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
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
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


    @Test
    public void registerAccountOnButtonClick(){
        onView(withId(R.id.UserNameTF)).perform(closeSoftKeyboard()).perform(typeText("Jack678"));
        onView(withId(R.id.EmailAddressTF)).perform(closeSoftKeyboard()).perform(typeText("Jackgallaher78907@gmail.com"));
        onView(withId(R.id.PassTF)).perform(closeSoftKeyboard()).perform(typeText("access123"));

        assertNotNull(mregisteractivity.findViewById(R.id.regBtn));

        onView(withId(R.id.regBtn)).perform(scrollTo()).perform(click());

        Activity optionsActivity =  getInstrumentation().waitForMonitorWithTimeout(monitor1,5000);

        assertNotNull(optionsActivity);

        optionsActivity.finish();

    }

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