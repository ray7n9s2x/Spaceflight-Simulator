package com.android.apksig.zip;

import android.app.Activity;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebSettings;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
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
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ApkSupportedSignature;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.V2SourceStampSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.asn1.ber.BerDataValueReader;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.pkcs7.SignerIdentifier;
import com.android.apksig.internal.pkcs7.SignerInfo;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.FileChannelDataSource;
import com.android.apksig.internal.util.VerityTreeBuilder;
import com.android.apksig.internal.util.X509CertificateUtils;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.kms.KmsType;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickContentBean;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.internal.C$Gson$Types;
import com.joke.plugin.gson.internal.Excluder;
import com.joke.plugin.gson.internal.JavaVersion;
import com.joke.plugin.gson.internal.Streams;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptMatchBean;
import com.joke.speedfloatingball.bean.CloudBean;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0383i4;
import com.zfork.multiplatforms.android.bomb.B1;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0330b;
import com.zfork.multiplatforms.android.bomb.C0333b2;
import com.zfork.multiplatforms.android.bomb.C0337c;
import com.zfork.multiplatforms.android.bomb.C0341c3;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0426q;
import com.zfork.multiplatforms.android.bomb.C0428q1;
import com.zfork.multiplatforms.android.bomb.C0453u3;
import com.zfork.multiplatforms.android.bomb.C0456v0;
import com.zfork.multiplatforms.android.bomb.C0469x1;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.DialogC0445t1;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.F5;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.InterfaceC0415o0;
import com.zfork.multiplatforms.android.bomb.InterfaceC0477y3;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.P1;
import com.zfork.multiplatforms.android.bomb.Q;
import com.zfork.multiplatforms.android.bomb.S1;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.V2;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0484z4;
import com.zfork.multiplatforms.android.bomb.ViewOnTouchListenerC0481z1;
import com.zfork.multiplatforms.android.bomb.h5;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.s5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.security.cert.X509Extension;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.jar.Attributes;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import org.conscrypt.C0111;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.android.apksig.zip.۟۟ۧۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0032 {

    /* JADX INFO: renamed from: ۟ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean f136;

    /* JADX INFO: renamed from: ۟۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static DataSource m3115(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((ApkSigner.Builder) obj).z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m3116(Object obj, Object obj2) {
        if (C0017.m846() > 0) {
            return K3.o((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m3117(Object obj) {
        if (C0067.m5468() < 0) {
            return ((V1SchemeVerifier.OctetStringChoice) obj).value;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static int m3118() {
        if (C0066.m4827() >= 0) {
            return JavaVersion.getMajorJavaVersion();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m3119(Object obj, Object obj2) {
        if (C0028.m2593() >= 0) {
            return ((AbstractCollection) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static WindowInsets m3120(Object obj) {
        if (C0016.m717() < 0) {
            return C0039.m4081((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3121(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((ApkSigningBlockUtils.SignerConfig) obj).signerTargetsDevRelease;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static EnumSet m3122(Object obj, Object obj2, Object obj3) {
        if (C0077.m7272() <= 0) {
            return EnumSet.of((Enum) obj, (Enum) obj2, (Enum) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static DialogC0421p0 m3123(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0069.m5781() <= 0) {
            return o5.j((Context) obj, (String) obj2, (String) obj3, (InterfaceC0415o0) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3124(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((DefaultApkSignerEngine) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3125(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).containsErrors();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static AutoClickPlanBean m3126(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((C0456v0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m3127(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((ViewOnClickListenerC0484z4) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m3128(Object obj, int i, Object obj2) {
        if (C0024.m2011() < 0) {
            ((SourceStampVerifier.Result) obj).addVerificationError(i, (Object[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static Excluder m3129(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((Excluder) obj).excludeFieldsWithoutExposeAnnotation();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3130(Object obj) {
        if (C0035.m3569() < 0) {
            return ((V3SchemeSigner) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m3131(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((ApkSupportedSignature) obj).algorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0477y3 m3132(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((DialogC0373h0) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static int m3133(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((T1) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۢۤۢ, reason: not valid java name and contains not printable characters */
    public static String m3134(Object obj) {
        if (m3184() < 0) {
            return ((Class) obj).getSimpleName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static KeyPairGenerator m3135(Object obj) {
        if (C0111.m13165() <= 0) {
            return KeyPairGenerator.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3136(Object obj, Object obj2) {
        if (C0077.m7272() < 0) {
            ((Display) obj).getMetrics((DisplayMetrics) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3137(Object obj) {
        if (C0071.m6069() > 0) {
            return ((File) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۡۦ, reason: not valid java name and contains not printable characters */
    public static String m3138(Object obj, Object obj2) {
        if (C0073.m6356() < 0) {
            return ((KeyStore) obj).getCertificateAlias((Certificate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۢۥ, reason: not valid java name and contains not printable characters */
    public static String m3139(Object obj) {
        if (C0025.m2132() >= 0) {
            return DocumentsContract.getTreeDocumentId((Uri) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۦۣ, reason: not valid java name and contains not printable characters */
    public static String m3140() {
        if (C0027.m2460() > 0) {
            return "<keysize>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦۥ, reason: not valid java name and contains not printable characters */
    public static ClipData.Item m3141(Object obj, int i) {
        if (C0076.m6903() <= 0) {
            return ((ClipData) obj).getItemAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static void m3142(Object obj, int i) {
        if (C0023.m1921() >= 0) {
            ((WebSettings) obj).setMixedContentMode(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static void m3143(Object obj, Object obj2, long j, long j2) {
        if (C0028.m2593() >= 0) {
            ((Unsafe) obj).putLong(obj2, j, j2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۢ, reason: not valid java name and contains not printable characters */
    public static void m3144(Object obj, int i, int i2, int i3, int i4) {
        if (m3184() < 0) {
            ((View) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۢ, reason: not valid java name and contains not printable characters */
    public static Object m3145(Object obj, int i) {
        if (C0066.m4827() >= 0) {
            return Array.newInstance((Class<?>) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3146(Object obj) {
        if (m3184() <= 0) {
            return ((C0341c3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.SignerConfig m3147(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((ApkSigner) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m3148() {
        if (C0063.m4427() >= 0) {
            return "Alg.Alias.Mac.1.2.840.113549.2.8";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static void m3149(Object obj, boolean z) {
        if (C0029.m2791() >= 0) {
            ((JsonWriter) obj).setSerializeNulls(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static List m3150(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((ApkVerifier.Result) obj).getV4SchemeSigners();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m3151(int i, int i2) {
        if (C0035.m3569() <= 0) {
            return Math.min(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static CharBuffer m3152(Object obj) {
        if (C0071.m6069() > 0) {
            return CharBuffer.wrap((char[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static Path m3153(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((File) obj).toPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m3154(Object obj) {
        if (C0078.m7450() > 0) {
            return ((C0453u3) obj).read();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int m3155(Object obj) {
        if (C0066.m4827() > 0) {
            return ((C0337c) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۦۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m3156() {
        if (C0018.m1064() >= 0) {
            return X509CertificateUtils.BEGIN_CERT_HEADER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢ۠, reason: not valid java name and contains not printable characters */
    public static int m3157(Object obj) {
        if (C0026.m2298() < 0) {
            return ((F5) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static void m3158(Object obj) {
        if (C0066.m4827() > 0) {
            ((G0) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3159() {
        if (C0023.m1921() >= 0) {
            return ApkVerifier.Issue.JAR_SIG_VERIFY_EXCEPTION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m3160() {
        if (C0067.m5468() <= 0) {
            return Asn1Type.SET_OF;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟, reason: not valid java name and contains not printable characters */
    public static void m3161(Object obj) {
        if (C0024.m2011() < 0) {
            O1.g((AutoClickPointerBean) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static KmsType[] m3162() {
        if (C0039.m4109() >= 0) {
            return KmsType.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۥ۠, reason: not valid java name and contains not printable characters */
    public static ListView m3163(Object obj) {
        if (C0069.m5781() < 0) {
            return ((C4) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m3164(Object obj, Object obj2) {
        if (m3184() <= 0) {
            ((AutoClickContentBean) obj).setPointerList((List) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۦۤ, reason: not valid java name and contains not printable characters */
    public static void m3165(Object obj) {
        if (C0023.m1921() >= 0) {
            HttpsURLConnection.setDefaultHostnameVerifier((HostnameVerifier) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۧۢ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m3166(Object obj) {
        if (C0017.m846() > 0) {
            return ((I1) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ۠, reason: not valid java name and contains not printable characters */
    public static android.util.JsonWriter m3167(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            return ((android.util.JsonWriter) obj).name((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Class[] m3168() {
        if (C0077.m7272() < 0) {
            return O2.W;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۡ, reason: not valid java name and contains not printable characters */
    public static int m3169(Object obj) {
        if (C0027.m2460() > 0) {
            return ((Q) obj).h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢۧۢ, reason: not valid java name and contains not printable characters */
    public static void m3170(Object obj, long j) {
        if (C0023.m1921() >= 0) {
            ((C0453u3) obj).seek(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۨ۠, reason: not valid java name and contains not printable characters */
    public static int m3171(Object obj) {
        if (C0071.m6069() > 0) {
            return ((s5) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3172(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((ApkVerifier.Result) obj).isVerifiedUsingV4Scheme();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۤ, reason: not valid java name and contains not printable characters */
    public static int m3173(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((Message) obj).arg2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static File m3174(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((T2) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static ImageView m3175(Object obj) {
        if (C0025.m2132() > 0) {
            return ((P1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m3176(Object obj, int i) {
        if (C0072.m6216() > 0) {
            return ((Random) obj).nextInt(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۢۢ۟, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m3177() {
        if (C0069.m5781() <= 0) {
            return SignatureAlgorithm.VERITY_RSA_PKCS1_V1_5_WITH_SHA256;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Set m3178(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((Charset) obj).aliases();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static long m3179(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((E1) obj).w;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3180(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((JsonPrimitive) obj).isBoolean();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨۡۦ, reason: not valid java name and contains not printable characters */
    public static String m3181(Object obj, Object obj2, Object obj3) {
        if (C0070.m5903() >= 0) {
            return ((Attributes) obj).putValue((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m3182() {
        if (C0070.m5903() > 0) {
            return "OpenSSLEvpCipherAES$AES_128$CBC$NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m3183(Object obj, Object obj2, int i) {
        if (C0034.m3450() > 0) {
            ((ContentResolver) obj).takePersistableUriPermission((Uri) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static int m3184() {
        return (-1749809) ^ m3236((Object) "ۢۦۡ");
    }

    /* JADX INFO: renamed from: ۠ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static DialogC0445t1 m3185(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((C0469x1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m3186(Object obj) {
        if (C0037.m3837() < 0) {
            return ((SigningCertificateLineage.SignerCapabilities) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static String m3187() {
        if (C0018.m1064() > 0) {
            return "Alg.Alias.Cipher.RSA/None/OAEPWithSHA-256AndMGF1Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۤۦ, reason: not valid java name and contains not printable characters */
    public static void m3188(Object obj, Object obj2) {
        if (m3184() <= 0) {
            ((CloudBean) obj).setPackageNameList((List) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static void m3189(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws KeyStoreException {
        if (C0070.m5903() >= 0) {
            ((KeyStore) obj).setKeyEntry((String) obj2, (Key) obj3, (char[]) obj4, (Certificate[]) obj5);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۡۧ, reason: not valid java name and contains not printable characters */
    public static int[] m3190() {
        if (C0031.m3075() >= 0) {
            return AbstractC0383i4.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۧۦ, reason: not valid java name and contains not printable characters */
    public static long m3191(Object obj) {
        if (C0021.m1598() < 0) {
            return ((C0361f2) obj).n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m3192(String str) {
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

    /* JADX INFO: renamed from: ۡ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m3193(Object obj, int i) {
        if (C0026.m2298() <= 0) {
            ((AutoClickPlanBean) obj).setLoopNum(i);
        }
    }

    /* JADX INFO: renamed from: ۡۡ۟۟, reason: not valid java name and contains not printable characters */
    public static B1 m3194(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((ViewOnTouchListenerC0481z1) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Intent m3195(Object obj, Object obj2) {
        if (C0034.m3450() >= 0) {
            return ((Intent) obj).setData((Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static UUID m3196() {
        if (C0063.m4427() > 0) {
            return UUID.randomUUID();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۤ۟, reason: not valid java name and contains not printable characters */
    public static C0361f2 m3197(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((C0333b2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۦ۠, reason: not valid java name and contains not printable characters */
    public static MatchType m3198(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((ScriptMatchBean) obj).successType;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۦۦ, reason: not valid java name and contains not printable characters */
    public static Type m3199(Object obj, Object obj2, Object obj3) {
        if (C0077.m7272() < 0) {
            return C$Gson$Types.getSupertype((Type) obj, (Class) obj2, (Class) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢۡ, reason: not valid java name and contains not printable characters */
    public static long m3200(int i, Object obj, int i2) {
        if (C0065.m4647() > 0) {
            return h5.d(i, (byte[]) obj, i2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۦۣۨ, reason: not valid java name and contains not printable characters */
    public static BasicFileAttributes m3201(Object obj, Object obj2, Object obj3) {
        if (C0073.m6356() <= 0) {
            return C0029.m2736((Path) obj, (Class) obj2, (LinkOption[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3202(Object obj) {
        if (C0067.m5468() < 0) {
            return ((ApkSigningBlockUtils.Result) obj).containsWarnings();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨ۟۠, reason: not valid java name and contains not printable characters */
    public static String m3203() {
        if (C0020.m1385() < 0) {
            return "AES/GCM-SIV/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m3204(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0031.m3075() > 0) {
            ((O2) obj).p((String) obj2, (PrintStream) obj3, z);
        }
    }

    /* JADX INFO: renamed from: ۣۡۨۤ, reason: not valid java name and contains not printable characters */
    public static FileChannelDataSource m3205(Object obj, long j, long j2) {
        if (C0064.m4578() >= 0) {
            return ((FileChannelDataSource) obj).slice(j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3206(Object obj, long j, long j2) {
        if (C0068.m5678() >= 0) {
            return AndroidBinXmlParser.c((ByteBuffer) obj, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3207(Object obj) {
        if (m3184() < 0) {
            return ((File) obj).delete();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3208() {
        if (C0074.m6454() < 0) {
            return ApkVerifier.Issue.JAR_SIG_MISSING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۦۢ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3210(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((AndroidBinXmlParser) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧ۟۟, reason: not valid java name and contains not printable characters */
    public static Map m3211(Object obj) {
        if (C0075.m6893() > 0) {
            return C0031.m3051((V2SourceStampSigner.Builder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m3212(Object obj, Object obj2, int i, int i2) {
        if (C0016.m717() <= 0) {
            return ((InputStream) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۢ۠, reason: not valid java name and contains not printable characters */
    public static List m3213(Object obj) {
        if (C0078.m7450() > 0) {
            return C0077.m7288((ApkVerifier.Result.V3SchemeSignerInfo) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥۥ, reason: not valid java name and contains not printable characters */
    public static String m3214() {
        if (C0016.m717() <= 0) {
            return "Alg.Alias.Signature.1.2.840.10045.4.3.4";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static List m3215(Object obj) {
        if (C0111.m13165() < 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.Builder m3216(Object obj, int i) {
        if (C0019.m1311() == 0) {
            return ((DefaultApkSignerEngine.Builder) obj).setMinSdkVersionForRotation(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۣ۟, reason: not valid java name and contains not printable characters */
    public static int[] m3217() {
        if (C0111.m13165() <= 0) {
            return C0330b.i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۢ۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m3218(Object obj) {
        if (C0074.m6454() <= 0) {
            return Streams.parse((JsonReader) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۡ, reason: not valid java name and contains not printable characters */
    public static PrintStream m3219() {
        if (C0025.m2132() > 0) {
            return System.out;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡ, reason: not valid java name and contains not printable characters */
    public static String m3220(Object obj, int i, int i2) {
        if (C0017.m846() > 0) {
            return ((String) obj).substring(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۢۡ, reason: not valid java name and contains not printable characters */
    public static Set m3221(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((X509Extension) obj).getCriticalExtensionOIDs();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۥۤ, reason: not valid java name and contains not printable characters */
    public static String m3222(Object obj, Object obj2, Object obj3) {
        if (C0072.m6216() >= 0) {
            return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۧۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m3223(Object obj) {
        if (C0018.m1064() > 0) {
            return ApkSigningBlockUtils.encodeAsSequenceOfLengthPrefixedElements((List<byte[]>) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3224(Object obj, Object obj2, int i, int i2) {
        if (C0031.m3075() > 0) {
            return ((C0426q) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨۤۢ, reason: not valid java name and contains not printable characters */
    public static ApkUtils.ZipSections m3225(Object obj) {
        if (C0021.m1598() < 0) {
            return ((V3SchemeVerifier) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۤۢ, reason: contains not printable characters */
    public static View m3226(Object obj, Object obj2) {
        if (m3184() <= 0) {
            return ((DialogC0373h0) obj).d((Activity) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡۡ, reason: contains not printable characters */
    public static ApkVerifier.Issue m3227() {
        if (C0064.m4578() >= 0) {
            return ApkVerifier.Issue.V41_SIG_NEEDS_TWO_SIGNERS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۟, reason: contains not printable characters */
    public static BerDataValueReader m3228(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((BerDataValue) obj).contentsReader();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۠ۥ, reason: contains not printable characters */
    public static String m3229() {
        if (C0029.m2791() >= 0) {
            return "OpenSSLAeadCipherAES$GCM_SIV$AES_128";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۥ, reason: contains not printable characters */
    public static void m3230(Object obj, int i) {
        if (C0074.m6454() < 0) {
            ((TextView) obj).setMaxLines(i);
        }
    }

    /* JADX INFO: renamed from: ۥۧ۠ۥ, reason: contains not printable characters */
    public static byte[] m3231(Object obj) {
        if (C0067.m5468() < 0) {
            return ((C0428q1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۡۢ, reason: contains not printable characters */
    public static String m3232(Object obj, Object obj2) {
        if (C0024.m2011() < 0) {
            return ((String) obj).concat((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۤۢ, reason: contains not printable characters */
    public static Path m3233(Object obj, Object obj2) {
        if (C0068.m5678() >= 0) {
            return Files.setPosixFilePermissions((Path) obj, (Set) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۤ۠, reason: contains not printable characters */
    public static int m3234(Object obj) {
        if (m3184() < 0) {
            return ((C0) obj).D;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۣۡ, reason: contains not printable characters */
    public static V3SchemeVerifier.Builder m3235(Object obj, Object obj2) {
        if (C0028.m2593() > 0) {
            return ((V3SchemeVerifier.Builder) obj).setRunnablesExecutor((RunnablesExecutor) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۧ, reason: contains not printable characters */
    public static int m3236(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۣۧۨ, reason: contains not printable characters */
    public static String m3239() {
        if (C0016.m717() < 0) {
            return "FoxOrganization";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static long m3240(Object obj) {
        if (C0076.m6903() < 0) {
            return Asn1BerParser.a((ByteBuffer) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m3241(Object obj, int i) {
        if (C0111.m13165() < 0) {
            ((AutoClickPlanBean) obj).setLoopInterval(i);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static MatchType m3242() {
        if (C0016.m717() <= 0) {
            return MatchType.JumpNode;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧ۠, reason: not valid java name and contains not printable characters */
    public static AtomicReference m3243(Object obj) {
        if (C0033.m3358() < 0) {
            return ((V2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static String m3244() {
        if (C0078.m7450() > 0) {
            return "OpenSSLSignature$SHA512ECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3245(Object obj) {
        if (C0018.m1064() > 0) {
            return ((S1) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧۢۦ, reason: not valid java name and contains not printable characters */
    public static SignerIdentifier m3246(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((SignerInfo) obj).sid;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static CheckBox m3247(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((C0351e) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۤ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m3248(Object obj) {
        if (C0021.m1598() < 0) {
            return ((VerityTreeBuilder) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m3249(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((A5) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۨۢ, reason: not valid java name and contains not printable characters */
    public static Parcelable m3250(Object obj, Object obj2) {
        if (C0077.m7272() < 0) {
            return ((Intent) obj).getParcelableExtra((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۧ, reason: contains not printable characters */
    public static Class<?> m3237(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    /* JADX INFO: renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static String m3209(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۦۥۧ, reason: contains not printable characters */
    public static String m3238(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
