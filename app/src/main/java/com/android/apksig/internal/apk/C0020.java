package com.android.apksig.internal.apk;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
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
import com.android.apksig.apk.ApkUtilsLite;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.V2SourceStampVerifier;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v2.V2SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SigningCertificateLineage;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.FileChannelDataSource;
import com.android.apksig.internal.util.InclusiveIntRange;
import com.android.apksig.internal.util.X509CertificateUtils;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipSections;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickContentBean;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptActionBean;
import com.joke.script.bean.ScriptJumpBean;
import com.joke.script.bean.ScriptProjectBean;
import com.joke.script.bean.ScriptRecordBean;
import com.zfork.entry.C0075;
import com.zfork.entry.MetaSelectAppAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A1;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.AbstractC0400l3;
import com.zfork.multiplatforms.android.bomb.B1;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0330b;
import com.zfork.multiplatforms.android.bomb.C0334b3;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0362f3;
import com.zfork.multiplatforms.android.bomb.C0376h3;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0388j3;
import com.zfork.multiplatforms.android.bomb.C0397l0;
import com.zfork.multiplatforms.android.bomb.C0402m;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0450u0;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C0483z3;
import com.zfork.multiplatforms.android.bomb.C1;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0359f0;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.E;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.F2;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.I4;
import com.zfork.multiplatforms.android.bomb.InterfaceC0477y3;
import com.zfork.multiplatforms.android.bomb.J4;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.O0;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q3;
import com.zfork.multiplatforms.android.bomb.U0;
import com.zfork.multiplatforms.android.bomb.U1;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.V4;
import com.zfork.multiplatforms.android.bomb.X;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.s5;
import com.zfork.multiplatforms.android.bomb.t5;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.URL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Signature;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.spec.AlgorithmParameterSpec;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.Vector;
import java.util.zip.CRC32;
import org.conscrypt.C0111;
import sun.security.util.PathList;

/* JADX INFO: renamed from: com.android.apksig.internal.apk.ۦۥۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0020 {

    /* JADX INFO: renamed from: ۣۢۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean f80 = true;

    /* JADX INFO: renamed from: ۟۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m1321(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((Bitmap) obj).getWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static Intent m1322(Object obj, int i) {
        if (C0030.m2940() > 0) {
            return ((Intent) obj).addFlags(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine m1323(Object obj) {
        if (C0078.m7450() > 0) {
            return ((DefaultApkSignerEngine.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۥۧ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m1324(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).getSigningCertificateLineage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m1325(Object obj) {
        if (C0017.m846() >= 0) {
            return ((C0362f3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static URL m1326(Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            return ((ClassLoader) obj).getResource((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m1327(Object obj) {
        if (C0037.m3837() <= 0) {
            ((C0479z) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static MethodHandles.Lookup m1328() {
        if (C0067.m5468() < 0) {
            return MethodHandles.lookup();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m1329(Object obj) {
        if (C0017.m846() >= 0) {
            return ((C0450u0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۧ۠, reason: not valid java name and contains not printable characters */
    public static AlgorithmParameterSpec m1330(Object obj) {
        if (C0016.m717() < 0) {
            return ((J4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static void m1331(Object obj) {
        if (C0031.m3075() > 0) {
            ((C0479z) obj).j();
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static long m1332(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((CentralDirectoryRecord) obj).f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m1333(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((BigInteger) obj).toByteArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m1334() {
        if (C0024.m2011() < 0) {
            return "alias.has.no.public.key";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static TimeZone m1335(Object obj) {
        if (C0077.m7272() <= 0) {
            return DesugarTimeZone.getTimeZone((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m1336(Object obj, Object obj2) {
        if (C0071.m6069() >= 0) {
            ((K0) obj).setBgDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ClassLoader m1337(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((Class) obj).getClassLoader();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static void m1338(Object obj) {
        if (C0073.m6356() <= 0) {
            ((Dialog) obj).dismiss();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static LocalFileRecord m1339(Object obj, Object obj2, long j) {
        if (C0025.m2132() >= 0) {
            return LocalFileRecord.getRecord((DataSource) obj, (CentralDirectoryRecord) obj2, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۡۡ, reason: not valid java name and contains not printable characters */
    public static MetaSelectAppAbility m1340(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((C0334b3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۤ, reason: not valid java name and contains not printable characters */
    public static String m1341(double d) {
        if (C0078.m7450() >= 0) {
            return String.valueOf(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static File m1342() {
        if (C0018.m1064() >= 0) {
            return o5.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static ClassLoader m1343(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((C0388j3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m1344(Object obj, Object obj2) {
        if (C0078.m7450() > 0) {
            return ((String) obj).getBytes((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m1345(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).getIndex();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m1346(Object obj) {
        if (C0026.m2298() < 0) {
            return ((s5) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static N2 m1347() {
        if (C0035.m3569() < 0) {
            return N2.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1348(Object obj) {
        if (C0017.m846() >= 0) {
            return ((ApkSigner) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m1349(Object obj) {
        if (C0019.m1311() == 0) {
            return ((C1) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۤ, reason: not valid java name and contains not printable characters */
    public static void m1350(Object obj) {
        if (C0069.m5781() <= 0) {
            ((AutoClickPlanBean) obj).removeAllPointer();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۢ, reason: not valid java name and contains not printable characters */
    public static int m1351(Object obj) {
        if (C0019.m1311() == 0) {
            return ((AndroidBinXmlParser) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static ShapeDrawable m1352(Object obj, int i) {
        if (C0030.m2940() > 0) {
            return DialogC0373h0.a((Activity) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۢ, reason: not valid java name and contains not printable characters */
    public static void m1353(Object obj, boolean z) {
        if (C0068.m5678() >= 0) {
            ((JsonWriter) obj).setLenient(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۥ۟, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m1354(Object obj, int i, int i2) {
        if (C0030.m2940() > 0) {
            return C0019.m1199((ByteBuffer) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤ۠, reason: not valid java name and contains not printable characters */
    public static String m1355() {
        if (C0034.m3450() >= 0) {
            return "What.is.the.name.of.your.State.or.Province.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۢ, reason: not valid java name and contains not printable characters */
    public static String m1356() {
        if (C0034.m3450() >= 0) {
            return "Software";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1357(Object obj, Object obj2) {
        if (C0067.m5468() <= 0) {
            return ((BigInteger) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static String m1358(char c) {
        if (C0065.m4647() >= 0) {
            return String.valueOf(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static N2 m1359() {
        if (C0019.m1311() == 0) {
            return N2.l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static ApkUtilsLite.ApkSigningBlock m1360(Object obj, Object obj2) {
        if (C0031.m3075() > 0) {
            return ApkUtilsLite.findApkSigningBlock((DataSource) obj, (ZipSections) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1361() {
        if (C0021.m1598() <= 0) {
            return ApkVerifier.Issue.V3_SIG_VERIFY_EXCEPTION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static long m1362(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((U0) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1363(Object obj) {
        if (C0029.m2791() > 0) {
            return ((K0) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m1364(Object obj) {
        if (C0075.m6893() > 0) {
            return V3SigningCertificateLineage.encodeSigningCertificateLineage((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1365(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((U3) obj).y;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧۧ, reason: not valid java name and contains not printable characters */
    public static String m1366() {
        if (C0016.m717() <= 0) {
            return "What.is.the.name.of.your.City.or.Locality.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static List m1367(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((V1SchemeVerifier.Result) obj).getErrors();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m1368(Object obj, Object obj2, Object obj3) {
        if (C0019.m1311() >= 0) {
            ((O2) obj).i((String) obj2, (PrintStream) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m1369(Object obj) {
        if (C0074.m6454() < 0) {
            return ((InclusiveIntRange) obj).getMin();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static X509Certificate m1370(Object obj) {
        if (C0037.m3837() < 0) {
            return X509CertificateUtils.generateCertificate((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1371(Object obj) {
        if (C0019.m1311() == 0) {
            return ((AbstractC0384j) obj).n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m1372(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((V1SchemeVerifier.Result.SignerInfo) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m1373() {
        if (C0026.m2298() <= 0) {
            return V1SchemeVerifier.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1374(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0025.m2132() >= 0) {
            return ((MetaSelectAppAbility) obj).a((ApplicationInfo) obj2, (String) obj3, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static ScriptActionBean m1375(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((ScriptRecordBean) obj).scriptActionBean;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m1376(Object obj) {
        if (C0064.m4578() > 0) {
            return ((V4Signature.SigningInfos) obj).toByteArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static long m1377(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((t5) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1378(Object obj, Object obj2) {
        if (C0063.m4427() > 0) {
            return PathList.appendPath((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟۠, reason: not valid java name and contains not printable characters */
    public static void m1379(Object obj) {
        if (C0068.m5678() > 0) {
            ((O0) obj).l();
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1380(Object obj) {
        if (C0077.m7272() < 0) {
            return ((I4) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦ, reason: not valid java name and contains not printable characters */
    public static File m1381() {
        if (C0074.m6454() < 0) {
            return AbstractC0400l3.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧ۠, reason: not valid java name and contains not printable characters */
    public static String m1382(Object obj) {
        if (C0072.m6216() > 0) {
            return ((CharSequence) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨ, reason: not valid java name and contains not printable characters */
    public static String m1383(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۥۧۦ, reason: not valid java name and contains not printable characters */
    public static int m1384(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((ViewGroup) obj).getChildCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۢ, reason: not valid java name and contains not printable characters */
    public static int m1385() {
        return (-56364) ^ C0032.m3236((Object) "ۡ۠");
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static B1 m1386(Object obj) {
        if (C0019.m1311() == 0) {
            return ((A1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۦ۠, reason: not valid java name and contains not printable characters */
    public static String m1387() {
        if (C0075.m6893() >= 0) {
            return "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۢ, reason: not valid java name and contains not printable characters */
    public static String m1388() {
        if (C0025.m2132() > 0) {
            return "OpenSSLRSAPrivateKey|java.security.interfaces.RSAPrivateKey|";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1389(Object obj) {
        if (C0070.m5903() > 0) {
            return ((ApkSigner.SignerConfig.Builder) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۨۤ۠, reason: not valid java name and contains not printable characters */
    public static List m1390(Object obj) {
        if (C0017.m846() > 0) {
            return M4.d((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m1391(long j, long j2, long j3) {
        if (C0075.m6893() >= 0) {
            FileChannelDataSource.a(j, j2, j3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.SigningSchemeBlockAndDigests m1392(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, Object obj6) {
        if (C0072.m6216() >= 0) {
            return V2SchemeSigner.generateApkSignatureSchemeV2Block((RunnablesExecutor) obj, (DataSource) obj2, (DataSource) obj3, (DataSource) obj4, (List) obj5, z, (List) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m1393(Object obj) {
        if (C0075.m6893() > 0) {
            return ByteBuffer.wrap((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m1394(Object obj, float f, float f2) {
        if (C0077.m7272() < 0) {
            ((Canvas) obj).translate(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m1395(int i) {
        if (C0038.m4010() > 0) {
            return K3.a(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m1396(Object obj) {
        if (C0016.m717() <= 0) {
            return ((V4Signature.HashingInfo) obj).salt;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m1397(Object obj, float f, float f2, float f3, Object obj2) {
        if (C0021.m1598() <= 0) {
            ((Canvas) obj).drawCircle(f, f2, f3, (Paint) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۤۦ, reason: not valid java name and contains not printable characters */
    public static void m1398(Object obj, int i, int i2, int i3, int i4) {
        if (C0028.m2593() > 0) {
            ((Drawable) obj).setBounds(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۦۢ, reason: not valid java name and contains not printable characters */
    public static CRC32 m1399(Object obj) {
        if (C0027.m2460() > 0) {
            return ((E5) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1400() {
        if (C0032.m3184() <= 0) {
            return ApkVerifier.Issue.V3_MISSING_SDK_VERSIONS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static SeekBar m1401(Object obj) {
        if (C0017.m846() > 0) {
            return ((DialogC0359f0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static OutputStream m1402(Object obj, Object obj2) {
        if (C0065.m4647() > 0) {
            return ((ContentResolver) obj).openOutputStream((Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1403() {
        if (C0069.m5781() < 0) {
            return E.c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m1404(Object obj) {
        if (C0064.m4578() > 0) {
            return ((C0376h3) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۨۡ, reason: not valid java name and contains not printable characters */
    public static Buffer m1405(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((ByteBuffer) obj).clear();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۢ۟, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m1406(Object obj, Object obj2) {
        if (C0016.m717() <= 0) {
            return ((ApkSigner.Builder) obj).setOutputApk((File) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static TextView m1407(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((U1) obj).getTvCancel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۢۧ, reason: not valid java name and contains not printable characters */
    public static InputStream m1408(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((Q3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m1409(Object obj) {
        if (C0076.m6903() < 0) {
            return ((Signature) obj).sign();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۡۢ, reason: not valid java name and contains not printable characters */
    public static int m1410(int i) {
        if (C0018.m1064() >= 0) {
            return C0330b.b(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۢ۟, reason: not valid java name and contains not printable characters */
    public static Collection m1411(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((HashMap) obj).values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۤ, reason: not valid java name and contains not printable characters */
    public static void m1412(Object obj, long j) {
        if (C0111.m13165() <= 0) {
            C0387j2.p((RandomAccessFile) obj, j);
        }
    }

    /* JADX INFO: renamed from: ۢۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1413(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((DefaultApkSignerEngine) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m1414(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((ByteBuffer) obj).arrayOffset();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static Charset m1415() {
        if (C0037.m3837() < 0) {
            return StandardCharsets.UTF_16LE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static V3SchemeSigner.Builder m1416(Object obj, Object obj2) {
        if (C0071.m6069() > 0) {
            return ((V3SchemeSigner.Builder) obj).setRunnablesExecutor((RunnablesExecutor) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean[] m1417(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((X509Certificate) obj).getKeyUsage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۨ, reason: not valid java name and contains not printable characters */
    public static String m1418(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((ApkVerifier.Result.V1SchemeSignerInfo) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۠۟, reason: not valid java name and contains not printable characters */
    public static long m1419(Object obj) {
        if (m1385() < 0) {
            return ((FileChannelDataSource) obj).size();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۦۥ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m1420(Object obj) {
        if (C0077.m7272() < 0) {
            return ((ApkVerifier.Result) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۦۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m1421(Object obj) {
        if (C0073.m6356() <= 0) {
            return V2SourceStampVerifier.a((Map) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static String m1422(Object obj, Object obj2, Object obj3) {
        if (C0019.m1311() == 0) {
            return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static InterfaceC0477y3 m1423(Object obj) {
        if (C0023.m1921() > 0) {
            return ((C0444t0) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۧۥ, reason: not valid java name and contains not printable characters */
    public static ApkSignerEngine m1424(Object obj) {
        if (C0021.m1598() < 0) {
            return ((ApkSigner.Builder) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m1425(Object obj) {
        if (C0077.m7272() < 0) {
            return ((C0397l0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۥۧ, reason: not valid java name and contains not printable characters */
    public static DateFormat m1426(int i, int i2) {
        if (C0033.m3358() <= 0) {
            return DateFormat.getDateTimeInstance(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۟۟, reason: not valid java name and contains not printable characters */
    public static void m1427(Object obj, Object obj2, Object obj3) {
        if (C0029.m2791() >= 0) {
            ApkVerifier.Result.V2SchemeSignerInfo.access$500((ApkVerifier.Result.V2SchemeSignerInfo) obj, (ApkVerifier.Issue) obj2, (Object[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۤۦۢۢ, reason: not valid java name and contains not printable characters */
    public static int m1428(Object obj, Object obj2) {
        if (C0072.m6216() > 0) {
            return ((BaseBundle) obj).getInt((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۧ۠, reason: not valid java name and contains not printable characters */
    public static void m1429(Object obj, Object obj2, Object obj3) {
        if (C0074.m6454() <= 0) {
            ((C0483z3) obj).c((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۠ۧ, reason: contains not printable characters */
    public static SigningCertificateLineage m1430(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((ApkSigner.SignerConfig) obj).getSigningCertificateLineage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣ۠, reason: contains not printable characters */
    public static Type m1431(Object obj) {
        if (C0076.m6903() < 0) {
            return ((Field) obj).getGenericType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۥۣ, reason: contains not printable characters */
    public static ImageView m1432(Object obj) {
        if (C0069.m5781() < 0) {
            return ((I1) obj).getIvStartOrStop();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤ۟, reason: contains not printable characters */
    public static ScriptProjectBean m1433(Object obj, long j) {
        if (C0017.m846() >= 0) {
            return o5.k((Context) obj, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۡ, reason: contains not printable characters */
    public static boolean m1434(Object obj, Object obj2) {
        if (C0065.m4647() > 0) {
            return ((Set) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۧۥۡ, reason: contains not printable characters */
    public static String m1435() {
        if (C0031.m3075() > 0) {
            return "AES_128/GCM-SIV/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۢۡ, reason: contains not printable characters */
    public static int m1436(int i, int i2) {
        if (C0021.m1598() < 0) {
            return Integer.compare(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۡ۠, reason: contains not printable characters */
    public static Buffer m1437(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((ByteBuffer) obj).flip();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۥۧ, reason: contains not printable characters */
    public static ScriptJumpBean m1438(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((C4) obj).L;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۦ۠, reason: contains not printable characters */
    public static void m1439(Object obj, boolean z) {
        if (C0021.m1598() < 0) {
            ((Dialog) obj).setCanceledOnTouchOutside(z);
        }
    }

    /* JADX INFO: renamed from: ۦۦۤۢ, reason: contains not printable characters */
    public static int m1440(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((ScriptActionBean) obj).shifting;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۢۢ, reason: contains not printable characters */
    public static boolean m1441(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((X509Extension) obj).hasUnsupportedCriticalExtension();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۧۢ, reason: contains not printable characters */
    public static float m1442(Object obj) {
        if (C0017.m846() > 0) {
            return ((B1) obj).h;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۨۤۥ, reason: contains not printable characters */
    public static Shader.TileMode m1444() {
        if (C0033.m3358() <= 0) {
            return Shader.TileMode.REPEAT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m1445(Object obj) {
        if (C0029.m2791() > 0) {
            return ((F2) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۢۥ, reason: not valid java name and contains not printable characters */
    public static void m1446(Object obj, boolean z) {
        if (C0070.m5903() > 0) {
            ((C0361f2) obj).j(z);
        }
    }

    /* JADX INFO: renamed from: ۧۢۦۡ, reason: not valid java name and contains not printable characters */
    public static C0402m m1447(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((D5) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۨۧ, reason: not valid java name and contains not printable characters */
    public static void m1448(Object obj, int i) {
        if (C0076.m6903() < 0) {
            ((AutoClickContentBean) obj).setLoopInterval(i);
        }
    }

    /* JADX INFO: renamed from: ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static View m1449(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((View) obj).getRootView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m1450() {
        if (C0065.m4647() >= 0) {
            return "Too.many.failures.try.later";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۥۡ, reason: not valid java name and contains not printable characters */
    public static void m1451(Object obj, Object obj2) {
        if (C0025.m2132() > 0) {
            ((ProgressBar) obj).setProgressDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static V4 m1452(Object obj) {
        if (C0031.m3075() > 0) {
            return ((X) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۨ, reason: not valid java name and contains not printable characters */
    public static ListView m1453(Object obj) {
        if (C0075.m6893() > 0) {
            return ((C4) obj).s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۨۡ, reason: not valid java name and contains not printable characters */
    public static int m1454(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((Vector) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۣۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1455(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((C0362f3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۢ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m1456(long j, Object obj, Object obj2) {
        if (C0024.m2011() < 0) {
            return V4Signature.getSignedData(j, (V4Signature.HashingInfo) obj, (V4Signature.SigningInfo) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1457() {
        if (C0039.m4109() >= 0) {
            return ApkVerifier.Issue.V4_SIG_NO_SIGNATURES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۤ۟, reason: contains not printable characters */
    public static String m1443(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
