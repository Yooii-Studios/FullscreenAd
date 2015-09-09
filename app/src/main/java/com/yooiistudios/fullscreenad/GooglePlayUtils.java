package com.yooiistudios.fullscreenad;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

/**
 * Created by StevenKim in Morning Kit from Yooii Studios Co., LTD. on 2014. 1. 28.
 *
 * MNReviewApp
 */
public class GooglePlayUtils {
    public static int REQ_REVIEW_APP = 4444;

    public static void openMorningKitAtGooglePlay(Context context) {
        Uri uri = Uri.parse(getMorningKitLink(context));
        openGooglePlay(context, uri);
    }

    public static void openNewsKitAtGooglePlay(Context context) {
        Uri uri = Uri.parse(getNewsKitLink(context));
        openGooglePlay(context, uri);
    }

    public static String getMorningKitLink(Context context) {
        return "market://details?id=com.yooiistudios.morningkit";
    }

    public static String getNewsKitLink(Context context) {
        return "market://details?id=com.yooiistudios.newskit";
    }

    private static void openGooglePlay(Context context, Uri uri) {
        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
        try {
            ((Activity)context).startActivityForResult(goToMarket, REQ_REVIEW_APP);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(context, "Couldn't launch the market", Toast.LENGTH_SHORT).show();
        }
    }
}
