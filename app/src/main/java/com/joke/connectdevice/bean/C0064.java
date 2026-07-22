package com.joke.connectdevice.bean;

import android.animation.ValueAnimator;
import android.app.Application;
import android.content.UriPermission;
import android.content.pm.ApplicationInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.SearchView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.ApkUtilsLite;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.a;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.V2SourceStampSigner;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.asn1.Asn1TagClass;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.jar.ManifestWriter;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.oid.OidConstants;
import com.android.apksig.internal.pkcs7.AlgorithmIdentifier;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.InclusiveIntRange;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSinks;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipSections;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptRecordType;
import com.joke.script.bean.ScriptState;
import com.joke.speedfloatingball.bean.CloudBean;
import com.zfork.entry.C0075;
import com.zfork.entry.SignatureCreatorAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.AbstractC0325a1;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0449u;
import com.zfork.multiplatforms.android.bomb.B3;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0392k1;
import com.zfork.multiplatforms.android.bomb.C0450u0;
import com.zfork.multiplatforms.android.bomb.C0469x1;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C1;
import com.zfork.multiplatforms.android.bomb.C3;
import com.zfork.multiplatforms.android.bomb.C5;
import com.zfork.multiplatforms.android.bomb.D1;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.E4;
import com.zfork.multiplatforms.android.bomb.G2;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.RunnableC0353e1;
import com.zfork.multiplatforms.android.bomb.S1;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.V;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0436r4;
import com.zfork.multiplatforms.android.bomb.ViewOnLongClickListenerC0339c1;
import com.zfork.multiplatforms.android.bomb.ViewOnTouchListenerC0481z1;
import com.zfork.multiplatforms.android.bomb.W;
import com.zfork.multiplatforms.android.bomb.Y;
import com.zfork.multiplatforms.android.bomb.Y4;
import com.zfork.multiplatforms.android.bomb.Z;
import com.zfork.multiplatforms.android.bomb.Z0;
import com.zfork.multiplatforms.android.bomb.l5;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.q5;
import com.zfork.multiplatforms.android.bomb.s5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.Supplier;
import java.util.jar.Attributes;
import java.util.regex.Pattern;
import org.conscrypt.C0111;
import sun.security.util.ObjectIdentifier;
import sun.security.x509.KeyUsageExtension;

/* JADX INFO: renamed from: com.joke.connectdevice.bean.۟۠ۨۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0064 {

    /* JADX INFO: renamed from: ۥۦۣۡ, reason: contains not printable characters */
    public static boolean f150 = true;

    /* JADX INFO: renamed from: ۟۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String m4493() {
        if (C0035.m3569() <= 0) {
            return "No.certificate.from.the.SSL.server";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static ApkSignerEngine.InspectJarEntryRequest m4494(Object obj, Object obj2) {
        if (C0071.m6069() >= 0) {
            return ((ApkSignerEngine) obj).outputJarEntry((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static String m4495(Object obj) {
        if (C0074.m6454() < 0) {
            return ((O2) obj).R;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m4496() {
        if (C0017.m846() >= 0) {
            return TypeAdapters.CURRENCY_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m4497() {
        if (C0063.m4427() > 0) {
            return "AES/ECB/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static CloudBean m4498(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((C0469x1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۡ۠, reason: not valid java name and contains not printable characters */
    public static V m4499(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((W) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.ChunkSupplier m4500(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((a) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4501(Object obj) {
        if (C0078.m7450() > 0) {
            return ((Y4) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static Object m4502(Object obj) {
        if (C0066.m4827() > 0) {
            return ((RunnableC0353e1) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static Path m4503(Object obj) {
        if (C0018.m1064() > 0) {
            return ((Path) obj).getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m4504(Object obj) {
        if (C0032.m3184() < 0) {
            return ((DefaultApkSignerEngine) obj).y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static void m4505(Object obj) throws IOException {
        if (C0020.m1385() <= 0) {
            ((Writer) obj).flush();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static Runtime m4506() {
        if (C0019.m1311() == 0) {
            return Runtime.getRuntime();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m4507(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((Y) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static String m4508() {
        if (C0077.m7272() <= 0) {
            return "SHA384withECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۤ۠, reason: not valid java name and contains not printable characters */
    public static int m4509(Object obj) {
        if (C0036.m3653() < 0) {
            return ((StringBuilder) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static String m4510(Object obj) {
        if (C0077.m7272() < 0) {
            return AlgorithmIdentifier.getJcaDigestAlgorithm((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static FrameLayout.LayoutParams m4511(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((U3) obj).s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۨۢ, reason: not valid java name and contains not printable characters */
    public static String m4512(Object obj) {
        if (C0039.m4109() > 0) {
            return ((JsonReader) obj).getPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m4513(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((ApkVerifier) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m4514(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((Method) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۢ۠, reason: not valid java name and contains not printable characters */
    public static List m4515(Object obj) {
        if (C0063.m4427() > 0) {
            return ((DefaultApkSignerEngine.Builder) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static byte m4516(Object obj) {
        if (C0069.m5781() < 0) {
            return ((C0350d5) obj).c;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۣ, reason: not valid java name and contains not printable characters */
    public static int m4517(Object obj, Object obj2) {
        if (C0029.m2791() > 0) {
            return ((ArrayList) obj).lastIndexOf(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۥ, reason: not valid java name and contains not printable characters */
    public static int m4518(Object obj) {
        if (C0077.m7272() < 0) {
            return ((Z) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4519(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((SourceStampVerifier.Result) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4520(Object obj) {
        if (C0018.m1064() >= 0) {
            return Files.deleteIfExists((Path) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥۦ, reason: not valid java name and contains not printable characters */
    public static void m4521(Object obj, Object obj2, int i) {
        if (C0038.m4010() > 0) {
            ((DefaultApkSignerEngine) obj).f((List) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۣ, reason: not valid java name and contains not printable characters */
    public static void m4522(Object obj, Object obj2, Object obj3) {
        if (C0037.m3837() <= 0) {
            ((ViewManager) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۥ, reason: not valid java name and contains not printable characters */
    public static void m4523(Object obj) {
        if (C0037.m3837() <= 0) {
            ((ApkSignerEngine) obj).outputDone();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨۡۢ, reason: not valid java name and contains not printable characters */
    public static Set m4524(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((Map) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4525(Object obj, Object obj2) {
        if (C0067.m5468() <= 0) {
            return ((HashSet) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static Object m4526(Object obj, int i) {
        if (C0075.m6893() > 0) {
            return ((ArrayList) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static s5 m4527(Object obj) {
        if (C0076.m6903() < 0) {
            return ((D5) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static Set m4528(Object obj, long j, Object obj2, Object obj3, Object obj4, int i, int i2, Object obj5) {
        if (C0111.m13165() < 0) {
            return V1SchemeVerifier.access$700((DataSource) obj, j, (Collection) obj2, (Map) obj3, (List) obj4, i, i2, (V1SchemeVerifier.Result) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m4529(Object obj) {
        if (C0070.m5903() > 0) {
            ((AbstractC0325a1) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static int m4530(Object obj) {
        if (C0078.m7450() > 0) {
            return ((C0361f2) obj).H;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4531(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((UriPermission) obj).isWritePermission();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m4532() {
        if (C0018.m1064() > 0) {
            return TypeAdapters.INET_ADDRESS_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4533(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((q5) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4534(Object obj, Object obj2) {
        if (C0035.m3569() <= 0) {
            return ((TypeToken) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4535() {
        if (C0020.m1385() < 0) {
            return ApkVerifier.Issue.JAR_SIG_NO_SIGNATURES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static Iterator m4536(Object obj) {
        if (C0072.m6216() > 0) {
            return m4592((DirectoryStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.SignerConfig m4537(Object obj) {
        if (C0063.m4427() > 0) {
            return ((DefaultApkSignerEngine) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.Builder m4538(Object obj, boolean z) {
        if (C0065.m4647() >= 0) {
            return ((DefaultApkSignerEngine.Builder) obj).setDebuggableApkPermitted(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static long m4539(Object obj) {
        if (C0067.m5468() < 0) {
            return ((C3) obj).b();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۡۧ۟, reason: not valid java name and contains not printable characters */
    public static String m4540(Object obj) {
        if (C0025.m2132() > 0) {
            return ((Signature) obj).toCharsString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static ValueAnimator m4541(Object obj, long j) {
        if (C0074.m6454() <= 0) {
            return ((ValueAnimator) obj).setDuration(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۨ, reason: not valid java name and contains not printable characters */
    public static void m4542(Object obj, Object obj2) {
        if (C0076.m6903() < 0) {
            ((SearchView) obj).setOnQueryTextListener((SearchView.OnQueryTextListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۧ, reason: not valid java name and contains not printable characters */
    public static String m4543() {
        if (C0026.m2298() <= 0) {
            return "Unknown.password.type.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m4544(Object obj, Object obj2, int i, int i2) {
        if (C0030.m2940() >= 0) {
            return ((Z0) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۢ, reason: not valid java name and contains not printable characters */
    public static char[] m4546(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((O2) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static FileVisitResult m4547(Object obj, Object obj2) {
        if (C0073.m6356() < 0) {
            return ((l5) obj).a((Path) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦۥ, reason: not valid java name and contains not printable characters */
    public static FileVisitResult m4548() {
        if (C0078.m7450() >= 0) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۢ, reason: not valid java name and contains not printable characters */
    public static String m4549(Object obj) {
        if (C0066.m4827() > 0) {
            return ((ManifestParser.Section) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Pattern m4550() {
        if (C0025.m2132() >= 0) {
            return C0350d5.k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۢۡ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m4551(Object obj) {
        if (C0036.m3653() < 0) {
            return ((Asn1OpaqueObject) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۨ, reason: not valid java name and contains not printable characters */
    public static T1 m4552(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((S1) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4553() {
        if (C0021.m1598() <= 0) {
            return ApkVerifier.Issue.V3_SIG_NO_SIGNATURES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣ۟, reason: not valid java name and contains not printable characters */
    public static DataSink m4554(Object obj) {
        if (C0065.m4647() >= 0) {
            return DataSinks.asDataSink((RandomAccessFile) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ۠, reason: not valid java name and contains not printable characters */
    public static List m4555(Object obj, Object obj2) {
        if (C0037.m3837() <= 0) {
            return OidConstants.getSigAlgSupportedApiLevels((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۧ, reason: not valid java name and contains not printable characters */
    public static ZipSections m4556(Object obj) {
        if (C0017.m846() > 0) {
            return ApkUtilsLite.findZipSections((DataSource) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m4557(Object obj, Object obj2) {
        if (C0023.m1921() > 0) {
            return ((TypeAdapter) obj).read((JsonReader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4558() {
        if (C0069.m5781() <= 0) {
            return C0.N;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m4559() {
        if (C0065.m4647() >= 0) {
            return "Alg.Alias.Cipher.RSA/None/OAEPWithSHA-512AndMGF1Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۡۡ, reason: not valid java name and contains not printable characters */
    public static Pair m4560(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((ApkSigningBlockUtils.SigningSchemeBlockAndDigests) obj).signingSchemeBlock;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۧ, reason: not valid java name and contains not printable characters */
    public static long m4561(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((C0392k1) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static SignatureCreatorAbility m4562(Object obj) {
        if (C0016.m717() <= 0) {
            return ((E4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥ۟, reason: not valid java name and contains not printable characters */
    public static int m4563(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((InclusiveIntRange) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m4564(Object obj) {
        if (C0075.m6893() > 0) {
            return ((ApkSignerEngine) obj).generateSourceStampCertificateDigest();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m4565(Object obj, int i) {
        if (C0025.m2132() >= 0) {
            V4Signature.writeIntLE((OutputStream) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m4566(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((ByteBuffer) obj).getInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static void m4567(Object obj, Object obj2) {
        if (C0032.m3184() < 0) {
            ((Application) obj).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static CheckBox m4568(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((C0351e) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static int m4569(Object obj, int i, int i2) {
        if (C0072.m6216() >= 0) {
            return ((String) obj).indexOf(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static void m4570(Object obj) {
        if (C0037.m3837() < 0) {
            ((ArrayList) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۠ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4571(Object obj) {
        if (C0037.m3837() < 0) {
            return ((DialogC0385j0) obj).s;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m4572(Object obj) {
        if (C0073.m6356() < 0) {
            return ((ApplicationInfo) obj).flags;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static View m4573(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((ViewOnTouchListenerC0481z1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m4574() {
        if (C0018.m1064() > 0) {
            return "DSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static int m4575(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((InputStream) obj).available();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static List m4576(Object obj) {
        if (C0063.m4427() > 0) {
            return ((ApkVerifier.Result.V1SchemeSignerInfo) obj).getWarnings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static ScriptRecordType m4577(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((DialogC0389j4) obj).t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۠۟, reason: not valid java name and contains not printable characters */
    public static int m4578() {
        return 1750720 ^ C0032.m3236((Object) "ۣۧ۟");
    }

    /* JADX INFO: renamed from: ۡۥۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4579(char c) {
        if (C0071.m6069() > 0) {
            return Character.isWhitespace(c);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Object m4580(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((C0479z) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static Asn1TagClass m4581() {
        if (C0073.m6356() <= 0) {
            return Asn1TagClass.PRIVATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4582(Object obj) {
        if (C0073.m6356() <= 0) {
            return C0019.m1243((V2SourceStampSigner.Builder) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4583(Object obj, Object obj2) {
        if (C0032.m3184() <= 0) {
            return ((ResourceBundle) obj).containsKey((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦۨۨ, reason: not valid java name and contains not printable characters */
    public static void m4584(Object obj, int i) {
        if (C0068.m5678() > 0) {
            ((AutoClickPointerBean) obj).setOffset(i);
        }
    }

    /* JADX INFO: renamed from: ۡۧۡۤ, reason: not valid java name and contains not printable characters */
    public static String m4585() {
        if (C0032.m3184() < 0) {
            return "https://";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۢۡ, reason: not valid java name and contains not printable characters */
    public static int m4586(Object obj) {
        if (C0035.m3569() < 0) {
            return ((D1) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m4587(Object obj) {
        if (C0024.m2011() < 0) {
            return ((U3) obj).h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۤۡ, reason: not valid java name and contains not printable characters */
    public static String m4588(Object obj) {
        if (C0030.m2940() > 0) {
            return String.valueOf(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۢ۠, reason: not valid java name and contains not printable characters */
    public static C1 m4589(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0025.m2132() >= 0) {
            return ((C0387j2) obj).i((RandomAccessFile) obj2, (C0387j2) obj3, (q5) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۢۢ, reason: not valid java name and contains not printable characters */
    public static InputStream m4590(Object obj, Object obj2) {
        if (C0070.m5903() > 0) {
            return ((Class) obj).getResourceAsStream((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۧۢ, reason: not valid java name and contains not printable characters */
    public static List m4591(Object obj) {
        if (C0021.m1598() < 0) {
            return ((ApkSigningBlockUtils.SignerConfig) obj).signatureAlgorithms;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static Iterator m4592(Object obj) {
        if (C0016.m717() < 0) {
            return ((DirectoryStream) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m4593(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((Supplier) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4594(Object obj, Object obj2) {
        if (C0034.m3450() >= 0) {
            ((View) obj).getDrawingRect((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int m4595(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((C0) obj).x;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۥۦ, reason: not valid java name and contains not printable characters */
    public static JsonWriter m4596(Object obj, long j) {
        if (C0036.m3653() <= 0) {
            return ((JsonWriter) obj).value(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦ۠, reason: not valid java name and contains not printable characters */
    public static String m4597() {
        if (C0036.m3653() < 0) {
            return "OpenSSLEvpCipherARC4";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m4598(String str) {
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

    /* JADX INFO: renamed from: ۤ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4599() {
        if (C0072.m6216() >= 0) {
            return o5.d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static M4 m4600(Object obj) {
        if (C0020.m1385() <= 0) {
            return AbstractC0449u.h((B3) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۢۢ, reason: not valid java name and contains not printable characters */
    public static Locale m4601() {
        if (C0111.m13165() <= 0) {
            return Locale.ENGLISH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦۣ, reason: not valid java name and contains not printable characters */
    public static int m4602(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((ViewOnLongClickListenerC0339c1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨۦۨ, reason: not valid java name and contains not printable characters */
    public static V3SchemeSigner.Builder m4603(Object obj, int i) {
        if (C0039.m4109() > 0) {
            return ((V3SchemeSigner.Builder) obj).setMinSdkVersionForV31(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۧ۟, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m4604(Object obj, Object obj2) {
        if (C0034.m3450() >= 0) {
            return ((ByteBuffer) obj).order((ByteOrder) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۨۤ, reason: contains not printable characters */
    public static String m4605() {
        if (C0033.m3358() <= 0) {
            return "What.is.the.name.of.your.organizational.unit.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۨ, reason: contains not printable characters */
    public static KeyPair m4606(Object obj) {
        if (C0024.m2011() < 0) {
            return ((KeyPairGenerator) obj).generateKeyPair();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public static Object m4607(Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            return Asn1DerEncoder.c(obj, (Field) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۟ۡ, reason: contains not printable characters */
    public static int m4608(Object obj) {
        if (C0078.m7450() > 0) {
            return ((Collection) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۥۥ, reason: contains not printable characters */
    public static ObjectIdentifier m4609(Object obj) {
        if (C0069.m5781() < 0) {
            return ((KeyUsageExtension) obj).getExtensionId();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۡ, reason: contains not printable characters */
    public static String m4610(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((N2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۤۥ, reason: contains not printable characters */
    public static boolean m4611() {
        if (C0016.m717() < 0) {
            return C0.K;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۣۨ, reason: contains not printable characters */
    public static void m4612(Object obj, int i, double d, boolean z) {
        if (C0063.m4427() > 0) {
            ((C0450u0) obj).d(i, d, z);
        }
    }

    /* JADX INFO: renamed from: ۥۦۨۨ, reason: contains not printable characters */
    public static byte[] m4613(Object obj) {
        if (C0038.m4010() > 0) {
            return ((Certificate) obj).getEncoded();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧ۠, reason: contains not printable characters */
    public static void m4614(Object obj) {
        if (C0078.m7450() > 0) {
            ((C5) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۥۨۧۦ, reason: contains not printable characters */
    public static boolean m4615(Object obj) {
        if (C0039.m4109() > 0) {
            return ((File) obj).canExecute();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟۠ۢ, reason: contains not printable characters */
    public static SigningCertificateLineage m4616(Object obj, boolean z) {
        if (C0030.m2940() > 0) {
            return SigningCertificateLineage.b((DataSource) obj, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠۠۟, reason: contains not printable characters */
    public static Object m4617(Object obj, Object obj2, Object obj3) {
        if (C0032.m3184() < 0) {
            return ((EnumMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۢۧ, reason: contains not printable characters */
    public static Choreographer m4618() {
        if (C0074.m6454() < 0) {
            return Choreographer.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۤ۠, reason: contains not printable characters */
    public static int m4619(Object obj, int i, Object obj2, int i2) {
        if (m4578() > 0) {
            return ((C0357e5) obj).j(i, (byte[]) obj2, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۥۣ, reason: contains not printable characters */
    public static void m4620(Object obj, Object obj2) {
        if (C0077.m7272() < 0) {
            ManifestWriter.writeMainSection((OutputStream) obj, (Attributes) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۦۨۡ, reason: contains not printable characters */
    public static ByteBuffer m4621(Object obj) {
        if (m4578() >= 0) {
            return ((LocalFileRecord) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۡۤ, reason: contains not printable characters */
    public static String m4622() {
        if (C0066.m4827() >= 0) {
            return KeyStore.getDefaultType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۧۢ, reason: contains not printable characters */
    public static DataSink m4623(Object obj) {
        if (C0066.m4827() > 0) {
            return DataSinks.asDataSink((OutputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۢ۟, reason: contains not printable characters */
    public static String m4624(Object obj) {
        if (C0033.m3358() < 0) {
            return ((M4) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m4625(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((ViewOnClickListenerC0436r4) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۠۠, reason: not valid java name and contains not printable characters */
    public static int m4626(Object obj, Object obj2, int i, int i2) {
        if (C0077.m7272() <= 0) {
            return AbstractC0406m3.v((InputStream) obj, (byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۧۧ, reason: not valid java name and contains not printable characters */
    public static Charset m4627() {
        if (C0017.m846() >= 0) {
            return G2.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4628(Object obj) {
        if (C0067.m5468() < 0) {
            return ((ApkSigner.SignerConfig) obj).getDeterministicDsaSigning();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4629(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((File) obj).isFile();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۧۤ, reason: not valid java name and contains not printable characters */
    public static Class m4630() {
        if (C0018.m1064() > 0) {
            return Short.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m4631() {
        if (C0034.m3450() > 0) {
            return "SecureRandom.SHA1PRNG ImplementedIn";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4632(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((AutoClickPlanBean) obj).getPlanName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۤۧ, reason: not valid java name and contains not printable characters */
    public static ScriptState[] m4633() {
        if (C0025.m2132() > 0) {
            return ScriptState.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۡ۠, reason: not valid java name and contains not printable characters */
    public static String m4634() {
        if (C0025.m2132() > 0) {
            return "alias.keyStore.getCreationDate.alias.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۧۧ, reason: not valid java name and contains not printable characters */
    public static void m4635(Object obj) {
        if (C0065.m4647() >= 0) {
            o5.b((Cursor) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۨۤ, reason: not valid java name and contains not printable characters */
    public static String m4636(Object obj) {
        if (C0031.m3075() > 0) {
            return ((AlgorithmIdentifier) obj).algorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۤ۠, reason: not valid java name and contains not printable characters */
    public static void m4637(Object obj) {
        if (C0073.m6356() < 0) {
            ((View) obj).clearAnimation();
        }
    }

    /* JADX INFO: renamed from: ۨۥۧۧ, reason: not valid java name and contains not printable characters */
    public static DataSource m4638(Object obj) {
        if (C0066.m4827() > 0) {
            return ((V3SchemeVerifier.Builder) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m4639(Object obj) {
        if (C0039.m4109() > 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).containsWarnings();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m4640(Object obj, Object obj2) {
        if (C0019.m1311() >= 0) {
            return ((SignerEngine) obj).sign((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۥۨ, reason: not valid java name and contains not printable characters */
    public static AlgorithmIdentifier m4641(Object obj) {
        if (C0034.m3450() > 0) {
            return AlgorithmIdentifier.getSignerInfoDigestAlgorithmOid((DigestAlgorithm) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۦۧ, reason: not valid java name and contains not printable characters */
    public static String m4642(Object obj) {
        if (C0069.m5781() < 0) {
            return ((MessageDigest) obj).getAlgorithm();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۢۦ, reason: not valid java name and contains not printable characters */
    public static String m4545(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
