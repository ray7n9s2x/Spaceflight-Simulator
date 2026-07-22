package com.joke.plugin.gson.internal.bind;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Process;
import android.util.DisplayMetrics;
import android.util.JsonWriter;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v4.V4SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.Asn1Field;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.FileChannelDataSource;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.internal.util.TeeDataSink;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipSections;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.GsonBuilder;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.Excluder;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptActionBean;
import com.joke.script.bean.ScriptTouchBean;
import com.zfork.entry.C0075;
import com.zfork.entry.MetaSelectAppAbility;
import com.zfork.multiplatforms.android.bomb.AbstractC0354e2;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.AbstractC0390k;
import com.zfork.multiplatforms.android.bomb.AbstractC0449u;
import com.zfork.multiplatforms.android.bomb.B;
import com.zfork.multiplatforms.android.bomb.B4;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0323a;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0355e3;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0407m4;
import com.zfork.multiplatforms.android.bomb.C0426q;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0453u3;
import com.zfork.multiplatforms.android.bomb.C0456v0;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C0483z3;
import com.zfork.multiplatforms.android.bomb.C2;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.C5;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0403m0;
import com.zfork.multiplatforms.android.bomb.E0;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.F3;
import com.zfork.multiplatforms.android.bomb.H3;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.InterfaceC0477y3;
import com.zfork.multiplatforms.android.bomb.J2;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.K1;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.P1;
import com.zfork.multiplatforms.android.bomb.Q2;
import com.zfork.multiplatforms.android.bomb.R1;
import com.zfork.multiplatforms.android.bomb.RunnableC0367g1;
import com.zfork.multiplatforms.android.bomb.S1;
import com.zfork.multiplatforms.android.bomb.S2;
import com.zfork.multiplatforms.android.bomb.U;
import com.zfork.multiplatforms.android.bomb.Y;
import com.zfork.multiplatforms.android.bomb.Z4;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.Writer;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.security.Principal;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.security.spec.ECParameterSpec;
import java.text.Format;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.zip.Inflater;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.C0111;
import org.json.JSONArray;
import sun.security.pkcs.PKCS10Attributes;
import sun.security.util.ObjectIdentifier;
import sun.security.x509.Extension;

/* JADX INFO: renamed from: com.joke.plugin.gson.internal.bind.ۨۢۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0068 {

    /* JADX INFO: renamed from: ۣۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int f204 = 1;

    /* JADX INFO: renamed from: ۟۟۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m5530() {
        if (C0074.m6454() < 0) {
            return "YES";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m5531(Object obj) {
        if (C0016.m717() <= 0) {
            return V4Signature.readBytes((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static void m5532(Object obj, Object obj2, Object obj3) {
        if (m5678() >= 0) {
            ((ApkSigningBlockUtils.Result) obj).addWarning((ApkVerifier.Issue) obj2, (Object[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m5533(Object obj) {
        if (C0021.m1598() <= 0) {
            return V4Signature.readBytes((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5534(Object obj, boolean z, Object obj2) {
        if (C0078.m7450() >= 0) {
            return ReflectiveTypeAdapterFactory.excludeField((Field) obj, z, (Excluder) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Activity m5535(Object obj) {
        if (C0024.m2011() < 0) {
            return ((K1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static String m5536(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((StringBuilder) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m5537(Object obj) {
        if (C0017.m846() >= 0) {
            return ((Point) obj).x;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static Activity m5538(Object obj) {
        if (C0023.m1921() > 0) {
            return ((DialogC0403m0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static BigInteger m5539(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((BigInteger) obj).not();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static TextView m5540(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((C0407m4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static CheckBox m5541(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((C0351e) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m5542(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((V3SchemeSigner.Builder) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0477y3 m5543(Object obj) {
        if (C0072.m6216() > 0) {
            return ((C0444t0) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static AndroidBinXmlParser.ResourceMap m5545(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((AndroidBinXmlParser) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m5546(int i, Object obj) {
        if (C0028.m2593() >= 0) {
            return C0387j2.k(i, (byte[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m5547(Object obj) {
        if (C0037.m3837() < 0) {
            return ((DisplayCutout) obj).getSafeInsetTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static Q2 m5548(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((C0323a) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m5549(Object obj, Object obj2, int i, int i2) {
        if (C0029.m2791() > 0) {
            return ((C0453u3) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static List m5550(Object obj, Object obj2) {
        if (C0035.m3569() <= 0) {
            return ApkSigningBlockUtils.generateSignaturesOverData((ApkSigningBlockUtils.SignerConfig) obj, (byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5551(Object obj, Object obj2) {
        if (C0064.m4578() > 0) {
            return ApkSigner.getAndroidManifestFromApk((List) obj, (DataSource) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static void m5552(int i) {
        if (C0027.m2460() >= 0) {
            Process.killProcess(i);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static DataSink m5553(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((ApkSigner.Builder) obj).y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۨ۟, reason: not valid java name and contains not printable characters */
    public static int m5554(Object obj) {
        if (C0026.m2298() <= 0) {
            return ApkUtils.getTargetSandboxVersionFromBinaryAndroidManifest((ByteBuffer) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5555(Object obj) {
        if (C0111.m13165() < 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).getRotationTargetsDevRelease();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static void m5556(Object obj, Object obj2) {
        if (C0069.m5781() < 0) {
            ((P1) obj).setText((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۧۨ, reason: not valid java name and contains not printable characters */
    public static String m5557(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((Principal) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m5558(Object obj) {
        if (C0066.m4827() > 0) {
            return ((R1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m5559() {
        if (C0026.m2298() <= 0) {
            return "FoxCity";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static Currency m5560(Object obj) {
        if (C0063.m4427() >= 0) {
            return Currency.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5561(Object obj, Object obj2) {
        if (C0067.m5468() <= 0) {
            return ((ArrayList) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static float m5562(Object obj) {
        if (C0025.m2132() > 0) {
            return ((ScriptTouchBean) obj).x;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۥۢ۟, reason: not valid java name and contains not printable characters */
    public static int m5563(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((Set) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۦ۠, reason: not valid java name and contains not printable characters */
    public static WindowManager.LayoutParams m5564(Object obj) {
        if (C0027.m2460() > 0) {
            return ((O1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static char[] m5565(Object obj) {
        if (C0033.m3358() < 0) {
            return ((O2) obj).x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۢ, reason: not valid java name and contains not printable characters */
    public static EditText m5566(Object obj) {
        if (C0074.m6454() < 0) {
            return ((DialogC0389j4) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Class m5567() {
        if (C0029.m2791() > 0) {
            return Float.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۥۤ, reason: not valid java name and contains not printable characters */
    public static void m5568(Object obj, Object obj2, Object obj3) {
        if (C0066.m4827() >= 0) {
            ((PKCS10Attributes) obj).setAttribute((String) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5569(Object obj, Object obj2) {
        if (C0031.m3075() >= 0) {
            return ((ByteBuffer) obj).put((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5570(Object obj) {
        if (C0028.m2593() > 0) {
            return ((Enumeration) obj).hasMoreElements();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m5571(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static Appendable m5572(Object obj, char c) {
        if (C0039.m4109() >= 0) {
            return ((Appendable) obj).append(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static JsonWriter m5573(Object obj, Object obj2) {
        if (C0075.m6893() >= 0) {
            return ((JsonWriter) obj).value((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static GridLayout m5574(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((K0) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static String m5575(Object obj, Object obj2) {
        if (C0038.m4010() >= 0) {
            return ((Format) obj).format(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5576(Object obj) {
        if (C0025.m2132() > 0) {
            return ((MetaSelectAppAbility) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m5577(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((GuaranteedEncodedFormX509Certificate) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m5578(Object obj, Object obj2) {
        if (m5678() >= 0) {
            ((com.joke.plugin.gson.stream.JsonWriter) obj).setIndent((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static ImageView m5579(Object obj) {
        if (C0071.m6069() > 0) {
            return ((C4) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۦۥ, reason: not valid java name and contains not printable characters */
    public static String m5580() {
        if (C0066.m4827() >= 0) {
            return "SecretKeyEntry";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5581(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((Class) obj).isPrimitive();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static BigInteger m5582() {
        if (C0075.m6893() > 0) {
            return BigInteger.ZERO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۦ۟, reason: not valid java name and contains not printable characters */
    public static int m5583(Object obj) {
        if (C0034.m3450() > 0) {
            return ((SourceStampVerifier) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m5584(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0070.m5903() > 0) {
            ((O2) obj).f((String) obj2, (String) obj3, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۡۢ, reason: not valid java name and contains not printable characters */
    public static String m5585() {
        if (C0039.m4109() >= 0) {
            return "RSA/ECB/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۦ, reason: not valid java name and contains not printable characters */
    public static int m5586(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((AbstractC0384j) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static String m5587(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۨۢۧ, reason: not valid java name and contains not printable characters */
    public static List m5588(Object obj) {
        if (C0019.m1311() == 0) {
            return ((AutoClickPlanBean) obj).getPointerBeanList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤ۠, reason: not valid java name and contains not printable characters */
    public static String m5589(Object obj) {
        if (C0029.m2791() >= 0) {
            return System.mapLibraryName((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥ۠, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m5590(Object obj) {
        if (C0073.m6356() < 0) {
            return ((ApkSigningBlockUtils.SignerConfig) obj).signingCertificateLineage;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m5591(Object obj, Object obj2, Object obj3) {
        if (C0027.m2460() > 0) {
            ((J2) obj).c((Application) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۤ, reason: not valid java name and contains not printable characters */
    public static int m5592(Object obj) {
        if (C0038.m4010() > 0) {
            return ((WindowManager.LayoutParams) obj).x;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۡ, reason: not valid java name and contains not printable characters */
    public static int m5593(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((AutoClickPointerBean) obj).getClickCnt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۥۧۧ, reason: not valid java name and contains not printable characters */
    public static EditText m5594(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((DialogC0373h0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡ۟, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m5595() {
        if (C0065.m4647() > 0) {
            return TypeAdapters.CLASS_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5596(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((C5) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5597(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((ApkSigner.SignerConfig) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧۥۨ, reason: not valid java name and contains not printable characters */
    public static Class[] m5598(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((Class) obj).getInterfaces();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۢ, reason: not valid java name and contains not printable characters */
    public static int m5599(Object obj) {
        if (C0016.m717() < 0) {
            return ((B4) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m5600(Object obj, Object obj2) {
        if (C0024.m2011() <= 0) {
            return ((ApkSigner.Builder) obj).setInputApk((File) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۤۢ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.Result.SignerInfo m5601(Object obj, Object obj2) {
        if (C0016.m717() < 0) {
            return V4SchemeVerifier.a((V4Signature.SigningInfo) obj, (byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۨ, reason: not valid java name and contains not printable characters */
    public static int m5602(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((SigningCertificateLineage) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦ۠, reason: not valid java name and contains not printable characters */
    public static Collection m5603(Object obj) {
        if (C0064.m4578() > 0) {
            return ((TreeMap) obj).values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m5604(Object obj) {
        if (C0031.m3075() > 0) {
            return ((DefaultApkSignerEngine.Builder) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟۟, reason: not valid java name and contains not printable characters */
    public static int m5605(Object obj) {
        if (C0064.m4578() > 0) {
            return ((C0426q) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static ObjectIdentifier m5606(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((Extension) obj).getExtensionId();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5607(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((AbstractC0384j) obj).q;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟۟, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5608() {
        if (C0021.m1598() <= 0) {
            return ApkVerifier.Issue.JAR_SIG_NO_MANIFEST_DIGEST_IN_SIG_FILE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static BigInteger m5609(Object obj) {
        if (C0031.m3075() > 0) {
            return ((ECParameterSpec) obj).getOrder();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m5610(Object obj) {
        if (C0070.m5903() > 0) {
            return ((E0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static String m5611() {
        if (C0070.m5903() >= 0) {
            return "Alg.Alias.Mac.1.2.840.113549.2.10";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m5612(Object obj, Object obj2) {
        if (C0039.m4109() > 0) {
            ((Z4) obj).draw((Canvas) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5613() {
        if (m5678() > 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_POR_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static long m5614(Object obj) {
        if (C0027.m2460() > 0) {
            return ((BigDecimal) obj).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static long m5615(Object obj) {
        if (C0029.m2791() > 0) {
            return ((FileChannelDataSource) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m5616(Object obj) {
        if (C0016.m717() <= 0) {
            return ((UUID) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static void m5617(Object obj, Object obj2, Object obj3, long j) {
        if (C0035.m3569() < 0) {
            AbstractC0390k.g((ArrayList) obj, (D5) obj2, (E1) obj3, j);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static void m5618(Object obj) {
        if (C0063.m4427() >= 0) {
            ((HttpURLConnection) obj).disconnect();
        }
    }

    /* JADX INFO: renamed from: ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static Activity m5619(Object obj) {
        if (C0069.m5781() < 0) {
            return ((RunnableC0367g1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m5620(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((PopupWindow) obj).getWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۧۢ, reason: not valid java name and contains not printable characters */
    public static int m5621(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((X509Certificate) obj).getVersion();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۧ۟, reason: not valid java name and contains not printable characters */
    public static List m5622(Object obj) {
        if (C0067.m5468() < 0) {
            return ((ApkSignerInfo) obj).getInfoMessages();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۡ, reason: not valid java name and contains not printable characters */
    public static String m5623(Object obj, int i, Object obj2) {
        if (C0070.m5903() > 0) {
            return ((JSONArray) obj).optString(i, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m5624(Object obj) {
        if (m5678() >= 0) {
            return ((ApkSignerInfo) obj).containsWarnings();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static byte m5625(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((Byte) obj).byteValue();
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m5626(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((C0357e5) obj).f();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m5627(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((C0387j2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۤ, reason: not valid java name and contains not printable characters */
    public static void m5628(Object obj, Object obj2, int i, Object obj3) {
        if (C0074.m6454() <= 0) {
            ((U) obj).f((String) obj2, i, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۢۧۥ, reason: not valid java name and contains not printable characters */
    public static void m5629(Object obj) {
        if (C0073.m6356() < 0) {
            ((PrintStream) obj).println();
        }
    }

    /* JADX INFO: renamed from: ۢۤۧ۠, reason: not valid java name and contains not printable characters */
    public static CheckBox m5630(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((C0351e) obj).s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static FileVisitResult m5631(Object obj) {
        if (C0034.m3450() >= 0) {
            return H3.b(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5632(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((ApkVerifier.Result) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m5633(Object obj) {
        if (C0016.m717() < 0) {
            ((PrintStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static Object m5634(Object obj, Object obj2, boolean z) {
        if (C0019.m1311() <= 0) {
            return Asn1BerParser.f((BerDataValue) obj, (Class) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static long m5635(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((LocalFileRecord) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5636(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((O2) obj).L;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5637(Object obj) {
        if (C0021.m1598() < 0) {
            return ((Extension) obj).isCritical();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static int m5638(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((DisplayMetrics) obj).heightPixels;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۥۥ, reason: not valid java name and contains not printable characters */
    public static float m5639(Object obj) {
        if (C0067.m5468() < 0) {
            return ((S1) obj).a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۤۧۨ, reason: not valid java name and contains not printable characters */
    public static int[] m5640() {
        if (C0077.m7272() < 0) {
            return AbstractC0354e2.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۧۡ, reason: not valid java name and contains not printable characters */
    public static EditText m5641(Object obj) {
        if (C0067.m5468() < 0) {
            return ((DialogC0373h0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥۢ, reason: not valid java name and contains not printable characters */
    public static String m5642(Object obj) {
        if (C0072.m6216() > 0) {
            return ((L) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5643(Object obj) {
        if (C0033.m3358() < 0) {
            return ApkUtils.getDebuggableFromBinaryAndroidManifest((ByteBuffer) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m5644(Object obj, Object obj2) throws CertificateNotYetValidException, CertificateExpiredException {
        if (C0067.m5468() <= 0) {
            ((X509Certificate) obj).checkValidity((Date) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۡۡ۟, reason: not valid java name and contains not printable characters */
    public static ScriptActionBean m5645(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((DialogC0389j4) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۢ, reason: not valid java name and contains not printable characters */
    public static ApkSigner m5646(Object obj) {
        if (C0036.m3653() < 0) {
            return ((ApkSigner.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۧ, reason: not valid java name and contains not printable characters */
    public static int m5647(int i) {
        if (C0077.m7272() < 0) {
            return Integer.highestOneBit(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Asn1OpaqueObject m5648() {
        if (C0077.m7272() < 0) {
            return Asn1DerEncoder.ASN1_DER_NULL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۤۧ, reason: not valid java name and contains not printable characters */
    public static C0479z m5649(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((C0456v0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡ, reason: contains not printable characters */
    public static int m5650(Object obj, Object obj2) {
        if (C0017.m846() >= 0) {
            return ((Inflater) obj).inflate((byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static ArrayList m5651(Object obj) {
        if (C0023.m1921() > 0) {
            return ((O2) obj).V;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public static void m5652(Object obj, Object obj2) {
        if (C0016.m717() <= 0) {
            ((O2) obj).h((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۡۡ, reason: contains not printable characters */
    public static void m5653(Object obj, Object obj2, Object obj3) {
        if (C0028.m2593() > 0) {
            ((C0483z3) obj).e((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۢ۠ۡ, reason: contains not printable characters */
    public static void m5654(Object obj, int i) {
        if (C0032.m3184() <= 0) {
            ((AutoClickPointerBean) obj).setDelayStart(i);
        }
    }

    /* JADX INFO: renamed from: ۥۢ۠ۤ, reason: contains not printable characters */
    public static int m5655(Object obj) {
        if (C0073.m6356() <= 0) {
            return ApkUtils.getMinSdkVersionFromBinaryAndroidManifest((ByteBuffer) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۥۧ, reason: contains not printable characters */
    public static String m5656() {
        if (C0024.m2011() < 0) {
            return "keystore";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۥۨ, reason: contains not printable characters */
    public static CheckBox m5657(Object obj) {
        if (C0111.m13165() < 0) {
            return ((C0351e) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۟, reason: contains not printable characters */
    public static ApkVerifier.Issue m5658() {
        if (C0038.m4010() > 0) {
            return ApkVerifier.Issue.V3_SIG_MULTIPLE_PAST_SIGNERS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۢۡ, reason: contains not printable characters */
    public static boolean m5659(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((Asn1Field) obj).optional();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۣ۠, reason: contains not printable characters */
    public static ArrayList m5660(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((Y) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۢۡ, reason: contains not printable characters */
    public static Gson m5661(Object obj) {
        if (C0036.m3653() < 0) {
            return ((GsonBuilder) obj).create();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۧۡ, reason: contains not printable characters */
    public static void m5662(Object obj, Object obj2, Object obj3) {
        if (C0032.m3184() <= 0) {
            ((TypeAdapter) obj).toJson((Writer) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۡۤ, reason: contains not printable characters */
    public static DataSink[] m5663(Object obj) {
        if (C0023.m1921() > 0) {
            return ((TeeDataSink) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۨ, reason: contains not printable characters */
    public static byte[] m5664(Object obj) {
        if (C0034.m3450() > 0) {
            return ((GuaranteedEncodedFormX509Certificate) obj).getEncoded();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۤ, reason: contains not printable characters */
    public static String m5665() {
        if (C0038.m4010() > 0) {
            return "OpenSSLCipherRSA$Raw";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۦۥ, reason: contains not printable characters */
    public static int m5666(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((C2) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۧ, reason: contains not printable characters */
    public static PackageManager m5667(Object obj) {
        if (C0111.m13165() < 0) {
            return ((Context) obj).getPackageManager();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤ, reason: contains not printable characters */
    public static void m5668(Object obj) {
        if (C0075.m6893() >= 0) {
            C0064.m4520((Path) obj);
        }
    }

    /* JADX INFO: renamed from: ۦۧ۟ۦ, reason: contains not printable characters */
    public static void m5669(Object obj, Object obj2) {
        if (C0072.m6216() > 0) {
            ((C0) obj).setOnTouchListener((View.OnTouchListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۧ۠ۥ, reason: contains not printable characters */
    public static SigningCertificateLineage m5670(Object obj) {
        if (C0078.m7450() > 0) {
            return C0077.m7159((DefaultApkSignerEngine.SignerConfig.Builder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧ۠, reason: contains not printable characters */
    public static ApkSigner.SignerConfig m5671(Object obj, Object obj2, boolean z) {
        if (C0018.m1064() >= 0) {
            return AbstractC0449u.b((M4) obj, (F3) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۧ۟, reason: contains not printable characters */
    public static Integer m5672(Object obj) {
        if (m5678() > 0) {
            return ((ApkSigner.Builder) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m5673(Object obj) throws CertificateNotYetValidException, CertificateExpiredException {
        if (C0024.m2011() <= 0) {
            ((X509Certificate) obj).checkValidity();
        }
    }

    /* JADX INFO: renamed from: ۧ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerConfig m5674(Object obj) {
        if (C0016.m717() <= 0) {
            return ((SigningCertificateLineage.SignerConfig.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5675(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((S2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m5676(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0071.m6069() >= 0) {
            ((PopupWindow) obj).showAsDropDown((View) obj2, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۧۦۡ, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m5677(Object obj) {
        if (C0020.m1385() < 0) {
            return ((I1) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۢۡ, reason: not valid java name and contains not printable characters */
    public static int m5678() {
        return 1747904 ^ C0032.m3236((Object) "۠ۨۦ");
    }

    /* JADX INFO: renamed from: ۣۧۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5679(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((DefaultApkSignerEngine.Builder) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5680(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((ZipSections) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static CheckBox m5681(Object obj) {
        if (C0074.m6454() < 0) {
            return ((C0351e) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m5682(Object obj) {
        if (C0038.m4010() > 0) {
            return ((X500Principal) obj).getEncoded();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۥۨ, reason: not valid java name and contains not printable characters */
    public static ClassLoader m5683() {
        if (C0024.m2011() <= 0) {
            return ClassLoader.getSystemClassLoader();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥ۠, reason: not valid java name and contains not printable characters */
    public static int m5684(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((ScriptTouchBean) obj).action;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦۥ۠, reason: not valid java name and contains not printable characters */
    public static long m5685(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((LocalFileRecord) obj).i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۨۡۤ, reason: not valid java name and contains not printable characters */
    public static C0355e3 m5686(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((B) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m5544(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
