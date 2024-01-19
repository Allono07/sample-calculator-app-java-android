package com.devdroid.calculator;
import com.webengage.sdk.android.WebEngageConfig;
import com.webengage.sdk.android.WebEngageActivityLifeCycleCallbacks;
public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        WebEngageConfig webEngageConfig = new WebEngageConfig.Builder()
                .setWebEngageKey("~1341056cd")
                .setDebugMode(true) // only in development mode
                .build();
        registerActivityLifecycleCallbacks(new WebEngageActivityLifeCycleCallbacks(this, webEngageConfig));

    }
}
