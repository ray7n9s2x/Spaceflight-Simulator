package com.joke.plugin.gson.internal.bind.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigResult;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.SignatureInfo;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4SchemeSigner;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1Class;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.pkcs7.IssuerAndSerialNumber;
import com.android.apksig.internal.pkcs7.SignerIdentifier;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.C$Gson$Types;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.JsonTreeReader;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptMatchBean;
import com.joke.script.bean.ScriptRecordBean;
import com.joke.script.bean.ScriptRecordType;
import com.zfork.entry.C0075;
import com.zfork.entry.MetaSelectAppAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0426q;
import com.zfork.multiplatforms.android.bomb.C0430q3;
import com.zfork.multiplatforms.android.bomb.C0443t;
import com.zfork.multiplatforms.android.bomb.C0456v0;
import com.zfork.multiplatforms.android.bomb.C0460v4;
import com.zfork.multiplatforms.android.bomb.C0483z3;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.DialogC0331b0;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.DialogC0448t4;
import com.zfork.multiplatforms.android.bomb.DialogC0472x4;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.G5;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.InterfaceC0466w4;
import com.zfork.multiplatforms.android.bomb.J2;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.P2;
import com.zfork.multiplatforms.android.bomb.Q4;
import com.zfork.multiplatforms.android.bomb.RunnableC0367g1;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.V4;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0368g2;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0484z4;
import com.zfork.multiplatforms.android.bomb.l5;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.s5;
import dalvik.system.DexFile;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.nio.charset.CharsetDecoder;
import java.security.cert.X509Certificate;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.C0111;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.joke.plugin.gson.internal.bind.util.۟ۡ۠ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0067 {

    /* JADX INFO: renamed from: ۣۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f203;

    /* JADX INFO: renamed from: ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m5404(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((JsonTreeReader) obj).nextName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static List m5405(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((ApkVerifier.Result.V4SchemeSignerInfo) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static int m5406(Object obj, Object obj2, int i, int i2) {
        if (C0021.m1598() <= 0) {
            return ((RandomAccessFile) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static void m5407(Object obj, Object obj2, int i, int i2) {
        if (C0029.m2791() >= 0) {
            ((C0430q3) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static void m5408(Object obj, Object obj2, int i, int i2) {
        if (C0023.m1921() >= 0) {
            ((ByteArrayOutputStream) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۡۨ, reason: not valid java name and contains not printable characters */
    public static void m5409(Object obj, Object obj2, Object obj3) {
        if (C0036.m3653() <= 0) {
            C0017.m919(C0075.m6891((V1SchemeVerifier.Result) obj), new ApkVerifier.IssueWithParams((ApkVerifier.Issue) obj2, (Object[]) obj3));
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5410(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((SignatureInfo) obj).signatureBlock;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m5411(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((CentralDirectoryRecord) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static List m5412(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((C4) obj).J;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static ImageView m5413(Object obj) {
        if (C0071.m6069() > 0) {
            return ((C0460v4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static SignatureAlgorithm m5414() {
        if (C0029.m2791() > 0) {
            return SignatureAlgorithm.RSA_PKCS1_V1_5_WITH_SHA256;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m5415(Object obj, int i) {
        if (C0019.m1311() == 0) {
            return ((ApkSigner.Builder) obj).setLibraryPageAlignmentBytes(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5416(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((ApkSigResult) obj).verified;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m5417(Object obj, long j) {
        if (C0027.m2460() >= 0) {
            ZipUtils.setZipEocdCentralDirectoryOffset((ByteBuffer) obj, j);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟۠, reason: not valid java name and contains not printable characters */
    public static void m5419(Object obj, int i, int i2, int i3, int i4) {
        if (C0068.m5678() > 0) {
            ((Rect) obj).set(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static Object m5420(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            return ((HashMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m5421(Object obj, int i) {
        if (C0034.m3450() > 0) {
            return Arrays.copyOf((Object[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static List m5422(Object obj) {
        if (C0018.m1064() > 0) {
            return ((ApkSigningBlockUtils.Result) obj).getWarnings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5423(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((E5) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static String m5424() {
        if (C0111.m13165() < 0) {
            return "SHA256withECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦۤ, reason: not valid java name and contains not printable characters */
    public static void m5425(Object obj) {
        if (C0070.m5903() > 0) {
            ((HashMap) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۢۤ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m5426() {
        if (C0069.m5781() <= 0) {
            return Asn1Type.BIT_STRING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static ManifestParser.Section m5427(Object obj) {
        if (C0063.m4427() > 0) {
            return ((ManifestParser) obj).readSection();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m5428(Object obj) {
        if (C0028.m2593() > 0) {
            return ((ViewOnClickListenerC0368g2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧۢ, reason: not valid java name and contains not printable characters */
    public static String m5429() {
        if (C0038.m4010() >= 0) {
            return "AES_128/CBC/PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۤۨ, reason: not valid java name and contains not printable characters */
    public static Pair m5430(Object obj, int i) {
        if (C0066.m4827() >= 0) {
            return ZipUtils.a((DataSource) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m5431(Object obj) {
        if (m5468() <= 0) {
            return ((DialogC0373h0) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static Context m5432(Object obj) {
        if (C0069.m5781() < 0) {
            return ((C0456v0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static Class m5433(Object obj) {
        if (C0028.m2593() > 0) {
            return ((Field) obj).getDeclaringClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static Class m5434() {
        if (C0019.m1311() == 0) {
            return Byte.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static N2 m5435() {
        if (C0037.m3837() < 0) {
            return N2.i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥ۟, reason: not valid java name and contains not printable characters */
    public static WildcardType m5436(Object obj) {
        if (C0078.m7450() >= 0) {
            return C$Gson$Types.subtypeOf((Type) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ScriptRecordType m5437() {
        if (C0028.m2593() >= 0) {
            return ScriptRecordType.SWIPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦۥ, reason: not valid java name and contains not printable characters */
    public static Type m5438(Object obj, Object obj2, Object obj3) {
        if (C0023.m1921() >= 0) {
            return C$Gson$Types.getGenericSupertype((Type) obj, (Class) obj2, (Class) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۧ۠, reason: not valid java name and contains not printable characters */
    public static ScriptMatchBean m5439(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((ScriptRecordBean) obj).scriptMatchBean;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠۟, reason: not valid java name and contains not printable characters */
    public static EnumMap m5440(Object obj, Object obj2, Object obj3) {
        if (C0074.m6454() < 0) {
            return ApkVerifier.f((List) obj, (DataSource) obj2, (ApkUtils.ZipSections) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m5441(Object obj) {
        if (C0037.m3837() < 0) {
            return o5.g((Exception) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m5442(Object obj, Object obj2) {
        if (C0026.m2298() < 0) {
            ((View.OnClickListener) obj).onClick((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static Object m5443(Object obj, Object obj2) {
        if (C0020.m1385() <= 0) {
            return ((Field) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m5444(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((V4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5445(Object obj) {
        if (C0027.m2460() >= 0) {
            return ApkVerifier.containsLineageErrors((ApkVerifier.Result) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5446(Object obj) {
        if (C0018.m1064() > 0) {
            return V1SchemeVerifier.Result.SignerInfo.access$600((V1SchemeVerifier.Result.SignerInfo) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۤ, reason: not valid java name and contains not printable characters */
    public static SecretKey m5447(Object obj, Object obj2) {
        if (C0066.m4827() >= 0) {
            return ((SecretKeyFactory) obj).generateSecret((KeySpec) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧۡ, reason: not valid java name and contains not printable characters */
    public static Class m5448(Object obj, Object obj2, Object obj3) {
        if (C0064.m4578() > 0) {
            return ((DexFile) obj).loadClass((String) obj2, (ClassLoader) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m5449(Object obj) {
        if (C0030.m2940() > 0) {
            return ((s5) obj).i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0466w4 m5450(Object obj) {
        if (C0023.m1921() > 0) {
            return ((DialogC0472x4) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static String m5451() {
        if (C0037.m3837() <= 0) {
            return o5.g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۤ, reason: not valid java name and contains not printable characters */
    public static CharsetDecoder m5452(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            return ((CharsetDecoder) obj).replaceWith((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۡۢ, reason: not valid java name and contains not printable characters */
    public static int m5453(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((Rect) obj).top;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5454() {
        if (C0021.m1598() <= 0) {
            return ApkVerifier.Issue.V3_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۥ, reason: not valid java name and contains not printable characters */
    public static void m5455(Object obj) {
        if (C0034.m3450() >= 0) {
            ((Canvas) obj).restore();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۡ, reason: not valid java name and contains not printable characters */
    public static Object m5456(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((RunnableC0367g1) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡ۟, reason: not valid java name and contains not printable characters */
    public static DataSource m5457(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((ApkVerifier) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5458(Object obj) {
        if (C0032.m3184() < 0) {
            return ((SignatureInfo) obj).eocd;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static void m5459(Object obj, Object obj2) {
        if (C0024.m2011() <= 0) {
            J2.a((Application) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5460(Object obj) {
        if (C0072.m6216() > 0) {
            return ((T1) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨۡۡ, reason: not valid java name and contains not printable characters */
    public static void m5461(Object obj, Object obj2, Object obj3) {
        if (C0035.m3569() < 0) {
            ((C0483z3) obj).d((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m5462() {
        if (C0018.m1064() >= 0) {
            return "algorithmID.algorithm";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5463(Object obj) {
        if (C0076.m6903() < 0) {
            return ApkSigningBlockUtils.getLengthPrefixedSlice((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m5464(Object obj) {
        if (C0027.m2460() > 0) {
            return ((C0357e5) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۨ, reason: not valid java name and contains not printable characters */
    public static CharBuffer m5465(Object obj, Object obj2) {
        if (C0074.m6454() < 0) {
            return ((CharBuffer) obj).get((char[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۦ, reason: not valid java name and contains not printable characters */
    public static String m5466() {
        if (C0075.m6893() >= 0) {
            return l5.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m5467(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((ApkVerifier.Result.V3SchemeSignerInfo) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۥۡ, reason: not valid java name and contains not printable characters */
    public static int m5468() {
        return (-1747696) ^ C0032.m3236((Object) "۠۠ۨ");
    }

    /* JADX INFO: renamed from: ۟ۦۧۧ۠, reason: not valid java name and contains not printable characters */
    public static int m5469(Object obj) {
        if (C0016.m717() < 0) {
            return ((ApkSigningBlockUtils.SignerConfig) obj).minSdkVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static View m5470(Object obj, Object obj2, int i) {
        if (C0030.m2940() > 0) {
            return ((DialogC0331b0) obj).b((Activity) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡ۟, reason: not valid java name and contains not printable characters */
    public static int m5471(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((AutoClickPointerBean) obj).getPointerY();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨۧۥ, reason: not valid java name and contains not printable characters */
    public static String m5472(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((C0443t) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m5473(Object obj) {
        if (C0072.m6216() > 0) {
            return ((ApkSigner.Builder) obj).k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۢۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5474(Object obj) {
        if (C0018.m1064() > 0) {
            return ((ApkSigner.Builder) obj).t;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۥۦ۠, reason: not valid java name and contains not printable characters */
    public static IssuerAndSerialNumber m5475(Object obj) {
        if (C0031.m3075() > 0) {
            return ((SignerIdentifier) obj).issuerAndSerialNumber;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤۡ, reason: not valid java name and contains not printable characters */
    public static int m5476(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((TimeZone) obj).getRawOffset();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static int m5477(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((C0426q) obj).h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۦ, reason: not valid java name and contains not printable characters */
    public static File[] m5478(Object obj, Object obj2) {
        if (C0027.m2460() >= 0) {
            return ((File) obj).listFiles((FilenameFilter) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۡ, reason: not valid java name and contains not printable characters */
    public static int m5479(Object obj, int i) {
        if (C0029.m2791() >= 0) {
            return ZipUtils.getUnsignedInt16((ByteBuffer) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static int[] m5480(int i) {
        if (C0021.m1598() <= 0) {
            return K3.t(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m5481(Object obj, Object obj2, Object obj3) {
        if (C0039.m4109() > 0) {
            ApkSigner.a((DataSource) obj, (LocalFileRecord) obj2, (ApkSignerEngine.InspectJarEntryRequest) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5482(Object obj, int i, int i2) {
        if (C0078.m7450() >= 0) {
            return ByteBuffer.wrap((byte[]) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5483() {
        if (C0075.m6893() > 0) {
            return ApkVerifier.Issue.V2_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static void m5484(Object obj, Object obj2) {
        if (C0018.m1064() >= 0) {
            V4Signature.writeBytes((OutputStream) obj, (byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m5485(Object obj, int i) {
        if (C0019.m1311() == 0) {
            ((TextView) obj).setHintTextColor(i);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static RandomAccessFile m5486(Object obj) {
        if (C0032.m3184() < 0) {
            return ((G5) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۥۧ, reason: not valid java name and contains not printable characters */
    public static int m5487(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((s5) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5488() {
        if (C0018.m1064() > 0) {
            return ApkVerifier.Issue.JAR_SIG_UNPROTECTED_ZIP_ENTRY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۤ, reason: not valid java name and contains not printable characters */
    public static Button m5489(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((DialogC0421p0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۥۨ, reason: not valid java name and contains not printable characters */
    public static String m5490(Object obj) {
        if (C0018.m1064() > 0) {
            return ((StringWriter) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5491(Object obj) {
        if (C0072.m6216() > 0) {
            return ((Class) obj).isAnonymousClass();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨۤۦ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Builder m5492(Object obj, int i) {
        if (C0024.m2011() <= 0) {
            return ((ApkVerifier.Builder) obj).setMinCheckedPlatformVersion(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static LinearLayout m5493(Object obj) {
        if (C0016.m717() <= 0) {
            return ((I1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5494() {
        if (C0033.m3358() <= 0) {
            return ApkVerifier.Issue.MALFORMED_APK;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5495(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((ApkSigner) obj).m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m5496(Object obj, Object obj2) {
        if (C0073.m6356() >= 0) {
            return null;
        }
        return C0016.m653(C0030.m2835((String) obj), (byte[]) obj2);
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5497(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((BerDataValue) obj).getEncodedContents();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ, reason: not valid java name and contains not printable characters */
    public static void m5498(Object obj, Object obj2) {
        if (C0075.m6893() >= 0) {
            C0017.m919(C0028.m2612((SourceStampVerifier.Result) obj), (SourceStampVerifier.Result.SignerInfo) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۦۨ, reason: not valid java name and contains not printable characters */
    public static ContentDigestAlgorithm m5499() {
        if (C0027.m2460() > 0) {
            return ContentDigestAlgorithm.CHUNKED_SHA256;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m5500(Object obj, Object obj2) {
        if (C0033.m3358() < 0) {
            return ((View) obj).dispatchTouchEvent((MotionEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۨۤ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m5501(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((I1) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠, reason: not valid java name and contains not printable characters */
    public static String m5502(Object obj, Object obj2, Object obj3) {
        if (C0016.m717() <= 0) {
            return ((JSONObject) obj).optString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static V4Signature.SigningInfo m5503(Object obj, Object obj2, Object obj3, long j) {
        if (C0065.m4647() >= 0) {
            return V4SchemeSigner.b((ApkSigningBlockUtils.SignerConfig) obj, (V4Signature.HashingInfo) obj2, (byte[]) obj3, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5504(Object obj, Object obj2) {
        if (C0065.m4647() >= 0) {
            return ((ArrayList) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۧۥۣ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5505(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((SigningCertificateLineage) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int m5506(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((SourceStampVerifier.Builder) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۢۥۢ, reason: contains not printable characters */
    public static void m5507(Object obj, Object obj2) {
        if (C0019.m1311() == 0) {
            ((AutoClickPlanBean) obj).addPointerView((T1) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢۧۢ, reason: contains not printable characters */
    public static void m5508(int i) {
        if (C0023.m1921() >= 0) {
            System.exit(i);
        }
    }

    /* JADX INFO: renamed from: ۥۥۧ۠, reason: contains not printable characters */
    public static String m5509(String str) {
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

    /* JADX INFO: renamed from: ۦ۟ۥ, reason: contains not printable characters */
    public static ByteBuffer m5510(Object obj, Object obj2) {
        if (m5468() <= 0) {
            return ((ByteBuffer) obj).put((ByteBuffer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۧۥ, reason: contains not printable characters */
    public static int m5511(Object obj, int i) {
        if (C0035.m3569() < 0) {
            return ((ByteBuffer) obj).getInt(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۡۧ, reason: contains not printable characters */
    public static void m5512(Object obj, Object obj2, Object obj3) {
        if (C0031.m3075() >= 0) {
            ((SigningCertificateLineage) obj).updateSignerCapabilities((SigningCertificateLineage.SignerConfig) obj2, (SigningCertificateLineage.SignerCapabilities) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦ۠ۢۢ, reason: contains not printable characters */
    public static IntBuffer m5513(Object obj) {
        if (C0020.m1385() < 0) {
            return ((ByteBuffer) obj).asIntBuffer();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۦ۠, reason: contains not printable characters */
    public static long m5514(Object obj) {
        if (C0016.m717() <= 0) {
            return ((Q4) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۤۨۢ, reason: contains not printable characters */
    public static SecretKey m5515(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((KeyGenerator) obj).generateKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۟ۤ, reason: contains not printable characters */
    public static WindowManager.LayoutParams m5516(Object obj) {
        if (C0039.m4109() > 0) {
            return ((Window) obj).getAttributes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۠ۦ, reason: contains not printable characters */
    public static C4 m5517(Object obj) {
        if (C0069.m5781() < 0) {
            return ((ViewOnClickListenerC0484z4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ۟ۨ, reason: contains not printable characters */
    public static int m5518(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((ManifestParser.Section) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Type[] m5519(Object obj) {
        if (C0025.m2132() > 0) {
            return ((Class) obj).getGenericInterfaces();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static void m5520(Object obj, Object obj2) {
        if (C0016.m717() < 0) {
            ((ScrollView) obj).addView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۧۢۢ, reason: not valid java name and contains not printable characters */
    public static Date m5521(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((Calendar) obj).getTime();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m5522(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            ((MetaSelectAppAbility) obj).b((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m5523(Object obj, float f, float f2) {
        if (C0071.m6069() > 0) {
            ((TextView) obj).setLineSpacing(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۣۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m5524(Object obj) {
        if (C0037.m3837() < 0) {
            return ((Asn1Class) obj).type();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static P2 m5525(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((E5) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5526() {
        if (C0066.m4827() >= 0) {
            return ApkVerifier.Issue.V3_SIG_MALFORMED_SIGNERS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۤ, reason: not valid java name and contains not printable characters */
    public static long m5527(Object obj) {
        if (C0021.m1598() <= 0) {
            return Asn1BerParser.access$300((ByteBuffer) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static X500Principal m5528(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((X509Certificate) obj).getIssuerX500Principal();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۤۢ, reason: not valid java name and contains not printable characters */
    public static ImageView m5529(Object obj) {
        if (C0038.m4010() > 0) {
            return ((DialogC0448t4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static String m5418(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
