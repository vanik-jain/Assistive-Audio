package com.vapps.assistiveaudio;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;


 class FrescoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this, ImagePipelineConfigFactory.getImagePipelineConfig(this));
    }

}
