package com.joke.plugin.bmJiasu.xhook.basic;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0038;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.SignerInfo;
import com.android.apksig.internal.util.ByteBufferDataSource;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.FileChannelDataSource;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipSections;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.call.a;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.C$Gson$Types;
import com.joke.plugin.gson.internal.Excluder;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptRecordBean;
import com.joke.script.bean.ScriptRecordType;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.entry.SignatureCreatorAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0335b4;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.AbstractC0416o1;
import com.zfork.multiplatforms.android.bomb.B3;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0337c;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0365g;
import com.zfork.multiplatforms.android.bomb.C0376h3;
import com.zfork.multiplatforms.android.bomb.C0381i2;
import com.zfork.multiplatforms.android.bomb.C0404m1;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0472x4;
import com.zfork.multiplatforms.android.bomb.E0;
import com.zfork.multiplatforms.android.bomb.F2;
import com.zfork.multiplatforms.android.bomb.F3;
import com.zfork.multiplatforms.android.bomb.G;
import com.zfork.multiplatforms.android.bomb.G4;
import com.zfork.multiplatforms.android.bomb.H2;
import com.zfork.multiplatforms.android.bomb.J2;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.K4;
import com.zfork.multiplatforms.android.bomb.L4;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.N4;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q1;
import com.zfork.multiplatforms.android.bomb.T0;
import com.zfork.multiplatforms.android.bomb.V4;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0480z0;
import com.zfork.multiplatforms.android.bomb.ViewOnTouchListenerC0481z1;
import com.zfork.multiplatforms.android.bomb.W;
import com.zfork.multiplatforms.android.bomb.X;
import com.zfork.multiplatforms.android.bomb.Y;
import com.zfork.multiplatforms.android.bomb.Y1;
import com.zfork.multiplatforms.android.bomb.o5;
import j$.util.DesugarArrays;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyStore;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import org.conscrypt.C0111;
import sun.security.x509.CertificateExtensions;

/* JADX INFO: renamed from: com.joke.plugin.bmJiasu.xhook.basic.۟ۡۧۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0066 {

    /* JADX INFO: renamed from: ۟ۧۢۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean f152 = true;

    /* JADX INFO: renamed from: ۟۟۠۠, reason: not valid java name and contains not printable characters */
    public static TextView m4791(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((DialogC0472x4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4792(Object obj) {
        if (C0074.m6454() <= 0) {
            return Files.isSymbolicLink((Path) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m4793(Object obj, Object obj2) {
        if (C0036.m3653() < 0) {
            F3.a((ArrayList) obj, (char[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m4794(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۢۥ, reason: not valid java name and contains not printable characters */
    public static ViewOnClickListenerC0480z0 m4795(Object obj) {
        if (C0028.m2593() > 0) {
            return ((O1) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۦۥ, reason: not valid java name and contains not printable characters */
    public static String m4796(Object obj) {
        if (m4827() > 0) {
            return ((O2) obj).t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static DisplayMetrics m4797(Object obj) {
        if (C0027.m2460() > 0) {
            return ((Resources) obj).getDisplayMetrics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۟۠, reason: not valid java name and contains not printable characters */
    public static KeyStore m4798(Object obj, Object obj2) {
        if (C0033.m3358() < 0) {
            return KeyStore.getInstance((String) obj, (Provider) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.Builder m4799(Object obj, Object obj2) {
        if (C0075.m6893() >= 0) {
            return ((DefaultApkSignerEngine.Builder) obj).setStampSignerConfig((DefaultApkSignerEngine.SignerConfig) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m4800() {
        if (C0035.m3569() < 0) {
            return "trustedCertEntry, ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static void m4801(Object obj, int i) {
        if (C0032.m3184() <= 0) {
            ((TextView) obj).setGravity(i);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static int m4802(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((ByteBufferDataSource) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static void m4803(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0068.m5678() > 0) {
            ((ApkSignerEngine) obj).signV4((DataSource) obj2, (File) obj3, z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static String m4804(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m4805(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((F2) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m4806(Object obj) {
        if (C0072.m6216() > 0) {
            return ((K4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4807(Object obj, boolean z) {
        if (C0029.m2791() >= 0) {
            ((TextView) obj).setSingleLine(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۡۡۧ, reason: not valid java name and contains not printable characters */
    public static void m4808(Object obj) {
        if (C0065.m4647() > 0) {
            ((ByteArrayOutputStream) obj).reset();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۡۢ۠, reason: not valid java name and contains not printable characters */
    public static int m4809(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((G) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۥ, reason: not valid java name and contains not printable characters */
    public static V4 m4810(Object obj) {
        if (C0068.m5678() > 0) {
            return ((W) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۤۨ, reason: not valid java name and contains not printable characters */
    public static KeyEvent.Callback m4811(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((Y1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۨ, reason: not valid java name and contains not printable characters */
    public static String m4812() {
        if (C0020.m1385() <= 0) {
            return "New.prompt.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۡ, reason: not valid java name and contains not printable characters */
    public static List m4813(Object obj) {
        if (C0031.m3075() > 0) {
            return ((AbstractC0384j) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m4814() {
        if (C0072.m6216() >= 0) {
            o5.y();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m4815(Object obj) {
        if (C0034.m3450() > 0) {
            return Asn1DerEncoder.b(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۦ۟, reason: not valid java name and contains not printable characters */
    public static J2 m4816(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((H2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static long m4817(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((AbstractC0384j) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m4818(Object obj, Object obj2) {
        if (C0016.m717() < 0) {
            return ((Class) obj).cast(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۥ, reason: not valid java name and contains not printable characters */
    public static int m4819(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((ManifestParser) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static Iterator m4820(Object obj) {
        if (C0034.m3450() > 0) {
            return ((Collection) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m4821() {
        if (C0018.m1064() >= 0) {
            return "REQUEST";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4822(Object obj) {
        if (m4827() >= 0) {
            return ((ApkSignerInfo) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨۦ, reason: not valid java name and contains not printable characters */
    public static int m4823(Object obj) {
        if (C0076.m6903() < 0) {
            return ((E0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۢ, reason: not valid java name and contains not printable characters */
    public static Class m4824() {
        if (C0033.m3358() <= 0) {
            return Long.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static int m4825(Object obj) {
        if (C0018.m1064() > 0) {
            return ((SourceStampVerifier) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Map m4826(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).verifiedSignatures;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۥ, reason: not valid java name and contains not printable characters */
    public static int m4827() {
        return 56431 ^ C0032.m3236((Object) "ۢۡ");
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static long m4829(Object obj, Object obj2, Object obj3) {
        if (C0023.m1921() > 0) {
            return ((LocalFileRecord) obj).outputRecord((DataSource) obj2, (DataSink) obj3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m4830(Object obj) {
        if (C0030.m2940() >= 0) {
            return ApkSigningBlockUtils.encodeAsSequenceOfLengthPrefixedElements((byte[][]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4831() {
        if (C0032.m3184() <= 0) {
            return "Alg.Alias.Cipher.2.16.840.1.101.3.4.1.46";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static Excluder m4832() {
        if (C0029.m2791() >= 0) {
            return Excluder.DEFAULT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۣ, reason: not valid java name and contains not printable characters */
    public static int m4833(Object obj, Object obj2) {
        if (C0111.m13165() <= 0) {
            return ((RandomAccessFile) obj).read((byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4834(Object obj) {
        if (C0020.m1385() < 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m4835() {
        if (C0033.m3358() <= 0) {
            return AbstractC0335b4.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۧ, reason: not valid java name and contains not printable characters */
    public static String m4836() {
        if (C0017.m846() > 0) {
            return "OpenSSLRandom";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4837(Object obj, Object obj2) {
        if (C0111.m13165() < 0) {
            return ((Certificate) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧۨۤ, reason: not valid java name and contains not printable characters */
    public static SignatureCreatorAbility m4838(Object obj) {
        if (C0032.m3184() < 0) {
            return ((G4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۡ۠, reason: not valid java name and contains not printable characters */
    public static void m4839(Object obj) {
        if (C0030.m2940() >= 0) {
            ((JsonReader) obj).endArray();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۡ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m4840() {
        if (C0024.m2011() < 0) {
            return TypeAdapters.CALENDAR_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۥ, reason: not valid java name and contains not printable characters */
    public static char m4841() {
        if (C0031.m3075() >= 0) {
            return File.separatorChar;
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۠۠, reason: not valid java name and contains not printable characters */
    public static int m4842(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((X) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m4843(Object obj) {
        if (C0016.m717() < 0) {
            return ((Field) obj).getModifiers();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static ScrollView m4844(Object obj) {
        if (C0076.m6903() < 0) {
            return ((C0351e) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static List m4845(Object obj) {
        if (C0016.m717() <= 0) {
            return ((ApkVerifier.Result.SourceStampInfo) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static PopupWindow m4846(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((C0381i2) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4847(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((D5) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4848(Object obj, Object obj2, boolean z) {
        if (C0025.m2132() > 0) {
            return ((SharedPreferences) obj).getBoolean((String) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨۨ۟, reason: not valid java name and contains not printable characters */
    public static void m4849(Object obj) {
        if (C0035.m3569() < 0) {
            ((Deflater) obj).end();
        }
    }

    /* JADX INFO: renamed from: ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m4850(Object obj, int i, Object obj2) {
        if (C0065.m4647() > 0) {
            ((ApkSignerInfo) obj).addInfoMessage(i, (Object[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static ImageView m4851(Object obj) {
        if (C0029.m2791() > 0) {
            return ((C0) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۨۥ, reason: not valid java name and contains not printable characters */
    public static ScriptRecordType m4852(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((ScriptRecordBean) obj).scriptRecordType;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m4853(Object obj) {
        if (C0072.m6216() > 0) {
            return SigningCertificateLineage.readFromApkDataSource((DataSource) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m4854(Object obj) {
        if (C0072.m6216() > 0) {
            return ((String) obj).getBytes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m4855(Object obj, Object obj2) {
        if (C0031.m3075() > 0) {
            return ((String) obj).compareTo((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۢ۠, reason: not valid java name and contains not printable characters */
    public static Intent m4856(Object obj, Object obj2, Object obj3) {
        if (C0070.m5903() >= 0) {
            return ((Intent) obj).putExtra((String) obj2, (Serializable) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۨ, reason: not valid java name and contains not printable characters */
    public static void m4857(Object obj, Object obj2, Object obj3) {
        if (C0019.m1311() == 0) {
            ((CertificateExtensions) obj).set((String) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۡۢ, reason: not valid java name and contains not printable characters */
    public static String m4858() {
        if (C0027.m2460() > 0) {
            return "Certificate.was.not.added.to.keystore";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦ۟, reason: not valid java name and contains not printable characters */
    public static View m4859(Object obj) {
        if (m4827() > 0) {
            return ((C0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m4860(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((Q1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۨۦ, reason: not valid java name and contains not printable characters */
    public static long m4861(Object obj) {
        if (C0064.m4578() > 0) {
            return ((ZipSections) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۡۥۥ, reason: not valid java name and contains not printable characters */
    public static Buffer m4862(Object obj, int i) {
        if (C0033.m3358() <= 0) {
            return ((Buffer) obj).position(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۨۥ, reason: not valid java name and contains not printable characters */
    public static Type m4863(Object obj, Object obj2, Object obj3) {
        if (C0032.m3184() < 0) {
            return C$Gson$Types.resolveTypeVariable((Type) obj, (Class) obj2, (TypeVariable) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣ۟, reason: not valid java name and contains not printable characters */
    public static Button m4864(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((C0351e) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4865(int i, Object obj) {
        if (C0032.m3184() <= 0) {
            return C0350d5.c(i, (byte[]) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4866(Object obj) {
        if (m4827() >= 0) {
            return ((JsonElement) obj).isJsonObject();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۨۦۨ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m4867() {
        if (C0064.m4578() > 0) {
            return TypeAdapters.STRING_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠۠, reason: not valid java name and contains not printable characters */
    public static void m4868(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0017.m846() > 0) {
            ((ConsumerAbility) obj).e((Uri) obj2, (ApplicationInfo) obj3, z);
        }
    }

    /* JADX INFO: renamed from: ۣۢ۟۟, reason: not valid java name and contains not printable characters */
    public static byte m4869(Object obj) {
        if (C0030.m2940() > 0) {
            return Byte.parseByte((String) obj);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۣۢۦ۟, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m4870(Object obj) {
        if (C0021.m1598() < 0) {
            return ((SignerInfo) obj).signature;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static C0337c m4871(Object obj) {
        if (C0064.m4578() > 0) {
            return ((AbstractC0384j) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۣۤ, reason: not valid java name and contains not printable characters */
    public static TextView m4872(Object obj) {
        if (C0036.m3653() < 0) {
            return ((C0) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m4873(Object obj) {
        if (C0025.m2132() >= 0) {
            ((WindowManager.LayoutParams) obj).layoutInDisplayCutoutMode = 3;
        }
    }

    /* JADX INFO: renamed from: ۣۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m4874(Object obj, int i) {
        if (C0021.m1598() <= 0) {
            ((AutoClickPointerBean) obj).setPointerY(i);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m4875(Object obj, Object obj2, Object obj3) {
        if (C0023.m1921() >= 0) {
            return ((N4) obj).a(obj2, (IOException) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Certificate m4876(Object obj, Object obj2) {
        if (C0072.m6216() > 0) {
            return ((KeyStore) obj).getCertificate((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۠, reason: not valid java name and contains not printable characters */
    public static int m4877(int i) {
        if (C0031.m3075() >= 0) {
            return K3.i(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4878(Object obj) {
        if (m4827() > 0) {
            return ((A5) obj).g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۧۦ, reason: not valid java name and contains not printable characters */
    public static void m4879(Object obj, Object obj2, Object obj3) {
        if (C0076.m6903() < 0) {
            C0071.m6060((X509Certificate) obj, (PublicKey) obj2, (Provider) obj3);
        }
    }

    /* JADX INFO: renamed from: ۤۤۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m4880(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((T0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4881(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((ArrayList) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۦۦۤ, reason: not valid java name and contains not printable characters */
    public static WindowManager.LayoutParams m4882(Object obj) {
        if (C0031.m3075() > 0) {
            return ((ViewOnTouchListenerC0481z1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۤ, reason: contains not printable characters */
    public static Constructor m4883(Object obj, Object obj2) {
        if (m4827() >= 0) {
            return ((Class) obj).getConstructor((Class[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۥۦ, reason: contains not printable characters */
    public static DigestAlgorithm m4884() {
        if (C0078.m7450() > 0) {
            return DigestAlgorithm.SHA1;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۟ۡ, reason: contains not printable characters */
    public static Asn1Type m4885() {
        if (C0063.m4427() >= 0) {
            return Asn1Type.UTC_TIME;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۨ, reason: contains not printable characters */
    public static String m4886(int i) {
        if (C0111.m13165() < 0) {
            return Integer.toString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۤۨ, reason: contains not printable characters */
    public static void m4887(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0065.m4647() >= 0) {
            ((O2) obj).q((String) obj2, (String) obj3, (String) obj4);
        }
    }

    /* JADX INFO: renamed from: ۥۤۧۤ, reason: contains not printable characters */
    public static boolean m4888(Object obj) {
        if (C0034.m3450() > 0) {
            return ((DefaultApkSignerEngine.Builder) obj).m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥ۠ۨ, reason: contains not printable characters */
    public static String m4889() {
        if (C0070.m5903() >= 0) {
            return "OpenSSLSignature$SHA384ECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۤ۠, reason: contains not printable characters */
    public static void m4890(Object obj, Object obj2) {
        if (C0029.m2791() > 0) {
            ((AdapterView) obj).setOnItemLongClickListener((AdapterView.OnItemLongClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۧ۟ۤ, reason: contains not printable characters */
    public static C0376h3 m4891() {
        if (C0070.m5903() >= 0) {
            return Y.i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۥ۠, reason: contains not printable characters */
    public static List m4892(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((ApkSigningBlockUtils.SignerConfig) obj).certificates;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۧ۠, reason: contains not printable characters */
    public static WindowManager m4893(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((O1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۠ۥ, reason: contains not printable characters */
    public static TextView m4894(Object obj) {
        if (C0071.m6069() > 0) {
            return ((C0365g) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۠ۦ, reason: contains not printable characters */
    public static void m4895(Object obj, Object obj2, int i) {
        if (C0064.m4578() >= 0) {
            ((AbstractC0416o1) obj).a((PushbackInputStream) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۦۣ۟ۦ, reason: contains not printable characters */
    public static Object m4896(Object obj) {
        if (C0030.m2940() > 0) {
            return ((L4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۨۨ, reason: contains not printable characters */
    public static EditText m4897(Object obj) {
        if (C0020.m1385() < 0) {
            return ((DialogC0389j4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۧ, reason: contains not printable characters */
    public static boolean m4898(Object obj, float f, float f2, float f3) {
        if (C0078.m7450() > 0) {
            return ((Matrix) obj).postRotate(f, f2, f3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۤ, reason: contains not printable characters */
    public static String m4899() {
        if (C0063.m4427() >= 0) {
            return "-----BEGIN";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.OutputJarSignatureRequestImpl m4900(Object obj) {
        if (C0077.m7272() < 0) {
            return ((DefaultApkSignerEngine) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4901(Object obj, Object obj2) {
        if (C0025.m2132() >= 0) {
            return DocumentsContract.isDocumentUri((Context) obj, (Uri) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥۥۥ, reason: not valid java name and contains not printable characters */
    public static N2 m4902() {
        if (C0025.m2132() > 0) {
            return N2.p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4903(Object obj, Object obj2) {
        if (C0030.m2940() >= 0) {
            return ((List) obj).containsAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m4904(Object obj, long j, int i, Object obj2) {
        if (C0030.m2940() >= 0) {
            ((FileChannelDataSource) obj).copyTo(j, i, (ByteBuffer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static void m4905(Object obj, Object obj2, int i, int i2) {
        if (C0063.m4427() > 0) {
            ((C0404m1) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۨۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m4906(Object obj, Object obj2) {
        if (C0030.m2940() > 0) {
            ((SeekBar) obj).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۡۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4907(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((a) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۦۣ, reason: not valid java name and contains not printable characters */
    public static int m4908(Object obj, Object obj2) {
        if (C0064.m4578() > 0) {
            return ((B3) obj).c((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۨۧ, reason: not valid java name and contains not printable characters */
    public static DataSource m4909(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((V3SchemeVerifier) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۠۠, reason: not valid java name and contains not printable characters */
    public static Stream m4910(Object obj) {
        if (C0016.m717() <= 0) {
            return DesugarArrays.stream((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۡ, reason: not valid java name and contains not printable characters */
    public static void m4911(Object obj, Object obj2, Object obj3) {
        if (C0017.m846() >= 0) {
            C0017.m919(C0023.m1877((V1SchemeVerifier.Result) obj), new ApkVerifier.IssueWithParams((ApkVerifier.Issue) obj2, (Object[]) obj3));
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۡۦ, reason: not valid java name and contains not printable characters */
    public static String m4828(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
