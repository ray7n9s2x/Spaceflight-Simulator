package com.android.apksig.apk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSigResult;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ApkSigningBlockUtilsLite;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureInfo;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerEncoding;
import com.android.apksig.internal.asn1.ber.InputStreamBerDataValueReader;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.X509CertificateUtils;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
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
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonStreamParser;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.LinkedTreeMap;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.DateTypeAdapter;
import com.joke.plugin.gson.internal.bind.JsonTreeWriter;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptJumpBean;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.AbstractC0325a1;
import com.zfork.multiplatforms.android.bomb.AbstractC0378i;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0352e0;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0369g3;
import com.zfork.multiplatforms.android.bomb.C0376h3;
import com.zfork.multiplatforms.android.bomb.C0377h4;
import com.zfork.multiplatforms.android.bomb.C0381i2;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0453u3;
import com.zfork.multiplatforms.android.bomb.C0455v;
import com.zfork.multiplatforms.android.bomb.C0476y2;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.DialogC0359f0;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.DialogC0448t4;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.F5;
import com.zfork.multiplatforms.android.bomb.G4;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.InterfaceC0415o0;
import com.zfork.multiplatforms.android.bomb.InterfaceC0477y3;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.N;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q;
import com.zfork.multiplatforms.android.bomb.Q0;
import com.zfork.multiplatforms.android.bomb.Q2;
import com.zfork.multiplatforms.android.bomb.Q4;
import com.zfork.multiplatforms.android.bomb.R2;
import com.zfork.multiplatforms.android.bomb.S4;
import com.zfork.multiplatforms.android.bomb.T;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0332b1;
import com.zfork.multiplatforms.android.bomb.Y1;
import com.zfork.multiplatforms.android.bomb.o5;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.FileVisitResult;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.android.apksig.apk.ۣۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0016 {

    /* JADX INFO: renamed from: ۣۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int f40 = -38;

    /* JADX INFO: renamed from: ۟۟۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static Enumeration m601(Object obj) {
        if (C0064.m4578() > 0) {
            return ((JarFile) obj).entries();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static float m602(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((MotionEvent) obj).getRawY();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m603(Object obj) {
        if (C0033.m3358() < 0) {
            return ((G4) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m604() {
        if (C0019.m1311() == 0) {
            return "OpenSSLMac$HmacSHA224";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m605(Object obj) {
        if (C0025.m2132() > 0) {
            return ((L) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m606(Object obj, Object obj2) {
        if (C0027.m2460() >= 0) {
            ((C0444t0) obj).setOnSelectPlanListener((InterfaceC0477y3) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m607(Object obj, Object obj2) {
        if (C0035.m3569() <= 0) {
            ((T) obj).e((R2) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m608(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((LinkedTreeMap) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m609(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo.ContentDigest) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m610(Object obj) {
        if (C0021.m1598() < 0) {
            return ((Activity) obj).isFinishing();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static HashSet m611(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((O2) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m612() {
        if (C0076.m6903() <= 0) {
            return TypeAdapters.TIMESTAMP_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m613(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((C0357e5) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۦ, reason: not valid java name and contains not printable characters */
    public static float m614(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((U3) obj).A;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m615(Object obj, int i) {
        if (m717() <= 0) {
            ((Canvas) obj).drawColor(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۢ, reason: not valid java name and contains not printable characters */
    public static DataSource m616(Object obj, Object obj2) {
        if (C0065.m4647() >= 0) {
            return ApkSigningBlockUtils.copyWithModifiedCDOffset((DataSource) obj, (DataSource) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۢۦ, reason: not valid java name and contains not printable characters */
    public static int m617(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((ScriptJumpBean) obj).scriptActionIndex;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢۡ, reason: not valid java name and contains not printable characters */
    public static C0376h3 m618() {
        if (C0027.m2460() >= 0) {
            return C0376h3.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۧ, reason: not valid java name and contains not printable characters */
    public static ApkSignerEngine.InputJarEntryInstructions.OutputPolicy m619() {
        if (C0111.m13165() < 0) {
            return ApkSignerEngine.InputJarEntryInstructions.OutputPolicy.OUTPUT_BY_ENGINE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static int m620(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((C0377h4) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡ۠, reason: not valid java name and contains not printable characters */
    public static long m621(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((ZipSections) obj).getZipEndOfCentralDirectoryOffset();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m622() {
        if (C0026.m2298() < 0) {
            return "<destkeystore>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m623() {
        if (C0070.m5903() >= 0) {
            return "Alg.Alias.Signature.1.2.840.10045.4.3.2";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static int m624(Object obj, Object obj2) {
        if (C0020.m1385() <= 0) {
            return ((BigInteger) obj).compareTo((BigInteger) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Point m626(Object obj, Object obj2) {
        if (C0068.m5678() >= 0) {
            return ((T1) obj).g((WindowManager.LayoutParams) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۢ, reason: not valid java name and contains not printable characters */
    public static long m627(Object obj, long j) {
        if (C0111.m13165() < 0) {
            return ((InputStream) obj).skip(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡ۠, reason: not valid java name and contains not printable characters */
    public static DialogC0359f0 m628(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((C0352e0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m629(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((C0476y2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m630(Object obj) {
        if (m717() < 0) {
            return ((C0369g3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m631(Object obj) {
        if (C0017.m846() > 0) {
            return ((AndroidBinXmlParser) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m632(char c) {
        if (C0066.m4827() > 0) {
            return Character.isLowerCase(c);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠۟, reason: not valid java name and contains not printable characters */
    public static String m633(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۤۡۨ, reason: not valid java name and contains not printable characters */
    public static int m634(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((C0455v) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m635(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((AutoClickPointerBean) obj).getClickIntervalEnd();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m636(Object obj) throws IOException {
        if (C0070.m5903() >= 0) {
            ((FileInputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m637(int i) {
        if (C0037.m3837() <= 0) {
            return BerEncoding.tagNumberToString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m638(int i) {
        if (C0037.m3837() <= 0) {
            return Modifier.isStatic(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨۦ, reason: not valid java name and contains not printable characters */
    public static JsonWriter m639(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((JsonTreeWriter) obj).nullValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢۡ, reason: not valid java name and contains not printable characters */
    public static void m640(Object obj, int i) {
        if (C0035.m3569() < 0) {
            ((Paint) obj).setAlpha(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m641(Object obj) {
        if (C0034.m3450() > 0) {
            return ((ThreadLocal) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۦۧ, reason: not valid java name and contains not printable characters */
    public static FileVisitResult m642(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((AbstractC0378i) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m643(Object obj) {
        if (C0017.m846() > 0) {
            return ((Q) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static SignatureInfo m644(Object obj, Object obj2, int i) {
        if (C0063.m4427() >= 0) {
            return ApkSigningBlockUtilsLite.findSignature((DataSource) obj, (ZipSections) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m645() {
        if (C0078.m7450() > 0) {
            return ApkVerifier.Issue.JAR_SIG_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m646(Object obj) {
        if (C0068.m5678() >= 0) {
            return AbstractC0406m3.i((AbstractC0384j) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static JsonElement m647(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((JsonStreamParser) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static EditText m648(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((DialogC0389j4) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۧۧ, reason: not valid java name and contains not printable characters */
    public static int m649(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((Q2) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۤ, reason: not valid java name and contains not printable characters */
    public static Bundle m650(Object obj) {
        if (C0018.m1064() > 0) {
            return ((Message) obj).getData();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۡ, reason: not valid java name and contains not printable characters */
    public static void m651(Object obj, Object obj2, int i) {
        if (C0073.m6356() <= 0) {
            ((Activity) obj).startActivityForResult((Intent) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static List m652(Object obj) {
        if (C0036.m3653() < 0) {
            return C0029.m2732((ApkVerifier.Result.V1SchemeSignerInfo) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠۟, reason: not valid java name and contains not printable characters */
    public static byte[] m653(Object obj, Object obj2) {
        if (C0021.m1598() < 0) {
            return ((MessageDigest) obj).digest((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m654(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((N) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢ۟, reason: not valid java name and contains not printable characters */
    public static int m655(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((View) obj).getVisibility();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۥۣ, reason: not valid java name and contains not printable characters */
    public static void m656(Object obj, Object obj2, int i) {
        if (C0026.m2298() < 0) {
            ((C0387j2) obj).x((OutputStream) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static LinearLayout m657(Object obj) {
        if (C0031.m3075() > 0) {
            return ((C0381i2) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static List m658(Object obj) {
        if (C0070.m5903() > 0) {
            return ((ApkVerifier.Result.V2SchemeSignerInfo) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m659(Object obj, Object obj2) {
        if (C0037.m3837() < 0) {
            return C0074.m6562((Collection) obj, (Asn1Type) obj2, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m660(Object obj, boolean z) {
        if (C0066.m4827() > 0) {
            return ((ApkSigner.Builder) obj).setOtherSignersSignaturesPreserved(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m661(Object obj) {
        if (C0017.m846() > 0) {
            return ((SourceStampVerifier.Result.SourceStampInfo) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static String m662() {
        if (C0073.m6356() <= 0) {
            return "Certificate.fingerprint.SHA1.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤۨ, reason: not valid java name and contains not printable characters */
    public static TextView m663(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((DialogC0359f0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m664(Object obj, int i) {
        if (C0031.m3075() >= 0) {
            InputStreamBerDataValueReader.d((InputStream) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static Object m665(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((Y1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static Charset m666(Object obj) {
        if (C0073.m6356() <= 0) {
            return Charset.forName((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۦۣ, reason: not valid java name and contains not printable characters */
    public static void m667(Object obj, Object obj2) {
        if (C0017.m846() >= 0) {
            o5.z((InputStream) obj, (OutputStream) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static void m668(Object obj, Object obj2, int i) {
        if (C0033.m3358() < 0) {
            ((InterfaceC0415o0) obj).b((DialogC0421p0) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m669(Object obj) {
        if (C0076.m6903() < 0) {
            return ((StringTokenizer) obj).hasMoreTokens();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۧۦ, reason: not valid java name and contains not printable characters */
    public static Uri m670(Object obj) {
        if (C0036.m3653() < 0) {
            return ((T2) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۢۥ, reason: not valid java name and contains not printable characters */
    public static String m671(Object obj) {
        if (C0031.m3075() > 0) {
            return ((V1SchemeVerifier.ObjectIdentifierChoice) obj).value;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۡ, reason: not valid java name and contains not printable characters */
    public static String m672() {
        if (C0068.m5678() >= 0) {
            return "Alg.Alias.Signature.SHA224/ECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۨۨ, reason: not valid java name and contains not printable characters */
    public static int m673(Object obj) {
        if (C0076.m6903() < 0) {
            return ((AutoClickPlanBean) obj).getLoopNum();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static long m674(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((Q0) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.Result m675(Object obj) {
        if (C0077.m7272() < 0) {
            return ((V3SchemeVerifier) obj).verify();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m676(Object obj, Object obj2, Object obj3) {
        if (C0078.m7450() > 0) {
            return O2.C((BufferedReader) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static X509Certificate m677(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((SigningCertificateLineage.SignerConfig) obj).getCertificate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int m678(Object obj) {
        if (C0111.m13165() < 0) {
            return ((F5) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢۦۨ, reason: not valid java name and contains not printable characters */
    public static void m679(Object obj, Object obj2) {
        if (C0072.m6216() >= 0) {
            ((E5) obj).b((F5) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢ۠۠, reason: not valid java name and contains not printable characters */
    public static String m680() {
        if (C0038.m4010() >= 0) {
            return "<providername>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static File[] m681(Object obj) {
        if (C0064.m4578() > 0) {
            return ((C0453u3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۡۡ, reason: not valid java name and contains not printable characters */
    public static JsonWriter m682(Object obj, boolean z) {
        if (C0063.m4427() >= 0) {
            return ((JsonWriter) obj).value(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static Date m683(Object obj, Object obj2) {
        if (C0039.m4109() >= 0) {
            return ((DateTypeAdapter) obj).read2((JsonReader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m684(Object obj, Object obj2, int i, Object obj3) {
        if (C0072.m6216() >= 0) {
            return ((AlertDialog.Builder) obj).setSingleChoiceItems((CharSequence[]) obj2, i, (DialogInterface.OnClickListener) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Buffer m685(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((ByteBuffer) obj).reset();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۨ, reason: not valid java name and contains not printable characters */
    public static String m686() {
        if (C0075.m6893() > 0) {
            return "x509.info";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static void m687(Object obj, Object obj2) {
        if (C0019.m1311() == 0) {
            ((View) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۦۣ, reason: not valid java name and contains not printable characters */
    public static void m688(Object obj, Object obj2, int i, int i2) {
        if (C0032.m3184() < 0) {
            ((AbstractC0325a1) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۦۦ, reason: not valid java name and contains not printable characters */
    public static String m689() {
        if (C0111.m13165() <= 0) {
            return "New.certificate.self.signed.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static CharsetEncoder m690(Object obj) {
        if (C0074.m6454() < 0) {
            return ((Charset) obj).newEncoder();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m691(Object obj) {
        if (C0074.m6454() < 0) {
            return ((V4Signature.SigningInfo) obj).additionalData;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۢۤ, reason: not valid java name and contains not printable characters */
    public static String m692() {
        if (C0031.m3075() > 0) {
            return "OpenSSLCipherRSA$PKCS1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۤۨ, reason: not valid java name and contains not printable characters */
    public static void m693(Object obj, Object obj2) {
        if (C0030.m2940() > 0) {
            ((Window) obj).injectInputEvent((InputEvent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String m694() {
        if (C0036.m3653() < 0) {
            return "Alg.Alias.Mac.1.2.840.113549.2.11";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m695(Object obj, Object obj2) {
        if (C0017.m846() > 0) {
            return TypeAdapters.newTypeHierarchyFactory((Class) obj, (TypeAdapter) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m696(Object obj) {
        if (C0065.m4647() > 0) {
            return ((ApkSigner.Builder) obj).g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۥۨۨ, reason: not valid java name and contains not printable characters */
    public static void m697(Object obj, boolean z) {
        if (C0074.m6454() <= 0) {
            ((I1) obj).setPointerHideView(z);
        }
    }

    /* JADX INFO: renamed from: ۣۤۧۡ, reason: not valid java name and contains not printable characters */
    public static int m698(Object obj) {
        if (C0065.m4647() > 0) {
            return ((V3SchemeVerifier.Builder) obj).h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۢ, reason: contains not printable characters */
    public static BigDecimal m699(Object obj) {
        if (C0067.m5468() < 0) {
            return ((JsonElement) obj).getAsBigDecimal();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡ, reason: contains not printable characters */
    public static boolean m700(Object obj) {
        if (C0066.m4827() > 0) {
            return ((K0) obj).n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۤ, reason: contains not printable characters */
    public static Paint.Style m701() {
        if (C0019.m1311() == 0) {
            return Paint.Style.STROKE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۟, reason: contains not printable characters */
    public static S4 m702() {
        if (C0035.m3569() <= 0) {
            return S4.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۡۡ, reason: contains not printable characters */
    public static String m703(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((ApplicationInfo) obj).packageName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۣ۠, reason: contains not printable characters */
    public static long m704(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۧۧۦ, reason: contains not printable characters */
    public static void m705(int i, Object obj) {
        if (C0036.m3653() < 0) {
            C0387j2.s(i, (byte[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۦۣ۠ۥ, reason: contains not printable characters */
    public static void m706(Object obj, Object obj2, boolean z) {
        if (C0074.m6454() <= 0) {
            ((C0) obj).n((Context) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۦۡۥۡ, reason: contains not printable characters */
    public static int m707(Object obj) {
        if (C0017.m846() > 0) {
            return ((ApkSigResult) obj).signatureSchemeVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢۢۢ, reason: contains not printable characters */
    public static ArrayList m708(Object obj) {
        if (C0066.m4827() > 0) {
            return ((V1SchemeVerifier.Result.SignerInfo) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۦۦ, reason: contains not printable characters */
    public static void m709(Object obj, Object obj2, Object obj3) {
        if (C0111.m13165() <= 0) {
            ((C0479z) obj).n((Context) obj2, (AutoClickPlanBean) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦۣۢۦ, reason: contains not printable characters */
    public static Attributes.Name m710() {
        if (C0068.m5678() >= 0) {
            return V1SchemeSigner.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۤۧ, reason: contains not printable characters */
    public static ApkVerifier.Issue m711() {
        if (C0037.m3837() < 0) {
            return ApkVerifier.Issue.JAR_SIG_PARSE_EXCEPTION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۦ۟, reason: contains not printable characters */
    public static Class m712(Object obj) {
        if (C0020.m1385() < 0) {
            return ((Class) obj).getComponentType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣۡ, reason: contains not printable characters */
    public static void m713(Object obj, Object obj2) {
        if (C0023.m1921() > 0) {
            ((ImageView) obj).setImageDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۧ۟۟, reason: contains not printable characters */
    public static String m714() {
        if (C0071.m6069() >= 0) {
            return "Alg.Alias.Mac.HMAC-SHA512";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۦۤ, reason: contains not printable characters */
    public static void m715(Object obj, Object obj2, Object obj3) {
        if (C0037.m3837() <= 0) {
            ((Gson) obj).toJson((JsonElement) obj2, (Appendable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧ۟, reason: not valid java name and contains not printable characters */
    public static FileVisitResult m716() {
        if (C0026.m2298() <= 0) {
            return FileVisitResult.TERMINATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m717() {
        return (-1750788) ^ C0032.m3236((Object) "ۣۧۧ");
    }

    /* JADX INFO: renamed from: ۧ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m718() {
        if (C0064.m4578() >= 0) {
            return "What.is.the.two.letter.country.code.for.this.unit.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m719() {
        if (C0027.m2460() >= 0) {
            return "OpenSSLSignature$SHA1RSAPSS";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static File m720(Object obj) {
        if (C0074.m6454() < 0) {
            return ((Q4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m721(Object obj, Object obj2, Object obj3) {
        if (C0067.m5468() < 0) {
            return ((Attributes) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m722(Object obj, int i, float f) {
        if (C0019.m1311() <= 0) {
            ((TextView) obj).setTextSize(i, f);
        }
    }

    /* JADX INFO: renamed from: ۨۥۨۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Result.SourceStampInfo m723(Object obj) {
        if (C0035.m3569() < 0) {
            return ((ApkVerifier.Result) obj).getSourceStampInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧۨ, reason: not valid java name and contains not printable characters */
    public static ConsumerAbility m724(Object obj) {
        if (m717() < 0) {
            return ((ViewOnClickListenerC0332b1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m725(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((DialogC0448t4) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۧۦ, reason: not valid java name and contains not printable characters */
    public static X509Certificate m726(Object obj, Object obj2) {
        if (C0035.m3569() <= 0) {
            return X509CertificateUtils.generateCertificate((byte[]) obj, (CertificateFactory) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m727(Object obj) {
        if (C0064.m4578() > 0) {
            return ((AbstractC0384j) obj).s;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static String m625(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
