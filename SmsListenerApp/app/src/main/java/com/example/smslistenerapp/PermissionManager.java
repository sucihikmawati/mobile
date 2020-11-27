package com.example.smslistenerapp;

import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;

public class PermissionManager {
    public static void check(MainActivity activity, String permission, int requestCode) {
        if (ActivityCompat.checkSelfPermission(activity, permission) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity, new String[]{permission}, requestCode);
        }
    }
}