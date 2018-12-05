package com.myrmia.utils.url;

/**
 * url function
 * Created by Ellery on 2018/12/5.
 */
public class UrlUtils {

    public static String buildURL(String url) {
        if (url.endsWith("/")) {
            url = url.substring(0, url.length() - 1);
        }
        if (!url.startsWith("http")) {
            url = "http://".concat(url);
        }
        return url;
    }
}
