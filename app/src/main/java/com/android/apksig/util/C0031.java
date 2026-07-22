package com.android.apksig.util;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
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
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.V2SourceStampSigner;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.AlgorithmIdentifier;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.pkcs7.SignerInfo;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.InclusiveIntRange;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickBean;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.bmJiasu.xhook.call.a;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.Excluder;
import com.joke.plugin.gson.internal.LinkedTreeMap;
import com.joke.plugin.gson.internal.Streams;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TreeTypeAdapter;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonToken;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptActionBean;
import com.zfork.entry.C0075;
import com.zfork.entry.SignatureCreatorAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0354e2;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0410n1;
import com.zfork.multiplatforms.android.bomb.AbstractC0446t2;
import com.zfork.multiplatforms.android.bomb.AbstractC0449u;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0323a;
import com.zfork.multiplatforms.android.bomb.C0348d3;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0362f3;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0398l1;
import com.zfork.multiplatforms.android.bomb.C0408n;
import com.zfork.multiplatforms.android.bomb.C0426q;
import com.zfork.multiplatforms.android.bomb.C0450u0;
import com.zfork.multiplatforms.android.bomb.C0453u3;
import com.zfork.multiplatforms.android.bomb.C0460v4;
import com.zfork.multiplatforms.android.bomb.C5;
import com.zfork.multiplatforms.android.bomb.DialogC0331b0;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.G;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.J2;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.P;
import com.zfork.multiplatforms.android.bomb.P1;
import com.zfork.multiplatforms.android.bomb.P2;
import com.zfork.multiplatforms.android.bomb.Q0;
import com.zfork.multiplatforms.android.bomb.T0;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0454u4;
import com.zfork.multiplatforms.android.bomb.W3;
import com.zfork.multiplatforms.android.bomb.X1;
import com.zfork.multiplatforms.android.bomb.Z;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.t5;
import j$.util.List$EL;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.file.attribute.DosFileAttributeView;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.jar.Attributes;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: com.android.apksig.util.ۣ۟ۡۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0031 {

    /* JADX INFO: renamed from: ۣ۟۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f135 = true;

    /* JADX INFO: renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static List m2971(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).getWarnings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static View m2972(Object obj) {
        if (C0071.m6069() > 0) {
            return ((I1) obj).getSettingLayout();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static File[] m2973(Object obj) {
        if (C0032.m3184() < 0) {
            return o5.i((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۦۥ, reason: not valid java name and contains not printable characters */
    public static TextView m2974(Object obj) {
        if (C0036.m3653() < 0) {
            return ((I1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m2975() {
        if (C0032.m3184() < 0) {
            return "OpenSSLEvpCipherAES$AES$CBC$PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static Object m2976(Object obj, Object obj2) {
        if (C0027.m2460() >= 0) {
            return ((LinkedTreeMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m2977(Object obj) {
        if (C0018.m1064() > 0) {
            return ((C0361f2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2978(Object obj) {
        if (C0077.m7272() < 0) {
            return ((J2) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠۠, reason: not valid java name and contains not printable characters */
    public static void m2979(Object obj, Object obj2, Object obj3) {
        if (C0029.m2791() > 0) {
            ((ApkSigningBlockUtils.Result.SignerInfo) obj).addWarning((ApkVerifier.Issue) obj2, (Object[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m2980(Object obj, int i) {
        if (C0077.m7272() <= 0) {
            return ((ApkSigner.Builder) obj).setMinSdkVersion(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static void m2981() {
        if (C0024.m2011() < 0) {
            C0029.m2726();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۦۨ, reason: not valid java name and contains not printable characters */
    public static AlgorithmIdentifier m2982(Object obj) {
        if (C0037.m3837() < 0) {
            return ((SignerInfo) obj).digestAlgorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static N2 m2983() {
        if (C0029.m2791() > 0) {
            return N2.s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static char[] m2984(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((String) obj).toCharArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m2985(Object obj) {
        if (C0032.m3184() < 0) {
            return Color.parseColor((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m2986() {
        if (C0016.m717() < 0) {
            return LocalFileRecord.j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static C0398l1 m2987(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((AbstractC0410n1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static List m2988(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).additionalAttributes;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m2989(Object obj, Object obj2) {
        if (C0024.m2011() < 0) {
            return ((Collection) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m2990() {
        if (C0071.m6069() >= 0) {
            return "AES_128/ECB/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡ۠, reason: not valid java name and contains not printable characters */
    public static void m2991(Object obj, int i) {
        if (C0016.m717() < 0) {
            ((SourceStampVerifier.Result.SignerInfo) obj).setMaxSdkVersion(i);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static Bitmap m2992(Object obj) {
        if (C0065.m4647() > 0) {
            return ((P) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧۥ, reason: not valid java name and contains not printable characters */
    public static String m2993() {
        if (C0072.m6216() > 0) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۦ۠, reason: not valid java name and contains not printable characters */
    public static Context m2994(Object obj) {
        if (C0030.m2940() > 0) {
            return ((Context) obj).getApplicationContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠۠, reason: not valid java name and contains not printable characters */
    public static int m2995(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((U3) obj).q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m2996() {
        if (C0072.m6216() >= 0) {
            return "Alg.Alias.Mac.PBEWITHHMACSHA384";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static int m2997(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((T0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧۦ, reason: not valid java name and contains not printable characters */
    public static void m2998(Object obj) {
        if (C0027.m2460() >= 0) {
            C0075.m6860((DosFileAttributeView) obj, false);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m2999(Object obj, Object obj2) {
        if (C0064.m4578() >= 0) {
            return ((Class) obj).isAssignableFrom((Class) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static KeyConfig m3000(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((SigningCertificateLineage.SignerConfig.Builder) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۢۨ, reason: not valid java name and contains not printable characters */
    public static void m3001(Object obj, Object obj2) {
        if (C0067.m5468() <= 0) {
            ((SimpleDateFormat) obj).applyPattern((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m3002(Object obj, Object obj2) {
        if (C0028.m2593() > 0) {
            ((AutoClickBean) obj).setPlanName((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static P2 m3003(Object obj, Object obj2) {
        if (m3075() > 0) {
            return ((C5) obj).b((E1) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static C0387j2 m3004(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((W3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m3005(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0064.m4578() >= 0) {
            ApkSigningBlockUtils.verifyIntegrity((RunnablesExecutor) obj, (DataSource) obj2, (DataSource) obj3, (ByteBuffer) obj4, (Set) obj5, (ApkSigningBlockUtils.Result) obj6);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m3006() {
        if (C0025.m2132() >= 0) {
            return "Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10045.2.1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static DialogC0331b0 m3007(Object obj) {
        if (C0066.m4827() > 0) {
            return ((Z) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3008(Object obj) {
        if (C0066.m4827() > 0) {
            return AbstractC0446t2.b((String[]) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static C0460v4 m3009(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((ViewOnClickListenerC0454u4) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3010(double d) {
        if (C0029.m2791() > 0) {
            return Double.isInfinite(d);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3011() {
        if (C0016.m717() < 0) {
            return "OpenSSLEvpCipherAES$AES_256$CBC$PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۥ, reason: not valid java name and contains not printable characters */
    public static KeyConfig m3012(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((M4) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static t5 m3013(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((AbstractC0384j) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3014(Object obj, Object obj2) {
        if (C0018.m1064() >= 0) {
            return ((String) obj).matches((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤۦۥ, reason: not valid java name and contains not printable characters */
    public static X509Certificate m3015(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((ApkVerifier.Result.V1SchemeSignerInfo) obj).getCertificate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۣ, reason: not valid java name and contains not printable characters */
    public static int m3016(Object obj) {
        if (C0016.m717() <= 0) {
            return ((Q0) obj).c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥ۟, reason: not valid java name and contains not printable characters */
    public static File m3017(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((ApkSigner.Builder) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧ۟, reason: not valid java name and contains not printable characters */
    public static int m3018(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((Rect) obj).width();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static ScriptActionBean m3019(Object obj) {
        if (C0025.m2132() > 0) {
            return ((X1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۨ, reason: not valid java name and contains not printable characters */
    public static String m3020(Object obj) {
        if (C0016.m717() < 0) {
            return System.getenv((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m3021(String str) {
        String strM2993 = m2993();
        String strM29932 = m2993();
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
        for (int iM73802 = 0; iM73802 < bArrM7297.length; iM73802 = C0078.m7380(m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟۟, reason: not valid java name and contains not printable characters */
    public static void m3022(Object obj, boolean z) {
        if (C0066.m4827() > 0) {
            ((JsonReader) obj).setLenient(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m3023(Object obj, Object obj2, boolean z) {
        if (C0064.m4578() > 0) {
            return ((Excluder) obj).excludeClass((Class) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m3024(Object obj) {
        if (C0073.m6356() < 0) {
            return ((TreeSet) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۧ, reason: not valid java name and contains not printable characters */
    public static int m3025(Object obj) {
        if (C0017.m846() > 0) {
            return ((AbstractC0384j) obj).m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦۥ, reason: not valid java name and contains not printable characters */
    public static void m3026(Object obj) {
        if (C0034.m3450() >= 0) {
            ((a) obj).d();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3027(Object obj, Object obj2, int i, int i2) {
        if (C0027.m2460() >= 0) {
            return o5.r((String) obj, (byte[]) obj2, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦۦ۟, reason: not valid java name and contains not printable characters */
    public static DataSource m3028(Object obj) {
        if (C0070.m5903() > 0) {
            return ((V3SchemeSigner) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m3029(Object obj, Object obj2, Object obj3) {
        if (C0075.m6893() >= 0) {
            return ((ApkVerifier) obj).l((DataSource) obj2, (ApkUtils.ZipSections) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m3030(Object obj, Object obj2) {
        if (C0019.m1311() == 0) {
            return ((ManifestParser.Section) obj).getAttributeValue((Attributes.Name) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۠, reason: not valid java name and contains not printable characters */
    public static void m3031(Object obj) {
        if (C0039.m4109() >= 0) {
            ((C0348d3) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۡ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3032(Object obj) {
        if (m3075() > 0) {
            return ((ByteBuffer) obj).asReadOnlyBuffer();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۥ۟, reason: not valid java name and contains not printable characters */
    public static TypeToken m3033(Object obj) {
        if (C0032.m3184() <= 0) {
            return TypeToken.get((Type) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۡ, reason: not valid java name and contains not printable characters */
    public static String m3034(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((URL) obj).toExternalForm();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static JsonToken m3035() {
        if (C0028.m2593() > 0) {
            return JsonToken.BOOLEAN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۤۧ, reason: not valid java name and contains not printable characters */
    public static Uri m3036(Object obj, Object obj2) {
        if (C0038.m4010() >= 0) {
            return DocumentsContract.buildDocumentUriUsingTree((Uri) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3037(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((ApkSigner.Builder) obj).n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m3038(Object obj, Object obj2) {
        if (C0035.m3569() < 0) {
            return TreeTypeAdapter.newFactoryWithMatchRawType((TypeToken) obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static void m3039(Object obj, Object obj2) {
        if (C0032.m3184() < 0) {
            ((A5) obj).h((HashMap) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۡۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m3040(Object obj) {
        if (m3075() >= 0) {
            return ((V4Signature.SigningInfo) obj).publicKey;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۤ, reason: not valid java name and contains not printable characters */
    public static int m3041(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((C0426q) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟۟۟, reason: not valid java name and contains not printable characters */
    public static KeyStore m3042(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((O2) obj).G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m3043(Object obj, boolean z) {
        if (C0019.m1311() == 0) {
            ((P1) obj).setFocus(z);
        }
    }

    /* JADX INFO: renamed from: ۠۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static GradientDrawable.Orientation m3044() {
        if (C0017.m846() > 0) {
            return GradientDrawable.Orientation.TOP_BOTTOM;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static int[] m3045() {
        if (C0074.m6454() < 0) {
            return AbstractC0354e2.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m3046(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((C0350d5) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static String m3048() {
        if (C0074.m6454() <= 0) {
            return "ChaCha20/Poly1305/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m3049(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((C0453u3) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۡۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3050(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((SourceStampVerifier.Result.SignerInfo) obj).containsErrors();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡۥۢ, reason: not valid java name and contains not printable characters */
    public static Map m3051(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((V2SourceStampSigner.Builder) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۦۣ, reason: not valid java name and contains not printable characters */
    public static N2 m3052() {
        if (C0074.m6454() < 0) {
            return N2.h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢ, reason: not valid java name and contains not printable characters */
    public static ListAdapter m3053(Object obj) {
        if (C0071.m6069() > 0) {
            return ((ListView) obj).getAdapter();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3054(Object obj) {
        if (C0026.m2298() < 0) {
            return ((ApkSigner) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۢ۠, reason: not valid java name and contains not printable characters */
    public static int m3055() {
        if (C0070.m5903() > 0) {
            return SignatureCreatorAbility.b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۧۢ, reason: not valid java name and contains not printable characters */
    public static int m3056(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((ApkVerifier.Result.V2SchemeSignerInfo) obj).getIndex();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۤۨ, reason: not valid java name and contains not printable characters */
    public static JsonWriter m3057(Object obj, Object obj2) {
        if (C0021.m1598() <= 0) {
            return ((JsonWriter) obj).name((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۨ۠, reason: not valid java name and contains not printable characters */
    public static String m3058() {
        if (C0017.m846() >= 0) {
            return "<filename>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۧۡ, reason: not valid java name and contains not printable characters */
    public static void m3059(Object obj, Object obj2) {
        if (C0074.m6454() <= 0) {
            Streams.write((JsonElement) obj, (JsonWriter) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m3060(Object obj, Object obj2, int i, int i2) {
        if (C0075.m6893() >= 0) {
            return ((Inflater) obj).inflate((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨۧۥ, reason: not valid java name and contains not printable characters */
    public static String m3061() {
        if (C0077.m7272() <= 0) {
            return "Alg.Alias.Signature.2.16.840.1.101.3.4.2.2with1.2.840.10045.2.1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3062(Object obj, Object obj2, int i, int i2) {
        if (C0073.m6356() <= 0) {
            return ((ByteBuffer) obj).put((byte[]) obj2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۡ, reason: not valid java name and contains not printable characters */
    public static C0450u0 m3063(Object obj) {
        if (C0039.m4109() > 0) {
            return ((C0362f3) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۡۦ, reason: not valid java name and contains not printable characters */
    public static Window m3064(Object obj) {
        if (C0073.m6356() < 0) {
            return ((Dialog) obj).getWindow();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۤۨ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3065() {
        if (C0032.m3184() < 0) {
            return ApkVerifier.Issue.V4_SIG_MULTIPLE_SIGNERS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3066(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((J2) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3067(Object obj) {
        if (C0030.m2940() > 0) {
            return ((Inflater) obj).finished();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧۦۢ, reason: not valid java name and contains not printable characters */
    public static void m3068(Object obj, Object obj2) {
        if (C0065.m4647() > 0) {
            ((O2) obj).I((String[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m3069() {
        if (C0075.m6893() > 0) {
            return "SHA1withECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static Collection m3070(Object obj, Object obj2) {
        if (C0025.m2132() > 0) {
            return ((CertificateFactory) obj).generateCertificates((InputStream) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠۟, reason: not valid java name and contains not printable characters */
    public static int m3071(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((InputStream) obj).read();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۦۦ, reason: not valid java name and contains not printable characters */
    public static Set m3072(Object obj) {
        if (C0020.m1385() <= 0) {
            return V1SchemeSigner.getOutputEntryNames((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۦۤ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3073() {
        if (C0017.m846() > 0) {
            return ApkVerifier.Issue.V3_SIG_POR_CERT_MISMATCH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۤۨ, reason: not valid java name and contains not printable characters */
    public static String m3074() {
        if (C0069.m5781() < 0) {
            return "<arg>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static int m3075() {
        return 1751461 ^ C0032.m3236((Object) "ۤ۠ۥ");
    }

    /* JADX INFO: renamed from: ۤۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Certificate[] m3076(Object obj, Object obj2, Object obj3) {
        if (C0066.m4827() > 0) {
            return ((O2) obj).s((Certificate) obj2, (Certificate) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3077(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3078() {
        if (C0024.m2011() <= 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_MALFORMED_ATTRIBUTE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۢۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3079() {
        if (C0063.m4427() >= 0) {
            return ApkVerifier.Issue.V3_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۤۧ, reason: not valid java name and contains not printable characters */
    public static View m3080(Object obj) {
        if (C0032.m3184() < 0) {
            return ((C0361f2) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3081(Object obj) {
        if (C0077.m7272() < 0) {
            return ((V4Signature) obj).version;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨ۟۟, reason: not valid java name and contains not printable characters */
    public static EditText m3082(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((DialogC0385j0) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۥ۟, reason: contains not printable characters */
    public static List m3083(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((ApkVerifier.Result) obj).getWarnings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۥۣ, reason: contains not printable characters */
    public static byte[] m3084(Object obj) {
        if (C0030.m2940() > 0) {
            return ((C0323a) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۦ۟, reason: contains not printable characters */
    public static void m3085(Object obj) {
        if (C0020.m1385() < 0) {
            ZipUtils.updateZipEocdCommentLen((ByteBuffer) obj);
        }
    }

    /* JADX INFO: renamed from: ۥۢۡۤ, reason: contains not printable characters */
    public static ArrayList m3086(Object obj) {
        if (C0063.m4427() > 0) {
            return ((ApkSignerInfo) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡۧ, reason: contains not printable characters */
    public static int m3087(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((InclusiveIntRange) obj).getMax();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥ۠ۥ, reason: contains not printable characters */
    public static byte m3088(byte b, int i) {
        if (C0063.m4427() > 0) {
            return AbstractC0406m3.x(b, i);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۥۦۨۨ, reason: contains not printable characters */
    public static String m3089(int i) {
        if (C0023.m1921() > 0) {
            return K3.b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ۠ۡ, reason: contains not printable characters */
    public static Object m3090(Object obj, Object obj2) {
        if (C0024.m2011() <= 0) {
            return ((Hashtable) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۠ۦ, reason: contains not printable characters */
    public static float m3091(float f, float f2) {
        if (m3075() > 0) {
            return Math.min(f, f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦ۠۠ۥ, reason: contains not printable characters */
    public static boolean m3092(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((Inflater) obj).needsDictionary();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۥۨ, reason: contains not printable characters */
    public static void m3093(Object obj, Object obj2) {
        if (C0033.m3358() < 0) {
            List$EL.sort((List) obj, (Comparator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۨ۠, reason: contains not printable characters */
    public static ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus m3094() {
        if (C0016.m717() <= 0) {
            return ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus.STAMP_NOT_VERIFIED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۤۨ, reason: contains not printable characters */
    public static int m3095(Object obj) {
        if (C0035.m3569() < 0) {
            return ((G) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦ۠ۧ, reason: contains not printable characters */
    public static int m3096(Object obj) {
        if (m3075() >= 0) {
            return ((Rect) obj).bottom;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۧ۟, reason: contains not printable characters */
    public static void m3097(Object obj, boolean z) {
        if (C0026.m2298() < 0) {
            ((WebSettings) obj).setDisplayZoomControls(z);
        }
    }

    /* JADX INFO: renamed from: ۧ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m3098(Object obj) {
        if (C0033.m3358() <= 0) {
            ((L) obj).e();
        }
    }

    /* JADX INFO: renamed from: ۣۧۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3099() {
        if (C0070.m5903() >= 0) {
            return ApkVerifier.Issue.V3_SIG_MULTIPLE_SIGNERS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3100(Object obj) {
        if (C0027.m2460() > 0) {
            return ((V1SchemeSigner.SignerConfig) obj).deterministicDsaSigning;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۤۢ۟, reason: not valid java name and contains not printable characters */
    public static P2 m3101(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((C5) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۤۥ, reason: not valid java name and contains not printable characters */
    public static void m3102(Object obj, long j) {
        if (C0068.m5678() > 0) {
            ((AutoClickPlanBean) obj).setId(j);
        }
    }

    /* JADX INFO: renamed from: ۧۦۤۨ, reason: not valid java name and contains not printable characters */
    public static void m3103(Object obj, Object obj2, boolean z, boolean z2) {
        if (C0035.m3569() <= 0) {
            AbstractC0449u.f((X509Certificate) obj, (String) obj2, z, z2);
        }
    }

    /* JADX INFO: renamed from: ۧۧۥ۟, reason: not valid java name and contains not printable characters */
    public static long m3104(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((C0357e5) obj).h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static int m3105(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((V3SchemeVerifier.Builder) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۠۟, reason: not valid java name and contains not printable characters */
    public static void m3106(Object obj) throws IOException {
        if (C0067.m5468() < 0) {
            ((BufferedReader) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۨ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m3107(int i) {
        if (C0076.m6903() < 0) {
            return K3.e(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡ۟۟, reason: not valid java name and contains not printable characters */
    public static Object m3108(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((C0387j2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۤۨ, reason: not valid java name and contains not printable characters */
    public static int m3109(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((ApkSigner.SignerConfig) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۢۤ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m3110(Object obj, boolean z) {
        if (C0069.m5781() <= 0) {
            return ((ApkSigner.Builder) obj).setAlignFileSize(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥۦ, reason: not valid java name and contains not printable characters */
    public static Date m3111(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((X509Certificate) obj).getNotBefore();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static C0408n m3112() {
        if (C0068.m5678() >= 0) {
            return AbstractC0406m3.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۥۦ, reason: not valid java name and contains not printable characters */
    public static List m3113(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((ApkVerifier.Result.SourceStampInfo) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۠۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3114() {
        if (C0063.m4427() > 0) {
            return ApkVerifier.Issue.V3_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3047(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
