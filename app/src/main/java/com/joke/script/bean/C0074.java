package com.joke.script.bean;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.KeyConfig;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.ApkUtils;
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
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v2.V2SchemeSigner;
import com.android.apksig.internal.apk.v2.V2SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.Asn1TagClass;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.ByteArrayDataSink;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
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
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.C$Gson$Types;
import com.joke.plugin.gson.internal.bind.ArrayTypeAdapter;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TreeTypeAdapter;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonWriter;
import com.zfork.entry.C0075;
import com.zfork.entry.MetaSelectAppAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A1;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0452u2;
import com.zfork.multiplatforms.android.bomb.B1;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0323a;
import com.zfork.multiplatforms.android.bomb.C0327a3;
import com.zfork.multiplatforms.android.bomb.C0344d;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0381i2;
import com.zfork.multiplatforms.android.bomb.C0382i3;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0453u3;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C2;
import com.zfork.multiplatforms.android.bomb.D2;
import com.zfork.multiplatforms.android.bomb.D3;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0331b0;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0448t4;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.G;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N1;
import com.zfork.multiplatforms.android.bomb.O0;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.RunnableC0346d1;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.V4;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0379i0;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0391k0;
import com.zfork.multiplatforms.android.bomb.ViewOnTouchListenerC0481z1;
import com.zfork.multiplatforms.android.bomb.W;
import com.zfork.multiplatforms.android.bomb.Y3;
import com.zfork.multiplatforms.android.bomb.Z0;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.s5;
import j$.util.Collection$EL;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PushbackInputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URLConnection;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttributeView;
import java.security.Key;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.DSAParams;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.conscrypt.C0111;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: com.joke.script.bean.ۡۡۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0074 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f219short = {1758, 1797};

    /* JADX INFO: renamed from: ۟ۥۣۨۡ, reason: not valid java name and contains not printable characters */
    public static int f220 = 43;

    /* JADX INFO: renamed from: ۣ۟۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m6443(Object obj, int i) {
        if (C0016.m717() < 0) {
            return ApkSigningBlockUtilsLite.findApkSignatureSchemeBlock((ByteBuffer) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m6444(Object obj, boolean z) {
        if (C0066.m4827() >= 0) {
            return ((ApkSigner.Builder) obj).setV3SigningEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static int m6445(int i, int i2) {
        if (C0036.m3653() <= 0) {
            return Math.max(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static ScriptState m6446() {
        if (C0031.m3075() > 0) {
            return ScriptState.NONE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static ScrollView m6447(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((C0344d) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static String m6448(Object obj) {
        if (C0070.m5903() > 0) {
            return ((Key) obj).getFormat();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static void m6449(Object obj) {
        if (C0077.m7272() <= 0) {
            ZipUtils.assertByteOrderLittleEndian((ByteBuffer) obj);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m6450(Object obj, boolean z) {
        if (C0030.m2940() > 0) {
            return ((ApkSigner.Builder) obj).setV1SigningEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static int m6451(Object obj) {
        if (C0034.m3450() > 0) {
            return ((WindowManager.LayoutParams) obj).y;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static WebSettings.PluginState m6453() {
        if (C0029.m2791() >= 0) {
            return WebSettings.PluginState.ON;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m6454() {
        return (-1755632) ^ C0032.m3236((Object) "ۨۦۡ");
    }

    /* JADX INFO: renamed from: ۟۠ۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Set m6455(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((HashMap) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static O0 m6456(Object obj) {
        if (C0036.m3653() < 0) {
            return ((O1) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Number m6457(Object obj) {
        if (C0021.m1598() < 0) {
            return ((JsonPrimitive) obj).getAsNumber();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static X509Certificate m6458(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((SourceStampVerifier.Result.SignerInfo) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static V3SchemeSigner.Builder m6459(Object obj, int i) {
        if (C0066.m4827() >= 0) {
            return ((V3SchemeSigner.Builder) obj).setBlockId(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m6460(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((ViewOnClickListenerC0391k0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static CertificateFactory m6461(Object obj) {
        if (C0025.m2132() >= 0) {
            return CertificateFactory.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m6462(Object obj, Object obj2, Object obj3) {
        if (C0038.m4010() >= 0) {
            return ((TypeAdapterFactory) obj).create((Gson) obj2, (TypeToken) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧۥ, reason: not valid java name and contains not printable characters */
    public static String m6463() {
        if (C0068.m5678() > 0) {
            return "keystore password";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m6464(Object obj, Object obj2, Object obj3) {
        if (C0019.m1311() >= 0) {
            return ((Gson) obj).fromJson((JsonElement) obj2, (Type) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۨۡ, reason: not valid java name and contains not printable characters */
    public static String m6465() {
        if (C0075.m6893() > 0) {
            return "Alg.Alias.Cipher.OID.1.2.840.113549.3.4";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۤۢ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m6466(Object obj) {
        if (C0076.m6903() < 0) {
            return ((BerDataValue) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m6467() {
        if (C0023.m1921() >= 0) {
            return TypeAdapters.URL_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static K0 m6468(Object obj) {
        if (C0028.m2593() > 0) {
            return ((C0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static void m6469(Object obj, long j) {
        if (C0071.m6069() >= 0) {
            ((Date) obj).setTime(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۡ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.Result m6470(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        if (C0067.m5468() <= 0) {
            return V2SchemeVerifier.verify((RunnablesExecutor) obj, (DataSource) obj2, (ApkUtils.ZipSections) obj3, (Map) obj4, (Set) obj5, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m6471(Object obj) {
        if (C0030.m2940() >= 0) {
            return o5.n((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m6472(Object obj) {
        if (C0018.m1064() > 0) {
            return ((SourceStampCertificateLineage.SigningCertificateNode) obj).signature;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۧ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m6473(Object obj) {
        if (C0033.m3358() <= 0) {
            return ApkSigningBlockUtils.readLengthPrefixedByteArray((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤۦ, reason: not valid java name and contains not printable characters */
    public static DSAParams m6474(Object obj) {
        if (C0029.m2791() > 0) {
            return ((DSAKey) obj).getParams();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m6475(Object obj, float f) {
        if (C0075.m6893() > 0) {
            ((AutoClickPointerBean) obj).setSlideEndRelativePercentY(f);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۡ۟, reason: not valid java name and contains not printable characters */
    public static AutoClickPlanBean m6476(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((DialogC0373h0) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static WindowManager.LayoutParams m6477(Object obj) {
        if (C0037.m3837() < 0) {
            return ((A1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static Asn1Type[] m6478() {
        if (C0063.m4427() >= 0) {
            return Asn1Type.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static long m6479(Object obj, int i, Object obj2) {
        if (C0023.m1921() >= 0) {
            return ((C0387j2) obj).m(i, (byte[]) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m6480() {
        if (C0070.m5903() >= 0) {
            return TypeAdapters.BIG_DECIMAL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static Uri m6481(Object obj) {
        if (C0023.m1921() > 0) {
            return ((T2) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۥ, reason: not valid java name and contains not printable characters */
    public static TextView m6482(Object obj) {
        if (C0077.m7272() < 0) {
            return ((DialogC0448t4) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤ۠, reason: not valid java name and contains not printable characters */
    public static void m6483(Object obj, int i) {
        if (C0029.m2791() > 0) {
            ((SeekBar) obj).setMin(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static C0479z[] m6484(Object obj) {
        if (m6454() <= 0) {
            return ((C0479z) obj).i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static V4 m6485(Object obj) {
        if (C0068.m5678() > 0) {
            return ((W) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6486(Object obj) {
        if (C0078.m7450() > 0) {
            return ((C0) obj).I;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static String m6487(Object obj, Object obj2) {
        if (C0028.m2593() > 0) {
            return MessageFormat.format((String) obj, (Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6488(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((ApkVerifier.Result) obj).isSourceStampVerified();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m6489(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((N1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۥ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m6490(Object obj, Object obj2) {
        if (C0070.m5903() >= 0) {
            return ((CharsetEncoder) obj).encode((CharBuffer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m6491(Object obj, Object obj2, int i, boolean z) {
        if (C0075.m6893() > 0) {
            return AbstractC0406m3.d((byte[]) obj, (char[]) obj2, i, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m6492(Object obj) {
        if (C0033.m3358() < 0) {
            return ((Locale) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۥ, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m6493(Object obj) {
        if (C0019.m1311() == 0) {
            return ((SourceStampCertificateLineage.SigningCertificateNode) obj).parentSigAlgorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۦ, reason: not valid java name and contains not printable characters */
    public static List m6494(Object obj) {
        if (C0025.m2132() > 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).getWarnings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤ۟, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m6495() {
        if (m6454() < 0) {
            return ArrayTypeAdapter.FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۨ, reason: not valid java name and contains not printable characters */
    public static String m6496(String str) {
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
        String strM2151 = C0025.m2151(m6578(), 0, 1, 1727);
        while (C0078.m7380(strM2151) > 0) {
            strM2151 = C0031.m2993();
            if (C0078.m7380(strM2151) == 0) {
                strM2151 = C0029.m2695(m6578(), 1, 1, 1892);
            }
        }
        int iM7380 = C0078.m7380(strM2151);
        int iM73802 = C0078.m7380(strM29932);
        for (int i3 = 0; i3 < iM7380; i3++) {
            bArrM7297[i3] = (byte) (bArrM7297[i3] ^ C0077.m7212(strM29932, i3 % iM73802));
        }
        for (int iM73803 = 0; iM73803 < bArrM7297.length; iM73803 = C0078.m7380(C0031.m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۟ۥۧۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6497(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((C0479z) obj).g();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۢ, reason: not valid java name and contains not printable characters */
    public static int m6498(Object obj) {
        if (C0021.m1598() < 0) {
            return ((MessageDigest) obj).getDigestLength();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6499() {
        if (C0027.m2460() > 0) {
            return ApkVerifier.Issue.V31_ROTATION_MIN_SDK_ATTR_MISSING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m6500() {
        if (C0066.m4827() >= 0) {
            return "Alg.Alias.Signature.2.16.840.1.101.3.4.2.3with1.2.840.10045.2.1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static long m6501(Object obj) {
        if (C0024.m2011() < 0) {
            return ((s5) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static MetaSelectAppAbility m6502(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((C0327a3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۤۦ, reason: not valid java name and contains not printable characters */
    public static String m6503(Object obj, Object obj2, Object obj3) {
        if (C0031.m3075() > 0) {
            return K3.p((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۣ, reason: not valid java name and contains not printable characters */
    public static String m6504() {
        if (C0078.m7450() > 0) {
            return "Entry.for.alias.alias.successfully.imported.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6505(Object obj, Object obj2, Object obj3) {
        if (C0067.m5468() < 0) {
            return o5.h((Context) obj, (String) obj2, (String) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢۢ, reason: not valid java name and contains not printable characters */
    public static JsonWriter m6506(Object obj, Object obj2) {
        if (C0071.m6069() > 0) {
            return ((JsonWriter) obj).value((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤ۠, reason: not valid java name and contains not printable characters */
    public static String[] m6507(Object obj, Object obj2, int i) {
        if (C0037.m3837() < 0) {
            return ((String) obj).split((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۨ, reason: not valid java name and contains not printable characters */
    public static Serializable m6508(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((D3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6509(Object obj) {
        if (C0077.m7272() < 0) {
            return ((Activity) obj).isDestroyed();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۨۧۨ, reason: not valid java name and contains not printable characters */
    public static V4Signature.SigningInfo m6510(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((V4Signature.SigningInfos) obj).signingInfo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m6511(Object obj, Object obj2, Object obj3) {
        if (C0067.m5468() < 0) {
            ((C0387j2) obj).w((E1) obj2, (ByteArrayOutputStream) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6512(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((D5) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static StandardOpenOption m6513() {
        if (C0064.m4578() >= 0) {
            return StandardOpenOption.CREATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m6514(Object obj, boolean z) {
        if (C0064.m4578() > 0) {
            ((URLConnection) obj).setDoInput(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۨ, reason: not valid java name and contains not printable characters */
    public static String m6515() {
        if (C0072.m6216() >= 0) {
            return "Alg.Alias.Mac.1.3.6.1.5.5.8.1.1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m6516(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((Buffer) obj).capacity();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠۟۟, reason: not valid java name and contains not printable characters */
    public static C0479z m6517(Object obj) {
        if (m6454() <= 0) {
            return ((ViewOnTouchListenerC0481z1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static long m6518() {
        if (C0078.m7450() >= 0) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m6519(Object obj) {
        if (C0028.m2593() > 0) {
            return ((M4) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m6520(Object obj) {
        if (C0019.m1311() <= 0) {
            return K3.s((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m6521(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((C0381i2) obj).getSize();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m6522(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((BerDataValue) obj).getTagClass();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static String m6523(Object obj) {
        if (C0069.m5781() <= 0) {
            return V1SchemeSigner.getJcaMessageDigestAlgorithm((DigestAlgorithm) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m6524(Object obj) {
        if (C0039.m4109() >= 0) {
            return obj.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static ScriptProjectBean m6525(Object obj) {
        if (C0029.m2791() > 0) {
            return ((DialogC0448t4) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۦۡ, reason: not valid java name and contains not printable characters */
    public static C2 m6526() {
        if (C0026.m2298() < 0) {
            return D2.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡ, reason: not valid java name and contains not printable characters */
    public static File m6527(Object obj) {
        if (C0065.m4647() > 0) {
            return ((ApkVerifier) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m6528(Object obj) {
        if (C0039.m4109() > 0) {
            return ((X509Certificate) obj).getTBSCertificate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ, reason: not valid java name and contains not printable characters */
    public static List m6529(Object obj) {
        if (C0035.m3569() < 0) {
            return C0032.m3215((DefaultApkSignerEngine.SignerConfig) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۣۣ, reason: not valid java name and contains not printable characters */
    public static String m6530(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((BufferedReader) obj).readLine();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۥ۠, reason: not valid java name and contains not printable characters */
    public static String m6531() {
        if (C0036.m3653() <= 0) {
            return "Alg.Alias.Signature.1.2.840.10045.4.1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۥۤ, reason: not valid java name and contains not printable characters */
    public static Object m6532(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((G) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6533(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((DefaultApkSignerEngine.Builder) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨۢۦ, reason: not valid java name and contains not printable characters */
    public static void m6534(Object obj) {
        if (C0069.m5781() < 0) {
            ((C0453u3) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۡۨۧۡ, reason: not valid java name and contains not printable characters */
    public static String m6535() {
        if (C0018.m1064() >= 0) {
            return "Alg.Alias.Cipher.AES_128/ECB/PKCS7Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ, reason: not valid java name and contains not printable characters */
    public static FileInputStream m6536(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((O2) obj).D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static DialogC0385j0 m6537(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((ViewOnClickListenerC0379i0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static int m6538(Object obj) {
        if (C0063.m4427() > 0) {
            return C0032.m3186((SigningCertificateLineage.SignerCapabilities) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static C0381i2 m6539(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((C0361f2) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠۟, reason: not valid java name and contains not printable characters */
    public static byte[] m6540(Object obj) {
        if (C0033.m3358() < 0) {
            return C0030.m2903((ByteArrayDataSink) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static void m6541(Object obj) {
        if (C0032.m3184() < 0) {
            System.load((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۡۥ, reason: not valid java name and contains not printable characters */
    public static AutoClickPlanBean m6542(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((O1) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static float m6543(Object obj) {
        if (C0019.m1311() == 0) {
            return ((B1) obj).f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6544(Object obj) {
        if (C0017.m846() >= 0) {
            return ((AutoClickPlanBean) obj).isChecked();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۦ۠, reason: not valid java name and contains not printable characters */
    public static String m6545() {
        if (C0039.m4109() >= 0) {
            return "Alg.Alias.Signature.SHA384withRSAandMGF1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m6546(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((DefaultApkSignerEngine) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۡۢ, reason: not valid java name and contains not printable characters */
    public static Type m6547(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((Class) obj).getGenericSuperclass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۣۡ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m6548(Object obj) {
        if (C0020.m1385() < 0) {
            return ((C0361f2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۧ, reason: not valid java name and contains not printable characters */
    public static int m6549(Object obj) {
        if (C0018.m1064() > 0) {
            return ((Message) obj).what;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m6550(Object obj) {
        if (C0025.m2132() >= 0) {
            ApkSigningBlockUtils.checkByteOrderLittleEndian((ByteBuffer) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۤۡ, reason: not valid java name and contains not printable characters */
    public static void m6551(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        if (C0036.m3653() < 0) {
            ((Y3) obj).h((ArrayList) obj2, (E1) obj3, (String) obj4, (byte[]) obj5, i);
        }
    }

    /* JADX INFO: renamed from: ۣۤۢۧ, reason: not valid java name and contains not printable characters */
    public static int m6552(Object obj) {
        if (C0034.m3450() > 0) {
            return ((RunnableC0346d1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۦ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m6553(Object obj, int i, boolean z) {
        if (C0017.m846() > 0) {
            return ((DefaultApkSignerEngine) obj).e(i, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۥ۠, reason: not valid java name and contains not printable characters */
    public static File m6554(Object obj) {
        if (C0077.m7272() <= 0) {
            return AbstractC0452u2.a((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۢۢ, reason: not valid java name and contains not printable characters */
    public static long m6555(Object obj) {
        if (C0038.m4010() > 0) {
            return ((D5) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۦۤ۠, reason: not valid java name and contains not printable characters */
    public static String m6556() {
        if (C0027.m2460() >= 0) {
            return "Your.keystore.contains.keyStore.size.entries";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۡۢ, reason: not valid java name and contains not printable characters */
    public static long m6557(int i) {
        if (C0036.m3653() <= 0) {
            return K3.j(i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۤۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6558(Object obj) {
        if (C0065.m4647() > 0) {
            return ((SourceStampVerifier.Result.SourceStampInfo) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۦۥ, reason: contains not printable characters */
    public static ArrayList m6559(Object obj, Object obj2) {
        if (C0078.m7450() >= 0) {
            return ((DefaultApkSignerEngine) obj).k((ArrayList) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۤۤ, reason: contains not printable characters */
    public static boolean m6560(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((V3SchemeVerifier.Builder) obj).j;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۧۨ, reason: contains not printable characters */
    public static KeyConfig m6561(Object obj) {
        if (C0066.m4827() > 0) {
            return C0027.m2415((ApkSigner.SignerConfig.Builder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۟ۧ, reason: contains not printable characters */
    public static byte[] m6562(Object obj, Object obj2, boolean z) {
        if (C0067.m5468() <= 0) {
            return Asn1DerEncoder.f((Collection) obj, (Asn1Type) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ۠ۥ, reason: contains not printable characters */
    public static List m6563(Object obj) {
        if (C0039.m4109() > 0) {
            return ((ApkVerifier.Result) obj).getV1SchemeSigners();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠۟۠, reason: contains not printable characters */
    public static String m6564() {
        if (C0020.m1385() <= 0) {
            return "OpenSSLMac$HmacSHA1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢ, reason: contains not printable characters */
    public static Stream m6565(Object obj) {
        if (C0024.m2011() <= 0) {
            return Collection$EL.stream((Collection) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۦۨ, reason: contains not printable characters */
    public static KeyStore m6566(Object obj, Object obj2) {
        if (C0033.m3358() <= 0) {
            return KeyStore.getInstance((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤ۠, reason: contains not printable characters */
    public static void m6567(Object obj) {
        if (C0035.m3569() <= 0) {
            ApkSigningBlockUtilsLite.checkByteOrderLittleEndian((ByteBuffer) obj);
        }
    }

    /* JADX INFO: renamed from: ۦۧۥۧ, reason: contains not printable characters */
    public static ByteBuffer m6568(Object obj, long j, int i) {
        if (C0034.m3450() >= 0) {
            return ((DataSource) obj).getByteBuffer(j, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۦۢ, reason: contains not printable characters */
    public static FileAttributeView m6569(Object obj, Object obj2, Object obj3) {
        if (C0039.m4109() > 0) {
            return C0072.m6134((Path) obj, (Class) obj2, (LinkOption[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static FrameLayout m6570(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0068.m5678() >= 0) {
            return ((C0) obj).i((Activity) obj2, (String) obj3, (String) obj4, (View) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static int m6571(Object obj) {
        if (C0038.m4010() > 0) {
            return ((T2) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static int m6572(Object obj, Object obj2, Object obj3) {
        if (C0016.m717() < 0) {
            return Log.e((String) obj, (String) obj2, (Throwable) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m6573(Object obj, Object obj2, boolean z) {
        if (C0071.m6069() >= 0) {
            return V2SchemeSigner.a((ApkSigningBlockUtils.SignerConfig) obj, (Map) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥ۟, reason: not valid java name and contains not printable characters */
    public static Type m6574(Object obj, Object obj2, Object obj3) {
        if (C0023.m1921() > 0) {
            return C$Gson$Types.resolve((Type) obj, (Class) obj2, (Type) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۥ, reason: not valid java name and contains not printable characters */
    public static void m6575(Object obj, Object obj2, int i) {
        if (C0020.m1385() <= 0) {
            ((Z0) obj).a((PushbackInputStream) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۧۤۧۧ, reason: not valid java name and contains not printable characters */
    public static K0 m6576(Object obj, Object obj2) {
        if (C0036.m3653() <= 0) {
            return ((C0) obj).g((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Asn1TagClass m6577() {
        if (C0066.m4827() > 0) {
            return Asn1TagClass.UNIVERSAL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۦۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6578() {
        if (C0063.m4427() > 0) {
            return f219short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m6579(Object obj) {
        if (C0039.m4109() > 0) {
            return ((DialogC0331b0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣۢ, reason: not valid java name and contains not printable characters */
    public static int m6580(Object obj) {
        if (C0025.m2132() > 0) {
            return ((C0323a) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧۤۨ, reason: not valid java name and contains not printable characters */
    public static Node m6581(Object obj, int i) {
        if (C0018.m1064() >= 0) {
            return ((NamedNodeMap) obj).item(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۨۧ, reason: not valid java name and contains not printable characters */
    public static void m6582(Object obj) {
        if (C0071.m6069() >= 0) {
            ((File) obj).deleteOnExit();
        }
    }

    /* JADX INFO: renamed from: ۣۧۨۢ, reason: not valid java name and contains not printable characters */
    public static String m6583(Object obj) {
        if (C0069.m5781() < 0) {
            return ((C0382i3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۧ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6584(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((ApkVerifier.IssueWithParams) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m6585() {
        if (C0018.m1064() > 0) {
            return "OpenSSLSignature$SHA1ECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۦ۟, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m6586(Object obj, Object obj2) {
        if (C0025.m2132() > 0) {
            return TreeTypeAdapter.newTypeHierarchyFactory((Class) obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۧۤ, reason: not valid java name and contains not printable characters */
    public static int m6587(Object obj) {
        if (C0065.m4647() > 0) {
            return ((DialogC0331b0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static String m6452(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
