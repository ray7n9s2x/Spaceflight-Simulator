package com.android.apksig.internal.jar;

import android.content.Context;
import android.content.Intent;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.Hints;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.V2SourceStampSigner;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SigningCertificateLineage;
import com.android.apksig.internal.apk.v4.V4SchemeSigner;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.ByteBufferDataSource;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.FileChannelDataSource;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.util.VerityTreeBuilder;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.kms.KmsException;
import com.android.apksig.kms.KmsType;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.annotations.SerializedName;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.bind.util.ISO8601Utils;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptMatchBean;
import com.joke.script.bean.ScriptState;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A2;
import com.zfork.multiplatforms.android.bomb.A4;
import com.zfork.multiplatforms.android.bomb.B0;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0344d;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0370g4;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0388j3;
import com.zfork.multiplatforms.android.bomb.C0404m1;
import com.zfork.multiplatforms.android.bomb.C0425p4;
import com.zfork.multiplatforms.android.bomb.C0426q;
import com.zfork.multiplatforms.android.bomb.C0430q3;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0476y2;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C1;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.E;
import com.zfork.multiplatforms.android.bomb.E0;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.F3;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.I3;
import com.zfork.multiplatforms.android.bomb.InterfaceC0422p1;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q;
import com.zfork.multiplatforms.android.bomb.S4;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.V;
import com.zfork.multiplatforms.android.bomb.V0;
import com.zfork.multiplatforms.android.bomb.W;
import com.zfork.multiplatforms.android.bomb.Z4;
import com.zfork.multiplatforms.android.bomb.q5;
import com.zfork.multiplatforms.android.bomb.y5;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.ParsePosition;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Deflater;
import javax.crypto.Mac;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.android.apksig.internal.jar.ۥۣۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0023 {

    /* JADX INFO: renamed from: ۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int f101 = 40;

    /* JADX INFO: renamed from: ۟۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m1789(Object obj) {
        if (C0063.m4427() > 0) {
            return ((TextView) obj).getText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m1790(Object obj) {
        if (C0073.m6356() < 0) {
            return ((Mac) obj).doFinal();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m1791(Object obj) {
        if (C0073.m6356() < 0) {
            ((DirectoryStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m1792(Object obj, Object obj2) {
        if (C0078.m7450() > 0) {
            return ((SigningCertificateLineage) obj).mergeLineageWith((SigningCertificateLineage) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۧۡ, reason: not valid java name and contains not printable characters */
    public static String m1793() {
        if (C0027.m2460() >= 0) {
            return "OpenSSLEvpCipherDESEDE$CBC$NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m1794(Object obj) {
        if (C0020.m1385() < 0) {
            return SigningCertificateLineage.consolidateLineages((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static List m1795(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).contentDigests;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static E0 m1796(Object obj) {
        if (C0071.m6069() > 0) {
            return ((G0) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۧ, reason: not valid java name and contains not printable characters */
    public static String m1797() {
        if (C0064.m4578() >= 0) {
            return "if.alias.not.specified.destalias.srckeypass.and.destkeypass.must.not.be.specified";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static void m1798(Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            ((Handler) obj).removeCallbacks((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1799(Object obj) {
        if (C0078.m7450() > 0) {
            return ((UriPermission) obj).isReadPermission();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m1800() {
        if (C0027.m2460() >= 0) {
            return "<srcstoretype>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1801() {
        if (C0031.m3075() >= 0) {
            return ApkVerifier.Issue.JAR_SIG_MISSING_FILE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static String m1802(Object obj) {
        if (C0068.m5678() > 0) {
            return ((String) obj).trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static N2 m1803() {
        if (C0029.m2791() >= 0) {
            return N2.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static void m1804(Object obj, boolean z) {
        if (C0065.m4647() > 0) {
            ((PopupWindow) obj).setOutsideTouchable(z);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1805(Object obj) {
        if (C0038.m4010() > 0) {
            return ((ApkVerifier.Result.V1SchemeSignerInfo) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m1806(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((Q) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1807(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((SourceStampVerifier.Result.SignerInfo) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static E m1808() {
        if (C0026.m2298() < 0) {
            return E.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static PrivateKey m1809(Object obj) {
        if (C0029.m2791() > 0) {
            return ((KeyPair) obj).getPrivate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۡۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1810() {
        if (C0037.m3837() < 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_NO_SIGNATURE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣ۟, reason: not valid java name and contains not printable characters */
    public static TextView m1811(Object obj) {
        if (m1921() >= 0) {
            return ((DialogC0421p0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static List m1812(Object obj) {
        if (C0038.m4010() > 0) {
            return C0029.m2804((ApkVerifier.Result.V2SchemeSignerInfo) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m1813(Object obj) {
        if (C0026.m2298() < 0) {
            ((ThreadLocal) obj).remove();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m1814(Object obj, Object obj2, int i, Object obj3, Object obj4) {
        if (C0028.m2593() > 0) {
            ((SourceStampVerifier) obj).parseSigners((ByteBuffer) obj2, i, (Map) obj3, (SourceStampVerifier.Result) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m1815(Object obj, Object obj2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        if (C0068.m5678() >= 0) {
            ((Certificate) obj).verify((PublicKey) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static A2 m1816(Object obj) {
        if (C0063.m4427() > 0) {
            return ((C0476y2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1817(Object obj) {
        if (C0069.m5781() <= 0) {
            return Hints.parsePinPatterns((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥۣ, reason: not valid java name and contains not printable characters */
    public static Z4 m1818(Object obj) {
        if (m1921() >= 0) {
            return ((C0425p4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1819() {
        if (C0063.m4427() > 0) {
            return ApkVerifier.Issue.V2_SIG_MISSING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m1820(Object obj, int i) {
        if (C0027.m2460() >= 0) {
            return V3SigningCertificateLineage.encodeSignedData((X509Certificate) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡۤ, reason: not valid java name and contains not printable characters */
    public static ApkSignerEngine.InputJarEntryInstructions.OutputPolicy m1821() {
        if (C0032.m3184() < 0) {
            return ApkSignerEngine.InputJarEntryInstructions.OutputPolicy.SKIP;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static Attributes m1822(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((Manifest) obj).getMainAttributes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1823(Object obj) {
        if (C0067.m5468() < 0) {
            return ((ApkVerifier.Result) obj).isVerifiedUsingV2Scheme();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1824(Object obj, int i) {
        if (C0016.m717() < 0) {
            return ((BitSet) obj).get(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static Date m1825(Object obj, Object obj2) {
        if (C0035.m3569() <= 0) {
            return ISO8601Utils.parse((String) obj, (ParsePosition) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static String m1826() {
        if (C0039.m4109() > 0) {
            return "Alg.Alias.Cipher.AES_256/CBC/PKCS7Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟۠, reason: not valid java name and contains not printable characters */
    public static int m1827(Object obj) {
        if (C0074.m6454() < 0) {
            return ((B0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m1828() {
        if (C0065.m4647() >= 0) {
            return SignatureAlgorithm.VERITY_ECDSA_WITH_SHA256;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m1829(Object obj) {
        if (C0021.m1598() < 0) {
            return ((ViewGroup.LayoutParams) obj).width;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static int m1830(Object obj, int i, Object obj2, int i2) {
        if (C0033.m3358() < 0) {
            return ((InterfaceC0422p1) obj).b(i, (byte[]) obj2, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static Attributes.Name m1831() {
        if (C0018.m1064() >= 0) {
            return V1SchemeSigner.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1832() {
        if (C0018.m1064() >= 0) {
            return ConsumerAbility.g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۧۢ۠, reason: not valid java name and contains not printable characters */
    public static int m1833(Object obj) {
        if (C0031.m3075() > 0) {
            return ((SignatureAlgorithm) obj).getJcaSigAlgMinSdkVersion();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦ۟, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1834() {
        if (C0076.m6903() <= 0) {
            return ApkVerifier.Issue.V4_SIG_V2_V3_DIGESTS_MISMATCH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m1835(Object obj, Object obj2, Object obj3) {
        if (C0025.m2132() > 0) {
            return ((O2) obj).a((InputStream) obj2, (String) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m1836(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0070.m5903() >= 0) {
            ((Logger) obj).log((Level) obj2, (String) obj3, (Throwable) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۢۥ, reason: not valid java name and contains not printable characters */
    public static List m1837(Object obj) {
        if (C0024.m2011() < 0) {
            return ((SigningCertificateLineage) obj).getCertificatesInLineage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Pair m1838(Object obj) {
        if (C0067.m5468() < 0) {
            return ((V2SourceStampSigner) obj).generateSourceStampBlock();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۥۧ, reason: not valid java name and contains not printable characters */
    public static void m1839(Object obj) throws IOException {
        if (C0072.m6216() >= 0) {
            ((OutputStream) obj).flush();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۨ, reason: not valid java name and contains not printable characters */
    public static String m1840(Object obj) {
        if (C0017.m846() >= 0) {
            return ((ApkSignerEngine.OutputJarSignatureRequest.JarEntry) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧ۟, reason: not valid java name and contains not printable characters */
    public static long m1841(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((FileChannelDataSource) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static Object m1842(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((C0370g4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۨ, reason: not valid java name and contains not printable characters */
    public static View m1843(Object obj) {
        if (C0017.m846() >= 0) {
            return ((I1) obj).getSaveExpandLayout();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠۟, reason: not valid java name and contains not printable characters */
    public static ScriptState m1844() {
        if (C0021.m1598() < 0) {
            return ScriptState.RUNNING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۧ, reason: not valid java name and contains not printable characters */
    public static Button m1845(Object obj) {
        if (C0031.m3075() > 0) {
            return ((C0344d) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۢ, reason: not valid java name and contains not printable characters */
    public static String m1846() {
        if (C0034.m3450() > 0) {
            return "<destprovidername>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۨ, reason: not valid java name and contains not printable characters */
    public static int m1847(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((AbstractCollection) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨۧۨ, reason: not valid java name and contains not printable characters */
    public static N2 m1848() {
        if (C0037.m3837() <= 0) {
            return N2.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m1849(Object obj) {
        if (C0016.m717() < 0) {
            return ((C0426q) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static String m1850(Object obj) {
        if (C0039.m4109() > 0) {
            return ((SerializedName) obj).value();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m1851(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static long m1852(Object obj) {
        if (C0039.m4109() > 0) {
            return ((Number) obj).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۥۡۡ, reason: not valid java name and contains not printable characters */
    public static void m1853(Object obj) throws IOException {
        if (C0065.m4647() > 0) {
            ((URLConnection) obj).connect();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۡۦ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m1854(Object obj, int i, int i2) {
        if (C0032.m3184() <= 0) {
            return VerityTreeBuilder.b((ByteBuffer) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۡۨ, reason: not valid java name and contains not printable characters */
    public static q5 m1855(Object obj) {
        if (C0069.m5781() < 0) {
            return ((E5) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m1856(Object obj) {
        if (C0016.m717() <= 0) {
            return ((ApkSigner) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static KmsType m1857(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((KmsException) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static List m1858(Object obj, Object obj2) {
        if (C0039.m4109() > 0) {
            return C0029.m2729((BerDataValue) obj, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static C0425p4 m1859(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((C0361f2) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static CharBuffer m1860(Object obj, Object obj2) {
        if (C0020.m1385() <= 0) {
            return ((CharsetDecoder) obj).decode((ByteBuffer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۥۧ, reason: not valid java name and contains not printable characters */
    public static Object m1861(Object obj, Object obj2) {
        if (C0066.m4827() >= 0) {
            return ((I3) obj).apply(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m1862(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            ((PrintStream) obj).print((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۥۦ, reason: not valid java name and contains not printable characters */
    public static String m1863() {
        if (C0026.m2298() <= 0) {
            return "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static int m1864(Object obj, Object obj2) {
        if (C0033.m3358() < 0) {
            return Log.i((String) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۡ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m1865(Object obj, Object obj2) {
        if (C0020.m1385() < 0) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡۢۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m1866(Object obj) {
        if (C0111.m13165() < 0) {
            return ((F3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۤ, reason: not valid java name and contains not printable characters */
    public static C4 m1867(Object obj) {
        if (C0072.m6216() > 0) {
            return ((A4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧۨ, reason: not valid java name and contains not printable characters */
    public static int m1868(Object obj) {
        if (C0111.m13165() < 0) {
            return ZipUtils.getZipEocdCentralDirectoryTotalRecordCount((ByteBuffer) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۥ۟, reason: not valid java name and contains not printable characters */
    public static String m1869() {
        if (C0021.m1598() <= 0) {
            return "<srckeystore>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1870(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((JsonWriter) obj).getSerializeNulls();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static int m1871(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((C1) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m1872() {
        if (C0070.m5903() > 0) {
            return "Alg.Alias.Mac.PBEWITHHMACSHA224";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۦۣ, reason: not valid java name and contains not printable characters */
    public static C0351e m1873(Object obj) {
        if (C0029.m2791() > 0) {
            return C0351e.a((LayoutInflater) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۢۡ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.SignerConfig m1874(Object obj) {
        if (C0029.m2791() > 0) {
            return ((V4SchemeSigner.SignerConfig) obj).v41Config;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠, reason: not valid java name and contains not printable characters */
    public static Key m1875(Object obj, Object obj2, Object obj3) {
        if (C0028.m2593() > 0) {
            return M4.b((KeyStore) obj, (String) obj2, (ArrayList) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1876() {
        if (C0016.m717() <= 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_MALFORMED_CERTIFICATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۤۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1877(Object obj) {
        if (C0065.m4647() > 0) {
            return ((V1SchemeVerifier.Result) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۡۤ, reason: not valid java name and contains not printable characters */
    public static void m1878(Object obj, int i) {
        if (C0029.m2791() > 0) {
            ((AutoClickBean) obj).setResolutionHeight(i);
        }
    }

    /* JADX INFO: renamed from: ۢۥۡۨ, reason: not valid java name and contains not printable characters */
    public static String m1879() {
        if (C0017.m846() > 0) {
            return "Alg.Alias.Signature.2.16.840.1.101.3.4.2.3with1.2.840.113549.1.1.1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m1880(Object obj) {
        if (C0027.m2460() >= 0) {
            return ApkSigningBlockUtils.encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static List m1881(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((SourceStampVerifier.Result.SourceStampInfo) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m1882(Object obj) {
        if (C0016.m717() <= 0) {
            O2.G((String[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۠۟, reason: not valid java name and contains not printable characters */
    public static S4 m1883() {
        if (C0030.m2940() >= 0) {
            return S4.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۥۨ, reason: not valid java name and contains not printable characters */
    public static Toast m1884(Object obj, Object obj2, int i) {
        if (C0063.m4427() >= 0) {
            return Toast.makeText((Context) obj, (CharSequence) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static y5 m1885(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((C0430q3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static void m1886(Object obj, int i) {
        if (C0018.m1064() > 0) {
            ((AutoClickPointerBean) obj).setDelayEnd(i);
        }
    }

    /* JADX INFO: renamed from: ۣۥۤۥ, reason: not valid java name and contains not printable characters */
    public static Path m1887(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((Path) obj).getFileName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static List m1888(Object obj) {
        if (C0016.m717() <= 0) {
            return ((ApkVerifier.Result.V2SchemeSignerInfo) obj).getErrors();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۣۣ, reason: not valid java name and contains not printable characters */
    public static HashMap m1889(Object obj) {
        if (m1921() > 0) {
            return ((C0350d5) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥۦ, reason: not valid java name and contains not printable characters */
    public static MethodHandle m1890(Object obj, Object obj2) {
        if (C0025.m2132() > 0) {
            return ((MethodHandles.Lookup) obj).unreflectGetter((Field) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۨ, reason: not valid java name and contains not printable characters */
    public static Intent m1891(Object obj, Object obj2, Object obj3) {
        if (C0018.m1064() >= 0) {
            return ((Intent) obj).setDataAndType((Uri) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m1892(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((C0479z) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦۤ, reason: not valid java name and contains not printable characters */
    public static File m1893(Object obj) {
        if (C0066.m4827() > 0) {
            return ((File) obj).getCanonicalFile();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static MatchType m1894() {
        if (C0016.m717() < 0) {
            return MatchType.BREAK;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1895() {
        if (C0026.m2298() <= 0) {
            return ApkVerifier.Issue.V3_SIG_NO_SUPPORTED_SIGNATURES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۨ, reason: not valid java name and contains not printable characters */
    public static V m1896(Object obj) {
        if (C0076.m6903() < 0) {
            return ((W) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۦۣ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m1897(Object obj, double d) {
        if (C0021.m1598() < 0) {
            return ((StringBuilder) obj).append(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۤ, reason: not valid java name and contains not printable characters */
    public static String m1898() {
        if (C0076.m6903() <= 0) {
            return "<srcprovidername>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m1899(Object obj) {
        if (C0016.m717() < 0) {
            return ((ByteBufferDataSource) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۢ۟, reason: not valid java name and contains not printable characters */
    public static EditText m1900(Object obj) {
        if (C0064.m4578() > 0) {
            return ((C0344d) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۠ۢ, reason: contains not printable characters */
    public static long m1901(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((C0361f2) obj).I;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۢ۠ۥ, reason: contains not printable characters */
    public static File m1902(Object obj) {
        if (C0072.m6216() > 0) {
            return ((ApkVerifier) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۤۥ, reason: contains not printable characters */
    public static DigestAlgorithm m1903(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((DefaultApkSignerEngine) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۡ, reason: contains not printable characters */
    public static List m1905(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0111.m13165() <= 0) {
            return V1SchemeSigner.sign((List) obj, (DigestAlgorithm) obj2, (Map) obj3, (List) obj4, (byte[]) obj5, (String) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۧ, reason: contains not printable characters */
    public static byte[] m1906(Object obj) {
        if (C0020.m1385() < 0) {
            return ((C0388j3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۦۡ, reason: contains not printable characters */
    public static int m1907(Object obj) {
        if (C0037.m3837() < 0) {
            return ((ManifestParser.Section) obj).getStartOffset();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۢ۠, reason: contains not printable characters */
    public static MatchType m1908(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((ScriptMatchBean) obj).matchType;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۨ۟, reason: contains not printable characters */
    public static int m1909(Object obj) {
        if (C0066.m4827() > 0) {
            return ((Z4) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۤۡ, reason: contains not printable characters */
    public static int m1910(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((T1) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۧۨ, reason: contains not printable characters */
    public static Type[] m1911(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((ParameterizedType) obj).getActualTypeArguments();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۥۤ, reason: contains not printable characters */
    public static TextView m1912(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((K0) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۧۥ, reason: contains not printable characters */
    public static String m1913() {
        if (C0072.m6216() > 0) {
            return System.lineSeparator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m1914(Object obj) {
        if (C0037.m3837() < 0) {
            return V0.a((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static C0387j2 m1915(Object obj) {
        if (C0075.m6893() > 0) {
            return ((E5) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int m1916(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo.AdditionalAttribute) obj).getId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۤ۟, reason: not valid java name and contains not printable characters */
    public static void m1917(Object obj, Object obj2, int i, int i2) {
        if (C0073.m6356() <= 0) {
            ((Deflater) obj).setInput((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۡ, reason: not valid java name and contains not printable characters */
    public static List m1918(Object obj) {
        if (C0025.m2132() > 0) {
            return ApkSigningBlockUtils.encodeCertificates((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥ۠, reason: not valid java name and contains not printable characters */
    public static void m1919(Object obj, Object obj2) {
        if (m1921() >= 0) {
            ((WindowManager) obj).removeViewImmediate((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Annotation m1920(Object obj, Object obj2) {
        if (C0020.m1385() <= 0) {
            return ((Field) obj).getDeclaredAnnotation((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣۧ, reason: not valid java name and contains not printable characters */
    public static int m1921() {
        return 1751452 ^ C0032.m3236((Object) "ۤ۟ۨ");
    }

    /* JADX INFO: renamed from: ۧۨۢۢ, reason: not valid java name and contains not printable characters */
    public static Collector m1922() {
        if (C0075.m6893() >= 0) {
            return Collectors.toList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static C0444t0 m1923(Object obj, Object obj2) {
        if (C0035.m3569() < 0) {
            return ((C0) obj).d((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m1924(Object obj) {
        if (C0035.m3569() < 0) {
            ((C0404m1) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۨۡۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1925(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((U3) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1926(Object obj) {
        if (C0070.m5903() > 0) {
            return ((I1) obj).n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤۡۨ, reason: not valid java name and contains not printable characters */
    public static Certificate m1927(Object obj, Object obj2) {
        if (C0036.m3653() <= 0) {
            return O2.A((Certificate) obj, (KeyStore) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m1928(Object obj) {
        if (C0024.m2011() < 0) {
            return ((AtomicInteger) obj).get();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۧ۠, reason: contains not printable characters */
    public static String m1904(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
