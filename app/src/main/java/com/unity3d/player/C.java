package com.unity3d.player;

import android.view.inputmethod.InputMethodSubtype;

/* JADX INFO: loaded from: classes2.dex */
abstract class C {
    public static String a(InputMethodSubtype inputMethodSubtype) {
        return PlatformSupport.NOUGAT_SUPPORT ? inputMethodSubtype.getLanguageTag() : inputMethodSubtype.getLocale();
    }
}
