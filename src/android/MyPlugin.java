package org.apache.cordova.myplugin;

import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by lizhiping on 4/25/16.
 */
public class MyPlugin extends CordovaPlugin {

    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException{
        test(args);
        return true;
    }

    private void test(JSONArray args) throws JSONException
    {
        this.cordova.getThreadPool().execute(new Runnable() {
            public void run() {
                Log.e("test", "test");
            }
        });
    }
}
