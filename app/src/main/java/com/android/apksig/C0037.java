package com.android.apksig;

import android.app.Application;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.BaseBundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.V2SourceStampSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4SchemeSigner;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1Field;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.asn1.ber.BerDataValueReader;
import com.android.apksig.internal.asn1.ber.ByteBufferBerDataValueReader;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.oid.OidConstants;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesProvider;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipSections;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickContentBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptMatchBean;
import com.joke.script.bean.ScriptTouchBean;
import com.joke.speedfloatingball.bean.BaseEntity;
import com.zfork.entry.C0075;
import com.zfork.entry.MetaSelectAppAbility;
import com.zfork.entry.SignatureCreatorAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A0;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0344d;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0358f;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0362f3;
import com.zfork.multiplatforms.android.bomb.C0381i2;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0394k3;
import com.zfork.multiplatforms.android.bomb.C0408n;
import com.zfork.multiplatforms.android.bomb.C0443t;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0453u3;
import com.zfork.multiplatforms.android.bomb.C0474y0;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.F4;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.H4;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N0;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.S;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.U1;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.V;
import com.zfork.multiplatforms.android.bomb.V1;
import com.zfork.multiplatforms.android.bomb.V4;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0480z0;
import com.zfork.multiplatforms.android.bomb.ViewOnTouchListenerC0481z1;
import com.zfork.multiplatforms.android.bomb.W3;
import com.zfork.multiplatforms.android.bomb.X;
import com.zfork.multiplatforms.android.bomb.X0;
import com.zfork.multiplatforms.android.bomb.Z0;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.y5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.attribute.PosixFilePermission;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.conscrypt.C0111;
import sun.security.x509.GeneralName;
import sun.security.x509.GeneralNames;

/* JADX INFO: renamed from: com.android.apksig.ۣ۟ۤ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0037 {

    /* JADX INFO: renamed from: ۣۡۥۣ, reason: not valid java name and contains not printable characters */
    public static int f143 = -21;

    /* JADX INFO: renamed from: ۟۟۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m3774(Object obj) {
        if (C0066.m4827() > 0) {
            return ((C0394k3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static long m3775(Object obj) {
        if (C0074.m6454() < 0) {
            return ((C0453u3) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m3776(Object obj) {
        if (C0033.m3358() < 0) {
            return ((AutoClickPointerBean) obj).getDelayStart();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static String m3777() {
        if (C0070.m5903() > 0) {
            return "Passwords.must.differ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static List m3778(Object obj) {
        if (C0038.m4010() > 0) {
            return ((ApkSignerInfo) obj).certificateLineage;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠۟, reason: not valid java name and contains not printable characters */
    public static void m3779(Object obj, Object obj2) {
        if (C0026.m2298() < 0) {
            ((MessageDigest) obj).update((ByteBuffer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static float m3780(Object obj, Object obj2, float f) {
        if (C0027.m2460() > 0) {
            return ((SharedPreferences) obj).getFloat((String) obj2, f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static Object m3781(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((Pair) obj).getSecond();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡۡ, reason: not valid java name and contains not printable characters */
    public static C0358f m3782(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((MetaSelectAppAbility) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static Looper m3783() {
        if (C0024.m2011() < 0) {
            return Looper.getMainLooper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3784(Object obj) {
        if (C0024.m2011() < 0) {
            return ((AtomicIntegerArray) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m3785(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((Canvas) obj).save();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m3786(Object obj, Object obj2, int i) {
        if (m3837() <= 0) {
            return ApkUtils.a((ByteBuffer) obj, (String) obj2, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3787(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((A5) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static int m3788(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((AutoClickContentBean) obj).getScreenPixelHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۤ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m3789(Object obj) {
        if (C0076.m6903() < 0) {
            return ((O2) obj).U;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3790(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((ApkSigner) obj).n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static Annotation m3791(Object obj, Object obj2) {
        if (C0028.m2593() > 0) {
            return ((Field) obj).getAnnotation((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static void m3792(Object obj, Object obj2, Object obj3) {
        if (C0029.m2791() > 0) {
            ((ViewManager) obj).updateViewLayout((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟۠, reason: not valid java name and contains not printable characters */
    public static Writer m3793(Object obj, char c) {
        if (C0038.m4010() > 0) {
            return ((Writer) obj).append(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static Enumeration m3794(Object obj) {
        if (C0020.m1385() < 0) {
            return ((Vector) obj).elements();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۢ, reason: not valid java name and contains not printable characters */
    public static String m3795(Object obj) {
        if (C0070.m5903() > 0) {
            return ((DialogC0385j0) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m3796(Object obj, Object obj2, Object obj3) {
        if (C0027.m2460() >= 0) {
            return ((BaseBundle) obj).getString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢ۠, reason: not valid java name and contains not printable characters */
    public static String[] m3797() {
        if (C0072.m6216() >= 0) {
            return O2.Z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢۦ, reason: not valid java name and contains not printable characters */
    public static int m3798(Object obj) {
        if (C0017.m846() > 0) {
            return ((L) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢۧ, reason: not valid java name and contains not printable characters */
    public static void m3799(Object obj, boolean z) {
        if (C0038.m4010() >= 0) {
            ((C0408n) obj).e(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static int m3800(Object obj) {
        if (C0026.m2298() < 0) {
            return ((LocalFileRecord) obj).getExtraFieldStartOffsetInsideRecord();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥۥ, reason: not valid java name and contains not printable characters */
    public static void m3801(Object obj, int i) {
        if (C0028.m2593() >= 0) {
            ((ProgressBar) obj).setMax(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۦ۠, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m3802(Object obj) {
        if (C0019.m1311() == 0) {
            return ((ApkSigner) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۡ, reason: not valid java name and contains not printable characters */
    public static FrameLayout m3803(Object obj) {
        if (C0024.m2011() < 0) {
            return ((C0) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۧۥ, reason: not valid java name and contains not printable characters */
    public static void m3804(Object obj, int i) {
        if (C0071.m6069() > 0) {
            ((SeekBar) obj).setMaxHeight(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۦ, reason: not valid java name and contains not printable characters */
    public static void m3805(Object obj, long j, Object obj2) {
        if (C0033.m3358() < 0) {
            ((C0361f2) obj).l(j, (List) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۧ۠, reason: not valid java name and contains not printable characters */
    public static String m3806() {
        if (C0071.m6069() > 0) {
            return "PrivateKeyEntry, ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۢۦ, reason: not valid java name and contains not printable characters */
    public static long m3807(Object obj) {
        if (C0020.m1385() < 0) {
            return ((AutoClickPointerBean) obj).getId();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠۠, reason: not valid java name and contains not printable characters */
    public static TextView m3808(Object obj) {
        if (C0071.m6069() > 0) {
            return ((U1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡۦ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3809() {
        if (C0068.m5678() >= 0) {
            return ApkVerifier.Issue.JAR_SIG_DUPLICATE_MANIFEST_SECTION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦۦ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerCapabilities.Builder m3810(Object obj, boolean z) {
        if (C0025.m2132() > 0) {
            return ((SigningCertificateLineage.SignerCapabilities.Builder) obj).setAuth(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m3811(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((HashMap) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static D5 m3812(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((E5) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3813(Object obj) {
        if (C0032.m3184() < 0) {
            return ((V2SourceStampSigner) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3814(Object obj, Object obj2) {
        if (C0077.m7272() < 0) {
            return ((Collection) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m3815(String str) {
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
        while (length > 0) {
            bArrM7297[-1] = (byte) (bArrM7297[-1] ^ C0077.m7212(strM29932, (-1) % iM7380));
        }
        for (int iM73802 = 0; iM73802 < bArrM7297.length; iM73802 = C0078.m7380(C0031.m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3816(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((ApkSigner) obj).q;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Application m3817() {
        if (C0020.m1385() < 0) {
            return o5.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m3818(Object obj) {
        if (C0071.m6069() >= 0) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m3819(Object obj, Object obj2) {
        if (C0029.m2791() > 0) {
            return ((HashSet) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۦ۠, reason: not valid java name and contains not printable characters */
    public static V4 m3820(Object obj) {
        if (C0028.m2593() > 0) {
            return ((V) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static void m3821(Object obj, Object obj2) throws ProtocolException {
        if (C0033.m3358() < 0) {
            ((HttpURLConnection) obj).setRequestMethod((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3822(Object obj) {
        if (C0027.m2460() > 0) {
            return ((V3SchemeVerifier) obj).j;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤۡۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m3823(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo.ContentDigest) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3824(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((N0) obj).a();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۢ, reason: not valid java name and contains not printable characters */
    public static String m3825(Object obj) {
        if (C0017.m846() > 0) {
            return ((O2) obj).s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۨۢ, reason: not valid java name and contains not printable characters */
    public static void m3826(Object obj, Object obj2, Object obj3) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        if (C0065.m4647() > 0) {
            ((KeyStore) obj).store((OutputStream) obj2, (char[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m3827(Object obj) {
        if (C0027.m2460() > 0) {
            return ((C0474y0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡۧ, reason: not valid java name and contains not printable characters */
    public static PosixFilePermission m3828() {
        if (C0070.m5903() > 0) {
            return PosixFilePermission.OWNER_EXECUTE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦۣ, reason: not valid java name and contains not printable characters */
    public static Path m3830(Object obj) {
        if (C0111.m13165() < 0) {
            return ((U3) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧ۟, reason: not valid java name and contains not printable characters */
    public static int m3831(Object obj) {
        if (C0016.m717() <= 0) {
            return ((Rect) obj).left;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۤ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3832(Object obj) {
        if (C0072.m6216() > 0) {
            return ((ByteBufferBerDataValueReader) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus m3833(Object obj) {
        if (C0033.m3358() < 0) {
            return ((ApkVerifier.Result.SourceStampInfo) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۧۧ, reason: not valid java name and contains not printable characters */
    public static String m3834(Object obj) {
        if (C0027.m2460() > 0) {
            return ((LocalFileRecord) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۨ, reason: not valid java name and contains not printable characters */
    public static void m3835(Object obj, int i) throws IOException {
        if (C0070.m5903() > 0) {
            ((Writer) obj).write(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۢ, reason: not valid java name and contains not printable characters */
    public static void m3836(Object obj) {
        if (m3837() < 0) {
            ((DialogInterface) obj).dismiss();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۢۦ, reason: not valid java name and contains not printable characters */
    public static int m3837() {
        return (-1752691) ^ C0032.m3236((Object) "ۥۥۦ");
    }

    /* JADX INFO: renamed from: ۟ۧۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String[] m3838() {
        if (C0026.m2298() < 0) {
            return V1SchemeVerifier.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m3839(Object obj) {
        if (C0073.m6356() <= 0) {
            return T2.e((ArrayList) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static C0 m3840(Object obj) {
        if (C0034.m3450() > 0) {
            return ((A0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static V4 m3841(Object obj) {
        if (C0075.m6893() > 0) {
            return ((X) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۨ, reason: not valid java name and contains not printable characters */
    public static SignatureCreatorAbility m3842(Object obj) {
        if (C0074.m6454() < 0) {
            return ((F4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۢ۟, reason: not valid java name and contains not printable characters */
    public static String m3843() {
        if (C0024.m2011() < 0) {
            return "OpenSSLEvpCipherAES$AES_128$ECB$NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨۡ, reason: not valid java name and contains not printable characters */
    public static Object m3844(Object obj) {
        if (C0019.m1311() == 0) {
            return ((BaseEntity) obj).getContent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m3845(Object obj, long j) {
        if (C0016.m717() < 0) {
            ZipUtils.putUnsignedInt32((ByteBuffer) obj, j);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static D5 m3846(Object obj) {
        if (C0067.m5468() < 0) {
            return ((W3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m3847(Object obj) {
        if (C0064.m4578() >= 0) {
            return V4SchemeSigner.e((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static GeneralNames m3848(Object obj, Object obj2) {
        if (C0032.m3184() <= 0) {
            return ((GeneralNames) obj).add((GeneralName) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static void m3849(Object obj, Object obj2, Object obj3) {
        if (C0076.m6903() <= 0) {
            ((ViewGroup) obj).updateViewLayout((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static void m3850(Object obj, int i, Object obj2) {
        if (C0063.m4427() > 0) {
            ((ApkSignerInfo) obj).addWarning(i, (Object[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m3851(Object obj) {
        if (C0111.m13165() <= 0) {
            ((View) obj).invalidate();
        }
    }

    /* JADX INFO: renamed from: ۠ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static C0344d m3852(Object obj) {
        if (C0029.m2791() > 0) {
            return ((H4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m3853(Object obj, int i) {
        if (C0027.m2460() >= 0) {
            ((ViewGroup.MarginLayoutParams) obj).setMarginStart(i);
        }
    }

    /* JADX INFO: renamed from: ۡۡۦۧ, reason: not valid java name and contains not printable characters */
    public static int m3854(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((S) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۢۥ, reason: not valid java name and contains not printable characters */
    public static int m3855(Object obj) {
        if (C0020.m1385() < 0) {
            return ((ViewOnClickListenerC0480z0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۤ۠, reason: not valid java name and contains not printable characters */
    public static String m3856() {
        if (C0019.m1311() >= 0) {
            return "They.don.t.match.Try.again";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m3857(Object obj) {
        if (C0038.m4010() > 0) {
            return ((Asn1Field) obj).tagNumber();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۥۢ, reason: not valid java name and contains not printable characters */
    public static void m3858(Object obj, Object obj2, int i, int i2) {
        if (C0017.m846() >= 0) {
            ((y5) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۡۤۦۡ, reason: not valid java name and contains not printable characters */
    public static DataSink m3859(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((ApkSignerEngine.InspectJarEntryRequest) obj).getDataSink();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۦ۠, reason: not valid java name and contains not printable characters */
    public static void m3860(Object obj, int i) {
        if (C0065.m4647() > 0) {
            ((ImageView) obj).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۣۡۧ۟, reason: not valid java name and contains not printable characters */
    public static WindowManager m3861(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((ViewOnTouchListenerC0481z1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m3862(Object obj, boolean z) {
        if (C0075.m6893() >= 0) {
            C0.a((C0) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static ImageView m3863(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((C0381i2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.Result m3864(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        if (m3837() <= 0) {
            return ApkVerifier.g((DataSource) obj, (ApkUtils.ZipSections) obj2, (HashSet) obj3, (Map) obj4, (HashMap) obj5, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m3865(Object obj) {
        if (C0025.m2132() > 0) {
            return ((M4) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۦ۠, reason: not valid java name and contains not printable characters */
    public static List m3866() {
        if (m3837() <= 0) {
            return Collections.emptyList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static void m3867(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0025.m2132() > 0) {
            ((V3SchemeVerifier) obj).a((ByteBuffer) obj2, (CertificateFactory) obj3, (ApkSigningBlockUtils.Result.SignerInfo) obj4);
        }
    }

    /* JADX INFO: renamed from: ۣۢۧۡ, reason: not valid java name and contains not printable characters */
    public static ImageView m3868(Object obj) {
        if (C0017.m846() > 0) {
            return ((C0361f2) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static MatchType m3869(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((ScriptMatchBean) obj).failType;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۡۥ, reason: not valid java name and contains not printable characters */
    public static int m3870(Object obj, int i) {
        if (C0036.m3653() < 0) {
            return ((AndroidBinXmlParser) obj).getAttributeIntValue(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨۢۥ, reason: not valid java name and contains not printable characters */
    public static long m3871(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((ZipSections) obj).getZipCentralDirectorySizeBytes();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m3872(Object obj) {
        if (C0068.m5678() >= 0) {
            return DefaultApkSignerEngine.j((ArrayList) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m3873(Object obj) {
        if (C0021.m1598() < 0) {
            return ((ApkVerificationIssue) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟۠, reason: not valid java name and contains not printable characters */
    public static void m3874(Object obj, Object obj2, int i, int i2) {
        if (C0071.m6069() >= 0) {
            ((DataSink) obj).consume((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۡۡ, reason: not valid java name and contains not printable characters */
    public static InetAddress m3875(Object obj) {
        if (C0063.m4427() > 0) {
            return InetAddress.getByName((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3876(Object obj, Object obj2) {
        if (C0065.m4647() >= 0) {
            return ((Boolean) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m3877(Object obj) {
        if (C0023.m1921() > 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).maxSdkVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3878(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((PopupWindow) obj).isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۨۥ, reason: not valid java name and contains not printable characters */
    public static String m3879() {
        if (C0039.m4109() >= 0) {
            return "AES/ECB/PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m3880(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0020.m1385() <= 0) {
            return ((Resources) obj).getIdentifier((String) obj2, (String) obj3, (String) obj4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m3881(Object obj) {
        if (C0028.m2593() > 0) {
            return ((Z0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m3882(Object obj) {
        if (C0073.m6356() < 0) {
            return Asn1BerParser.access$200((ByteBuffer) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۟۟, reason: not valid java name and contains not printable characters */
    public static long m3883(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((LocalFileRecord) obj).getSize();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Object m3884(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((V1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۦ, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m3885(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((C0) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Buffer m3886(Object obj, int i) {
        if (C0038.m4010() > 0) {
            return ((ByteBuffer) obj).position(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۧۦ, reason: not valid java name and contains not printable characters */
    public static String m3887(Object obj, Object obj2) {
        if (C0026.m2298() < 0) {
            return ((ResourceBundle) obj).getString((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3888(Object obj) {
        if (m3837() <= 0) {
            return ((ApkVerifier.Result.SourceStampInfo) obj).containsErrors();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۥ۠, reason: not valid java name and contains not printable characters */
    public static TextView m3889(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((C4) obj).z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡ, reason: contains not printable characters */
    public static Locale m3890() {
        if (C0032.m3184() <= 0) {
            return Locale.getDefault();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۨ, reason: contains not printable characters */
    public static BerDataValue m3891(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((BerDataValueReader) obj).readDataValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۧ, reason: contains not printable characters */
    public static ByteBuffer m3892(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((ByteBuffer) obj).duplicate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۦۢ, reason: contains not printable characters */
    public static List m3893(Object obj) {
        if (C0073.m6356() < 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۠ۢ, reason: contains not printable characters */
    public static int m3894(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((AutoClickContentBean) obj).getScreenPixelWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣ, reason: contains not printable characters */
    public static byte[] m3895(Object obj) {
        if (C0024.m2011() < 0) {
            return ((X509Certificate) obj).getSigAlgParams();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۧ, reason: contains not printable characters */
    public static int m3896(Object obj) {
        if (C0071.m6069() >= 0) {
            return ApkUtils.getMinSdkVersionForCodename((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۨ۠, reason: contains not printable characters */
    public static byte[] m3897(Object obj) {
        if (C0070.m5903() > 0) {
            return ((C0357e5) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ۟۠, reason: contains not printable characters */
    public static View m3898(Object obj) {
        if (C0072.m6216() > 0) {
            return ((C0444t0) obj).getEmptyViewVisible();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۥۡ, reason: contains not printable characters */
    public static ByteBuffer m3899(Object obj, int i, short s) {
        if (C0074.m6454() < 0) {
            return ((ByteBuffer) obj).putShort(i, s);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۥ۠, reason: contains not printable characters */
    public static int m3900(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((A0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۦ, reason: contains not printable characters */
    public static Object m3901(Object obj, int i) {
        if (C0036.m3653() < 0) {
            return ((List) obj).remove(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m3902(Object obj, Object obj2) {
        if (C0075.m6893() >= 0) {
            return TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۡۨ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.SignerConfig m3903(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((V2SourceStampSigner.Builder) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3904(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((C0350d5) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3905(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((V3SchemeSigner.Builder) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۥۦ, reason: not valid java name and contains not printable characters */
    public static long m3906(Object obj) {
        if (C0030.m2940() > 0) {
            return ((MotionEvent) obj).getEventTime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۦۨ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3907() {
        if (C0111.m13165() <= 0) {
            return ApkVerifier.Issue.V2_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۧۨ, reason: not valid java name and contains not printable characters */
    public static FrameLayout m3908(Object obj) {
        if (C0020.m1385() < 0) {
            return ((G0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m3909(Object obj, int i) {
        if (m3837() < 0) {
            return C0387j2.b((ArrayList) obj, i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m3910(Object obj) {
        if (C0068.m5678() > 0) {
            return ((C0443t) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۥ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m3911(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((I1) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۨ, reason: not valid java name and contains not printable characters */
    public static void m3912(Object obj) {
        if (C0111.m13165() <= 0) {
            ((K0) obj).f();
        }
    }

    /* JADX INFO: renamed from: ۨۢۡۢ, reason: not valid java name and contains not printable characters */
    public static Runnable m3913(Object obj) {
        if (C0016.m717() <= 0) {
            return ((RunnablesProvider) obj).createRunnable();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۡ, reason: not valid java name and contains not printable characters */
    public static int m3914(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((X0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3915(Object obj) {
        if (C0069.m5781() < 0) {
            return ((C0362f3) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3916(Object obj, long j) {
        if (C0070.m5903() >= 0) {
            ((C0357e5) obj).c(j);
        }
    }

    /* JADX INFO: renamed from: ۨۦۦۣ, reason: not valid java name and contains not printable characters */
    public static int m3917(Object obj) {
        if (C0065.m4647() > 0) {
            return ((ScriptTouchBean) obj).metaState;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static Map m3918() {
        if (C0071.m6069() > 0) {
            return OidConstants.OID_TO_JCA_SIGNATURE_ALG;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۥ۟, reason: not valid java name and contains not printable characters */
    public static void m3919(Object obj, int i, int i2, int i3, int i4) {
        if (C0067.m5468() <= 0) {
            ((ViewGroup.MarginLayoutParams) obj).setMargins(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۨۨ۟۠, reason: not valid java name and contains not printable characters */
    public static void m3920(Object obj, Object obj2) {
        if (C0026.m2298() < 0) {
            ((Choreographer) obj).removeFrameCallback((Choreographer.FrameCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۤۦ, reason: not valid java name and contains not printable characters */
    public static String m3829(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
