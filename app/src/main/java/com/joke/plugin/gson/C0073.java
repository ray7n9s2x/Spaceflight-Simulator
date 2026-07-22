package com.joke.plugin.gson;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.Hints;
import com.android.apksig.KeyConfig;
import com.android.apksig.SignerEngine;
import com.android.apksig.SignerEngineFactory;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ApkSigningBlockUtilsLite;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.bmJiasu.xhook.call.a;
import com.joke.plugin.gson.internal.Primitives;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonToken;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptJumpBean;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.script.bean.ScriptProjectBean;
import com.joke.script.bean.ScriptState;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A0;
import com.zfork.multiplatforms.android.bomb.A2;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0446t2;
import com.zfork.multiplatforms.android.bomb.AbstractC0449u;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0394k3;
import com.zfork.multiplatforms.android.bomb.C0427q0;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.C5;
import com.zfork.multiplatforms.android.bomb.DialogC0359f0;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.DialogC0472x4;
import com.zfork.multiplatforms.android.bomb.F5;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.G5;
import com.zfork.multiplatforms.android.bomb.H0;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.L2;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N0;
import com.zfork.multiplatforms.android.bomb.O0;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.R0;
import com.zfork.multiplatforms.android.bomb.R1;
import com.zfork.multiplatforms.android.bomb.RunnableC0353e1;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0326a2;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0345d0;
import com.zfork.multiplatforms.android.bomb.Y1;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.u5;
import com.zfork.multiplatforms.android.bomb.x5;
import com.zfork.multiplatforms.android.bomb.y5;
import j$.util.stream.IntStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermission;
import java.security.CodeSigner;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.C0111;
import org.conscrypt.NativeCrypto;
import sun.security.pkcs.PKCS10;
import sun.security.pkcs.PKCS10Attributes;

/* JADX INFO: renamed from: com.joke.plugin.gson.ۣۢ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0073 {

    /* JADX INFO: renamed from: ۟ۦۡۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean f215 = true;

    /* JADX INFO: renamed from: ۟۟۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6298(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((ApkSigner.Builder) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6299(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((y5) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static GsonBuilder m6300(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((GsonBuilder) obj).disableHtmlEscaping();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static List m6301(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).signatures;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m6302() {
        if (C0036.m3653() <= 0) {
            return "Alg.Alias.Cipher.PBEWithHmacSHA512AndAES_128";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m6303(Object obj) {
        if (m6356() <= 0) {
            return ((C0444t0) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨۥۥ, reason: not valid java name and contains not printable characters */
    public static long m6304(Object obj, int i) {
        if (C0036.m3653() < 0) {
            return AndroidBinXmlParser.access$500((ByteBuffer) obj, i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۨۦۥ, reason: not valid java name and contains not printable characters */
    public static void m6305(Object obj) {
        if (C0074.m6454() < 0) {
            ((PopupWindow) obj).dismiss();
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6306(Object obj, Object obj2) {
        if (C0035.m3569() < 0) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static C0444t0 m6307(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((C0427q0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static Object m6308(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((R1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static long m6309(Object obj) {
        if (C0065.m4647() > 0) {
            return ((ScriptProjectBean) obj).id;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m6310(Object obj) {
        if (C0033.m3358() <= 0) {
            return AbstractC0449u.a((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static Object m6311(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((Y1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static InputStream m6312() {
        if (C0021.m1598() < 0) {
            return System.in;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۡۦ, reason: not valid java name and contains not printable characters */
    public static long m6313(Object obj) {
        if (C0017.m846() >= 0) {
            return ((ScriptJumpBean) obj).scriptProjectId;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧۤ, reason: not valid java name and contains not printable characters */
    public static int[] m6314(Object obj, int i) {
        if (C0019.m1311() == 0) {
            return Arrays.copyOf((int[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۨۥ, reason: not valid java name and contains not printable characters */
    public static Throwable m6315(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((C0394k3) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۢ, reason: not valid java name and contains not printable characters */
    public static Object m6316(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0019.m1311() == 0) {
            return AbstractC0446t2.a((Class) obj, obj2, (String) obj3, (Object[]) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧ۠, reason: not valid java name and contains not printable characters */
    public static String m6317() {
        if (m6356() < 0) {
            return "Alg.Alias.Cipher.1.2.840.113549.3.4";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static List m6318(Object obj) {
        if (C0072.m6216() > 0) {
            return ((ApkVerifier.Result.SourceStampInfo) obj).getInfoMessages();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۥ, reason: not valid java name and contains not printable characters */
    public static ImageView m6319(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((C4) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m6320(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((CentralDirectoryRecord) obj).getUncompressedSize();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerCapabilities m6321(Object obj) {
        if (m6356() <= 0) {
            return ((SigningCertificateLineage.SignerCapabilities.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۢ۠, reason: not valid java name and contains not printable characters */
    public static KeyConfig m6322(Object obj) {
        if (C0077.m7272() < 0) {
            return ((DefaultApkSignerEngine.SignerConfig.Builder) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤۤ, reason: not valid java name and contains not printable characters */
    public static String m6323(Object obj) {
        if (C0024.m2011() < 0) {
            return ((L) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۢۥ, reason: not valid java name and contains not printable characters */
    public static O2 m6324(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((L2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m6325(Object obj) {
        if (C0035.m3569() < 0) {
            return ((ApkSignerEngine) obj).isEligibleForSourceStamp();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static EditText m6326(Object obj) {
        if (C0038.m4010() > 0) {
            return ((DialogC0389j4) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static long m6327(Object obj) {
        if (C0017.m846() > 0) {
            return ((x5) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static List m6328(Object obj) {
        if (C0018.m1064() > 0) {
            return ((ContentResolver) obj).getPersistedUriPermissions();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m6329(Object obj, Object obj2) {
        if (C0027.m2460() > 0) {
            ((T1) obj).i((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m6330(Object obj) {
        if (C0034.m3450() > 0) {
            return ((Enumeration) obj).nextElement();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6331(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((ApkVerifier.Result.V2SchemeSignerInfo) obj).containsErrors();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static O0 m6332(Object obj) {
        if (C0070.m5903() > 0) {
            return ((T1) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static DigestAlgorithm[] m6333() {
        if (C0075.m6893() >= 0) {
            return DigestAlgorithm.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤۢ, reason: not valid java name and contains not printable characters */
    public static void m6334(Object obj, long j) throws IOException {
        if (C0074.m6454() <= 0) {
            ((RandomAccessFile) obj).setLength(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static Field m6335(Object obj, Object obj2) {
        if (C0069.m5781() <= 0) {
            return ((Class) obj).getField((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static TextView m6336(Object obj) {
        if (C0026.m2298() < 0) {
            return ((I1) obj).getTvSaveAs();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۥ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.GetJarEntryDataRequest m6337(Object obj) {
        if (C0111.m13165() < 0) {
            return ((DefaultApkSignerEngine) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m6338(Object obj) {
        if (C0076.m6903() < 0) {
            return Hints.encodeByteRangeList((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨۥ, reason: not valid java name and contains not printable characters */
    public static String m6339(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((Context) obj).getPackageCodePath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static PosixFilePermission m6340() {
        if (C0070.m5903() >= 0) {
            return PosixFilePermission.GROUP_EXECUTE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m6341(Object obj, Object obj2) {
        if (C0029.m2791() > 0) {
            return C0074.m6562((Collection) obj, (Asn1Type) obj2, true);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6342() {
        if (C0025.m2132() > 0) {
            return ApkVerifier.Issue.V4_SIG_APK_ROOT_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۧۥ, reason: not valid java name and contains not printable characters */
    public static void m6343(Object obj, Object obj2, boolean z) {
        if (C0039.m4109() > 0) {
            ((a) obj).a((Context) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۨ۠, reason: not valid java name and contains not printable characters */
    public static int m6344(Object obj, int i) {
        if (C0066.m4827() >= 0) {
            return ((RandomAccessFile) obj).skipBytes(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۧ, reason: not valid java name and contains not printable characters */
    public static JsonToken[] m6345() {
        if (C0076.m6903() < 0) {
            return JsonToken.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۢۧ, reason: not valid java name and contains not printable characters */
    public static void m6346(Object obj) {
        if (C0028.m2593() >= 0) {
            ((O2) obj).S();
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static ScriptProjectAliasBean m6347(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((C0361f2) obj).y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۡ, reason: not valid java name and contains not printable characters */
    public static String m6348() {
        if (C0069.m5781() <= 0) {
            return "FoxState";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۨۦ, reason: not valid java name and contains not printable characters */
    public static int m6349(Object obj) {
        if (C0017.m846() > 0) {
            return ((SourceStampVerifier.Result.SignerInfo) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟۟, reason: not valid java name and contains not printable characters */
    public static void m6350(int i, Object obj, int i2) {
        if (C0069.m5781() <= 0) {
            ApkSigningBlockUtils.a(i, (byte[]) obj, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static TextView m6351(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((DialogC0421p0) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static URI m6352(Object obj) {
        if (C0016.m717() < 0) {
            return ((File) obj).toURI();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۡۢ, reason: not valid java name and contains not printable characters */
    public static String m6353() {
        if (C0028.m2593() > 0) {
            return "AES_256/CBC/PKCS5PADDING";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠۟, reason: not valid java name and contains not printable characters */
    public static Asn1Type m6354() {
        if (C0036.m3653() <= 0) {
            return Asn1Type.SEQUENCE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m6355() {
        if (C0074.m6454() < 0) {
            return "Alias.alias.has.no.certificate";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۢ, reason: not valid java name and contains not printable characters */
    public static int m6356() {
        return (-1749885) ^ C0032.m3236((Object) "ۢۨۢ");
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6357(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((O2) obj).g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۦۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m6358(int i) {
        if (C0038.m4010() >= 0) {
            return C0024.m2042(0, false, 2, new byte[][]{C0020.m1333(C0038.m3948(i))});
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۤ, reason: not valid java name and contains not printable characters */
    public static Class m6359(Object obj) {
        if (C0036.m3653() <= 0) {
            return Primitives.wrap((Class) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨ۟, reason: not valid java name and contains not printable characters */
    public static DialogC0359f0 m6360(Object obj) {
        if (C0025.m2132() > 0) {
            return ((ViewOnClickListenerC0345d0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m6361() {
        if (C0038.m4010() > 0) {
            return "Alg.Alias.Cipher.PBEWithHmacSHA512AndAES_256";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۦ, reason: not valid java name and contains not printable characters */
    public static void m6362(Object obj, int i) {
        if (C0075.m6893() > 0) {
            ((TextView) obj).setWidth(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m6363(Object obj) {
        if (C0066.m4827() > 0) {
            return ApkSigningBlockUtilsLite.encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6364(Object obj) {
        if (C0072.m6216() > 0) {
            return ((ApkSigner.Builder) obj).C;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static Uri m6365(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((ConsumerAbility) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۡ, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m6366(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((DialogC0421p0) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۤ, reason: not valid java name and contains not printable characters */
    public static void m6367(Object obj, boolean z) {
        if (C0031.m3075() > 0) {
            ((WebSettings) obj).setLoadWithOverviewMode(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۨ۠, reason: not valid java name and contains not printable characters */
    public static TextView m6368(Object obj) {
        if (C0016.m717() <= 0) {
            return ((I1) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۢ۟, reason: not valid java name and contains not printable characters */
    public static Method m6369(Object obj, Object obj2, Object obj3) {
        if (C0026.m2298() < 0) {
            return ((Class) obj).getDeclaredMethod((String) obj2, (Class[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۡ, reason: not valid java name and contains not printable characters */
    public static WindowManager m6370(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((G0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m6371(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((G5) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static int m6372(Object obj) {
        if (C0033.m3358() < 0) {
            return ((IntStream) obj).sum();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static int m6373(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((H0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦ۟۟, reason: not valid java name and contains not printable characters */
    public static Paint m6374(Object obj) {
        if (C0029.m2791() > 0) {
            return ((U3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m6375(Object obj) {
        if (C0027.m2460() > 0) {
            return ((M4) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m6376(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((ApkSigner) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m6377() {
        if (C0075.m6893() > 0) {
            return "-----BEGIN CERTIFICATE-----";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠۟, reason: not valid java name and contains not printable characters */
    public static Date m6378(Object obj, Object obj2) {
        if (C0035.m3569() < 0) {
            return ((DateFormat) obj).parse((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۢ, reason: not valid java name and contains not printable characters */
    public static int m6379(Object obj) {
        if (C0068.m5678() > 0) {
            return ((R0) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۦۧ, reason: not valid java name and contains not printable characters */
    public static int m6380(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((SourceStampVerifier.Result.SignerInfo) obj).getMinSdkVersion();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧۡۧ, reason: not valid java name and contains not printable characters */
    public static String m6382(String str) {
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

    /* JADX INFO: renamed from: ۢ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m6383(Object obj) {
        if (C0066.m4827() > 0) {
            ((C0444t0) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Result m6384(Object obj, Object obj2, Object obj3) {
        if (C0074.m6454() < 0) {
            return ((ApkVerifier) obj).m((DataSource) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m6385() {
        if (C0029.m2791() > 0) {
            return "algorithmID";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۨۨ, reason: not valid java name and contains not printable characters */
    public static View.OnTouchListener m6386(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((C0) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨ۠, reason: not valid java name and contains not printable characters */
    public static String m6387(Object obj) {
        if (C0032.m3184() < 0) {
            return ((CentralDirectoryRecord) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static Object m6388(Object obj) {
        if (C0037.m3837() < 0) {
            return ((RunnableC0353e1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m6389() {
        if (C0016.m717() <= 0) {
            return "Alg.Alias.Mac.HMAC/SHA224";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m6390() {
        if (m6356() <= 0) {
            return TypeAdapters.UUID_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static PKCS10Attributes m6391(Object obj) {
        if (C0065.m4647() > 0) {
            return ((PKCS10) obj).getAttributes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۨ۟, reason: not valid java name and contains not printable characters */
    public static void m6392(Object obj, Object obj2) {
        if (C0023.m1921() > 0) {
            ((Dialog) obj).setContentView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۧۦ, reason: not valid java name and contains not printable characters */
    public static Charset m6393() {
        if (C0030.m2940() > 0) {
            return StandardCharsets.US_ASCII;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨۦ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m6394() {
        if (C0016.m717() <= 0) {
            return TypeAdapters.ENUM_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡ۠, reason: not valid java name and contains not printable characters */
    public static void m6395(Object obj, double d) {
        if (C0027.m2460() > 0) {
            ((a) obj).b(d);
        }
    }

    /* JADX INFO: renamed from: ۤۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m6396(Object obj, char c, char c2) {
        if (C0029.m2791() > 0) {
            return ((String) obj).replace(c, c2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۦۡ, reason: not valid java name and contains not printable characters */
    public static void m6397(Object obj, Object obj2, Object obj3) {
        if (C0076.m6903() <= 0) {
            C0017.m919(C0016.m708((V1SchemeVerifier.Result.SignerInfo) obj), new ApkVerifier.IssueWithParams((ApkVerifier.Issue) obj2, (Object[]) obj3));
        }
    }

    /* JADX INFO: renamed from: ۣۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Collection m6398(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((X509Certificate) obj).getSubjectAlternativeNames();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static Intent m6399(Object obj, Object obj2) {
        if (C0075.m6893() >= 0) {
            return ((Intent) obj).addCategory((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۤۦ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m6400() {
        if (C0032.m3184() < 0) {
            return Asn1Type.CHOICE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m6401(Object obj, Object obj2, Object obj3) {
        if (C0037.m3837() <= 0) {
            return ((A2) obj).apply(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۢۤ, reason: not valid java name and contains not printable characters */
    public static int m6402(Object obj) {
        if (C0111.m13165() < 0) {
            return ((View) obj).getWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧ, reason: contains not printable characters */
    public static SignerEngine m6403(Object obj, Object obj2, Object obj3) {
        if (C0036.m3653() < 0) {
            return SignerEngineFactory.getImplementation((KeyConfig) obj, (String) obj2, (AlgorithmParameterSpec) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۥۥ, reason: contains not printable characters */
    public static ApkVerifier m6404(Object obj) {
        if (C0075.m6893() > 0) {
            return ((ApkVerifier.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۢ۠, reason: contains not printable characters */
    public static LinearLayout m6405(Object obj) {
        if (C0068.m5678() > 0) {
            return ((DialogC0389j4) obj).x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۨ, reason: contains not printable characters */
    public static int m6406(Object obj) {
        if (C0035.m3569() < 0) {
            return ((Class) obj).getModifiers();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۡ۟ۦ, reason: contains not printable characters */
    public static CertPath m6407(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((CodeSigner) obj).getSignerCertPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۤۤ, reason: contains not printable characters */
    public static boolean m6408(Object obj) {
        if (C0019.m1311() == 0) {
            return ((F5) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۥۦ, reason: contains not printable characters */
    public static String m6409() {
        if (C0033.m3358() <= 0) {
            return "DESede";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۨ, reason: contains not printable characters */
    public static EditText m6410(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((DialogC0472x4) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۨۤ, reason: contains not printable characters */
    public static boolean m6411(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((ApkVerifier.Result) obj).isVerifiedUsingV3Scheme();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۢ۠, reason: contains not printable characters */
    public static int m6412(Object obj, Object obj2) {
        if (m6356() <= 0) {
            return AbstractC0406m3.u((InputStream) obj, (byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۧۤۡ, reason: contains not printable characters */
    public static String m6413() {
        if (C0063.m4427() >= 0) {
            return "OpenSSLEvpCipherAES$AES_128$CBC$PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۤۤ, reason: contains not printable characters */
    public static V3SchemeVerifier m6414(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((V3SchemeVerifier.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۢۨ, reason: contains not printable characters */
    public static long m6415(Object obj) {
        if (C0029.m2791() > 0) {
            return o5.u((String) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦ۠ۤۧ, reason: contains not printable characters */
    public static UnsatisfiedLinkError m6416() {
        if (C0078.m7450() > 0) {
            return NativeCrypto.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۨۢ, reason: contains not printable characters */
    public static Class[] m6417(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((Method) obj).getParameterTypes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ, reason: contains not printable characters */
    public static ScriptState m6418() {
        if (C0032.m3184() < 0) {
            return ScriptState.PAUSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۦۥ, reason: contains not printable characters */
    public static void m6419(Object obj) {
        if (C0038.m4010() > 0) {
            ((N0) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۦۦۧ, reason: contains not printable characters */
    public static String m6420() {
        if (C0068.m5678() >= 0) {
            return "Alg.Alias.Cipher.PBEWithHmacSHA256AndAES_128";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۦۧ, reason: contains not printable characters */
    public static byte[] m6421(Object obj) {
        if (C0016.m717() < 0) {
            return Asn1DerEncoder.access$700((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۡ, reason: contains not printable characters */
    public static String m6422(Object obj, Object obj2, Object obj3) {
        if (C0034.m3450() > 0) {
            return ((String) obj).replaceAll((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static int m6423(Object obj) {
        if (C0033.m3358() < 0) {
            return ((ViewOnClickListenerC0326a2) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۠۟, reason: not valid java name and contains not printable characters */
    public static int m6424(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((AndroidBinXmlParser) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6425() {
        if (C0036.m3653() <= 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_MALFORMED_LINEAGE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۧۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6426(Object obj) {
        if (C0068.m5678() > 0) {
            return ((com.android.apksig.internal.apk.a) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۨۤ, reason: not valid java name and contains not printable characters */
    public static Context m6427(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((A0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢ, reason: not valid java name and contains not printable characters */
    public static String m6428(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((AbstractC0384j) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerCapabilities.Builder m6429(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            return ((SigningCertificateLineage.SignerCapabilities.Builder) obj).setCallerConfiguredCapabilities((SigningCertificateLineage.SignerCapabilities) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۦ۠, reason: not valid java name and contains not printable characters */
    public static String m6430() {
        if (C0021.m1598() <= 0) {
            return "<deststoretype>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۨۦ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m6431(Object obj, long j, long j2) {
        if (C0018.m1064() > 0) {
            return C0032.m3206((ByteBuffer) obj, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static void m6432(Object obj, byte b) {
        if (C0023.m1921() >= 0) {
            ((u5) obj).b(b);
        }
    }

    /* JADX INFO: renamed from: ۧۨۤۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6433() {
        if (C0034.m3450() >= 0) {
            return ApkVerifier.Issue.JAR_SIG_UNNNAMED_MANIFEST_SECTION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۨۤ, reason: not valid java name and contains not printable characters */
    public static void m6434(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            ((C0) obj).setListenerOnlySpeed((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Context m6435(Object obj) {
        if (C0078.m7450() > 0) {
            return ((DialogC0359f0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static PushbackInputStream m6436(Object obj) {
        if (C0068.m5678() > 0) {
            return ((C5) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m6437(Object obj) {
        if (C0039.m4109() >= 0) {
            return C0066.m4792((Path) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۥۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m6438(Object obj) {
        if (C0018.m1064() > 0) {
            return ((AtomicReference) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۧۡ, reason: not valid java name and contains not printable characters */
    public static ApkSignerEngine.InputJarEntryInstructions m6439(Object obj, Object obj2) {
        if (C0029.m2791() >= 0) {
            return ((ApkSignerEngine) obj).inputJarEntry((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۦ۠, reason: not valid java name and contains not printable characters */
    public static EditText m6440(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((DialogC0472x4) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۨۥ, reason: not valid java name and contains not printable characters */
    public static String m6381(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
