package com.yooiistudios.fullscreenad;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Wooseong Kim in FullscreenAd from Yooii Studios Co., LTD. on 15. 9. 15.
 *
 * FullscreenAdUtils
 *  각 광고를 실행해주는 유틸
 */
public class FullscreenAdUtils {
    private FullscreenAdUtils() {
        throw new AssertionError("You MUST NOT create the instance of this class!!");
    }

    public static void showMorningKitAd(Context context) {
        context.startActivity(new Intent(context, MorningKitAdActivity.class));
    }

    public static void showNewsKitAd(Context context) {
        context.startActivity(new Intent(context, NewsKitAdActivity.class));
    }
}
