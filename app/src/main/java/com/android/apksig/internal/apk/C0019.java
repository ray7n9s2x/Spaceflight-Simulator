package com.android.apksig.internal.apk;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.ApkUtilsLite;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.V2SourceStampSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1Field;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.asn1.ber.ByteBufferBerDataValueReader;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.MessageDigestSink;
import com.android.apksig.internal.util.VerityTreeBuilder;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.basetoollib.GsonUtils;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.FieldNamingPolicy;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonSerializationContext;
import com.joke.plugin.gson.JsonSerializer;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.Excluder;
import com.joke.plugin.gson.internal.LinkedTreeMap;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptActionBean;
import com.joke.script.bean.ScriptTouchBean;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.AbstractC0400l3;
import com.zfork.multiplatforms.android.bomb.B1;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0344d;
import com.zfork.multiplatforms.android.bomb.C0347d2;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0358f;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0370g4;
import com.zfork.multiplatforms.android.bomb.C0381i2;
import com.zfork.multiplatforms.android.bomb.C0407m4;
import com.zfork.multiplatforms.android.bomb.C0458v2;
import com.zfork.multiplatforms.android.bomb.C0474y0;
import com.zfork.multiplatforms.android.bomb.C1;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.DialogC0331b0;
import com.zfork.multiplatforms.android.bomb.DialogC0359f0;
import com.zfork.multiplatforms.android.bomb.DialogC0419o4;
import com.zfork.multiplatforms.android.bomb.F1;
import com.zfork.multiplatforms.android.bomb.I0;
import com.zfork.multiplatforms.android.bomb.I2;
import com.zfork.multiplatforms.android.bomb.J1;
import com.zfork.multiplatforms.android.bomb.J2;
import com.zfork.multiplatforms.android.bomb.L2;
import com.zfork.multiplatforms.android.bomb.L4;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q0;
import com.zfork.multiplatforms.android.bomb.Q3;
import com.zfork.multiplatforms.android.bomb.RunnableC0367g1;
import com.zfork.multiplatforms.android.bomb.S1;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.W2;
import com.zfork.multiplatforms.android.bomb.X1;
import com.zfork.multiplatforms.android.bomb.Y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.math.BigInteger;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.security.AccessController;
import java.security.MessageDigest;
import java.security.PrivilegedAction;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Mac;
import javax.xml.parsers.DocumentBuilderFactory;
import org.conscrypt.C0111;
import sun.security.util.PathList;
import sun.security.x509.KeyIdentifier;

/* JADX INFO: renamed from: com.android.apksig.internal.apk.ۢ۟ۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0019 {

    /* JADX INFO: renamed from: ۥۣ, reason: contains not printable characters */
    public static boolean f79;

    /* JADX INFO: renamed from: ۟۟۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m1175() {
        if (C0025.m2132() >= 0) {
            return "OpenSSLMac$HmacSHA256";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static C0361f2 m1176(Object obj) {
        if (C0026.m2298() < 0) {
            return ((C0) obj).getScriptView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m1177(Object obj) {
        if (C0066.m4827() > 0) {
            return ((AndroidBinXmlParser) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۤۨ, reason: not valid java name and contains not printable characters */
    public static List m1178(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((V3SchemeSigner.Builder) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦۦ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m1179() {
        if (C0076.m6903() <= 0) {
            return Asn1Type.INTEGER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m1180(Object obj, Object obj2) {
        if (C0020.m1385() < 0) {
            ((TextView) obj).setText((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠۠, reason: not valid java name and contains not printable characters */
    public static String m1181(Object obj) {
        if (C0035.m3569() <= 0) {
            return O2.t((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static String m1182(Object obj) {
        if (C0031.m3075() > 0) {
            return DocumentsContract.getDocumentId((Uri) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۤ, reason: not valid java name and contains not printable characters */
    public static void m1183(Object obj, int i) {
        if (C0018.m1064() > 0) {
            ZipUtils.putUnsignedInt16((ByteBuffer) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static Set m1184() {
        if (C0016.m717() < 0) {
            return Collections.emptySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static int m1185() {
        if (C0030.m2940() > 0) {
            return ViewConfiguration.getTapTimeout();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static String m1186(Object obj) {
        if (C0070.m5903() > 0) {
            return ((ContentDigestAlgorithm) obj).getJcaMessageDigestAlgorithm();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۡۦ, reason: not valid java name and contains not printable characters */
    public static float m1187(int i, float f, Object obj) {
        if (C0067.m5468() < 0) {
            return TypedValue.applyDimension(i, f, (DisplayMetrics) obj);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۠ۦۥۡ, reason: not valid java name and contains not printable characters */
    public static SignatureInfo m1188(Object obj, Object obj2, int i, Object obj3) {
        if (C0064.m4578() >= 0) {
            return ApkSigningBlockUtils.findSignature((DataSource) obj, (ApkUtils.ZipSections) obj2, i, (ApkSigningBlockUtils.Result) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static Button m1190(Object obj) {
        if (C0066.m4827() > 0) {
            return ((C0351e) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static void m1191(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            ((ThreadLocal) obj).set(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static int m1192(Object obj) {
        if (C0018.m1064() > 0) {
            return ((Q3) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static void m1193(Object obj, Object obj2) {
        if (C0064.m4578() > 0) {
            ((C0381i2) obj).setBgDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1194(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((Q0) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠۠, reason: not valid java name and contains not printable characters */
    public static void m1195(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z, int i2) {
        if (C0069.m5781() <= 0) {
            ((C0) obj).j((View) obj2, (View) obj3, (View) obj4, (Context) obj5, i, z, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m1196(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((T1) obj).q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static BigInteger m1197(Object obj) {
        if (C0027.m2460() >= 0) {
            return C0063.m4320((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.SignerConfig m1198(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((DefaultApkSignerEngine.Builder) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟۠, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m1199(Object obj, int i, int i2) {
        if (C0020.m1385() <= 0) {
            return AndroidBinXmlParser.b((ByteBuffer) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static Object m1200(Object obj) {
        if (C0063.m4427() > 0) {
            return AccessController.doPrivileged((PrivilegedAction) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static String m1201() {
        if (C0038.m4010() >= 0) {
            return "OpenSSLAeadCipherAES$GCM_SIV$AES_256";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨۦ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.Builder m1202(Object obj, Object obj2) {
        if (C0017.m846() > 0) {
            return ((DefaultApkSignerEngine.Builder) obj).setCreatedBy((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m1203(Object obj, Object obj2) {
        if (C0039.m4109() >= 0) {
            V4Signature.readFully((InputStream) obj, (byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static DocumentBuilderFactory m1204() {
        if (C0038.m4010() >= 0) {
            return DocumentBuilderFactory.newInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static int m1205(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((C0474y0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static String m1206() {
        if (C0070.m5903() > 0) {
            return "Alg.Alias.Signature.SHA256withRSAandMGF1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static float m1207(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((B1) obj).g;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static void m1208(Object obj, boolean z) {
        if (C0018.m1064() >= 0) {
            ((AutoClickPlanBean) obj).setChecked(z);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m1209(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((Asn1Field) obj).index();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static long m1210(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((ScriptActionBean) obj).duration;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static View m1211(Object obj) {
        if (C0021.m1598() < 0) {
            return ((DialogC0331b0) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1212(Object obj) {
        if (C0026.m2298() < 0) {
            return ((T2) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۣ, reason: not valid java name and contains not printable characters */
    public static String m1213() {
        if (C0065.m4647() >= 0) {
            return "SSL";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m1214(Object obj, Object obj2) {
        if (C0072.m6216() >= 0) {
            return ((Mac) obj).doFinal((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m1215() {
        if (C0068.m5678() > 0) {
            return TypeAdapters.BYTE_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m1216() {
        if (C0038.m4010() > 0) {
            return "Certificate.was.added.to.keystore";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m1217(Object obj) {
        if (C0017.m846() >= 0) {
            return ((ApkSigningBlockUtils.Result) obj).signingCertificateLineage;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static void m1218(Object obj, int i) {
        if (C0064.m4578() >= 0) {
            ((ByteBufferBerDataValueReader) obj).a(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡۦ, reason: not valid java name and contains not printable characters */
    public static String m1219() {
        if (C0028.m2593() > 0) {
            return "Unknown.Entry.Type";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static Object m1220(Object obj, Object obj2) {
        if (C0071.m6069() > 0) {
            return ((Constructor) obj).newInstance((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m1221(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0018.m1064() >= 0) {
            return ((SigningCertificateLineage) obj).spawnDescendant((SigningCertificateLineage.SignerConfig) obj2, (SigningCertificateLineage.SignerConfig) obj3, (SigningCertificateLineage.SignerCapabilities) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۢۤ, reason: not valid java name and contains not printable characters */
    public static View m1222(Object obj, int i, Object obj2) {
        if (C0027.m2460() >= 0) {
            return ((DialogC0359f0) obj).a(i, (Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m1223(long j) {
        if (C0074.m6454() <= 0) {
            return Long.toString(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۨ۠, reason: not valid java name and contains not printable characters */
    public static BerDataValue m1224(Object obj) {
        if (C0078.m7450() > 0) {
            return ((ByteBufferBerDataValueReader) obj).readDataValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۤۢ, reason: not valid java name and contains not printable characters */
    public static Object m1225(Object obj, Object obj2, Object obj3) {
        if (C0075.m6893() > 0) {
            return GsonUtils.fromJson((Gson) obj, (String) obj2, (Class) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1226(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((File) obj).mkdirs();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1227(Object obj) {
        if (C0073.m6356() < 0) {
            return ((V1SchemeVerifier.Result) obj).verified;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static V1SchemeVerifier.Result m1228(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        if (C0034.m3450() >= 0) {
            return V1SchemeVerifier.verify((DataSource) obj, (ApkUtils.ZipSections) obj2, (Map) obj3, (Set) obj4, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥ۠, reason: not valid java name and contains not printable characters */
    public static String m1229() {
        if (C0072.m6216() > 0) {
            return "Alg.Alias.Signature.ECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static WindowManager.LayoutParams m1230(Object obj) {
        if (C0026.m2298() < 0) {
            return T1.e((Activity) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۢ, reason: not valid java name and contains not printable characters */
    public static void m1231(Object obj, int i) {
        if (C0034.m3450() >= 0) {
            ((AutoClickPointerBean) obj).setType(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۨ, reason: not valid java name and contains not printable characters */
    public static void m1232(Object obj, int i, int i2) {
        if (C0038.m4010() >= 0) {
            ((RelativeLayout.LayoutParams) obj).addRule(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۤۡ, reason: not valid java name and contains not printable characters */
    public static void m1233(Object obj, Object obj2, Object obj3, Object obj4) throws IOException, ApkFormatException {
        if (C0034.m3450() > 0) {
            ((ApkSigner) obj).c((DataSource) obj2, (DataSink) obj3, (DataSource) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۥۦ, reason: not valid java name and contains not printable characters */
    public static Pair m1234(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((T2) obj).f();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1235(Object obj, Object obj2) {
        if (C0018.m1064() > 0) {
            return ((SigningCertificateLineage.SignerCapabilities) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤ۠, reason: not valid java name and contains not printable characters */
    public static void m1236(Object obj, int i) {
        if (C0076.m6903() < 0) {
            C0037.m3804((SeekBar) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۨ, reason: not valid java name and contains not printable characters */
    public static int m1237(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((AndroidBinXmlParser) obj).getDepth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤۡ۠, reason: not valid java name and contains not printable characters */
    public static List m1238(Object obj) {
        if (C0021.m1598() < 0) {
            return ((ManifestParser.Section) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1239() {
        if (C0111.m13165() <= 0) {
            return ApkVerifier.Issue.JAR_SIG_MAX_SIGNATURES_EXCEEDED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static TextView m1240(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((C0344d) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧۧ, reason: not valid java name and contains not printable characters */
    public static int m1241(Object obj, Object obj2, int i) {
        if (C0071.m6069() >= 0) {
            return ((Context) obj).checkCallingOrSelfUriPermission((Uri) obj2, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1242(Object obj, Object obj2) {
        if (C0037.m3837() < 0) {
            return ((String) obj).startsWith((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1243(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((V2SourceStampSigner.Builder) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1244() {
        if (C0016.m717() <= 0) {
            return AbstractC0400l3.c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۢۦۤ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m1245() {
        if (C0075.m6893() > 0) {
            return TypeAdapters.ATOMIC_BOOLEAN_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m1246(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((RunnableC0367g1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m1247(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((KeyIdentifier) obj).getIdentifier();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static Object m1248(Object obj, Object obj2) {
        if (C0016.m717() < 0) {
            return ((LinkedTreeMap) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static LinearLayout m1249(Object obj) {
        if (C0023.m1921() > 0) {
            return ((C0) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۢۡ, reason: not valid java name and contains not printable characters */
    public static URL[] m1250(Object obj) {
        if (C0016.m717() < 0) {
            return PathList.pathToURLs((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۢۨ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1251() {
        if (C0070.m5903() >= 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_INVALID_TIMESTAMP;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۤ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m1252() {
        if (C0039.m4109() >= 0) {
            return Asn1Type.SEQUENCE_OF;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static int m1253() {
        if (C0032.m3184() <= 0) {
            return F1.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥۨۤ, reason: not valid java name and contains not printable characters */
    public static DataSource m1254(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((ApkUtilsLite.ApkSigningBlock) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۨ۟, reason: not valid java name and contains not printable characters */
    public static String m1255() {
        if (C0029.m2791() >= 0) {
            return "Alg.Alias.Cipher.PBEWithHmacSHA256AndAES_256";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧ۟, reason: not valid java name and contains not printable characters */
    public static String m1256(double d) {
        if (C0028.m2593() >= 0) {
            return Double.toString(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧۤ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.VerityTreeAndDigest m1257(Object obj) {
        if (C0028.m2593() > 0) {
            return ApkSigningBlockUtils.computeChunkVerityTreeAndDigest((DataSource) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟۟, reason: not valid java name and contains not printable characters */
    public static int m1258(Object obj) {
        if (C0075.m6893() > 0) {
            return ((C1) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1259(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((SigningCertificateLineage.SignerCapabilities) obj).hasInstalledData();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۤۡۧ, reason: not valid java name and contains not printable characters */
    public static int m1260(Object obj) {
        if (C0063.m4427() > 0) {
            return ((C0347d2) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۧۤ, reason: not valid java name and contains not printable characters */
    public static double m1261(Object obj) {
        return C0076.m6903() < 0 ? ((Number) obj).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۢۥۨۥ, reason: not valid java name and contains not printable characters */
    public static O1 m1262(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((J1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1263(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((O2) obj).K;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۧۨ, reason: not valid java name and contains not printable characters */
    public static C0358f m1264(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((W2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠, reason: not valid java name and contains not printable characters */
    public static String m1265(Object obj) {
        if (C0017.m846() >= 0) {
            return ((O2) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۢ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.SignerConfig m1266(Object obj) {
        if (C0032.m3184() < 0) {
            return C0037.m3903((V2SourceStampSigner.Builder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥ۠, reason: not valid java name and contains not printable characters */
    public static MessageDigest[] m1267(Object obj) {
        if (C0066.m4827() > 0) {
            return ((MessageDigestSink) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1268() {
        if (C0037.m3837() < 0) {
            return ApkVerifier.Issue.V31_BLOCK_MISSING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۡ۟, reason: not valid java name and contains not printable characters */
    public static V4Signature.SigningInfo m1269(Object obj) {
        if (C0032.m3184() < 0) {
            return V4Signature.SigningInfo.fromByteBuffer((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۥۧ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.SignerConfig.Builder m1270(Object obj, Object obj2, int i) {
        if (C0067.m5468() < 0) {
            return ((DefaultApkSignerEngine.SignerConfig.Builder) obj).setLineageForMinSdkVersion((SigningCertificateLineage) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۨۧ, reason: not valid java name and contains not printable characters */
    public static GenericDeclaration m1271(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((TypeVariable) obj).getGenericDeclaration();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۤ, reason: not valid java name and contains not printable characters */
    public static DisplayCutout m1272(Object obj) {
        if (C0039.m4109() > 0) {
            return ((WindowInsets) obj).getDisplayCutout();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤ۟, reason: not valid java name and contains not printable characters */
    public static float m1273(Object obj) {
        if (C0065.m4647() > 0) {
            return ((S1) obj).b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m1274(Object obj) {
        if (C0066.m4827() > 0) {
            return ((ApkSignerEngine.OutputApkSigningBlockRequest2) obj).getPaddingSizeBeforeApkSigningBlock();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static int m1275(Object obj) {
        if (C0017.m846() > 0) {
            return V1SchemeVerifier.getMinSdkVersionFromWhichSupportedInManifestOrSignatureFile((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static void m1276(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0063.m4427() >= 0) {
            ((O2) obj).e((String) obj2, (String) obj3, (PrintStream) obj4);
        }
    }

    /* JADX INFO: renamed from: ۤۡۨ۠, reason: not valid java name and contains not printable characters */
    public static CharsetDecoder m1277(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((Charset) obj).newDecoder();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۧ۟, reason: not valid java name and contains not printable characters */
    public static Class m1278() {
        if (C0030.m2940() >= 0) {
            return Double.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m1279(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((V4Signature.SigningInfoBlock) obj).toByteArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۦ۟, reason: not valid java name and contains not printable characters */
    public static int m1280(Object obj) {
        if (C0065.m4647() > 0) {
            return ((I0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥۧۢ, reason: not valid java name and contains not printable characters */
    public static TextView m1281(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((C0351e) obj).x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1282() {
        if (C0025.m2132() >= 0) {
            return ApkVerifier.Issue.V31_ROTATION_MIN_SDK_MISMATCH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m1283(Object obj, int i) {
        if (C0078.m7450() >= 0) {
            return ((Cursor) obj).getLong(i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۨ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m1284(Object obj) {
        if (C0025.m2132() > 0) {
            return ((Y) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡۦ, reason: contains not printable characters */
    public static void m1285(Object obj) {
        if (C0072.m6216() > 0) {
            ((ApkSignerEngine.OutputApkSigningBlockRequest2) obj).done();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟ۢ, reason: contains not printable characters */
    public static String m1286(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((MotionEvent) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۠ۡ, reason: contains not printable characters */
    public static ApkUtils.ApkSigningBlock m1287(Object obj, Object obj2) {
        if (C0070.m5903() > 0) {
            return ApkUtils.findApkSigningBlock((DataSource) obj, (ApkUtils.ZipSections) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦ۠۟, reason: contains not printable characters */
    public static JsonElement m1288(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0033.m3358() < 0) {
            return ((JsonSerializer) obj).serialize(obj2, (Type) obj3, (JsonSerializationContext) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۡۡ, reason: contains not printable characters */
    public static ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus m1289() {
        if (C0018.m1064() > 0) {
            return ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus.STAMP_VERIFIED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۦۢ, reason: contains not printable characters */
    public static C0370g4 m1290(Object obj) {
        if (C0067.m5468() < 0) {
            return ((C4) obj).y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۦۥ, reason: contains not printable characters */
    public static List m1291(Object obj) {
        if (C0023.m1921() > 0) {
            return ((C0458v2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۧۤ, reason: contains not printable characters */
    public static boolean m1292(Object obj, Object obj2, boolean z) {
        if (C0030.m2940() > 0) {
            return ((Excluder) obj).excludeField((Field) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨۡ۠, reason: contains not printable characters */
    public static Object m1293(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((Map.Entry) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۡۨ, reason: contains not printable characters */
    public static ScriptTouchBean m1294(Object obj) {
        if (C0017.m846() >= 0) {
            return ((X1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۤۨ, reason: contains not printable characters */
    public static Class m1295(Object obj) {
        if (C0073.m6356() < 0) {
            return ((Class) obj).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۧۧ, reason: contains not printable characters */
    public static TextView m1296(Object obj) {
        if (m1311() == 0) {
            return ((C4) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۦ۠, reason: contains not printable characters */
    public static J2 m1297() {
        if (C0075.m6893() >= 0) {
            return I2.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۡۦ, reason: contains not printable characters */
    public static int m1298(Object obj) {
        if (C0032.m3184() < 0) {
            return ApkUtils.getVersionCodeFromBinaryAndroidManifest((ByteBuffer) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡۤ, reason: contains not printable characters */
    public static int m1299(Object obj) {
        if (C0032.m3184() <= 0) {
            return AndroidBinXmlParser.access$600((ByteBuffer) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡۨۤ, reason: contains not printable characters */
    public static String m1300(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((Integer) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۠ۡ, reason: contains not printable characters */
    public static boolean m1301(Object obj, Object obj2) {
        if (C0078.m7450() > 0) {
            return ((TypeToken) obj).isAssignableFrom((Type) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۡۡ, reason: contains not printable characters */
    public static ListView m1302(Object obj) {
        if (C0032.m3184() < 0) {
            return ((DialogC0419o4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۦۥ, reason: contains not printable characters */
    public static int m1303(Object obj) {
        if (C0038.m4010() > 0) {
            return ((SigningCertificateLineage.SignerCapabilities.Builder) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۡۤ, reason: contains not printable characters */
    public static ApkVerifier.Issue m1304() {
        if (C0068.m5678() > 0) {
            return ApkVerifier.Issue.V4_SIG_V2_V3_SIGNERS_MISMATCH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۤ۟, reason: contains not printable characters */
    public static String m1305() {
        if (C0073.m6356() < 0) {
            return "AES/CTR/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠۠, reason: not valid java name and contains not printable characters */
    public static void m1306(Object obj, Object obj2, Object obj3) {
        if (C0111.m13165() <= 0) {
            ((L2) obj).checkServerTrusted((X509Certificate[]) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static ImageView m1307(Object obj) {
        if (C0069.m5781() < 0) {
            return ((C0407m4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۨ, reason: not valid java name and contains not printable characters */
    public static String m1308() {
        if (C0076.m6903() <= 0) {
            return "AES_128/CBC/PKCS5PADDING";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۦ, reason: not valid java name and contains not printable characters */
    public static String m1309(String str) {
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

    /* JADX INFO: renamed from: ۧۥ, reason: not valid java name and contains not printable characters */
    public static ListView m1310(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((C4) obj).x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static int m1311() {
        return 1752734 ^ C0032.m3236((Object) "ۥۨۡ");
    }

    /* JADX INFO: renamed from: ۣۨ۠۠, reason: not valid java name and contains not printable characters */
    public static V3SchemeVerifier.Builder m1312(Object obj, int i) {
        if (C0023.m1921() > 0) {
            return ((V3SchemeVerifier.Builder) obj).setRotationMinSdkVersion(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m1313(Object obj) {
        if (C0077.m7272() < 0) {
            return ((L4) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۢۤ۟, reason: not valid java name and contains not printable characters */
    public static void m1314(Object obj, Object obj2) {
        if (C0111.m13165() < 0) {
            ((ListView) obj).setAdapter((ListAdapter) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m1315(Object obj) {
        if (C0073.m6356() < 0) {
            return ((ApkSigner.Builder) obj).p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۤ۟, reason: not valid java name and contains not printable characters */
    public static void m1316(Object obj) throws IOException {
        if (C0033.m3358() <= 0) {
            ((ByteArrayInputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۨۤۧۨ, reason: not valid java name and contains not printable characters */
    public static Annotation[] m1317(Object obj) {
        if (C0068.m5678() > 0) {
            return ((AccessibleObject) obj).getAnnotations();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۦۦ, reason: not valid java name and contains not printable characters */
    public static FieldNamingPolicy m1318() {
        if (C0027.m2460() >= 0) {
            return FieldNamingPolicy.IDENTITY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۨ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m1319(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0077.m7272() < 0) {
            return ((VerityTreeBuilder) obj).generateVerityTreeRootHash((DataSource) obj2, (DataSource) obj3, (DataSource) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1320(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((ApkVerifier.Result.V1SchemeSignerInfo) obj).containsErrors();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m1189(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
