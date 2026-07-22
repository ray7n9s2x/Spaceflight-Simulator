package com.android.apksig.internal.apk.stamp;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerificationIssue;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.pkcs7.ContentInfo;
import com.android.apksig.internal.pkcs7.IssuerAndSerialNumber;
import com.android.apksig.internal.util.ByteBufferDataSource;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.InclusiveIntRange;
import com.android.apksig.internal.util.RandomAccessFileDataSink;
import com.android.apksig.internal.util.X509CertificateUtils;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.ExclusionStrategy;
import com.joke.plugin.gson.FieldAttributes;
import com.joke.plugin.gson.JsonObject;
import com.joke.plugin.gson.internal.C$Gson$Types;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TimeTypeAdapter;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.script.bean.C0074;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptRecordType;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0416o1;
import com.zfork.multiplatforms.android.bomb.AbstractC0435r3;
import com.zfork.multiplatforms.android.bomb.B2;
import com.zfork.multiplatforms.android.bomb.B3;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0451u1;
import com.zfork.multiplatforms.android.bomb.C0483z3;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0331b0;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.F;
import com.zfork.multiplatforms.android.bomb.F5;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.InterfaceC0395k4;
import com.zfork.multiplatforms.android.bomb.InterfaceC0401l4;
import com.zfork.multiplatforms.android.bomb.J1;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.L2;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.N3;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.P0;
import com.zfork.multiplatforms.android.bomb.P1;
import com.zfork.multiplatforms.android.bomb.Q3;
import com.zfork.multiplatforms.android.bomb.Q4;
import com.zfork.multiplatforms.android.bomb.R0;
import com.zfork.multiplatforms.android.bomb.RunnableC0360f1;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.V0;
import com.zfork.multiplatforms.android.bomb.V4;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0480z0;
import com.zfork.multiplatforms.android.bomb.Y;
import j$.util.OptionalInt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.sql.Time;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.zip.Inflater;
import org.conscrypt.C0111;
import sun.security.x509.AlgorithmId;

/* JADX INFO: renamed from: com.android.apksig.internal.apk.stamp.ۢۦۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0018 {

    /* JADX INFO: renamed from: ۦ۟ۡۢ, reason: contains not printable characters */
    public static boolean f59;

    /* JADX INFO: renamed from: ۟۟۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m954() {
        if (C0111.m13165() <= 0) {
            return "Alg.Alias.Signature.OID.1.2.840.10045.4.3.1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m955(Object obj) {
        if (C0016.m717() < 0) {
            return ((V4Signature.SigningInfoBlock) obj).blockId;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m956(Object obj) {
        if (C0036.m3653() < 0) {
            return ((C0350d5) obj).f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۦۡ۠, reason: not valid java name and contains not printable characters */
    public static List m957(Object obj) {
        if (C0077.m7272() <= 0) {
            return C0065.m4778((ApkVerifier.Result.V4SchemeSignerInfo) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۢ۟, reason: not valid java name and contains not printable characters */
    public static Throwable m958(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((InvocationTargetException) obj).getCause();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۥ۠, reason: not valid java name and contains not printable characters */
    public static N2 m959() {
        if (C0024.m2011() < 0) {
            return N2.n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۦ۠, reason: not valid java name and contains not printable characters */
    public static int m960(Object obj) {
        if (C0016.m717() < 0) {
            return ((DefaultApkSignerEngine) obj).m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m961(Object obj, long j) {
        if (C0017.m846() > 0) {
            return ((ByteBuffer) obj).putLong(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m962(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((ApkSigner) obj).k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static String m963() {
        if (C0028.m2593() > 0) {
            return "Alg.Alias.Mac.HMAC/SHA256";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m964(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((RunnableC0360f1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static LayoutInflater m965(Object obj) {
        if (C0070.m5903() > 0) {
            return ((Activity) obj).getLayoutInflater();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static DataSource m966(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((V3SchemeSigner.Builder) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static URL m967(Object obj) {
        if (C0070.m5903() > 0) {
            return ((URI) obj).toURL();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static List m968() {
        if (C0036.m3653() <= 0) {
            return AbstractC0435r3.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static Asn1OpaqueObject m969(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((ContentInfo) obj).content;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static Type m970(Object obj) {
        if (C0028.m2593() > 0) {
            return TypeToken.getSuperclassTypeParameter((Class) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static List m971(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((V1SchemeVerifier.Result.SignerInfo) obj).getErrors();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static E1 m972(Object obj, Object obj2) {
        if (C0077.m7272() <= 0) {
            return AbstractC0406m3.k((D5) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۤۥ, reason: not valid java name and contains not printable characters */
    public static void m973(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0075.m6893() > 0) {
            ((C0483z3) obj).a((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۤ۟, reason: not valid java name and contains not printable characters */
    public static String m974(Object obj, Object obj2) {
        if (C0031.m3075() > 0) {
            return ((String) obj).toLowerCase((Locale) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m975() {
        if (C0027.m2460() >= 0) {
            return "Alg.Alias.Cipher.AES/CBC/PKCS7Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static Date m976(Object obj) {
        if (C0032.m3184() < 0) {
            return O2.z((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m977(Object obj) {
        if (C0073.m6356() < 0) {
            return C0066.m4794((ApkVerifier.Result.V3SchemeSignerInfo) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m978(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((DefaultApkSignerEngine) obj).s;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static V4 m979(Object obj, Object obj2) {
        if (C0025.m2132() > 0) {
            return ((Y) obj).h((V4) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static String m980() {
        if (C0069.m5781() < 0) {
            return "Alg.Alias.Cipher.RC4";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m981(Object obj, Object obj2) {
        if (C0078.m7450() >= 0) {
            return C$Gson$Types.equal(obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Level m982() {
        if (C0028.m2593() >= 0) {
            return Level.WARNING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۤ, reason: not valid java name and contains not printable characters */
    public static FrameLayout m983(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((C0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static Object m984(Object obj, Object obj2) {
        if (C0070.m5903() > 0) {
            return ((V0) obj).c((Q3) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠۟, reason: not valid java name and contains not printable characters */
    public static int m985(Object obj, Object obj2) {
        if (C0064.m4578() > 0) {
            return ((FileChannel) obj).write((ByteBuffer) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢ۟, reason: not valid java name and contains not printable characters */
    public static MatchType m986() {
        if (C0039.m4109() > 0) {
            return MatchType.CONTAIN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۧ۟, reason: not valid java name and contains not printable characters */
    public static void m987(Object obj, Object obj2) {
        if (C0066.m4827() > 0) {
            ((AutoClickPlanBean) obj).setPlanName((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m988(Object obj) {
        if (C0078.m7450() >= 0) {
            ((C0361f2) obj).n();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m989(Object obj, int i, Object obj2) {
        if (C0075.m6893() > 0) {
            ((InterfaceC0401l4) obj).c(i, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۦۢ, reason: not valid java name and contains not printable characters */
    public static void m990(Object obj) {
        if (C0072.m6216() >= 0) {
            C$Gson$Types.checkNotPrimitive((Type) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m991(Object obj) {
        if (C0028.m2593() > 0) {
            return ((DefaultApkSignerEngine) obj).w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۦ, reason: not valid java name and contains not printable characters */
    public static int m992(Object obj) {
        if (C0028.m2593() > 0) {
            return ((CentralDirectoryRecord) obj).getLastModificationTime();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static Object m993(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((ViewOnClickListenerC0480z0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static GenericArrayType m994(Object obj) {
        if (C0070.m5903() > 0) {
            return C$Gson$Types.arrayOf((Type) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static String m995() {
        if (C0035.m3569() <= 0) {
            return "<id:reason>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m996(Object obj) {
        if (C0037.m3837() <= 0) {
            return SigningCertificateLineage.readFromDataSource((DataSource) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static ContentDigestAlgorithm m997() {
        if (C0074.m6454() <= 0) {
            return ContentDigestAlgorithm.VERITY_CHUNKED_SHA256;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static EditText m998(Object obj) {
        if (C0063.m4427() > 0) {
            return ((DialogC0385j0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۨ, reason: not valid java name and contains not printable characters */
    public static int m999(Object obj, Object obj2, int i) {
        if (C0078.m7450() > 0) {
            return ((BaseBundle) obj).getInt((String) obj2, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static List m1000(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((ApkVerifier.Result.SourceStampInfo) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m1001(Object obj) {
        if (C0038.m4010() > 0) {
            return ((Y) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static long m1002(Object obj) {
        if (C0072.m6216() > 0) {
            return ((FileChannel) obj).size();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۡ۟۟, reason: not valid java name and contains not printable characters */
    public static Resources m1003(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((View) obj).getResources();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.Builder m1004(Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            return ((SigningCertificateLineage.Builder) obj).setOriginalCapabilities((SigningCertificateLineage.SignerCapabilities) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static String m1005(Object obj, Object obj2) {
        if (C0023.m1921() >= 0) {
            return ((String) obj).toUpperCase((Locale) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۨۧ, reason: not valid java name and contains not printable characters */
    public static String m1006(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((File) obj).getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m1007(Object obj, long j, int i) {
        if (C0066.m4827() > 0) {
            return ((ByteBufferDataSource) obj).getByteBuffer(j, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۨ, reason: not valid java name and contains not printable characters */
    public static String m1008() {
        if (C0077.m7272() < 0) {
            return "EC";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۧ, reason: not valid java name and contains not printable characters */
    public static void m1009(Object obj, Object obj2, int i, int i2) {
        if (C0031.m3075() >= 0) {
            ((Inflater) obj).setInput((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static void m1010(Object obj, float f, float f2) {
        if (C0067.m5468() < 0) {
            ((Path) obj).moveTo(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m1011(Object obj) {
        if (C0016.m717() < 0) {
            return Asn1BerParser.access$500((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۤ, reason: not valid java name and contains not printable characters */
    public static Object m1012(Object obj) {
        if (m1064() > 0) {
            return ((DialogC0331b0) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m1013(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((PopupWindow) obj).getHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static C0350d5 m1014(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((C0357e5) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۥۣ, reason: not valid java name and contains not printable characters */
    public static WindowManager.LayoutParams m1015(Object obj) {
        if (C0063.m4427() > 0) {
            return ((G0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۢ, reason: not valid java name and contains not printable characters */
    public static BigInteger m1016(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((IssuerAndSerialNumber) obj).certificateSerialNumber;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۦ, reason: not valid java name and contains not printable characters */
    public static Looper m1017(Object obj) {
        if (C0029.m2791() > 0) {
            return ((HandlerThread) obj).getLooper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۤ, reason: not valid java name and contains not printable characters */
    public static void m1018(Object obj, Object obj2) {
        if (C0027.m2460() >= 0) {
            ((K0) obj).setSpeedChangeListener((P0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۡۦ, reason: not valid java name and contains not printable characters */
    public static void m1019(Object obj, long j, long j2, Object obj2) {
        if (C0065.m4647() > 0) {
            ((DataSource) obj).feed(j, j2, (DataSink) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1020(Object obj) {
        if (C0026.m2298() < 0) {
            return ((R0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠۠, reason: not valid java name and contains not printable characters */
    public static LinearLayout m1021(Object obj) {
        if (C0033.m3358() < 0) {
            return ((DialogC0421p0) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤۡ, reason: not valid java name and contains not printable characters */
    public static Set m1022(Object obj, Object obj2) {
        if (C0029.m2791() > 0) {
            return Files.getPosixFilePermissions((java.nio.file.Path) obj, (LinkOption[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۤ, reason: not valid java name and contains not printable characters */
    public static X509Certificate m1023(Object obj) {
        if (C0023.m1921() > 0) {
            return ((ApkVerifier.Result.SourceStampInfo) obj).getCertificate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۧ, reason: not valid java name and contains not printable characters */
    public static int m1024(Object obj) {
        if (C0038.m4010() > 0) {
            return ((ApkVerificationIssue) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۡ, reason: not valid java name and contains not printable characters */
    public static String m1025(Object obj) {
        if (C0111.m13165() < 0) {
            return ((File) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣ۠, reason: not valid java name and contains not printable characters */
    public static TextView m1026(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((P1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static N3 m1027(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((A5) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m1028(Object obj) {
        if (C0066.m4827() > 0) {
            return ((C0361f2) obj).D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.SignerConfig m1029(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((ApkSigner.Builder) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static String m1030() {
        if (C0016.m717() <= 0) {
            return "Alg.Alias.Signature.SHA512/ECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۧۧ, reason: not valid java name and contains not printable characters */
    public static EditText m1031(Object obj) {
        if (C0036.m3653() < 0) {
            return ((DialogC0421p0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۤ, reason: not valid java name and contains not printable characters */
    public static String m1032(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((B3) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static void m1033() {
        if (C0039.m4109() >= 0) {
            C0021.m1529();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m1034(Object obj, boolean z) {
        if (C0020.m1385() < 0) {
            ((C0361f2) obj).f(z);
        }
    }

    /* JADX INFO: renamed from: ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.Builder m1035(Object obj, boolean z) {
        if (C0068.m5678() > 0) {
            return ((DefaultApkSignerEngine.Builder) obj).setV2SigningEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static RandomAccessFile m1036(Object obj) {
        if (m1064() >= 0) {
            return ((RandomAccessFileDataSink) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1037(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((HandlerThread) obj).quitSafely();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨ, reason: not valid java name and contains not printable characters */
    public static ScriptRecordType[] m1038() {
        if (C0038.m4010() > 0) {
            return ScriptRecordType.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1039() {
        if (C0068.m5678() > 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_SIGNATURE_BLOCK_WITHOUT_CERT_DIGEST;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1040(Object obj, Object obj2) {
        if (C0066.m4827() > 0) {
            return ((Set) obj).retainAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢۧۦ, reason: not valid java name and contains not printable characters */
    public static void m1041(Object obj, boolean z) {
        if (C0076.m6903() <= 0) {
            ((InterfaceC0395k4) obj).c(z);
        }
    }

    /* JADX INFO: renamed from: ۡۤۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1042(Object obj) {
        if (C0017.m846() > 0) {
            return ((ApkSigner.Builder) obj).j;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦۦۣ, reason: not valid java name and contains not printable characters */
    public static Activity m1043(Object obj) {
        if (C0019.m1311() == 0) {
            return ((J1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۧۢ, reason: not valid java name and contains not printable characters */
    public static int m1044(Object obj) {
        if (C0038.m4010() > 0) {
            return ((Q4) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int m1045(Object obj) {
        if (C0019.m1311() == 0) {
            return ((Paint.FontMetricsInt) obj).ascent;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢۤۡ, reason: not valid java name and contains not printable characters */
    public static Time m1046(Object obj, Object obj2) {
        if (C0035.m3569() < 0) {
            return ((TimeTypeAdapter) obj).read2((JsonReader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣ۠, reason: not valid java name and contains not printable characters */
    public static Float m1047(float f) {
        if (C0029.m2791() > 0) {
            return Float.valueOf(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣۦ, reason: not valid java name and contains not printable characters */
    public static String m1048(String str) {
        String strM2993 = C0031.m2993();
        String strM29932 = C0031.m2993();
        for (int i = 0; i < 15; i++) {
            strM2993 = C0077.m7301(C0030.m2967(C0030.m2967(new StringBuffer(), strM2993), C0021.m1651(i)));
            strM29932 = C0077.m7301(C0027.m2461(C0030.m2967(new StringBuffer(), strM29932), ((int) (C0038.m3986() * ((double) 10))) ^ i));
        }
        while (C0078.m7380(strM2993) > 0) {
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
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static AlgorithmId m1049(Object obj) {
        if (C0076.m6903() <= 0) {
            return AlgorithmId.getAlgorithmId((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۧۦ, reason: not valid java name and contains not printable characters */
    public static void m1050(Object obj) {
        if (C0111.m13165() <= 0) {
            ((F5) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static void m1051(Object obj, int i, int i2, boolean z) {
        if (C0071.m6069() >= 0) {
            ((T1) obj).d(i, i2, z);
        }
    }

    /* JADX INFO: renamed from: ۣۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1052(Object obj) {
        if (C0067.m5468() < 0) {
            return ((O2) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1053(Object obj) {
        if (C0032.m3184() < 0) {
            return ((C0350d5) obj).d();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦۣ۠, reason: not valid java name and contains not printable characters */
    public static CertificateFactory m1054() {
        if (C0066.m4827() >= 0) {
            return X509CertificateUtils.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1055(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((View) obj).isSelected();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m1056() {
        if (C0031.m3075() >= 0) {
            return "Alg.Alias.Signature.OID.1.2.840.10045.4.3.4";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m1057(Object obj, int i, Object obj2) {
        if (C0033.m3358() < 0) {
            ((KeyPairGenerator) obj).initialize(i, (SecureRandom) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Uri m1058(Object obj) {
        if (C0076.m6903() <= 0) {
            return Uri.parse((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m1059(Object obj) {
        if (C0032.m3184() <= 0) {
            return F.b((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۥ۟, reason: not valid java name and contains not printable characters */
    public static String m1060(Object obj, Object obj2) {
        if (C0111.m13165() <= 0) {
            return ((B3) obj).d((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۧۤ, reason: not valid java name and contains not printable characters */
    public static String m1061() {
        if (C0039.m4109() >= 0) {
            return "SHA256withRSA/PSS";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۢۡ, reason: not valid java name and contains not printable characters */
    public static ListIterator m1062(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((List) obj).listIterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۥۢ, reason: not valid java name and contains not printable characters */
    public static Uri m1063(Object obj) {
        if (C0071.m6069() > 0) {
            return ((ConsumerAbility) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m1064() {
        return 56429 ^ C0032.m3236((Object) "ۢۢ");
    }

    /* JADX INFO: renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public static Boolean m1065() {
        if (C0074.m6454() <= 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤ۠, reason: contains not printable characters */
    public static Iterator m1066(Object obj) {
        if (C0038.m4010() > 0) {
            return ((AbstractCollection) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۢۨ, reason: contains not printable characters */
    public static void m1067(Object obj) {
        if (C0027.m2460() >= 0) {
            ((MessageDigest) obj).reset();
        }
    }

    /* JADX INFO: renamed from: ۥۥۨۨ, reason: contains not printable characters */
    public static boolean m1068(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((C0350d5) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۢ۟, reason: contains not printable characters */
    public static Charset m1069() {
        if (C0068.m5678() > 0) {
            return StandardCharsets.UTF_8;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۤۧ, reason: contains not printable characters */
    public static Looper m1071(Object obj) {
        if (C0021.m1598() < 0) {
            return ((Context) obj).getMainLooper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۨ۟, reason: contains not printable characters */
    public static long m1072(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((CentralDirectoryRecord) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۡۧ۟, reason: contains not printable characters */
    public static OptionalInt m1073(Object obj) {
        if (C0016.m717() < 0) {
            return ((V3SchemeVerifier.Builder) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۧۤ, reason: contains not printable characters */
    public static void m1074(Object obj) {
        if (C0034.m3450() >= 0) {
            ((G0) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۦۡۨۤ, reason: contains not printable characters */
    public static StringBuilder m1075(Object obj, float f) {
        if (C0020.m1385() <= 0) {
            return ((StringBuilder) obj).append(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۧ, reason: contains not printable characters */
    public static boolean m1076(Object obj, float f, float f2) {
        if (C0037.m3837() < 0) {
            return ((Matrix) obj).postTranslate(f, f2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۦ, reason: contains not printable characters */
    public static String m1077(Object obj) {
        if (C0030.m2940() > 0) {
            return ((JsonReader) obj).nextName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۠ۦ, reason: contains not printable characters */
    public static int m1078(Object obj, Object obj2, int i, int i2) {
        if (C0065.m4647() > 0) {
            return ((AbstractC0416o1) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۢۡ, reason: contains not printable characters */
    public static boolean[] m1079(Object obj) {
        if (C0065.m4647() > 0) {
            return ((L2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static Paint m1080(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((U3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۠۟, reason: not valid java name and contains not printable characters */
    public static int m1081(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((B2) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static Uri m1082(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((T2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1083(Object obj, Object obj2) {
        if (C0026.m2298() <= 0) {
            return Files.isDirectory((java.nio.file.Path) obj, (LinkOption[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۨۥ, reason: not valid java name and contains not printable characters */
    public static int m1084(Object obj) {
        if (C0078.m7450() > 0) {
            return ((ArrayList) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧۢ۠, reason: not valid java name and contains not printable characters */
    public static byte m1085(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((V4Signature.HashingInfo) obj).log2BlockSize;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۧۧۤۥ, reason: not valid java name and contains not printable characters */
    public static Set m1086(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((JsonObject) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۨۦ, reason: not valid java name and contains not printable characters */
    public static long m1087(Object obj) {
        if (C0078.m7450() > 0) {
            return ((BigInteger) obj).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m1088(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((C0451u1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1089(Object obj, Object obj2) {
        if (C0066.m4827() > 0) {
            return ((ExclusionStrategy) obj).shouldSkipField((FieldAttributes) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static void m1090(Object obj, Object obj2) {
        if (C0030.m2940() >= 0) {
            C0017.m919(C0063.m4317((SourceStampVerifier.Result) obj), (SourceStampVerifier.Result.SignerInfo) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m1091(Object obj, Object obj2, Object obj3) throws IllegalAccessException {
        if (C0031.m3075() > 0) {
            ((Field) obj).set(obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m1092(Object obj, int i) {
        if (m1064() >= 0) {
            return ((ArrayList) obj).remove(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۣۣ, reason: not valid java name and contains not printable characters */
    public static InclusiveIntRange m1093(int i, int i2) {
        if (C0017.m846() >= 0) {
            return InclusiveIntRange.fromTo(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۥ, reason: contains not printable characters */
    public static String m1070(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
