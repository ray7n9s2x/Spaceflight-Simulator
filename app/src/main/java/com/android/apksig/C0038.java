package com.android.apksig;

import android.content.Context;
import android.content.Intent;
import android.content.UriPermission;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1TagClass;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.InputStreamBerDataValueReader;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestWriter;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.ChainedDataSource;
import com.android.apksig.internal.util.VerityTreeBuilder;
import com.android.apksig.internal.util.X509CertificateUtils;
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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickBean;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonParser;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.C$Gson$Types;
import com.joke.plugin.gson.internal.Excluder;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TimeTypeAdapter;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonToken;
import com.joke.script.bean.C0074;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.speedfloatingball.bean.CloudBean;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0325a1;
import com.zfork.multiplatforms.android.bomb.B3;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0348d3;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0362f3;
import com.zfork.multiplatforms.android.bomb.C0402m;
import com.zfork.multiplatforms.android.bomb.C0404m1;
import com.zfork.multiplatforms.android.bomb.C0430q3;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0450u0;
import com.zfork.multiplatforms.android.bomb.C1;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.DialogC0359f0;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0403m0;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.DialogC0472x4;
import com.zfork.multiplatforms.android.bomb.E;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.F0;
import com.zfork.multiplatforms.android.bomb.F3;
import com.zfork.multiplatforms.android.bomb.F5;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.M;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q;
import com.zfork.multiplatforms.android.bomb.T;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0345d0;
import com.zfork.multiplatforms.android.bomb.ViewOnLongClickListenerC0339c1;
import com.zfork.multiplatforms.android.bomb.Y;
import com.zfork.multiplatforms.android.bomb.Y4;
import com.zfork.multiplatforms.android.bomb.Z4;
import com.zfork.multiplatforms.android.bomb.p5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.InetAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.KeyPair;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.android.apksig.ۦ۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0038 {

    /* JADX INFO: renamed from: ۨۤۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean f144 = true;

    /* JADX INFO: renamed from: ۟۟۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m3921(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((ApkVerifier.Result.V1SchemeSignerInfo) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static EditText m3922(Object obj) {
        if (C0037.m3837() < 0) {
            return ((DialogC0385j0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m3923() {
        if (C0039.m4109() >= 0) {
            return TypeAdapters.BOOLEAN_AS_STRING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m3924(Object obj) {
        if (C0035.m3569() < 0) {
            return ((I1) obj).getIvCloseContainer();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m3925(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((AutoClickBean) obj).getPlanName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static Excluder m3926(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((Excluder) obj).disableInnerClassSerialization();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static PublicKey m3927(Object obj) {
        if (C0075.m6893() > 0) {
            return ((KeyPair) obj).getPublic();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static long m3928(Object obj, long j) {
        if (C0078.m7450() >= 0) {
            return ((TimeUnit) obj).toNanos(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۥ, reason: not valid java name and contains not printable characters */
    public static CloudBean m3929(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((C0348d3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static List m3930(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((ApkSigner) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static List m3931(Object obj) {
        if (C0075.m6893() > 0) {
            return ((ApkVerifier.Result) obj).getV31SchemeSigners();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static int m3932(Object obj) {
        if (C0021.m1598() < 0) {
            return ((C0444t0) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static String m3933(String str) {
        String strM2993 = C0031.m2993();
        String strM29932 = C0031.m2993();
        for (int i = 0; i < 15; i++) {
            strM2993 = C0077.m7301(C0030.m2967(C0030.m2967(new StringBuffer(), strM2993), C0021.m1651(i)));
            strM29932 = C0077.m7301(C0027.m2461(C0030.m2967(new StringBuffer(), strM29932), ((int) (m3986() * ((double) 10))) ^ i));
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

    /* JADX INFO: renamed from: ۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m3934() {
        if (C0069.m5781() <= 0) {
            return "SHA512withECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3935(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((ViewOnClickListenerC0345d0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static int m3936(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((C0450u0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m3937(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((Y) obj).g();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m3938(Object obj) {
        if (C0070.m5903() > 0) {
            return C0069.m5728((Type) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3939(Object obj) {
        if (C0072.m6216() >= 0) {
            return TextUtils.isEmpty((CharSequence) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢۦ, reason: not valid java name and contains not printable characters */
    public static void m3940(Object obj, Object obj2) {
        if (C0024.m2011() < 0) {
            ((M4) obj).e((F3) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static Asn1TagClass m3941() {
        if (C0032.m3184() <= 0) {
            return Asn1TagClass.AUTOMATIC;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۣ, reason: not valid java name and contains not printable characters */
    public static List m3942(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((ApkVerifier.Result.V2SchemeSignerInfo) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3943(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((V3SchemeVerifier) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۤ۟, reason: not valid java name and contains not printable characters */
    public static void m3944(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            ((TextView) obj).setHint((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m3945() {
        if (C0065.m4647() >= 0) {
            return TimeTypeAdapter.FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static C0404m1 m3946(Object obj) {
        if (C0026.m2298() < 0) {
            return ((E5) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static int m3947(Object obj) {
        if (C0070.m5903() > 0) {
            return ((C1) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥ۟, reason: not valid java name and contains not printable characters */
    public static BigInteger m3948(long j) {
        if (C0064.m4578() >= 0) {
            return BigInteger.valueOf(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡ, reason: not valid java name and contains not printable characters */
    public static int m3949(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((p5) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m3950(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((Q) obj).m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3951(Object obj) {
        if (C0065.m4647() > 0) {
            return ((C0362f3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m3952(Object obj) {
        if (C0018.m1064() > 0) {
            return ((AutoClickPlanBean) obj).getLoopInterval();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static int m3953() {
        if (C0076.m6903() <= 0) {
            return VerityTreeBuilder.d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static int m3954(Object obj) {
        if (C0075.m6893() > 0) {
            return ((Z4) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3955(Object obj) {
        if (C0017.m846() > 0) {
            return ((Y) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static TextView m3956(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((DialogC0359f0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static String m3957(Object obj) {
        if (C0036.m3653() < 0) {
            return ((Context) obj).getPackageName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡۢ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3958(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((LocalFileRecord) obj).getExtra();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3959(Object obj) {
        if (C0077.m7272() < 0) {
            return C0024.m1973((DefaultApkSignerEngine.SignerConfig.Builder) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۨ, reason: not valid java name and contains not printable characters */
    public static void m3960(Object obj) {
        if (C0064.m4578() >= 0) {
            ((JsonReader) obj).skipValue();
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static G0 m3961(Object obj) {
        if (C0073.m6356() < 0) {
            return ((F0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۨۦ, reason: not valid java name and contains not printable characters */
    public static String m3962() {
        if (C0016.m717() <= 0) {
            return "Alg.Alias.Cipher.2.16.840.1.101.3.4.1.6";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۣ, reason: not valid java name and contains not printable characters */
    public static int m3963(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((DialogC0389j4) obj).w;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۥۧۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3964(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((ApkSigner.Builder) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m3965(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((ApkSignerEngine.OutputJarSignatureRequest.JarEntry) obj).getData();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢۧ, reason: not valid java name and contains not printable characters */
    public static void m3966(Object obj, Object obj2, Object obj3) {
        if (C0076.m6903() <= 0) {
            ((ApkSigningBlockUtils.Result.SignerInfo) obj).addError((ApkVerifier.Issue) obj2, (Object[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Y4 m3967(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((Z4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۥ, reason: not valid java name and contains not printable characters */
    public static C0450u0 m3968(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((DialogC0359f0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m3969(Object obj, Object obj2, Object obj3) {
        if (C0068.m5678() >= 0) {
            return ((HashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static JsonToken m3970() {
        if (C0024.m2011() < 0) {
            return JsonToken.END_OBJECT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥ۠, reason: not valid java name and contains not printable characters */
    public static Class m3971(Object obj) {
        if (C0027.m2460() > 0) {
            return C$Gson$Types.getRawType((Type) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3972(Object obj, float f) {
        if (C0073.m6356() <= 0) {
            ((AutoClickPointerBean) obj).setCurrPhoneX(f);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3973(Object obj, boolean z) {
        if (C0031.m3075() >= 0) {
            ((WebSettings) obj).setUseWideViewPort(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m3974(Object obj, int i, Object obj2) {
        if (C0111.m13165() < 0) {
            return ((List) obj).set(i, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m3975(Object obj) {
        if (C0016.m717() <= 0) {
            return ApkSigningBlockUtils.encodePublicKey((PublicKey) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۡۥ, reason: not valid java name and contains not printable characters */
    public static int m3976(Object obj) {
        if (C0030.m2940() > 0) {
            return ((DialogC0403m0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۧ۠, reason: not valid java name and contains not printable characters */
    public static E m3977() {
        if (C0067.m5468() <= 0) {
            return E.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۥ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3978(Object obj, Object obj2) {
        if (C0017.m846() > 0) {
            return ((StringBuilder) obj).append((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥ۟, reason: not valid java name and contains not printable characters */
    public static List m3979(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((ApkSignerEngine.OutputJarSignatureRequest) obj).getAdditionalJarEntries();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m3980(Object obj, int i) {
        if (C0036.m3653() <= 0) {
            return ((ApkSigner.Builder) obj).setMinSdkVersionForRotation(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static Path m3981(Object obj, Object obj2, Object obj3) {
        if (C0066.m4827() >= 0) {
            return Files.move((Path) obj, (Path) obj2, (CopyOption[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3982(Object obj) {
        if (C0069.m5781() < 0) {
            return ((DialogC0385j0) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static List m3983(Object obj) {
        if (C0020.m1385() < 0) {
            return ((SourceStampVerifier.Result.SourceStampInfo) obj).getWarnings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦۦ, reason: not valid java name and contains not printable characters */
    public static int m3984(Object obj) {
        if (C0017.m846() > 0) {
            return ((LocalFileRecord) obj).getDataStartOffsetInRecord();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧۦ, reason: not valid java name and contains not printable characters */
    public static Excluder m3985(Object obj, double d) {
        if (C0077.m7272() <= 0) {
            return ((Excluder) obj).withVersion(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۦ, reason: not valid java name and contains not printable characters */
    public static double m3986() {
        return C0068.m5678() >= 0 ? Math.random() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦ۟, reason: not valid java name and contains not printable characters */
    public static Buffer m3987(Object obj) {
        if (C0077.m7272() < 0) {
            return ((ByteBuffer) obj).rewind();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static C0430q3 m3988(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((AbstractC0325a1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m3989(int i) {
        if (C0018.m1064() > 0) {
            return Math.abs(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3990(Object obj) {
        if (C0076.m6903() < 0) {
            return ((ApkSigner.Builder) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static int m3991(Object obj) {
        if (C0111.m13165() < 0) {
            return ((DialogC0421p0) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m3992(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((InetAddress) obj).getHostAddress();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۨۥ, reason: not valid java name and contains not printable characters */
    public static int m3993(Object obj) {
        if (C0073.m6356() < 0) {
            return ((Phaser) obj).arriveAndAwaitAdvance();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static int m3994(Object obj) {
        if (C0077.m7272() < 0) {
            return ((M) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۡ۠۠, reason: not valid java name and contains not printable characters */
    public static byte[] m3995(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((V4Signature.SigningInfo) obj).signature;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3996() {
        if (C0070.m5903() >= 0) {
            return ApkVerifier.Issue.JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_MANIFEST;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۧ, reason: not valid java name and contains not printable characters */
    public static String m3997(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((Class) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static I1 m3998() {
        if (C0071.m6069() > 0) {
            return I1.p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۣ۟, reason: not valid java name and contains not printable characters */
    public static float m3999(Object obj) {
        if (C0111.m13165() < 0) {
            return ((MotionEvent) obj).getY();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m4000(Object obj) {
        if (C0028.m2593() > 0) {
            return ((JsonReader) obj).nextBoolean();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨۥۡ, reason: not valid java name and contains not printable characters */
    public static void m4001(Object obj, boolean z) {
        if (C0030.m2940() > 0) {
            ((T1) obj).h(z);
        }
    }

    /* JADX INFO: renamed from: ۡۨۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4002(Object obj) {
        if (m4010() > 0) {
            return ((B3) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static DirectoryStream m4003(Object obj) {
        if (C0023.m1921() > 0) {
            return Files.newDirectoryStream((Path) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m4004() {
        if (C0069.m5781() < 0) {
            return "Warning.Overwriting.existing.alias.alias.in.destination.keystore";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m4005(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((DialogC0472x4) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۥۥ, reason: not valid java name and contains not printable characters */
    public static void m4006(Object obj, Object obj2) {
        if (C0069.m5781() < 0) {
            ((T) obj).f((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۧۦ, reason: not valid java name and contains not printable characters */
    public static C0402m m4007() {
        if (C0021.m1598() < 0) {
            return C0402m.b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣ۠, reason: not valid java name and contains not printable characters */
    public static TimeUnit m4008() {
        if (C0074.m6454() < 0) {
            return TimeUnit.SECONDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣۡ, reason: not valid java name and contains not printable characters */
    public static void m4009(Object obj, Object obj2) {
        if (C0019.m1311() == 0) {
            ((C0) obj).setListener((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۧۢۡ, reason: not valid java name and contains not printable characters */
    public static int m4010() {
        return 1747769 ^ C0032.m3236((Object) "۠ۡۧ");
    }

    /* JADX INFO: renamed from: ۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m4011(Object obj, int i) {
        if (C0077.m7272() <= 0) {
            return InputStreamBerDataValueReader.b((InputStream) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m4012(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((Character) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥۤ, reason: not valid java name and contains not printable characters */
    public static ScriptProjectAliasBean m4013(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((C4) obj).N;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۨ, reason: not valid java name and contains not printable characters */
    public static List m4014(Object obj, int i, boolean z, boolean z2) {
        if (C0029.m2791() >= 0) {
            return V3SchemeSigner.getSuggestedSignatureAlgorithms((PublicKey) obj, i, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۡ, reason: not valid java name and contains not printable characters */
    public static String m4015() {
        if (C0023.m1921() > 0) {
            return "OpenSSLEvpCipherAES$AES$ECB$NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۤۨ, reason: not valid java name and contains not printable characters */
    public static void m4016(Object obj, int i, int i2, int i3, int i4) {
        if (C0017.m846() > 0) {
            ((TextView) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۣۥۥۥ, reason: not valid java name and contains not printable characters */
    public static Principal m4017(Object obj) {
        if (C0034.m3450() > 0) {
            return ((X509Certificate) obj).getIssuerDN();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥ۠, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m4018(Object obj, int i) {
        if (C0111.m13165() < 0) {
            return ((ByteBuffer) obj).putInt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4019(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((ApkVerifier.Result) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static File m4020(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((Context) obj).getCodeCacheDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static EditText m4021(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((DialogC0389j4) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4023() {
        if (C0027.m2460() > 0) {
            return ApkVerifier.Issue.V3_SIG_INVALID_SDK_VERSIONS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4024(Object obj, Object obj2) {
        if (C0070.m5903() >= 0) {
            return ((Deflater) obj).deflate((byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥۧ۟, reason: not valid java name and contains not printable characters */
    public static Intent m4025(Object obj, Object obj2, Object obj3) {
        if (C0064.m4578() > 0) {
            return ((Intent) obj).putExtra((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۨ, reason: not valid java name and contains not printable characters */
    public static TypeToken m4026(Object obj, Object obj2) {
        if (C0025.m2132() >= 0) {
            return TypeToken.getParameterized((Type) obj, (Type[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧۨ, reason: contains not printable characters */
    public static ApkSigner.Builder m4027(Object obj, Object obj2, Object obj3) {
        if (C0028.m2593() >= 0) {
            return ((ApkSigner.Builder) obj).setOutputApk((DataSink) obj2, (DataSource) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۡ, reason: contains not printable characters */
    public static DataSource m4028(Object obj) {
        if (m4010() > 0) {
            return ((ApkSigner) obj).w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۦ, reason: contains not printable characters */
    public static boolean m4029(Object obj) {
        if (C0027.m2460() > 0) {
            return ((O2) obj).H;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۧۤ, reason: contains not printable characters */
    public static Comparator m4030() {
        if (C0069.m5781() <= 0) {
            return DigestAlgorithm.BY_STRENGTH_COMPARATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۦۣ, reason: contains not printable characters */
    public static void m4031(Object obj) {
        if (C0029.m2791() >= 0) {
            ((A5) obj).f();
        }
    }

    /* JADX INFO: renamed from: ۥۧ۠۠, reason: contains not printable characters */
    public static DataSource m4032(Object obj) {
        if (m4010() >= 0) {
            return ((V3SchemeSigner.Builder) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۧ, reason: contains not printable characters */
    public static boolean m4033(int i) {
        if (C0016.m717() < 0) {
            return Modifier.isAbstract(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۨ, reason: contains not printable characters */
    public static Collection m4034(Object obj, Object obj2) {
        if (C0111.m13165() < 0) {
            return X509CertificateUtils.generateCertificates((InputStream) obj, (CertificateFactory) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ۟ۡ, reason: contains not printable characters */
    public static String m4035() {
        if (C0067.m5468() < 0) {
            return "serialNumber";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۢ, reason: contains not printable characters */
    public static void m4036(Object obj, long j, long j2, Object obj2) {
        if (C0070.m5903() > 0) {
            ((ChainedDataSource) obj).feed(j, j2, (DataSink) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۢۢ, reason: contains not printable characters */
    public static int m4037(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((K0) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۢۥ, reason: contains not printable characters */
    public static long m4038(Object obj) {
        if (C0030.m2940() > 0) {
            return ((CentralDirectoryRecord) obj).i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۥۧ, reason: contains not printable characters */
    public static int m4039(Object obj) {
        if (C0078.m7450() > 0) {
            return ((F5) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۨ۠, reason: contains not printable characters */
    public static V3SchemeVerifier.Builder m4040(Object obj, Object obj2) {
        if (C0029.m2791() >= 0) {
            return ((V3SchemeVerifier.Builder) obj).setResult((ApkSigningBlockUtils.Result) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static File m4041(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((ApkVerifier.Builder) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۨۤ, reason: not valid java name and contains not printable characters */
    public static Uri m4042(Object obj) {
        if (C0031.m3075() > 0) {
            return ((UriPermission) obj).getUri();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m4043(Object obj) {
        if (C0021.m1598() < 0) {
            return ((Q) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۣ۟, reason: not valid java name and contains not printable characters */
    public static String m4044(Object obj) {
        if (C0025.m2132() > 0) {
            return ((ApplicationInfo) obj).sourceDir;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Buffer m4045(Object obj) {
        if (C0039.m4109() > 0) {
            return ((ByteBuffer) obj).mark();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4046(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).containsErrors();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨۦۡ, reason: not valid java name and contains not printable characters */
    public static MatchType[] m4047() {
        if (C0066.m4827() >= 0) {
            return MatchType.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠۠, reason: not valid java name and contains not printable characters */
    public static String m4048(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((V1SchemeVerifier.Result.SignerInfo) obj).signatureFileName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static ConsumerAbility m4049(Object obj) {
        if (m4010() > 0) {
            return ((ViewOnLongClickListenerC0339c1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m4050(Object obj, Object obj2) {
        if (C0031.m3075() >= 0) {
            ((C0350d5) obj).g((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static String m4051() {
        if (C0068.m5678() > 0) {
            return "<storetype>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m4052() {
        if (C0078.m7450() >= 0) {
            return ManifestWriter.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦ۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m4053(Object obj) {
        if (C0032.m3184() < 0) {
            return JsonParser.parseString((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m4054(Object obj) {
        if (C0031.m3075() > 0) {
            return ((HashSet) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static StandardCopyOption m4055() {
        if (C0016.m717() <= 0) {
            return StandardCopyOption.REPLACE_EXISTING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦۡ, reason: not valid java name and contains not printable characters */
    public static String m4022(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
