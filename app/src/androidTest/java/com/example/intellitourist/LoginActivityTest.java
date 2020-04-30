package com.example.intellitourist;

import android.app.Activity;
import android.app.Instrumentation;
import android.view.View;

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
import static org.junit.Assert.assertNull;

//Integration Test
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mLoginActivityTestRule = new ActivityTestRule <LoginActivity>(LoginActivity.class);

    private LoginActivity mloginactivity = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(OptionsActivity.class.getName(),null,false);

    Instrumentation.ActivityMonitor monitor1 = getInstrumentation().addMonitor(OptionsActivity.class.getName(),null,false);


    @Before
    public void setUp() throws Exception {

        mloginactivity = mLoginActivityTestRule.getActivity();
    }

    // Integration test for launching the login activity.
    @Test
    public void testLaunch(){

        View view = mloginactivity.findViewById(R.id.textView7);
        View view1 = mloginactivity.findViewById(R.id.NameTF);
        View view2 = mloginactivity.findViewById(R.id.EmailTF);
        View view3 = mloginactivity.findViewById(R.id.PasswordTF);
        View view4 = mloginactivity.findViewById(R.id.Login);
        View view5 = mloginactivity.findViewById(R.id.textView13);
        View view6 = mloginactivity.findViewById(R.id.button2);

        assertNotNull(view);
        assertNotNull(view1);
        assertNotNull(view2);
        assertNotNull(view3);
        assertNotNull(view4);
        assertNotNull(view5);
        assertNotNull(view6);
    }


    // Integration test for checking for blanks
    @Test
    public void errorMessageForBlanks() {
        assertNotNull(mloginactivity.findViewById(R.id.Login));

        onView(withId(R.id.Login)).perform(click());

        Activity optionsActivity =  getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNull(optionsActivity);

    }

    // UI/system test for logging in
    @Test
    public void testLogin(){
        Espresso.onView(withId(R.id.NameTF)).perform(typeText("jack678"));
        Espresso.onView(withId(R.id.EmailTF)).perform(typeText("jack38@gmail.com"));
        Espresso.onView(withId(R.id.PasswordTF)).perform(typeText("jack1997"));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Login)).perform(scrollTo()).perform(click());

        Activity optionsActivity =  getInstrumentation().waitForMonitorWithTimeout(monitor1,5000);

        assertNotNull(optionsActivity);

        optionsActivity.finish();

    }


    @After
    public void tearDown() throws Exception {

        mloginactivity = null;
    }
}