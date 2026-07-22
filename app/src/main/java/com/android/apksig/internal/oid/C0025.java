package com.android.apksig.internal.oid;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Point;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.C0016;
import com.android.apksig.apk.CodenameMinSdkVersionException;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SigningCertificateLineage;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1Tagging;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.DataSources;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.basetoollib.GsonUtils;
import com.joke.connectdevice.bean.AutoClickContentBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.FieldNamingStrategy;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.LinkedHashTreeMap;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.JsonTreeReader;
import com.joke.plugin.gson.internal.bind.SqlDateTypeAdapter;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonToken;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.entry.MetaSelectAppAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0416o1;
import com.zfork.multiplatforms.android.bomb.AbstractC0452u2;
import com.zfork.multiplatforms.android.bomb.B3;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0328a4;
import com.zfork.multiplatforms.android.bomb.C0341c3;
import com.zfork.multiplatforms.android.bomb.C0348d3;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0362f3;
import com.zfork.multiplatforms.android.bomb.C0370g4;
import com.zfork.multiplatforms.android.bomb.C0412n3;
import com.zfork.multiplatforms.android.bomb.C0439s1;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C2;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.C5;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0448t4;
import com.zfork.multiplatforms.android.bomb.DialogC0472x4;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.F5;
import com.zfork.multiplatforms.android.bomb.I;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.InterfaceC0477y3;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q2;
import com.zfork.multiplatforms.android.bomb.Q3;
import com.zfork.multiplatforms.android.bomb.S0;
import com.zfork.multiplatforms.android.bomb.S2;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0386j1;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0438s0;
import com.zfork.multiplatforms.android.bomb.W1;
import com.zfork.multiplatforms.android.bomb.Y4;
import com.zfork.multiplatforms.android.bomb.Z2;
import com.zfork.multiplatforms.android.bomb.h5;
import com.zfork.multiplatforms.android.bomb.o5;
import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.TypeVariable;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.CodeSigner;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.Timestamp;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.logging.Logger;
import javax.crypto.Mac;
import org.conscrypt.C0111;
import org.json.JSONArray;
import sun.security.x509.GeneralName;
import sun.security.x509.X509CertImpl;
import sun.security.x509.X509CertInfo;

/* JADX INFO: renamed from: com.android.apksig.internal.oid.ۥۡۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0025 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f105short = {448, 1315};

    /* JADX INFO: renamed from: ۡۥۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean f106 = true;

    /* JADX INFO: renamed from: ۟۟۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2084(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((List) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m2085(Object obj) {
        if (C0023.m1921() > 0) {
            ((Iterator) obj).remove();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static String m2086(Object obj, int i, Object obj2) {
        if (C0071.m6069() > 0) {
            return K3.n((String) obj, i, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۨ۟, reason: not valid java name and contains not printable characters */
    public static CertPath m2087(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((Timestamp) obj).getSignerCertPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static void m2088(Object obj, boolean z) {
        if (C0068.m5678() >= 0) {
            ((U3) obj).setDrawBackground(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerCapabilities.Builder m2089(Object obj, boolean z) {
        if (C0023.m1921() > 0) {
            return ((SigningCertificateLineage.SignerCapabilities.Builder) obj).setSharedUid(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۤۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m2090(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((V4Signature.SigningInfoBlock) obj).signingInfo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static LayoutInflater m2091(Object obj) {
        if (C0072.m6216() > 0) {
            return LayoutInflater.from((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m2092(Object obj, Object obj2) {
        if (C0030.m2940() > 0) {
            return ((String) obj).getBytes((Charset) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۨ۠, reason: not valid java name and contains not printable characters */
    public static int m2093(Object obj) {
        if (m2132() > 0) {
            return ((V4Signature.HashingInfo) obj).hashAlgorithm;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۤ, reason: not valid java name and contains not printable characters */
    public static C0328a4 m2094() {
        if (C0077.m7272() < 0) {
            return O2.X;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static C0348d3 m2095(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((C0341c3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m2096(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((Key) obj).getEncoded();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m2097() {
        if (C0068.m5678() > 0) {
            return "Alg.Alias.Mac.HMAC/SHA384";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢ۠, reason: not valid java name and contains not printable characters */
    public static void m2098(Object obj, int i) {
        if (C0075.m6893() >= 0) {
            ((LinearLayout) obj).setOrientation(i);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static Object m2099(Object obj, Object obj2, Object obj3) {
        if (C0067.m5468() < 0) {
            return ((Hashtable) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۨ, reason: not valid java name and contains not printable characters */
    public static Asn1Tagging m2100() {
        if (C0074.m6454() < 0) {
            return Asn1Tagging.EXPLICIT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m2101(int i, Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            return C0111.m13082(new SigningCertificateLineage(new ArrayList(), i), (SigningCertificateLineage.SignerConfig) obj, (SigningCertificateLineage.SignerCapabilities) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static EditText m2102(Object obj) {
        if (C0017.m846() >= 0) {
            return ((C4) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static GeneralName m2103(Object obj, Object obj2) {
        if (C0034.m3450() > 0) {
            return O2.c((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Console m2104() {
        if (C0077.m7272() < 0) {
            return System.console();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static C0479z m2105(Object obj) {
        if (C0072.m6216() > 0) {
            return ((C4) obj).E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m2106(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((Class) obj).getEnumConstants();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۥ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m2107(Object obj, Object obj2, float f) {
        if (C0077.m7272() < 0) {
            return ((SharedPreferences.Editor) obj).putFloat((String) obj2, f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۤ, reason: not valid java name and contains not printable characters */
    public static String m2108(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((CodenameMinSdkVersionException) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۥ۠, reason: not valid java name and contains not printable characters */
    public static String m2109(Object obj, Object obj2) {
        if (C0072.m6216() > 0) {
            return ((ManifestParser.Section) obj).getAttributeValue((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static double m2110(Object obj) {
        return C0028.m2593() >= 0 ? ((JsonReader) obj).nextDouble() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2111(Object obj, Object obj2) {
        if (C0037.m3837() <= 0) {
            return ((String) obj).equalsIgnoreCase((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m2112(Object obj) {
        if (C0038.m4010() >= 0) {
            return GsonUtils.toJson(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2113(Object obj, Object obj2) {
        if (C0017.m846() >= 0) {
            return ((Collection) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m2114() {
        if (C0027.m2460() > 0) {
            return TypeAdapters.BOOLEAN_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m2115(Object obj, Object obj2) {
        if (C0066.m4827() > 0) {
            ((AtomicReference) obj).set(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static Mac m2116(Object obj) {
        if (C0065.m4647() > 0) {
            return ((Q2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static Set m2117(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((HashMap) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۨ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m2118(Object obj) {
        if (C0076.m6903() < 0) {
            return ((I1) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static Enumeration m2119(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((KeyStore) obj).aliases();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m2120(Object obj) {
        if (C0039.m4109() > 0) {
            return ((JsonTreeReader) obj).getPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2121(Object obj) {
        if (C0071.m6069() >= 0) {
            return Boolean.parseBoolean((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m2122(int i, Object obj, int i2) {
        if (C0032.m3184() <= 0) {
            C0073.m6350(i, (byte[]) obj, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static void m2123(Object obj, Object obj2) {
        if (C0075.m6893() > 0) {
            ((Activity) obj).runOnUiThread((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2124(Object obj, Object obj2) {
        if (C0032.m3184() < 0) {
            return ((ArrayList) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static List m2125(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((V1SchemeVerifier.Result) obj).getWarnings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static String m2126() {
        if (C0023.m1921() >= 0) {
            return "<providerclass>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۨۤ, reason: not valid java name and contains not printable characters */
    public static Map m2127(int i) {
        if (C0026.m2298() <= 0) {
            return ApkVerifier.j(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2128(Object obj) {
        if (C0063.m4427() > 0) {
            return ((C5) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۧ۟, reason: not valid java name and contains not printable characters */
    public static Resources m2129() {
        if (C0063.m4427() > 0) {
            return Resources.getSystem();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2130(Object obj) {
        if (C0078.m7450() > 0) {
            return ((LocalFileRecord) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦ۠, reason: not valid java name and contains not printable characters */
    public static Signature m2131(Object obj) {
        if (C0072.m6216() > 0) {
            return Signature.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۧۡ, reason: not valid java name and contains not printable characters */
    public static int m2132() {
        return 1747626 ^ C0032.m3236((Object) "۠۠۠");
    }

    /* JADX INFO: renamed from: ۟ۤۧۧۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC0416o1 m2133(Object obj) {
        if (C0028.m2593() > 0) {
            return ((C5) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۡ, reason: not valid java name and contains not printable characters */
    public static String m2134(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((V1SchemeVerifier.NamedDigest) obj).jcaDigestAlgorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥ۟, reason: not valid java name and contains not printable characters */
    public static int m2135(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((E1) obj).u;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۨ, reason: not valid java name and contains not printable characters */
    public static String m2136(Object obj, Object obj2, int i) {
        if (C0028.m2593() > 0) {
            return C0361f2.c((String) obj, (List) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Result m2137(Object obj, Object obj2, Object obj3) {
        if (C0031.m3075() >= 0) {
            return ApkVerifier.d((ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus) obj, (ApkVerifier.Issue) obj2, (Object[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۤ, reason: not valid java name and contains not printable characters */
    public static void m2138(Object obj, int i) {
        if (C0029.m2791() > 0) {
            ((AutoClickContentBean) obj).setScreenPixelWidth(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۢ, reason: not valid java name and contains not printable characters */
    public static double m2139(Object obj) {
        return C0037.m3837() <= 0 ? ((S0) obj).a : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2140(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((I1) obj).m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2141(String str) {
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
        String strM1650 = C0021.m1650(m2205(), 0, 1, 417);
        while (C0078.m7380(strM1650) > 0) {
            strM1650 = C0031.m2993();
            if (C0078.m7380(strM1650) == 0) {
                strM1650 = C0070.m5942(m2205(), 1, 1, 1346);
            }
        }
        int iM7380 = C0078.m7380(strM1650);
        int iM73802 = C0078.m7380(strM29932);
        for (int i3 = 0; i3 < iM7380; i3++) {
            bArrM7297[i3] = (byte) (bArrM7297[i3] ^ C0077.m7212(strM29932, i3 % iM73802));
        }
        for (int iM73803 = 0; iM73803 < bArrM7297.length; iM73803 = C0078.m7380(C0031.m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static JsonWriter m2142(Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            return ((JsonWriter) obj).value((Boolean) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۣ, reason: not valid java name and contains not printable characters */
    public static int m2143(Object obj) {
        if (C0037.m3837() <= 0) {
            return C0036.m3733((DefaultApkSignerEngine.SignerConfig.Builder) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m2144() {
        if (C0026.m2298() <= 0) {
            return o5.h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m2145(Object obj, int i) {
        if (C0027.m2460() >= 0) {
            return ((Vector) obj).elementAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static C0412n3 m2146() {
        if (C0029.m2791() >= 0) {
            return h5.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟۠, reason: not valid java name and contains not printable characters */
    public static void m2147(Object obj, int i, Object obj2) {
        if (C0023.m1921() > 0) {
            ((SourceStampVerifier.Result) obj).addVerificationWarning(i, (Object[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۡ۟, reason: not valid java name and contains not printable characters */
    public static int m2148(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((BerDataValue) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨ۟, reason: not valid java name and contains not printable characters */
    public static DataSource m2149(Object obj) {
        if (C0078.m7450() > 0) {
            return DataSources.asDataSource((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۤ, reason: not valid java name and contains not printable characters */
    public static List m2150(Object obj, int i, int i2) {
        if (C0072.m6216() >= 0) {
            return ApkSigningBlockUtils.getSignaturesToVerify((List) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2152(Object obj, boolean z) {
        if (C0017.m846() > 0) {
            return ((B3) obj).a(z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۡ, reason: not valid java name and contains not printable characters */
    public static DialogC0472x4 m2153(Object obj) {
        if (C0075.m6893() > 0) {
            return ((C0361f2) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.SigningSchemeBlockAndDigests m2154(Object obj) {
        if (C0032.m3184() < 0) {
            return ((V3SchemeSigner) obj).generateApkSignatureSchemeV3BlockAndDigests();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2155(Object obj, Object obj2) {
        if (C0020.m1385() <= 0) {
            return ((ArrayList) obj).indexOf(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۢۥ, reason: not valid java name and contains not printable characters */
    public static SourceStampVerifier.Result m2156(Object obj, Object obj2) {
        if (C0029.m2791() >= 0) {
            return ((SourceStampVerifier) obj).verifySourceStamp((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨۤ, reason: not valid java name and contains not printable characters */
    public static T1 m2157(Object obj) {
        if (C0065.m4647() > 0) {
            return ((W1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Pair m2158(Object obj, Object obj2) {
        if (C0031.m3075() > 0) {
            return Pair.of(obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m2159(Object obj, int i) {
        if (C0111.m13165() <= 0) {
            ((AutoClickContentBean) obj).setScreenPixelHeight(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m2160(Object obj, int i) {
        if (C0017.m846() > 0) {
            ((Window) obj).setGravity(i);
        }
    }

    /* JADX INFO: renamed from: ۠۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static E1 m2161(Object obj, Object obj2) {
        if (C0076.m6903() < 0) {
            return AbstractC0406m3.l((D5) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static String[] m2162(Object obj) {
        if (C0072.m6216() > 0) {
            return ((C0439s1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0477y3 m2163(Object obj) {
        if (C0072.m6216() > 0) {
            return ((C0444t0) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۧۢ, reason: not valid java name and contains not printable characters */
    public static String m2164() {
        if (C0078.m7450() > 0) {
            return "<destalias>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m2165() {
        if (C0028.m2593() > 0) {
            return "alias.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static int m2166(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((MotionEvent) obj).getAction();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static TextView m2167(Object obj) {
        if (C0071.m6069() > 0) {
            return ((DialogC0448t4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m2168(Object obj) {
        if (C0074.m6454() < 0) {
            return ((C4) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Result.SourceStampInfo m2169(Object obj) {
        if (C0033.m3358() < 0) {
            return ((ApkVerifier.Result) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static int m2170(Object obj) {
        if (C0031.m3075() > 0) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static Activity m2171(Object obj) {
        if (C0065.m4647() > 0) {
            return ((I) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static int m2172(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((C0357e5) obj).available();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static List m2173(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((C0370g4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2174(Object obj) {
        if (C0071.m6069() > 0) {
            return ((ApkSigner.Builder) obj).o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static String m2175() {
        if (C0031.m3075() >= 0) {
            return "OpenSSLSignatureRawECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static C0370g4 m2176(Object obj) {
        if (C0063.m4427() > 0) {
            return ((C4) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۧۥ, reason: not valid java name and contains not printable characters */
    public static C0362f3 m2177(Object obj) {
        if (C0029.m2791() > 0) {
            return ((S2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۡۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m2178() {
        if (C0111.m13165() < 0) {
            return V1SchemeVerifier.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۢۤ, reason: not valid java name and contains not printable characters */
    public static Logger m2179() {
        if (C0033.m3358() < 0) {
            return AbstractC0452u2.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۤ۠, reason: not valid java name and contains not printable characters */
    public static MetaSelectAppAbility m2180(Object obj) {
        if (m2132() >= 0) {
            return ((Z2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static int m2181(Object obj) {
        if (C0078.m7450() > 0) {
            return ((F5) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static X509Certificate m2182(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((V3SigningCertificateLineage.SigningCertificateNode) obj).signingCert;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static void m2183(Object obj, Object obj2) {
        if (C0027.m2460() > 0) {
            ApkVerifier.Result.access$000((ApkVerifier.Result) obj, (ApkSigningBlockUtils.Result) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Path m2184(Object obj) {
        if (C0016.m717() < 0) {
            return ((Y4) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۦۨ, reason: not valid java name and contains not printable characters */
    public static String m2185(Object obj) {
        if (C0077.m7272() < 0) {
            return ((TypeVariable) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۨۤ, reason: not valid java name and contains not printable characters */
    public static Supplier m2186(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((C2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۦ, reason: not valid java name and contains not printable characters */
    public static int m2187(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((View) obj).getHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m2188() {
        if (C0038.m4010() > 0) {
            return SqlDateTypeAdapter.FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۤۢ, reason: not valid java name and contains not printable characters */
    public static FrameLayout m2189(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((C0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۨ۟, reason: not valid java name and contains not printable characters */
    public static void m2190(Object obj, Object obj2, Object obj3) {
        if (C0026.m2298() < 0) {
            ((X509CertImpl) obj).sign((PrivateKey) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۨ۟۠, reason: not valid java name and contains not printable characters */
    public static WindowManager.LayoutParams m2191(Object obj) {
        if (C0017.m846() >= 0) {
            return ((T1) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۧ, reason: not valid java name and contains not printable characters */
    public static V3SchemeVerifier.Builder m2192(Object obj, int i) {
        if (C0037.m3837() < 0) {
            return ((V3SchemeVerifier.Builder) obj).setBlockId(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۡۡ, reason: not valid java name and contains not printable characters */
    public static File m2193(Object obj) {
        if (C0017.m846() >= 0) {
            return ((O2) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2194(Object obj, Object obj2) {
        if (C0017.m846() >= 0) {
            return ((Signature) obj).verify((byte[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m2195(Object obj) {
        if (C0075.m6893() > 0) {
            return ((AbstractC0384j) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static int m2196(Object obj) {
        if (C0111.m13165() < 0) {
            return ((JSONArray) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۢ, reason: contains not printable characters */
    public static String m2197() {
        if (C0111.m13165() < 0) {
            return "OpenSSLEvpCipherDESEDE$CBC$PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟ۦ, reason: contains not printable characters */
    public static Object m2198(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            return ((X509CertInfo) obj).get((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۧ۠, reason: contains not printable characters */
    public static Iterator m2199(Object obj) {
        if (C0038.m4010() > 0) {
            return ((TreeSet) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۤۧ, reason: contains not printable characters */
    public static TextView m2200(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((DialogC0389j4) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۥ, reason: contains not printable characters */
    public static void m2201(Object obj) {
        if (C0028.m2593() >= 0) {
            Collections.reverse((List) obj);
        }
    }

    /* JADX INFO: renamed from: ۥۨۤۢ, reason: contains not printable characters */
    public static boolean m2202(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((Class) obj).isInterface();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠۠ۨ, reason: contains not printable characters */
    public static void m2203(Object obj, Object obj2) {
        if (C0035.m3569() <= 0) {
            ((Choreographer) obj).postFrameCallback((Choreographer.FrameCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣ۠ۧ, reason: contains not printable characters */
    public static void m2204(Object obj) {
        if (C0070.m5903() > 0) {
            ((LinkedHashTreeMap) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۦۢ۟۠, reason: contains not printable characters */
    public static short[] m2205() {
        if (C0021.m1598() < 0) {
            return f105short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣۢ, reason: contains not printable characters */
    public static Timestamp m2206(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((CodeSigner) obj).getTimestamp();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۥۧ, reason: contains not printable characters */
    public static String m2207(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            return ((FieldNamingStrategy) obj).translateName((Field) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۧ, reason: contains not printable characters */
    public static InputStream m2208(Object obj) {
        if (C0027.m2460() > 0) {
            return ((Q3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m2209() {
        if (C0032.m3184() < 0) {
            return "PrivateKeyEntry";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۥ, reason: not valid java name and contains not printable characters */
    public static Asn1Tagging m2210() {
        if (C0038.m4010() >= 0) {
            return Asn1Tagging.NORMAL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۧ, reason: not valid java name and contains not printable characters */
    public static int m2211(Object obj) {
        if (C0071.m6069() >= 0) {
            return Security.addProvider((Provider) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡۨۥ, reason: not valid java name and contains not printable characters */
    public static double m2212(double d, double d2) {
        return C0018.m1064() > 0 ? Math.pow(d, d2) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۣۧۢۡ, reason: not valid java name and contains not printable characters */
    public static void m2213(Object obj, byte b) {
        if (C0063.m4427() > 0) {
            Arrays.fill((byte[]) obj, b);
        }
    }

    /* JADX INFO: renamed from: ۧۢۡۦ, reason: not valid java name and contains not printable characters */
    public static void m2214(Object obj, int i) throws IOException {
        if (C0016.m717() < 0) {
            ((DataOutputStream) obj).writeInt(i);
        }
    }

    /* JADX INFO: renamed from: ۣۧۡ۠, reason: not valid java name and contains not printable characters */
    public static int m2215(Object obj) {
        if (C0017.m846() > 0) {
            return ((Point) obj).y;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۦ, reason: not valid java name and contains not printable characters */
    public static String m2216(Object obj) {
        if (C0020.m1385() < 0) {
            return ((ApkSigner.Builder) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static DataSink m2217(Object obj) {
        if (C0078.m7450() > 0) {
            return ((ApkSigner) obj).y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m2218(Object obj) {
        if (C0036.m3653() < 0) {
            return ((ViewOnClickListenerC0438s0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۨ۟۟, reason: not valid java name and contains not printable characters */
    public static void m2219(Object obj, Object obj2) throws IOException {
        if (C0030.m2940() > 0) {
            ((PrintStream) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static JsonToken m2220() {
        if (C0036.m3653() <= 0) {
            return JsonToken.NAME;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۦۣ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m2221(Object obj) {
        if (C0028.m2593() > 0) {
            return ((DefaultApkSignerEngine.Builder) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۡۢ, reason: not valid java name and contains not printable characters */
    public static String[] m2222(Object obj, Object obj2) {
        if (C0067.m5468() < 0) {
            return ((String) obj).split((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۤ, reason: not valid java name and contains not printable characters */
    public static int m2223(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((BigDecimal) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m2224(Object obj) {
        if (C0032.m3184() < 0) {
            return ((ApkVerifier.Result) obj).q;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static ConsumerAbility m2225(Object obj) {
        if (C0031.m3075() > 0) {
            return ((ViewOnClickListenerC0386j1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦۤ, reason: not valid java name and contains not printable characters */
    public static String m2226() {
        if (C0028.m2593() > 0) {
            return "<srcalias>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m2227(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((ActivityInfo) obj).nonLocalizedLabel;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۦۧ, reason: not valid java name and contains not printable characters */
    public static void m2228(Object obj, Object obj2) throws IOException {
        if (C0072.m6216() > 0) {
            ((RandomAccessFile) obj).readFully((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m2151(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
