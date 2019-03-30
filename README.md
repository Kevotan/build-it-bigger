# Build it Bigger

This App will consist of four modules. A Java library that provides jokes, 
a Google Cloud Endpoints(GCE) project that serves those jokes, an Android Library
containing anactivity for displaying jokes, and an Android app that fetches jokes 
from the GCE module and passes them to the Android Library for display.

<p float="left">
  <img src ="https://github.com/Kevotan/build-it-bigger/blob/master/screenshot-telljoke.jpg" width="300">
  <img src ="https://github.com/Kevotan/build-it-bigger/blob/master/screenshot-joke.jpg" width="300">
</p>

## Overview

* Project contains a Java library for supplying jokes
* Project contains an Android library with an activity that displays jokes passed to it as intent extras.
* Project contains a Google Cloud Endpoints module that supplies jokes from the Java library. Project loads jokes from GCE module via an async task.
* Project contains connected tests to verify that the async task is indeed loading jokes.
* Project contains paid/free flavors. The paid flavor has no ads, and no unnecessary dependencies.

## Behavior

* App retrieves jokes from Google Cloud Endpoints module and displays them via an Activity from the Android Library.

