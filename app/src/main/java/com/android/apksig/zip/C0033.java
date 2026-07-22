package com.android.apksig.zip;

import android.content.Intent;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsSeekBar;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureInfo;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SigningCertificateLineage;
import com.android.apksig.internal.apk.v4.V4SchemeSigner;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.jar.ManifestWriter;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.pkcs7.IssuerAndSerialNumber;
import com.android.apksig.internal.util.ByteArrayDataSink;
import com.android.apksig.internal.util.ByteBufferDataSource;
import com.android.apksig.internal.util.ByteBufferSink;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.RunnablesExecutor;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.JsonArray;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.ConstructorConstructor;
import com.joke.plugin.gson.internal.LinkedTreeMap;
import com.joke.plugin.gson.internal.ObjectConstructor;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptProjectBean;
import com.joke.speedfloatingball.bean.CloudBean;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0416o1;
import com.zfork.multiplatforms.android.bomb.B3;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0324a0;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0358f;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0412n3;
import com.zfork.multiplatforms.android.bomb.C0413n4;
import com.zfork.multiplatforms.android.bomb.C0414o;
import com.zfork.multiplatforms.android.bomb.C1;
import com.zfork.multiplatforms.android.bomb.C5;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0403m0;
import com.zfork.multiplatforms.android.bomb.H;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.J;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q;
import com.zfork.multiplatforms.android.bomb.R0;
import com.zfork.multiplatforms.android.bomb.T;
import com.zfork.multiplatforms.android.bomb.V;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0366g0;
import com.zfork.multiplatforms.android.bomb.W4;
import com.zfork.multiplatforms.android.bomb.Z4;
import com.zfork.multiplatforms.android.bomb.p5;
import com.zfork.multiplatforms.android.bomb.t5;
import com.zfork.multiplatforms.android.bomb.v5;
import com.zfork.multiplatforms.android.bomb.w5;
import com.zfork.multiplatforms.android.bomb.x5;
import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.io.Writer;
import java.lang.reflect.Field;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.jar.JarFile;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import org.conscrypt.NativeCrypto;
import sun.misc.Unsafe;
import sun.security.x509.CertificateExtensions;

/* JADX INFO: renamed from: com.android.apksig.zip.۟ۥۤۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0033 {

    /* JADX INFO: renamed from: ۟ۦۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f137 = true;

    /* JADX INFO: renamed from: ۣ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static double m3251(double d) {
        return C0035.m3569() <= 0 ? Math.toDegrees(d) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static int m3252(Object obj) {
        if (C0078.m7450() > 0) {
            return ((ScriptProjectBean) obj).count;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m3253() {
        if (C0027.m2460() >= 0) {
            return TypeAdapters.NUMBER_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static void m3254(Object obj, Object obj2) {
        if (C0020.m1385() < 0) {
            ManifestWriter.writeAttributes((OutputStream) obj, (SortedMap) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static ApkSignerEngine.InputJarEntryInstructions.OutputPolicy[] m3255() {
        if (C0038.m4010() > 0) {
            return ApkSignerEngine.InputJarEntryInstructions.OutputPolicy.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static List m3256(Object obj) {
        if (C0028.m2593() > 0) {
            return ((ApkVerifier.Result.SourceStampInfo) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static InputStream m3257(Object obj) {
        if (C0017.m846() >= 0) {
            return ((C0414o) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m3258(Object obj) {
        if (C0063.m4427() > 0) {
            return ((O2) obj).E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m3259() {
        if (C0031.m3075() > 0) {
            return "FoxOrganizationUnit";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m3260(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((B3) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۧۢ, reason: not valid java name and contains not printable characters */
    public static String m3261(Object obj, boolean z, Object obj2) {
        if (C0028.m2593() > 0) {
            return AbstractC0406m3.b((byte[]) obj, z, (Charset) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static SourceStampVerifier.Result.SourceStampInfo m3262(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((SourceStampVerifier.Result) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static long m3263(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((SignatureInfo) obj).centralDirOffset;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static short m3264(Object obj) {
        if (C0018.m1064() > 0) {
            return ((JsonElement) obj).getAsShort();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static KeyStore m3265(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((O2) obj).F();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static void m3266(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0068.m5678() > 0) {
            ((C0350d5) obj).f((HashMap) obj2, (byte[]) obj3, (C0412n3) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۡ, reason: not valid java name and contains not printable characters */
    public static char[] m3267(Object obj, Object obj2, Object obj3) {
        if (C0063.m4427() >= 0) {
            return ((Console) obj).readPassword((String) obj2, (Object[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static ObjectConstructor m3268(Object obj, Object obj2) {
        if (C0063.m4427() > 0) {
            return ((ConstructorConstructor) obj).get((TypeToken) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧۥ, reason: not valid java name and contains not printable characters */
    public static Intent m3269(Object obj, Object obj2, boolean z) {
        if (C0029.m2791() > 0) {
            return ((Intent) obj).putExtra((String) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3270(Object obj) {
        if (C0069.m5781() < 0) {
            return ((ByteBufferSink) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۥۣ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m3271(Object obj) {
        if (C0065.m4647() > 0) {
            return ((JsonPrimitive) obj).deepCopy();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m3272(Object obj) {
        if (C0017.m846() >= 0) {
            return ((B3) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧۤۥ, reason: not valid java name and contains not printable characters */
    public static int m3273(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((ByteArrayDataSink) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۨۤ, reason: not valid java name and contains not printable characters */
    public static int m3274(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((O2) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static ByteOrder m3275(Object obj) {
        if (C0074.m6454() < 0) {
            return ((ByteBuffer) obj).order();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static short m3276(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((Number) obj).shortValue();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢۤ, reason: not valid java name and contains not printable characters */
    public static long m3277(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((LocalFileRecord) obj).e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۥ, reason: not valid java name and contains not printable characters */
    public static void m3278(Object obj, Object obj2) {
        if (C0038.m4010() >= 0) {
            ((C0324a0) obj).a(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۨ۟, reason: not valid java name and contains not printable characters */
    public static String m3279() {
        if (C0075.m6893() > 0) {
            return "Extension.Request.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m3280(Object obj, Object obj2) {
        if (C0021.m1598() < 0) {
            C0032.m3233((Path) obj, (HashSet) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static T m3281(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((C0413n4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m3282(Object obj) {
        if (C0017.m846() > 0) {
            return ((String) obj).toLowerCase();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m3283(Object obj, Object obj2) {
        if (C0029.m2791() > 0) {
            return ((Map.Entry) obj).setValue(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static void m3284(Object obj, boolean z) {
        if (C0076.m6903() < 0) {
            ((TextView) obj).setAllCaps(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static int m3285(Object obj) {
        if (C0034.m3450() > 0) {
            return ((ConsumerAbility) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static String m3286(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۧۥ, reason: not valid java name and contains not printable characters */
    public static String m3287(Object obj, Object obj2) {
        if (C0021.m1598() <= 0) {
            return ((v5) obj).c((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟۠, reason: not valid java name and contains not printable characters */
    public static ScrollView m3288(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((DialogC0389j4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m3289(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((DefaultApkSignerEngine) obj).generateSourceStampCertificateDigest();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦ, reason: not valid java name and contains not printable characters */
    public static int m3290(Object obj) {
        if (C0077.m7272() < 0) {
            return ((Rect) obj).right;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3291(Object obj) {
        if (C0078.m7450() > 0) {
            return ((ApkVerifier.Result) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m3292(Object obj, Object obj2) throws IOException {
        if (C0017.m846() > 0) {
            ((OutputStream) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static Asn1OpaqueObject m3293(Object obj) {
        if (C0017.m846() >= 0) {
            return ((IssuerAndSerialNumber) obj).issuer;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۣ, reason: not valid java name and contains not printable characters */
    public static void m3294(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0065.m4647() > 0) {
            ((C0387j2) obj).z((D5) obj2, (OutputStream) obj3, (byte[]) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۣ۟, reason: not valid java name and contains not printable characters */
    public static View m3295(Object obj, int i, Object obj2, boolean z) {
        if (C0031.m3075() >= 0) {
            return ((LayoutInflater) obj).inflate(i, (ViewGroup) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static ByteBufferDataSource m3296(Object obj, long j, long j2) {
        if (C0039.m4109() >= 0) {
            return ((ByteBufferDataSource) obj).slice(j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟۟, reason: not valid java name and contains not printable characters */
    public static Appendable m3297(Object obj, Object obj2, int i, int i2) {
        if (C0028.m2593() > 0) {
            return ((Appendable) obj).append((CharSequence) obj2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m3298(Object obj, int i) {
        if (C0064.m4578() >= 0) {
            ((AbsSeekBar) obj).setThumbOffset(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۧۢ, reason: not valid java name and contains not printable characters */
    public static CRC32 m3299(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((C5) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۤۥ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3300(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((Q) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3301(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((AndroidBinXmlParser) obj).getAttributeCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static PushbackInputStream m3302(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((x5) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static int[] m3303(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((Q) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Set m3304(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((LinkedTreeMap) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۣ, reason: not valid java name and contains not printable characters */
    public static List m3305(Object obj) {
        if (C0075.m6893() > 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠۟, reason: not valid java name and contains not printable characters */
    public static N2 m3306() {
        if (C0030.m2940() >= 0) {
            return N2.t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧۨ, reason: not valid java name and contains not printable characters */
    public static t5 m3307(Object obj, Object obj2, long j, long j2, long j3, int i) {
        if (C0027.m2460() > 0) {
            return C0387j2.o((List) obj, (C0387j2) obj2, j, j2, j3, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static List m3308(Object obj, int i, int i2) {
        if (C0037.m3837() < 0) {
            return ((List) obj).subList(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3309(Object obj) {
        if (C0078.m7450() >= 0) {
            return V1SchemeSigner.isJarEntryDigestNeededInManifest((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۧ, reason: not valid java name and contains not printable characters */
    public static int m3310(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((AtomicLongArray) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static Iterator m3311(Object obj) {
        if (C0026.m2298() < 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Comparator m3312() {
        if (C0027.m2460() >= 0) {
            return CentralDirectoryRecord.BY_LOCAL_FILE_HEADER_OFFSET_COMPARATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m3313() {
        if (C0037.m3837() <= 0) {
            return "NEWLINE";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m3314(Object obj, int i) {
        if (C0077.m7272() < 0) {
            ((BitSet) obj).set(i);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static long m3315(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((C1) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static String m3316() {
        if (C0016.m717() < 0) {
            return "Cipher.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static InputStream m3317(Object obj, Object obj2) {
        if (C0065.m4647() > 0) {
            return ((JarFile) obj).getInputStream((ZipEntry) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m3318() {
        if (C0024.m2011() < 0) {
            return "OpenSSLCipherRSA$OAEP$SHA512";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۡۦ, reason: not valid java name and contains not printable characters */
    public static View m3319(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((Z4) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String[] m3320(Object obj) {
        if (C0026.m2298() < 0) {
            return NativeCrypto.get_cipher_names((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m3321(Object obj) {
        if (C0036.m3653() < 0) {
            return ((ManifestParser.Attribute) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۡۤ, reason: not valid java name and contains not printable characters */
    public static long m3322(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((Date) obj).getTime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۧ۠, reason: not valid java name and contains not printable characters */
    public static String m3323() {
        if (C0070.m5903() > 0) {
            return "OpenSSLMac$HmacSHA384";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۨۨ, reason: not valid java name and contains not printable characters */
    public static void m3324(Object obj, float f, float f2, float f3, float f4, Object obj2) {
        if (C0020.m1385() <= 0) {
            ((android.graphics.Path) obj).addRect(f, f2, f3, f4, (Path.Direction) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static EditText m3325(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((DialogC0389j4) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static List m3326(Object obj) {
        if (C0034.m3450() > 0) {
            return ((V1SchemeVerifier.Result) obj).ignoredSigners;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m3327(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((C0324a0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static File m3328(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((File) obj).getParentFile();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int m3329(float f) {
        if (C0024.m2011() <= 0) {
            return Math.round(f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3331(Object obj, Object obj2) {
        if (C0018.m1064() > 0) {
            return ((Handler) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m3332(Object obj) {
        if (C0025.m2132() > 0) {
            return ((M4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧ, reason: not valid java name and contains not printable characters */
    public static String m3333(Object obj) {
        if (C0037.m3837() < 0) {
            return ((Field) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۦ۠, reason: not valid java name and contains not printable characters */
    public static View m3334(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((I1) obj).getHelpLayout();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۨۦ, reason: not valid java name and contains not printable characters */
    public static RunnablesExecutor m3335(Object obj) {
        if (C0019.m1311() == 0) {
            return ((V3SchemeVerifier) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static long m3336(Object obj, Object obj2) {
        if (C0037.m3837() < 0) {
            return ((Unsafe) obj).objectFieldOffset((Field) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static int m3337() {
        if (C0019.m1311() <= 0) {
            return w5.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۦ, reason: not valid java name and contains not printable characters */
    public static int m3338(Object obj) {
        if (C0073.m6356() <= 0) {
            return W4.a((ByteBuffer) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۥۣۧ, reason: not valid java name and contains not printable characters */
    public static String m3339(Object obj) {
        if (C0073.m6356() < 0) {
            return ((URI) obj).toASCIIString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۢۢ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m3340(Object obj, Object obj2) {
        if (C0073.m6356() <= 0) {
            return TypeAdapters.newFactory((Class) obj, (TypeAdapter) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥ۠, reason: not valid java name and contains not printable characters */
    public static SecretKeyFactory m3341(Object obj) {
        if (C0020.m1385() < 0) {
            return SecretKeyFactory.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨۨ, reason: not valid java name and contains not printable characters */
    public static int m3342(Object obj) {
        if (C0030.m2940() > 0) {
            return ((ViewOnClickListenerC0366g0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3343(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((File) obj).exists();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m3344(Object obj) {
        if (C0016.m717() < 0) {
            return ((V3SigningCertificateLineage.SigningCertificateNode) obj).signature;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ, reason: not valid java name and contains not printable characters */
    public static List m3345(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((CloudBean) obj).getPackageNameList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3346() {
        if (C0034.m3450() >= 0) {
            return ApkVerifier.Issue.V3_SIG_MALFORMED_SIGNATURE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۣ, reason: not valid java name and contains not printable characters */
    public static void m3347(Object obj) {
        if (C0029.m2791() >= 0) {
            ((Throwable) obj).printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۤۤۢۨ, reason: not valid java name and contains not printable characters */
    public static String m3348() {
        if (C0064.m4578() >= 0) {
            return "OpenSSLEvpCipherAES$AES$CBC$NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۡۤ, reason: not valid java name and contains not printable characters */
    public static List m3349(Object obj) {
        if (C0028.m2593() > 0) {
            return ((ApkVerifier.Result) obj).getSignerCertificates();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۢ۠, reason: not valid java name and contains not printable characters */
    public static void m3350(Object obj) {
        if (C0027.m2460() > 0) {
            ((AbstractC0416o1) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static SigningCertificateLineage.SignerConfig m3351(Object obj) {
        if (C0069.m5781() < 0) {
            return ((SigningCertificateLineage.Builder) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۡ۟, reason: contains not printable characters */
    public static String m3352(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((M4) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۠ۨ, reason: contains not printable characters */
    public static H m3353(Object obj) {
        if (C0016.m717() <= 0) {
            return ((L) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۣ, reason: contains not printable characters */
    public static double m3354(double d) {
        return C0016.m717() <= 0 ? Math.floor(d) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۥۤۤۤ, reason: contains not printable characters */
    public static byte[] m3355(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((MessageDigest) obj).digest();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟۟, reason: contains not printable characters */
    public static boolean m3356(Object obj, Object obj2) {
        if (C0065.m4647() >= 0) {
            return ((Vector) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۡۤ, reason: contains not printable characters */
    public static String m3357(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((p5) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣۤ, reason: contains not printable characters */
    public static int m3358() {
        return (-1755549) ^ C0032.m3236((Object) "ۨۦ۠");
    }

    /* JADX INFO: renamed from: ۥۥۨ۠, reason: contains not printable characters */
    public static WebView m3359(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((DialogC0403m0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۧۤ, reason: contains not printable characters */
    public static String m3360(Object obj) {
        if (C0068.m5678() > 0) {
            return C0036.m3720((DefaultApkSignerEngine.SignerConfig.Builder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۦۤ, reason: contains not printable characters */
    public static int m3361(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((V) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۟ۤۡ, reason: contains not printable characters */
    public static String m3362() {
        if (C0026.m2298() <= 0) {
            return "issuer";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۢۨ, reason: contains not printable characters */
    public static List m3363(Object obj, int i, int i2, boolean z) {
        if (C0076.m6903() <= 0) {
            return ApkSigningBlockUtils.getSignaturesToVerify((List) obj, i, i2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۢۤ, reason: contains not printable characters */
    public static V4Signature m3364(Object obj, Object obj2, Object obj3, long j) {
        if (C0077.m7272() < 0) {
            return V4SchemeSigner.a((V4SchemeSigner.SignerConfig) obj, (V4Signature.HashingInfo) obj2, (HashMap) obj3, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۦۧ, reason: contains not printable characters */
    public static void m3365(Object obj, int i, Object obj2) {
        if (C0069.m5781() < 0) {
            ((T) obj).c(i, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۢۦۢ, reason: contains not printable characters */
    public static void m3366(Object obj, Object obj2) {
        if (C0034.m3450() >= 0) {
            ((AutoClickBean) obj).setPlanContent((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۟۟, reason: not valid java name and contains not printable characters */
    public static L m3367() {
        if (C0066.m4827() >= 0) {
            return J.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static Date m3368(Object obj, Object obj2) {
        if (C0073.m6356() <= 0) {
            return ((KeyStore) obj).getCreationDate((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static ListView m3369(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((C0358f) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static CertificateExtensions m3370(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0026.m2298() < 0) {
            return O2.d((CertificateExtensions) obj, (CertificateExtensions) obj2, (ArrayList) obj3, (PublicKey) obj4, (PublicKey) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣۡ, reason: not valid java name and contains not printable characters */
    public static int m3371(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((R0) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۣۤ, reason: not valid java name and contains not printable characters */
    public static int m3372(Object obj) {
        if (C0036.m3653() < 0) {
            return ((Mac) obj).getMacLength();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧۦ۟, reason: not valid java name and contains not printable characters */
    public static String m3373() {
        if (C0063.m4427() >= 0) {
            return "Enter.key.password.for.alias.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m3374(Object obj) {
        if (C0076.m6903() < 0) {
            return ((C0361f2) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m3375(Object obj) {
        if (C0019.m1311() == 0) {
            return ((Throwable) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۢۦ, reason: not valid java name and contains not printable characters */
    public static List m3376(Object obj) {
        if (C0023.m1921() >= 0) {
            return C0028.m2604((ApkSigner.SignerConfig.Builder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ, reason: not valid java name and contains not printable characters */
    public static void m3377(Object obj, Object obj2, int i, int i2) throws IOException {
        if (C0073.m6356() < 0) {
            ((Writer) obj).write((String) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۦ, reason: not valid java name and contains not printable characters */
    public static int m3378(Object obj) {
        if (C0077.m7272() < 0) {
            return ((SigningCertificateLineage) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۦۢ, reason: not valid java name and contains not printable characters */
    public static long m3379(Object obj) {
        if (C0064.m4578() > 0) {
            return ((JsonReader) obj).nextLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨۤۨ, reason: not valid java name and contains not printable characters */
    public static Set m3380(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((SortedMap) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۧ۟, reason: not valid java name and contains not printable characters */
    public static String m3381() {
        if (C0021.m1598() < 0) {
            return "Enter.new.alias.name.RETURN.to.cancel.import.for.this.entry.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۨ, reason: not valid java name and contains not printable characters */
    public static AutoCompleteTextView m3382(Object obj) {
        if (C0026.m2298() < 0) {
            return ((C0351e) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static String m3330(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
