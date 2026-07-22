package androidx.loader.app.services;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URLConnection;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.loader.app.services.ۥۥۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0008 {

    /* JADX INFO: renamed from: ۟ۧ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static int f6 = -274;

    /* JADX INFO: renamed from: ۟۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m393(Object obj, Object obj2) throws ProtocolException {
        if (C0004.m271() > 0) {
            ((HttpURLConnection) obj).setRequestMethod((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m394(Object obj) {
        if (C0005.m280() >= 0) {
            return ((HttpURLConnection) obj).getResponseCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static void m395(Object obj) {
        if (C0004.m271() > 0) {
            ((Dialog) obj).show();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static InputStream m396(Object obj) {
        if (C0005.m280() > 0) {
            return ((URLConnection) obj).getInputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m397(Object obj, Object obj2) {
        if (C0005.m280() >= 0) {
            return ((String) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Throwable m398(Object obj) {
        if (C0006.m321() >= 0) {
            return ((i) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۥۤ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m399(Object obj, Object obj2, Object obj3) {
        if (C0005.m280() >= 0) {
            return ((AlertDialog.Builder) obj).setPositiveButton((CharSequence) obj2, (DialogInterface.OnClickListener) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static int m400(Object obj) {
        if (C0007.m364() > 0) {
            return ((View) obj).getWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧۡۤ, reason: not valid java name and contains not printable characters */
    public static void m401(Object obj, Object obj2) {
        if (C0005.m280() >= 0) {
            C0006.m323((Context) obj, (JSONObject) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m402(Object obj, int i, Object obj2) {
        if (C0006.m321() > 0) {
            ((Drawable) obj).setColorFilter(i, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۢۤ, reason: not valid java name and contains not printable characters */
    public static Constructor m403(Object obj, Object obj2) {
        if (C0006.m321() > 0) {
            return ((Class) obj).getDeclaredConstructor((Class[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۢ, reason: not valid java name and contains not printable characters */
    public static String m404(Object obj, Object obj2) {
        if (C0007.m364() >= 0) {
            return C0006.m319((String) obj, (Charset) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Context m405(Object obj) {
        if (C0006.m321() >= 0) {
            return ((i) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m406(Object obj, Object obj2, int i) {
        if (C0004.m271() >= 0) {
            return ((PackageManager) obj).getPackageInfo((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۨ, reason: not valid java name and contains not printable characters */
    public static DisplayMetrics m408(Object obj) {
        if (C0004.m271() > 0) {
            return ((Resources) obj).getDisplayMetrics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤۥ, reason: not valid java name and contains not printable characters */
    public static Intent m409(Object obj, int i) {
        if (C0005.m280() >= 0) {
            return ((Intent) obj).setFlags(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۨ, reason: not valid java name and contains not printable characters */
    public static void m410(Object obj, Object obj2) {
        if (C0007.m364() >= 0) {
            ((ImageView) obj).setImageBitmap((Bitmap) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m411(Object obj, Object obj2) {
        if (C0007.m364() > 0) {
            C0006.m341((String) obj, (Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۧۢ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m412(Object obj, Object obj2) {
        if (C0006.m321() > 0) {
            return ((StringBuilder) obj).append((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static Toast m413(Object obj, Object obj2, int i) {
        if (C0006.m321() > 0) {
            return Toast.makeText((Context) obj, (CharSequence) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static Bitmap m414() {
        if (C0007.m364() > 0) {
            return a.a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static int m415(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۤۡۧ, reason: not valid java name and contains not printable characters */
    public static void m416(Object obj, boolean z) {
        if (C0005.m280() > 0) {
            ((ImageView) obj).setAdjustViewBounds(z);
        }
    }

    /* JADX INFO: renamed from: ۢۥۦۨ, reason: not valid java name and contains not printable characters */
    public static JSONObject m417(Object obj) {
        if (C0007.m364() > 0) {
            return ((j) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m418(Object obj) {
        if (C0006.m321() >= 0) {
            return ((String) obj).trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۤۦ, reason: not valid java name and contains not printable characters */
    public static int m419() {
        return 49 ^ C0006.f4;
    }

    /* JADX INFO: renamed from: ۤۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Handler m420() {
        if (C0004.m271() >= 0) {
            return l.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m421(Object obj) {
        if (C0005.m280() > 0) {
            return Log.getStackTraceString((Throwable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۡۦ, reason: not valid java name and contains not printable characters */
    public static InputStream m422(Object obj) {
        if (C0005.m280() > 0) {
            return ((HttpURLConnection) obj).getErrorStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧۧ, reason: not valid java name and contains not printable characters */
    public static String m423(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۤۨ۠۠, reason: not valid java name and contains not printable characters */
    public static void m424(Object obj, int i) {
        if (C0006.m321() > 0) {
            ((View) obj).setId(i);
        }
    }

    /* JADX INFO: renamed from: ۥۡۧ۠, reason: contains not printable characters */
    public static Object m425() {
        if (C0004.m271() >= 0) {
            return l.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۦۥ, reason: contains not printable characters */
    public static Intent m426(Object obj, Object obj2) {
        if (C0004.m271() > 0) {
            return ((Intent) obj).setData((Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧۨ, reason: contains not printable characters */
    public static AlertDialog.Builder m427(Object obj, Object obj2) {
        if (C0007.m364() >= 0) {
            return ((AlertDialog.Builder) obj).setMessage((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۦ, reason: contains not printable characters */
    public static Spanned m428(Object obj, int i) {
        if (C0004.m271() > 0) {
            return Html.fromHtml((String) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ۟۟, reason: contains not printable characters */
    public static void m429(Object obj, Object obj2) {
        if (C0004.m271() >= 0) {
            ((View) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m430(Object obj) {
        if (C0004.m271() >= 0) {
            return c.a((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۥۧ, reason: not valid java name and contains not printable characters */
    public static int m431(Object obj) {
        if (C0004.m271() >= 0) {
            return ((View) obj).getHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m432(Object obj, Object obj2, int i, int i2) {
        if (C0005.m280() >= 0) {
            ((ByteArrayOutputStream) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static PackageManager m433(Object obj) {
        if (C0007.m364() >= 0) {
            return ((Context) obj).getPackageManager();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m434(Object obj, Object obj2) {
        if (C0006.m321() >= 0) {
            return ((Constructor) obj).newInstance((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡ۟, reason: not valid java name and contains not printable characters */
    public static String m407(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
