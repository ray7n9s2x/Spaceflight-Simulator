package org.conscrypt;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Path;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.JcaSignerEngine;
import com.android.apksig.KeyConfig;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSigResult;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ApkSigningBlockUtilsLite;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.SourceStampCertificateLineage;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.asn1.ber.BerEncoding;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.DelegatingX509Certificate;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.kms.KmsType;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.basetoollib.GsonUtils;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonArray;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.annotations.SerializedName;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.JsonTreeReader;
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
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptTouchBean;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.B3;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0323a;
import com.zfork.multiplatforms.android.bomb.C0337c;
import com.zfork.multiplatforms.android.bomb.C0344d;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0358f;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0363f4;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0398l1;
import com.zfork.multiplatforms.android.bomb.C0424p3;
import com.zfork.multiplatforms.android.bomb.C0433r1;
import com.zfork.multiplatforms.android.bomb.C0439s1;
import com.zfork.multiplatforms.android.bomb.C0483z3;
import com.zfork.multiplatforms.android.bomb.C1;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.DialogC0448t4;
import com.zfork.multiplatforms.android.bomb.DialogC0472x4;
import com.zfork.multiplatforms.android.bomb.F3;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.InterfaceC0477y3;
import com.zfork.multiplatforms.android.bomb.O0;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q0;
import com.zfork.multiplatforms.android.bomb.Q2;
import com.zfork.multiplatforms.android.bomb.Q4;
import com.zfork.multiplatforms.android.bomb.R0;
import com.zfork.multiplatforms.android.bomb.T0;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.U1;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.V0;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0436r4;
import com.zfork.multiplatforms.android.bomb.Y3;
import com.zfork.multiplatforms.android.bomb.n5;
import com.zfork.multiplatforms.android.bomb.q5;
import com.zfork.multiplatforms.android.bomb.w5;
import com.zfork.multiplatforms.android.bomb.y5;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: org.conscrypt.۟ۧۦ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0111 {

    /* JADX INFO: renamed from: ۟ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static int f574 = 61;

    /* JADX INFO: renamed from: ۟۟۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static KeyConfig m13026(Object obj) {
        if (C0029.m2791() >= 0) {
            return C0073.m6322((DefaultApkSignerEngine.SignerConfig.Builder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static X509Certificate m13027(Object obj) {
        if (C0066.m4827() > 0) {
            return ((SigningCertificateLineage.SignerConfig.Builder) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static void m13028(Object obj, Object obj2, int i, int i2) throws IOException {
        if (C0021.m1598() < 0) {
            ((RandomAccessFile) obj).readFully((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static String m13029() {
        if (C0036.m3653() < 0) {
            return "Alg.Alias.Mac.PBEWITHHMACSHA512";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static LinkOption m13030() {
        if (C0037.m3837() <= 0) {
            return LinkOption.NOFOLLOW_LINKS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۤۡ, reason: not valid java name and contains not printable characters */
    public static Handler m13031(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((G0) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static String m13032() {
        if (C0021.m1598() <= 0) {
            return "Alg.Alias.Cipher.RSA/None/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m13033(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((Provider) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m13034(Object obj) {
        if (C0030.m2940() > 0) {
            return ((JsonPrimitive) obj).getAsBoolean();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static JsonToken m13035() {
        if (C0074.m6454() <= 0) {
            return JsonToken.BEGIN_OBJECT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m13036(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((Inflater) obj).needsInput();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m13037(Object obj) {
        if (C0072.m6216() > 0) {
            return ((ApkVerifier.Result) obj).isVerifiedUsingV1Scheme();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static U3 m13038(Object obj) {
        if (C0074.m6454() < 0) {
            return ((C0361f2) obj).t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۢۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m13039(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((SigningCertificateLineage) obj).encodeSigningCertificateLineage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m13040(Object obj) {
        if (C0075.m6893() > 0) {
            return ((C0358f) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.SignerConfig.Builder m13041(Object obj, Object obj2, int i) {
        if (C0024.m2011() < 0) {
            return ((ApkSigner.SignerConfig.Builder) obj).setLineageForMinSdkVersion((SigningCertificateLineage) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m13042(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((G0) obj).g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۣ, reason: not valid java name and contains not printable characters */
    public static JsonToken m13043(Object obj) {
        if (C0073.m6356() < 0) {
            return ((JsonTreeReader) obj).peek();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۤۡ, reason: not valid java name and contains not printable characters */
    public static int m13044(Object obj) {
        if (C0071.m6069() > 0) {
            return ((ApkSigner.SignerConfig.Builder) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۣ, reason: not valid java name and contains not printable characters */
    public static int m13045(byte b) {
        if (C0039.m4109() >= 0) {
            return BerEncoding.getTagClass(b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۦ, reason: not valid java name and contains not printable characters */
    public static long m13046(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((LocalFileRecord) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۨ, reason: not valid java name and contains not printable characters */
    public static float m13047(Object obj) {
        if (C0071.m6069() > 0) {
            return ((View) obj).getX();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static int m13048(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((C0337c) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥۤ, reason: not valid java name and contains not printable characters */
    public static int m13049(Object obj, Object obj2, int i, int i2) {
        if (C0024.m2011() < 0) {
            return ((Q0) obj).d((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m13050(Object obj, int i) {
        if (C0016.m717() < 0) {
            ((RelativeLayout.LayoutParams) obj).addRule(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m13051(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((ConsumerAbility) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢ۟, reason: not valid java name and contains not printable characters */
    public static String m13052() {
        if (C0065.m4647() >= 0) {
            return "Alg.Alias.Signature.OID.1.2.840.10045.4.3.2";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۤۨ, reason: not valid java name and contains not printable characters */
    public static String m13053(Object obj) {
        if (C0066.m4827() > 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۨ, reason: not valid java name and contains not printable characters */
    public static KeyConfig m13054(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((ApkSigner.SignerConfig) obj).getKeyConfig();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤ۟, reason: not valid java name and contains not printable characters */
    public static List m13055(Object obj) {
        if (C0018.m1064() > 0) {
            return ((ApkSignerInfo) obj).getWarnings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤۤ, reason: not valid java name and contains not printable characters */
    public static InputStream m13056(Object obj) {
        if (C0069.m5781() < 0) {
            return ((URL) obj).openStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۦۡ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m13057(Object obj, Object obj2, int i, int i2) {
        if (C0074.m6454() <= 0) {
            return ((ByteBuffer) obj).get((byte[]) obj2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m13058(Object obj, Object obj2) {
        if (C0066.m4827() >= 0) {
            return ((Vector) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static Class m13059() {
        if (C0077.m7272() <= 0) {
            return Character.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m13060(Object obj) {
        if (C0017.m846() > 0) {
            return ((LocalFileRecord) obj).isDataCompressed();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۣۣ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m13061(Object obj) {
        if (C0036.m3653() < 0) {
            return ApkVerifier.h((ApkSigningBlockUtils.Result) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static Annotation m13062(Object obj, Object obj2) {
        if (C0067.m5468() < 0) {
            return ((Class) obj).getDeclaredAnnotation((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static KeyFactory m13063(Object obj) {
        if (C0077.m7272() < 0) {
            return KeyFactory.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Intent m13064(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((Activity) obj).getIntent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static int m13065(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((C0) obj).y;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m13066(Object obj) {
        if (C0030.m2940() > 0) {
            return ((Message) obj).obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧۢ, reason: not valid java name and contains not printable characters */
    public static Class m13067(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((Field) obj).getType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static List m13068(Object obj) {
        if (C0019.m1311() == 0) {
            return ((ApkVerifier.Result.V2SchemeSignerInfo) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۧ, reason: not valid java name and contains not printable characters */
    public static int m13069(Object obj) {
        if (C0016.m717() < 0) {
            return ((O0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m13070(Object obj, Object obj2) {
        if (C0017.m846() > 0) {
            ((InterfaceC0477y3) obj).a(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ۠, reason: not valid java name and contains not printable characters */
    public static JsonWriter m13071(Object obj) {
        if (C0020.m1385() < 0) {
            return ((JsonWriter) obj).endArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m13072(Object obj, Object obj2) {
        if (C0016.m717() <= 0) {
            return ((HashMap) obj).containsKey(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m13073(Object obj) {
        if (C0037.m3837() <= 0) {
            return w5.a((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m13074(Object obj) {
        if (C0031.m3075() > 0) {
            return ((Paint.FontMetricsInt) obj).descent;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۢ, reason: not valid java name and contains not printable characters */
    public static List m13075(Object obj) {
        if (C0024.m2011() < 0) {
            return ((ApkSigResult) obj).mSigners;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m13076(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((DialogC0421p0) obj).n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m13077() {
        if (m13165() <= 0) {
            return "<startdate>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۤۤ, reason: not valid java name and contains not printable characters */
    public static int m13078(Object obj, Object obj2) {
        if (C0025.m2132() >= 0) {
            return Log.e((String) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟۠, reason: not valid java name and contains not printable characters */
    public static V0 m13079(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((T0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۧۢ, reason: not valid java name and contains not printable characters */
    public static TimeUnit m13080() {
        if (C0067.m5468() <= 0) {
            return TimeUnit.MILLISECONDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static List m13081(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).getCertificates();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۡۤ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m13082(Object obj, Object obj2, Object obj3) {
        if (C0023.m1921() > 0) {
            return ((SigningCertificateLineage) obj).c((SigningCertificateLineage.SignerConfig) obj2, (SigningCertificateLineage.SignerCapabilities) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۤ۟, reason: not valid java name and contains not printable characters */
    public static KmsType m13083(Object obj) {
        if (C0016.m717() < 0) {
            return ((KeyConfig.Kms) obj).kmsType;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m13084(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((q5) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦ, reason: not valid java name and contains not printable characters */
    public static void m13085(Object obj) {
        if (C0025.m2132() >= 0) {
            C0022.m1699((Path) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۧۦ, reason: not valid java name and contains not printable characters */
    public static List m13086(Object obj) {
        if (C0064.m4578() >= 0) {
            return Collections.singletonList(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m13087(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((DefaultApkSignerEngine.Builder) obj).g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۡ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m13088(Object obj, Object obj2) {
        if (C0019.m1311() == 0) {
            return ((ApkSigner.Builder) obj).setSourceStampSignerConfig((ApkSigner.SignerConfig) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۥ, reason: not valid java name and contains not printable characters */
    public static int m13089(Object obj) {
        if (C0018.m1064() > 0) {
            return ((ContentDigestAlgorithm) obj).getId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m13090(Object obj, Object obj2) {
        if (C0032.m3184() < 0) {
            return ((Stream) obj).collect((Collector) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۧ, reason: not valid java name and contains not printable characters */
    public static void m13091(Object obj, Object obj2, Object obj3) {
        if (C0037.m3837() < 0) {
            ((C0483z3) obj).b((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m13092(Object obj) {
        if (C0033.m3358() < 0) {
            return V1SchemeVerifier.Result.access$000((V1SchemeVerifier.Result) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۧ, reason: not valid java name and contains not printable characters */
    public static ContentDigestAlgorithm[] m13093() {
        if (C0024.m2011() < 0) {
            return ApkSigningBlockUtils.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۤۦ, reason: not valid java name and contains not printable characters */
    public static FrameLayout m13094(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((T1) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m13095(Object obj, Object obj2) {
        if (C0064.m4578() >= 0) {
            return ((List) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۦۨ, reason: not valid java name and contains not printable characters */
    public static TextView m13096(Object obj) {
        if (C0016.m717() <= 0) {
            return ((DialogC0472x4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۦ, reason: not valid java name and contains not printable characters */
    public static String m13098() {
        if (C0023.m1921() >= 0) {
            return "ۣۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢۦ, reason: not valid java name and contains not printable characters */
    public static List m13099(Object obj) {
        if (C0072.m6216() > 0) {
            return SourceStampCertificateLineage.readSigningCertificateLineage((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m13100(Object obj, Object obj2, Object obj3) {
        if (C0025.m2132() > 0) {
            return GsonUtils.fromJson((Gson) obj, (String) obj2, (Type) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m13101(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((C0433r1) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static CheckBox m13102(Object obj) {
        if (C0074.m6454() < 0) {
            return ((C0351e) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static Path.Direction m13103() {
        if (C0031.m3075() >= 0) {
            return Path.Direction.CCW;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠۟, reason: not valid java name and contains not printable characters */
    public static void m13104(Object obj, int i, long j) {
        if (C0024.m2011() < 0) {
            ZipUtils.setUnsignedInt32((ByteBuffer) obj, i, j);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۦ, reason: not valid java name and contains not printable characters */
    public static Collection m13105(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((Map) obj).values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨ۟, reason: not valid java name and contains not printable characters */
    public static long m13106(Object obj) {
        if (C0073.m6356() <= 0) {
            return ZipUtils.getZipEocdCentralDirectoryOffset((ByteBuffer) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static LinkOption m13107() {
        if (C0019.m1311() >= 0) {
            return m13030();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static String m13108(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((O2) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static String m13109() {
        if (C0037.m3837() < 0) {
            return "Alg.Alias.Cipher.PBEWithHmacSHA1AndAES_128";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m13110(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((JsonReader) obj).isLenient();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static JsonToken m13111() {
        if (C0035.m3569() <= 0) {
            return JsonToken.END_ARRAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m13112(Object obj, int i) {
        if (C0016.m717() < 0) {
            ((R0) obj).write(i);
        }
    }

    /* JADX INFO: renamed from: ۠ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static long m13113(Object obj) {
        if (C0026.m2298() < 0) {
            return ((C1) obj).f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static String m13114(Object obj) {
        if (C0068.m5678() > 0) {
            return O2.v((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۧۧ, reason: not valid java name and contains not printable characters */
    public static Uri m13115(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((Intent) obj).getData();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static String m13116() {
        if (C0025.m2132() >= 0) {
            return "OpenSSLKeyHolder";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static C0387j2 m13117(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((Y3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int m13118(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((AndroidBinXmlParser) obj).h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦۨۦ, reason: not valid java name and contains not printable characters */
    public static void m13119(Object obj) {
        if (C0019.m1311() <= 0) {
            ((RandomAccessFile) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۠ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Double m13120(double d) {
        if (C0065.m4647() > 0) {
            return Double.valueOf(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m13121() {
        if (C0067.m5468() < 0) {
            return "Certificate.reply.and.certificate.in.keystore.are.identical";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m13122(byte b) {
        if (C0078.m7450() > 0) {
            return BerEncoding.isConstructed(b);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static int m13123(Object obj) {
        if (C0037.m3837() < 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۡۦ, reason: not valid java name and contains not printable characters */
    public static PrivateKey m13124(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((JcaSignerEngine) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m13125(Object obj) {
        if (C0064.m4578() > 0) {
            return ((ApkSigner) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۢۨ, reason: not valid java name and contains not printable characters */
    public static BigDecimal m13126(Object obj, Object obj2) {
        if (C0027.m2460() >= 0) {
            return ((BigDecimal) obj).remainder((BigDecimal) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m13127(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((Buffer) obj).hasRemaining();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m13128(Object obj) {
        if (C0068.m5678() > 0) {
            return ((C0398l1) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۧ۠, reason: not valid java name and contains not printable characters */
    public static int m13129(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((C0424p3) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m13130(Object obj) {
        if (C0038.m4010() >= 0) {
            ((DefaultApkSignerEngine) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m13131(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((Pair) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۢ, reason: not valid java name and contains not printable characters */
    public static String m13132() {
        if (C0072.m6216() > 0) {
            return "Alias.alias.does.not.exist";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static List m13133(Object obj) {
        if (C0070.m5903() > 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).getErrors();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۢ, reason: not valid java name and contains not printable characters */
    public static CheckBox m13134(Object obj) {
        if (C0072.m6216() > 0) {
            return ((C0351e) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۦ۟, reason: not valid java name and contains not printable characters */
    public static EditText m13135(Object obj) {
        if (C0027.m2460() > 0) {
            return ((DialogC0389j4) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static C0344d m13136(Object obj) {
        if (C0023.m1921() > 0) {
            return C0344d.a((LayoutInflater) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String[] m13137(Object obj) {
        if (C0034.m3450() > 0) {
            return ((B3) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۤۢ, reason: not valid java name and contains not printable characters */
    public static ImageView m13138(Object obj) {
        if (C0021.m1598() < 0) {
            return ((C4) obj).w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m13139(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((V1SchemeSigner.SignerConfig) obj).name;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۤ۟, reason: not valid java name and contains not printable characters */
    public static ImageView m13140(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((DialogC0373h0) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۡ, reason: not valid java name and contains not printable characters */
    public static String m13141(String str) {
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
        while (length > 0) {
            bArrM7297[-1] = (byte) (bArrM7297[-1] ^ C0077.m7212(strM29932, (-1) % iM7380));
        }
        for (int iM73802 = 0; iM73802 < bArrM7297.length; iM73802 = C0078.m7380(C0031.m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۢۨۤۦ, reason: not valid java name and contains not printable characters */
    public static CodingErrorAction m13142() {
        if (C0024.m2011() <= 0) {
            return CodingErrorAction.REPLACE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static JsonArray m13143(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((JsonArray) obj).deepCopy();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static TextView m13144(Object obj) {
        if (C0036.m3653() < 0) {
            return ((U1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m13145(Object obj, int i) {
        if (C0067.m5468() < 0) {
            ((y5) obj).write(i);
        }
    }

    /* JADX INFO: renamed from: ۣۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m13146() {
        if (C0076.m6903() < 0) {
            return "RSA/ECB/OAEPPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦۦ, reason: not valid java name and contains not printable characters */
    public static List m13147(Object obj) {
        if (m13165() < 0) {
            return ((SigningCertificateLineage) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static int m13148(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((C0) obj).B;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m13149(Object obj, Object obj2) {
        if (C0027.m2460() >= 0) {
            return O2.H((String) obj, (String[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static String[] m13150(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((SerializedName) obj).alternate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m13151(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((ApkSigner) obj).p;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤۤ۟, reason: not valid java name and contains not printable characters */
    public static int m13152(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((n5) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۤۥۧ, reason: not valid java name and contains not printable characters */
    public static KeyConfig m13153(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((ApkSigner.SignerConfig) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۢۡ, reason: not valid java name and contains not printable characters */
    public static void m13154(Object obj, Object obj2) {
        if (C0077.m7272() <= 0) {
            ((Q2) obj).b((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۧۡ۠, reason: not valid java name and contains not printable characters */
    public static void m13155(Object obj) throws IOException {
        if (C0028.m2593() > 0) {
            ((ZipFile) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۤۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m13156(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((MotionEvent) obj).getMetaState();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۡۨۥ, reason: contains not printable characters */
    public static Object m13157(Object obj) {
        if (C0032.m3184() < 0) {
            return ((Pair) obj).getFirst();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢۡ, reason: contains not printable characters */
    public static float m13158(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((ScriptTouchBean) obj).rawY;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۤۨۨ, reason: contains not printable characters */
    public static void m13159(Object obj, Object obj2) {
        if (C0028.m2593() >= 0) {
            ((AutoClickPlanBean) obj).removePointer((T1) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۨ۠ۥ, reason: contains not printable characters */
    public static boolean m13160(Object obj) {
        if (C0021.m1598() < 0) {
            return ((Class) obj).isArray();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۢ, reason: contains not printable characters */
    public static Set m13161(Object obj) {
        if (C0039.m4109() > 0) {
            return ((DefaultApkSignerEngine) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۦۢ, reason: contains not printable characters */
    public static double m13162(double d, double d2) {
        return C0020.m1385() < 0 ? Math.atan2(d, d2) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۦۡ۟۟, reason: contains not printable characters */
    public static String m13163() {
        if (C0023.m1921() > 0) {
            return "file";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟, reason: contains not printable characters */
    public static List m13164(Object obj) {
        if (C0030.m2940() > 0) {
            return ((ApkVerifier.Result) obj).getV3SchemeSigners();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۥ, reason: contains not printable characters */
    public static int m13165() {
        return (-1750764) ^ C0032.m3236((Object) "ۣۤۥ");
    }

    /* JADX INFO: renamed from: ۦۤ۟۠, reason: contains not printable characters */
    public static void m13166(Object obj, Object obj2, int i, int i2) {
        if (C0071.m6069() > 0) {
            ((Q4) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۦۥ۟۠, reason: contains not printable characters */
    public static LinearLayout m13167(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((C0363f4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۢ, reason: contains not printable characters */
    public static ByteBuffer m13168(Object obj) {
        if (C0032.m3184() <= 0) {
            return ApkSigningBlockUtilsLite.getLengthPrefixedSlice((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۤۥ, reason: contains not printable characters */
    public static X509Certificate m13169(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).getCertificate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۤۨ, reason: contains not printable characters */
    public static DialogC0448t4 m13170(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((ViewOnClickListenerC0436r4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۥۡ, reason: contains not printable characters */
    public static byte[] m13171(Object obj) {
        if (C0024.m2011() < 0) {
            return ((C0323a) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۡۢ, reason: contains not printable characters */
    public static MatchType m13172() {
        if (C0071.m6069() >= 0) {
            return MatchType.CLICK;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۧۢ, reason: contains not printable characters */
    public static ContentDigestAlgorithm m13173() {
        if (C0063.m4427() >= 0) {
            return ContentDigestAlgorithm.SHA256;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m13174(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((DefaultApkSignerEngine) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m13175(Object obj) {
        if (C0066.m4827() > 0) {
            return ((DefaultApkSignerEngine) obj).E;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۤۦ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m13176(Object obj) {
        if (C0073.m6356() < 0) {
            return ((C0433r1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m13177(Object obj, Object obj2) {
        if (C0069.m5781() < 0) {
            return F3.d((char[]) obj, (Charset) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static LinkOption[] m13178(Object obj) {
        if (C0020.m1385() < 0) {
            return ((C0439s1) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Byte m13179(byte b) {
        if (C0027.m2460() > 0) {
            return Byte.valueOf(b);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static PublicKey m13180(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((DelegatingX509Certificate) obj).getPublicKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m13181(Object obj, Object obj2) {
        if (C0016.m717() < 0) {
            return ((DefaultApkSignerEngine) obj).g((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m13182(Object obj) {
        if (C0031.m3075() >= 0) {
            return AndroidBinXmlParser.access$100((ByteBuffer) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m13183(Object obj, Object obj2, Object obj3) {
        if (C0024.m2011() < 0) {
            return ((O2) obj).D((InputStream) obj2, (String) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۦۢ, reason: not valid java name and contains not printable characters */
    public static String m13184(long j) {
        if (C0016.m717() <= 0) {
            return C0361f2.o(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۦۣ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m13185(Object obj, Object obj2, boolean z) {
        if (C0028.m2593() >= 0) {
            return ((SharedPreferences.Editor) obj).putBoolean((String) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۤۤ, reason: not valid java name and contains not printable characters */
    public static void m13186(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            ((V4Signature) obj).writeTo((OutputStream) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static Object m13187(Object obj) {
        if (C0021.m1598() < 0) {
            return ((MessageDigest) obj).clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۨ۟, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m13188() {
        if (C0016.m717() < 0) {
            return TypeAdapters.BIT_SET_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۤ, reason: not valid java name and contains not printable characters */
    public static String m13097(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
