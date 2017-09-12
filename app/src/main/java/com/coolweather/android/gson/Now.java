package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vision on 2017/8/5.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    @SerializedName("wind")
    public Wind wind;

    public class More{
        @SerializedName("txt")
        public String info;
    }

    public class Wind{
        public String dir;
        public String sc;
    }
}
