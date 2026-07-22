package com.android.apksig.zip;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSigResult;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ApkSigningBlockUtilsLite;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.SourceStampCertificateLineage;
import com.android.apksig.internal.apk.stamp.V2SourceStampVerifier;
import com.android.apksig.internal.apk.v2.V2SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.asn1.Asn1Field;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.asn1.Asn1TagClass;
import com.android.apksig.internal.asn1.Asn1Tagging;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.pkcs7.EncapsulatedContentInfo;
import com.android.apksig.internal.pkcs7.SignedData;
import com.android.apksig.internal.pkcs7.SignerInfo;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.X509CertificateUtils;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.basetoollib.LoadDrawableUtils;
import com.joke.connectdevice.bean.AutoClickBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.InstanceCreator;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.C$Gson$Types;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.JsonTreeWriter;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.internal.reflect.ReflectionAccessor;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptActionBean;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0344d;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0420p;
import com.zfork.multiplatforms.android.bomb.C0447t3;
import com.zfork.multiplatforms.android.bomb.C0453u3;
import com.zfork.multiplatforms.android.bomb.C0483z3;
import com.zfork.multiplatforms.android.bomb.D0;
import com.zfork.multiplatforms.android.bomb.D4;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0448t4;
import com.zfork.multiplatforms.android.bomb.DialogC0472x4;
import com.zfork.multiplatforms.android.bomb.DialogInterfaceOnClickListenerC0374h1;
import com.zfork.multiplatforms.android.bomb.E;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.InterfaceC0466w4;
import com.zfork.multiplatforms.android.bomb.J2;
import com.zfork.multiplatforms.android.bomb.J3;
import com.zfork.multiplatforms.android.bomb.K1;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q4;
import com.zfork.multiplatforms.android.bomb.S3;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.U1;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0368g2;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0462w0;
import com.zfork.multiplatforms.android.bomb.W3;
import com.zfork.multiplatforms.android.bomb.X1;
import com.zfork.multiplatforms.android.bomb.Z1;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.r;
import com.zfork.multiplatforms.android.bomb.y5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.FileVisitResult;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.jar.Attributes;
import javax.crypto.EncryptedPrivateKeyInfo;
import org.conscrypt.C0111;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: com.android.apksig.zip.ۡۨۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0035 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f140short = {981, 734};

    /* JADX INFO: renamed from: ۠ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static int f141 = -74;

    /* JADX INFO: renamed from: ۟۟ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static void m3511(Object obj) {
        if (C0030.m2940() > 0) {
            ((InterfaceC0466w4) obj).cancel();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m3512() {
        if (C0078.m7450() >= 0) {
            return "AES_256/CBC/NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static long m3513(Object obj) {
        if (C0036.m3653() < 0) {
            return ((y5) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static FileVisitResult m3514() {
        if (C0075.m6893() > 0) {
            return C0016.m716();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static int m3515(Object obj, long j) {
        if (C0025.m2132() > 0) {
            return ((TimeZone) obj).getOffset(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3516(int i) {
        if (C0063.m4427() >= 0) {
            return ByteBuffer.allocate(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m3517(Object obj) {
        if (C0020.m1385() < 0) {
            return o5.t((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static int m3518(Object obj) {
        if (C0063.m4427() > 0) {
            return ((Map) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static ActivityInfo m3519(Object obj, Object obj2) {
        if (C0068.m5678() >= 0) {
            return T2.d((String) obj, (PackageManager) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static ReflectionAccessor m3520() {
        if (C0070.m5903() >= 0) {
            return ReflectionAccessor.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static TextView m3521(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((D4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Random m3522(Object obj) {
        if (C0032.m3184() < 0) {
            return ((L) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static void m3523(Object obj, Object obj2) {
        if (C0028.m2593() > 0) {
            O2.E((KeyStore) obj, (Hashtable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m3524() {
        if (C0017.m846() >= 0) {
            return TypeAdapters.LONG;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m3525(Object obj, Object obj2) {
        if (C0031.m3075() >= 0) {
            ((Display) obj).getSize((Point) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m3526(Object obj, Object obj2) {
        if (C0067.m5468() < 0) {
            ((C0361f2) obj).setBgDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static MethodHandle m3527(Object obj, Object obj2) {
        if (C0024.m2011() < 0) {
            return C0023.m1890((MethodHandles.Lookup) obj, (Field) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static Object m3528(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((ViewOnClickListenerC0368g2) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۦۡ, reason: not valid java name and contains not printable characters */
    public static int m3529(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((V3SchemeVerifier) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static void m3530(Object obj) {
        if (C0031.m3075() > 0) {
            ((O1) obj).cancel();
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m3531(Object obj, Object obj2) {
        if (C0026.m2298() <= 0) {
            return ((Gson) obj).getAdapter((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۢ۠, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m3532(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((DefaultApkSignerEngine.Builder) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static TextView m3533(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((U1) obj).getTvDelete();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static char[] m3534(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((O2) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static String m3535() {
        if (C0034.m3450() >= 0) {
            return "<pathlist>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static ApkSigResult m3536(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        if (C0018.m1064() >= 0) {
            return V2SourceStampVerifier.verify((DataSource) obj, (ZipSections) obj2, (byte[]) obj3, (Map) obj4, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۥ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m3537(Object obj, Object obj2, int i) {
        if (C0030.m2940() > 0) {
            return ((PackageManager) obj).getPackageArchiveInfo((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥۦ, reason: not valid java name and contains not printable characters */
    public static View m3538(Object obj) {
        if (m3569() <= 0) {
            return ((I1) obj).getHidePointerLayout();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m3539(Object obj) {
        if (C0039.m4109() >= 0) {
            ((C0361f2) obj).g();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۣ۠, reason: not valid java name and contains not printable characters */
    public static Asn1Tagging m3540(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((Asn1Field) obj).tagging();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤ, reason: not valid java name and contains not printable characters */
    public static void m3541(Object obj, Object obj2, Object obj3, long j) {
        if (C0077.m7272() < 0) {
            ((W3) obj).h((ArrayList) obj2, (E1) obj3, j);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m3542(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((EncryptedPrivateKeyInfo) obj).getAlgName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static View m3543(Object obj, Object obj2) {
        if (C0017.m846() >= 0) {
            return ((DialogC0385j0) obj).d((Activity) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3544(Object obj) {
        if (C0032.m3184() <= 0) {
            return Arrays.hashCode((Object[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m3545(Object obj, boolean z) {
        if (C0023.m1921() >= 0) {
            return ((ApkSigner.Builder) obj).setAlignmentPreserved(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static List m3546(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((ScriptActionBean) obj).delay;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m3547(Object obj, Object obj2, Object obj3) {
        if (C0030.m2940() >= 0) {
            ((C0420p) obj).d((E1) obj2, (Q4) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static String m3548(Object obj) {
        if (C0070.m5903() > 0) {
            return ((EncapsulatedContentInfo) obj).contentType;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static HashSet m3549() {
        if (C0069.m5781() < 0) {
            return ApkVerifier.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3550(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((U3) obj).w;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.Builder m3551(Object obj, int i) {
        if (C0073.m6356() < 0) {
            return ((SigningCertificateLineage.Builder) obj).setMinSdkVersion(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static double m3552(double d) {
        return C0016.m717() <= 0 ? Math.ceil(d) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨۢ, reason: not valid java name and contains not printable characters */
    public static WildcardType m3553(Object obj) {
        if (C0031.m3075() >= 0) {
            return C$Gson$Types.supertypeOf((Type) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean[] m3554(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((X509Certificate) obj).getIssuerUniqueID();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static Collection m3555(Object obj) {
        if (C0078.m7450() >= 0) {
            return X509CertificateUtils.generateCertificates((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۨ, reason: not valid java name and contains not printable characters */
    public static ConsumerAbility m3556(Object obj) {
        if (C0017.m846() > 0) {
            return ((DialogInterfaceOnClickListenerC0374h1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۧ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.Builder m3557(Object obj, boolean z) {
        if (C0077.m7272() <= 0) {
            return ((DefaultApkSignerEngine.Builder) obj).setVerityEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3558(Object obj, Object obj2) {
        if (C0034.m3450() >= 0) {
            return Arrays.equals((Object[]) obj, (Object[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m3559(Object obj, Object obj2, int i) {
        if (C0063.m4427() >= 0) {
            C0387j2.j((PushbackInputStream) obj, (byte[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static Certificate[] m3560(Object obj, Object obj2) {
        if (C0033.m3358() <= 0) {
            return ((KeyStore) obj).getCertificateChain((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m3561(Object obj) throws Throwable {
        if (C0033.m3358() <= 0) {
            ((ApkSigner) obj).sign();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m3562() {
        if (C0076.m6903() <= 0) {
            return "validity";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۨ۟, reason: not valid java name and contains not printable characters */
    public static String m3563(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            return O2.u((String) obj, (Certificate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۢۥ, reason: not valid java name and contains not printable characters */
    public static int m3564(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((Attributes) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static String m3565(Object obj, int i) {
        if (C0018.m1064() >= 0) {
            return ((Resources) obj).getResourceName(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3566(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((AndroidBinXmlParser) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static char[] m3567(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((O2) obj).Q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢ۟, reason: not valid java name and contains not printable characters */
    public static EncapsulatedContentInfo m3568(Object obj) {
        if (C0076.m6903() < 0) {
            return ((SignedData) obj).encapContentInfo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۥۣ, reason: not valid java name and contains not printable characters */
    public static int m3569() {
        return (-1746983) ^ C0032.m3236((Object) "۟ۧۨ");
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3570(Object obj) {
        if (C0073.m6356() < 0) {
            return ((ApkVerifier.Result) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۥ, reason: not valid java name and contains not printable characters */
    public static void m3571(Object obj, int i) {
        if (C0029.m2791() >= 0) {
            ((ParsePosition) obj).setIndex(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۥ, reason: not valid java name and contains not printable characters */
    public static List m3572(Object obj) {
        if (C0021.m1598() < 0) {
            return ((ApkVerifier.Result.V1SchemeSignerInfo) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢۡ, reason: not valid java name and contains not printable characters */
    public static int m3573(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((r) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۨۦ, reason: not valid java name and contains not printable characters */
    public static ViewOnClickListenerC0462w0 m3574(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((DialogC0373h0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۨۧ, reason: not valid java name and contains not printable characters */
    public static ApplicationInfo m3575(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((Context) obj).getApplicationInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static long m3576(Object obj) {
        if (C0066.m4827() > 0) {
            return ((ScriptActionBean) obj).startMs;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m3577() {
        if (C0078.m7450() > 0) {
            return "Certificate.i.1.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static TextView m3578(Object obj) {
        if (C0026.m2298() < 0) {
            return ((DialogC0389j4) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۨ۟, reason: not valid java name and contains not printable characters */
    public static long m3579(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((AutoClickBean) obj).getId();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥ۟, reason: not valid java name and contains not printable characters */
    public static EditText m3580(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((C0344d) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static void m3581(Object obj) {
        if (C0016.m717() < 0) {
            Collections.sort((List) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3582(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((ApkSigResult) obj).containsWarnings();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۢۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3583(Object obj) {
        if (C0038.m4010() > 0) {
            return ((J2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨۢ, reason: not valid java name and contains not printable characters */
    public static String m3584() {
        if (C0071.m6069() > 0) {
            return C0483z3.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۤ۟, reason: not valid java name and contains not printable characters */
    public static C0453u3 m3585(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((C0447t3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۡۡ, reason: not valid java name and contains not printable characters */
    public static X509Certificate m3586(Object obj) {
        if (C0074.m6454() < 0) {
            return ((SourceStampCertificateLineage.SigningCertificateNode) obj).signingCert;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠۠, reason: not valid java name and contains not printable characters */
    public static int m3587(Object obj) {
        if (C0023.m1921() > 0) {
            return ((BitSet) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static File m3588(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((Context) obj).getExternalCacheDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۦ, reason: not valid java name and contains not printable characters */
    public static String m3589(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((String) obj).toUpperCase();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static ShapeDrawable m3590(Object obj) {
        if (C0032.m3184() < 0) {
            return E.f((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۨۢ, reason: not valid java name and contains not printable characters */
    public static String m3591() {
        if (C0063.m4427() >= 0) {
            return "Creation.date.keyStore.getCreationDate.alias.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3592(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((HashMap) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۧ۠, reason: not valid java name and contains not printable characters */
    public static int m3593(Object obj) {
        if (C0017.m846() > 0) {
            return ((E1) obj).t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m3594() {
        if (C0076.m6903() <= 0) {
            return TypeAdapters.INTEGER_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۥۦ, reason: not valid java name and contains not printable characters */
    public static V3SchemeVerifier.Builder m3595(Object obj, Object obj2) {
        if (C0020.m1385() < 0) {
            return ((V3SchemeVerifier.Builder) obj).setContentDigestsToVerify((Set) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦۧ, reason: not valid java name and contains not printable characters */
    public static short[] m3596() {
        if (C0025.m2132() > 0) {
            return f140short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3597(Object obj) {
        if (C0072.m6216() > 0) {
            return ((SourceStampVerifier.Result.SourceStampInfo) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨ۠, reason: not valid java name and contains not printable characters */
    public static JsonWriter m3598(Object obj) {
        if (C0024.m2011() < 0) {
            return ((JsonWriter) obj).beginArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۢ, reason: not valid java name and contains not printable characters */
    public static String m3599() {
        if (C0069.m5781() <= 0) {
            return "OpenSSLCipherRSA$OAEP$SHA384";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۡۥ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m3600(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((ApkSigner.Builder) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۧ, reason: not valid java name and contains not printable characters */
    public static Class m3601(Object obj, Object obj2) {
        if (C0066.m4827() > 0) {
            return ((ClassLoader) obj).loadClass((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۢۥ, reason: not valid java name and contains not printable characters */
    public static DialogC0472x4 m3602(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((DialogC0448t4) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static JsonElement m3604(Object obj) {
        if (C0067.m5468() < 0) {
            return ((JsonTreeWriter) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m3605(Object obj, Object obj2) {
        if (C0075.m6893() >= 0) {
            return ((LoadDrawableUtils) obj).getDrawabXmlLayout((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Activity m3606(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((U3) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m3607(Object obj, Object obj2) {
        if (C0020.m1385() <= 0) {
            return C0026.m2312((BerDataValue) obj, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int[] m3608() {
        if (C0075.m6893() >= 0) {
            return S3.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۤۧ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3609(Object obj) {
        if (m3569() < 0) {
            return X509CertificateUtils.b((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m3610(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            J3.c((Path) obj, (LinkOption[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Asn1OpaqueObject m3611(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((SignerInfo) obj).signedAttrs;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۦ, reason: not valid java name and contains not printable characters */
    public static String m3612(Object obj) {
        if (C0019.m1311() == 0) {
            return ((Node) obj).getNodeValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۥۥ, reason: not valid java name and contains not printable characters */
    public static int m3613(Object obj) {
        if (C0038.m4010() >= 0) {
            return C0032.m3186((SigningCertificateLineage.SignerCapabilities) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨۦۣ, reason: not valid java name and contains not printable characters */
    public static List m3614(Object obj, int i, boolean z, boolean z2) {
        if (C0072.m6216() >= 0) {
            return V2SchemeSigner.getSuggestedSignatureAlgorithms((PublicKey) obj, i, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int m3615(Object obj) {
        if (C0038.m4010() > 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).minSdkVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۢ, reason: contains not printable characters */
    public static HashMap m3616(Object obj) {
        if (C0036.m3653() < 0) {
            return ((C0361f2) obj).x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۠ۧ, reason: contains not printable characters */
    public static C0361f2 m3617(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((Z1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۢۧ, reason: contains not printable characters */
    public static int m3618(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((CentralDirectoryRecord) obj).getLastModificationDate();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۦۦۦ, reason: contains not printable characters */
    public static void m3619(Object obj, boolean z) {
        if (m3569() <= 0) {
            ((AccessibleObject) obj).setAccessible(z);
        }
    }

    /* JADX INFO: renamed from: ۥۣۧ, reason: contains not printable characters */
    public static int m3620(int i, Object obj) {
        if (C0075.m6893() >= 0) {
            return AbstractC0406m3.e(i, (Context) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢۧۨ, reason: contains not printable characters */
    public static int m3621(Object obj, Object obj2) {
        if (C0032.m3184() <= 0) {
            return ((InputStream) obj).read((byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦ۟ۨ, reason: contains not printable characters */
    public static TypeAdapterFactory m3622() {
        if (C0073.m6356() < 0) {
            return TypeAdapters.SHORT_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۨ, reason: contains not printable characters */
    public static String m3623(String str) {
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
        String strM6902 = C0076.m6902(m3596(), 0, 1, 948);
        while (C0078.m7380(strM6902) > 0) {
            strM6902 = C0031.m2993();
            if (C0078.m7380(strM6902) == 0) {
                strM6902 = C0019.m1189(m3596(), 1, 1, 703);
            }
        }
        int iM7380 = C0078.m7380(strM6902);
        int iM73802 = C0078.m7380(strM29932);
        for (int i3 = 0; i3 < iM7380; i3++) {
            bArrM7297[i3] = (byte) (bArrM7297[i3] ^ C0077.m7212(strM29932, i3 % iM73802));
        }
        for (int iM73803 = 0; iM73803 < bArrM7297.length; iM73803 = C0078.m7380(C0031.m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۦۧۥۣ, reason: contains not printable characters */
    public static Object m3624(Object obj, Object obj2, Object obj3) {
        if (C0033.m3358() <= 0) {
            return ((Map) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ۠۠, reason: contains not printable characters */
    public static char[] m3625(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((O2) obj).w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۡۢ, reason: contains not printable characters */
    public static void m3626(Object obj, Object obj2, Object obj3) {
        if (C0076.m6903() < 0) {
            ((C0387j2) obj).c((D5) obj2, (OutputStream) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static O1 m3627(Object obj) {
        if (C0111.m13165() < 0) {
            return ((K1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۤۨ, reason: not valid java name and contains not printable characters */
    public static int m3628(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((D0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۢۨ, reason: not valid java name and contains not printable characters */
    public static int m3629(Object obj) {
        if (C0034.m3450() > 0) {
            return ((Buffer) obj).position();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۧۤ, reason: not valid java name and contains not printable characters */
    public static Asn1TagClass m3630() {
        if (C0039.m4109() >= 0) {
            return Asn1TagClass.APPLICATION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3631() {
        if (C0037.m3837() < 0) {
            return ApkVerifier.Issue.JAR_SIG_UNKNOWN_APK_SIG_SCHEME_ID;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۧۤ, reason: not valid java name and contains not printable characters */
    public static C0361f2 m3632(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((X1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Typeface m3633(int i) {
        if (C0072.m6216() >= 0) {
            return Typeface.defaultFromStyle(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m3634(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((AutoClickPointerBean) obj).getClickIntervalStart();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m3635(Object obj) {
        if (C0038.m4010() > 0) {
            ((PrintStream) obj).flush();
        }
    }

    /* JADX INFO: renamed from: ۨۡۡۥ, reason: not valid java name and contains not printable characters */
    public static List m3636(Object obj, int i, int i2, boolean z) {
        if (C0021.m1598() < 0) {
            return ApkSigningBlockUtilsLite.getSignaturesToVerify((List) obj, i, i2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۢۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3637() {
        if (C0077.m7272() <= 0) {
            return ApkVerifier.Issue.V2_SIG_NO_SIGNATURES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۤۥ, reason: not valid java name and contains not printable characters */
    public static C0387j2 m3638(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((E5) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m3639(Object obj, Object obj2) {
        if (C0033.m3358() < 0) {
            return ((InstanceCreator) obj).createInstance((Type) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۦۢ, reason: not valid java name and contains not printable characters */
    public static int[] m3640(Object obj) {
        if (C0034.m3450() > 0) {
            return ((N2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m3603(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
