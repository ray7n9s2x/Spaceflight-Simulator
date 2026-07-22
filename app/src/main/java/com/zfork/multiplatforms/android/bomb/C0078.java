package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsSeekBar;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4SchemeSigner;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerEncoding;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.oid.OidConstants;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.x509.RSAPublicKey;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipSections;
import com.joke.basetoollib.C0063;
import com.joke.basetoollib.GsonUtils;
import com.joke.connectdevice.bean.AutoClickBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptActionBean;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.X509Extension;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.jar.Attributes;
import java.util.zip.Inflater;
import javax.crypto.EncryptedPrivateKeyInfo;
import javax.crypto.Mac;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.۠ۥۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0078 {

    /* JADX INFO: renamed from: ۥۣۢ۠, reason: contains not printable characters */
    public static int f384 = 35;

    /* JADX INFO: renamed from: ۣ۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static C0392k1 m7310(Object obj) {
        if (C0019.m1311() == 0) {
            return ((C0398l1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m7311(Object obj, boolean z) {
        if (C0065.m4647() >= 0) {
            return ((ApkSigner.Builder) obj).setRotationTargetsDevRelease(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m7312(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((D0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static List m7313(Object obj) {
        if (C0032.m3184() < 0) {
            return ((SourceStampVerifier.Result.SourceStampInfo) obj).getErrors();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static int m7314(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((L1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static T m7315(Object obj) {
        if (C0071.m6069() > 0) {
            return ((O) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Button m7316(Object obj) {
        if (C0111.m13165() < 0) {
            return ((C0344d) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Mac m7317(Object obj) {
        if (C0019.m1311() == 0) {
            return Mac.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m7318(Object obj) {
        if (C0026.m2298() < 0) {
            return ApkSigningBlockUtils.encodeAsLengthPrefixedElement((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static String m7319(Object obj) {
        if (C0077.m7272() < 0) {
            return ((ScriptActionBean) obj).name;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static DigestAlgorithm m7320(Object obj, int i) {
        if (C0111.m13165() < 0) {
            return V1SchemeSigner.getSuggestedSignatureDigestAlgorithm((PublicKey) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m7321(Object obj) {
        if (C0071.m6069() > 0) {
            return ((s5) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static int m7322(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((T1) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7323(Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            return ((Class) obj).isInstance(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟۠, reason: not valid java name and contains not printable characters */
    public static File m7324(Object obj) {
        if (C0036.m3653() < 0) {
            return ((T2) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static BigInteger m7325(Object obj) {
        if (C0032.m3184() < 0) {
            return ((RSAPublicKey) obj).modulus;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m7326() {
        if (C0064.m4578() >= 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_NO_SUPPORTED_SIGNATURE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m7327() {
        if (C0075.m6893() > 0) {
            return C0458v2.b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m7328() {
        if (C0033.m3358() <= 0) {
            return "Alg.Alias.Mac.1.2.840.113549.2.9";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m7329(Object obj, Object obj2, long j, long j2, Object obj3, int i) {
        if (C0075.m6893() > 0) {
            AbstractC0390k.d((RandomAccessFile) obj, (Q4) obj2, j, j2, (N3) obj3, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7330(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((SourceStampVerifier.Result) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m7331(Object obj) {
        if (C0019.m1311() == 0) {
            return ((C0474y0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static V4Signature.SigningInfoBlock m7332(Object obj) {
        if (C0026.m2298() <= 0) {
            return V4Signature.SigningInfoBlock.fromByteBuffer((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟۠, reason: not valid java name and contains not printable characters */
    public static PKCS8EncodedKeySpec m7333(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            return M4.a((EncryptedPrivateKeyInfo) obj, (ArrayList) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7334(Object obj) {
        if (C0074.m6454() < 0) {
            return ((C0) obj).G;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m7335() {
        if (C0070.m5903() > 0) {
            return "SHA384withRSA/PSS";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m7336(Object obj) {
        if (C0074.m6454() < 0) {
            return ((AutoClickBean) obj).getPlanContent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static DialogC0331b0 m7337(Object obj) {
        if (C0036.m3653() < 0) {
            return ((C0361f2) obj).s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m7338(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            return ((Z0) obj).read((byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۢۥۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m7339(Object obj) {
        if (C0028.m2593() > 0) {
            return ((ApkSigningBlockUtils.VerityTreeAndDigest) obj).tree;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m7340(Object obj, Object obj2) {
        if (C0111.m13165() <= 0) {
            ApkVerifier.c((List) obj, (HashMap) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥۢۦ, reason: not valid java name and contains not printable characters */
    public static String m7341(Object obj) {
        if (C0018.m1064() > 0) {
            return ((C0361f2) obj).G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۟۠, reason: not valid java name and contains not printable characters */
    public static long m7342(long j, long j2) {
        if (C0024.m2011() < 0) {
            return ApkSigningBlockUtils.access$1100(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7343(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((JsonReader) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static TextView m7344(Object obj) {
        if (C0020.m1385() < 0) {
            return ((C4) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m7345(Object obj) {
        if (C0038.m4010() > 0) {
            return ((SigningCertificateLineage.SignerCapabilities) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static void m7346(Object obj, Object obj2) {
        if (C0065.m4647() > 0) {
            ((Window) obj).setAttributes((WindowManager.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static Pair m7347(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0111.m13165() <= 0) {
            return ApkSigningBlockUtils.computeContentDigests((RunnablesExecutor) obj, (DataSource) obj2, (DataSource) obj3, (DataSource) obj4, (List<ApkSigningBlockUtils.SignerConfig>) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۤۢ, reason: not valid java name and contains not printable characters */
    public static String m7348(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0074.m6454() < 0) {
            return AbstractC0406m3.y((File) obj, (File) obj2, (File) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m7349(Object obj, int i) {
        if (C0031.m3075() >= 0) {
            return Arrays.copyOf((byte[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m7350(Object obj) {
        if (C0017.m846() >= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo.Signature) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int[] m7351() {
        if (C0072.m6216() > 0) {
            return C0330b.h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m7352() {
        if (C0034.m3450() >= 0) {
            return TypeAdapters.FLOAT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m7353() {
        if (C0031.m3075() >= 0) {
            return "OpenSSLEvpCipherAES$AES$ECB$PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m7354(Object obj) {
        if (C0075.m6893() >= 0) {
            Arrays.sort((Object[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static void m7355(Object obj, boolean z) {
        if (C0017.m846() > 0) {
            ((AbsSeekBar) obj).setSplitTrack(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m7356() {
        if (C0067.m5468() < 0) {
            return "DESEDE/CBC/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m7357(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((Charset) obj).name();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static C0479z m7358(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((C0468x0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡۧ, reason: not valid java name and contains not printable characters */
    public static V m7359(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((W) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥ۠, reason: not valid java name and contains not printable characters */
    public static Context m7360(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((L0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static DialogC0421p0 m7361(Object obj, int i, boolean z) {
        if (C0075.m6893() > 0) {
            return DialogC0421p0.a((Context) obj, i, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m7362() {
        if (C0072.m6216() >= 0) {
            return X4.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟۟, reason: not valid java name and contains not printable characters */
    public static int m7363(Object obj) {
        if (C0072.m6216() > 0) {
            return ((CentralDirectoryRecord) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۢ, reason: not valid java name and contains not printable characters */
    public static String m7364(String str) {
        String strM2993 = C0031.m2993();
        String strM29932 = C0031.m2993();
        for (int i = 0; i < 15; i++) {
            strM2993 = C0077.m7301(C0030.m2967(C0030.m2967(new StringBuffer(), strM2993), C0021.m1651(i)));
            strM29932 = C0077.m7301(C0027.m2461(C0030.m2967(new StringBuffer(), strM29932), ((int) (C0038.m3986() * ((double) 10))) ^ i));
        }
        while (m7380(strM2993) > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(m7380(str) / 2);
        for (int i2 = 0; i2 < m7380(str); i2 += 2) {
            C0070.m5921(byteArrayOutputStream, (C0024.m2051(strM2993, C0077.m7212(str, i2)) << 4) | C0024.m2051(strM2993, C0077.m7212(str, i2 + 1)));
        }
        byte[] bArrM7297 = C0077.m7297(byteArrayOutputStream);
        int length = bArrM7297.length;
        int iM7380 = m7380(strM29932);
        for (int i3 = 0; i3 < length; i3++) {
            bArrM7297[i3] = (byte) (bArrM7297[i3] ^ C0077.m7212(strM29932, i3 % iM7380));
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۧ, reason: not valid java name and contains not printable characters */
    public static String m7365(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((File) obj).getPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static TextView m7366(Object obj) {
        if (C0069.m5781() < 0) {
            return ((DialogC0389j4) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static void m7367(Object obj, Object obj2) {
        if (C0031.m3075() >= 0) {
            ((C0451u1) obj).a(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7368(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((ApkSigner) obj).r;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m7369(Object obj, Object obj2) {
        if (C0074.m6454() <= 0) {
            return V4SchemeSigner.c((DataSource) obj, (ApkUtils.ZipSections) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Activity m7370(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((C0408n) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣ۠, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m7371(Object obj) {
        if (C0034.m3450() > 0) {
            return ((L) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۡ, reason: not valid java name and contains not printable characters */
    public static Paint m7372(Object obj) {
        if (C0037.m3837() < 0) {
            return ((Z4) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m7373() {
        if (C0069.m5781() <= 0) {
            return ApkVerifier.Issue.JAR_SIG_MISSING_VERSION_ATTR_IN_SIG_FILE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۤۦ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m7374(Object obj) {
        if (C0019.m1311() == 0) {
            return ((K0) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠, reason: not valid java name and contains not printable characters */
    public static int m7375(Object obj, int i) {
        if (C0031.m3075() >= 0) {
            return ((AndroidBinXmlParser) obj).getAttributeNameResourceId(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۡ, reason: not valid java name and contains not printable characters */
    public static C0370g4 m7376(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((ViewOnClickListenerC0454u4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۧ, reason: not valid java name and contains not printable characters */
    public static C0408n m7377(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((O) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7378(Object obj) {
        if (C0033.m3358() < 0) {
            return ((Q0) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m7379(Object obj) {
        if (C0077.m7272() < 0) {
            return ((AtomicInteger) obj).incrementAndGet();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠۠, reason: not valid java name and contains not printable characters */
    public static int m7380(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((String) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤۢ, reason: not valid java name and contains not printable characters */
    public static String m7381(Object obj) {
        if (C0033.m3358() < 0) {
            return OidConstants.OidToUserFriendlyNameMapper.getUserFriendlyNameForOid((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۦ, reason: not valid java name and contains not printable characters */
    public static ImageView m7382(Object obj) {
        if (C0018.m1064() > 0) {
            return ((C0361f2) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m7383() {
        if (C0021.m1598() <= 0) {
            return OidConstants.OidToUserFriendlyNameMapper.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m7384(Object obj) {
        if (C0017.m846() > 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۥ۟, reason: not valid java name and contains not printable characters */
    public static String m7385(Object obj) {
        if (C0065.m4647() > 0) {
            return ((Activity) obj).getLocalClassName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۡۥ, reason: not valid java name and contains not printable characters */
    public static C0444t0 m7386(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((C0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۦ, reason: not valid java name and contains not printable characters */
    public static PublicKey m7387(Object obj, Object obj2) {
        if (C0076.m6903() < 0) {
            return ((KeyFactory) obj).generatePublic((KeySpec) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۢ۟, reason: not valid java name and contains not printable characters */
    public static TextView m7388(Object obj) {
        if (C0029.m2791() > 0) {
            return ((C0460v4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۦ, reason: not valid java name and contains not printable characters */
    public static void m7389(Object obj, Object obj2) {
        if (C0031.m3075() >= 0) {
            ((C0362f3) obj).b((C0450u0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static DataSource m7390(Object obj) {
        if (m7450() > 0) {
            return ((V3SchemeSigner) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static LinkOption[] m7391() {
        if (C0016.m717() < 0) {
            return J3.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static String m7392() {
        if (C0066.m4827() > 0) {
            return "Alg.Alias.Mac.HMAC/MD5";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static HashSet m7393() {
        if (C0073.m6356() <= 0) {
            return DefaultApkSignerEngine.H;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static TextView m7394(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((C0) obj).t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7395(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((ApkVerifier.Result) obj).o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static F5 m7396(Object obj) {
        if (C0033.m3358() < 0) {
            return ((C0414o) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m7397(Object obj) {
        if (C0034.m3450() > 0) {
            return m7345((SigningCertificateLineage.SignerCapabilities) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static S m7398() {
        if (C0063.m4427() >= 0) {
            return T.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟, reason: not valid java name and contains not printable characters */
    public static List m7399(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((DefaultApkSignerEngine) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m7400(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((C0426q) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static Set m7401(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((X509Extension) obj).getNonCriticalExtensionOIDs();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۥ۟, reason: not valid java name and contains not printable characters */
    public static String m7402() {
        if (C0018.m1064() > 0) {
            return C0412n3.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۢۨ, reason: not valid java name and contains not printable characters */
    public static void m7403(Object obj, int i) {
        if (C0066.m4827() >= 0) {
            ((AutoClickPointerBean) obj).setClickIntervalEnd(i);
        }
    }

    /* JADX INFO: renamed from: ۡۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static float m7404(Object obj) {
        if (C0027.m2460() > 0) {
            return ((DisplayMetrics) obj).density;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۡۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7405(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((B1) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m7406(Object obj) {
        if (C0019.m1311() == 0) {
            return ((JsonReader) obj).nextString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static View m7407(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((I1) obj).getAddPointerLayout();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۨۢ, reason: not valid java name and contains not printable characters */
    public static Comparator m7408() {
        if (C0020.m1385() < 0) {
            return String.CASE_INSENSITIVE_ORDER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m7409(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((C0334b3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤ۠, reason: not valid java name and contains not printable characters */
    public static String m7410() {
        if (C0035.m3569() <= 0) {
            return "RSA/ECB/OAEPWithSHA-1AndMGF1Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7411(Object obj, Object obj2) {
        if (C0024.m2011() < 0) {
            return ((ArrayList) obj).remove(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۣۣ, reason: not valid java name and contains not printable characters */
    public static String m7412() {
        if (C0023.m1921() >= 0) {
            return "OpenSSLKeyHolder|java.security.interfaces.RSAPrivateKey|java.security.interfaces.ECPrivateKey|java.security.interfaces.RSAPublicKey";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۤۢ, reason: not valid java name and contains not printable characters */
    public static Object m7413(Object obj, Object obj2) {
        if (C0067.m5468() < 0) {
            return GsonUtils.fromJson((String) obj, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۥۡ, reason: not valid java name and contains not printable characters */
    public static PrivateKey m7414(Object obj) {
        if (C0026.m2298() < 0) {
            return ((KeyConfig.Jca) obj).privateKey;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۧۡ, reason: not valid java name and contains not printable characters */
    public static List m7415(Object obj) {
        if (C0067.m5468() < 0) {
            return ((ThreadPoolExecutor) obj).shutdownNow();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m7416(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((V1SchemeVerifier.NamedDigest) obj).digest;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۢۤ, reason: not valid java name and contains not printable characters */
    public static String m7417(Object obj) {
        if (C0068.m5678() > 0) {
            return ((SimpleDateFormat) obj).toPattern();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۧۢ, reason: not valid java name and contains not printable characters */
    public static ApkUtils.ZipSections m7418(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((V3SchemeVerifier.Builder) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m7419(Object obj) {
        if (C0070.m5903() > 0) {
            return ((CentralDirectoryRecord) obj).h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۨۡ۠, reason: not valid java name and contains not printable characters */
    public static void m7420(Object obj, float f) {
        if (C0070.m5903() >= 0) {
            ((AutoClickPointerBean) obj).setRelativePercentX(f);
        }
    }

    /* JADX INFO: renamed from: ۣۢۨۧ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m7421(Object obj, Object obj2, int i) {
        if (C0018.m1064() > 0) {
            return ((C0) obj).e((Activity) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m7422(Object obj) {
        if (C0026.m2298() <= 0) {
            ((ApkSigner.Builder) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static int m7423(Object obj) {
        if (C0034.m3450() > 0) {
            return ((C0426q) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m7424(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((ManifestParser) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m7425() {
        if (C0066.m4827() > 0) {
            return D2.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۣۤ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m7426() {
        if (C0039.m4109() > 0) {
            return ApkVerifier.Issue.V2_SIG_MALFORMED_PUBLIC_KEY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۨ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m7428(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0067.m5468() < 0) {
            return ((F3) obj).f((byte[]) obj2, (Charset) obj3, (Charset[]) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7429(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((C0412n3) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡۡۧ, reason: not valid java name and contains not printable characters */
    public static int m7430(Object obj) {
        if (C0063.m4427() >= 0) {
            return V4Signature.bytesSize((byte[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۤۢ۟, reason: not valid java name and contains not printable characters */
    public static void m7431(Object obj, Object obj2, Object obj3) {
        if (C0028.m2593() >= 0) {
            ((TypeAdapter) obj).write((JsonWriter) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static void m7432(Object obj, Object obj2, Object obj3) {
        if (C0037.m3837() < 0) {
            ((A5) obj).a((InputStream) obj2, (F5) obj3);
        }
    }

    /* JADX INFO: renamed from: ۤۥۤۨ, reason: not valid java name and contains not printable characters */
    public static int m7433(Object obj, float f) {
        if (m7450() >= 0) {
            return AbstractC0406m3.f((Context) obj, f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m7434(Object obj) {
        if (C0074.m6454() < 0) {
            return ((android.util.Pair) obj).second;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۧ, reason: contains not printable characters */
    public static String m7435() {
        if (C0034.m3450() >= 0) {
            return "OpenSSLSignature$SHA224RSAPSS";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۤ, reason: contains not printable characters */
    public static List m7436(Object obj) {
        if (C0024.m2011() < 0) {
            return ((DefaultApkSignerEngine) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۢ۠, reason: contains not printable characters */
    public static int m7437(Object obj) {
        if (C0031.m3075() > 0) {
            return ((SignatureAlgorithm) obj).getId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۡۥۦ, reason: contains not printable characters */
    public static int m7438(Object obj) {
        if (C0036.m3653() < 0) {
            return ((M2) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۨ۠, reason: contains not printable characters */
    public static String m7439(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((DialogC0385j0) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۤۤ, reason: contains not printable characters */
    public static Attributes.Name m7440() {
        if (C0020.m1385() <= 0) {
            return Attributes.Name.MANIFEST_VERSION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۥۦ, reason: contains not printable characters */
    public static void m7441(Object obj, Object obj2) {
        if (C0063.m4427() > 0) {
            V4Signature.writeBytes((ByteBuffer) obj, (byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۥۣ۠, reason: contains not printable characters */
    public static ApkVerifier.Issue m7442() {
        if (C0037.m3837() <= 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_MALFORMED_SIGNATURE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۧۤ, reason: contains not printable characters */
    public static Uri m7443(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((C0479z) obj).f();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۣۧ, reason: contains not printable characters */
    public static ArrayList m7444(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((ApkVerifier.Result) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۡ, reason: contains not printable characters */
    public static void m7445(Object obj, int i, Object obj2) {
        if (C0064.m4578() > 0) {
            ((C0426q) obj).d(i, (byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۡۨ, reason: contains not printable characters */
    public static boolean m7446(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((G0) obj).n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۨۨ, reason: contains not printable characters */
    public static Object m7447(Object obj, Object obj2) {
        if (m7450() >= 0) {
            return Array.newInstance((Class<?>) obj, (int[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۨ۠, reason: contains not printable characters */
    public static Point m7448(Object obj) {
        if (C0019.m1311() == 0) {
            return ((DialogC0472x4) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۠ۧ, reason: contains not printable characters */
    public static void m7449(Object obj) {
        if (C0067.m5468() < 0) {
            ((Inflater) obj).end();
        }
    }

    /* JADX INFO: renamed from: ۦۧ۠ۨ, reason: contains not printable characters */
    public static int m7450() {
        return 1754629 ^ C0032.m3236((Object) "ۧۨۤ");
    }

    /* JADX INFO: renamed from: ۦۧۤۧ, reason: contains not printable characters */
    public static String m7451() {
        if (C0072.m6216() >= 0) {
            return "key.password.for.alias.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۢۦ, reason: contains not printable characters */
    public static boolean m7452(Object obj, Object obj2) {
        if (C0028.m2593() > 0) {
            return Files.exists((Path) obj, (LinkOption[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m7453(Object obj) {
        if (C0072.m6216() >= 0) {
            return o5.m((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۧ, reason: not valid java name and contains not printable characters */
    public static ShapeDrawable m7454(Object obj) {
        if (C0024.m2011() < 0) {
            return E.e((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۡ, reason: not valid java name and contains not printable characters */
    public static String[] m7455(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((Q) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۤۤ, reason: not valid java name and contains not printable characters */
    public static Exception m7456(Object obj) {
        if (C0025.m2132() > 0) {
            return ((Q3) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۨ۟, reason: not valid java name and contains not printable characters */
    public static int m7457(Object obj) {
        if (C0023.m1921() > 0) {
            return BerEncoding.getTagNumber((Asn1Type) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۣۨ, reason: not valid java name and contains not printable characters */
    public static EnumMap m7458(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0018.m1064() >= 0) {
            return SourceStampVerifier.a((List) obj, (DataSource) obj2, (ZipSections) obj3, (SourceStampVerifier.Result) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۡۤ, reason: not valid java name and contains not printable characters */
    public static l5 m7459() {
        if (m7450() > 0) {
            return l5.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m7460(Object obj, int i) {
        if (C0018.m1064() > 0) {
            ((URLConnection) obj).setConnectTimeout(i);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static Rect m7461(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((Drawable) obj).getBounds();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static TextView m7462(Object obj) {
        if (C0076.m6903() < 0) {
            return ((DialogC0389j4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۨ, reason: not valid java name and contains not printable characters */
    public static void m7463(Object obj, Object obj2) {
        if (C0071.m6069() >= 0) {
            ((Signature) obj).update((ByteBuffer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static String m7464(int i) {
        if (C0077.m7272() < 0) {
            return String.valueOf(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7465(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((E) obj).h();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m7466(Object obj, long j) {
        if (C0029.m2791() > 0) {
            return ((StringBuilder) obj).append(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static WindowManager m7467(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((T1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۦۨ, reason: not valid java name and contains not printable characters */
    public static String m7427(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
