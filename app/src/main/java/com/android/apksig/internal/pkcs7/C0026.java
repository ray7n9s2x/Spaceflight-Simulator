package com.android.apksig.internal.pkcs7;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.ApkUtilsLite;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ApkSigningBlockUtilsLite;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.V2SourceStampSigner;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.VerityTreeBuilder;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.DataSources;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickContentBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.LongSerializationPolicy;
import com.joke.plugin.gson.annotations.Until;
import com.joke.plugin.gson.internal.JsonReaderInternalAccess;
import com.joke.plugin.gson.internal.Streams;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.JsonTreeReader;
import com.joke.plugin.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.internal.reflect.ReflectionAccessor;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonToken;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.entry.SignatureCreatorAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0441s3;
import com.zfork.multiplatforms.android.bomb.B3;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0344d;
import com.zfork.multiplatforms.android.bomb.C0347d2;
import com.zfork.multiplatforms.android.bomb.C0348d3;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0394k3;
import com.zfork.multiplatforms.android.bomb.C0430q3;
import com.zfork.multiplatforms.android.bomb.C0450u0;
import com.zfork.multiplatforms.android.bomb.C0468x0;
import com.zfork.multiplatforms.android.bomb.C0483z3;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.E;
import com.zfork.multiplatforms.android.bomb.F2;
import com.zfork.multiplatforms.android.bomb.I;
import com.zfork.multiplatforms.android.bomb.InterfaceC0422p1;
import com.zfork.multiplatforms.android.bomb.J4;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.N1;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.P;
import com.zfork.multiplatforms.android.bomb.P2;
import com.zfork.multiplatforms.android.bomb.P4;
import com.zfork.multiplatforms.android.bomb.Q;
import com.zfork.multiplatforms.android.bomb.RunnableC0346d1;
import com.zfork.multiplatforms.android.bomb.RunnableC0353e1;
import com.zfork.multiplatforms.android.bomb.S1;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.V0;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0438s0;
import com.zfork.multiplatforms.android.bomb.W4;
import com.zfork.multiplatforms.android.bomb.Z0;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.x5;
import j$.util.OptionalInt;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.jar.Attributes;
import org.conscrypt.C0111;
import sun.security.util.ObjectIdentifier;

/* JADX INFO: renamed from: com.android.apksig.internal.pkcs7.۟ۧ۠ۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0026 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f109short = {2014, 624};

    /* JADX INFO: renamed from: ۟ۦۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int f110 = 68;

    /* JADX INFO: renamed from: ۟۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m2233(Object obj, Object obj2) {
        if (C0037.m3837() < 0) {
            ((JsonReaderInternalAccess) obj).promoteNameToValue((JsonReader) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static String m2234() {
        if (C0068.m5678() >= 0) {
            return "-----END";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static int m2235(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((RunnableC0353e1) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m2236() {
        if (C0064.m4578() >= 0) {
            return o5.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static int m2237(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((A) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥۨۨ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m2238(Object obj) {
        if (C0065.m4647() > 0) {
            return ((JsonElement) obj).getAsJsonPrimitive();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static Writer m2239(Object obj) {
        if (C0076.m6903() <= 0) {
            return Streams.writerForAppendable((Appendable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String m2240() {
        if (C0031.m3075() >= 0) {
            return "Certificate.reply.was.not.installed.in.keystore";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m2241() {
        if (C0034.m3450() >= 0) {
            return f109short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۠۟, reason: not valid java name and contains not printable characters */
    public static List m2242(Object obj) {
        if (C0032.m3184() <= 0) {
            return C0017.m878((DisplayCutout) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static MethodHandle m2243(Object obj, Object obj2) {
        if (C0024.m2011() <= 0) {
            return ((MethodHandles.Lookup) obj).unreflect((Method) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static int m2244(Object obj) {
        if (C0037.m3837() < 0) {
            return ((N1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۢۤ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m2245(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0070.m5903() >= 0) {
            return ((K0) obj).c((Context) obj2, (ImageView) obj3, (TextView) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۤ۠, reason: not valid java name and contains not printable characters */
    public static Context m2246(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((C0468x0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static void m2247(Object obj, Object obj2) {
        if (C0024.m2011() < 0) {
            ((WebSettings) obj).setPluginState((WebSettings.PluginState) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m2248(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((DefaultApkSignerEngine) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۟۠, reason: not valid java name and contains not printable characters */
    public static TypeToken m2249(Object obj) {
        if (C0029.m2791() >= 0) {
            return TypeToken.get((Class) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠۟, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m2250(Object obj, Object obj2) {
        if (C0076.m6903() < 0) {
            return ((ApkSigner.Builder) obj).setSourceStampSigningCertificateLineage((SigningCertificateLineage) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۡ, reason: not valid java name and contains not printable characters */
    public static Charset m2251() {
        if (C0037.m3837() <= 0) {
            return StandardCharsets.UTF_16BE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۢۦ, reason: not valid java name and contains not printable characters */
    public static void m2252(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4) {
        if (C0064.m4578() > 0) {
            ((AbstractC0441s3) obj).a((String) obj2, (String) obj3, i, i2, obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۤۥ, reason: not valid java name and contains not printable characters */
    public static int m2253(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((BerDataValue) obj).getTagNumber();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static int m2254(Object obj) {
        if (C0038.m4010() > 0) {
            return ((Q) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m2255(Object obj) {
        if (C0018.m1064() > 0) {
            return ((ViewOnClickListenerC0438s0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m2256() {
        if (C0019.m1311() == 0) {
            return "OpenSSLEvpCipherAES$AES$CTR";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static String m2257(String str) {
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
        String strM5807 = C0069.m5807(m2241(), 0, 1, 1983);
        while (C0078.m7380(strM5807) > 0) {
            strM5807 = C0031.m2993();
            if (C0078.m7380(strM5807) == 0) {
                strM5807 = C0074.m6452(m2241(), 1, 1, 529);
            }
        }
        int iM7380 = C0078.m7380(strM5807);
        int iM73802 = C0078.m7380(strM29932);
        for (int i3 = 0; i3 < iM7380; i3++) {
            bArrM7297[i3] = (byte) (bArrM7297[i3] ^ C0077.m7212(strM29932, i3 % iM73802));
        }
        for (int iM73803 = 0; iM73803 < bArrM7297.length; iM73803 = C0078.m7380(C0031.m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2258(Object obj) {
        if (C0017.m846() > 0) {
            return ((W4) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m2259(Object obj) {
        if (C0064.m4578() >= 0) {
            return ApkUtils.computeSha256DigestBytes((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static float m2260(Object obj) {
        if (C0071.m6069() > 0) {
            return ((S1) obj).c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠۟, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m2261(Object obj) {
        if (C0016.m717() <= 0) {
            return ((SharedPreferences) obj).edit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m2262(Object obj) {
        if (C0071.m6069() > 0) {
            return ((C0357e5) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static void m2263(Object obj) {
        if (C0033.m3358() < 0) {
            ((x5) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢۢۥ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m2264(Object obj, int i) {
        if (C0070.m5903() > 0) {
            return ApkSigningBlockUtilsLite.a((ByteBuffer) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static List m2265(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((AutoClickContentBean) obj).getPointerList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static int m2266(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((Q) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟۠, reason: not valid java name and contains not printable characters */
    public static void m2267(Object obj, Object obj2) {
        if (C0037.m3837() < 0) {
            ((P) obj).setEndPoint((Point) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2268(Object obj, int i) {
        if (C0021.m1598() < 0) {
            return ((Cursor) obj).isNull(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static ProgressBar m2269(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((C0348d3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m2270(Object obj, Object obj2, boolean z) {
        if (C0025.m2132() >= 0) {
            return ((ReflectiveTypeAdapterFactory) obj).excludeField((Field) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۥ, reason: not valid java name and contains not printable characters */
    public static LongSerializationPolicy m2271() {
        if (C0074.m6454() <= 0) {
            return LongSerializationPolicy.DEFAULT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦ۠, reason: not valid java name and contains not printable characters */
    public static E m2272(Object obj) {
        if (C0111.m13165() < 0) {
            return ((C0430q3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m2273(Object obj) {
        if (C0018.m1064() > 0) {
            return ((AutoClickPointerBean) obj).getType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m2274(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo.ContentDigest) obj).getSignatureAlgorithmId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۨ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m2275(Object obj, Object obj2) {
        if (C0077.m7272() <= 0) {
            return ((SigningCertificateLineage) obj).getSubLineage((X509Certificate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۦ, reason: not valid java name and contains not printable characters */
    public static String m2276(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((ApkSigner.SignerConfig) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۥۣ, reason: not valid java name and contains not printable characters */
    public static String m2277() {
        if (C0072.m6216() > 0) {
            return "OpenSSLEvpCipherAES$AES_256$ECB$PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨ۟, reason: not valid java name and contains not printable characters */
    public static PrintStream m2278(Object obj, Object obj2, Object obj3) {
        if (C0069.m5781() <= 0) {
            return ((PrintStream) obj).printf((String) obj2, (Object[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۦ۠, reason: not valid java name and contains not printable characters */
    public static Set m2279(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((Attributes) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۥ, reason: not valid java name and contains not printable characters */
    public static OptionalInt m2280(Object obj) {
        if (C0067.m5468() < 0) {
            return ((V3SchemeSigner) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2281(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۢ, reason: not valid java name and contains not printable characters */
    public static V2SourceStampSigner.Builder m2282(Object obj, boolean z) {
        if (m2298() <= 0) {
            return ((V2SourceStampSigner.Builder) obj).setSourceStampTimestampEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m2283(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((ZipUtils.DeflateResult) obj).output;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۤ, reason: not valid java name and contains not printable characters */
    public static JsonToken m2284() {
        if (C0037.m3837() < 0) {
            return JsonToken.STRING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m2285(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((F2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۨۧ, reason: not valid java name and contains not printable characters */
    public static void m2286(Object obj, Object obj2, Object obj3) {
        if (C0033.m3358() < 0) {
            ((LocalFileRecord) obj).outputUncompressedData((DataSource) obj2, (DataSink) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2287(Object obj) {
        if (C0076.m6903() < 0) {
            return ((AbstractC0384j) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۢۤۡ, reason: not valid java name and contains not printable characters */
    public static List m2288(Object obj) {
        if (C0024.m2011() < 0) {
            return AbstractC0406m3.m((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۨۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2289() {
        if (C0077.m7272() < 0) {
            return ApkVerifier.Issue.V4_SIG_VERSION_NOT_CURRENT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦۧ, reason: not valid java name and contains not printable characters */
    public static KeyStore m2290(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((O2) obj).P;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m2291(Object obj) {
        if (C0018.m1064() > 0) {
            return ((ManifestParser) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟۟, reason: not valid java name and contains not printable characters */
    public static LinearLayout m2292(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((C0361f2) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m2293(Object obj, Object obj2, Object obj3) {
        if (C0063.m4427() >= 0) {
            return ((V3SchemeSigner) obj).a((ApkSigningBlockUtils.SignerConfig) obj2, (Map) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧ۟, reason: not valid java name and contains not printable characters */
    public static Class m2294(Object obj) {
        if (C0074.m6454() <= 0) {
            return Asn1BerParser.access$000((Field) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m2295(Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            ((Drawable) obj).setBounds((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m2296(Object obj) {
        if (m2298() <= 0) {
            return ((W4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static Object m2297(Object obj) {
        if (C0030.m2940() > 0) {
            return ((C0450u0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m2298() {
        return (-1755331) ^ C0032.m3236((Object) "ۨ۠۠");
    }

    /* JADX INFO: renamed from: ۠۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static RandomAccessFile m2299(Object obj) {
        if (C0078.m7450() > 0) {
            return ((A5) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m2300() {
        if (C0037.m3837() <= 0) {
            return ApkSigningBlockUtils.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2301(Object obj) {
        if (C0065.m4647() > 0) {
            return ((C0394k3) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static String m2302(Object obj) {
        if (m2298() < 0) {
            return ((B3) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m2303(Object obj, int i) {
        if (C0071.m6069() >= 0) {
            ((Paint) obj).setColor(i);
        }
    }

    /* JADX INFO: renamed from: ۣۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m2304(Object obj) {
        if (C0037.m3837() < 0) {
            return ((K0) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static JsonWriter m2305(Object obj) {
        if (C0066.m4827() > 0) {
            return ((JsonWriter) obj).beginObject();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m2306(Object obj) {
        if (C0034.m3450() > 0) {
            return ((V4Signature.SigningInfo) obj).certificate;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static Set m2307(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((V3SchemeVerifier.Builder) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡ۟, reason: not valid java name and contains not printable characters */
    public static String m2308() {
        if (C0027.m2460() >= 0) {
            return "Certificate.reply.was.installed.in.keystore";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۢ, reason: not valid java name and contains not printable characters */
    public static int m2309(Object obj) {
        if (m2298() < 0) {
            return ((V3SchemeVerifier.Builder) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m2310(Object obj, Object obj2) {
        if (C0064.m4578() > 0) {
            return ((Context) obj).getSystemService((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۠۠, reason: not valid java name and contains not printable characters */
    public static CentralDirectoryRecord m2311(Object obj, long j) {
        if (C0067.m5468() < 0) {
            return ((CentralDirectoryRecord) obj).createWithModifiedLocalFileHeaderOffset(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Object m2312(Object obj, Object obj2) {
        if (C0021.m1598() < 0) {
            return Asn1BerParser.e((BerDataValue) obj, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static byte[] m2313(Object obj) {
        if (C0027.m2460() >= 0) {
            return ApkSigningBlockUtilsLite.readLengthPrefixedByteArray((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۨۢ, reason: not valid java name and contains not printable characters */
    public static KeyEvent.Callback m2314(Object obj) {
        if (m2298() <= 0) {
            return ((C0347d2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2315(Object obj, Object obj2) {
        if (C0070.m5903() >= 0) {
            return ((Locale) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static short m2316(Object obj) {
        if (C0077.m7272() < 0) {
            return ((CentralDirectoryRecord) obj).getGpFlags();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static DataSource m2317(Object obj, long j, long j2) {
        if (C0027.m2460() > 0) {
            return DataSources.asDataSource((FileChannel) obj, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۥۡ, reason: not valid java name and contains not printable characters */
    public static T1 m2318(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((I) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۢۡ, reason: not valid java name and contains not printable characters */
    public static int m2319(Object obj) {
        if (C0070.m5903() > 0) {
            return ((T1) obj).s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m2320(Object obj) {
        if (C0067.m5468() < 0) {
            return ((ApkVerifier.Result.V4SchemeSignerInfo) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۤۥ, reason: not valid java name and contains not printable characters */
    public static void m2322(Object obj) {
        if (C0019.m1311() == 0) {
            ((JsonReader) obj).endObject();
        }
    }

    /* JADX INFO: renamed from: ۢۥۦ۟, reason: not valid java name and contains not printable characters */
    public static String m2323() {
        if (C0064.m4578() >= 0) {
            return "Alg.Alias.Signature.SHA256/ECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۟۟, reason: not valid java name and contains not printable characters */
    public static long m2324(Object obj) {
        if (C0074.m6454() < 0) {
            return ((ApkUtilsLite.ApkSigningBlock) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۨۤۦ, reason: not valid java name and contains not printable characters */
    public static void m2325(Object obj, Object obj2) {
        if (C0028.m2593() >= 0) {
            ((ReflectionAccessor) obj).makeAccessible((AccessibleObject) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static String m2326() {
        if (C0072.m6216() > 0) {
            return "Keystore.type.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static void m2327(Object obj) {
        if (C0066.m4827() >= 0) {
            ((Path) obj).reset();
        }
    }

    /* JADX INFO: renamed from: ۣۡۢ, reason: not valid java name and contains not printable characters */
    public static Short m2328(short s) {
        if (C0073.m6356() <= 0) {
            return Short.valueOf(s);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Object m2329(Object obj, Object obj2) {
        if (C0075.m6893() > 0) {
            return C0064.m4607(obj, (Field) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static CheckBox m2330(Object obj) {
        if (C0038.m4010() > 0) {
            return ((C0351e) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static ConsumerAbility m2331(Object obj) {
        if (C0070.m5903() > 0) {
            return ((RunnableC0346d1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۥ, reason: not valid java name and contains not printable characters */
    public static short m2332(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((CentralDirectoryRecord) obj).c;
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۣۤۧۥ, reason: not valid java name and contains not printable characters */
    public static List m2333(Object obj) {
        if (C0073.m6356() < 0) {
            return ((Attribute) obj).attrValues;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static JsonReaderInternalAccess m2334() {
        if (C0018.m1064() >= 0) {
            return JsonReaderInternalAccess.INSTANCE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۥۦ, reason: not valid java name and contains not printable characters */
    public static void m2335(Object obj) {
        if (C0064.m4578() > 0) {
            ((JsonTreeReader) obj).promoteNameToValue();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢ, reason: contains not printable characters */
    public static MessageDigest m2336(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((VerityTreeBuilder) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧۡ, reason: contains not printable characters */
    public static boolean m2337(Object obj, Object obj2, long j) {
        if (C0035.m3569() <= 0) {
            return ((Handler) obj).postDelayed((Runnable) obj2, j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ۨۡ, reason: contains not printable characters */
    public static P4 m2338(Object obj) {
        if (C0032.m3184() <= 0) {
            return o5.c((D5) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۡۥ, reason: contains not printable characters */
    public static String m2339(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((J4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۠, reason: contains not printable characters */
    public static boolean m2340(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((L) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۤ, reason: contains not printable characters */
    public static boolean m2341(Object obj) {
        if (C0111.m13165() < 0) {
            return ((C0361f2) obj).w;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥ۟ۧ, reason: contains not printable characters */
    public static Object m2342(Object obj, Object obj2, Object obj3) {
        if (C0071.m6069() > 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۡۧ, reason: contains not printable characters */
    public static InterfaceC0422p1 m2343(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0077.m7272() < 0) {
            return ((Z0) obj).b((P2) obj2, (char[]) obj3, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۡۢ, reason: contains not printable characters */
    public static double m2344(Object obj) {
        return C0032.m3184() < 0 ? ((Until) obj).value() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۥۣۨ۠, reason: contains not printable characters */
    public static void m2345(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0078.m7450() >= 0) {
            K3.r((StringBuilder) obj, (String) obj2, (String) obj3, (C0483z3) obj4, (String) obj5);
        }
    }

    /* JADX INFO: renamed from: ۦ۠ۢ۟, reason: contains not printable characters */
    public static boolean m2346(Object obj, Object obj2) {
        if (C0070.m5903() >= 0) {
            return ((Set) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۢ۠ۢ, reason: contains not printable characters */
    public static View m2347(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((C0) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۠ۥ, reason: contains not printable characters */
    public static List m2348(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((ApkVerifier.Result) obj).getErrors();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣۦ, reason: contains not printable characters */
    public static boolean m2349(Object obj) {
        if (C0069.m5781() < 0) {
            return ((ApkSigner) obj).o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۧۥۥ, reason: contains not printable characters */
    public static void m2350(Object obj, Object obj2, Object obj3) {
        if (C0069.m5781() <= 0) {
            C0038.m3981((java.nio.file.Path) obj, (java.nio.file.Path) obj2, (CopyOption[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static JsonWriter m2351(Object obj, Object obj2) {
        if (C0021.m1598() < 0) {
            return ((Gson) obj).newJsonWriter((Writer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2352(Object obj, Object obj2, Object obj3) {
        if (C0025.m2132() > 0) {
            return O2.b((X509Certificate) obj, (Vector) obj2, (Hashtable) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m2353(Object obj, Object obj2, Object obj3) {
        if (C0035.m3569() <= 0) {
            return ((Gson) obj).fromJson((JsonReader) obj2, (Type) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۢۨ, reason: not valid java name and contains not printable characters */
    public static int m2354(Object obj, int i) {
        if (C0028.m2593() > 0) {
            return ((IntBuffer) obj).get(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۡ, reason: not valid java name and contains not printable characters */
    public static String m2355(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((ObjectIdentifier) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۢۤ, reason: not valid java name and contains not printable characters */
    public static C0344d m2356(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((SignatureCreatorAbility) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m2357(Object obj) {
        if (C0031.m3075() > 0) {
            return ((ValueAnimator) obj).getAnimatedValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۥۣ, reason: not valid java name and contains not printable characters */
    public static ApkSignerEngine.InputJarEntryInstructions.OutputPolicy m2358() {
        if (C0034.m3450() >= 0) {
            return ApkSignerEngine.InputJarEntryInstructions.OutputPolicy.OUTPUT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۤۡ, reason: not valid java name and contains not printable characters */
    public static void m2359(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5) {
        if (C0033.m3358() <= 0) {
            ((O2) obj).k((String) obj2, (String) obj3, (String) obj4, i, (String) obj5);
        }
    }

    /* JADX INFO: renamed from: ۨۤۦۣ, reason: not valid java name and contains not printable characters */
    public static void m2360(Object obj, Object obj2) {
        if (C0075.m6893() > 0) {
            ((V0) obj).d(obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۥۢۦ, reason: not valid java name and contains not printable characters */
    public static void m2361(Object obj) {
        if (C0077.m7272() < 0) {
            ((AutoCloseable) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۨۦۣۦ, reason: not valid java name and contains not printable characters */
    public static String m2362() {
        if (C0073.m6356() <= 0) {
            return "OpenSSLSignature$SHA512RSAPSS";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۤ۟, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m2363(Object obj, Object obj2) {
        if (C0077.m7272() > 0) {
            return null;
        }
        return ((V3SchemeVerifier) obj).k = (ByteBuffer) obj2;
    }

    /* JADX INFO: renamed from: ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static TextView m2364(Object obj) {
        if (C0111.m13165() < 0) {
            return ((C0348d3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۟, reason: not valid java name and contains not printable characters */
    public static void m2365(Object obj) {
        if (C0028.m2593() > 0) {
            ((Thread) obj).interrupt();
        }
    }

    /* JADX INFO: renamed from: ۨۧۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2366(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((CentralDirectoryRecord) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m2367(Object obj) {
        if (C0024.m2011() < 0) {
            return ((ApkUtilsLite.ApkSigningBlock) obj).getStartOffset();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m2321(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
