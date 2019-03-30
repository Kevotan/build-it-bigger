package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest {

    @Test
    public void testGetJokeTask() throws ExecutionException, InterruptedException {
        EndpointAsyncTask testJoke = new EndpointAsyncTask(new EndpointAsyncTask.Callback() {
            @Override
            public void onFinished(String result) {

            }
        });
        testJoke.execute();
        String joke = testJoke.get();
        assertNotNull(joke);
    }
}