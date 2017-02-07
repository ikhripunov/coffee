package com.google.android.gms.samples.vision.ocrreader;

import android.os.AsyncTask;

import com.google.android.gms.samples.vision.ocrreader.http.client.StaticHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;


public class AsyncHttpTask extends AsyncTask<String, String, String> {
    String foo;
    @Override
    protected String doInBackground(String... params) {
        StaticHttpClient.get("products", null, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                foo = response.toString();
            }
        });
        return foo;
    }
}
