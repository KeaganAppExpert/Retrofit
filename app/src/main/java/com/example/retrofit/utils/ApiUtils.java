package com.example.retrofit.utils;

import com.example.retrofit.data.remote.RetrofitClient;
import com.example.retrofit.data.remote.SOService;

public class ApiUtils {
    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
