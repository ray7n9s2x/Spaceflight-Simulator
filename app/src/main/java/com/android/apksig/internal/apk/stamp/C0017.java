package com.android.apksig.internal.apk.stamp;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.util.Base64;
import android.view.DisplayCutout;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerificationIssue;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.Hints;
import com.android.apksig.KeyConfig;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSigResult;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v4.V4SchemeSigner;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1TagClass;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerEncoding;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.jar.SignatureFileWriter;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.ByteArrayDataSink;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.basetoollib.GsonUtils;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.internal.C$Gson$Types;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.SqlDateTypeAdapter;
import com.joke.plugin.gson.internal.bind.TimeTypeAdapter;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptActionBean;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0396l;
import com.zfork.multiplatforms.android.bomb.AbstractC0400l3;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0446t2;
import com.zfork.multiplatforms.android.bomb.B1;
import com.zfork.multiplatforms.android.bomb.B3;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0381i2;
import com.zfork.multiplatforms.android.bomb.C0382i3;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0394k3;
import com.zfork.multiplatforms.android.bomb.C0407m4;
import com.zfork.multiplatforms.android.bomb.C0412n3;
import com.zfork.multiplatforms.android.bomb.C0420p;
import com.zfork.multiplatforms.android.bomb.C1;
import com.zfork.multiplatforms.android.bomb.D2;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0331b0;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.F3;
import com.zfork.multiplatforms.android.bomb.F5;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.InterfaceC0375h2;
import com.zfork.multiplatforms.android.bomb.InterfaceC0471x3;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.O0;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.V;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0409n0;
import com.zfork.multiplatforms.android.bomb.Z0;
import com.zfork.multiplatforms.android.bomb.n5;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.z5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.file.FileVisitResult;
import java.nio.file.StandardCopyOption;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.Provider;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import javax.net.ssl.SSLContext;
import org.conscrypt.C0111;
import sun.misc.Unsafe;
import sun.security.pkcs.PKCS10;
import sun.security.x509.CertificateExtensions;
import sun.security.x509.X500Name;

/* JADX INFO: renamed from: com.android.apksig.internal.apk.stamp.۠ۤۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0017 {

    /* JADX INFO: renamed from: ۣ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean f58 = true;

    /* JADX INFO: renamed from: ۟۟ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static float m823(Object obj) {
        if (C0073.m6356() < 0) {
            return ((B1) obj).c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static void m824(Object obj, long j, long j2) {
        if (C0033.m3358() < 0) {
            ((ByteArrayDataSink) obj).a(j, j2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static char[] m825(Object obj) {
        if (C0032.m3184() < 0) {
            return F3.c((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۢ۟, reason: not valid java name and contains not printable characters */
    public static int m826(Object obj, Object obj2, int i, int i2) {
        if (C0036.m3653() < 0) {
            return ((MessageDigest) obj).digest((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m827(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((JsonWriter) obj).isHtmlSafe();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m828(Object obj) {
        if (C0036.m3653() < 0) {
            return ((ApkVerificationIssue) obj).getIssueId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m829(Object obj) {
        if (C0020.m1385() < 0) {
            return ((View) obj).performClick();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static String m830(Object obj) {
        if (C0077.m7272() < 0) {
            return ((O2) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m831(Object obj) {
        if (C0073.m6356() < 0) {
            return ((X509Certificate) obj).getBasicConstraints();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static Pair m832(Object obj, Object obj2) {
        if (C0029.m2791() >= 0) {
            return V4SchemeSigner.generateV4Signature((DataSource) obj, (V4SchemeSigner.SignerConfig) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m833(Object obj, Object obj2, Object obj3, Object obj4) throws KeyStoreException {
        if (C0020.m1385() <= 0) {
            ((KeyStore) obj).setEntry((String) obj2, (KeyStore.Entry) obj3, (KeyStore.ProtectionParameter) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۤ۠, reason: not valid java name and contains not printable characters */
    public static SSLContext m834(Object obj) {
        if (C0027.m2460() > 0) {
            return SSLContext.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static Certificate m835(Object obj, Object obj2) {
        if (C0021.m1598() < 0) {
            return ((CertificateFactory) obj).generateCertificate((InputStream) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۦۣ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m836() {
        if (C0073.m6356() < 0) {
            return ApkVerifier.Issue.V3_SIG_MALFORMED_LINEAGE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static List m837(Object obj) {
        if (C0029.m2791() > 0) {
            return ((ApkVerifier.Result) obj).getV2SchemeSigners();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۤ۟, reason: not valid java name and contains not printable characters */
    public static ParameterizedType m838(Object obj, Object obj2, Object obj3) {
        if (C0024.m2011() < 0) {
            return C$Gson$Types.newParameterizedTypeWithOwner((Type) obj, (Type) obj2, (Type[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m839(Object obj, Object obj2, Object obj3) {
        if (C0078.m7450() > 0) {
            return GsonUtils.toJson((Gson) obj, obj2, (Type) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static long m840(Object obj) {
        if (C0032.m3184() < 0) {
            return ((C0357e5) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static void m841(Object obj, Object obj2) {
        if (C0016.m717() < 0) {
            ((DataSink) obj).consume((ByteBuffer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۡۢ, reason: not valid java name and contains not printable characters */
    public static String m842() {
        if (C0025.m2132() > 0) {
            return "ChaCha20";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static void m843(Object obj) {
        if (C0071.m6069() >= 0) {
            ((ApkSignerEngine.OutputJarSignatureRequest) obj).done();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۥۨ, reason: not valid java name and contains not printable characters */
    public static String m844() {
        if (C0035.m3569() <= 0) {
            return "Key.pair.not.generated.alias.alias.already.exists";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۧ, reason: not valid java name and contains not printable characters */
    public static String m845(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((ConsumerAbility) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m846() {
        return 56564 ^ C0032.m3236((Object) "ۧۡ");
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static Long m847(Object obj) {
        if (C0078.m7450() >= 0) {
            return Long.valueOf((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static int m848(Object obj, int i) {
        if (C0026.m2298() <= 0) {
            return ((AtomicIntegerArray) obj).get(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static IntBuffer m849(Object obj) {
        if (C0026.m2298() < 0) {
            return ((Q) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static V4Signature.SigningInfo m850(Object obj) {
        if (C0023.m1921() > 0) {
            return V4Signature.SigningInfo.fromByteArray((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static void m851(Object obj, long j) throws IOException {
        if (m846() >= 0) {
            ((RandomAccessFile) obj).seek(j);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۧ, reason: not valid java name and contains not printable characters */
    public static String m852() {
        if (C0066.m4827() > 0) {
            return "Mac.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static int m853(Object obj) {
        if (C0073.m6356() < 0) {
            return ((C0) obj).z;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static void m854(Object obj, int i) {
        if (C0069.m5781() <= 0) {
            ((Handler) obj).removeMessages(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m855() {
        if (C0035.m3569() <= 0) {
            return ApkVerifier.Issue.V2_SIG_NO_CERTIFICATES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۢۥ, reason: not valid java name and contains not printable characters */
    public static void m856(Object obj, Object obj2) {
        if (C0035.m3569() <= 0) {
            ((F5) obj).b((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m857() {
        if (C0072.m6216() >= 0) {
            return "<alias>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۦ, reason: not valid java name and contains not printable characters */
    public static Type m858(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((GenericArrayType) obj).getGenericComponentType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static void m859(Object obj, boolean z) {
        if (C0034.m3450() > 0) {
            ((C0) obj).l(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m860(Object obj) {
        if (C0032.m3184() < 0) {
            return ((ApkSigResult) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m861() {
        if (C0075.m6893() > 0) {
            return "Certificate.stored.in.file.filename.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m862(Object obj, int i) {
        if (C0074.m6454() < 0) {
            return Base64.decode((String) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static int m863(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((DialogC0373h0) obj).n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static JsonReader m864(Object obj, Object obj2) {
        if (C0111.m13165() < 0) {
            return ((Gson) obj).newJsonReader((Reader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static Object m865(Object obj) {
        if (C0035.m3569() < 0) {
            return ((V) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m866(Object obj, Object obj2) {
        if (C0068.m5678() >= 0) {
            return ((Set) obj).containsAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m867(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((Z0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۤ, reason: not valid java name and contains not printable characters */
    public static Class m868(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((C0382i3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۡ, reason: not valid java name and contains not printable characters */
    public static String m869(int i, int i2) {
        if (C0111.m13165() < 0) {
            return BerEncoding.tagClassAndNumberToString(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠۟, reason: not valid java name and contains not printable characters */
    public static void m870(Object obj, int i, Object obj2) {
        if (C0074.m6454() <= 0) {
            ((C0) obj).p(i, (Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m871(Object obj) {
        if (C0032.m3184() < 0) {
            return ((L) obj).g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ۠, reason: not valid java name and contains not printable characters */
    public static Asn1TagClass[] m872() {
        if (C0067.m5468() <= 0) {
            return Asn1TagClass.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m873(Object obj, long j, Object obj2) {
        if (C0063.m4427() > 0) {
            return D2.a((InputStream) obj, j, (Supplier) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟۠, reason: not valid java name and contains not printable characters */
    public static List m874(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((ManifestParser) obj).readAllSections();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۤۧ, reason: not valid java name and contains not printable characters */
    public static void m875(Object obj, Object obj2) throws z5 {
        if (m846() >= 0) {
            ((AbstractC0396l) obj).a((AbstractC0396l) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۨ, reason: not valid java name and contains not printable characters */
    public static int m876(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((BigInteger) obj).bitLength();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m877(Object obj) {
        if (C0070.m5903() > 0) {
            return ((C1) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢۦ, reason: not valid java name and contains not printable characters */
    public static List m878(Object obj) {
        if (C0072.m6216() > 0) {
            return ((DisplayCutout) obj).getBoundingRects();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m879(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((O0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۡ۠, reason: not valid java name and contains not printable characters */
    public static void m880(Object obj) {
        if (C0036.m3653() < 0) {
            ((F3) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۦۣ, reason: not valid java name and contains not printable characters */
    public static void m881(Object obj, Object obj2, Object obj3) {
        if (C0030.m2940() >= 0) {
            ((SqlDateTypeAdapter) obj).write2((JsonWriter) obj2, (Date) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m882(Object obj, boolean z) {
        if (C0037.m3837() < 0) {
            K0.a((K0) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m883(Object obj) {
        if (C0031.m3075() > 0) {
            return ((DialogC0331b0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۠۟, reason: not valid java name and contains not printable characters */
    public static void m884(Object obj, boolean z) {
        if (C0039.m4109() > 0) {
            ((WebSettings) obj).setJavaScriptEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۥ۟, reason: not valid java name and contains not printable characters */
    public static void m885(Object obj, Object obj2, Object obj3) {
        if (C0072.m6216() > 0) {
            ((TimeTypeAdapter) obj).write2((JsonWriter) obj2, (Time) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static LinearLayout m886(Object obj) {
        if (C0019.m1311() == 0) {
            return ((C0407m4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static void m887(Object obj) {
        if (m846() > 0) {
            SignatureFileWriter.writeSectionDelimiter((OutputStream) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static PackageInfo m888(Object obj, Object obj2, int i) {
        if (C0037.m3837() <= 0) {
            return ((PackageManager) obj).getPackageInfo((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۨۥ, reason: not valid java name and contains not printable characters */
    public static Matcher m889(Object obj, Object obj2) {
        if (C0068.m5678() >= 0) {
            return ((Hints.PatternWithRange) obj).matcher((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static Class m890(Object obj) {
        if (C0027.m2460() > 0) {
            return AbstractC0400l3.d((ClassLoader) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static String m891() {
        if (C0020.m1385() < 0) {
            return "Alg.Alias.Cipher.PBEWithHmacSHA224AndAES_256";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۥۦ, reason: not valid java name and contains not printable characters */
    public static File m892(Object obj) {
        if (m846() > 0) {
            return ((ApkSigner.Builder) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۧۦ, reason: not valid java name and contains not printable characters */
    public static void m893(Object obj, Object obj2, Object obj3) {
        if (C0039.m4109() > 0) {
            O2.K((String) obj, (CertificateExtensions) obj2, (PrintStream) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static Provider m894(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((KeyStore) obj).getProvider();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m895(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            return ((Function) obj).apply(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m896() {
        if (C0021.m1598() < 0) {
            return ApkVerifier.Issue.JAR_SIG_MANIFEST_SECTION_DIGEST_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۦۦ, reason: not valid java name and contains not printable characters */
    public static C0387j2 m897(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((C0420p) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m898(Object obj) {
        if (C0071.m6069() >= 0) {
            ConsumerAbility.a((ConsumerAbility) obj);
        }
    }

    /* JADX INFO: renamed from: ۡۧۡ۟, reason: not valid java name and contains not printable characters */
    public static View m899(Object obj, int i) {
        if (C0021.m1598() < 0) {
            return ((View) obj).findViewById(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m900(Object obj) {
        if (C0021.m1598() < 0) {
            return ((B3) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۢۡ, reason: not valid java name and contains not printable characters */
    public static Unsafe m901() {
        if (C0068.m5678() > 0) {
            return AbstractC0446t2.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۤۦ, reason: not valid java name and contains not printable characters */
    public static void m902(Object obj, int i) {
        if (C0031.m3075() > 0) {
            ((Drawable) obj).setAlpha(i);
        }
    }

    /* JADX INFO: renamed from: ۢ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static TextView m903(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((C0361f2) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۢۧ, reason: not valid java name and contains not printable characters */
    public static ActivityInfo m904(Object obj, Object obj2, int i) {
        if (C0019.m1311() == 0) {
            return ((PackageManager) obj).getActivityInfo((ComponentName) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۨ۟, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus m905() {
        if (C0071.m6069() >= 0) {
            return ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus.STAMP_MISSING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۢ, reason: not valid java name and contains not printable characters */
    public static Principal m906(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((X509Certificate) obj).getSubjectDN();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۤ, reason: not valid java name and contains not printable characters */
    public static FileVisitResult m907() {
        if (C0024.m2011() <= 0) {
            return FileVisitResult.CONTINUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۦ, reason: not valid java name and contains not printable characters */
    public static List m908(Object obj) {
        if (C0111.m13165() < 0) {
            return ((ApkSigner.SignerConfig) obj).getCertificates();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۦۥ, reason: not valid java name and contains not printable characters */
    public static int m909(Object obj) {
        if (C0025.m2132() > 0) {
            return ((C0361f2) obj).B;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m910(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((ScriptActionBean) obj).count;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static DialogC0421p0 m911(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((ViewOnClickListenerC0409n0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m912(Object obj, boolean z) {
        if (C0019.m1311() == 0) {
            ((I1) obj).setAutoClickStart(z);
        }
    }

    /* JADX INFO: renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m913(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((V1SchemeSigner.OutputManifestFile) obj).contents;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۨ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m914(Object obj, Object obj2) {
        if (C0037.m3837() < 0) {
            return ((ApkSigner.Builder) obj).setV4SignatureOutputFile((File) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۦۣ, reason: not valid java name and contains not printable characters */
    public static File m915(Object obj) {
        if (C0070.m5903() > 0) {
            return ((ApkVerifier.Builder) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۦۣ, reason: not valid java name and contains not printable characters */
    public static String m916() {
        if (C0033.m3358() < 0) {
            return "<keyalg>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۦۡ, reason: not valid java name and contains not printable characters */
    public static String m917(String str) {
        String strM2993 = C0031.m2993();
        String strM29932 = C0031.m2993();
        for (int i = 0; i < 15; i++) {
            strM2993 = C0077.m7301(C0030.m2967(C0030.m2967(new StringBuffer(), strM2993), C0021.m1651(i)));
            strM29932 = C0077.m7301(C0027.m2461(C0030.m2967(new StringBuffer(), strM29932), ((int) (C0038.m3986() * ((double) 10))) ^ i));
        }
        while (C0078.m7380(strM2993) > 0) {
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
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۣۥۡۦ, reason: not valid java name and contains not printable characters */
    public static void m918(Object obj, Object obj2) {
        if (C0077.m7272() < 0) {
            ((View) obj).getLocationOnScreen((int[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۦۣۢ, reason: not valid java name and contains not printable characters */
    public static boolean m919(Object obj, Object obj2) {
        if (C0071.m6069() > 0) {
            return ((ArrayList) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۢۢ, reason: not valid java name and contains not printable characters */
    public static String m920(Object obj, int i) {
        if (C0075.m6893() > 0) {
            return ((AndroidBinXmlParser) obj).getAttributeStringValue(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Object m921(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((Stack) obj).pop();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۥۤ, reason: not valid java name and contains not printable characters */
    public static View m922(Object obj, int i) {
        if (C0023.m1921() > 0) {
            return o5.f((View) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m923(double d) {
        if (C0038.m4010() >= 0) {
            return Double.isNaN(d);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۤۥ, reason: not valid java name and contains not printable characters */
    public static String m924() {
        if (C0065.m4647() > 0) {
            return "AES_256/ECB/PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m925(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((InputStream) obj).markSupported();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static KeyConfig m926(Object obj) {
        if (C0037.m3837() <= 0) {
            return C0028.m2635((DefaultApkSignerEngine.SignerConfig) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۨ۟, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m927(Object obj) {
        if (C0075.m6893() > 0) {
            return SigningCertificateLineage.readFromApkFile((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۥۨ, reason: not valid java name and contains not printable characters */
    public static void m928(Object obj, int i, long j, Object obj2, Object obj3) {
        if (C0016.m717() < 0) {
            C0387j2.r((D5) obj, i, j, (ByteArrayOutputStream) obj2, (C0387j2) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۢ۠, reason: contains not printable characters */
    public static void m929(Object obj, float f) {
        if (C0036.m3653() <= 0) {
            ((View) obj).setTranslationX(f);
        }
    }

    /* JADX INFO: renamed from: ۥۣۢۤ, reason: contains not printable characters */
    public static void m930(Object obj, int i, Object obj2) {
        if (C0018.m1064() >= 0) {
            ((List) obj).add(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢۤۤ, reason: contains not printable characters */
    public static ApkSignerEngine.OutputApkSigningBlockRequest2 m931(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0029.m2791() >= 0) {
            return ((ApkSignerEngine) obj).outputZipSections2((DataSource) obj2, (DataSource) obj3, (DataSource) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۨۥ, reason: contains not printable characters */
    public static C0412n3 m932(Object obj) {
        if (C0029.m2791() > 0) {
            return ((C0357e5) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۡۦ, reason: contains not printable characters */
    public static X500Name m933(Object obj) {
        if (C0016.m717() < 0) {
            return ((PKCS10) obj).getSubjectName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۢۤ, reason: contains not printable characters */
    public static Uri m934(Object obj, Object obj2, Object obj3) {
        if (C0029.m2791() > 0) {
            return ((ContentResolver) obj).insert((Uri) obj2, (ContentValues) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۢۦ, reason: contains not printable characters */
    public static boolean m935(Object obj) {
        if (C0065.m4647() > 0) {
            return ((ApkSigResult) obj).containsErrors();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ۟۠, reason: contains not printable characters */
    public static String m937() {
        if (C0027.m2460() >= 0) {
            return "AES_256/GCM-SIV/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ۟ۧ, reason: contains not printable characters */
    public static InterfaceC0471x3 m938(Object obj) {
        if (C0078.m7450() > 0) {
            return ((n5) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡۨ, reason: contains not printable characters */
    public static int m939(Object obj) {
        if (C0078.m7450() > 0) {
            return AbstractC0406m3.n((Context) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۤ۠, reason: contains not printable characters */
    public static Uri m940(Object obj) {
        if (C0030.m2940() > 0) {
            return Uri.fromFile((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۧۧ, reason: contains not printable characters */
    public static boolean m941(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((U3) obj).x;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۦ۠ۧ, reason: contains not printable characters */
    public static Spanned m942(Object obj) {
        if (C0034.m3450() >= 0) {
            return Html.fromHtml((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۨ۟, reason: contains not printable characters */
    public static StandardCopyOption m943() {
        if (C0064.m4578() >= 0) {
            return C0038.m4055();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ۟ۨ, reason: contains not printable characters */
    public static void m944(Object obj, boolean z) {
        if (C0078.m7450() > 0) {
            ((Dialog) obj).setCancelable(z);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m945(Object obj) {
        if (C0069.m5781() < 0) {
            return ((C0394k3) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۢۨ, reason: not valid java name and contains not printable characters */
    public static String m946() {
        if (C0028.m2593() > 0) {
            return "AES_128/CBC/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۢ۟, reason: not valid java name and contains not printable characters */
    public static DataSource m947(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((ApkVerifier.Builder) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static HashSet m948() {
        if (C0076.m6903() <= 0) {
            return AbstractC0446t2.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m949(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((C0357e5) obj).i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static File m950(Object obj) {
        if (C0074.m6454() < 0) {
            return ((A5) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦۨ, reason: not valid java name and contains not printable characters */
    public static void m951(Object obj, Object obj2) {
        if (C0037.m3837() <= 0) {
            ((C0381i2) obj).setListener((InterfaceC0375h2) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۦۣۢ, reason: not valid java name and contains not printable characters */
    public static Button m952(Object obj) {
        if (C0077.m7272() < 0) {
            return ((DialogC0421p0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۡ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m953(Object obj) {
        if (C0066.m4827() > 0) {
            return ((DefaultApkSignerEngine.SignerConfig.Builder) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۡ۟, reason: contains not printable characters */
    public static String m936(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
