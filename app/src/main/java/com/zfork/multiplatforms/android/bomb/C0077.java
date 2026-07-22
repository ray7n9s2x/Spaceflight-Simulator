package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.HandlerThread;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SearchView;
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
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.oid.OidConstants;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.DelegatingX509Certificate;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipSections;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonNull;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.Excluder;
import com.joke.plugin.gson.internal.LinkedHashTreeMap;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptJumpBean;
import com.joke.script.bean.ScriptMatchBean;
import com.joke.script.bean.ScriptProjectBean;
import com.zfork.entry.C0075;
import com.zfork.entry.MetaSelectAppAbility;
import com.zfork.hawk.cheat.C0076;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.Inflater;
import javax.crypto.Mac;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.C0111;
import sun.security.pkcs.PKCS10Attributes;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.ۣۣ۟ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0077 {

    /* JADX INFO: renamed from: ۟ۡ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f383 = -96;

    /* JADX INFO: renamed from: ۣ۟۟۠۟, reason: not valid java name and contains not printable characters */
    public static long m7155(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((ZipUtils.DeflateResult) obj).inputCrc32;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m7156() {
        if (C0076.m6903() <= 0) {
            return ApkVerifier.Issue.V2_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static int m7157(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((JsonElement) obj).getAsInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m7158() {
        if (C0021.m1598() < 0) {
            return File.separator;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m7159(Object obj) {
        if (C0039.m4109() > 0) {
            return ((DefaultApkSignerEngine.SignerConfig.Builder) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m7160() {
        if (C0019.m1311() == 0) {
            return ApkVerifier.Issue.V2_SIG_UNKNOWN_SIG_ALGORITHM;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۡۧ, reason: not valid java name and contains not printable characters */
    public static Collection m7161(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((PKCS10Attributes) obj).getAttributes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7162(Object obj, Object obj2) {
        if (C0026.m2298() <= 0) {
            return ((List) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static Uri m7163(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            return C0348d3.c((Context) obj, (File) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m7164(Object obj, Object obj2) {
        if (C0074.m6454() <= 0) {
            ((AbsListView) obj).setOnScrollListener((AbsListView.OnScrollListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static void m7165(Object obj) {
        if (C0020.m1385() < 0) {
            System.loadLibrary((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m7166(Object obj) {
        if (C0033.m3358() <= 0) {
            ((T1) obj).cancel();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m7167(Object obj, Object obj2, boolean z) {
        if (C0068.m5678() > 0) {
            T1.c((T1) obj, (WindowManager.LayoutParams) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m7168(Object obj, Object obj2) {
        if (C0016.m717() < 0) {
            AbstractC0449u.d((M4) obj, (F3) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m7169(Object obj) {
        if (C0073.m6356() < 0) {
            return ((ZipSections) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static RandomAccessFile m7170(Object obj) {
        if (C0024.m2011() < 0) {
            return ((Q4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static void m7171(Object obj, float f) {
        if (C0016.m717() < 0) {
            ((TextView) obj).setTextSize(f);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۧ, reason: not valid java name and contains not printable characters */
    public static void m7172(Object obj, Object obj2) {
        if (C0016.m717() < 0) {
            C0348d3.a((C0348d3) obj, (File) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۥ, reason: not valid java name and contains not printable characters */
    public static long m7173(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((U3) obj).z;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m7174() {
        if (C0028.m2593() > 0) {
            return TypeAdapters.CHARACTER_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m7175(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((O2) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static List m7176(Object obj) {
        if (C0039.m4109() > 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static Charset m7177(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((F3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m7178(Object obj) {
        if (C0064.m4578() > 0) {
            return C0071.m6025(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧۡ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m7179(Object obj, boolean z) {
        if (C0070.m5903() > 0) {
            return ((StringBuilder) obj).append(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۡۢ, reason: not valid java name and contains not printable characters */
    public static List m7180(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((SourceStampVerifier.Result) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m7181(Object obj) {
        if (C0032.m3184() < 0) {
            return ((Pair) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static FrameLayout m7182(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((C0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static String m7183() {
        if (C0026.m2298() < 0) {
            return "<valDays>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۢ۠, reason: not valid java name and contains not printable characters */
    public static String m7184(Object obj) {
        if (C0037.m3837() < 0) {
            return ((V1SchemeVerifier.Result.SignerInfo) obj).name;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۦ۠, reason: not valid java name and contains not printable characters */
    public static void m7185(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0039.m4109() > 0) {
            ((PopupWindow) obj).showAtLocation((View) obj2, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۥۢ, reason: not valid java name and contains not printable characters */
    public static long m7186(Object obj) {
        if (C0073.m6356() < 0) {
            return ((E5) obj).j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۧۥۤ, reason: not valid java name and contains not printable characters */
    public static TextView m7187(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((DialogC0373h0) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static int m7188(int i) {
        if (C0020.m1385() <= 0) {
            return K3.f(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m7189() {
        if (C0023.m1921() > 0) {
            return "Your.keystore.contains.keyStore.size.entry";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static D5 m7190(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((C0420p) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static int m7191(Object obj) {
        if (C0016.m717() <= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo.ContentDigest) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m7192(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((CentralDirectoryRecord) obj).getCrc32();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۥ, reason: not valid java name and contains not printable characters */
    public static String m7193() {
        if (C0021.m1598() < 0) {
            return "Alg.Alias.Cipher.GCM";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static String m7194(String str) {
        String strM2993 = C0031.m2993();
        String strM29932 = C0031.m2993();
        for (int i = 0; i < 15; i++) {
            strM2993 = m7301(C0030.m2967(C0030.m2967(new StringBuffer(), strM2993), C0021.m1651(i)));
            strM29932 = m7301(C0027.m2461(C0030.m2967(new StringBuffer(), strM29932), ((int) (C0038.m3986() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0078.m7380(str) / 2);
        for (int i2 = 0; i2 < C0078.m7380(str); i2 += 2) {
            C0070.m5921(byteArrayOutputStream, (C0024.m2051(strM2993, m7212(str, i2)) << 4) | C0024.m2051(strM2993, m7212(str, i2 + 1)));
        }
        byte[] bArrM7297 = m7297(byteArrayOutputStream);
        int length = bArrM7297.length;
        int iM7380 = C0078.m7380(strM29932);
        for (int i3 = 0; i3 < length; i3++) {
            bArrM7297[i3] = (byte) (bArrM7297[i3] ^ m7212(strM29932, i3 % iM7380));
        }
        for (int iM73802 = 0; iM73802 < bArrM7297.length; iM73802 = C0078.m7380(C0031.m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۟ۤۢۡۦ, reason: not valid java name and contains not printable characters */
    public static long m7195(Object obj, int i) {
        if (C0016.m717() < 0) {
            return ZipUtils.getUnsignedInt32((ByteBuffer) obj, i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static String m7196(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((ApplicationInfo) obj).nativeLibraryDir;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۦ۟, reason: not valid java name and contains not printable characters */
    public static String m7197(int i, Object obj, int i2) {
        if (C0028.m2593() >= 0) {
            return h5.a(i, (byte[]) obj, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static int[] m7198() {
        if (C0074.m6454() <= 0) {
            return AbstractC0354e2.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static void m7199(Object obj, int i) {
        if (C0034.m3450() >= 0) {
            ((Q2) obj).a(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m7200(Object obj) {
        if (C0065.m4647() > 0) {
            return ((r5) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m7201(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((C0324a0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static X509Certificate m7202(Object obj) {
        if (C0017.m846() >= 0) {
            return ((DelegatingX509Certificate) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ۠, reason: not valid java name and contains not printable characters */
    public static void m7203(Object obj, Object obj2) {
        if (C0064.m4578() >= 0) {
            ((View) obj).setOnLongClickListener((View.OnLongClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۦ, reason: not valid java name and contains not printable characters */
    public static void m7204(Object obj, Object obj2) {
        if (C0076.m6903() < 0) {
            ((C0) obj).setListenerOnlyMinWinow((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۤ۟, reason: not valid java name and contains not printable characters */
    public static String m7206() {
        if (C0030.m2940() > 0) {
            return " SupportedKeyFormats";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m7207(Object obj) {
        if (C0035.m3569() < 0) {
            return ((C0408n) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۣ, reason: not valid java name and contains not printable characters */
    public static int m7208(Object obj) {
        if (C0027.m2460() > 0) {
            return ((W) obj).h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۥ, reason: not valid java name and contains not printable characters */
    public static Map m7209() {
        if (C0016.m717() <= 0) {
            return OidConstants.SUPPORTED_SIG_ALG_OIDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨ۟, reason: not valid java name and contains not printable characters */
    public static int m7210(Object obj) {
        if (C0023.m1921() >= 0) {
            return C0111.m13044((ApkSigner.SignerConfig.Builder) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۤ, reason: not valid java name and contains not printable characters */
    public static void m7211(Object obj, int i) {
        if (C0067.m5468() <= 0) {
            ((R0) obj).a(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۧ, reason: not valid java name and contains not printable characters */
    public static char m7212(Object obj, int i) {
        if (C0066.m4827() > 0) {
            return ((String) obj).charAt(i);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m7213(Object obj) {
        if (C0067.m5468() < 0) {
            ((ApkSignerEngine.InspectJarEntryRequest) obj).done();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static SSLSocketFactory m7214(Object obj) {
        if (C0030.m2940() > 0) {
            return ((SSLContext) obj).getSocketFactory();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۧ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m7215() {
        if (C0032.m3184() < 0) {
            return ApkVerifier.Issue.V2_SIG_NO_SIGNERS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۧۥ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m7216() {
        if (C0038.m4010() >= 0) {
            return ApkVerifier.Issue.V3_INCONSISTENT_LINEAGES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۥ, reason: not valid java name and contains not printable characters */
    public static String m7217(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((ApkSigner.SignerConfig.Builder) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m7218() {
        if (C0071.m6069() >= 0) {
            return ApkVerifier.Issue.V2_SIG_MALFORMED_SIGNER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7219(Object obj) {
        if (C0032.m3184() < 0) {
            return C0071.m6032((DefaultApkSignerEngine.SignerConfig.Builder) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۨۦۦ, reason: not valid java name and contains not printable characters */
    public static Matrix m7220(Object obj) {
        if (C0067.m5468() < 0) {
            return ((P) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static long m7221(Object obj) {
        if (C0076.m6903() < 0) {
            return ((Q3) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢۥ, reason: not valid java name and contains not printable characters */
    public static String m7222() {
        if (C0067.m5468() < 0) {
            return "RSA/ECB/PKCS1Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m7223(Object obj) {
        if (C0076.m6903() < 0) {
            return ((Enum) obj).name();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧ۟, reason: not valid java name and contains not printable characters */
    public static byte m7224(Object obj, int i) {
        if (C0026.m2298() < 0) {
            return ((ByteBuffer) obj).get(i);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Signature[] m7225(Object obj) {
        if (C0032.m3184() < 0) {
            return ((PackageInfo) obj).signatures;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۨ, reason: not valid java name and contains not printable characters */
    public static String m7226() {
        if (C0035.m3569() < 0) {
            return "RSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7227(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((ApkSigningBlockUtils.Result) obj).containsErrors();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۦ, reason: not valid java name and contains not printable characters */
    public static DialogC0373h0 m7228(Object obj) {
        if (C0065.m4647() > 0) {
            return ((ViewOnClickListenerC0366g0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static View m7229(Object obj, int i) {
        if (C0039.m4109() >= 0) {
            return ((ViewGroup) obj).getChildAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static Button m7230(Object obj) {
        if (C0027.m2460() > 0) {
            return ((C0351e) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static long m7231(Object obj, Object obj2, long j, Object obj3, int i, int i2, Object obj4) {
        if (C0078.m7450() >= 0) {
            return ApkSigner.b((String) obj, (byte[]) obj2, j, (ArrayList) obj3, i, i2, (DataSink) obj4);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m7232(Object obj, Object obj2) {
        if (C0030.m2940() > 0) {
            return ((HashSet) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۨ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m7233(Object obj, int i, Object obj2) {
        if (C0033.m3358() < 0) {
            return ((C0387j2) obj).d(i, (byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static int m7234(Object obj) {
        if (C0031.m3075() > 0) {
            return ((J1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static short m7235(Object obj) {
        if (C0066.m4827() > 0) {
            return ((CentralDirectoryRecord) obj).getCompressionMethod();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۡ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static V3SchemeVerifier.Builder m7236(Object obj, boolean z) {
        if (C0030.m2940() > 0) {
            return ((V3SchemeVerifier.Builder) obj).setFullVerification(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m7237(Object obj) {
        if (C0028.m2593() > 0) {
            return ((Bitmap) obj).getHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۨۧ, reason: not valid java name and contains not printable characters */
    public static void m7238(Object obj, Object obj2) {
        if (C0021.m1598() <= 0) {
            ((InterfaceC0466w4) obj).d((ScriptProjectBean) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m7239(Object obj, Object obj2) {
        if (C0063.m4427() > 0) {
            ((C0362f3) obj).a((C0355e3) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۤۤ, reason: not valid java name and contains not printable characters */
    public static long m7240() {
        if (C0024.m2011() <= 0) {
            return AbstractC0446t2.e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۦۡۨ, reason: not valid java name and contains not printable characters */
    public static void m7241(Object obj, Object obj2) {
        if (C0027.m2460() >= 0) {
            ((C0451u1) obj).b(obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static int m7242() {
        if (C0016.m717() < 0) {
            return MetaSelectAppAbility.h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۨۡ, reason: not valid java name and contains not printable characters */
    public static void m7243(Object obj, Object obj2) throws InvalidKeyException {
        if (C0038.m4010() > 0) {
            ((Mac) obj).init((Key) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۧۢ, reason: not valid java name and contains not printable characters */
    public static ImageView m7244(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((C0460v4) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦۡ, reason: not valid java name and contains not printable characters */
    public static Object m7245(Object obj) {
        if (C0069.m5781() < 0) {
            return ((T) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7246(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((ApkVerifier.Result) obj).n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static Drawable m7247(Object obj, Object obj2) {
        if (C0035.m3569() < 0) {
            return ((PackageItemInfo) obj).loadIcon((PackageManager) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۤۥ, reason: not valid java name and contains not printable characters */
    public static RunnablesExecutor m7248(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((V3SchemeVerifier.Builder) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۥۨ, reason: not valid java name and contains not printable characters */
    public static int m7249(Object obj, int i) {
        if (C0070.m5903() > 0) {
            return ((String) obj).codePointAt(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m7250(Object obj) {
        if (C0074.m6454() < 0) {
            return ((LocalFileRecord) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static AbstractC0441s3 m7251(Object obj, Object obj2, Object obj3) {
        if (C0038.m4010() > 0) {
            return ((S2) obj).b((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۡ, reason: not valid java name and contains not printable characters */
    public static TextView m7252(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((DialogC0389j4) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static void m7253(Object obj) {
        if (C0067.m5468() < 0) {
            ((C0430q3) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۢۧۡ۟, reason: not valid java name and contains not printable characters */
    public static int m7254(Object obj) {
        if (C0035.m3569() < 0) {
            return ApkUtils.getTargetSdkVersionFromBinaryAndroidManifest((ByteBuffer) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static TextView m7255(Object obj) {
        if (C0026.m2298() < 0) {
            return ((DialogC0389j4) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static ScriptJumpBean m7256(Object obj) {
        if (C0076.m6903() < 0) {
            return ((C4) obj).M;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۨ, reason: not valid java name and contains not printable characters */
    public static void m7257(Object obj, int i) {
        if (C0024.m2011() < 0) {
            ((Window) obj).setBackgroundDrawableResource(i);
        }
    }

    /* JADX INFO: renamed from: ۣۢ۠, reason: not valid java name and contains not printable characters */
    public static int m7258(Object obj) {
        if (C0038.m4010() > 0) {
            return ((ViewOnClickListenerC0379i0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static long[] m7259(Object obj) {
        if (C0036.m3653() <= 0) {
            return h5.f((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۦۤ, reason: not valid java name and contains not printable characters */
    public static EditText m7260(Object obj) {
        if (C0072.m6216() > 0) {
            return DialogC0385j0.a((Activity) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥ, reason: not valid java name and contains not printable characters */
    public static O m7261(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((C0444t0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۣ, reason: not valid java name and contains not printable characters */
    public static String m7262() {
        if (C0025.m2132() > 0) {
            return "Alg.Alias.Mac.HMAC-MD5";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۤ, reason: not valid java name and contains not printable characters */
    public static int m7263(int i) {
        if (C0032.m3184() <= 0) {
            return K3.h(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m7264(Object obj, boolean z) {
        if (C0068.m5678() > 0) {
            ((WebSettings) obj).setBuiltInZoomControls(z);
        }
    }

    /* JADX INFO: renamed from: ۣۣۨۨ, reason: not valid java name and contains not printable characters */
    public static String m7265(Object obj) {
        if (C0033.m3358() < 0) {
            return ((ScriptMatchBean) obj).content;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.Result m7266(Object obj) {
        if (C0028.m2593() > 0) {
            return ((V3SchemeVerifier) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Hints.ByteRange m7267(Object obj, Object obj2) {
        if (C0019.m1311() <= 0) {
            return ((Hints.PatternWithRange) obj).ClampToAbsoluteByteRange((Hints.ByteRange) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦۨ, reason: not valid java name and contains not printable characters */
    public static String m7268() {
        if (C0025.m2132() > 0) {
            return "env";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤ۟, reason: not valid java name and contains not printable characters */
    public static float m7269(Object obj) {
        if (C0066.m4827() > 0) {
            return ((B1) obj).b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۥۢۨ, reason: not valid java name and contains not printable characters */
    public static Locale m7270() {
        if (C0034.m3450() > 0) {
            return Locale.US;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۨۥ, reason: not valid java name and contains not printable characters */
    public static V4 m7271(Object obj) {
        if (C0069.m5781() < 0) {
            return ((V) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۥۤ, reason: not valid java name and contains not printable characters */
    public static int m7272() {
        return (-1750552) ^ C0032.m3236((Object) "ۣ۟۟");
    }

    /* JADX INFO: renamed from: ۥۡۥۥ, reason: contains not printable characters */
    public static C0344d m7273(Object obj) {
        if (C0075.m6893() > 0) {
            return ((E4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۦۧ, reason: contains not printable characters */
    public static JsonNull m7274() {
        if (C0070.m5903() >= 0) {
            return JsonNull.INSTANCE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ, reason: contains not printable characters */
    public static Path m7275(Object obj) {
        if (C0016.m717() <= 0) {
            return C0023.m1887((Path) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۥ۠, reason: contains not printable characters */
    public static String m7276(Object obj) {
        if (C0078.m7450() >= 0) {
            return Log.getStackTraceString((Throwable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۧۢ, reason: contains not printable characters */
    public static String m7277(boolean z) {
        if (C0034.m3450() >= 0) {
            return Boolean.toString(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟, reason: contains not printable characters */
    public static HandlerThread m7278(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((MetaSelectAppAbility) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢ, reason: contains not printable characters */
    public static TextView m7279(Object obj) {
        if (C0070.m5903() > 0) {
            return ((DialogC0331b0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۤ, reason: contains not printable characters */
    public static int m7280(Object obj) {
        if (C0065.m4647() > 0) {
            return ((V4) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۣۡ, reason: contains not printable characters */
    public static Inflater m7281(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((F2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۠ۥ, reason: contains not printable characters */
    public static Object m7282(Object obj) {
        if (C0017.m846() > 0) {
            return ((AbstractC0396l) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۦۥ, reason: contains not printable characters */
    public static String m7283(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((C0337c) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۠ۨ, reason: contains not printable characters */
    public static int m7284(Object obj) {
        if (C0032.m3184() < 0) {
            return ((X2) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۨ۟, reason: contains not printable characters */
    public static boolean m7285(Object obj, Object obj2) {
        if (C0036.m3653() <= 0) {
            return ((Principal) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m7286(Object obj, Object obj2) {
        if (C0017.m846() > 0) {
            return ((String) obj).lastIndexOf((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m7287(Object obj) {
        if (C0067.m5468() < 0) {
            return ((J0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۡۡ, reason: not valid java name and contains not printable characters */
    public static List m7288(Object obj) {
        if (C0069.m5781() < 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۥۧ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m7289(Object obj, char c) {
        if (C0035.m3569() < 0) {
            return ((StringBuilder) obj).append(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥۧ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m7290(Object obj, Object obj2) {
        if (C0037.m3837() < 0) {
            return ((StringBuilder) obj).append((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۦ۠, reason: not valid java name and contains not printable characters */
    public static void m7291(Object obj, Object obj2, Object obj3) {
        if (C0017.m846() > 0) {
            ((O2) obj).n((InputStream) obj2, (PrintStream) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۧۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7292(Object obj) {
        if (C0069.m5781() < 0) {
            return ((String) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7293(Object obj, Object obj2) {
        if (C0071.m6069() > 0) {
            return ((LinkedHashTreeMap) obj).containsKey(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۧۤ, reason: not valid java name and contains not printable characters */
    public static V4 m7294(Object obj) {
        if (C0111.m13165() < 0) {
            return ((W) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨۢ, reason: not valid java name and contains not printable characters */
    public static Excluder m7295(Object obj, Object obj2) {
        if (C0065.m4647() >= 0) {
            return ((Excluder) obj).withModifiers((int[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۧۦ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m7296(Object obj) {
        if (C0029.m2791() > 0) {
            return ((TypeAdapter) obj).nullSafe();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m7297(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((ByteArrayOutputStream) obj).toByteArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۢۧ, reason: not valid java name and contains not printable characters */
    public static JsonWriter m7298(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((JsonWriter) obj).endObject();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۢۨ, reason: not valid java name and contains not printable characters */
    public static void m7299(Object obj, int i) {
        if (C0065.m4647() > 0) {
            ((GradientDrawable) obj).setColor(i);
        }
    }

    /* JADX INFO: renamed from: ۧۨۡ, reason: not valid java name and contains not printable characters */
    public static void m7300(Object obj) {
        if (C0023.m1921() >= 0) {
            ((C0361f2) obj).m();
        }
    }

    /* JADX INFO: renamed from: ۧۨۨۤ, reason: not valid java name and contains not printable characters */
    public static String m7301(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((StringBuffer) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static KeyConfig m7302(Object obj) {
        if (C0070.m5903() > 0) {
            return ((SigningCertificateLineage.SignerConfig) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Builder m7303(Object obj, int i) {
        if (C0019.m1311() >= 0) {
            return ((ApkVerifier.Builder) obj).setMaxCheckedPlatformVersion(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥۦ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m7304() {
        if (C0030.m2940() > 0) {
            return ApkVerifier.Issue.V3_SIG_MALFORMED_CERTIFICATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7305(Object obj) {
        if (C0066.m4827() > 0) {
            return ((DefaultApkSignerEngine) obj).D;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤۧۢ, reason: not valid java name and contains not printable characters */
    public static int m7306(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((View) obj).getMeasuredWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7307(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((JsonPrimitive) obj).isString();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦ۠۠, reason: not valid java name and contains not printable characters */
    public static void m7308(Object obj, Object obj2) {
        if (C0016.m717() <= 0) {
            ((O2) obj).o((PrintStream) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۦۣۡ, reason: not valid java name and contains not printable characters */
    public static SearchView m7309(Object obj) {
        if (C0035.m3569() < 0) {
            return ((C0358f) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static String m7205(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
