package androidx.loader.app.services;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.Spanned;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.loader.app.services.b;
import androidx.loader.app.services.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: androidx.loader.app.services.ۣ۟ۢۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0005 {

    /* JADX INFO: renamed from: ۨۡۨۡ, reason: not valid java name and contains not printable characters */
    public static int f3 = -779;

    /* JADX INFO: renamed from: ۟۠ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m273(Object obj, boolean z) {
        if (C0006.m321() > 0) {
            return ((AlertDialog.Builder) obj).setCancelable(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Context m274(Object obj) {
        if (C0006.m321() > 0) {
            return ((j) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۡۥ, reason: not valid java name and contains not printable characters */
    public static Context m275(Object obj) {
        if (C0006.m321() > 0) {
            return ((k) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m276(Object obj, Object obj2) {
        if (C0007.m364() > 0) {
            return ((String) obj).equalsIgnoreCase((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۥۨ۟, reason: not valid java name and contains not printable characters */
    public static void m277(Object obj) throws IOException {
        if (C0007.m364() >= 0) {
            ((InputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m278(Object obj) {
        if (C0006.m321() >= 0) {
            return ((Dialog) obj).isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m279(Object obj, Object obj2) {
        if (C0004.m271() > 0) {
            return ((Handler) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۥ, reason: not valid java name and contains not printable characters */
    public static int m280() {
        return (-893) ^ C0006.f4;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static void m281(Object obj, Object obj2) {
        if (C0004.m271() >= 0) {
            ((b.a) obj).a((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۨ۟, reason: not valid java name and contains not printable characters */
    public static String m283(Object obj) {
        if (C0007.m364() >= 0) {
            return ((PackageInfo) obj).versionName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m284(Object obj) {
        if (C0006.m321() > 0) {
            return ((b) obj).a();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۡۦ, reason: not valid java name and contains not printable characters */
    public static Spanned m285(Object obj) {
        if (C0004.m271() >= 0) {
            return l.g((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۡ, reason: not valid java name and contains not printable characters */
    public static void m286(Object obj, int i) {
        if (m280() > 0) {
            ((GradientDrawable) obj).setColor(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۥۨ, reason: not valid java name and contains not printable characters */
    public static Context m287(Object obj) {
        if (C0006.m321() >= 0) {
            return ((l.a) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static void m288(Object obj, Object obj2) {
        if (C0004.m271() > 0) {
            ((ImageView) obj).setScaleType((ImageView.ScaleType) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static b.a m289(Object obj) {
        if (C0004.m271() >= 0) {
            return ((b) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static Typeface m290(Object obj, Object obj2) {
        if (C0006.m321() > 0) {
            return Typeface.createFromAsset((AssetManager) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static Method m291(Object obj, Object obj2, Object obj3) {
        if (C0004.m271() > 0) {
            return ((Class) obj).getMethod((String) obj2, (Class[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static void m292(Object obj, Object obj2) {
        if (C0004.m271() >= 0) {
            ((View) obj).setOutlineProvider((ViewOutlineProvider) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m293(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m294(Object obj, Object obj2) {
        if (C0006.m321() >= 0) {
            ((b.a) obj).b((InputStream) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۡۤ۠, reason: not valid java name and contains not printable characters */
    public static LinearLayout.LayoutParams m295(int i, float f) {
        if (C0007.m364() >= 0) {
            return l.i(i, f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m296(Object obj, Object obj2) {
        if (C0006.m321() > 0) {
            return ((AlertDialog.Builder) obj).setView((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static View m297(Object obj) {
        if (C0004.m271() >= 0) {
            return l.f(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۦۥ, reason: not valid java name and contains not printable characters */
    public static String m298(Object obj, Object obj2) {
        if (C0007.m364() > 0) {
            return URLEncoder.encode((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۨۨ, reason: not valid java name and contains not printable characters */
    public static Charset m299() {
        if (C0004.m271() >= 0) {
            return StandardCharsets.UTF_8;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۥ, reason: not valid java name and contains not printable characters */
    public static String m300(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۤۧ, reason: not valid java name and contains not printable characters */
    public static void m301(Object obj) {
        if (C0006.m321() >= 0) {
            ((Dialog) obj).dismiss();
        }
    }

    /* JADX INFO: renamed from: ۣۨۤۨ, reason: not valid java name and contains not printable characters */
    public static void m302(Object obj, int i, int i2, int i3, int i4, float f) {
        if (m280() >= 0) {
            ((Outline) obj).setRoundRect(i, i2, i3, i4, f);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Drawable m303(Object obj) {
        if (C0007.m364() > 0) {
            return ((View) obj).getBackground();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠, reason: not valid java name and contains not printable characters */
    public static View m304(Object obj) {
        if (C0007.m364() > 0) {
            return ((Window) obj).getDecorView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ, reason: not valid java name and contains not printable characters */
    public static void m305(Object obj, Object obj2) {
        if (C0007.m364() >= 0) {
            l.p((Context) obj, (Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۡ۠ۤ, reason: contains not printable characters */
    public static int m306(float f) {
        if (C0006.m321() > 0) {
            return Math.round(f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۡۢ, reason: contains not printable characters */
    public static void m307(Object obj, Object obj2) {
        if (C0007.m364() >= 0) {
            C0006.m335((AlertDialog) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۢۡ, reason: contains not printable characters */
    public static Spanned m308(Object obj, int i) {
        if (m280() >= 0) {
            return C0008.m428((String) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static void m309(Object obj, Object obj2) {
        if (m280() >= 0) {
            ((TextView) obj).setText((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m310(Object obj, Object obj2, Object obj3) {
        if (C0007.m364() >= 0) {
            C0007.m375((Context) obj, C0008.m426(C0008.m409(new Intent(C0006.m320(l.m268(), 126, 26, 1437)), 268435456), C0006.m316((String) obj2)));
        }
    }

    /* JADX INFO: renamed from: ۨۥۣ۟, reason: not valid java name and contains not printable characters */
    public static Resources m311(Object obj) {
        if (m280() >= 0) {
            return ((Context) obj).getResources();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۟۟, reason: not valid java name and contains not printable characters */
    public static String m312(Object obj) {
        if (C0006.m321() >= 0) {
            return l.e((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m282(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
