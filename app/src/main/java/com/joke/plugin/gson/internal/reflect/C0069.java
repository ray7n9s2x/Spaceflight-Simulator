package com.joke.plugin.gson.internal.reflect;

import android.app.Activity;
import android.app.Application;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
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
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSigResult;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ApkSigningBlockUtilsLite;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.SourceStampCertificateLineage;
import com.android.apksig.internal.apk.v2.V2SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerEncoding;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.pkcs7.SignerIdentifier;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.InclusiveIntRange;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
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
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.annotations.JsonAdapter;
import com.joke.plugin.gson.internal.ConstructorConstructor;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptActionBean;
import com.joke.script.bean.ScriptRecordBean;
import com.joke.speedfloatingball.bean.CloudBean;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0410n1;
import com.zfork.multiplatforms.android.bomb.B;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0341c3;
import com.zfork.multiplatforms.android.bomb.C0355e3;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0362f3;
import com.zfork.multiplatforms.android.bomb.C0369g3;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0392k1;
import com.zfork.multiplatforms.android.bomb.C0398l1;
import com.zfork.multiplatforms.android.bomb.C0439s1;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0450u0;
import com.zfork.multiplatforms.android.bomb.C0469x1;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.D1;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0403m0;
import com.zfork.multiplatforms.android.bomb.E;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.F;
import com.zfork.multiplatforms.android.bomb.H4;
import com.zfork.multiplatforms.android.bomb.InterfaceC0464w2;
import com.zfork.multiplatforms.android.bomb.InterfaceC0471x3;
import com.zfork.multiplatforms.android.bomb.M;
import com.zfork.multiplatforms.android.bomb.M3;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N0;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.P;
import com.zfork.multiplatforms.android.bomb.R1;
import com.zfork.multiplatforms.android.bomb.U0;
import com.zfork.multiplatforms.android.bomb.V2;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0349d4;
import com.zfork.multiplatforms.android.bomb.Y4;
import com.zfork.multiplatforms.android.bomb.Z4;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.s5;
import com.zfork.multiplatforms.android.bomb.x5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import org.conscrypt.C0111;
import org.conscrypt.NativeCrypto;
import sun.misc.BASE64Decoder;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.joke.plugin.gson.internal.reflect.ۢۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0069 {

    /* JADX INFO: renamed from: ۤۡ, reason: not valid java name and contains not printable characters */
    public static int f206 = -4;

    /* JADX INFO: renamed from: ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m5695(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((ViewOnClickListenerC0349d4) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m5696(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((ApplicationInfo) obj).dataDir;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m5697(Object obj) {
        if (C0017.m846() >= 0) {
            return ((Certificate) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۥۤ, reason: not valid java name and contains not printable characters */
    public static short m5698(Object obj) {
        if (C0064.m4578() > 0) {
            return Short.parseShort((String) obj);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m5699(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((R1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5700(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((C0361f2) obj).J;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m5701() {
        if (C0065.m4647() >= 0) {
            return SignatureAlgorithm.RSA_PKCS1_V1_5_WITH_SHA512;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static ClipData m5702(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((Intent) obj).getClipData();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m5703(Object obj) {
        if (C0076.m6903() < 0) {
            return ((ApkSignerInfo) obj).index;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m5704(Object obj) {
        if (C0077.m7272() < 0) {
            return ((C0355e3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5705(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((ApkSigner.Builder) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m5706() {
        if (C0111.m13165() <= 0) {
            return o5.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static String m5707() {
        if (C0017.m846() > 0) {
            return "Alg.Alias.Mac.2.16.840.1.101.3.4.2.1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5708(Object obj, Object obj2) {
        if (C0036.m3653() < 0) {
            return ((List) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m5709() {
        if (C0016.m717() <= 0) {
            return "OpenSSLEvpCipherAES$AES_256$CBC$NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۧۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m5710(Object obj, Object obj2) {
        if (C0029.m2791() >= 0) {
            return ((BASE64Decoder) obj).decodeBuffer((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m5711(Object obj) {
        if (C0076.m6903() <= 0) {
            ((N0) obj).cancel();
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5712(Object obj) {
        if (C0021.m1598() < 0) {
            return ((DefaultApkSignerEngine.Builder) obj).q;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5713() {
        if (C0035.m3569() <= 0) {
            return ApkVerifier.Issue.UNEXPECTED_EXCEPTION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۢۨ, reason: not valid java name and contains not printable characters */
    public static int m5714(Object obj) {
        if (C0025.m2132() > 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).getMinSdkVersion();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۢۤۥ, reason: not valid java name and contains not printable characters */
    public static View m5715(Object obj) {
        if (C0025.m2132() > 0) {
            return F.c((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m5716(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((ByteArrayOutputStream) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤۨۡ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerCapabilities m5717(Object obj, Object obj2) {
        if (C0072.m6216() >= 0) {
            return ((SigningCertificateLineage) obj).getSignerCapabilities((X509Certificate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥ۟, reason: not valid java name and contains not printable characters */
    public static String m5718(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۨۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5719(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((ByteBuffer) obj).hasArray();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦۥ, reason: not valid java name and contains not printable characters */
    public static String m5720(Object obj) {
        if (C0027.m2460() > 0) {
            return ((DefaultApkSignerEngine.Builder) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m5721(Object obj, Object obj2) {
        if (C0036.m3653() < 0) {
            return ((C0444t0) obj).a((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧ۠, reason: not valid java name and contains not printable characters */
    public static void m5722(Object obj) {
        if (C0034.m3450() > 0) {
            O1.e((O1) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۡۤ, reason: not valid java name and contains not printable characters */
    public static int m5723(Object obj) {
        if (C0018.m1064() > 0) {
            return ((M) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5724(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((C0439s1) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static String m5725() {
        if (C0019.m1311() <= 0) {
            return "Validity.must.be.greater.than.zero";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m5726(Object obj, int i, Object obj2) {
        if (C0027.m2460() > 0) {
            ((C0479z) obj).m(i, (ScriptRecordBean) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m5727(Object obj, Object obj2, int i, int i2) throws IOException {
        if (C0071.m6069() > 0) {
            ((RandomAccessFile) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m5728(Object obj) {
        if (C0076.m6903() < 0) {
            return ((Type) obj).getTypeName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m5729(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0038.m4010() > 0) {
            return ((JsonAdapterAnnotationTypeAdapterFactory) obj).getTypeAdapter((ConstructorConstructor) obj2, (Gson) obj3, (TypeToken) obj4, (JsonAdapter) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static List m5730(Object obj) {
        if (C0077.m7272() < 0) {
            return o5.l((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m5731(Object obj, Object obj2) {
        if (C0026.m2298() <= 0) {
            ((P) obj).setStartPoint((Point) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5732(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((C0369g3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static void m5733(Object obj, Object obj2, int i) {
        if (C0023.m1921() > 0) {
            ((C0387j2) obj).t((OutputStream) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static long m5734(Object obj) {
        if (C0067.m5468() < 0) {
            return ((s5) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۡۢۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m5735(Object obj) {
        if (C0039.m4109() > 0) {
            return ((Z4) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static void m5736(Object obj, boolean z) {
        if (C0074.m6454() < 0) {
            ((WebSettings) obj).setDomStorageEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m5737(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((C0357e5) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m5738(Object obj) {
        if (C0032.m3184() < 0) {
            return ((V4Signature.SigningInfo) obj).apkDigest;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۢۥ, reason: not valid java name and contains not printable characters */
    public static void m5739(Object obj) {
        if (C0027.m2460() >= 0) {
            ((DefaultApkSignerEngine) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۢ, reason: not valid java name and contains not printable characters */
    public static TextView m5740(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((DialogC0403m0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۡ, reason: not valid java name and contains not printable characters */
    public static int m5741(Object obj, Object obj2, int i, int i2) {
        if (C0024.m2011() <= 0) {
            return ((Deflater) obj).deflate((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static void m5742(Object obj, float f, float f2, float f3, float f4, Object obj2) {
        if (C0021.m1598() < 0) {
            ((Canvas) obj).drawRect(f, f2, f3, f4, (Paint) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m5743(Object obj, Object obj2, long j, Object obj3) {
        if (C0025.m2132() > 0) {
            LocalFileRecord.outputUncompressedData((DataSource) obj, (CentralDirectoryRecord) obj2, j, (DataSink) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m5744(Object obj) {
        if (C0030.m2940() > 0) {
            return ((DialogC0373h0) obj).s;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static int m5745() {
        if (C0071.m6069() >= 0) {
            return ApkSigningBlockUtils.ANDROID_COMMON_PAGE_ALIGNMENT_BYTES;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡۤۡ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m5746(Object obj, Object obj2, Object obj3) {
        if (C0070.m5903() >= 0) {
            return ((Gson) obj).getDelegateAdapter((TypeAdapterFactory) obj2, (TypeToken) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۨ۠, reason: not valid java name and contains not printable characters */
    public static X509Certificate m5747(Object obj, Object obj2) {
        if (C0017.m846() > 0) {
            return com.android.apksig.internal.x509.Certificate.findCertificate((Collection) obj, (SignerIdentifier) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۤۦ, reason: not valid java name and contains not printable characters */
    public static HashSet m5748() {
        if (C0078.m7450() > 0) {
            return NativeCrypto.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۤۥ, reason: not valid java name and contains not printable characters */
    public static Drawable m5749(Object obj) {
        if (C0075.m6893() >= 0) {
            return E.g((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۥۥ, reason: not valid java name and contains not printable characters */
    public static Attributes.Name m5750() {
        if (C0034.m3450() >= 0) {
            return Attributes.Name.SIGNATURE_VERSION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m5751(Object obj) {
        if (C0025.m2132() > 0) {
            return ((Path) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m5752(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((ManifestParser) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m5753() {
        if (C0068.m5678() > 0) {
            return Asn1Type.GENERALIZED_TIME;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۟۟, reason: not valid java name and contains not printable characters */
    public static View m5754(Object obj) {
        if (C0017.m846() >= 0) {
            return ((C0) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۤ, reason: not valid java name and contains not printable characters */
    public static E1 m5755(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((A5) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m5756(Object obj) throws IOException {
        if (C0028.m2593() >= 0) {
            ((ByteArrayOutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5757(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((C0362f3) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۦۥ, reason: not valid java name and contains not printable characters */
    public static int m5758(Object obj, Object obj2, int i) {
        if (C0065.m4647() > 0) {
            return ((SharedPreferences) obj).getInt((String) obj2, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۥ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.Builder m5759(Object obj, boolean z) {
        if (C0072.m6216() >= 0) {
            return ((DefaultApkSignerEngine.Builder) obj).setSourceStampTimestampEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m5760(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((Number) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m5761(Object obj, Object obj2) {
        if (C0070.m5903() >= 0) {
            return ((HashMap) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5762(Object obj, Object obj2) {
        if (C0068.m5678() > 0) {
            return ((Handler) obj).sendMessage((Message) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤ۠, reason: not valid java name and contains not printable characters */
    public static int m5763(Object obj) {
        if (C0016.m717() < 0) {
            return ((AndroidBinXmlParser) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۡ, reason: not valid java name and contains not printable characters */
    public static DateFormat m5764(int i) {
        if (C0075.m6893() > 0) {
            return DateFormat.getDateInstance(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۧ, reason: not valid java name and contains not printable characters */
    public static Field m5765(Object obj, Object obj2) {
        if (C0018.m1064() > 0) {
            return ((Class) obj).getDeclaredField((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥ۟, reason: not valid java name and contains not printable characters */
    public static Date m5766(Object obj) {
        if (C0072.m6216() > 0) {
            return ((X509Certificate) obj).getNotAfter();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static String m5767(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((CharBuffer) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static String m5768() {
        if (C0070.m5903() > 0) {
            return "Alg.Alias.Cipher.AES_128/CBC/PKCS7Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m5769(Object obj, Object obj2) {
        if (C0038.m4010() >= 0) {
            ((C0469x1) obj).b((CloudBean) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5770(Object obj, Object obj2) {
        if (C0078.m7450() >= 0) {
            return Arrays.equals((char[]) obj, (char[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۢۤۦ, reason: not valid java name and contains not printable characters */
    public static int m5771(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((ManifestParser.Section) obj).getSizeBytes();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static String m5772() {
        if (C0028.m2593() > 0) {
            return "AES/CBC/PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static GradientDrawable m5773(Object obj) {
        if (C0029.m2791() > 0) {
            return C0.c((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static String m5774(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((ApkSigner.SignerConfig) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static void m5775(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        if (C0111.m13165() < 0) {
            V2SchemeVerifier.a((ByteBuffer) obj, (CertificateFactory) obj2, (ApkSigningBlockUtils.Result.SignerInfo) obj3, (Set) obj4, (Map) obj5, (Set) obj6, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static File[] m5776(Object obj) {
        if (C0016.m717() < 0) {
            return ((File) obj).listFiles();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static byte m5777(byte b, int i) {
        if (C0025.m2132() > 0) {
            return BerEncoding.setTagClass(b, i);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۡۨۧۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m5778(Object obj) {
        if (C0037.m3837() < 0) {
            return ((D1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5779() {
        if (C0072.m6216() >= 0) {
            return ApkVerifier.Issue.MIN_SIG_SCHEME_FOR_TARGET_SDK_NOT_MET;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۢۦ, reason: not valid java name and contains not printable characters */
    public static long m5780(Object obj) {
        if (C0072.m6216() > 0) {
            return ((SourceStampVerifier.Result.SourceStampInfo) obj).f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۢ۠, reason: not valid java name and contains not printable characters */
    public static int m5781() {
        return (-1748800) ^ C0032.m3236((Object) "ۣۡۢ");
    }

    /* JADX INFO: renamed from: ۢۤۡۨ, reason: not valid java name and contains not printable characters */
    public static int m5782(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((Y4) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۤۨ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5783(Object obj, short s) {
        if (C0070.m5903() >= 0) {
            return ((ByteBuffer) obj).putShort(s);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static JsonElement m5784(Object obj, Object obj2) {
        if (C0036.m3653() < 0) {
            return ((TypeAdapter) obj).toJsonTree(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠۟, reason: not valid java name and contains not printable characters */
    public static String m5785() {
        if (C0111.m13165() < 0) {
            return "Select from explorer";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5786(Object obj, Object obj2) {
        if (C0032.m3184() < 0) {
            return ((Map) obj).containsKey(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۨۨ, reason: not valid java name and contains not printable characters */
    public static String m5787() {
        if (C0070.m5903() > 0) {
            return "OpenSSLRSAPublicKey|java.security.interfaces.RSAPublicKey";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۧ۟, reason: not valid java name and contains not printable characters */
    public static int m5788(Object obj) {
        if (C0027.m2460() > 0) {
            return ((InclusiveIntRange) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۨۦ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5789() {
        if (C0026.m2298() < 0) {
            return ApkVerifier.Issue.JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_SIG_FILE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟۠, reason: not valid java name and contains not printable characters */
    public static C0450u0 m5790(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((B) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦۦ, reason: not valid java name and contains not printable characters */
    public static Application m5791(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((Activity) obj).getApplication();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟۠, reason: not valid java name and contains not printable characters */
    public static LinearLayout m5792(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((C0361f2) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۧ, reason: not valid java name and contains not printable characters */
    public static String m5793() {
        if (C0033.m3358() < 0) {
            return "Alg.Alias.Cipher.ARCFOUR";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m5794(long j) {
        if (C0016.m717() < 0) {
            SystemClock.sleep(j);
        }
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static byte[] m5795(Object obj) {
        if (C0065.m4647() > 0) {
            return ((x5) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۢ۠, reason: contains not printable characters */
    public static char[] m5796() {
        if (C0034.m3450() > 0) {
            return ApkSigningBlockUtilsLite.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡۡ, reason: contains not printable characters */
    public static File m5797(Object obj, Object obj2, Object obj3) {
        if (C0073.m6356() < 0) {
            return M3.b((String) obj, (String) obj2, (File) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۦ۠, reason: contains not printable characters */
    public static void m5798(Object obj) {
        if (C0034.m3450() >= 0) {
            ((C0357e5) obj).h();
        }
    }

    /* JADX INFO: renamed from: ۥۡۧۧ, reason: contains not printable characters */
    public static ByteBuffer m5799(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((CentralDirectoryRecord) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۟ۡ, reason: contains not printable characters */
    public static byte[] m5800(Object obj, Object obj2) {
        if (C0023.m1921() >= 0) {
            return AbstractC0406m3.h((String) obj, (Charset) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۧۦ, reason: contains not printable characters */
    public static String m5801(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((M4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۢ۠, reason: contains not printable characters */
    public static TextView m5802(Object obj) {
        if (C0038.m4010() > 0) {
            return ((C4) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۤۦ, reason: contains not printable characters */
    public static List m5803(Object obj) {
        if (C0071.m6069() > 0) {
            return ((ApkVerifier.Result.V2SchemeSignerInfo) obj).getWarnings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۣۧ, reason: contains not printable characters */
    public static C0341c3 m5804(Object obj) {
        if (C0067.m5468() < 0) {
            return ((U0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۧ۠, reason: contains not printable characters */
    public static void m5805(Object obj, Object obj2) {
        if (C0034.m3450() > 0) {
            C0387j2.e((D5) obj, (OutputStream) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۨۦۣ, reason: contains not printable characters */
    public static String[] m5806(Object obj, Object obj2) {
        if (C0033.m3358() <= 0) {
            return ((AssetManager) obj).list((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۠۟, reason: contains not printable characters */
    public static int m5808(Object obj) {
        if (C0027.m2460() > 0) {
            return ((BigInteger) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡ۠۟, reason: contains not printable characters */
    public static int m5809() {
        if (C0025.m2132() > 0) {
            return NativeCrypto.EVP_has_aes_hardware();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢۦۤ, reason: contains not printable characters */
    public static long m5810(Object obj) {
        if (C0017.m846() >= 0) {
            return ((CRC32) obj).getValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣۢۡ, reason: contains not printable characters */
    public static BigInteger m5811(Object obj, Object obj2) {
        if (C0037.m3837() <= 0) {
            return ((BigInteger) obj).multiply((BigInteger) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static InputStream m5812(Object obj, Object obj2) {
        if (C0077.m7272() < 0) {
            return ((AssetManager) obj).open((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨ۟, reason: contains not printable characters */
    public static int m5813(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((SourceStampCertificateLineage.SigningCertificateNode) obj).flags;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۨۢ, reason: contains not printable characters */
    public static Object m5814(Object obj) {
        if (C0038.m4010() > 0) {
            return ((V2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۠ۡ, reason: contains not printable characters */
    public static int m5815(Object obj, int i) {
        if (C0026.m2298() <= 0) {
            return ((String) obj).lastIndexOf(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۨ۟, reason: contains not printable characters */
    public static LocalFileRecord m5816(Object obj, Object obj2, long j, boolean z, boolean z2) {
        if (C0030.m2940() >= 0) {
            return LocalFileRecord.a((DataSource) obj, (CentralDirectoryRecord) obj2, j, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۥ۟, reason: contains not printable characters */
    public static InterfaceC0464w2 m5817(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((AbstractC0410n1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m5818(long j) {
        if (C0026.m2298() < 0) {
            return C0024.m2042(0, false, 2, new byte[][]{C0020.m1333(C0038.m3948(j))});
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static void m5819(Object obj, Object obj2) {
        if (C0025.m2132() > 0) {
            ApkVerifier.Result.access$200((ApkVerifier.Result) obj, (ApkSigResult) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static C0392k1 m5820(Object obj) {
        if (C0078.m7450() > 0) {
            return ((C0398l1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢ۟, reason: not valid java name and contains not printable characters */
    public static long m5821(Object obj) {
        if (C0072.m6216() > 0) {
            return ((s5) obj).j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m5822() {
        if (C0070.m5903() > 0) {
            return "Alg.Alias.Cipher.RSA/None/OAEPWithSHA-1AndMGF1Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۤ۠, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.GetJarEntryDataRequest m5823(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((DefaultApkSignerEngine) obj).z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۨۨ, reason: not valid java name and contains not printable characters */
    public static void m5824(Object obj, Object obj2) {
        if (C0021.m1598() <= 0) {
            ((Calendar) obj).setTime((Date) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static void m5825(Object obj, Object obj2, int i) {
        if (C0066.m4827() > 0) {
            ((ContentResolver) obj).releasePersistableUriPermission((Uri) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static byte m5826(Object obj) {
        if (C0066.m4827() > 0) {
            return ((ByteBuffer) obj).get();
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۨۡۥۥ, reason: not valid java name and contains not printable characters */
    public static int m5827(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((H4) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۦ۠, reason: not valid java name and contains not printable characters */
    public static List m5828(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((ApkVerifier.Result.V1SchemeSignerInfo) obj).getErrors();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۥ۟, reason: not valid java name and contains not printable characters */
    public static void m5829(Object obj, long j, Object obj2) {
        if (C0073.m6356() <= 0) {
            ((C0361f2) obj).i(j, (ScriptActionBean) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۤۨۥ, reason: not valid java name and contains not printable characters */
    public static int m5830(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((SigningCertificateLineage.SignerCapabilities.Builder) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥ۠۟, reason: not valid java name and contains not printable characters */
    public static int m5831(Object obj, long j) {
        if (C0063.m4427() >= 0) {
            return ((Unsafe) obj).getInt(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static void m5832(Object obj, Object obj2) {
        if (C0064.m4578() > 0) {
            ((InterfaceC0471x3) obj).a(obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۥۦۣ, reason: not valid java name and contains not printable characters */
    public static Display m5833(Object obj) {
        if (C0037.m3837() < 0) {
            return ((WindowManager) obj).getDefaultDisplay();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۣۣ, reason: not valid java name and contains not printable characters */
    public static void m5834(Object obj, Object obj2) {
        if (C0111.m13165() < 0) {
            C0387j2.g((AbstractC0384j) obj, (C0387j2) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۧۨ۟, reason: not valid java name and contains not printable characters */
    public static int m5835(Object obj) {
        if (C0066.m4827() > 0) {
            return ((MotionEvent) obj).getActionMasked();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۦۢ, reason: not valid java name and contains not printable characters */
    public static int m5836(Object obj) {
        if (C0034.m3450() > 0) {
            return ((ParsePosition) obj).getIndex();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۧ۟, reason: contains not printable characters */
    public static String m5807(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
