package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author TonyTu
 * @version 1.0
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}

