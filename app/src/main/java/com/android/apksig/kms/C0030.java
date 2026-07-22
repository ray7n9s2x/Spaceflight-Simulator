package com.android.apksig.kms;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.ApkUtilsLite;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ApkSupportedSignature;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.jar.ManifestWriter;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.Attribute;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.ByteArrayDataSink;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.InclusiveIntRange;
import com.android.apksig.internal.util.VerityTreeBuilder;
import com.android.apksig.internal.util.X509CertificateUtils;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipSections;
import com.joke.basetoollib.C0063;
import com.joke.basetoollib.GsonUtils;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.GsonBuilder;
import com.joke.plugin.gson.JsonDeserializationContext;
import com.joke.plugin.gson.JsonDeserializer;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.internal.C$Gson$Types;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptProjectBean;
import com.joke.script.bean.ScriptRecordType;
import com.joke.script.bean.ScriptState;
import com.zfork.entry.C0075;
import com.zfork.entry.MetaSelectAppAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.AbstractC0446t2;
import com.zfork.multiplatforms.android.bomb.AbstractC0449u;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0363f4;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0402m;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0451u1;
import com.zfork.multiplatforms.android.bomb.C0453u3;
import com.zfork.multiplatforms.android.bomb.C0476y2;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C3;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.C5;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.H;
import com.zfork.multiplatforms.android.bomb.H3;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.InterfaceC0395k4;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.L1;
import com.zfork.multiplatforms.android.bomb.O;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.P1;
import com.zfork.multiplatforms.android.bomb.RunnableC0353e1;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.V;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0386j1;
import com.zfork.multiplatforms.android.bomb.Z0;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.x5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.file.FileVisitResult;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFileAttributes;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.KeyGenerator;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: com.android.apksig.kms.۟ۧۥۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0030 {

    /* JADX INFO: renamed from: ۟ۢ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static int f134 = 19;

    /* JADX INFO: renamed from: ۟۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static List m2829(Object obj) {
        if (C0029.m2791() > 0) {
            return ((ApkVerifier.Result.V4SchemeSignerInfo) obj).getContentDigests();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static int m2830(Object obj) {
        if (C0033.m3358() < 0) {
            return ((AndroidBinXmlParser) obj).next();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m2831() {
        if (C0078.m7450() > 0) {
            return "SHA512withRSA/PSS";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static long m2832() {
        if (C0027.m2460() >= 0) {
            return AbstractC0446t2.b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۢۦۣ, reason: not valid java name and contains not printable characters */
    public static String m2833(Object obj) {
        if (C0026.m2298() < 0) {
            return C$Gson$Types.typeToString((Type) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static void m2834(Object obj, boolean z) {
        if (C0028.m2593() >= 0) {
            ((View) obj).setWillNotDraw(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m2835(Object obj) {
        if (C0021.m1598() <= 0) {
            return MessageDigest.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2836(Object obj) {
        if (C0065.m4647() > 0) {
            return ((ApkVerifier.Result) obj).k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m2837(Object obj) {
        if (C0039.m4109() > 0) {
            return ((O2) obj).F;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2838(Object obj) {
        if (C0072.m6216() > 0) {
            return ((File) obj).isDirectory();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m2839(Object obj) {
        if (C0027.m2460() > 0) {
            return ((V4Signature.HashingInfo) obj).rawRootHash;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۥۦ, reason: not valid java name and contains not printable characters */
    public static P1 m2841(Object obj) {
        if (C0017.m846() > 0) {
            return ((T1) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m2842(Object obj, Object obj2, Object obj3, Object obj4) throws KeyManagementException {
        if (C0065.m4647() > 0) {
            ((SSLContext) obj).init((KeyManager[]) obj2, (TrustManager[]) obj3, (SecureRandom) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟۠۟, reason: not valid java name and contains not printable characters */
    public static Object m2843(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0025.m2132() > 0) {
            return ((JsonDeserializer) obj).deserialize((JsonElement) obj2, (Type) obj3, (JsonDeserializationContext) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static GsonBuilder m2844(Object obj) {
        if (C0017.m846() > 0) {
            return ((GsonBuilder) obj).setPrettyPrinting();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2845(Object obj) {
        if (C0021.m1598() < 0) {
            return ((ApkSigner.Builder) obj).m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static String m2846() {
        if (C0028.m2593() >= 0) {
            return "FoxCountry";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2847(Object obj) {
        if (m2940() > 0) {
            return ((C0350d5) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static void m2848(Object obj, Object obj2, Object obj3) {
        if (C0029.m2791() > 0) {
            ((ApkVerifier.Result) obj).addWarning((ApkVerifier.Issue) obj2, (Object[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static Calendar m2849() {
        if (C0019.m1311() >= 0) {
            return Calendar.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦۨ, reason: not valid java name and contains not printable characters */
    public static int m2850(Object obj) {
        if (C0073.m6356() < 0) {
            return ((C3) obj).a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥۧۦ, reason: not valid java name and contains not printable characters */
    public static String m2851(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((C0453u3) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨۢ, reason: not valid java name and contains not printable characters */
    public static ScriptRecordType m2852() {
        if (C0077.m7272() < 0) {
            return ScriptRecordType.TEXT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static void m2853(Object obj, Object obj2) throws IOException {
        if (C0066.m4827() > 0) {
            ((Z0) obj).c((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۥ, reason: not valid java name and contains not printable characters */
    public static String m2854(Object obj) {
        if (C0038.m4010() > 0) {
            return ((Attribute) obj).attrType;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m2855(Object obj) {
        if (C0039.m4109() > 0) {
            return ((ApkSupportedSignature) obj).signature;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m2856(Object obj) {
        if (C0071.m6069() > 0) {
            return ((ViewOnClickListenerC0386j1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m2857(Object obj) {
        if (C0029.m2791() > 0) {
            return ((DefaultApkSignerEngine) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧۧ, reason: not valid java name and contains not printable characters */
    public static void m2858() {
        if (C0029.m2791() >= 0) {
            C0074.m6513();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static Button m2859(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((C0351e) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۧۦ, reason: not valid java name and contains not printable characters */
    public static DataSource m2860(Object obj) {
        if (C0026.m2298() < 0) {
            return ((ApkUtilsLite.ApkSigningBlock) obj).getContents();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m2861(Object obj, int i) {
        if (C0025.m2132() > 0) {
            ((PopupWindow) obj).setHeight(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۥۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2862() {
        if (C0067.m5468() < 0) {
            return ApkVerifier.Issue.V3_MIN_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۤۧ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m2863() {
        if (C0067.m5468() <= 0) {
            return Asn1Type.OCTET_STRING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m2864() {
        if (C0018.m1064() > 0) {
            return ApkVerifier.g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۢۥ, reason: not valid java name and contains not printable characters */
    public static List m2865(Object obj) {
        if (C0066.m4827() >= 0) {
            return ApkSigningBlockUtils.getApkSignatureBlockSigners((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static Intent m2866(Object obj, Object obj2) {
        if (C0026.m2298() < 0) {
            return ((Intent) obj).setPackage((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static View m2867(Object obj) {
        if (C0023.m1921() > 0) {
            return ((U3) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static ScriptState m2868(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((C0361f2) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۟۠, reason: not valid java name and contains not printable characters */
    public static long m2869(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((ByteBuffer) obj).getLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥۦ, reason: not valid java name and contains not printable characters */
    public static MatchType m2870(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((C4) obj).G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m2871(Object obj, Object obj2, Object obj3) {
        if (C0063.m4427() >= 0) {
            return ((Gson) obj).toJson(obj2, (Type) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static KeyGenerator m2872(Object obj) {
        if (C0024.m2011() < 0) {
            return KeyGenerator.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m2873(Object obj, Object obj2, int i, int i2) {
        if (C0033.m3358() < 0) {
            return ((Reader) obj).read((char[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧۨۢ, reason: not valid java name and contains not printable characters */
    public static String m2874() {
        if (C0021.m1598() <= 0) {
            return "-----";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static Button m2875(Object obj) {
        if (C0078.m7450() > 0) {
            return ((C0351e) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static long m2876(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((JsonElement) obj).getAsLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static MethodHandles.Lookup m2877() {
        if (C0027.m2460() >= 0) {
            return C0020.m1328();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2878(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((File) obj).setReadOnly();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static String m2879(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((C0361f2) obj).F;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۧ, reason: not valid java name and contains not printable characters */
    public static void m2880(Object obj, Object obj2, Object obj3) {
        if (C0072.m6216() > 0) {
            ManifestWriter.a((OutputStream) obj, (String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static long m2881(Object obj) {
        if (C0038.m4010() > 0) {
            return ((x5) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2882(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((C0479z) obj).h();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m2883() {
        if (m2940() > 0) {
            return AbstractC0449u.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۦۣ, reason: not valid java name and contains not printable characters */
    public static P1 m2884(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((T1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2885(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((SigningCertificateLineage.SignerCapabilities) obj).hasSharedUid();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static InputStream m2886(Object obj, Object obj2) {
        if (C0018.m1064() >= 0) {
            return ((ClassLoader) obj).getResourceAsStream((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static DisplayCutout m2887(Object obj) {
        if (C0031.m3075() > 0) {
            return C0019.m1272((WindowInsets) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۡ, reason: not valid java name and contains not printable characters */
    public static ImageView m2888(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((C0363f4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2889(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((C0402m) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥ۟, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m2890(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0024.m2011() <= 0) {
            return ((DialogC0373h0) obj).c((Activity) obj2, (String) obj3, (String) obj4, (EditText) obj5, (String) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤ۠, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m2891(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).signingCertificateLineage;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2892() {
        if (C0064.m4578() > 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_UNKNOWN_ATTRIBUTE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m2893(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((Enum) obj).ordinal();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static C0479z m2894(Object obj) {
        if (C0017.m846() > 0) {
            return ((DialogC0389j4) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m2895(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0072.m6216() >= 0) {
            ((Logger) obj).log((Level) obj2, (String) obj3, obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m2896(Object obj, Object obj2) {
        if (C0066.m4827() > 0) {
            ((CentralDirectoryRecord) obj).copyTo((ByteBuffer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۤ, reason: not valid java name and contains not printable characters */
    public static Double m2897(Object obj) {
        if (C0066.m4827() >= 0) {
            return Double.valueOf((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2898() {
        if (C0032.m3184() < 0) {
            return ApkVerifier.Issue.V2_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨ۟, reason: not valid java name and contains not printable characters */
    public static int m2899(Object obj) {
        if (C0026.m2298() < 0) {
            return ((URLConnection) obj).getContentLength();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static int[] m2900() {
        if (C0068.m5678() >= 0) {
            return K3.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m2901(Object obj, Object obj2, Object obj3) {
        if (C0074.m6454() < 0) {
            return ((String) obj).replaceFirst((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static void m2902(int i, double d) {
        if (C0017.m846() > 0) {
            o5.x(i, d);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m2903(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((ByteArrayDataSink) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧۡ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m2904(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((G0) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static UUID m2905(Object obj) {
        if (C0021.m1598() <= 0) {
            return UUID.fromString((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤ۟, reason: not valid java name and contains not printable characters */
    public static X500Principal m2906(Object obj) {
        if (m2940() > 0) {
            return ((X509Certificate) obj).getSubjectX500Principal();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦۡ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m2907(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((Asn1OpaqueObject) obj).getEncoded();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2908(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((T2) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۢۤ, reason: not valid java name and contains not printable characters */
    public static DateFormat m2909(int i, int i2, Object obj) {
        if (C0019.m1311() == 0) {
            return DateFormat.getDateTimeInstance(i, i2, (Locale) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥۡ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m2910() {
        if (C0032.m3184() <= 0) {
            return TypeAdapters.JSON_ELEMENT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static H m2911(Object obj) {
        if (m2940() > 0) {
            return ((C0361f2) obj).E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m2912(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((ZipSections) obj).getZipCentralDirectoryRecordCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static List m2913(Object obj) {
        if (C0020.m1385() < 0) {
            return ((O) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static Class m2914(Object obj, boolean z, Object obj2) {
        if (C0063.m4427() >= 0) {
            return Class.forName((String) obj, z, (ClassLoader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m2915(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((DialogC0373h0) obj).o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۡۦ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.Result m2916(Object obj) {
        if (C0037.m3837() < 0) {
            return ((V3SchemeVerifier.Builder) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۦۢ, reason: not valid java name and contains not printable characters */
    public static int m2917(Object obj) {
        if (C0027.m2460() > 0) {
            return ((V) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۢۦ, reason: not valid java name and contains not printable characters */
    public static void m2918(Object obj) {
        if (C0034.m3450() >= 0) {
            ((Activity) obj).finish();
        }
    }

    /* JADX INFO: renamed from: ۣۡۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2919(Object obj, Object obj2) {
        if (C0073.m6356() < 0) {
            return C0078.m7452((Path) obj, (LinkOption[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2920(Object obj, Object obj2) {
        if (C0078.m7450() >= 0) {
            ((WebView) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static Annotation m2921(Object obj, Object obj2) {
        if (C0035.m3569() <= 0) {
            return ((Class) obj).getAnnotation((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static long m2922(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((ZipSections) obj).getZipCentralDirectoryOffset();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m2923(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((O2) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤ۟, reason: not valid java name and contains not printable characters */
    public static C0387j2 m2924(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((C5) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۡۧ, reason: not valid java name and contains not printable characters */
    public static Number m2925(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((JsonElement) obj).getAsNumber();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣۧ, reason: not valid java name and contains not printable characters */
    public static String m2926(String str) {
        String strM2993 = C0031.m2993();
        String strM29932 = C0031.m2993();
        for (int i = 0; i < 15; i++) {
            strM2993 = C0077.m7301(m2967(m2967(new StringBuffer(), strM2993), C0021.m1651(i)));
            strM29932 = C0077.m7301(C0027.m2461(m2967(new StringBuffer(), strM29932), ((int) (C0038.m3986() * ((double) 10))) ^ i));
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

    /* JADX INFO: renamed from: ۢۦ, reason: not valid java name and contains not printable characters */
    public static void m2927(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5) {
        if (C0028.m2593() >= 0) {
            ((SourceStampVerifier) obj).b((ByteBuffer) obj2, i, (CertificateFactory) obj3, (Map) obj4, (SourceStampVerifier.Result.SignerInfo) obj5);
        }
    }

    /* JADX INFO: renamed from: ۢۦۣۣ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2928() {
        if (C0064.m4578() > 0) {
            return ApkVerifier.Issue.JAR_SIG_DUPLICATE_SIG_FILE_SECTION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m2929(Object obj, int i, Object obj2) {
        if (C0034.m3450() >= 0) {
            ((C0) obj).k(i, (Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۨۥ, reason: not valid java name and contains not printable characters */
    public static C0451u1 m2930(Object obj) {
        if (m2940() >= 0) {
            return ((C0476y2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2931(Object obj) {
        if (C0067.m5468() < 0) {
            return ((ApkSignerInfo) obj).containsErrors();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۡۤ, reason: not valid java name and contains not printable characters */
    public static Comparable m2932(Object obj) {
        if (C0024.m2011() < 0) {
            return ((RunnableC0353e1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۡ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m2933(Object obj, boolean z) {
        if (C0024.m2011() < 0) {
            return ((ApkSigner.Builder) obj).setForceSourceStampOverwrite(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۤۥ, reason: not valid java name and contains not printable characters */
    public static EditText m2934(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((DialogC0385j0) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۧ۠, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m2935(Object obj, boolean z) {
        if (C0023.m1921() >= 0) {
            return ((ApkSigner.Builder) obj).setVerityEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۨ, reason: not valid java name and contains not printable characters */
    public static void m2936(Object obj, Object obj2) {
        if (C0075.m6893() > 0) {
            ((C0444t0) obj).setBgDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۥۨۦ, reason: not valid java name and contains not printable characters */
    public static Set m2937(Object obj) {
        if (C0036.m3653() < 0) {
            return ((Map) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static InclusiveIntRange m2938(int i) {
        if (C0026.m2298() < 0) {
            return InclusiveIntRange.from(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m2939(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((Uri) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۨ۟, reason: not valid java name and contains not printable characters */
    public static int m2940() {
        return 1748952 ^ C0032.m3236((Object) "ۡۨ۠");
    }

    /* JADX INFO: renamed from: ۤۤۧۦ, reason: not valid java name and contains not printable characters */
    public static int m2941(Object obj) {
        if (C0031.m3075() > 0) {
            return ((U3) obj).t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static O1 m2942(Object obj) {
        if (C0036.m3653() < 0) {
            return ((L1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static List m2943(Object obj) {
        if (C0039.m4109() >= 0) {
            return C0033.m3305((ApkVerifier.Result.V3SchemeSignerInfo) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۡۥ, reason: not valid java name and contains not printable characters */
    public static JsonElement m2944(Object obj, Object obj2) {
        if (C0039.m4109() >= 0) {
            return ((Gson) obj).toJsonTree(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۨۦ, reason: not valid java name and contains not printable characters */
    public static void m2945(Object obj, boolean z) {
        if (C0031.m3075() >= 0) {
            ((I1) obj).setClickPointerHide(z);
        }
    }

    /* JADX INFO: renamed from: ۤۧۢۦ, reason: not valid java name and contains not printable characters */
    public static long m2946(Object obj) {
        if (C0075.m6893() >= 0) {
            return ZipUtils.getZipEocdCentralDirectorySizeBytes((ByteBuffer) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۧۥۢ, reason: not valid java name and contains not printable characters */
    public static Integer m2947(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((ApkVerifier.Builder) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۧ, reason: contains not printable characters */
    public static ContentDigestAlgorithm m2948(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((SignatureAlgorithm) obj).getContentDigestAlgorithm();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۨ۟, reason: contains not printable characters */
    public static ArrayList m2949(Object obj) {
        if (C0025.m2132() > 0) {
            return ((MetaSelectAppAbility) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۤۤ, reason: contains not printable characters */
    public static void m2950(Object obj, Object obj2, Object obj3) {
        if (C0076.m6903() < 0) {
            C0361f2.a((C0361f2) obj, (ScriptProjectBean) obj2, (InterfaceC0395k4) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۥ۠۟, reason: contains not printable characters */
    public static Class m2951(Object obj) {
        if (C0073.m6356() < 0) {
            return obj.getClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۥ, reason: contains not printable characters */
    public static String m2952() {
        if (C0029.m2791() >= 0) {
            return "AES_256/GCM/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠۠ۢ, reason: contains not printable characters */
    public static int m2953(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((BerDataValue) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡ۟ۥ, reason: contains not printable characters */
    public static String m2954(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((O2) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۧ۟, reason: contains not printable characters */
    public static String m2955(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((ManifestParser.Attribute) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۨ, reason: contains not printable characters */
    public static void m2956(Object obj, int i) {
        if (C0067.m5468() <= 0) {
            ((KeyGenerator) obj).init(i);
        }
    }

    /* JADX INFO: renamed from: ۦۤۤ, reason: contains not printable characters */
    public static ApkSignerEngine m2957(Object obj) {
        if (C0025.m2132() > 0) {
            return ((ApkSigner) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۤ, reason: contains not printable characters */
    public static PosixFileAttributes m2958(Object obj) {
        if (C0032.m3184() <= 0) {
            return H3.e(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۤۧ, reason: contains not printable characters */
    public static int m2959(char c, int i) {
        if (C0031.m3075() > 0) {
            return Character.digit(c, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m2960(Object obj, Object obj2) {
        if (C0069.m5781() <= 0) {
            return ((VerityTreeBuilder) obj).generateVerityTreeRootHash((DataSource) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟, reason: not valid java name and contains not printable characters */
    public static CertificateFactory m2961(Object obj) {
        if (C0035.m3569() < 0) {
            return ((O2) obj).O;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m2962() {
        if (C0072.m6216() > 0) {
            o5.o();
        }
    }

    /* JADX INFO: renamed from: ۧ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m2963(Object obj, Object obj2) {
        if (C0063.m4427() > 0) {
            return GsonUtils.fromJson((String) obj, (Type) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۢۧ, reason: not valid java name and contains not printable characters */
    public static FileVisitResult m2964() {
        if (C0027.m2460() > 0) {
            return C0017.m907();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۦ, reason: not valid java name and contains not printable characters */
    public static void m2965() {
        if (C0072.m6216() >= 0) {
            X509CertificateUtils.a();
        }
    }

    /* JADX INFO: renamed from: ۨۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.SignerConfig.Builder m2966(Object obj, boolean z) {
        if (C0024.m2011() < 0) {
            return DefaultApkSignerEngine.SignerConfig.Builder.access$2000((DefaultApkSignerEngine.SignerConfig.Builder) obj, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۢ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m2967(Object obj, Object obj2) {
        if (C0069.m5781() < 0) {
            return ((StringBuffer) obj).append((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static void m2968(Object obj) {
        if (C0069.m5781() <= 0) {
            ((Toast) obj).show();
        }
    }

    /* JADX INFO: renamed from: ۨۨۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2969(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((C0) obj).v;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۥ, reason: not valid java name and contains not printable characters */
    public static String m2840(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
