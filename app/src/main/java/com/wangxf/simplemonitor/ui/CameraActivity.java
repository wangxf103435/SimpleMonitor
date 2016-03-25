package com.wangxf.simplemonitor.ui;

import android.app.Activity;
import android.os.Bundle;

import com.wangxf.simplemonitor.R;
import com.wangxf.simplemonitor.camera.CameraFactory;
import com.wangxf.simplemonitor.camera.CameraPreview;

public class CameraActivity extends Activity {
    private CameraPreview mCamerePreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        mCamerePreview = (CameraPreview) findViewById(R.id.camera_preview);
        mCamerePreview.setCamera(CameraFactory.createCameraInstance());
    }
}
