package com.wangxf.simplemonitor.utils;

import android.util.Log;

/**
 * Log统一管理类
 */
public class LogUtil {

	private LogUtil() {
		throw new UnsupportedOperationException("cannot be instantiated");
	}

	public static boolean isDebug = true;
	private static final String TAG = "simplemonitor";
	private static final String BOUNDARY = "==>";

	public static void i(String msg) {
		if (isDebug)
			Log.i(TAG, BOUNDARY + msg);
	}

	public static void d(String msg) {
		if (isDebug)
			Log.d(TAG, BOUNDARY + msg);
	}

	public static void e(String msg) {
		if (isDebug)
			Log.e(TAG, BOUNDARY + msg);
	}

	public static void v(String msg) {
		if (isDebug)
			Log.v(TAG, BOUNDARY + msg);
	}

	public static void i(String tag, String msg) {
		if (isDebug)
			Log.i(tag, BOUNDARY + msg);
	}

	public static void d(String tag, String msg) {
		if (isDebug)
			Log.d(tag, BOUNDARY + msg);
	}

	public static void e(String tag, String msg) {
		if (isDebug)
			Log.e(tag, BOUNDARY + msg);
	}

	public static void v(String tag, String msg) {
		if (isDebug)
			Log.v(tag, BOUNDARY + msg);
	}
}