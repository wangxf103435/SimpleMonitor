package com.wangxf.simplemonitor.camera;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;

/**
 * Created by WanngXuefeng on 2016/3/25.
 */
public class CameraFactory {

    public static Camera createCameraInstance() {
        try {
            return Camera.open();
        } catch (Exception e) {
        }
        return null;
    }

    public static Camera createCameraInstance(int cameraId) {
        try {
            return Camera.open(cameraId);
        } catch (Exception e) {
        }
        return null;
    }

    public static boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
            return true;
        }
        return false;
    }
}
