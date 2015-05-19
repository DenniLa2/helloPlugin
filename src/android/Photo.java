package com.getface.plugin.camera;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Photo extends CordovaPlugin {
    protected void pluginInitialize() {
    }
    
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext)
    throws JSONException {
        if (action.equals("cam1")) {
            cam1(args.getString(0), args.getString(1), args.getString(2), callbackContext);
            return true;
        } else if (action.equals("cam2")) {
            cam2(args.getString(0), args.getString(1), args.getString(2), callbackContext);
            return true;
        }
        return false;
    }
    
    private synchronized void cam1(final String title,
                                    final String message,
                                    final String buttonLabel,
                                    final CallbackContext callbackContext) {
        new AlertDialog.Builder(cordova.getActivity())
        .setTitle(title)
        .setMessage(message)
        .setCancelable(false)
        .setNeutralButton(buttonLabel, new AlertDialog.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.dismiss();
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, 0));
            }
        })
        .create()
        .show();
    }
    
    private synchronized void cam2(final String title,
                                    final String message,
                                    final String buttonLabel,
                                    final CallbackContext callbackContext) {
        new AlertDialog.Builder(cordova.getActivity())
        .setTitle(title)
        .setMessage(message)
        .setCancelable(true)
        .setNeutralButton(buttonLabel, new AlertDialog.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.dismiss();
                callbackContext.success(message);
                callbackContext.error("case error!");
            }
        })
        .create()
        .show();
    }
    
    
}