package com.joke.basetoollib;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.JcaSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ApkSigningBlockUtilsLite;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4SchemeSigner;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.ByteArrayDataSink;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipSections;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.annotations.Since;
import com.joke.plugin.gson.internal.C$Gson$Types;
import com.joke.plugin.gson.internal.JavaVersion;
import com.joke.plugin.gson.internal.UnsafeAllocator;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.script.bean.C0074;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptActionBean;
import com.joke.script.bean.ScriptMatchBean;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.script.bean.ScriptProjectBean;
import com.joke.speedfloatingball.bean.CloudBean;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0325a1;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0416o1;
import com.zfork.multiplatforms.android.bomb.AbstractC0440s2;
import com.zfork.multiplatforms.android.bomb.AbstractC0441s3;
import com.zfork.multiplatforms.android.bomb.AbstractC0442s4;
import com.zfork.multiplatforms.android.bomb.B;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0334b3;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0365g;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0413n4;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0453u3;
import com.zfork.multiplatforms.android.bomb.C0460v4;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C0482z2;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0331b0;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.F5;
import com.zfork.multiplatforms.android.bomb.G;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.InterfaceC0477y3;
import com.zfork.multiplatforms.android.bomb.J2;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.L2;
import com.zfork.multiplatforms.android.bomb.M3;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.P2;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.V;
import com.zfork.multiplatforms.android.bomb.V0;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0326a2;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0349d4;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0480z0;
import com.zfork.multiplatforms.android.bomb.W;
import com.zfork.multiplatforms.android.bomb.X3;
import com.zfork.multiplatforms.android.bomb.Y;
import com.zfork.multiplatforms.android.bomb.Z0;
import com.zfork.multiplatforms.android.bomb.Z1;
import com.zfork.multiplatforms.android.bomb.Z4;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.t5;
import com.zfork.multiplatforms.android.bomb.x5;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.logging.Logger;
import org.conscrypt.C0111;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.joke.basetoollib.ۣ۟ۡۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0063 {

    /* JADX INFO: renamed from: ۣ۟ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean f148 = true;

    /* JADX INFO: renamed from: ۟۟ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerCapabilities m4298(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((SigningCertificateLineage.Builder) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m4299(Object obj, Object obj2) {
        if (C0032.m3184() <= 0) {
            ((C0444t0) obj).setOnDeleteListener((InterfaceC0477y3) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static Constructor m4300(Object obj, Object obj2) {
        if (C0065.m4647() >= 0) {
            return ((Class) obj).getDeclaredConstructor((Class[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static TypeVariable[] m4301(Object obj) {
        if (C0034.m3450() > 0) {
            return ((Class) obj).getTypeParameters();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۨ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m4302() {
        if (C0072.m6216() >= 0) {
            return TypeAdapters.DOUBLE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠۠, reason: not valid java name and contains not printable characters */
    public static C0482z2 m4303(Object obj) {
        if (C0068.m5678() >= 0) {
            return C0482z2.a((Stream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static void m4304(Object obj) throws IOException {
        if (C0018.m1064() > 0) {
            ((FileOutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4305(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((StringTokenizer) obj).hasMoreElements();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static x5 m4306(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((Z0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static long m4307(Object obj) {
        if (C0066.m4827() > 0) {
            return C0361f2.d((List) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۦ, reason: not valid java name and contains not printable characters */
    public static UnsafeAllocator m4308() {
        if (C0078.m7450() > 0) {
            return UnsafeAllocator.create();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static TextView m4309(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((DialogC0389j4) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m4310(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((C0357e5) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m4311(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static void m4312(Object obj, boolean z) {
        if (C0025.m2132() >= 0) {
            O1.d((O1) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۥ, reason: not valid java name and contains not printable characters */
    public static void m4313(Object obj, Object obj2) {
        if (C0069.m5781() <= 0) {
            o5.A((Context) obj, (ScriptProjectBean) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4314(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m4316(Object obj, Object obj2) {
        if (m4427() > 0) {
            L.b((AutoClickPlanBean) obj, (AutoClickPointerBean) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m4317(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((SourceStampVerifier.Result) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4318(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((DefaultApkSignerEngine) obj).isEligibleForSourceStamp();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static void m4319(Object obj, Object obj2) {
        if (C0035.m3569() < 0) {
            ((Paint) obj).setStyle((Paint.Style) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static BigInteger m4320(Object obj) {
        if (C0024.m2011() <= 0) {
            return Asn1BerParser.c((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۤ۠, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m4321(int i) {
        if (C0029.m2791() >= 0) {
            return SignatureAlgorithm.findById(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۧ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.Result m4322(Object obj) {
        if (C0023.m1921() > 0) {
            return ((V3SchemeVerifier) obj).parseSigners();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۢۥ, reason: not valid java name and contains not printable characters */
    public static int m4323(Object obj, Object obj2) {
        if (C0021.m1598() <= 0) {
            return ApkSigningBlockUtilsLite.compareSignatureAlgorithm((SignatureAlgorithm) obj, (SignatureAlgorithm) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4324(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((C0413n4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static PosixFilePermission m4325() {
        if (C0021.m1598() < 0) {
            return C0037.m3828();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥۧ, reason: not valid java name and contains not printable characters */
    public static int m4326(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((SourceStampVerifier.Result.SignerInfo) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤۡ, reason: not valid java name and contains not printable characters */
    public static void m4327(Object obj) {
        if (C0077.m7272() <= 0) {
            ((List) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۧۨ, reason: not valid java name and contains not printable characters */
    public static C0350d5 m4328(Object obj) {
        if (C0021.m1598() < 0) {
            return ((C0357e5) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m4329(Object obj) {
        if (C0032.m3184() < 0) {
            return ((TypeToken) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static int m4330() {
        if (C0037.m3837() <= 0) {
            return Build.VERSION.SDK_INT;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static List m4331(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((ApkSignerInfo) obj).getErrors();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۤ, reason: not valid java name and contains not printable characters */
    public static View m4332(Object obj, Object obj2, Object obj3) {
        if (C0036.m3653() < 0) {
            return ((LayoutInflater) obj).inflate((XmlPullParser) obj2, (ViewGroup) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۥ, reason: not valid java name and contains not printable characters */
    public static void m4333(Object obj, Object obj2) {
        if (C0037.m3837() < 0) {
            ((C0) obj).setListenerOnlyAutoClick((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static View m4334(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            return ((C0) obj).h((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static AbstractC0441s3 m4335(Object obj) {
        if (C0021.m1598() < 0) {
            return ((AbstractC0441s3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static double m4336(Object obj) {
        return C0036.m3653() <= 0 ? ((Since) obj).value() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m4337(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((C0453u3) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥۦ, reason: not valid java name and contains not printable characters */
    public static List m4338(Object obj) {
        if (C0021.m1598() <= 0) {
            return C0111.m13068((ApkVerifier.Result.V2SchemeSignerInfo) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨۢ, reason: not valid java name and contains not printable characters */
    public static int m4339(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo.AdditionalAttribute) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m4340(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((CloudBean) obj).getDialogConfirmClickLink();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۥۣ, reason: not valid java name and contains not printable characters */
    public static void m4341(Object obj, int i, int i2, int i3, int i4) {
        if (C0075.m6893() > 0) {
            ((ShapeDrawable) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4342() {
        if (C0078.m7450() >= 0) {
            return ApkVerifier.Issue.V2_SIG_MAX_SIGNATURES_EXCEEDED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static String m4343(String str) {
        String strM2993 = C0031.m2993();
        String strM29932 = C0031.m2993();
        for (int i = 0; i < 15; i++) {
            strM2993 = C0077.m7301(C0030.m2967(C0030.m2967(new StringBuffer(), strM2993), C0021.m1651(i)));
            strM29932 = C0077.m7301(C0027.m2461(C0030.m2967(new StringBuffer(), strM29932), ((int) (C0038.m3986() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0078.m7380(str) / 2);
        while (C0078.m7380(str) > 0) {
            C0070.m5921(byteArrayOutputStream, (C0024.m2051(strM2993, C0077.m7212(str, -2)) << 4) | C0024.m2051(strM2993, C0077.m7212(str, -1)));
        }
        byte[] bArrM7297 = C0077.m7297(byteArrayOutputStream);
        int length = bArrM7297.length;
        int iM7380 = C0078.m7380(strM29932);
        for (int i2 = 0; i2 < length; i2++) {
            bArrM7297[i2] = (byte) (bArrM7297[i2] ^ C0077.m7212(strM29932, i2 % iM7380));
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۟ۤۤۨۤ, reason: not valid java name and contains not printable characters */
    public static int m4344(Object obj) {
        if (C0029.m2791() > 0) {
            return ((G0) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4345(Object obj, Object obj2) {
        if (m4427() > 0) {
            return ((Set) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static int[] m4346() {
        if (C0069.m5781() <= 0) {
            return AbstractC0442s4.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۢۤ, reason: not valid java name and contains not printable characters */
    public static BigInteger m4347(Object obj) {
        if (C0071.m6069() > 0) {
            return ((DSAParams) obj).getP();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۢ, reason: not valid java name and contains not printable characters */
    public static int m4348(Object obj) {
        if (m4427() >= 0) {
            return ((Z1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static C0361f2 m4349(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((ViewOnClickListenerC0326a2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۦ, reason: not valid java name and contains not printable characters */
    public static String m4350() {
        if (C0065.m4647() > 0) {
            return "OpenSSLCipherRSA$OAEP$SHA224";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۣ, reason: not valid java name and contains not printable characters */
    public static CheckBox m4351(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((C0351e) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۥ, reason: not valid java name and contains not printable characters */
    public static String m4352() {
        if (C0066.m4827() > 0) {
            return "SecureRandom.SHA1PRNG";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧۨ, reason: not valid java name and contains not printable characters */
    public static String m4353(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((StringTokenizer) obj).nextToken();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۤ۟, reason: not valid java name and contains not printable characters */
    public static AlgorithmParameterSpec m4354(Object obj) {
        if (C0070.m5903() > 0) {
            return ((JcaSignerEngine) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۥ۠, reason: not valid java name and contains not printable characters */
    public static int m4355(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((ClipData) obj).getItemCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4356(Object obj) {
        if (C0075.m6893() > 0) {
            return ((JsonElement) obj).getAsBoolean();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۣ, reason: not valid java name and contains not printable characters */
    public static int m4357(Object obj) {
        if (C0067.m5468() < 0) {
            return JavaVersion.getMajorJavaVersion((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m4358(Object obj, boolean z) {
        if (C0068.m5678() >= 0) {
            return Asn1DerEncoder.e(obj, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۢ, reason: not valid java name and contains not printable characters */
    public static void m4359(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0019.m1311() <= 0) {
            ((O2) obj).j((String) obj2, (String) obj3, (InputStream) obj4, (PrintStream) obj5);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۢ, reason: not valid java name and contains not printable characters */
    public static BaseAdapter m4360(Object obj) {
        if (m4427() >= 0) {
            return ((ViewOnClickListenerC0349d4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m4361(Object obj) {
        if (C0031.m3075() > 0) {
            return ((V) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m4362(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((t5) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m4363(Object obj) {
        if (C0067.m5468() < 0) {
            return ((G) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static BigDecimal m4364(Object obj, int i) {
        if (C0024.m2011() < 0) {
            return ((BigDecimal) obj).movePointRight(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4365() {
        if (C0077.m7272() <= 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢۧ, reason: not valid java name and contains not printable characters */
    public static void m4366(Object obj, Object obj2) {
        if (C0020.m1385() <= 0) {
            ((AutoClickPlanBean) obj).setJsonRemark((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m4367(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((C0460v4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static Object m4368(Object obj) {
        if (C0019.m1311() == 0) {
            return ((Map.Entry) obj).getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۧ, reason: not valid java name and contains not printable characters */
    public static Logger m4369(Object obj) {
        if (C0076.m6903() <= 0) {
            return Logger.getLogger((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۧ۟, reason: not valid java name and contains not printable characters */
    public static String m4370() {
        if (C0070.m5903() >= 0) {
            return "Alg.Alias.Signature.SHA512withRSAandMGF1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static List m4371(Object obj, Object obj2) {
        if (C0075.m6893() >= 0) {
            return ZipUtils.parseZipCentralDirectory((DataSource) obj, (ZipSections) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static long m4372(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((F5) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static void m4373(Object obj, Object obj2) {
        if (C0033.m3358() < 0) {
            ((C0361f2) obj).e((ScriptProjectAliasBean) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۠, reason: not valid java name and contains not printable characters */
    public static PrintStream m4374(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((L2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static int m4375(Object obj) {
        if (C0027.m2460() > 0) {
            return ((HttpURLConnection) obj).getResponseCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static String m4376() {
        if (C0021.m1598() <= 0) {
            return "DES";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static CheckBox m4377(Object obj) {
        if (C0077.m7272() < 0) {
            return ((C0351e) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus m4378() {
        if (C0021.m1598() <= 0) {
            return ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus.VERIFICATION_ERROR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4379(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((B) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۠۟, reason: not valid java name and contains not printable characters */
    public static int m4380(Object obj, Object obj2) {
        if (C0072.m6216() > 0) {
            return ((W) obj).f((Y) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡ۠۟, reason: not valid java name and contains not printable characters */
    public static TextView m4381(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((C4) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢ۟, reason: not valid java name and contains not printable characters */
    public static void m4382(Object obj, int i) {
        if (C0030.m2940() > 0) {
            ((View) obj).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۡۤۡ۟, reason: not valid java name and contains not printable characters */
    public static char[] m4383(Object obj) {
        if (C0038.m4010() > 0) {
            return ((O2) obj).y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۢ۠, reason: not valid java name and contains not printable characters */
    public static AbstractC0325a1 m4384(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((E5) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۤۨ, reason: not valid java name and contains not printable characters */
    public static void m4385(Object obj, int i) {
        if (C0024.m2011() <= 0) {
            ((LinearLayout) obj).setGravity(i);
        }
    }

    /* JADX INFO: renamed from: ۡۨۧۥ, reason: not valid java name and contains not printable characters */
    public static File m4386(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((D5) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static int m4387() {
        if (C0038.m4010() >= 0) {
            return M3.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m4388(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((CloudBean) obj).getDialogContent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m4389(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0027.m2460() >= 0) {
            ((Canvas) obj).drawBitmap((Bitmap) obj2, (Matrix) obj3, (Paint) obj4);
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m4390() {
        if (C0078.m7450() > 0) {
            return "Alg.Alias.Cipher.PBEWithHmacSHA384AndAES_128";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡ۠, reason: not valid java name and contains not printable characters */
    public static C0387j2 m4391(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((A5) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static void m4392(Object obj, Object obj2, Object obj3) {
        if (C0064.m4578() >= 0) {
            ((C0357e5) obj).a((HashMap) obj2, (ArrayList) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m4393(Object obj, Object obj2) {
        if (C0024.m2011() <= 0) {
            ((C0361f2) obj).h((ScriptActionBean) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۦۨۦ, reason: not valid java name and contains not printable characters */
    public static long m4394(Object obj) {
        if (C0016.m717() <= 0) {
            return ((C0350d5) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static int m4395(Object obj) {
        if (C0069.m5781() < 0) {
            return ((ManifestParser.Section) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۧۥۣ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerCapabilities m4396(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((SigningCertificateLineage.Builder) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4397(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((P2) obj).t;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4398() {
        if (C0069.m5781() < 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_SIG_MISSING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static void m4399(Object obj) {
        if (C0033.m3358() <= 0) {
            C0023.m1791((DirectoryStream) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۢۤۤ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4400() {
        if (C0038.m4010() > 0) {
            return ApkVerifier.Issue.NO_SIG_FOR_TARGET_SANDBOX_VERSION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4401(Object obj) {
        if (C0077.m7272() < 0) {
            return ((D5) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۢ۠, reason: not valid java name and contains not printable characters */
    public static String m4402(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((SignatureAlgorithm) obj).getJcaKeyAlgorithm();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Type[] m4403(Object obj, Object obj2) {
        if (C0111.m13165() <= 0) {
            return C$Gson$Types.getMapKeyAndValueTypes((Type) obj, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۡ, reason: not valid java name and contains not printable characters */
    public static V4Signature m4404(Object obj) {
        if (C0035.m3569() <= 0) {
            return V4Signature.readFrom((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۡۥ, reason: not valid java name and contains not printable characters */
    public static ContentDigestAlgorithm m4405() {
        if (C0074.m6454() <= 0) {
            return ContentDigestAlgorithm.CHUNKED_SHA512;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۢ۠, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m4406(Object obj) {
        if (C0031.m3075() > 0) {
            return ((AndroidBinXmlParser) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۡ, reason: not valid java name and contains not printable characters */
    public static void m4407(Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            ((TextView) obj).setEllipsize((TextUtils.TruncateAt) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4408(Object obj) {
        if (C0025.m2132() > 0) {
            return ((JsonElement) obj).isJsonPrimitive();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static C0479z m4409() {
        if (C0071.m6069() > 0) {
            return AbstractC0406m3.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m4410(Object obj, Object obj2) {
        if (C0078.m7450() > 0) {
            AbstractC0406m3.g((String) obj, (V0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۨۨ, reason: not valid java name and contains not printable characters */
    public static String m4411(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((AndroidBinXmlParser) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4412(Object obj, Object obj2) {
        if (C0111.m13165() <= 0) {
            return ((KeyStore) obj).containsAlias((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤۤۦ, reason: not valid java name and contains not printable characters */
    public static EditText m4413(Object obj) {
        if (C0064.m4578() > 0) {
            return ((DialogC0385j0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۣ۟, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4414() {
        if (C0029.m2791() >= 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_EXPECTED_DIGEST_MISMATCH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۡۢ, reason: not valid java name and contains not printable characters */
    public static void m4415(Object obj, int i, Object obj2) {
        if (C0067.m5468() < 0) {
            ((C0334b3) obj).a(i, (C0365g) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m4416(Object obj) {
        if (C0070.m5903() >= 0) {
            return AbstractC0440s2.a((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۥ۟, reason: contains not printable characters */
    public static String m4417(Object obj) {
        if (C0017.m846() > 0) {
            return ((AndroidBinXmlParser) obj).getNamespace();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۨ, reason: contains not printable characters */
    public static Activity m4418(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((J2) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۤۡ, reason: contains not printable characters */
    public static void m4419(Object obj, int i) {
        if (C0035.m3569() <= 0) {
            ((ListView) obj).setCacheColorHint(i);
        }
    }

    /* JADX INFO: renamed from: ۥۢ۟۠, reason: contains not printable characters */
    public static void m4420(Object obj, Object obj2, int i, int i2) {
        if (C0075.m6893() >= 0) {
            ((ByteArrayDataSink) obj).consume((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۣ۠, reason: contains not printable characters */
    public static SharedPreferences.Editor m4421(Object obj, Object obj2, int i) {
        if (C0066.m4827() > 0) {
            return ((SharedPreferences.Editor) obj).putInt((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۤ, reason: contains not printable characters */
    public static Paint m4422(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((U3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۤ, reason: contains not printable characters */
    public static void m4423(Object obj, Object obj2) {
        if (C0065.m4647() > 0) {
            ((MessageDigest) obj).update((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۧ۠ۧ, reason: contains not printable characters */
    public static byte[] m4424(Object obj, Object obj2, int i) {
        if (C0027.m2460() >= 0) {
            return V4SchemeSigner.d((DataSource) obj, (ApkUtils.ZipSections) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۢ۟, reason: contains not printable characters */
    public static int m4425(Object obj, int i) {
        if (C0024.m2011() <= 0) {
            return ((Calendar) obj).get(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۧۢۧ, reason: contains not printable characters */
    public static int m4426(Object obj, Object obj2) {
        if (C0069.m5781() <= 0) {
            return ((AbstractC0416o1) obj).read((byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۧۧ, reason: contains not printable characters */
    public static int m4427() {
        return 1750620 ^ C0032.m3236((Object) "ۣۢۤ");
    }

    /* JADX INFO: renamed from: ۥۣۨۢ, reason: contains not printable characters */
    public static String m4428() {
        if (C0039.m4109() > 0) {
            return "AES/GCM/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۧ, reason: contains not printable characters */
    public static boolean m4429(Object obj, Object obj2) {
        if (C0035.m3569() <= 0) {
            return ((TreeSet) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡ۟ۡ, reason: contains not printable characters */
    public static MatchType m4430(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((C4) obj).H;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۡۧ, reason: contains not printable characters */
    public static HashMap m4431(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((X3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤ۟, reason: contains not printable characters */
    public static Activity m4432(Object obj) {
        if (C0066.m4827() > 0) {
            return ((DialogC0373h0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡ, reason: contains not printable characters */
    public static boolean m4433(Object obj, Object obj2) {
        if (C0036.m3653() <= 0) {
            return C$Gson$Types.equals((Type) obj, (Type) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۤۦ, reason: contains not printable characters */
    public static Charset m4434(Object obj) {
        if (C0017.m846() >= 0) {
            return ((M4) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۟ۦ, reason: contains not printable characters */
    public static Set m4435(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((PosixFileAttributes) obj).permissions();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۢۨ, reason: contains not printable characters */
    public static boolean m4436(Object obj) {
        if (C0068.m5678() > 0) {
            return ((JsonElement) obj).isJsonNull();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۧۡۢ, reason: contains not printable characters */
    public static ScriptMatchBean m4437(Object obj) {
        if (C0073.m6356() < 0) {
            return ((C4) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۤۦ, reason: contains not printable characters */
    public static void m4438(Object obj) {
        if (C0031.m3075() >= 0) {
            ((O1) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۦۨۥۨ, reason: contains not printable characters */
    public static int m4439(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((AutoClickPointerBean) obj).getSlideEndPointerY();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۨۧ, reason: contains not printable characters */
    public static CharSequence m4440(Object obj, Object obj2) {
        if (C0034.m3450() > 0) {
            return ((PackageItemInfo) obj).loadLabel((PackageManager) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m4441(Object obj) {
        if (C0032.m3184() <= 0) {
            return C0077.m7217((ApkSigner.SignerConfig.Builder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۢۥ, reason: not valid java name and contains not printable characters */
    public static List m4442(Object obj, int i, boolean z, boolean z2) {
        if (C0027.m2460() > 0) {
            return V4SchemeSigner.getSuggestedSignatureAlgorithms((PublicKey) obj, i, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m4443(boolean z) {
        if (C0072.m6216() > 0) {
            return Asn1DerEncoder.access$600(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۨۡ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m4444(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((ApkVerifier.Result) obj).getSigningCertificateLineage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static TextView m4445(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((DialogC0331b0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥۣ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m4446() {
        if (C0029.m2791() >= 0) {
            return TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۡ۠, reason: not valid java name and contains not printable characters */
    public static int m4447(int i) {
        if (C0075.m6893() >= 0) {
            return K3.k(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۡۤ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m4448(Object obj, Object obj2, Object obj3) {
        if (m4427() > 0) {
            return I1.a((Activity) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥۥ, reason: not valid java name and contains not printable characters */
    public static void m4449(Object obj) {
        if (C0072.m6216() > 0) {
            ((Z0) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۨۧۢۨ, reason: not valid java name and contains not printable characters */
    public static Gson m4450() {
        if (C0029.m2791() >= 0) {
            return GsonUtils.getGson();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۥ, reason: not valid java name and contains not printable characters */
    public static Z4 m4451(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((U3) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۤ, reason: not valid java name and contains not printable characters */
    public static ImageView m4452(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((N) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۧ, reason: not valid java name and contains not printable characters */
    public static ViewOnClickListenerC0480z0 m4453(Object obj) {
        if (C0037.m3837() < 0) {
            return ((DialogC0373h0) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۥۢ, reason: not valid java name and contains not printable characters */
    public static String m4315(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
