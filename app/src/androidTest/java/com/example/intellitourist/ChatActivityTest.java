package com.example.intellitourist;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertNotNull;

//Integration Test
public class ChatActivityTest {

    @Rule
    public ActivityTestRule<ChatActivity> mChatActivityTestRule = new ActivityTestRule <ChatActivity>(ChatActivity.class);

    private ChatActivity mchatactivity = null;


    @Before
    public void setUp() throws Exception {

        mchatactivity = mChatActivityTestRule.getActivity();
    }


    @Test
    public void testLaunch(){
        View view = mchatactivity.findViewById(R.id.textView33);
        View view1 = mchatactivity.findViewById(R.id.BotView);
        View view2 = mchatactivity.findViewById(R.id.RequestTF);
        View view3 = mchatactivity.findViewById(R.id.button12);
        View view4 = mchatactivity.findViewById(R.id.button13);
        View view5 = mchatactivity.findViewById(R.id.AnswerTV);

        assertNotNull(view);
        assertNotNull(view1);
        assertNotNull(view2);
        assertNotNull(view3);
        assertNotNull(view4);
        assertNotNull(view5);

    }

    @Test
    public void clearTextTest(){
        onView(withId(R.id.RequestTF)).perform(typeText("Festivals"));
        onView(withId(R.id.button13)).perform(clearText());
    }


    @Test
    public void sendMessageAndGetResponseBack(){
        onView(withId(R.id.RequestTF)).perform(typeText("Festivals"));
        onView(withId(R.id.button12)).perform(scrollTo()).perform(click());
        onView(withId(R.id.AnswerTV)).perform(typeText("Dublin has great festivals to visit"));

    }




    @After
    public void tearDown() throws Exception {
        mchatactivity = null;
    }
}