package androidx.loader.app.services;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.loader.app.services.l;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.loader.app.services.ۣ۟ۡ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0006 {

    /* JADX INFO: renamed from: ۡ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static int f4 = -460;

    /* JADX INFO: renamed from: ۟۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static int m313(Object obj, Object obj2) {
        if (C0004.m271() > 0) {
            return ((InputStream) obj).read((byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static void m314(Object obj) {
        if (C0004.m271() >= 0) {
            ((b) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۟۠۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m315(Object obj) {
        if (m321() > 0) {
            return URLEncoder.encode((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Uri m316(Object obj) {
        if (C0005.m280() >= 0) {
            return Uri.parse((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۤۥ, reason: not valid java name and contains not printable characters */
    public static Typeface m317() {
        if (C0005.m280() >= 0) {
            return Typeface.SANS_SERIF;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۢ, reason: not valid java name and contains not printable characters */
    public static Exception m318(Object obj) {
        if (C0007.m364() > 0) {
            return ((k) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠, reason: not valid java name and contains not printable characters */
    public static String m319(Object obj, Object obj2) {
        if (C0004.m271() >= 0) {
            return URLEncoder.encode((String) obj, (Charset) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static int m321() {
        return (-384) ^ f4;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static void m322(Object obj, int i) {
        if (C0005.m280() > 0) {
            ((LinearLayout) obj).setOrientation(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static void m323(Object obj, Object obj2) {
        if (m321() >= 0) {
            l.o((Context) obj, (JSONObject) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m324(Object obj, Object obj2) {
        if (C0007.m364() >= 0) {
            return ((AlertDialog.Builder) obj).setTitle((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static Bitmap m325(Object obj) {
        if (C0007.m364() >= 0) {
            return BitmapFactory.decodeStream((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۡ۟, reason: not valid java name and contains not printable characters */
    public static int m326(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Context m327(Object obj) {
        if (C0004.m271() >= 0) {
            return ((h) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۤ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m328(Object obj) {
        if (m321() > 0) {
            return ((g) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m329(Object obj, Object obj2) {
        if (m321() > 0) {
            ((TextView) obj).setTypeface((Typeface) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static void m330(Object obj, Object obj2) {
        if (m321() >= 0) {
            C0005.m305((Context) obj, (Exception) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static String m331(Object obj) {
        if (C0004.m271() >= 0) {
            return ((Charset) obj).name();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m332(Object obj) {
        if (C0007.m364() >= 0) {
            return ((f) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m333(Object obj) {
        if (C0004.m271() >= 0) {
            return ((h) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m334(Object obj, Object obj2) {
        if (C0005.m280() > 0) {
            ((View) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۢۧ۟, reason: not valid java name and contains not printable characters */
    public static void m335(Object obj, Object obj2) {
        if (C0004.m271() > 0) {
            l.m((AlertDialog) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۢ۠۠, reason: not valid java name and contains not printable characters */
    public static AlertDialog m336(Object obj) {
        if (m321() > 0) {
            return ((AlertDialog.Builder) obj).create();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m337(Object obj, Object obj2, Object obj3) {
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static Class m338(Object obj) {
        if (C0004.m271() >= 0) {
            return obj.getClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۧ, reason: not valid java name and contains not printable characters */
    public static void m339(Object obj, int i) {
        if (m321() >= 0) {
            ((TextView) obj).setGravity(i);
        }
    }

    /* JADX INFO: renamed from: ۣۧۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m340() {
        if (m321() > 0) {
            return l.b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m341(Object obj, Object obj2) {
        if (C0005.m280() > 0) {
            m314(new b((String) obj, new l.a((Context) obj2)));
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m342(Object obj, Object obj2) {
        if (C0007.m364() > 0) {
            C0005.m305((Context) obj, (Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۢۤۧ, reason: not valid java name and contains not printable characters */
    public static void m343(Object obj, Object obj2) {
        if (C0007.m364() > 0) {
            ((View) obj).setBackground((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۠ۧ, reason: contains not printable characters */
    public static String m344(Object obj) {
        if (C0005.m280() >= 0) {
            return ((Context) obj).getPackageName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠۠ۤ, reason: contains not printable characters */
    public static void m345(Object obj, int i) {
        if (C0004.m271() > 0) {
            ((LinearLayout) obj).setGravity(i);
        }
    }

    /* JADX INFO: renamed from: ۦۣۢۥ, reason: contains not printable characters */
    public static void m346(Object obj, int i, int i2, int i3, int i4) {
        if (C0005.m280() >= 0) {
            ((TextView) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۧۡۥ۠, reason: not valid java name and contains not printable characters */
    public static Spanned m347(Object obj) {
        if (C0005.m280() > 0) {
            return Html.fromHtml((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۧۤ, reason: not valid java name and contains not printable characters */
    public static float m348(int i, float f, Object obj) {
        if (m321() > 0) {
            return TypedValue.applyDimension(i, f, (DisplayMetrics) obj);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۡۧۤ, reason: not valid java name and contains not printable characters */
    public static Context m349(Object obj) {
        if (m321() > 0) {
            return ((f) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥۨ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m350() {
        if (C0005.m280() > 0) {
            return PorterDuff.Mode.SRC_IN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۥۡ, reason: not valid java name and contains not printable characters */
    public static void m351(Object obj, int i) {
        if (C0004.m271() > 0) {
            ((TextView) obj).setTextColor(i);
        }
    }

    /* JADX INFO: renamed from: ۨۧۢۤ, reason: not valid java name and contains not printable characters */
    public static String m352(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۨۧۥۢ, reason: not valid java name and contains not printable characters */
    public static void m353(Object obj, Object obj2) {
        if (C0007.m364() >= 0) {
            ((GradientDrawable) obj).setCornerRadii((float[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static String m320(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
