package com.tealeaf.plugin.plugins;
import com.tealeaf.TeaLeaf;
import com.tealeaf.logger;
import com.tealeaf.plugin.IPlugin;
import com.tealeaf.EventQueue;
import com.tealeaf.event.*;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NativeFramework implements IPlugin {

	private String TAG = "{admob}";
	private static final String ACTION_SCAN = "com.google.zxing.client.android.SCAN";
	private Activity mActivity;

	public void NativeFramework() {}
	public void onCreateApplication(Context applicationContext) {}


	public void onCreate(Activity activity, Bundle savedInstanceState) {
		mActivity = activity;
	}

	public void onResume() {}

	public void onStart() {}

	public void onPause() {}

	public void onStop() {}

	public void onDestroy() {
	}

	public void onNewIntent(Intent intent) {}

	public void setInstallReferrer(String referrer) {}

	public void onActivityResult(Integer request, Integer result, Intent data) {
	}

	public boolean consumeOnBackPressed() {
		return true;
	}

	public void onBackPressed() {}

	private static boolean getJsonBoolean(JSONObject jObject, String key) {
		if (jObject == null) {
			return false;
		}

		boolean res = false;
		try {
			res = jObject.getBoolean(key);
		} catch (Exception ex) {}
		return res;
	}

	private static String getJsonString(JSONObject jObject, String key) {
		if (jObject == null) {
			return "";
		}

		String res = "";
		try {
			res = jObject.getString(key);
		} catch (Exception ex) {}
		return res;
	}
}
