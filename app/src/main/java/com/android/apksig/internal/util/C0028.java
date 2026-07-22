package com.android.apksig.internal.util;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.KeyConfig;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.ApkUtilsLite;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.asn1.Asn1TagClass;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.asn1.ber.BerEncoding;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.basetoollib.LoadDrawableUtils;
import com.joke.connectdevice.bean.AutoClickBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonArray;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonObject;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.JsonStreamParser;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.LinkedTreeMap;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonToken;
import com.joke.script.bean.C0074;
import com.joke.script.bean.MatchType;
import com.zfork.entry.C0075;
import com.zfork.entry.SignatureCreatorAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.hawk.cheat.MainEntry;
import com.zfork.multiplatforms.android.bomb.A;
import com.zfork.multiplatforms.android.bomb.AbstractC0400l3;
import com.zfork.multiplatforms.android.bomb.AbstractC0418o3;
import com.zfork.multiplatforms.android.bomb.AbstractC0449u;
import com.zfork.multiplatforms.android.bomb.AbstractViewOnClickListenerC0465w3;
import com.zfork.multiplatforms.android.bomb.B1;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0328a4;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0363f4;
import com.zfork.multiplatforms.android.bomb.C0381i2;
import com.zfork.multiplatforms.android.bomb.C0408n;
import com.zfork.multiplatforms.android.bomb.C0426q;
import com.zfork.multiplatforms.android.bomb.C0428q1;
import com.zfork.multiplatforms.android.bomb.C0461w;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C0482z2;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0403m0;
import com.zfork.multiplatforms.android.bomb.DialogC0448t4;
import com.zfork.multiplatforms.android.bomb.DialogC0472x4;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.G3;
import com.zfork.multiplatforms.android.bomb.G5;
import com.zfork.multiplatforms.android.bomb.H;
import com.zfork.multiplatforms.android.bomb.H4;
import com.zfork.multiplatforms.android.bomb.I4;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.R0;
import com.zfork.multiplatforms.android.bomb.R4;
import com.zfork.multiplatforms.android.bomb.RunnableC0346d1;
import com.zfork.multiplatforms.android.bomb.T;
import com.zfork.multiplatforms.android.bomb.U1;
import com.zfork.multiplatforms.android.bomb.V1;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0386j1;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0409n0;
import com.zfork.multiplatforms.android.bomb.Y4;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.conscrypt.C0111;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: com.android.apksig.internal.util.ۣ۟ۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0028 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f123short = {2577, 2462};

    /* JADX INFO: renamed from: ۟ۥۧۨۤ, reason: not valid java name and contains not printable characters */
    public static int f124 = 60;

    /* JADX INFO: renamed from: ۟۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static TextView m2534(Object obj) {
        if (C0024.m2011() < 0) {
            return ((C0381i2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m2535(Object obj) {
        if (C0077.m7272() < 0) {
            return ((JsonObject) obj).deepCopy();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static MatchType m2536() {
        if (C0038.m4010() >= 0) {
            return MatchType.JumpProject;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static int m2537(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((Inflater) obj).getRemaining();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2538(Object obj) {
        if (C0034.m3450() > 0) {
            return ((JsonStreamParser) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static void m2539(Object obj, boolean z) {
        if (C0078.m7450() >= 0) {
            ((ApkVerifier.Result) obj).setWarningsAsErrors(z);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۥۧ, reason: not valid java name and contains not printable characters */
    public static float m2540(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((B1) obj).i;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static List m2541(Object obj) {
        if (C0016.m717() <= 0) {
            return ((ApkVerifier.Result.V4SchemeSignerInfo) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static KeyConfig m2542(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((ApkSigningBlockUtils.SignerConfig) obj).keyConfig;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m2543(Object obj) {
        if (C0072.m6216() > 0) {
            return ((BerDataValue) obj).getEncoded();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m2544(Object obj) {
        if (C0063.m4427() > 0) {
            return ((File) obj).getCanonicalPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static Rect m2545(Object obj) {
        if (C0016.m717() < 0) {
            return ((Y4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static DigestAlgorithm m2546() {
        if (C0070.m5903() >= 0) {
            return DigestAlgorithm.SHA256;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static Object m2547(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((H) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m2548() {
        if (C0075.m6893() >= 0) {
            return "Not.a.signed.jar.file";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static void m2549(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0069.m5781() <= 0) {
            ApkVerifier.b((List) obj, (List) obj2, (byte[]) obj3, (ApkVerifier.Result) obj4);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static Deflater m2550(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((C0428q1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m2551(Object obj) {
        if (C0037.m3837() < 0) {
            return ApkUtilsLite.computeSha256DigestBytes((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static int m2552(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((Double) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥۣ, reason: not valid java name and contains not printable characters */
    public static JsonToken m2553() {
        if (C0039.m4109() > 0) {
            return JsonToken.NULL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static String m2554() {
        if (C0077.m7272() < 0) {
            return "Alg.Alias.Signature.OID.1.2.840.10045.4.3.3";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static Iterator m2555(Object obj) {
        if (C0023.m1921() > 0) {
            return ((HashSet) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۦۢ, reason: not valid java name and contains not printable characters */
    public static String m2556(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((DialogC0385j0) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۢ, reason: not valid java name and contains not printable characters */
    public static SignatureCreatorAbility m2557(Object obj) {
        if (C0077.m7272() < 0) {
            return ((I4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m2558(Object obj) {
        if (C0021.m1598() <= 0) {
            AbstractC0449u.i((String[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2559(Object obj, Object obj2) {
        if (C0034.m3450() >= 0) {
            return ((Set) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧۥۤ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2560() {
        if (C0069.m5781() < 0) {
            return ApkVerifier.Issue.V2_SIG_NO_SUPPORTED_SIGNATURES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠۟, reason: not valid java name and contains not printable characters */
    public static long m2561(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((MotionEvent) obj).getDownTime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static void m2562(Object obj, Object obj2) {
        if (C0073.m6356() <= 0) {
            ApkVerifier.Result.access$100((ApkVerifier.Result) obj, (V1SchemeVerifier.Result) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m2563(Object obj, Object obj2, Object obj3) {
        if (C0078.m7450() > 0) {
            return ((O2) obj).l((KeyStore) obj2, (String) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۤ, reason: not valid java name and contains not printable characters */
    public static Object m2564(Object obj) {
        if (C0016.m717() < 0) {
            return ((V1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۦ, reason: not valid java name and contains not printable characters */
    public static ApkSignerEngine.OutputJarSignatureRequest m2565(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((ApkSignerEngine) obj).outputJarEntries();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥۣ, reason: not valid java name and contains not printable characters */
    public static View m2566(Object obj, int i) {
        if (C0027.m2460() > 0) {
            return ((Window) obj).findViewById(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m2567(Object obj, int i, int i2) {
        if (C0066.m4827() > 0) {
            return Arrays.copyOfRange((byte[]) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۡ, reason: not valid java name and contains not printable characters */
    public static Stream m2568(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((C0482z2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢۥ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m2569(Object obj) {
        if (C0111.m13165() < 0) {
            return SigningCertificateLineage.readFromV3AttributeValue((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۧ, reason: not valid java name and contains not printable characters */
    public static ManifestParser.Attribute m2570(Object obj) {
        if (C0020.m1385() < 0) {
            return ManifestParser.a((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡ۠, reason: not valid java name and contains not printable characters */
    public static Boolean m2571(Object obj) {
        if (C0024.m2011() < 0) {
            return Boolean.valueOf((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦ۟, reason: not valid java name and contains not printable characters */
    public static SignatureCreatorAbility m2572(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((H4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡۢ, reason: not valid java name and contains not printable characters */
    public static TextView m2573(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((C0363f4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m2574(Object obj) {
        if (C0074.m6454() < 0) {
            return ((H) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m2575() {
        if (C0024.m2011() < 0) {
            return SigningCertificateLineage.access$100();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static void m2576(Object obj, Object obj2) {
        if (C0070.m5903() > 0) {
            ((JsonArray) obj).add((JsonElement) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static C0351e m2577(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((ViewOnClickListenerC0386j1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m2578(Object obj, Object obj2, Object obj3) {
        if (C0023.m1921() > 0) {
            return ((LinkedTreeMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m2579() {
        if (C0025.m2132() >= 0) {
            return f123short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧۡ, reason: not valid java name and contains not printable characters */
    public static void m2580(Object obj, Object obj2) {
        if (C0029.m2791() > 0) {
            O2.M((X509Certificate) obj, (PrintStream) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static R4 m2581() {
        if (C0076.m6903() <= 0) {
            return R4.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static View m2582(Object obj, Object obj2) {
        if (C0068.m5678() >= 0) {
            return ((LoadDrawableUtils) obj).getView((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨۥ, reason: not valid java name and contains not printable characters */
    public static XmlResourceParser m2583(Object obj, Object obj2) {
        if (C0035.m3569() < 0) {
            return ((AssetManager) obj).openXmlResourceParser((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static float m2584(Object obj) {
        if (C0035.m3569() < 0) {
            return ((MotionEvent) obj).getX();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static int m2585(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((V1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2586(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((DefaultApkSignerEngine) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤۥۤ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m2587(Object obj, boolean z) {
        if (C0017.m846() > 0) {
            return ((ApkSigner.Builder) obj).setSourceStampTimestampEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static ResourceBundle m2588(Object obj) {
        if (C0017.m846() >= 0) {
            return ((C0328a4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۢ, reason: not valid java name and contains not printable characters */
    public static long m2589(double d) {
        if (C0078.m7450() > 0) {
            return Double.doubleToLongBits(d);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static int m2590(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((ViewOnClickListenerC0409n0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m2591(Object obj, boolean z) {
        if (C0027.m2460() > 0) {
            ((WebSettings) obj).setMediaPlaybackRequiresUserGesture(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static void m2592(Object obj, Object obj2) {
        if (C0111.m13165() < 0) {
            ((O2) obj).m((PrintStream) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۨۢ, reason: not valid java name and contains not printable characters */
    public static int m2593() {
        return 1751727 ^ C0032.m3236((Object) "ۤۥۨ");
    }

    /* JADX INFO: renamed from: ۟ۥۣۣ, reason: not valid java name and contains not printable characters */
    public static File m2594(Object obj) {
        if (C0031.m3075() > 0) {
            return ((G5) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m2595(Object obj, Object obj2, Object obj3) {
        if (C0024.m2011() < 0) {
            return ((Gson) obj).fromJson((Reader) obj2, (Type) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠۟, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2596() {
        if (C0027.m2460() >= 0) {
            return ApkVerifier.Issue.V3_SIG_APK_DIGEST_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2597(Object obj, Object obj2, Object obj3) {
        if (C0018.m1064() > 0) {
            return ((KeyStore) obj).entryInstanceOf((String) obj2, (Class) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۧ, reason: not valid java name and contains not printable characters */
    public static void m2598(Object obj) {
        if (C0036.m3653() < 0) {
            ((C0479z) obj).l();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۧ, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m2599(Object obj) {
        if (C0017.m846() >= 0) {
            return ((C4) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static long m2600(Object obj) {
        if (C0068.m5678() > 0) {
            return ((RandomAccessFile) obj).length();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static TextView m2601(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((DialogC0472x4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۡ, reason: not valid java name and contains not printable characters */
    public static String m2602(String str) {
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
        String strM4022 = C0038.m4022(m2579(), 0, 1, 2672);
        while (C0078.m7380(strM4022) > 0) {
            strM4022 = C0031.m2993();
            if (C0078.m7380(strM4022) == 0) {
                strM4022 = C0020.m1443(m2579(), 1, 1, 2559);
            }
        }
        int iM7380 = C0078.m7380(strM4022);
        int iM73802 = C0078.m7380(strM29932);
        for (int i3 = 0; i3 < iM7380; i3++) {
            bArrM7297[i3] = (byte) (bArrM7297[i3] ^ C0077.m7212(strM29932, i3 % iM73802));
        }
        for (int iM73803 = 0; iM73803 < bArrM7297.length; iM73803 = C0078.m7380(C0031.m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m2603(Object obj, long j, int i, Object obj2) {
        if (C0036.m3653() < 0) {
            ((DataSource) obj).copyTo(j, i, (ByteBuffer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2604(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((ApkSigner.SignerConfig.Builder) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static Uri m2605(Object obj, Object obj2) {
        if (C0025.m2132() > 0) {
            return DocumentsContract.buildChildDocumentsUriUsingTree((Uri) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m2606(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((C0426q) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static TextView m2607(Object obj) {
        if (C0077.m7272() < 0) {
            return ((U1) obj).getTvSet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int m2608(Object obj) {
        if (C0073.m6356() <= 0) {
            return BerEncoding.getTagClass((Asn1TagClass) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۢۨ, reason: not valid java name and contains not printable characters */
    public static ProgressBar m2610(Object obj) {
        if (C0064.m4578() > 0) {
            return ((DialogC0403m0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static double m2611(Object obj) {
        return C0074.m6454() <= 0 ? Double.parseDouble((String) obj) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m2612(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((SourceStampVerifier.Result) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m2613(Object obj, Object obj2) {
        if (C0018.m1064() >= 0) {
            ((TextView) obj).setFilters((InputFilter[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m2614(Object obj) {
        if (C0037.m3837() < 0) {
            return ((E1) obj).x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static ContentResolver m2615(Object obj) {
        if (C0023.m1921() > 0) {
            return ((Context) obj).getContentResolver();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۟۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m2616(Object obj, Object obj2) {
        if (C0029.m2791() >= 0) {
            return ((Intent) obj).getParcelableArrayListExtra((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۤۦ, reason: not valid java name and contains not printable characters */
    public static void m2617(Object obj, int i) {
        if (C0019.m1311() == 0) {
            ((AutoClickPointerBean) obj).setPointerX(i);
        }
    }

    /* JADX INFO: renamed from: ۡۥۦۤ, reason: not valid java name and contains not printable characters */
    public static String m2618() {
        if (C0067.m5468() <= 0) {
            return "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TGFuZHJvaWQvdXRpbC9Mb2c7ABFMamF2YS9sYW5nL0NsYXNzOwAUTGphdmEvbGFuZy9DbGFzczwqPjsAEkxqYXZhL2xhbmcvT2JqZWN0OwASTGphdmEvbGFuZy9TdHJpbmc7ABJMamF2YS9sYW5nL1N5c3RlbTsAFUxqYXZhL2xhbmcvVGhyb3dhYmxlOwAaTGphdmEvbGFuZy9yZWZsZWN0L01ldGhvZDsAJkxtZS93ZWlzaHUvZnJlZXJlZmxlY3Rpb24vQnVpbGRDb25maWc7ACVMbWUvd2Vpc2h1L3JlZmxlY3Rpb24vQm9vdHN0cmFwQ2xhc3M7ACFMbWUvd2Vpc2h1L3JlZmxlY3Rpb24vUmVmbGVjdGlvbjsAClJlZmxlY3Rpb24AD1JlZmxlY3Rpb24uamF2YQAHU0RLX0lOVAADVEFHAAFWAAxWRVJTSU9OX0NPREUADFZFUlNJT05fTkFNRQACVkwAAVoAAlpMABJbTGphdmEvbGFuZy9DbGFzczsAE1tMamF2YS9sYW5nL09iamVjdDsAE1tMamF2YS9sYW5nL1N0cmluZzsAB2NvbnRleHQAF2RhbHZpay5zeXN0ZW0uVk1SdW50aW1lAAFlAAZleGVtcHQACWV4ZW1wdEFsbAAHZm9yTmFtZQAPZnJlZS1yZWZsZWN0aW9uABJnZXRBcHBsaWNhdGlvbkluZm8AEWdldERlY2xhcmVkTWV0aG9kAApnZXRSdW50aW1lAAZpbnZva2UAC2xvYWRMaWJyYXJ5ABhtZS53ZWlzaHUuZnJlZXJlZmxlY3Rpb24ABm1ldGhvZAAHbWV0aG9kcwAZcmVmbGVjdCBib290c3RyYXAgZmFpbGVkOgAHcmVsZWFzZQAKc1ZtUnVudGltZQAWc2V0SGlkZGVuQXBpRXhlbXB0aW9ucwAQdGFyZ2V0U2RrVmVyc2lvbgAEdGhpcwAGdW5zZWFsAAx1bnNlYWxOYXRpdmUADnZtUnVudGltZUNsYXNzAAYABw4AFgAHDmr/AwEyCwEVEAMCNQvwBAREBhcBEg8DAzYLARsPqQUCBQMFBBkeAwAvCgAOAAcOACwBOgcOADYBOwcsnRriAQEDAC8KHgBIAAcOAA0ABw4AEwEtBx1yGWtaAAYXOBc8HxcABAEXAQEXBgEXHwYAAQACGQEZARkBGQEZARkGgYAEiAcDAAUACBoBCgEKB4iABKAHAYGABLQJAQnMCQGJAfQJAQnMCgEAAwALGgyBgAT4CgEJkAsBigIAAAAADgAAAAAAAAABAAAAAAAAAAEAAABEAAAAcAAAAAIAAAATAAAAgAEAAAMAAAALAAAAzAEAAAQAAAAMAAAAUAIAAAUAAAAPAAAAsAIAAAYAAAADAAAAKAMAAAEgAAAIAAAAiAMAAAEQAAAHAAAA3AUAAAIgAABEAAAAFgYAAAMgAAAIAAAAAwoAAAUgAAADAAAAZgoAAAAgAAADAAAAeAoAAAAQAAABAAAAyAoAAA==";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۦۦ, reason: not valid java name and contains not printable characters */
    public static TextView m2619(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((U1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۤۥ, reason: not valid java name and contains not printable characters */
    public static void m2620(Object obj, int i) {
        if (C0074.m6454() < 0) {
            ((AutoClickBean) obj).setResolutionWidth(i);
        }
    }

    /* JADX INFO: renamed from: ۡۨۧۦ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2621() {
        if (C0016.m717() < 0) {
            return ApkVerifier.Issue.V2_SIG_APK_DIGEST_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2622(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((JsonPrimitive) obj).isNumber();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m2623(int i, Object obj) {
        if (C0075.m6893() >= 0) {
            MainEntry.a(i, (Serializable) obj);
        }
    }

    /* JADX INFO: renamed from: ۢۢۨ۠, reason: not valid java name and contains not printable characters */
    public static N2 m2624() {
        if (C0027.m2460() >= 0) {
            return N2.j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2625(Object obj, Object obj2) {
        if (C0019.m1311() == 0) {
            return ((String) obj).contains((CharSequence) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦ۠۠, reason: not valid java name and contains not printable characters */
    public static Object m2626(Object obj) {
        if (C0038.m4010() > 0) {
            return ((A) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static List m2627(Object obj, Object obj2) {
        if (C0019.m1311() >= 0) {
            return ((SigningCertificateLineage) obj).sortSignerConfigs((List) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۢ, reason: not valid java name and contains not printable characters */
    public static float m2628(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((Number) obj).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۢۨۥ, reason: not valid java name and contains not printable characters */
    public static SourceStampVerifier.Result m2629(Object obj, Object obj2, Object obj3) {
        if (C0024.m2011() < 0) {
            return ((SourceStampVerifier) obj).c((DataSource) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m2630(Object obj) {
        if (C0018.m1064() > 0) {
            return ((C0461w) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۣۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2631(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((ApkVerifier.Result) obj).isVerifiedUsingV31Scheme();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۨۢ, reason: not valid java name and contains not printable characters */
    public static Level m2632() {
        if (C0018.m1064() > 0) {
            return Level.FINE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۨ, reason: not valid java name and contains not printable characters */
    public static String m2633() {
        if (C0021.m1598() < 0) {
            return "FoxCompany";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۤ, reason: not valid java name and contains not printable characters */
    public static void m2634(Object obj, Object obj2, long j) {
        if (C0066.m4827() > 0) {
            C0479z.a((C0479z) obj, (Context) obj2, j);
        }
    }

    /* JADX INFO: renamed from: ۣۧۥۦ, reason: not valid java name and contains not printable characters */
    public static KeyConfig m2635(Object obj) {
        if (C0037.m3837() < 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦۨ, reason: not valid java name and contains not printable characters */
    public static FileVisitResult m2636(Object obj, Object obj2) {
        if (C0070.m5903() >= 0) {
            return ((G3) obj).a((Path) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static long m2637(Object obj, int i) {
        if (C0036.m3653() < 0) {
            return Long.parseLong((String) obj, i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static CharsetDecoder m2638(Object obj, Object obj2) {
        if (C0073.m6356() < 0) {
            return ((CharsetDecoder) obj).onUnmappableCharacter((CodingErrorAction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m2639(Object obj) {
        if (C0064.m4578() >= 0) {
            ((AbstractViewOnClickListenerC0465w3) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۤۤۧ۟, reason: not valid java name and contains not printable characters */
    public static String m2640() {
        if (C0033.m3358() <= 0) {
            return "Alg.Alias.Cipher.AES_256/ECB/PKCS7Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static Matcher m2641(Object obj, Object obj2) {
        if (C0036.m3653() < 0) {
            return ((Pattern) obj).matcher((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۟۠, reason: not valid java name and contains not printable characters */
    public static void m2642(Object obj) {
        if (C0034.m3450() >= 0) {
            AbstractC0400l3.a((Closeable) obj);
        }
    }

    /* JADX INFO: renamed from: ۤۥۣ۟, reason: not valid java name and contains not printable characters */
    public static ValueAnimator m2643(Object obj) {
        if (C0031.m3075() > 0) {
            return ValueAnimator.ofInt((int[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۤۥ, reason: not valid java name and contains not printable characters */
    public static void m2644(Object obj, Object obj2, int i, int i2) throws IOException {
        if (C0066.m4827() >= 0) {
            ((FileOutputStream) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧ, reason: contains not printable characters */
    public static void m2645(Object obj) {
        if (C0064.m4578() >= 0) {
            ((JsonReader) obj).beginObject();
        }
    }

    /* JADX INFO: renamed from: ۥۢۢۢ, reason: contains not printable characters */
    public static String m2646(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((Uri) obj).getScheme();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۦ۠, reason: contains not printable characters */
    public static Type m2647(Object obj) {
        if (m2593() > 0) {
            return ((ParameterizedType) obj).getOwnerType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ۟, reason: contains not printable characters */
    public static EnumSet m2648(Object obj) {
        if (C0036.m3653() < 0) {
            return EnumSet.noneOf((Class) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۨۤ, reason: contains not printable characters */
    public static T m2649() {
        if (C0039.m4109() > 0) {
            return AbstractC0418o3.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۥۥ, reason: contains not printable characters */
    public static C0408n m2650(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((DialogC0448t4) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۥ۟, reason: contains not printable characters */
    public static String m2651(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((KeyStore) obj).getType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۡ۟, reason: contains not printable characters */
    public static void m2652(Object obj, int i) {
        if (C0066.m4827() > 0) {
            ((TextView) obj).setInputType(i);
        }
    }

    /* JADX INFO: renamed from: ۦۦۤ۟, reason: contains not printable characters */
    public static int m2653(Object obj, Object obj2) {
        if (C0033.m3358() <= 0) {
            return ((String) obj).indexOf((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۢۤ, reason: contains not printable characters */
    public static byte[] m2654(Object obj) {
        if (m2593() > 0) {
            return ApkSigningBlockUtils.pickBestDigestForV4((Map) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static Field[] m2655(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((Class) obj).getDeclaredFields();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static short m2656(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((ByteBuffer) obj).getShort();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۣۧۦ۟, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2657() {
        if (C0076.m6903() <= 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_POR_CERT_MISMATCH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m2658(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((G0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨۨ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m2659() {
        if (C0070.m5903() >= 0) {
            return TypeAdapters.STRING_BUILDER_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m2660(Object obj, int i) {
        if (C0034.m3450() >= 0) {
            ((View) obj).setBackgroundColor(i);
        }
    }

    /* JADX INFO: renamed from: ۨۡۦ۟, reason: not valid java name and contains not printable characters */
    public static void m2661(Object obj, char c) {
        if (C0035.m3569() <= 0) {
            Arrays.fill((char[]) obj, c);
        }
    }

    /* JADX INFO: renamed from: ۣۨۢ۠, reason: not valid java name and contains not printable characters */
    public static String m2662(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((RunnableC0346d1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m2663() {
        if (C0037.m3837() < 0) {
            return "NONEwithECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int m2664(Object obj) {
        if (C0064.m4578() > 0) {
            return ((R0) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m2665(Object obj) {
        if (C0035.m3569() < 0) {
            return ((O2) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static C0408n m2666() {
        if (C0070.m5903() > 0) {
            return C0408n.d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۨۦ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m2667(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((ApkSigner.SignerConfig.Builder) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۦ۠, reason: not valid java name and contains not printable characters */
    public static long m2668(Object obj) {
        if (C0077.m7272() < 0) {
            return ((C0361f2) obj).z;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۦۣۧ, reason: not valid java name and contains not printable characters */
    public static int m2669(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((NodeList) obj).getLength();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۦۦ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2670() {
        if (C0038.m4010() > 0) {
            return ApkVerifier.Issue.JAR_SIG_NO_MANIFEST;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۡۥ, reason: not valid java name and contains not printable characters */
    public static TextView m2671(Object obj) {
        if (C0016.m717() < 0) {
            return ((DialogC0389j4) obj).s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m2609(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
