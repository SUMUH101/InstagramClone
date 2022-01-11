package com.swarrican.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("jroapDPQbEPsbX3r8GoOwuDJAzxYuAqJUX0e8e4m")
                .clientKey("uRu5LdRVYv7ZrzRqAei3Bdj0fZOk7kqNiQqBlwHx")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
