//package com.moringaschool.restaurant;
//
//import static org.junit.Assert.assertTrue;
//
//import android.content.Intent;
//import android.widget.TextView;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.robolectric.Robolectric;
//import org.robolectric.RobolectricTestRunner;
//import org.robolectric.shadows.ShadowActivity;
//
//@RunWith(RobolectricTestRunner.class)
//    public class MainActivityTest {
//        private MainActivity activity;
//
//        @Before
//        public void setUp() throws Exception {
//            activity = Robolectric.buildActivity(MainActivity.class)
//                    .create()
//                    .resume()
//                    .get();
//        }
//        @Test
//        public void secondActivityStarted() {
//            activity.findViewById(R.id.findRestaurantsButton).performClick();
//            Intent expectedIntent = new Intent(activity, RestaurantsActivity.class);
//            ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
//            Intent actualIntent = shadowActivity.getNextStartedActivity();
//            assertTrue(actualIntent.filterEquals(expectedIntent));
//        }
//
//    }
