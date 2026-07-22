package com.joke.plugin.gson.internal.reflect;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ApkSigningBlockUtilsLite;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.SourceStampCertificateLineage;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SigningCertificateLineage;
import com.android.apksig.internal.apk.v4.V4SchemeSigner;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.ByteBufferUtils;
import com.android.apksig.internal.util.ByteStreams;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.ChainedDataSource;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.bmJiasu.xhook.call.a;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.ExclusionStrategy;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.internal.Excluder;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptJumpBean;
import com.joke.script.bean.ScriptRecordType;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.AbstractC0400l3;
import com.zfork.multiplatforms.android.bomb.AbstractC0441s3;
import com.zfork.multiplatforms.android.bomb.AbstractC0449u;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0330b;
import com.zfork.multiplatforms.android.bomb.C0337c;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0362f3;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0404m1;
import com.zfork.multiplatforms.android.bomb.C0408n;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0453u3;
import com.zfork.multiplatforms.android.bomb.C0469x1;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.C5;
import com.zfork.multiplatforms.android.bomb.D2;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0472x4;
import com.zfork.multiplatforms.android.bomb.F;
import com.zfork.multiplatforms.android.bomb.I;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.InterfaceC0422p1;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.N4;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.O4;
import com.zfork.multiplatforms.android.bomb.Q4;
import com.zfork.multiplatforms.android.bomb.R0;
import com.zfork.multiplatforms.android.bomb.RunnableC0367g1;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0368g2;
import com.zfork.multiplatforms.android.bomb.W4;
import com.zfork.multiplatforms.android.bomb.X2;
import com.zfork.multiplatforms.android.bomb.Y;
import com.zfork.multiplatforms.android.bomb.Y3;
import com.zfork.multiplatforms.android.bomb.Z0;
import com.zfork.multiplatforms.android.bomb.Z4;
import com.zfork.multiplatforms.android.bomb.h5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.attribute.PosixFilePermission;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.crypto.Mac;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.C0111;
import org.conscrypt.NativeCrypto;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import sun.security.x509.X509CertInfo;

/* JADX INFO: renamed from: com.joke.plugin.gson.internal.reflect.ۣۤۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0071 {

    /* JADX INFO: renamed from: ۢۨۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean f208;

    /* JADX INFO: renamed from: ۟۟۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static String m5961() {
        if (C0039.m4109() > 0) {
            return "OpenSSLCipherRSA$OAEP$SHA1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m5962(Object obj) {
        if (C0038.m4010() > 0) {
            ((T1) obj).f();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static float m5963(Object obj) {
        if (C0068.m5678() > 0) {
            return ((JsonElement) obj).getAsFloat();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static char[] m5964(Object obj, Object obj2, Object obj3) {
        if (C0031.m3075() > 0) {
            return ((O2) obj).x((String) obj2, (char[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static void m5965(Object obj) {
        if (C0111.m13165() < 0) {
            AbstractC0449u.j((String[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m5966(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((C0330b) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m5967(Object obj, Object obj2, Object obj3, long j) {
        if (C0029.m2791() > 0) {
            return h5.e((C0357e5) obj, (ArrayList) obj2, (HashMap) obj3, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۦۨ, reason: not valid java name and contains not printable characters */
    public static void m5968(Object obj, int i) {
        if (C0027.m2460() >= 0) {
            ((AbstractC0441s3) obj).d(i);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5969(Object obj) {
        if (C0035.m3569() < 0) {
            return ((T2) obj).m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5970() {
        if (C0033.m3358() <= 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_SIGNATURE_SCHEME_NOT_AVAILABLE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m5971(Object obj, Object obj2, int i, int i2) {
        if (C0075.m6893() > 0) {
            ((C0453u3) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5972(Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            return ((X500Principal) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static HashSet m5973(Object obj) {
        if (C0033.m3358() < 0) {
            return ((O2) obj).S;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m5974() {
        if (C0070.m5903() >= 0) {
            return "Alg.Alias.Cipher.2.16.840.1.101.3.4.1.26";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۢۦ, reason: not valid java name and contains not printable characters */
    public static String m5975(Object obj) {
        if (C0077.m7272() < 0) {
            return ((ScriptRecordType) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m5976(Object obj, Object obj2, Object obj3) {
        if (C0026.m2298() < 0) {
            ApkVerifier.a((List) obj, (List) obj2, (ApkVerifier.Result) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static int m5977() {
        if (C0018.m1064() > 0) {
            return View.generateViewId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m5978(Object obj, int i) {
        if (C0063.m4427() > 0) {
            ((GridLayout) obj).setColumnCount(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static ListView m5979(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((X2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static PosixFilePermission m5980() {
        if (C0065.m4647() > 0) {
            return PosixFilePermission.OTHERS_EXECUTE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m5981(Object obj) {
        if (C0016.m717() <= 0) {
            return ByteStreams.toByteArray((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static int m5982(Object obj) {
        if (C0020.m1385() < 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۢ۠, reason: not valid java name and contains not printable characters */
    public static Excluder m5983(Object obj, Object obj2, boolean z, boolean z2) {
        if (C0076.m6903() < 0) {
            return ((Excluder) obj).withExclusionStrategy((ExclusionStrategy) obj2, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦ۠, reason: not valid java name and contains not printable characters */
    public static int m5984(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((Buffer) obj).remaining();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۨۡ, reason: not valid java name and contains not printable characters */
    public static String m5985() {
        if (C0065.m4647() >= 0) {
            return "Alg.Alias.Cipher.ChaCha20-Poly1305";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۦۣ, reason: not valid java name and contains not printable characters */
    public static String m5986() {
        if (C0063.m4427() >= 0) {
            return "Alg.Alias.Cipher.RSA/None/OAEPWithSHA-224AndMGF1Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۧ۟, reason: not valid java name and contains not printable characters */
    public static int m5987(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((AbstractC0384j) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۧ, reason: not valid java name and contains not printable characters */
    public static String[] m5988() {
        if (C0018.m1064() >= 0) {
            return NativeCrypto.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static void m5989(Object obj, int i, int i2) {
        if (C0064.m4578() >= 0) {
            ((C0408n) obj).f(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5990() {
        if (C0078.m7450() >= 0) {
            return ApkVerifier.Issue.V4_SIG_MALFORMED_PUBLIC_KEY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Drawable m5992(Object obj, Object obj2) {
        if (C0068.m5678() >= 0) {
            return Drawable.createFromStream((InputStream) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static int m5993(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((RunnableC0367g1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5994(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((C0357e5) obj).g();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static RunnablesExecutor m5995(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((V3SchemeSigner) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡ۟, reason: not valid java name and contains not printable characters */
    public static JsonWriter m5996(Object obj, Object obj2) {
        if (C0027.m2460() >= 0) {
            return ((JsonWriter) obj).value((Number) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢ۟, reason: not valid java name and contains not printable characters */
    public static String m5997() {
        if (C0064.m4578() >= 0) {
            return " SupportedKeyClasses";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m5998(Object obj) {
        if (C0078.m7450() > 0) {
            return ((V3SigningCertificateLineage.SigningCertificateNode) obj).parentSigAlgorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۦ, reason: not valid java name and contains not printable characters */
    public static W4 m5999(Object obj) {
        if (C0078.m7450() > 0) {
            return ((Y) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6000() {
        if (C0032.m3184() <= 0) {
            return ApkVerifier.Issue.V3_SIG_MALFORMED_DIGEST;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static List m6001(Object obj) {
        if (C0028.m2593() > 0) {
            return ((CertPath) obj).getCertificates();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۧ, reason: not valid java name and contains not printable characters */
    public static String m6002(Object obj) {
        if (C0017.m846() > 0) {
            return ((ApkSignerEngine.OutputJarSignatureRequest.JarEntry) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۡ, reason: not valid java name and contains not printable characters */
    public static N4 m6003(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((O4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۦ, reason: not valid java name and contains not printable characters */
    public static int m6004(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((I) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۧ, reason: not valid java name and contains not printable characters */
    public static int m6005(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((ViewOnClickListenerC0368g2) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0422p1 m6006(Object obj) {
        if (C0035.m3569() < 0) {
            return ((Z0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m6007(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((C0330b) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Pair m6008(Object obj, long j) {
        if (C0039.m4109() >= 0) {
            return ((ChainedDataSource) obj).a(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m6009() {
        if (C0038.m4010() > 0) {
            return "trustedCertEntry";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static void m6010(Object obj, Object obj2) {
        if (C0068.m5678() >= 0) {
            ((C0404m1) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6011() {
        if (C0030.m2940() >= 0) {
            return "AES_128/ECB/PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m6012(Object obj) {
        if (C0065.m4647() > 0) {
            return ((Iterator) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۧۤ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m6013(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((V3SchemeVerifier.Builder) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static double m6014(Object obj) {
        return C0039.m4109() > 0 ? ((JsonPrimitive) obj).getAsDouble() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static View m6015(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((I1) obj).getSaveLayout();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m6016(Object obj, Object obj2, Object obj3) {
        if (C0076.m6903() <= 0) {
            return String.format((Locale) obj, (String) obj2, (Object[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۥۤ, reason: not valid java name and contains not printable characters */
    public static String m6017() {
        if (C0070.m5903() >= 0) {
            return "Entry.for.alias.alias.not.imported.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۡ, reason: not valid java name and contains not printable characters */
    public static List m6018(Object obj, int i) {
        if (C0063.m4427() > 0) {
            return ((PackageManager) obj).getInstalledApplications(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6019() {
        if (C0035.m3569() <= 0) {
            return ApkVerifier.Issue.JAR_SIG_UNNNAMED_SIG_FILE_SECTION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۨ, reason: not valid java name and contains not printable characters */
    public static ScriptRecordType m6020(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((U3) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۡ, reason: not valid java name and contains not printable characters */
    public static X509Certificate m6021(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((ApkVerifier.Result.V2SchemeSignerInfo) obj).getCertificate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۦۦ, reason: not valid java name and contains not printable characters */
    public static char[] m6022(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0021.m1598() < 0) {
            return ((O2) obj).N((String) obj2, (String) obj3, (char[]) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static C0387j2 m6023(Object obj) {
        if (C0016.m717() <= 0) {
            return ((Q4) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static C0408n m6024() {
        if (C0028.m2593() > 0) {
            return C0408n.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m6025(Object obj) {
        if (C0031.m3075() > 0) {
            return Asn1DerEncoder.d(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static int m6026(Object obj) {
        if (C0018.m1064() > 0) {
            return ((SignatureAlgorithm) obj).getMinSdkVersion();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۠۟, reason: not valid java name and contains not printable characters */
    public static byte[] m6027(Object obj) {
        if (C0025.m2132() > 0) {
            return ((R0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۥۣ, reason: not valid java name and contains not printable characters */
    public static N2 m6028() {
        if (C0073.m6356() <= 0) {
            return N2.q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m6029(Object obj) {
        if (m6069() >= 0) {
            return ByteBufferUtils.toByteArray((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static void m6030(Object obj) {
        if (C0069.m5781() < 0) {
            ((a) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m6031(Object obj) {
        if (C0030.m2940() >= 0) {
            ((BaseAdapter) obj).notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6032(Object obj) {
        if (C0020.m1385() < 0) {
            return ((DefaultApkSignerEngine.SignerConfig.Builder) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6033(long j) {
        if (C0019.m1311() == 0) {
            return String.valueOf(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static EditText m6034(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((DialogC0472x4) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m6035(String str) {
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

    /* JADX INFO: renamed from: ۡۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Uri m6036() {
        if (C0064.m4578() >= 0) {
            return C0027.m2423();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢ, reason: not valid java name and contains not printable characters */
    public static void m6037(Object obj, int i) {
        if (C0026.m2298() <= 0) {
            ((AutoClickPointerBean) obj).setClickIntervalStart(i);
        }
    }

    /* JADX INFO: renamed from: ۣۡۦۤ, reason: not valid java name and contains not printable characters */
    public static String m6038(int i, Object obj) {
        if (C0020.m1385() < 0) {
            return K3.l(i, (String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6039(Object obj) {
        if (C0067.m5468() < 0) {
            return ((DefaultApkSignerEngine) obj).t;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m6040(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((DigestAlgorithm) obj).getJcaMessageDigestAlgorithm();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۦۥ, reason: not valid java name and contains not printable characters */
    public static ZipUtils.DeflateResult m6041(Object obj) {
        if (C0026.m2298() <= 0) {
            return ZipUtils.deflate((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m6042(Object obj, int i) throws IOException {
        if (C0037.m3837() <= 0) {
            ((PushbackInputStream) obj).unread(i);
        }
    }

    /* JADX INFO: renamed from: ۡۧۡ۠, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m6043(Object obj) {
        if (C0038.m4010() > 0) {
            return ((ByteBuffer) obj).slice();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6044(Object obj) {
        if (C0070.m5903() > 0) {
            return ((C0469x1) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۦۡ, reason: not valid java name and contains not printable characters */
    public static void m6045(Object obj, Object obj2, Object obj3) {
        if (C0067.m5468() <= 0) {
            V4SchemeSigner.generateV4Signature((DataSource) obj, (V4SchemeSigner.SignerConfig) obj2, (File) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۧۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6046(Object obj, Object obj2, boolean z) {
        if (C0069.m5781() <= 0) {
            return ((Intent) obj).getBooleanExtra((String) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static D5 m6047(Object obj) {
        if (C0063.m4427() > 0) {
            return ((Y3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۧ, reason: not valid java name and contains not printable characters */
    public static int m6048(Object obj) {
        if (C0028.m2593() > 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo.Signature) obj).getAlgorithmId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۥۣ, reason: not valid java name and contains not printable characters */
    public static void m6049(Object obj, Object obj2, Object obj3) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        if (C0024.m2011() <= 0) {
            ((Certificate) obj).verify((PublicKey) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۤۢۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m6050() {
        if (C0028.m2593() > 0) {
            return D2.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m6051(Object obj, Object obj2) {
        if (C0035.m3569() < 0) {
            AbstractC0400l3.b((URL) obj, (File) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static List m6052(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).getContentDigests();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۣۨ, reason: not valid java name and contains not printable characters */
    public static String m6053() {
        if (C0031.m3075() >= 0) {
            return "Alg.Alias.Signature.SHA224withRSAandMGF1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۣۤ, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m6054(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((SourceStampCertificateLineage.SigningCertificateNode) obj).sigAlgorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥ۠, reason: not valid java name and contains not printable characters */
    public static String m6055() {
        if (C0037.m3837() <= 0) {
            return "OpenSSLSignature$SHA224ECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۦۥ, reason: not valid java name and contains not printable characters */
    public static String m6056(Object obj, int i) {
        if (C0038.m4010() > 0) {
            return ((String) obj).substring(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۡ, reason: not valid java name and contains not printable characters */
    public static MethodHandle m6057(Object obj, Object obj2) {
        if (C0016.m717() <= 0) {
            return C0026.m2243((MethodHandles.Lookup) obj, (Method) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m6058(Object obj, Object obj2) {
        if (C0039.m4109() >= 0) {
            return Asn1BerParser.d((BerDataValue) obj, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static N2 m6059() {
        if (C0031.m3075() > 0) {
            return N2.r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m6060(Object obj, Object obj2, Object obj3) {
        if (C0019.m1311() == 0) {
            ((X509Certificate) obj).verify((PublicKey) obj2, (Provider) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m6061(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((C0362f3) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static ListView m6062(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((C0444t0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢ۠, reason: not valid java name and contains not printable characters */
    public static void m6063(Object obj, Object obj2, int i, int i2) {
        if (C0066.m4827() > 0) {
            ((Mac) obj).update((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۤۥۦۢ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m6064(Object obj) {
        if (C0064.m4578() > 0) {
            return ((C0361f2) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۧ, reason: contains not printable characters */
    public static void m6065(Object obj, Object obj2, Object obj3) {
        if (C0074.m6454() <= 0) {
            ((X509CertInfo) obj).set((String) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۡۦۤ, reason: contains not printable characters */
    public static long m6066(Object obj) {
        if (C0075.m6893() > 0) {
            return ((RandomAccessFile) obj).getFilePointer();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۡۦۦ, reason: contains not printable characters */
    public static float m6067(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((U3) obj).k;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۡۧۨ, reason: contains not printable characters */
    public static JsonElement m6068(Object obj) {
        if (C0031.m3075() > 0) {
            return ((JsonElement) obj).deepCopy();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۤ, reason: contains not printable characters */
    public static int m6069() {
        return 1746786 ^ C0032.m3236((Object) "ۣ۟۟");
    }

    /* JADX INFO: renamed from: ۥۤۥۢ, reason: contains not printable characters */
    public static void m6070(Object obj, Object obj2) {
        if (C0075.m6893() > 0) {
            ((Handler) obj).removeCallbacksAndMessages(obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۨۧۨ, reason: contains not printable characters */
    public static String m6071(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((M4) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۨۨ, reason: contains not printable characters */
    public static void m6072(Object obj, Object obj2, Object obj3, Object obj4) {
        if (m6069() > 0) {
            ((Gson) obj).toJson(obj2, (Type) obj3, (Appendable) obj4);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۧۧ, reason: contains not printable characters */
    public static byte[] m6073(Object obj) {
        if (C0078.m7450() > 0) {
            return ((ApkSignerEngine.OutputJarSignatureRequest.JarEntry) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۡۦ, reason: contains not printable characters */
    public static boolean m6074(Object obj) {
        if (C0063.m4427() > 0) {
            return ((O2) obj).J;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ۥ۟, reason: contains not printable characters */
    public static Drawable m6075(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((Z4) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۢۦ, reason: contains not printable characters */
    public static List m6076(Object obj, int i, int i2) {
        if (C0066.m4827() > 0) {
            return ((ArrayList) obj).subList(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۦۧ, reason: contains not printable characters */
    public static List m6077(Object obj) {
        if (C0021.m1598() < 0) {
            return C0035.m3572((ApkVerifier.Result.V1SchemeSignerInfo) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۠ۦ, reason: contains not printable characters */
    public static Object m6078(Object obj, int i) {
        if (C0018.m1064() > 0) {
            return ((List) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۧۨ, reason: contains not printable characters */
    public static SigningCertificateLineage m6079(Object obj) {
        if (C0039.m4109() > 0) {
            return ((ApkVerifier.Result) obj).s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣ۟, reason: contains not printable characters */
    public static Button m6080(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((C0351e) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۧ, reason: contains not printable characters */
    public static int m6081(Object obj) {
        if (C0066.m4827() > 0) {
            return ((C0337c) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥ۠ۡ, reason: contains not printable characters */
    public static byte m6082(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((JsonElement) obj).getAsByte();
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۦۧۡۨ, reason: contains not printable characters */
    public static void m6083(Object obj, float f) {
        if (C0031.m3075() >= 0) {
            ((AutoClickPointerBean) obj).setSlideEndRelativePercentX(f);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static ScriptJumpBean m6084(Object obj) {
        if (C0073.m6356() < 0) {
            return ((C4) obj).K;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6085(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((Class) obj).isEnum();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m6086(Object obj, Object obj2, Object obj3) {
        if (C0032.m3184() < 0) {
            ((O2) obj).r((Certificate) obj2, (PrintStream) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧۡۢۨ, reason: not valid java name and contains not printable characters */
    public static String m6087(Object obj) {
        if (m6069() > 0) {
            return ((ManifestParser.Section) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6088() {
        if (C0020.m1385() < 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_UNKNOWN_SIG_ALGORITHM;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static NodeList m6089(Object obj, Object obj2) {
        if (C0067.m5468() <= 0) {
            return ((Document) obj).getElementsByTagName((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۨۦ, reason: not valid java name and contains not printable characters */
    public static void m6090(Object obj, Object obj2) throws IOException {
        if (C0020.m1385() <= 0) {
            ((Writer) obj).write((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m6091(Object obj) {
        if (C0064.m4578() >= 0) {
            return F.a((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۡ۟, reason: not valid java name and contains not printable characters */
    public static String m6092(Object obj) {
        if (C0077.m7272() < 0) {
            return ApkSigningBlockUtilsLite.toHex((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۦ۠, reason: not valid java name and contains not printable characters */
    public static int m6093(Object obj) {
        if (C0065.m4647() > 0) {
            return ((V3SchemeVerifier) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۣۨ, reason: not valid java name and contains not printable characters */
    public static void m6094(Object obj) {
        if (C0111.m13165() < 0) {
            ((C5) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۨۦۤۤ, reason: not valid java name and contains not printable characters */
    public static int m6095(Object obj) {
        if (C0034.m3450() > 0) {
            return ((C0357e5) obj).read();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦۥۡ, reason: not valid java name and contains not printable characters */
    public static String m6096() {
        if (C0074.m6454() <= 0) {
            return "Cannot.find.file.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m5991(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
