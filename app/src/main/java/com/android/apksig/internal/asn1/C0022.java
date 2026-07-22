package com.android.apksig.internal.asn1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SigningCertificateLineage;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.AlgorithmIdentifier;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.pkcs7.SignedData;
import com.android.apksig.internal.pkcs7.SignerInfo;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.VerityTreeBuilder;
import com.android.apksig.internal.util.X509CertificateUtils;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickContentBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.ExclusionStrategy;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonNull;
import com.joke.plugin.gson.JsonParser;
import com.joke.plugin.gson.annotations.JsonAdapter;
import com.joke.plugin.gson.internal.ObjectConstructor;
import com.joke.plugin.gson.internal.PreJava9DateFormatProvider;
import com.joke.plugin.gson.internal.Primitives;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonToken;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptRecordType;
import com.zfork.entry.C0075;
import com.zfork.entry.MetaSelectAppAbility;
import com.zfork.entry.SupplierComponentFactory;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0440s2;
import com.zfork.multiplatforms.android.bomb.AbstractC0452u2;
import com.zfork.multiplatforms.android.bomb.B4;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0323a;
import com.zfork.multiplatforms.android.bomb.C0330b;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0426q;
import com.zfork.multiplatforms.android.bomb.C0443t;
import com.zfork.multiplatforms.android.bomb.C0473y;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C1;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0472x4;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.J2;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.N3;
import com.zfork.multiplatforms.android.bomb.O0;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.P0;
import com.zfork.multiplatforms.android.bomb.Q;
import com.zfork.multiplatforms.android.bomb.R0;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0349d4;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0454u4;
import com.zfork.multiplatforms.android.bomb.W2;
import com.zfork.multiplatforms.android.bomb.Y4;
import com.zfork.multiplatforms.android.bomb.Z4;
import com.zfork.multiplatforms.android.bomb.h5;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.q5;
import com.zfork.multiplatforms.android.bomb.s5;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermission;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAKey;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.Phaser;
import java.util.jar.Attributes;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.android.apksig.internal.asn1.۟ۤۢ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0022 {

    /* JADX INFO: renamed from: ۠ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean f96;

    /* JADX INFO: renamed from: ۟۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1653(Object obj, Object obj2) {
        if (C0067.m5468() <= 0) {
            return ((SigningCertificateLineage) obj).isCertificateInLineage((X509Certificate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static C1 m1654(Object obj) {
        if (C0038.m4010() > 0) {
            return ((D5) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static File m1655(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((SourceStampVerifier) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static JsonElement m1656(Object obj) {
        if (C0027.m2460() >= 0) {
            return JsonParser.parseReader((Reader) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m1657() {
        if (C0063.m4427() >= 0) {
            return "Generating.keysize.bit.keyAlgName.key.pair.and.self.signed.certificate.sigAlgName.with.a.validity.of.validality.days.for";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static void m1658(Object obj) {
        if (C0066.m4827() > 0) {
            ((T1) obj).j();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static C0479z m1659(Object obj) {
        if (C0023.m1921() > 0) {
            return ((C0) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1660(Object obj) {
        if (C0064.m4578() > 0) {
            return ((C0357e5) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static void m1661(Object obj, Object obj2) {
        if (C0064.m4578() > 0) {
            ((TextView) obj).setTypeface((Typeface) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۦ۠, reason: not valid java name and contains not printable characters */
    public static AlertDialog m1662(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((AlertDialog.Builder) obj).show();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m1663(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((C0426q) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1664(Object obj) {
        if (C0030.m2940() >= 0) {
            return Primitives.isPrimitive((Type) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۡۨۡ, reason: not valid java name and contains not printable characters */
    public static long m1665(int i, Object obj, int i2) {
        if (C0024.m2011() < 0) {
            return h5.c(i, (byte[]) obj, i2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Activity m1666(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((O0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۠۟, reason: not valid java name and contains not printable characters */
    public static byte[] m1667() {
        if (C0063.m4427() > 0) {
            return ManifestParser.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۦۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m1668(Object obj) {
        if (C0036.m3653() < 0) {
            return ((R0) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static JsonNull m1669(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((JsonNull) obj).deepCopy();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static C0479z m1670(Object obj, Object obj2) {
        if (C0063.m4427() > 0) {
            return ((C0479z) obj).c((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥ۠, reason: not valid java name and contains not printable characters */
    public static BigInteger m1671(Object obj) {
        if (C0025.m2132() > 0) {
            return ((RSAKey) obj).getModulus();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m1672() {
        if (C0069.m5781() <= 0) {
            return "Alg.Alias.Signature.2.16.840.1.101.3.4.2.1with1.2.840.10045.2.1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1673(Object obj) {
        if (C0017.m846() > 0) {
            return ((Attributes) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1674() {
        if (C0036.m3653() < 0) {
            return "Alg.Alias.Cipher.PBEWithHmacSHA1AndAES_256";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m1675() {
        if (C0019.m1311() == 0) {
            return "Alg.Alias.Cipher.AES/ECB/PKCS7Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static String m1676(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((DialogC0385j0) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۦۤ, reason: not valid java name and contains not printable characters */
    public static void m1677(Object obj, Object obj2) {
        if (C0065.m4647() > 0) {
            ((O2) obj).g((PrintStream) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۣ۟, reason: not valid java name and contains not printable characters */
    public static int m1678(Object obj, Object obj2) {
        if (C0023.m1921() >= 0) {
            return Arrays.binarySearch((Object[]) obj, obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۦ, reason: not valid java name and contains not printable characters */
    public static void m1679(Object obj) {
        if (C0111.m13165() <= 0) {
            HttpsURLConnection.setDefaultSSLSocketFactory((SSLSocketFactory) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۢ, reason: not valid java name and contains not printable characters */
    public static void m1680(Object obj) {
        if (C0077.m7272() <= 0) {
            C0443t.b((C0443t) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۧۤ, reason: not valid java name and contains not printable characters */
    public static void m1681(Object obj, Object obj2, long j) {
        if (C0067.m5468() < 0) {
            ((C0387j2) obj).v((OutputStream) obj2, j);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static PosixFilePermission m1682() {
        if (C0027.m2460() >= 0) {
            return C0071.m5980();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦۤ, reason: not valid java name and contains not printable characters */
    public static void m1683(Object obj, Object obj2) {
        if (C0069.m5781() < 0) {
            ((U3) obj).setScriptType((ScriptRecordType) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static Charset m1684() {
        if (C0072.m6216() >= 0) {
            return Charset.defaultCharset();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1685(Object obj) {
        if (C0021.m1598() < 0) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static C0 m1686() {
        if (C0036.m3653() < 0) {
            return C0.J;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static DateFormat m1687(int i) {
        if (C0039.m4109() > 0) {
            return PreJava9DateFormatProvider.getUSDateFormat(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤ۠, reason: not valid java name and contains not printable characters */
    public static int m1688(Object obj) {
        if (C0016.m717() < 0) {
            return ((ViewOnClickListenerC0454u4) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤۧ, reason: not valid java name and contains not printable characters */
    public static String m1689(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((AutoClickPointerBean) obj).getPointerName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۤ, reason: not valid java name and contains not printable characters */
    public static String m1690(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((DialogC0373h0) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static void m1691(Object obj, int i) {
        if (C0025.m2132() >= 0) {
            ((AutoClickContentBean) obj).setLoopNum(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static PrintStream m1692() {
        if (C0016.m717() < 0) {
            return System.err;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۤ, reason: not valid java name and contains not printable characters */
    public static List m1693(Object obj) {
        if (C0018.m1064() > 0) {
            return ((ApkSigner.SignerConfig) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۥۨ, reason: not valid java name and contains not printable characters */
    public static String m1694(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((ManifestParser.Attribute) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m1695(Object obj) {
        if (C0077.m7272() <= 0) {
            return C0063.m4358(obj, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۡ, reason: not valid java name and contains not printable characters */
    public static String m1696() {
        if (C0067.m5468() < 0) {
            return "Alg.Alias.Cipher.PBEWithHmacSHA384AndAES_256";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۨ, reason: not valid java name and contains not printable characters */
    public static C4 m1697(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((B4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1698(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((ApkSignerInfo) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static void m1699(Object obj) {
        if (C0075.m6893() >= 0) {
            Files.delete((Path) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m1700(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((Phaser) obj).register();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠۠, reason: not valid java name and contains not printable characters */
    public static float m1701(Object obj) {
        if (C0068.m5678() > 0) {
            return ((MotionEvent) obj).getRawX();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧۨ, reason: not valid java name and contains not printable characters */
    public static AlgorithmIdentifier m1702(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((SignerInfo) obj).signatureAlgorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۥ, reason: not valid java name and contains not printable characters */
    public static Object m1703(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((ObjectConstructor) obj).construct();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ۟, reason: not valid java name and contains not printable characters */
    public static Rect m1704(Object obj) {
        if (C0030.m2940() > 0) {
            return ((Y4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۦۤ, reason: not valid java name and contains not printable characters */
    public static char[] m1705() {
        if (C0073.m6356() < 0) {
            return AbstractC0440s2.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1706(Object obj, Object obj2) {
        if (C0070.m5903() >= 0) {
            return ((ExclusionStrategy) obj).shouldSkipClass((Class) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧۦ, reason: not valid java name and contains not printable characters */
    public static void m1707(Object obj, int i) {
        if (C0066.m4827() >= 0) {
            ((TextView) obj).setHeight(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۦ, reason: not valid java name and contains not printable characters */
    public static String m1708(Object obj) {
        if (C0078.m7450() >= 0) {
            return V1SchemeSigner.b((DigestAlgorithm) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡ۠, reason: not valid java name and contains not printable characters */
    public static C0330b m1709(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((C0323a) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۡۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m1710() {
        if (C0063.m4427() > 0) {
            return X509CertificateUtils.END_CERT_FOOTER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۨۦ, reason: not valid java name and contains not printable characters */
    public static int m1711() {
        return (-1752726) ^ C0032.m3236((Object) "ۥۨۨ");
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1712(Object obj) {
        if (C0071.m6069() > 0) {
            return ((ApkVerifier.Result) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static SortedMap m1713(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((V1SchemeSigner.OutputManifestFile) obj).individualSectionsContents;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m1714(Object obj) {
        if (C0077.m7272() < 0) {
            return ((AbstractC0384j) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1715(Object obj) {
        if (C0039.m4109() > 0) {
            return ((SigningCertificateLineage.SignerCapabilities) obj).hasAuth();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static List m1716(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            return V1SchemeVerifier.parseZipCentralDirectory((DataSource) obj, (ApkUtils.ZipSections) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static WebSettings m1717(Object obj) {
        if (C0111.m13165() < 0) {
            return ((WebView) obj).getSettings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۥ, reason: not valid java name and contains not printable characters */
    public static String m1718() {
        if (C0035.m3569() < 0) {
            return "Cannot.find.environment.variable.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1719(Object obj) {
        if (C0063.m4427() > 0) {
            return ((ApkVerifier.Result) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static int m1720(Object obj) {
        if (C0076.m6903() < 0) {
            return ((ViewOnClickListenerC0349d4) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1721() {
        if (C0023.m1921() >= 0) {
            return ApkVerifier.Issue.V3_MAX_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m1722() {
        if (C0026.m2298() <= 0) {
            return SignatureAlgorithm.ECDSA_WITH_SHA512;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m1723(Object obj, boolean z) {
        if (C0016.m717() < 0) {
            ((JsonWriter) obj).setHtmlSafe(z);
        }
    }

    /* JADX INFO: renamed from: ۠ۨ۟۠, reason: not valid java name and contains not printable characters */
    public static int m1724(Object obj) {
        if (C0077.m7272() < 0) {
            return ((ApplicationInfo) obj).targetSdkVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m1725(Object obj) {
        if (C0025.m2132() >= 0) {
            ((Z4) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static EditText m1726(Object obj) {
        if (C0076.m6903() <= 0) {
            return DialogC0373h0.b((Activity) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۢۡ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m1727(Object obj, Object obj2) {
        if (C0033.m3358() <= 0) {
            return ((C0) obj).f((Activity) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1729() {
        if (C0065.m4647() > 0) {
            return ApkVerifier.Issue.V3_SIG_MALFORMED_PUBLIC_KEY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1730(Object obj) {
        if (C0018.m1064() > 0) {
            return ((Y4) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۤۨ, reason: not valid java name and contains not printable characters */
    public static TextView m1731(Object obj) {
        if (C0074.m6454() < 0) {
            return ((C4) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۦۦ, reason: not valid java name and contains not printable characters */
    public static String m1732() {
        if (C0067.m5468() <= 0) {
            return "Problem.importing.entry.for.alias.alias.exception.Entry.for.alias.alias.not.imported.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۧۦ, reason: not valid java name and contains not printable characters */
    public static RunnablesExecutor m1733(Object obj) {
        if (C0067.m5468() < 0) {
            return ((V3SchemeSigner.Builder) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦۧ, reason: not valid java name and contains not printable characters */
    public static String m1734(String str) {
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

    /* JADX INFO: renamed from: ۡۨۧۥ, reason: not valid java name and contains not printable characters */
    public static float m1735(float f, float f2) {
        if (C0067.m5468() < 0) {
            return Math.max(f, f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۦۤ۟, reason: not valid java name and contains not printable characters */
    public static Asn1TagClass m1736() {
        if (C0029.m2791() >= 0) {
            return Asn1TagClass.CONTEXT_SPECIFIC;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۡۥ, reason: not valid java name and contains not printable characters */
    public static Pair m1737(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            return o5.s((AssetManager) obj, (File) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۧۢ, reason: not valid java name and contains not printable characters */
    public static int m1738(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((WindowManager.LayoutParams) obj).gravity;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨۦۥ, reason: not valid java name and contains not printable characters */
    public static int m1739(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((Q) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1740(Object obj) {
        if (C0033.m3358() < 0) {
            return ((J2) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m1741() {
        if (C0064.m4578() >= 0) {
            return "Alg.Alias.Signature.1.2.840.10045.4.3.1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡ, reason: not valid java name and contains not printable characters */
    public static FileVisitResult m1742(Object obj, Object obj2, Object obj3) {
        if (C0031.m3075() > 0) {
            return super/*java.nio.file.SimpleFileVisitor*/.visitFileFailed(obj2, (IOException) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۥ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m1743(Object obj, Object obj2) {
        if (C0075.m6893() > 0) {
            return ((VerityTreeBuilder) obj).generateVerityTree((DataSource) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۡ, reason: not valid java name and contains not printable characters */
    public static String m1744(Object obj) {
        if (C0064.m4578() > 0) {
            return ((O2) obj).T;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int m1745(Object obj) {
        if (C0069.m5781() < 0) {
            return ((C0473y) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static String m1746() {
        if (C0068.m5678() >= 0) {
            return "RSA/ECB/OAEPWithSHA-224AndMGF1Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۤۦ, reason: not valid java name and contains not printable characters */
    public static EditText m1747(Object obj) {
        if (C0031.m3075() > 0) {
            return ((DialogC0389j4) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۣ۠, reason: not valid java name and contains not printable characters */
    public static List m1748(Object obj) {
        if (C0071.m6069() > 0) {
            return ((SignedData) obj).certificates;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ContentResolver m1749(Object obj) {
        if (C0070.m5903() >= 0) {
            return AbstractC0406m3.w((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static MetaSelectAppAbility m1750(Object obj) {
        if (C0024.m2011() < 0) {
            return ((W2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1751(Object obj) {
        if (C0019.m1311() == 0) {
            return ((SupplierComponentFactory) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static E1 m1752(Object obj) {
        if (C0017.m846() >= 0) {
            return ((E5) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۦۡ, reason: not valid java name and contains not printable characters */
    public static void m1753(Object obj, Object obj2) {
        if (C0078.m7450() > 0) {
            ((Z4) obj).c((Activity) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1754(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((N2) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۥ, reason: not valid java name and contains not printable characters */
    public static Context m1755(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((View) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۧ, reason: not valid java name and contains not printable characters */
    public static List m1756(Object obj) {
        if (C0063.m4427() >= 0) {
            return V3SigningCertificateLineage.readSigningCertificateLineage((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۥۥ, reason: contains not printable characters */
    public static String m1757(int i) {
        if (C0038.m4010() > 0) {
            return K3.d(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۠, reason: contains not printable characters */
    public static JsonToken m1758(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((JsonReader) obj).peek();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨ۠, reason: contains not printable characters */
    public static D5 m1759(Object obj, Object obj2, Object obj3) {
        if (C0020.m1385() < 0) {
            return ((C0387j2) obj).h((RandomAccessFile) obj2, (q5) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۤۥ, reason: contains not printable characters */
    public static boolean m1760(Object obj) {
        if (C0034.m3450() > 0) {
            return ((SigningCertificateLineage.SignerCapabilities) obj).hasRollback();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۨ, reason: contains not printable characters */
    public static String m1761() {
        if (C0019.m1311() == 0) {
            return "AES_256/ECB/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۢ۟, reason: contains not printable characters */
    public static String m1762(Object obj, int i) {
        if (C0032.m3184() < 0) {
            return ((AndroidBinXmlParser) obj).getAttributeName(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۦۤ, reason: contains not printable characters */
    public static boolean m1763(Object obj) {
        if (C0074.m6454() < 0) {
            return ((JsonAdapter) obj).nullSafe();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static P0 m1764(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((K0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1765() {
        if (C0032.m3184() <= 0) {
            return "SHA224withRSA/PSS";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static long m1766(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((N3) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static long m1767(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((AbstractC0384j) obj).e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m1768(Object obj, Object obj2) {
        if (C0111.m13165() <= 0) {
            return ((Comparable) obj).compareTo(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡ۟۟, reason: not valid java name and contains not printable characters */
    public static JsonToken m1769() {
        if (C0025.m2132() >= 0) {
            return JsonToken.NUMBER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۧ, reason: not valid java name and contains not printable characters */
    public static void m1770(Object obj) {
        if (C0017.m846() >= 0) {
            ((Closeable) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m1771(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((U3) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۤۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1772() {
        if (C0032.m3184() < 0) {
            return ApkVerifier.Issue.JAR_SIG_NO_APK_SIG_STRIP_PROTECTION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۧ۠, reason: not valid java name and contains not printable characters */
    public static String m1773(Object obj) {
        if (C0065.m4647() > 0) {
            return ((V1SchemeVerifier.Result.SignerInfo) obj).signatureBlockFileName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧ, reason: not valid java name and contains not printable characters */
    public static String m1774(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((O2) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۧۤ, reason: not valid java name and contains not printable characters */
    public static File m1775(Object obj, Object obj2) {
        if (C0077.m7272() < 0) {
            return File.createTempFile((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۢۦ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1776() {
        if (C0078.m7450() > 0) {
            return ApkVerifier.Issue.V31_ROTATION_TARGETS_DEV_RELEASE_ATTR_ON_V3_SIGNER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Result.SourceStampInfo m1777(Object obj, Object obj2) {
        if (C0078.m7450() < 0) {
            return null;
        }
        return ((ApkVerifier.Result) obj).j = (ApkVerifier.Result.SourceStampInfo) obj2;
    }

    /* JADX INFO: renamed from: ۨۡۤۦ, reason: not valid java name and contains not printable characters */
    public static EditText m1778(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((DialogC0472x4) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦۡ, reason: not valid java name and contains not printable characters */
    public static s5 m1779(Object obj, int i, long j) {
        if (C0035.m3569() < 0) {
            return C0387j2.a((D5) obj, i, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۨ, reason: not valid java name and contains not printable characters */
    public static String m1780() {
        if (C0031.m3075() >= 0) {
            return "Please.provide.keysize.for.secret.key.generation";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۦ, reason: not valid java name and contains not printable characters */
    public static void m1781(Object obj, int i) {
        if (C0064.m4578() > 0) {
            ((AutoClickPointerBean) obj).setSlideEndPointerY(i);
        }
    }

    /* JADX INFO: renamed from: ۨۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int m1782() {
        if (C0018.m1064() >= 0) {
            return AbstractC0452u2.b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۨۥ, reason: not valid java name and contains not printable characters */
    public static int m1783(Object obj) {
        if (C0031.m3075() > 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).getMaxSdkVersion();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۧۦ, reason: not valid java name and contains not printable characters */
    public static String m1728(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
