package com.android.apksig.zip;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.V2SourceStampSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SigningCertificateLineage;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.util.RandomAccessFileDataSink;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.DataSources;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.util.RunnablesProvider;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.basetoollib.LoadDrawableUtils;
import com.joke.connectdevice.bean.AutoClickContentBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.internal.C$Gson$Types;
import com.joke.plugin.gson.internal.UnsafeAllocator;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.SqlDateTypeAdapter;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptProjectBean;
import com.joke.script.bean.ScriptRecordType;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0390k;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0416o1;
import com.zfork.multiplatforms.android.bomb.AbstractC0446t2;
import com.zfork.multiplatforms.android.bomb.AbstractC0449u;
import com.zfork.multiplatforms.android.bomb.B5;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0467x;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.DialogC0472x4;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.J2;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.P;
import com.zfork.multiplatforms.android.bomb.Q;
import com.zfork.multiplatforms.android.bomb.RunnableC0353e1;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.T3;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.X1;
import com.zfork.multiplatforms.android.bomb.Y;
import com.zfork.multiplatforms.android.bomb.Z0;
import com.zfork.multiplatforms.android.bomb.s5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.sql.Date;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import org.conscrypt.C0111;
import org.conscrypt.NativeCrypto;
import sun.security.pkcs.PKCS10Attribute;
import sun.security.util.ObjectIdentifier;

/* JADX INFO: renamed from: com.android.apksig.zip.۟ۥۧۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0034 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f138short = {1980, 1126};

    /* JADX INFO: renamed from: ۤۡۤۢ, reason: not valid java name and contains not printable characters */
    public static int f139 = 50;

    /* JADX INFO: renamed from: ۟۟ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static Paint m3383(Object obj) {
        if (C0071.m6069() > 0) {
            return ((ShapeDrawable) obj).getPaint();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۡۧ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m3384(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((K0) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static DataSource m3385(Object obj) {
        if (C0063.m4427() > 0) {
            return ((SourceStampVerifier) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static HashSet m3386() {
        if (C0064.m4578() > 0) {
            return NativeCrypto.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static char m3387(Object obj) {
        if (C0031.m3075() > 0) {
            return ((Character) obj).charValue();
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static DataSource m3388(Object obj, long j, long j2) {
        if (C0076.m6903() <= 0) {
            return DataSources.asDataSource((RandomAccessFile) obj, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۡ, reason: not valid java name and contains not printable characters */
    public static void m3389(Object obj) {
        if (C0066.m4827() >= 0) {
            ((Deflater) obj).finish();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m3390(Object obj, Object obj2, boolean z) {
        if (C0076.m6903() <= 0) {
            return ((L) obj).c((String) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m3391(Object obj) {
        if (C0073.m6356() < 0) {
            return ((Collection) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static Buffer m3392(Object obj, int i) {
        if (C0020.m1385() < 0) {
            return ((ByteBuffer) obj).limit(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static long m3393() {
        if (C0024.m2011() < 0) {
            return AbstractC0446t2.c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static G0 m3394(Object obj) {
        if (m3450() > 0) {
            return ((J2) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m3395(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((TimeZone) obj).getID();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Writer m3396(Object obj, Object obj2) {
        if (C0075.m6893() >= 0) {
            return ((Writer) obj).append((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m3397(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((SigningCertificateLineage.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧ۟, reason: not valid java name and contains not printable characters */
    public static int m3398(int i) {
        if (C0064.m4578() >= 0) {
            return K3.g(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۨۡ, reason: not valid java name and contains not printable characters */
    public static int m3399(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((View) obj).getLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۤ, reason: not valid java name and contains not printable characters */
    public static String m3400() {
        if (C0017.m846() > 0) {
            return "OpenSSLSignature$SHA384RSAPSS";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۡۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m3401(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((Y) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۦۡ, reason: not valid java name and contains not printable characters */
    public static void m3402(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0064.m4578() >= 0) {
            ((T2) obj).a((AssetManager) obj2, (String) obj3, (A5) obj4, (ConsumerAbility) obj5, (String) obj6);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static KeyStore m3403(Object obj) {
        if (C0038.m4010() >= 0) {
            return KeyStore.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۦ, reason: not valid java name and contains not printable characters */
    public static String m3404(String str) {
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
        String strM5418 = C0067.m5418(m3449(), 0, 1, 2013);
        while (C0078.m7380(strM5418) > 0) {
            strM5418 = C0031.m2993();
            if (C0078.m7380(strM5418) == 0) {
                strM5418 = C0037.m3829(m3449(), 1, 1, 1031);
            }
        }
        int iM7380 = C0078.m7380(strM5418);
        int iM73802 = C0078.m7380(strM29932);
        for (int i3 = 0; i3 < iM7380; i3++) {
            bArrM7297[i3] = (byte) (bArrM7297[i3] ^ C0077.m7212(strM29932, i3 % iM73802));
        }
        for (int iM73803 = 0; iM73803 < bArrM7297.length; iM73803 = C0078.m7380(C0031.m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۟ۢۧۤۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m3405(Object obj, int i, int i2) {
        if (C0065.m4647() > 0) {
            return Arrays.copyOfRange((Object[]) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3406() {
        if (C0032.m3184() < 0) {
            return ApkVerifier.Issue.V2_SIG_MALFORMED_SIGNERS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static List m3407(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((V1SchemeVerifier.Result.SignerInfo) obj).getWarnings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3408(int i) {
        if (C0065.m4647() >= 0) {
            return ByteBuffer.allocateDirect(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۣ, reason: not valid java name and contains not printable characters */
    public static X509Certificate m3409(Object obj) {
        if (C0078.m7450() > 0) {
            return ((SourceStampVerifier.Result.SignerInfo) obj).getSigningCertificate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m3410() {
        if (C0078.m7450() > 0) {
            return SignatureAlgorithm.DETDSA_WITH_SHA256;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m3411(Object obj) {
        if (C0039.m4109() > 0) {
            return ((AutoClickContentBean) obj).getLoopNum();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟۟, reason: not valid java name and contains not printable characters */
    public static void m3412(Object obj) {
        if (C0017.m846() >= 0) {
            ((G0) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۦۨ, reason: not valid java name and contains not printable characters */
    public static int m3413(Object obj, int i) {
        if (C0075.m6893() >= 0) {
            return ((Resources) obj).getDimensionPixelSize(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۦ, reason: not valid java name and contains not printable characters */
    public static int m3414(Object obj, Object obj2, Object obj3) {
        if (m3450() >= 0) {
            return ((Collator) obj).compare((String) obj2, (String) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۥۧ, reason: not valid java name and contains not printable characters */
    public static long m3415(Object obj, int i, int i2, Object obj2, long j, long j2, Object obj3) {
        if (C0077.m7272() <= 0) {
            return LocalFileRecord.outputRecordWithDeflateCompressedData((String) obj, i, i2, (byte[]) obj2, j, j2, (DataSink) obj3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۤۧۤ, reason: not valid java name and contains not printable characters */
    public static BigInteger m3416(Object obj) {
        if (C0072.m6216() > 0) {
            return ((X509Certificate) obj).getSerialNumber();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟۠, reason: not valid java name and contains not printable characters */
    public static List m3417(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((V1SchemeVerifier.Result.SignerInfo) obj).certChain;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3418(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((AtomicBoolean) obj).get();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m3419(Object obj, Object obj2, Object obj3) {
        if (C0037.m3837() < 0) {
            return ((Comparator) obj).compare(obj2, obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static int m3420(Object obj) {
        if (C0066.m4827() > 0) {
            return ((B5) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۧۧ, reason: not valid java name and contains not printable characters */
    public static DirectoryStream m3421(Object obj) {
        if (C0069.m5781() <= 0) {
            return C0038.m4003((Path) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۥۧ, reason: not valid java name and contains not printable characters */
    public static Collator m3422() {
        if (C0073.m6356() < 0) {
            return O2.Y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۢ, reason: not valid java name and contains not printable characters */
    public static Object m3423(Object obj, Object obj2, Object obj3) {
        if (C0111.m13165() <= 0) {
            return Proxy.newProxyInstance((ClassLoader) obj, (Class[]) obj2, (InvocationHandler) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3424(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((DefaultApkSignerEngine) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Type m3425(Object obj) {
        if (C0070.m5903() > 0) {
            return C$Gson$Types.canonicalize((Type) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠۟, reason: not valid java name and contains not printable characters */
    public static String m3426() {
        if (C0072.m6216() > 0) {
            return "Alg.Alias.Cipher.PBEWithHmacSHA224AndAES_128";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۦ, reason: not valid java name and contains not printable characters */
    public static int m3427(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((List) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ۠, reason: not valid java name and contains not printable characters */
    public static long m3428(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((JsonPrimitive) obj).getAsLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠۠, reason: not valid java name and contains not printable characters */
    public static List m3429(Object obj, Object obj2, int i) {
        if (C0063.m4427() > 0) {
            return ((PackageManager) obj).queryIntentActivities((Intent) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static void m3430(Object obj, Object obj2) {
        if (C0016.m717() <= 0) {
            ((C0361f2) obj).k((ScriptRecordType) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧۡۨ, reason: not valid java name and contains not printable characters */
    public static Pair m3432(Object obj, boolean z) {
        if (C0017.m846() >= 0) {
            return ApkSigningBlockUtils.generateApkSigningBlockPadding((DataSource) obj, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3433(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((O2) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m3434(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((JsonReader) obj).nextInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m3435(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((DialogC0385j0) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m3436(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((T2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m3437(Object obj) {
        if (C0078.m7450() > 0) {
            return ((WindowManager.LayoutParams) obj).flags;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۣ, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m3438() {
        if (C0078.m7450() > 0) {
            return SignatureAlgorithm.DSA_WITH_SHA256;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static long m3439(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((s5) obj).h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۡ, reason: not valid java name and contains not printable characters */
    public static TextView m3440(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((DialogC0421p0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۨ, reason: not valid java name and contains not printable characters */
    public static void m3441(Object obj, Object obj2) {
        if (C0030.m2940() >= 0) {
            ((LoadDrawableUtils) obj).initContext((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static Activity m3442(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((X1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static double m3443(Object obj) {
        return C0071.m6069() > 0 ? ((K0) obj).a : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۠۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m3444(Object obj) {
        if (C0021.m1598() < 0) {
            return ((O2) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m3445(Object obj, Object obj2, Object obj3) {
        if (C0018.m1064() > 0) {
            ((Canvas) obj).drawPath((android.graphics.Path) obj2, (Paint) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static void m3446(long j) throws InterruptedException {
        if (C0063.m4427() >= 0) {
            Thread.sleep(j);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static String m3447() {
        if (C0073.m6356() < 0) {
            return "OpenSSLSignature$SHA256RSAPSS";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۢۤ, reason: not valid java name and contains not printable characters */
    public static String m3448(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((X509Certificate) obj).getSigAlgOID();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m3449() {
        if (C0111.m13165() < 0) {
            return f138short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static int m3450() {
        return 1749820 ^ C0032.m3236((Object) "ۢۥۨ");
    }

    /* JADX INFO: renamed from: ۣۡۡ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3451() {
        if (C0023.m1921() > 0) {
            return ApkVerifier.Issue.V4_SIG_MALFORMED_CERTIFICATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static void m3452(Object obj, Object obj2) {
        if (C0111.m13165() < 0) {
            ((SigningCertificateLineage) obj).writeToDataSink((DataSink) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۢۥۧ, reason: not valid java name and contains not printable characters */
    public static List m3453(Object obj) {
        if (C0024.m2011() < 0) {
            return ((SourceStampVerifier.Result.SignerInfo) obj).getWarnings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static long m3454(Object obj, int i) {
        if (C0019.m1311() >= 0) {
            return ((ByteBuffer) obj).getLong(i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۧۡۢ, reason: not valid java name and contains not printable characters */
    public static int m3455(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((C0467x) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨ۠۠, reason: not valid java name and contains not printable characters */
    public static int m3456(Object obj) {
        if (C0017.m846() > 0) {
            return ((Q) obj).n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static TextView m3457(Object obj) {
        if (C0037.m3837() < 0) {
            return ((C4) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۧۦ, reason: not valid java name and contains not printable characters */
    public static int m3458(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((V3SchemeSigner) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۧ۠, reason: not valid java name and contains not printable characters */
    public static void m3459(double d) {
        if (C0069.m5781() < 0) {
            Gson.checkValidFloatingPoint(d);
        }
    }

    /* JADX INFO: renamed from: ۢۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m3460(Object obj, Object obj2) {
        if (C0026.m2298() < 0) {
            ((Map) obj).putAll((Map) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m3461(Object obj) {
        if (C0036.m3653() < 0) {
            ((C0357e5) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣۡۡۦ, reason: not valid java name and contains not printable characters */
    public static void m3462(Object obj, Object obj2) {
        if (C0076.m6903() < 0) {
            ((ApkSignerEngine) obj).inputApkSigningBlock((DataSource) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۣۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3463() {
        if (C0074.m6454() <= 0) {
            return ApkVerifier.Issue.V3_SIG_UNKNOWN_SIG_ALGORITHM;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۨ, reason: not valid java name and contains not printable characters */
    public static String m3464() {
        if (C0073.m6356() <= 0) {
            return "Alg.Alias.Mac.HMAC-SHA256";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static List m3465(Object obj) {
        if (C0031.m3075() >= 0) {
            return ApkVerifier.ApkVerificationIssueAdapter.getIssuesFromVerificationIssues((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m3466(Object obj, Object obj2) {
        if (C0073.m6356() < 0) {
            ((AutoClickContentBean) obj).setPlanName((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static void m3467(Object obj) {
        if (C0072.m6216() >= 0) {
            ((JsonReader) obj).beginArray();
        }
    }

    /* JADX INFO: renamed from: ۤۢۤۢ, reason: not valid java name and contains not printable characters */
    public static View m3468(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((U3) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۧۡ, reason: not valid java name and contains not printable characters */
    public static Date m3469(Object obj, Object obj2) {
        if (C0026.m2298() <= 0) {
            return ((SqlDateTypeAdapter) obj).read2((JsonReader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m3470(Object obj, Object obj2) {
        if (C0030.m2940() >= 0) {
            return ((UnsafeAllocator) obj).newInstance((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m3471(Object obj) {
        if (C0017.m846() >= 0) {
            return ((M4) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۨ, reason: not valid java name and contains not printable characters */
    public static int m3472(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((V4Signature.SigningInfo) obj).signatureAlgorithmId;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨۧۢ, reason: not valid java name and contains not printable characters */
    public static void m3473(Object obj, Object obj2, Object obj3) throws KeyStoreException {
        if (C0035.m3569() < 0) {
            ((KeyStore) obj).setCertificateEntry((String) obj2, (Certificate) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۡۧۦ, reason: contains not printable characters */
    public static Class m3474(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((TypeToken) obj).getRawType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۤۧ, reason: contains not printable characters */
    public static void m3475(Object obj, int i, Object obj2) {
        if (C0017.m846() > 0) {
            ((Activity) obj).setResult(i, (Intent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۨۤ, reason: contains not printable characters */
    public static void m3476(int i, Object obj, Object obj2, Object obj3) {
        if (C0111.m13165() <= 0) {
            V2SourceStampSigner.a(i, (Map) obj, (ApkSigningBlockUtils.SignerConfig) obj2, (ArrayList) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۣۨۨ, reason: contains not printable characters */
    public static String m3477() {
        if (C0068.m5678() > 0) {
            return "Alg.Alias.Cipher.RSA/None/OAEPPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۟ۡ, reason: contains not printable characters */
    public static List m3478(Object obj) {
        if (C0069.m5781() < 0) {
            return ((X509Certificate) obj).getExtendedKeyUsage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۡۤ, reason: contains not printable characters */
    public static void m3479(Object obj, Object obj2) {
        if (C0072.m6216() > 0) {
            ((U3) obj).setListener((T3) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۤۥۨ, reason: contains not printable characters */
    public static long m3480() {
        if (C0067.m5468() <= 0) {
            return AbstractC0446t2.d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۥۣۢ, reason: contains not printable characters */
    public static long m3481(Object obj) {
        if (C0069.m5781() < 0) {
            return Long.parseLong((String) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۥۧۥ, reason: contains not printable characters */
    public static String m3482() {
        if (C0037.m3837() <= 0) {
            return "<dname>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۨۨ, reason: contains not printable characters */
    public static void m3483(Object obj, Object obj2) {
        if (C0066.m4827() > 0) {
            ((Window) obj).setBackgroundDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۦۧۡ, reason: contains not printable characters */
    public static void m3484(Object obj, Object obj2, int i, int i2) {
        if (C0018.m1064() >= 0) {
            ((CRC32) obj).update((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۦۧۢ, reason: contains not printable characters */
    public static boolean m3485(Object obj) {
        if (C0066.m4827() >= 0) {
            return AbstractC0406m3.s((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۧۡ, reason: contains not printable characters */
    public static ImageView m3486(Object obj) {
        if (C0023.m1921() > 0) {
            return ((DialogC0421p0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۢ, reason: contains not printable characters */
    public static void m3487(Object obj, Object obj2, Object obj3) {
        if (C0030.m2940() > 0) {
            V3SchemeVerifier.parseSigners((ByteBuffer) obj, (Set) obj2, (ApkSigningBlockUtils.Result) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۦۥ, reason: contains not printable characters */
    public static File m3488(Object obj) {
        if (C0017.m846() >= 0) {
            return AbstractC0390k.f((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۤ۠, reason: contains not printable characters */
    public static void m3489(Object obj, Object obj2, boolean z) {
        if (C0036.m3653() <= 0) {
            ((DialogC0472x4) obj).a((ScriptProjectBean) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۦۡۨ۟, reason: contains not printable characters */
    public static void m3490(Object obj, Object obj2) {
        if (C0018.m1064() > 0) {
            ((ThreadPoolExecutor) obj).execute((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۤۤ, reason: contains not printable characters */
    public static Boolean m3491(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((DefaultApkSignerEngine) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡۥ, reason: contains not printable characters */
    public static JsonWriter m3492(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((JsonWriter) obj).nullValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۤۧ, reason: contains not printable characters */
    public static String m3493() {
        if (C0036.m3653() <= 0) {
            return "Keystore.provider.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۡۦ, reason: contains not printable characters */
    public static MessageDigest m3494() {
        if (C0075.m6893() >= 0) {
            return AbstractC0449u.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۨۨ, reason: contains not printable characters */
    public static ScriptRecordType m3495(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((C4) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ۟ۧ, reason: contains not printable characters */
    public static void m3496(Object obj, Object obj2) {
        if (C0018.m1064() >= 0) {
            ((RunnablesExecutor) obj).execute((RunnablesProvider) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static Z0 m3497(Object obj) {
        if (C0025.m2132() > 0) {
            return ((AbstractC0416o1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m3498(Object obj) {
        if (C0018.m1064() >= 0) {
            return C0024.m2042(0, false, 2, new byte[][]{C0020.m1333((BigInteger) obj)});
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3499(Object obj) {
        if (C0039.m4109() > 0) {
            return ((C0350d5) obj).g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥۡۥ, reason: not valid java name and contains not printable characters */
    public static int m3500(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((V3SigningCertificateLineage.SigningCertificateNode) obj).flags;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۤۡ, reason: not valid java name and contains not printable characters */
    public static ObjectIdentifier m3501(Object obj) {
        if (C0016.m717() <= 0) {
            return ((PKCS10Attribute) obj).getAttributeId();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۢۦ, reason: not valid java name and contains not printable characters */
    public static String m3502() {
        if (C0019.m1311() == 0) {
            return "issuer.dname";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۥ۠, reason: not valid java name and contains not printable characters */
    public static void m3503(Object obj, boolean z) {
        if (C0033.m3358() < 0) {
            ((Calendar) obj).setLenient(z);
        }
    }

    /* JADX INFO: renamed from: ۣۧۨۦ, reason: not valid java name and contains not printable characters */
    public static void m3504(Object obj, int i) {
        if (C0075.m6893() > 0) {
            ((AutoClickPointerBean) obj).setClickTime(i);
        }
    }

    /* JADX INFO: renamed from: ۧۨۥ۠, reason: not valid java name and contains not printable characters */
    public static Point m3505(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((P) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m3506(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((ContentDigestAlgorithm) obj).getChunkDigestOutputSizeBytes();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static long m3507(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((RandomAccessFileDataSink) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۦۨۡ, reason: not valid java name and contains not printable characters */
    public static Object m3508(Object obj) {
        if (C0078.m7450() > 0) {
            return ((RunnableC0353e1) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۢ, reason: not valid java name and contains not printable characters */
    public static void m3509(Object obj, int i) {
        if (C0067.m5468() < 0) {
            ((View) obj).setId(i);
        }
    }

    /* JADX INFO: renamed from: ۨۨۨۥ, reason: not valid java name and contains not printable characters */
    public static List m3510(Object obj) {
        if (C0027.m2460() > 0) {
            return ((ApkVerifier.Result.V1SchemeSignerInfo) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥ۠, reason: not valid java name and contains not printable characters */
    public static String m3431(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
