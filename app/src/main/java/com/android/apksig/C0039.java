package com.android.apksig;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.asn1.Asn1Tagging;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerEncoding;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.VerityTreeBuilder;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.EocdRecord;
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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
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
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptJumpBean;
import com.joke.script.bean.ScriptMatchBean;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A4;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0372h;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0441s3;
import com.zfork.multiplatforms.android.bomb.B0;
import com.zfork.multiplatforms.android.bomb.B3;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0330b;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0377h4;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0397l0;
import com.zfork.multiplatforms.android.bomb.C0404m1;
import com.zfork.multiplatforms.android.bomb.C0412n3;
import com.zfork.multiplatforms.android.bomb.C0420p;
import com.zfork.multiplatforms.android.bomb.C0478y4;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.DialogC0331b0;
import com.zfork.multiplatforms.android.bomb.DialogC0419o4;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.H3;
import com.zfork.multiplatforms.android.bomb.InterfaceC0415o0;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.L0;
import com.zfork.multiplatforms.android.bomb.M0;
import com.zfork.multiplatforms.android.bomb.N;
import com.zfork.multiplatforms.android.bomb.N4;
import com.zfork.multiplatforms.android.bomb.O0;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.O4;
import com.zfork.multiplatforms.android.bomb.P;
import com.zfork.multiplatforms.android.bomb.Q0;
import com.zfork.multiplatforms.android.bomb.Q4;
import com.zfork.multiplatforms.android.bomb.R2;
import com.zfork.multiplatforms.android.bomb.RunnableC0360f1;
import com.zfork.multiplatforms.android.bomb.T;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.W;
import com.zfork.multiplatforms.android.bomb.Y0;
import com.zfork.multiplatforms.android.bomb.Z4;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.q5;
import com.zfork.multiplatforms.android.bomb.u5;
import com.zfork.multiplatforms.android.bomb.x5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import org.conscrypt.C0111;
import sun.security.util.DerValue;
import sun.security.x509.X509CertImpl;

/* JADX INFO: renamed from: com.android.apksig.ۨۨۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0039 {

    /* JADX INFO: renamed from: ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean f145;

    /* JADX INFO: renamed from: ۟۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m4056(Object obj) {
        if (C0017.m846() > 0) {
            return ((DefaultApkSignerEngine) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static TextView m4057(Object obj) {
        if (C0033.m3358() < 0) {
            return ((C0478y4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static double m4058(Object obj) {
        return C0077.m7272() < 0 ? ((JsonElement) obj).getAsDouble() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟۠۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static short m4059(Object obj, int i) {
        if (C0030.m2940() >= 0) {
            return ((ByteBuffer) obj).getShort(i);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m4060() {
        if (C0032.m3184() <= 0) {
            return Y0.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static String m4061(int i) {
        if (C0020.m1385() <= 0) {
            return BerEncoding.tagClassToString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static Button m4062(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((C0351e) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۨۥ, reason: not valid java name and contains not printable characters */
    public static void m4063(Object obj, Object obj2) {
        if (C0072.m6216() > 0) {
            Collections.sort((List) obj, (Comparator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m4064(Object obj, Object obj2) {
        if (C0018.m1064() > 0) {
            ((WebView) obj).setWebChromeClient((WebChromeClient) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static ConsumerAbility m4065(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((RunnableC0360f1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟۟, reason: not valid java name and contains not printable characters */
    public static String m4067(Object obj, Object obj2) {
        if (C0038.m4010() >= 0) {
            return ((C0412n3) obj).c((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۦ, reason: not valid java name and contains not printable characters */
    public static ScriptJumpBean m4068(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((ScriptMatchBean) obj).successJump;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static void m4069(Object obj, float f) {
        if (C0065.m4647() >= 0) {
            ((Paint) obj).setStrokeWidth(f);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static Class m4070() {
        if (C0023.m1921() >= 0) {
            return H3.a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static List m4071(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((DefaultApkSignerEngine) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m4072(int i) {
        if (C0032.m3184() < 0) {
            return Character.charCount(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4073() {
        if (C0029.m2791() > 0) {
            return ApkVerifier.Issue.V4_SIG_UNEXPECTED_DIGESTS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static KeyStore.Entry m4074(Object obj, Object obj2, Object obj3) {
        if (C0038.m4010() >= 0) {
            return ((KeyStore) obj).getEntry((String) obj2, (KeyStore.ProtectionParameter) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۦ۟, reason: not valid java name and contains not printable characters */
    public static O4 m4075(Object obj) {
        if (C0029.m2791() > 0) {
            return ((N4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m4076(Object obj, Object obj2, int i, int i2) {
        if (C0027.m2460() > 0) {
            return ((x5) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠۟, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m4077(Object obj, int i) {
        if (C0067.m5468() <= 0) {
            return EocdRecord.createWithPaddedComment((ByteBuffer) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerCapabilities.Builder m4078(Object obj, boolean z) {
        if (C0066.m4827() > 0) {
            return ((SigningCertificateLineage.SignerCapabilities.Builder) obj).setRollback(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus m4079() {
        if (m4109() >= 0) {
            return ApkVerifier.Result.SourceStampInfo.SourceStampVerificationStatus.CERT_DIGEST_MISMATCH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4080(Object obj) {
        if (m4109() > 0) {
            return ((JsonWriter) obj).isLenient();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m4081(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((View) obj).getRootWindowInsets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static int m4082(Object obj) {
        if (C0021.m1598() < 0) {
            return ((C0404m1) obj).a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static byte[] m4083(Object obj) {
        if (C0031.m3075() > 0) {
            return ((ApkSignerEngine.OutputApkSigningBlockRequest2) obj).getApkSigningBlock();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۥۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4084(Object obj) {
        if (C0016.m717() <= 0) {
            return ((W) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static WindowManager.LayoutParams m4085(Object obj) {
        if (C0034.m3450() > 0) {
            return ((T1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static float m4086(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((U3) obj).B;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static String m4087(Object obj) {
        if (C0019.m1311() <= 0) {
            return System.getProperty((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m4088(Object obj, Object obj2) {
        if (C0068.m5678() >= 0) {
            ((A5) obj).g((E1) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static void m4089(Object obj, Object obj2) {
        if (C0072.m6216() >= 0) {
            ((C0479z) obj).d((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m4090() {
        if (C0038.m4010() > 0) {
            return TypeAdapters.BIG_INTEGER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static Q4 m4091(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((C0404m1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static Uri m4092(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0028.m2593() >= 0) {
            return DocumentsContract.createDocument((ContentResolver) obj, (Uri) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m4093(Object obj) {
        if (C0076.m6903() < 0) {
            return ((SourceStampVerifier.Result.SignerInfo) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥ۟, reason: not valid java name and contains not printable characters */
    public static String m4094(long j, Object obj) {
        if (C0111.m13165() <= 0) {
            return K3.m(j, (String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۨۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0415o0 m4095(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((DialogC0421p0) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static C0 m4096(Object obj) {
        if (C0024.m2011() < 0) {
            return ((B0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Dialog m4097(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((C0397l0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۧ, reason: not valid java name and contains not printable characters */
    public static String[] m4098(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((B3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠۟, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4099() {
        if (C0071.m6069() >= 0) {
            return ApkVerifier.Issue.V2_SIG_MISSING_APK_SIG_REFERENCED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟۠, reason: not valid java name and contains not printable characters */
    public static String m4100() {
        if (C0111.m13165() <= 0) {
            return "OpenSSLAeadCipherAES$GCM$AES_128";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static Class m4101(Object obj) {
        if (C0067.m5468() < 0) {
            return Class.forName((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static C0387j2 m4102(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((R2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۥۧ, reason: not valid java name and contains not printable characters */
    public static int m4103(Object obj) {
        if (C0078.m7450() > 0) {
            return AbstractC0406m3.o((Context) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m4104(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((T) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۥۥ, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m4105(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((View) obj).getLayoutParams();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۦۤ, reason: not valid java name and contains not printable characters */
    public static int m4106(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((C0330b) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠۟, reason: not valid java name and contains not printable characters */
    public static Asn1Tagging[] m4107() {
        if (C0025.m2132() > 0) {
            return Asn1Tagging.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۢۨ, reason: not valid java name and contains not printable characters */
    public static M0 m4108(Object obj) {
        if (C0028.m2593() > 0) {
            return ((L0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static int m4109() {
        return 1746765 ^ C0032.m3236((Object) "۟ۡۥ");
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m4110(Object obj) {
        if (m4109() > 0) {
            return ((View) obj).getRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4111() {
        if (C0069.m5781() < 0) {
            return "Alias.name.alias";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4112(Object obj) {
        if (C0068.m5678() > 0) {
            return ((G0) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۠۠, reason: not valid java name and contains not printable characters */
    public static Path m4113(Object obj) {
        if (C0073.m6356() < 0) {
            return AbstractC0372h.h(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۥ, reason: not valid java name and contains not printable characters */
    public static int m4114(Object obj) {
        if (C0078.m7450() > 0) {
            return ((C0) obj).w;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Type m4115(Object obj, Object obj2) {
        if (C0024.m2011() < 0) {
            return C$Gson$Types.getCollectionElementType((Type) obj, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۦ, reason: not valid java name and contains not printable characters */
    public static int m4116(Object obj) {
        if (C0064.m4578() > 0) {
            return Integer.parseInt((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static List m4117(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((ApkSignerInfo) obj).certs;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m4118(Object obj) {
        if (C0028.m2593() > 0) {
            ((VerityTreeBuilder) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۤۢ, reason: not valid java name and contains not printable characters */
    public static int m4119(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((A4) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟۟, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m4120(Object obj, boolean z) {
        if (C0029.m2791() > 0) {
            return ((ApkSigner.Builder) obj).setV4SigningEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۧۦ, reason: not valid java name and contains not printable characters */
    public static long m4121(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((Q0) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static void m4122(Object obj, Object obj2) {
        if (C0073.m6356() <= 0) {
            ((ValueAnimator) obj).addUpdateListener((ValueAnimator.AnimatorUpdateListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۨۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m4123(Object obj) {
        if (C0021.m1598() < 0) {
            return ((DerValue) obj).toByteArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static Drawable m4124(Object obj) {
        if (C0069.m5781() <= 0) {
            return AbstractC0406m3.j((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۦ, reason: not valid java name and contains not printable characters */
    public static String m4125() {
        if (C0029.m2791() >= 0) {
            return "AES_128/GCM/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۥۣ, reason: not valid java name and contains not printable characters */
    public static List m4126(Object obj) {
        if (C0025.m2132() > 0) {
            return ((ApkSigningBlockUtils.Result) obj).getErrors();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static int m4127(byte b) {
        if (C0027.m2460() > 0) {
            return BerEncoding.getTagNumber(b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static DataSource m4128(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((V3SchemeSigner.Builder) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ImageView m4129(Object obj) {
        if (C0111.m13165() < 0) {
            return ((DialogC0419o4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static DataSource m4130(Object obj) {
        if (C0021.m1598() < 0) {
            return ((V3SchemeSigner) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4131(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((C0350d5) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m4132(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (m4109() >= 0) {
            ((TextView) obj).setCompoundDrawablesWithIntrinsicBounds((Drawable) obj2, (Drawable) obj3, (Drawable) obj4, (Drawable) obj5);
        }
    }

    /* JADX INFO: renamed from: ۡۤۨۨ, reason: not valid java name and contains not printable characters */
    public static String m4133(Object obj, long j) {
        if (C0078.m7450() > 0) {
            return C0361f2.b((C0361f2) obj, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m4134(Object obj, Object obj2, int i, int i2) {
        if (C0075.m6893() >= 0) {
            return ((C0357e5) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static void m4135(Object obj, Object obj2, boolean z) {
        if (C0077.m7272() <= 0) {
            ((C0) obj).o((Context) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static TypeToken m4136(Object obj) {
        if (C0076.m6903() <= 0) {
            return TypeToken.getArray((Type) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4137(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((ApkVerifier.Result) obj).r;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۢۥ, reason: not valid java name and contains not printable characters */
    public static String m4138() {
        if (m4109() >= 0) {
            return "Certificate.owner.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static ImageView m4139(Object obj, Object obj2, Object obj3) {
        if (C0025.m2132() > 0) {
            return ((K0) obj).b((Context) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static void m4140(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0070.m5903() >= 0) {
            ((Gson) obj).toJson(obj2, (Type) obj3, (JsonWriter) obj4);
        }
    }

    /* JADX INFO: renamed from: ۢۥۤ۠, reason: not valid java name and contains not printable characters */
    public static char m4141(Object obj) {
        if (C0020.m1385() < 0) {
            return ((JsonElement) obj).getAsCharacter();
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۢۦۡۨ, reason: not valid java name and contains not printable characters */
    public static int m4142(int i, Object obj) {
        if (C0031.m3075() > 0) {
            return o5.d(i, (Context) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۤۥ, reason: not valid java name and contains not printable characters */
    public static void m4143(Object obj, int i, int i2) {
        if (C0076.m6903() <= 0) {
            ZipUtils.setUnsignedInt16((ByteBuffer) obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۧۡ, reason: not valid java name and contains not printable characters */
    public static RunnablesExecutor m4144(Object obj) {
        if (C0076.m6903() < 0) {
            return ((DefaultApkSignerEngine) obj).G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۨۨ, reason: not valid java name and contains not printable characters */
    public static String m4145() {
        if (C0073.m6356() < 0) {
            return "OpenSSLCipherChaCha20";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m4146() {
        if (C0037.m3837() < 0) {
            return "No.entries.from.identity.database.added";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m4147(Object obj, Object obj2) throws InvalidKeyException {
        if (C0019.m1311() == 0) {
            ((Signature) obj).initSign((PrivateKey) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۦ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4148() {
        if (C0017.m846() >= 0) {
            return ApkVerifier.Issue.JAR_SIG_NO_SIGNERS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۥ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.Builder m4149(Object obj, boolean z) {
        if (C0017.m846() > 0) {
            return ((DefaultApkSignerEngine.Builder) obj).setOtherSignersSignaturesPreserved(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۦۧ, reason: not valid java name and contains not printable characters */
    public static String m4150(String str) {
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

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static void m4151(Object obj) {
        if (C0037.m3837() <= 0) {
            ((C0357e5) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۣۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m4152(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((ApkVerifier.Result.SourceStampInfo) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۦۨ, reason: not valid java name and contains not printable characters */
    public static void m4153(Object obj, boolean z) {
        if (C0077.m7272() < 0) {
            ((View) obj).setVerticalScrollBarEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Iterator m4154(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((ArrayList) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4155(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((C0361f2) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4156(Object obj) {
        if (C0075.m6893() > 0) {
            return ((L0) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m4157(Object obj) {
        if (C0020.m1385() < 0) {
            ((O0) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۤ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m4158(Object obj) {
        if (C0023.m1921() > 0) {
            return ((File) obj).getAbsolutePath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static Point m4159(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((P) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۥۡ, reason: not valid java name and contains not printable characters */
    public static AndroidBinXmlParser.StringPool m4160(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((AndroidBinXmlParser) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۤ, reason: not valid java name and contains not printable characters */
    public static int m4161(Object obj) {
        if (C0025.m2132() > 0) {
            return ((DisplayMetrics) obj).widthPixels;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m4162(Object obj, boolean z) {
        if (C0024.m2011() < 0) {
            return ((ApkSigner.Builder) obj).setV4ErrorReportingEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4163(Object obj) {
        if (C0026.m2298() < 0) {
            return ((O2) obj).N;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۦ۠۟, reason: not valid java name and contains not printable characters */
    public static TextView m4164(Object obj) {
        if (C0070.m5903() > 0) {
            return ((N) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۧۢ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.Builder m4165(Object obj, boolean z) {
        if (C0035.m3569() < 0) {
            return ((DefaultApkSignerEngine.Builder) obj).setV1SigningEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static ApkVerifier.Issue m4166() {
        if (C0021.m1598() <= 0) {
            return ApkVerifier.Issue.V31_BLOCK_FOUND_WITHOUT_V3_BLOCK;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣ۠, reason: contains not printable characters */
    public static E5 m4167(Object obj, Object obj2, Object obj3) {
        if (C0017.m846() > 0) {
            return ((C0420p) obj).c((Q4) obj2, (q5) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۦ, reason: contains not printable characters */
    public static String m4168(Object obj) {
        if (C0066.m4827() > 0) {
            return ((Boolean) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۢ, reason: contains not printable characters */
    public static Object m4169(Object obj) {
        if (C0078.m7450() > 0) {
            return ((Pair) obj).first;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣۧ, reason: contains not printable characters */
    public static V3SchemeSigner m4170(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((V3SchemeSigner.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۟ۥ, reason: contains not printable characters */
    public static void m4171(Object obj) {
        if (C0075.m6893() > 0) {
            ((AbstractC0441s3) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۦۧۡ۠, reason: contains not printable characters */
    public static Object[] m4172(Object obj, Object obj2) {
        if (C0031.m3075() > 0) {
            return ((ArrayList) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m4173(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((X509CertImpl) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static Pattern m4174(Object obj) {
        if (C0017.m846() > 0) {
            return Pattern.compile((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۨ, reason: not valid java name and contains not printable characters */
    public static ImageView m4175(Object obj) {
        if (C0024.m2011() < 0) {
            return ((C4) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۨ۠, reason: not valid java name and contains not printable characters */
    public static Uri m4176(Object obj) {
        if (C0038.m4010() > 0) {
            return ((ClipData.Item) obj).getUri();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۡ, reason: not valid java name and contains not printable characters */
    public static DialogC0331b0 m4177(Object obj) {
        if (C0017.m846() >= 0) {
            return ((C0377h4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static String m4178() {
        if (C0032.m3184() <= 0) {
            return "OpenSSLSignature$SHA256ECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int[] m4179() {
        if (C0033.m3358() <= 0) {
            return u5.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m4180(Object obj, Object obj2) {
        if (C0065.m4647() >= 0) {
            return ((ResourceBundle) obj).getObject((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨۢ, reason: not valid java name and contains not printable characters */
    public static void m4181(Object obj) {
        if (C0069.m5781() < 0) {
            C0074.m6483((SeekBar) obj, 1000);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static List m4182(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).getErrors();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m4183(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((C0) obj).A;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۡۤ, reason: not valid java name and contains not printable characters */
    public static Map m4184(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((ApkSigningBlockUtils.SigningSchemeBlockAndDigests) obj).digestInfo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۦۥ, reason: not valid java name and contains not printable characters */
    public static BigInteger m4185(Object obj, Object obj2) {
        if (C0074.m6454() <= 0) {
            return ((BigInteger) obj).add((BigInteger) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۢ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m4186(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((Z4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۧۤ, reason: not valid java name and contains not printable characters */
    public static void m4187(Object obj, Object obj2) {
        if (C0029.m2791() >= 0) {
            ((View) obj).setBackground((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥ۠۟, reason: not valid java name and contains not printable characters */
    public static String m4066(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
