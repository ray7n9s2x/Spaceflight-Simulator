package androidx.loader.app.services;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.loader.app.services.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.loader.app.services.۠۟ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0007 {

    /* JADX INFO: renamed from: ۟ۥۥۨۥ, reason: not valid java name and contains not printable characters */
    public static int f5 = -435;

    /* JADX INFO: renamed from: ۟۟۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static void m354(Object obj, boolean z) {
        if (C0006.m321() >= 0) {
            ((AccessibleObject) obj).setAccessible(z);
        }
    }

    /* JADX INFO: renamed from: ۟۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m355(Object obj, int i) {
        if (C0006.m321() >= 0) {
            l.k(obj, i);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static void m356(Object obj, Object obj2) {
        if (C0005.m280() > 0) {
            ((ScrollView) obj).addView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static void m357(Object obj) throws IOException {
        if (C0006.m321() > 0) {
            ((URLConnection) obj).connect();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static int m358(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static LinearLayout.LayoutParams m359(int i) {
        if (C0006.m321() > 0) {
            return l.h(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۧۢ, reason: not valid java name and contains not printable characters */
    public static String m360() {
        if (C0006.m321() > 0) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static void m361(Object obj, boolean z) {
        if (C0006.m321() > 0) {
            ((ScrollView) obj).setFillViewport(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥۦۡ, reason: not valid java name and contains not printable characters */
    public static AssetManager m362(Object obj) {
        if (m364() > 0) {
            return ((Context) obj).getAssets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۤۡ, reason: not valid java name and contains not printable characters */
    public static String m363(Object obj, Object obj2) {
        if (C0005.m280() >= 0) {
            return ((JSONObject) obj).getString((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۦ, reason: not valid java name and contains not printable characters */
    public static int m364() {
        return (-759) ^ C0006.f4;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m365(Object obj, int i) {
        if (C0005.m280() > 0) {
            return Base64.decode((String) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۢ, reason: not valid java name and contains not printable characters */
    public static URLConnection m366(Object obj) {
        if (C0005.m280() >= 0) {
            return ((URL) obj).openConnection();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m367(Object obj, Object obj2) {
        if (m364() > 0) {
            C0006.m342((Context) obj, (Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m368(Object obj) {
        if (C0005.m280() >= 0) {
            return ((ByteArrayOutputStream) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۦۧ, reason: not valid java name and contains not printable characters */
    public static ImageView.ScaleType m369() {
        if (C0005.m280() >= 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۡۥ, reason: not valid java name and contains not printable characters */
    public static void m370(Object obj, int i, int i2, int i3, int i4) {
        if (C0005.m280() > 0) {
            ((View) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static String m371(Object obj) {
        if (C0005.m280() >= 0) {
            return ((StringBuilder) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static View m372(Object obj, int i) {
        if (C0005.m280() >= 0) {
            return ((View) obj).findViewById(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢۧ, reason: not valid java name and contains not printable characters */
    public static void m373(Object obj, Object obj2) {
        if (C0006.m321() > 0) {
            ((ViewGroup) obj).addView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static void m375(Object obj, Object obj2) {
        if (C0006.m321() >= 0) {
            ((Context) obj).startActivity((Intent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m376(Object obj, Object obj2) {
        if (m364() >= 0) {
            ((Throwable) obj).addSuppressed((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m377(Object obj) {
        if (C0006.m321() >= 0) {
            ((Toast) obj).show();
        }
    }

    /* JADX INFO: renamed from: ۣۨۡۧ, reason: not valid java name and contains not printable characters */
    public static int m378(Object obj, int i) {
        if (m364() > 0) {
            return l.d((Resources) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۦ۠, reason: not valid java name and contains not printable characters */
    public static void m379(Object obj, Object obj2, Object obj3) {
        if (C0005.m280() >= 0) {
            C0005.m310((Context) obj, (String) obj2, (View) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۨ۠, reason: contains not printable characters */
    public static void m380(Object obj, Object obj2) {
        if (C0006.m321() >= 0) {
            C0006.m330((Context) obj, (Exception) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۧۥۢ, reason: contains not printable characters */
    public static void m381(Object obj, int i, float f) {
        if (m364() >= 0) {
            ((TextView) obj).setTextSize(i, f);
        }
    }

    /* JADX INFO: renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static HttpURLConnection m382(Object obj) {
        if (C0004.m271() > 0) {
            return ((b) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۤۨ, reason: contains not printable characters */
    public static String m383(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۦۤۧۤ, reason: contains not printable characters */
    public static void m384(Object obj, Object obj2, int i) {
        if (C0004.m271() > 0) {
            ((TextView) obj).setTypeface((Typeface) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۦۦ۟, reason: contains not printable characters */
    public static void m385(Object obj, boolean z) {
        if (C0004.m271() > 0) {
            ((View) obj).setClipToOutline(z);
        }
    }

    /* JADX INFO: renamed from: ۦۧ۠ۢ, reason: contains not printable characters */
    public static int m386() {
        if (C0004.m271() >= 0) {
            return Build.VERSION.SDK_INT;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۤۨ, reason: contains not printable characters */
    public static StringBuilder m387(Object obj, int i) {
        if (m364() >= 0) {
            return ((StringBuilder) obj).append(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۤ۟, reason: not valid java name and contains not printable characters */
    public static Window m388(Object obj) {
        if (m364() >= 0) {
            return ((Dialog) obj).getWindow();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m389(Object obj, Object obj2) {
        if (C0004.m271() > 0) {
            l.a.c((Context) obj, (JSONObject) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۦۣۢ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m390(Object obj) {
        if (C0004.m271() > 0) {
            return ((AlertDialog.Builder) obj).show();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۥ۠, reason: not valid java name and contains not printable characters */
    public static void m391(Object obj) {
        if (C0005.m280() > 0) {
            ((Thread) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۨۧۦ۠, reason: not valid java name and contains not printable characters */
    public static Looper m392() {
        if (C0004.m271() > 0) {
            return Looper.getMainLooper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۡ, reason: not valid java name and contains not printable characters */
    public static String m374(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
