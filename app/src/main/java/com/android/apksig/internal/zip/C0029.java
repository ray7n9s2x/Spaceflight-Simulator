package com.android.apksig.internal.zip;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.SignatureInfo;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.V1SourceStampVerifier;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1Field;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.AlgorithmIdentifier;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.pkcs7.SignedData;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.FileChannelDataSource;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.Excluder;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.DateTypeAdapter;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonToken;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.MatchType;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.AbstractC0441s3;
import com.zfork.multiplatforms.android.bomb.AbstractC0449u;
import com.zfork.multiplatforms.android.bomb.AbstractC0463w1;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0330b;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0370g4;
import com.zfork.multiplatforms.android.bomb.C0371g5;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0432r0;
import com.zfork.multiplatforms.android.bomb.C0469x1;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.E;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.J3;
import com.zfork.multiplatforms.android.bomb.M0;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q0;
import com.zfork.multiplatforms.android.bomb.Q1;
import com.zfork.multiplatforms.android.bomb.T;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.V0;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0391k0;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0462w0;
import com.zfork.multiplatforms.android.bomb.h5;
import com.zfork.multiplatforms.android.bomb.o5;
import j$.util.OptionalInt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.zip.Deflater;
import org.conscrypt.C0111;
import org.xmlpull.v1.XmlPullParser;
import sun.security.x509.CertificateExtensions;

/* JADX INFO: renamed from: com.android.apksig.internal.zip.ۥۣۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0029 {

    /* JADX INFO: renamed from: ۡۡۡۨ, reason: not valid java name and contains not printable characters */
    public static int f130 = 47;

    /* JADX INFO: renamed from: ۟۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2687(Object obj) {
        if (C0017.m846() > 0) {
            AbstractC0449u.c((String[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static View m2688(Object obj, Object obj2) {
        if (C0028.m2593() > 0) {
            return ((View) obj).findViewWithTag(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m2689(Object obj) {
        if (C0036.m3653() < 0) {
            return ((DialogC0421p0) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static Method m2690(Object obj, Object obj2, Object obj3) {
        if (C0073.m6356() < 0) {
            return ((Class) obj).getMethod((String) obj2, (Class[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۡۤ, reason: not valid java name and contains not printable characters */
    public static FileChannel m2691(Object obj) {
        if (C0016.m717() < 0) {
            return ((FileChannelDataSource) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static int m2692(Object obj) {
        if (m2791() >= 0) {
            return ((ViewOnClickListenerC0391k0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m2693() {
        if (C0068.m5678() >= 0) {
            return SignatureAlgorithm.ECDSA_WITH_SHA256;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m2694(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((Message) obj).arg1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static C0370g4 m2696(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((C4) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static String m2697(Object obj, Object obj2) {
        if (C0038.m4010() >= 0) {
            return System.getProperty((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۤۡ, reason: not valid java name and contains not printable characters */
    public static void m2698(Object obj, Object obj2, Object obj3) {
        if (C0027.m2460() >= 0) {
            ((T1) obj).k((Activity) obj2, (View) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۡۡۢ, reason: not valid java name and contains not printable characters */
    public static EditText m2699(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((C0351e) obj).w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.Builder m2700(Object obj, boolean z) {
        if (C0073.m6356() < 0) {
            return ((DefaultApkSignerEngine.Builder) obj).setRotationTargetsDevRelease(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۤۥ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2701() {
        if (C0071.m6069() >= 0) {
            return ApkVerifier.Issue.V3_SIG_MALFORMED_SIGNER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m2702(Object obj, Object obj2, Object obj3) {
        if (C0021.m1598() <= 0) {
            return TypeAdapters.newFactoryForMultipleTypes((Class) obj, (Class) obj2, (TypeAdapter) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2703(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((ApkVerifier.Result) obj).containsErrors();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m2704(Object obj, Object obj2, Object obj3) {
        if (C0036.m3653() < 0) {
            return ((SharedPreferences.Editor) obj).putString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m2705(Object obj) {
        if (C0016.m717() < 0) {
            ((Runnable) obj).run();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2706(Object obj, Object obj2) {
        if (C0039.m4109() >= 0) {
            return O2.Q((X509Certificate) obj, (X509Certificate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨۨ۟, reason: not valid java name and contains not printable characters */
    public static Animation m2707(Object obj) {
        if (C0027.m2460() > 0) {
            return ((View) obj).getAnimation();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2708(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((O1) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m2709() {
        if (C0017.m846() > 0) {
            return "Alg.Alias.Cipher.RSA/None/OAEPWithSHA-384AndMGF1Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static Throwable m2710(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((InvocationTargetException) obj).getTargetException();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۨۦ, reason: not valid java name and contains not printable characters */
    public static long m2711(Object obj) {
        if (C0076.m6903() < 0) {
            return ((CentralDirectoryRecord) obj).getCompressedSize();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static void m2712(Object obj, int i) {
        if (C0037.m3837() < 0) {
            ((PopupWindow) obj).setWidth(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static String m2713(long j) {
        if (C0077.m7272() <= 0) {
            return Long.toHexString(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m2714(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0067.m5468() <= 0) {
            ((TextView) obj).setCompoundDrawables((Drawable) obj2, (Drawable) obj3, (Drawable) obj4, (Drawable) obj5);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static Annotation m2715(Object obj) {
        if (C0111.m13165() < 0) {
            return C0023.m1920((Field) obj, Asn1Field.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤۢ, reason: not valid java name and contains not printable characters */
    public static void m2716(Object obj, Object obj2, Object obj3) {
        if (C0070.m5903() >= 0) {
            ((DateTypeAdapter) obj).write2((JsonWriter) obj2, (Date) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m2717() {
        if (C0078.m7450() > 0) {
            return "Alg.Alias.Mac.1.3.6.1.5.5.8.1.2";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static Object m2718(Object obj) {
        if (C0063.m4427() > 0) {
            return ((ObjectInputStream) obj).readObject();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2719(Object obj) {
        if (C0016.m717() < 0) {
            return V1SourceStampVerifier.a((Map) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۤ۟, reason: not valid java name and contains not printable characters */
    public static Resources m2720(Object obj) {
        if (C0030.m2940() > 0) {
            return ((Context) obj).getResources();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۧۥ, reason: not valid java name and contains not printable characters */
    public static int m2721(Object obj, int i) {
        if (C0037.m3837() < 0) {
            return Integer.parseInt((String) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟۟, reason: not valid java name and contains not printable characters */
    public static Drawable m2722(Object obj, Object obj2) {
        if (C0071.m6069() > 0) {
            return Drawable.createFromXml((Resources) obj, (XmlPullParser) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۢۢ, reason: not valid java name and contains not printable characters */
    public static String m2723(Object obj) {
        if (C0069.m5781() < 0) {
            return ((ApkVerifier.Issue) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m2724() {
        if (C0024.m2011() <= 0) {
            return Asn1Type.UNENCODED_CONTAINER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static void m2725(Object obj, Object obj2) {
        if (C0072.m6216() > 0) {
            ((WebView) obj).setWebViewClient((WebViewClient) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۡۧ, reason: not valid java name and contains not printable characters */
    public static StandardOpenOption m2726() {
        if (C0070.m5903() >= 0) {
            return StandardOpenOption.APPEND;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m2727(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((C0) obj).getLogoView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static InputStream m2728(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((HttpURLConnection) obj).getErrorStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2729(Object obj, Object obj2) {
        if (C0069.m5781() < 0) {
            return Asn1BerParser.g((BerDataValue) obj, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m2730(Object obj, Object obj2, Object obj3) {
        if (C0111.m13165() <= 0) {
            C0017.m919(C0020.m1372((V1SchemeVerifier.Result.SignerInfo) obj), new ApkVerifier.IssueWithParams((ApkVerifier.Issue) obj2, (Object[]) obj3));
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static List m2731(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((SignedData) obj).signerInfos;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۤ, reason: not valid java name and contains not printable characters */
    public static List m2732(Object obj) {
        if (C0063.m4427() > 0) {
            return ((ApkVerifier.Result.V1SchemeSignerInfo) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2733(Object obj, Object obj2) {
        if (C0077.m7272() <= 0) {
            ((AutoClickPointerBean) obj).setPointerName((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۢ, reason: not valid java name and contains not printable characters */
    public static Handler m2734() {
        if (C0070.m5903() >= 0) {
            return M0.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۢ, reason: not valid java name and contains not printable characters */
    public static List m2735(Object obj) {
        if (C0028.m2593() > 0) {
            return ((ApkVerifier.Result) obj).getAllErrors();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۥ, reason: not valid java name and contains not printable characters */
    public static BasicFileAttributes m2736(Object obj, Object obj2, Object obj3) {
        if (C0065.m4647() > 0) {
            return Files.readAttributes((Path) obj, (Class) obj2, (LinkOption[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠۠, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m2737(Object obj, Object obj2, int i) {
        if (C0025.m2132() >= 0) {
            return ((Context) obj).getSharedPreferences((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟, reason: not valid java name and contains not printable characters */
    public static String m2738(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((ApkSigner) obj).t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۧۨ, reason: not valid java name and contains not printable characters */
    public static void m2739(Object obj, Object obj2) {
        if (C0020.m1385() < 0) {
            ((ViewOnClickListenerC0462w0) obj).onClick((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static C0469x1 m2740() {
        if (C0065.m4647() > 0) {
            return AbstractC0463w1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢۢ, reason: not valid java name and contains not printable characters */
    public static MatchType m2741(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((C4) obj).I;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۢ, reason: not valid java name and contains not printable characters */
    public static void m2742(long j, Object obj) {
        if (C0077.m7272() < 0) {
            C0387j2.u(j, (byte[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟۠, reason: not valid java name and contains not printable characters */
    public static int m2743(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((C0370g4) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m2744() {
        if (C0016.m717() <= 0) {
            return "Alg.Alias.Mac.HMAC/SHA1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static E m2745(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((E5) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static Handler m2746() {
        if (C0034.m3450() >= 0) {
            return V0.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static void m2747(long j) {
        if (C0016.m717() <= 0) {
            C0350d5.a(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static Object m2748(Object obj, Object obj2) {
        if (C0023.m1921() > 0) {
            return ((CertificateExtensions) obj).get((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m2749() {
        if (C0034.m3450() >= 0) {
            return "Signer.d.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧۨ, reason: not valid java name and contains not printable characters */
    public static EditText m2750(Object obj) {
        if (C0038.m4010() > 0) {
            return ((DialogC0385j0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2751(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((JsonElement) obj).isJsonArray();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static void m2752(Object obj) {
        if (C0026.m2298() < 0) {
            AbstractC0449u.e((String[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟۟, reason: not valid java name and contains not printable characters */
    public static char[] m2753(Object obj, Object obj2, Object obj3) {
        if (C0027.m2460() >= 0) {
            return ((O2) obj).y((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤ۟, reason: not valid java name and contains not printable characters */
    public static String m2754() {
        if (C0028.m2593() > 0) {
            return "Alg.Alias.Mac.1.2.840.113549.2.7";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨ۟, reason: not valid java name and contains not printable characters */
    public static String m2755() {
        if (C0075.m6893() > 0) {
            return "alias.has.no.X.509.certificate";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۨۥ, reason: not valid java name and contains not printable characters */
    public static String m2756() {
        if (C0076.m6903() < 0) {
            return "DESEDE/CBC/PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۤۡ, reason: not valid java name and contains not printable characters */
    public static long m2757(long j, long j2) {
        if (C0028.m2593() > 0) {
            return Math.min(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m2758(Object obj, Object obj2) {
        if (C0032.m3184() <= 0) {
            ((T) obj).a(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m2759(Object obj) {
        if (C0068.m5678() > 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static void m2760(Object obj, Object obj2, int i, Object obj3) {
        if (C0028.m2593() > 0) {
            ConsumerAbility.d((Activity) obj, (String) obj2, i, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus m2761() {
        if (C0019.m1311() <= 0) {
            return ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus.STAMP_VERIFICATION_FAILED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2762(Object obj) {
        if (C0066.m4827() > 0) {
            return ((C0) obj).H;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m2763(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((E1) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۢۢ, reason: not valid java name and contains not printable characters */
    public static String m2764() {
        if (C0067.m5468() <= 0) {
            return "Entry.type.type.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2765(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((Deflater) obj).needsInput();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m2766() {
        if (C0063.m4427() >= 0) {
            return "OpenSSLAeadCipherAES$GCM$AES_256";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static void m2767(Object obj) throws IOException {
        if (C0075.m6893() >= 0) {
            ((Writer) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۠ۨۡ۠, reason: not valid java name and contains not printable characters */
    public static Excluder m2768(Object obj) {
        if (m2791() >= 0) {
            return ((Excluder) obj).clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۡۡ, reason: not valid java name and contains not printable characters */
    public static void m2769(Object obj, Object obj2) {
        if (C0030.m2940() > 0) {
            ((Vector) obj).addElement(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡ۟۠, reason: not valid java name and contains not printable characters */
    public static Activity m2770(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((DialogC0385j0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m2771(Object obj, boolean z) {
        if (C0063.m4427() >= 0) {
            return ((ApkSigner.Builder) obj).setDebuggableApkPermitted(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۨۨ, reason: not valid java name and contains not printable characters */
    public static Set m2772(Object obj) {
        if (C0025.m2132() > 0) {
            return ((V3SchemeVerifier) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۢ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m2773() {
        if (C0032.m3184() < 0) {
            return Asn1Type.ANY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۢ, reason: not valid java name and contains not printable characters */
    public static long m2774(Object obj) {
        if (C0036.m3653() < 0) {
            return ((Q0) obj).a();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۢۢ, reason: not valid java name and contains not printable characters */
    public static void m2775(Object obj, int i, Object obj2) {
        if (C0037.m3837() < 0) {
            ((SourceStampVerifier.Result.SignerInfo) obj).addVerificationWarning(i, (Object[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۧۥۤ, reason: not valid java name and contains not printable characters */
    public static int m2776(Object obj) {
        if (C0025.m2132() > 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).getMinSdkVersion();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static DataSource m2777(Object obj) {
        if (C0019.m1311() == 0) {
            return ((SourceStampVerifier.Builder) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۤ۠, reason: not valid java name and contains not printable characters */
    public static void m2778() {
        if (C0016.m717() <= 0) {
            O2.L();
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static String m2779() {
        if (C0036.m3653() < 0) {
            return "<sigalg>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m2780(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((AutoClickPlanBean) obj).getJsonRemark();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static Integer m2781(Object obj) {
        if (C0068.m5678() > 0) {
            return Integer.valueOf((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m2782() {
        if (C0072.m6216() >= 0) {
            return TypeAdapters.URI_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۡ, reason: not valid java name and contains not printable characters */
    public static String m2783() {
        if (C0020.m1385() <= 0) {
            return "AES/CBC/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۢۤ, reason: not valid java name and contains not printable characters */
    public static TextView m2784(Object obj) {
        if (C0021.m1598() < 0) {
            return ((DialogC0421p0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2785(Object obj) {
        if (C0021.m1598() < 0) {
            return ((C0) obj).F;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۡ۠, reason: not valid java name and contains not printable characters */
    public static void m2786(Object obj) {
        if (C0033.m3358() <= 0) {
            ((Dialog) obj).show();
        }
    }

    /* JADX INFO: renamed from: ۢۥۣۥ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2787() {
        if (C0021.m1598() < 0) {
            return ApkVerifier.Issue.V3_SIG_NO_SIGNERS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۤۤ, reason: not valid java name and contains not printable characters */
    public static int m2788(Object obj) {
        if (m2791() >= 0) {
            return ((C0361f2) obj).C;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۡۥ, reason: not valid java name and contains not printable characters */
    public static int m2789(int i, int i2) {
        if (C0070.m5903() >= 0) {
            return C0330b.a(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static String m2790(Object obj, Object obj2) {
        if (C0068.m5678() >= 0) {
            return AlgorithmIdentifier.getJcaSignatureAlgorithm((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m2791() {
        return 1749781 ^ C0032.m3236((Object) "ۢۦۦ");
    }

    /* JADX INFO: renamed from: ۣۡۨۨ, reason: not valid java name and contains not printable characters */
    public static int m2792(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((C0432r0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2793(Object obj, Object obj2) {
        if (C0028.m2593() > 0) {
            return ((List) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static LinkOption[] m2794() {
        if (C0027.m2460() >= 0) {
            return J3.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2795(Object obj) {
        if (C0064.m4578() >= 0) {
            return o5.q((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean[] m2796(Object obj) {
        if (C0064.m4578() > 0) {
            return ((X509Certificate) obj).getSubjectUniqueID();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۠, reason: not valid java name and contains not printable characters */
    public static List m2797(int i, Object obj, int i2) {
        if (C0078.m7450() >= 0) {
            return h5.g(i, (byte[]) obj, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۥ, reason: not valid java name and contains not printable characters */
    public static long m2798(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((C0371g5) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۥۢۥ, reason: not valid java name and contains not printable characters */
    public static List m2799(Object obj) {
        if (C0025.m2132() > 0) {
            return ((DefaultApkSignerEngine) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧۤ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.Builder m2800(Object obj, boolean z) {
        if (C0071.m6069() > 0) {
            return ((DefaultApkSignerEngine.Builder) obj).setV3SigningEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static InputStream m2801(Object obj, Object obj2) {
        if (C0016.m717() <= 0) {
            return ((ContentResolver) obj).openInputStream((Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۤ۟, reason: not valid java name and contains not printable characters */
    public static void m2802(Object obj, Object obj2) throws KeyStoreException {
        if (C0075.m6893() > 0) {
            ((KeyStore) obj).deleteEntry((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۡۤۨ, reason: contains not printable characters */
    public static MotionEvent m2803(long j, long j2, int i, float f, float f2, int i2) {
        if (C0030.m2940() >= 0) {
            return MotionEvent.obtain(j, j2, i, f, f2, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢۡ, reason: contains not printable characters */
    public static List m2804(Object obj) {
        if (C0016.m717() < 0) {
            return ((ApkVerifier.Result.V2SchemeSignerInfo) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟, reason: contains not printable characters */
    public static ApkVerifier.Issue m2805() {
        if (C0075.m6893() >= 0) {
            return ApkVerifier.Issue.V2_SIG_MALFORMED_CERTIFICATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۤ, reason: contains not printable characters */
    public static Object m2806(Object obj, Object obj2, Object obj3) {
        if (C0038.m4010() >= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Type) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۟۠, reason: contains not printable characters */
    public static Object m2807(Object obj, int i) {
        if (C0078.m7450() > 0) {
            return ((AdapterView) obj).getItemAtPosition(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۦۥ, reason: contains not printable characters */
    public static String m2808(String str) {
        String strM2993 = C0031.m2993();
        String strM29932 = C0031.m2993();
        for (int i = 0; i < 15; i++) {
            strM2993 = C0077.m7301(C0030.m2967(C0030.m2967(new StringBuffer(), strM2993), C0021.m1651(i)));
            strM29932 = C0077.m7301(C0027.m2461(C0030.m2967(new StringBuffer(), strM29932), ((int) (C0038.m3986() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0078.m7380(str) / 2);
        for (int i2 = 0; i2 < C0078.m7380(str); i2 += 2) {
            C0070.m5921(byteArrayOutputStream, (C0024.m2051(strM2993, C0077.m7212(str, i2)) << 4) | C0024.m2051(strM2993, C0077.m7212(str, i2 + 1)));
        }
        byte[] bArrM7297 = C0077.m7297(byteArrayOutputStream);
        int length = bArrM7297.length;
        int iM7380 = C0078.m7380(strM29932);
        for (int i3 = 0; i3 < length; i3++) {
            bArrM7297[i3] = (byte) (bArrM7297[i3] ^ C0077.m7212(strM29932, i3 % iM7380));
        }
        for (int iM73802 = 0; iM73802 < bArrM7297.length; iM73802 = C0078.m7380(C0031.m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۥۧۧۦ, reason: contains not printable characters */
    public static OptionalInt m2809(Object obj) {
        if (C0073.m6356() < 0) {
            return ((V3SchemeVerifier) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۡۢ, reason: contains not printable characters */
    public static long m2810(Object obj) {
        if (C0018.m1064() > 0) {
            return ((SignatureInfo) obj).eocdOffset;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۤ۟ۨ, reason: contains not printable characters */
    public static JsonToken m2811() {
        if (C0073.m6356() < 0) {
            return JsonToken.BEGIN_ARRAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۠ۡ, reason: contains not printable characters */
    public static ByteBuffer m2812(Object obj, Object obj2) {
        if (C0024.m2011() < 0) {
            return ((ByteBuffer) obj).get((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m2813(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((List) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m2814(Object obj, int i, Object obj2) {
        if (C0028.m2593() >= 0) {
            ((AbstractC0441s3) obj).e(i, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۢۥۡ, reason: not valid java name and contains not printable characters */
    public static String m2815(Object obj, int i) {
        if (C0028.m2593() >= 0) {
            return ((BigInteger) obj).toString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۢ, reason: not valid java name and contains not printable characters */
    public static Object m2816(Object obj, Object obj2) {
        if (C0016.m717() <= 0) {
            return ((TypeAdapter) obj).fromJson((Reader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static Type m2817(Object obj) {
        if (C0073.m6356() < 0) {
            return ((ParameterizedType) obj).getRawType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۤ, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m2818() {
        if (C0036.m3653() <= 0) {
            return SignatureAlgorithm.VERITY_DSA_WITH_SHA256;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۠۠, reason: not valid java name and contains not printable characters */
    public static AbstractC0441s3 m2819(Object obj, Object obj2, Object obj3) {
        if (C0075.m6893() >= 0) {
            return ((AbstractC0441s3) obj).b((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m2820(Object obj) {
        if (m2791() > 0) {
            return ((X509EncodedKeySpec) obj).getEncoded();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m2821(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((ApkSigner) obj).s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static View.OnClickListener m2822(Object obj) {
        if (C0037.m3837() < 0) {
            return ((Q1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۥ۠, reason: not valid java name and contains not printable characters */
    public static void m2823(Object obj, Object obj2) {
        if (C0075.m6893() > 0) {
            ((Application) obj).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۡۧۨ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Result m2824(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((ApkVerifier) obj).verify();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۦۢ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m2825() {
        if (C0072.m6216() > 0) {
            return AbstractC0449u.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۦۨ, reason: not valid java name and contains not printable characters */
    public static E1 m2826(Object obj) {
        if (C0074.m6454() < 0) {
            return ((E5) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m2695(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
