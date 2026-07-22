package com.android.apksig.internal.util;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.KeyConfig;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureInfo;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.V2SourceStampSigner;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSinks;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipSections;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.GsonBuilder;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.C$Gson$Preconditions;
import com.joke.plugin.gson.internal.JavaVersion;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.script.bean.C0074;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0325a1;
import com.zfork.multiplatforms.android.bomb.AbstractC0335b4;
import com.zfork.multiplatforms.android.bomb.AbstractC0390k;
import com.zfork.multiplatforms.android.bomb.AbstractC0396l;
import com.zfork.multiplatforms.android.bomb.AbstractC0452u2;
import com.zfork.multiplatforms.android.bomb.B;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0340c2;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0428q1;
import com.zfork.multiplatforms.android.bomb.C0450u0;
import com.zfork.multiplatforms.android.bomb.C0453u3;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C0483z3;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.D4;
import com.zfork.multiplatforms.android.bomb.DialogC0331b0;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.DialogC0448t4;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.G5;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.J2;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.L1;
import com.zfork.multiplatforms.android.bomb.M0;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N1;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.N3;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q4;
import com.zfork.multiplatforms.android.bomb.S1;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.V0;
import com.zfork.multiplatforms.android.bomb.V2;
import com.zfork.multiplatforms.android.bomb.i5;
import com.zfork.multiplatforms.android.bomb.k5;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.s5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Currency;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.android.apksig.internal.util.ۣۣ۟۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0027 {

    /* JADX INFO: renamed from: ۟ۥۣۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean f122;

    /* JADX INFO: renamed from: ۟۟ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static String m2388() {
        if (C0030.m2940() >= 0) {
            return "<value>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m2389(Object obj, Object obj2, Object obj3) {
        if (C0034.m3450() >= 0) {
            return Arrays.binarySearch((Object[]) obj, obj2, (Comparator) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2390() {
        if (C0064.m4578() >= 0) {
            return ApkVerifier.Issue.V3_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m2391(Object obj, Object obj2) {
        if (C0071.m6069() >= 0) {
            ((DialogC0331b0) obj).a((Activity) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m2392(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((String) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2393(Object obj) {
        if (C0021.m1598() < 0) {
            return ((DefaultApkSignerEngine) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m2394() {
        if (C0078.m7450() >= 0) {
            return "Alg.Alias.Mac.PBEWITHHMACSHA256";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static View m2395(Object obj) {
        if (C0069.m5781() < 0) {
            return ((Window) obj).getDecorView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.OutputApkSigningBlockRequestImpl m2396(Object obj) {
        if (C0021.m1598() < 0) {
            return ((DefaultApkSignerEngine) obj).F;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static Activity m2397(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((T1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2398() {
        if (m2460() > 0) {
            return JavaVersion.isJava9OrLater();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static int m2399(Object obj, Object obj2) {
        if (C0078.m7450() >= 0) {
            return ((FileChannel) obj).read((ByteBuffer) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static void m2400(Object obj, int i) {
        if (C0024.m2011() <= 0) {
            ((G5) obj).b(i);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static Map m2401(Object obj) {
        if (C0111.m13165() < 0) {
            return ((V2SourceStampSigner) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static void m2402(Object obj) {
        if (C0068.m5678() > 0) {
            ((V0) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m2403(Object obj, Object obj2) {
        if (C0030.m2940() >= 0) {
            ((View) obj).setTag(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۡ, reason: not valid java name and contains not printable characters */
    public static long m2405(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((Calendar) obj).getTimeInMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static TextView m2406(Object obj) {
        if (C0021.m1598() < 0) {
            return ((DialogC0385j0) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static Object m2407(Object obj) {
        if (C0070.m5903() >= 0) {
            return C$Gson$Preconditions.checkNotNull(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢۥ, reason: not valid java name and contains not printable characters */
    public static i5 m2408() {
        if (C0111.m13165() <= 0) {
            return k5.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static Intent m2409(Object obj, Object obj2) {
        if (C0037.m3837() <= 0) {
            return ((Intent) obj).setType((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static TextView m2410(Object obj) {
        if (C0018.m1064() > 0) {
            return ((DialogC0385j0) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int m2411(Object obj, int i) {
        if (C0023.m1921() > 0) {
            return Security.insertProviderAt((Provider) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧۢ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m2412(Object obj) {
        if (C0073.m6356() < 0) {
            return ((BerDataValue) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۢ, reason: not valid java name and contains not printable characters */
    public static String m2413(Object obj) {
        if (C0076.m6903() <= 0) {
            return V1SchemeSigner.getSafeSignerName((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2414(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((DefaultApkSignerEngine.Builder) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static KeyConfig m2415(Object obj) {
        if (m2460() > 0) {
            return ((ApkSigner.SignerConfig.Builder) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static DataSink m2416(Object obj) {
        if (C0070.m5903() > 0) {
            return DataSinks.asDataSink((MessageDigest[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m2417(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0025.m2132() > 0) {
            return K3.q((C0483z3) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static C0479z m2418(Object obj) {
        if (C0071.m6069() > 0) {
            return ((D4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static List m2419(Object obj) {
        if (C0077.m7272() < 0) {
            return ((M4) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥ۟, reason: not valid java name and contains not printable characters */
    public static long m2420(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((Q4) obj).e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦ۟, reason: not valid java name and contains not printable characters */
    public static long m2421(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((ZipSections) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m2422(Object obj, Object obj2) {
        if (C0064.m4578() >= 0) {
            return ((SharedPreferences.Editor) obj).remove((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static Uri m2423() {
        if (C0065.m4647() > 0) {
            return MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۤ, reason: not valid java name and contains not printable characters */
    public static void m2424(Object obj) {
        if (C0024.m2011() <= 0) {
            ((ValueAnimator) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m2425(Object obj) {
        if (C0036.m3653() <= 0) {
            return SigningCertificateLineage.readFromFile((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static View m2426(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((C0) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧۥ, reason: not valid java name and contains not printable characters */
    public static void m2427(Object obj, int i) {
        if (C0024.m2011() <= 0) {
            ((C0453u3) obj).a(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static void m2428(Object obj, Object obj2, Object obj3) {
        if (C0031.m3075() > 0) {
            ((AbstractC0396l) obj).b((AbstractC0396l) obj2, (N3) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2429() {
        if (C0039.m4109() >= 0) {
            return "RSA/ECB/OAEPWithSHA-384AndMGF1Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m2430(Object obj) {
        if (C0019.m1311() == 0) {
            return ((C0) obj).E;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2431(Object obj, Object obj2, Object obj3) {
        if (C0030.m2940() > 0) {
            ((VerityTreeBuilder) obj).a((DataSource) obj2, (ByteBufferSink) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡۥ, reason: not valid java name and contains not printable characters */
    public static int m2432(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((i5) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2433() {
        if (C0030.m2940() > 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_VERIFY_EXCEPTION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2434(Object obj) {
        if (C0021.m1598() < 0) {
            return ((ApkSigner) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m2435(Object obj, boolean z) {
        if (C0068.m5678() >= 0) {
            o5.p((Context) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m2436() {
        if (C0067.m5468() <= 0) {
            return "Certificate.chain.length.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m2437(Object obj, Object obj2) {
        if (C0066.m4827() >= 0) {
            return AbstractC0390k.e((ArrayList) obj, (E1) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡۦ, reason: not valid java name and contains not printable characters */
    public static String m2438(Object obj, Object obj2) {
        if (C0064.m4578() >= 0) {
            return AbstractC0335b4.a((InputStream) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m2439(Object obj) {
        if (C0069.m5781() <= 0) {
            return V3SchemeSigner.generateV3SignerAttribute((SigningCertificateLineage) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۦ۟, reason: not valid java name and contains not printable characters */
    public static void m2440(Object obj, Object obj2) throws SignatureException {
        if (C0072.m6216() >= 0) {
            ((Signature) obj).update((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟۟, reason: not valid java name and contains not printable characters */
    public static void m2441(Object obj, boolean z) {
        if (C0037.m3837() < 0) {
            ((View) obj).setSelected(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m2442(Object obj, int i) {
        if (C0020.m1385() < 0) {
            ((TextView) obj).setTextColor(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m2443() {
        if (C0028.m2593() > 0) {
            return TypeAdapters.STRING_BUFFER_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static GsonBuilder m2444(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((GsonBuilder) obj).serializeNulls();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m2445(Object obj) {
        if (C0063.m4427() > 0) {
            return ((ByteBuffer) obj).array();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۦ, reason: not valid java name and contains not printable characters */
    public static M0 m2446(Object obj) {
        if (C0065.m4647() > 0) {
            return ((C0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m2447(Object obj) {
        if (C0025.m2132() > 0) {
            return ((KeyStore) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨ۠, reason: not valid java name and contains not printable characters */
    public static int m2448(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((G5) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2449() {
        if (C0069.m5781() <= 0) {
            return ApkVerifier.Issue.V4_SIG_NO_CERTIFICATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2450(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((Class) obj).isMemberClass();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۢ, reason: not valid java name and contains not printable characters */
    public static String m2451(String str) {
        String strM2993 = C0031.m2993();
        String strM29932 = C0031.m2993();
        for (int i = 0; i < 15; i++) {
            strM2993 = C0077.m7301(C0030.m2967(C0030.m2967(new StringBuffer(), strM2993), C0021.m1651(i)));
            strM29932 = C0077.m7301(m2461(C0030.m2967(new StringBuffer(), strM29932), ((int) (C0038.m3986() * ((double) 10))) ^ i));
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

    /* JADX INFO: renamed from: ۟ۦۤۥۧ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m2452(Object obj) {
        if (C0071.m6069() > 0) {
            return ((I1) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۧۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2453(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((ApkVerifier.Result) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۨ, reason: not valid java name and contains not printable characters */
    public static Context m2454(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((Dialog) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۦ, reason: not valid java name and contains not printable characters */
    public static void m2455(Object obj) throws InterruptedException {
        if (C0076.m6903() < 0) {
            ((CountDownLatch) obj).await();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۨ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m2456(Object obj, boolean z) {
        if (C0077.m7272() <= 0) {
            return o5.w((InputStream) obj, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m2457(Object obj, Object obj2) {
        if (C0064.m4578() > 0) {
            ((C0450u0) obj).a(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۧۥ, reason: not valid java name and contains not printable characters */
    public static Path m2458(Object obj) {
        if (C0023.m1921() > 0) {
            return C0032.m3153((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨۤ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m2459(Object obj, Object obj2, Object obj3) {
        if (C0065.m4647() >= 0) {
            return TypeAdapters.newFactory((Class) obj, (Class) obj2, (TypeAdapter) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤۤ, reason: not valid java name and contains not printable characters */
    public static int m2460() {
        return 1752462 ^ C0032.m3236((Object) "ۥۡۧ");
    }

    /* JADX INFO: renamed from: ۟ۧۦۤۧ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m2461(Object obj, int i) {
        if (C0068.m5678() > 0) {
            return ((StringBuffer) obj).append(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static Bitmap m2462(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((BitmapDrawable) obj).getBitmap();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static void m2463(Object obj, Object obj2) {
        if (C0023.m1921() > 0) {
            ((DialogC0421p0) obj).c((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2464() {
        if (C0023.m1921() >= 0) {
            return ApkVerifier.Issue.V2_SIG_MALFORMED_SIGNATURE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static void m2465(Object obj, Object obj2, int i, int i2) {
        if (C0071.m6069() >= 0) {
            ((E5) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۠۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m2466(Object obj) {
        if (C0072.m6216() > 0) {
            return Arrays.hashCode((byte[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m2467(Object obj) {
        if (C0020.m1385() <= 0) {
            ((DefaultApkSignerEngine) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۠ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static void m2468(Object obj, Object obj2) {
        if (C0063.m4427() > 0) {
            ((Message) obj).setData((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static PrivateKey m2469(Object obj, Object obj2) {
        if (C0072.m6216() >= 0) {
            return ((KeyFactory) obj).generatePrivate((KeySpec) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2470(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            return ((KeyStore) obj).isKeyEntry((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m2471(Object obj) {
        if (C0066.m4827() >= 0) {
            ((AbstractC0325a1) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۡۢۤۧ, reason: not valid java name and contains not printable characters */
    public static String m2472(Object obj) {
        if (C0016.m717() < 0) {
            return ApkSigningBlockUtils.toHex((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2473() {
        if (C0076.m6903() < 0) {
            return C0.L;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۤۢۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2474(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((B) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m2475() {
        if (C0063.m4427() >= 0) {
            return C0361f2.K;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2476(Object obj) {
        if (C0029.m2791() > 0) {
            ((A5) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m2477(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0073.m6356() <= 0) {
            return ((DialogC0385j0) obj).c((Activity) obj2, (String) obj3, (String) obj4, (EditText) obj5, (String) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ۟, reason: not valid java name and contains not printable characters */
    public static int m2478(Object obj) {
        if (C0073.m6356() <= 0) {
            return V4Signature.readIntLE((InputStream) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static long m2479(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((SignatureInfo) obj).apkSigningBlockOffset;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۦۣۢ, reason: not valid java name and contains not printable characters */
    public static void m2480(Object obj, int i) {
        if (C0068.m5678() >= 0) {
            ((InputStream) obj).mark(i);
        }
    }

    /* JADX INFO: renamed from: ۢۦۤۥ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m2481(Object obj, char c) {
        if (C0065.m4647() > 0) {
            return ((StringBuffer) obj).append(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۧ۟, reason: not valid java name and contains not printable characters */
    public static List m2482(Object obj) {
        if (C0037.m3837() < 0) {
            return ((DefaultApkSignerEngine.Builder) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static TextView m2483(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((D4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨ۟, reason: not valid java name and contains not printable characters */
    public static void m2484(Object obj, Object obj2, Object obj3) {
        if (C0038.m4010() >= 0) {
            C0387j2.y((s5) obj, (ByteArrayOutputStream) obj2, (C0387j2) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m2485() {
        if (C0019.m1311() == 0) {
            return ".Storing.ksfname.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m2486(Object obj, Object obj2, int i, int i2) {
        if (C0033.m3358() < 0) {
            ((C0428q1) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m2487(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((V2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2488(Object obj, Object obj2, Object obj3) {
        if (C0023.m1921() > 0) {
            ApkVerifier.Result.V1SchemeSignerInfo.access$400((ApkVerifier.Result.V1SchemeSignerInfo) obj, (ApkVerifier.Issue) obj2, (Object[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۡۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2489(Object obj) {
        if (C0073.m6356() < 0) {
            return ((T2) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۥۨ, reason: not valid java name and contains not printable characters */
    public static InputStream m2490(Object obj) {
        if (C0034.m3450() > 0) {
            return ((URLConnection) obj).getInputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۧۦ, reason: not valid java name and contains not printable characters */
    public static DataSource m2491(Object obj) {
        if (C0067.m5468() < 0) {
            return ((ApkSigner) obj).z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m2492(Object obj, Object obj2) throws ApkFormatException {
        if (C0037.m3837() < 0) {
            return ApkVerifier.e((DataSource) obj, (ApkUtils.ZipSections) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2493(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((J2) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static void m2494(Object obj, int i) {
        if (C0019.m1311() == 0) {
            ((ByteArrayDataSink) obj).b(i);
        }
    }

    /* JADX INFO: renamed from: ۣۣۤۡ, reason: not valid java name and contains not printable characters */
    public static String m2495(Object obj) {
        if (C0032.m3184() < 0) {
            return ((O2) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۤۦ, reason: not valid java name and contains not printable characters */
    public static String m2496(Object obj) {
        if (m2460() > 0) {
            return ((Currency) obj).getCurrencyCode();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2497(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((C0357e5) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۢ, reason: not valid java name and contains not printable characters */
    public static String m2498(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((JsonReader) obj).locationString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static ThreadPoolExecutor m2499(Object obj) {
        if (C0026.m2298() < 0) {
            return ((VerityTreeBuilder) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۢ, reason: contains not printable characters */
    public static Pair m2500(Object obj) {
        if (C0018.m1064() >= 0) {
            return ZipUtils.findZipEndOfCentralDirectoryRecord((DataSource) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۨۥ, reason: contains not printable characters */
    public static L1 m2501(Object obj) {
        if (C0034.m3450() > 0) {
            return ((N1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۤ, reason: contains not printable characters */
    public static void m2502(Object obj, Object obj2) throws IOException {
        if (C0077.m7272() <= 0) {
            ((ObjectOutputStream) obj).writeObject(obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۠۟ۢ, reason: contains not printable characters */
    public static N2 m2503() {
        if (C0074.m6454() <= 0) {
            return N2.u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۤ۟, reason: contains not printable characters */
    public static String m2504(Object obj, Object obj2) {
        if (m2460() >= 0) {
            return ((Gson) obj).toJson((JsonElement) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۢ, reason: contains not printable characters */
    public static TextView m2505(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((C4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ۠۠, reason: contains not printable characters */
    public static String m2506() {
        if (C0111.m13165() <= 0) {
            return "Existing.entry.alias.alias.exists.overwrite.no.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤ۠, reason: contains not printable characters */
    public static byte[] m2507(Object obj) {
        if (C0066.m4827() > 0) {
            return ((G5) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۡ۠, reason: contains not printable characters */
    public static void m2508(Object obj, Object obj2, int i, int i2) {
        if (C0070.m5903() > 0) {
            ((MessageDigest) obj).update((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۦۥۣ۟, reason: contains not printable characters */
    public static ApkVerifier.Issue m2509() {
        if (C0038.m4010() >= 0) {
            return ApkVerifier.Issue.V2_SIG_UNKNOWN_APK_SIG_SCHEME_ID;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣۢ, reason: contains not printable characters */
    public static void m2510(Object obj, Object obj2, boolean z) {
        if (C0021.m1598() <= 0) {
            ((C0) obj).m((Context) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۦۨۤ, reason: contains not printable characters */
    public static String m2511() {
        if (C0066.m4827() >= 0) {
            return "Alg.Alias.Cipher.DESEDE/CBC/PKCS7Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۥۣ, reason: contains not printable characters */
    public static void m2512(Object obj) {
        if (C0030.m2940() >= 0) {
            ((T1) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m2513() {
        if (C0032.m3184() <= 0) {
            return AbstractC0452u2.c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static TextView m2514(Object obj) {
        if (C0024.m2011() < 0) {
            return ((DialogC0448t4) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۡۡ, reason: not valid java name and contains not printable characters */
    public static float m2515(Object obj) {
        if (C0070.m5903() > 0) {
            return ((S1) obj).d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۢۢۦ, reason: not valid java name and contains not printable characters */
    public static void m2516(Object obj) {
        if (C0064.m4578() >= 0) {
            ((O2) obj).R();
        }
    }

    /* JADX INFO: renamed from: ۧۢۨۧ, reason: not valid java name and contains not printable characters */
    public static String m2517(Object obj) {
        if (C0073.m6356() < 0) {
            return ((ApkVerifier.Issue) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static void m2518(Object obj, int i) {
        if (C0024.m2011() <= 0) {
            ((TextView) obj).setCompoundDrawablePadding(i);
        }
    }

    /* JADX INFO: renamed from: ۧۥۢ۟, reason: not valid java name and contains not printable characters */
    public static void m2519(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0069.m5781() <= 0) {
            System.arraycopy(obj, i, obj2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static String m2520() {
        if (C0026.m2298() <= 0) {
            return "۠ۧۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۦۨ, reason: not valid java name and contains not printable characters */
    public static int m2521(Object obj) {
        if (C0072.m6216() > 0) {
            return ((U3) obj).p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۨۧۧ, reason: not valid java name and contains not printable characters */
    public static int m2522(Object obj) {
        if (C0024.m2011() < 0) {
            return ((AutoClickPointerBean) obj).getDelayEnd();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static void m2523(boolean z) {
        if (C0018.m1064() >= 0) {
            C$Gson$Preconditions.checkArgument(z);
        }
    }

    /* JADX INFO: renamed from: ۨۡۡ۠, reason: not valid java name and contains not printable characters */
    public static Window m2524(Object obj) {
        if (C0034.m3450() > 0) {
            return ((Activity) obj).getWindow();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۧ, reason: not valid java name and contains not printable characters */
    public static int m2525(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((AutoClickPointerBean) obj).getClickTime();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡۨ۟, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.Builder m2526(Object obj, Object obj2) {
        if (C0077.m7272() < 0) {
            return ((DefaultApkSignerEngine.Builder) obj).setSigningCertificateLineage((SigningCertificateLineage) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۦۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m2527(Object obj) {
        if (C0072.m6216() >= 0) {
            return ApkSigningBlockUtils.generateApkSigningBlock((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۣ, reason: not valid java name and contains not printable characters */
    public static C0361f2 m2528(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((C0340c2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۡۨ, reason: not valid java name and contains not printable characters */
    public static N2 m2529(Object obj) {
        if (C0068.m5678() > 0) {
            return ((O2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Result m2530(Object obj, Object obj2) {
        if (m2460() >= 0) {
            return ((ApkVerifier) obj).verifySourceStamp((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m2531(Object obj) {
        if (C0068.m5678() > 0) {
            return ((ApkVerifier.IssueWithParams) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2532(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((LocalFileRecord) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۧۡ, reason: not valid java name and contains not printable characters */
    public static void m2533(Object obj, int i, Object obj2) {
        if (C0068.m5678() > 0) {
            Array.set(obj, i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m2404(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
