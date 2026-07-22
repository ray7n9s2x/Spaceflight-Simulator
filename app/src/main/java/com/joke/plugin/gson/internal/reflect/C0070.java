package com.joke.plugin.gson.internal.reflect;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.KeyConfig;
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
import com.android.apksig.internal.apk.stamp.V2SourceStampSigner;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1Tagging;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestWriter;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
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
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.bmJiasu.xhook.call.a;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonObject;
import com.joke.plugin.gson.JsonParser;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptActionBean;
import com.joke.script.bean.ScriptProjectBean;
import com.joke.script.bean.ScriptTouchBean;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0372h;
import com.zfork.multiplatforms.android.bomb.AbstractC0416o1;
import com.zfork.multiplatforms.android.bomb.AbstractC0449u;
import com.zfork.multiplatforms.android.bomb.B1;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0344d;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0358f;
import com.zfork.multiplatforms.android.bomb.C0381i2;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0402m;
import com.zfork.multiplatforms.android.bomb.C0408n;
import com.zfork.multiplatforms.android.bomb.C0439s1;
import com.zfork.multiplatforms.android.bomb.C0443t;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0448t4;
import com.zfork.multiplatforms.android.bomb.DialogC0472x4;
import com.zfork.multiplatforms.android.bomb.F3;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.O0;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0480z0;
import com.zfork.multiplatforms.android.bomb.i5;
import com.zfork.multiplatforms.android.bomb.j5;
import com.zfork.multiplatforms.android.bomb.o5;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedMap;
import java.util.jar.Attributes;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.conscrypt.C0111;
import sun.security.pkcs.PKCS10;
import sun.security.x509.X509CertImpl;

/* JADX INFO: renamed from: com.joke.plugin.gson.internal.reflect.ۣ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0070 {

    /* JADX INFO: renamed from: ۟ۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean f207 = true;

    /* JADX INFO: renamed from: ۣ۟۟۠۟, reason: not valid java name and contains not printable characters */
    public static PosixFilePermission m5837() {
        if (C0039.m4109() > 0) {
            return C0021.m1533();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5838(Object obj, Object obj2) {
        if (C0024.m2011() <= 0) {
            return ((String) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5839(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((Class) obj).isLocalClass();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static long m5840(Object obj) {
        if (C0072.m6216() > 0) {
            return AndroidBinXmlParser.access$200((ByteBuffer) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static PublicKey m5841(Object obj) {
        if (C0029.m2791() > 0) {
            return ((PKCS10) obj).getSubjectPublicKeyInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5842(Object obj) {
        if (C0064.m4578() > 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).getSignerTargetsDevRelease();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m5843() {
        if (C0025.m2132() >= 0) {
            return "NO";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static void m5844(Object obj, float f) {
        if (C0073.m6356() < 0) {
            ((AutoClickPointerBean) obj).setCurrPhoneY(f);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static N2[] m5845() {
        if (C0075.m6893() > 0) {
            return N2.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤۥ, reason: not valid java name and contains not printable characters */
    public static V4Signature.SigningInfoBlock[] m5846(Object obj) {
        if (m5903() >= 0) {
            return ((V4Signature.SigningInfos) obj).signingInfoBlocks;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static long m5847(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((ApkSignerInfo) obj).timestamp;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5848(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((BerDataValue) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۤۦۥ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.SignerConfig m5849(Object obj) {
        if (C0016.m717() <= 0) {
            return ((V2SourceStampSigner) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۟۠, reason: not valid java name and contains not printable characters */
    public static long m5850(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((BasicFileAttributes) obj).size();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5851(Object obj, Object obj2, long j) {
        if (C0026.m2298() < 0) {
            return ((Handler) obj).sendMessageDelayed((Message) obj2, j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m5852(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0018.m1064() > 0) {
            ((Logger) obj).log((Level) obj2, (String) obj3, (Object[]) obj4);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static Long m5853(long j) {
        if (C0072.m6216() >= 0) {
            return Long.valueOf(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥۨ, reason: not valid java name and contains not printable characters */
    public static DialogC0448t4 m5854(Object obj) {
        if (C0039.m4109() > 0) {
            return ((C0381i2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static CheckBox m5855(Object obj) {
        if (C0016.m717() <= 0) {
            return ((C0351e) obj).t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۡ, reason: not valid java name and contains not printable characters */
    public static void m5856(Object obj, Object obj2) throws InvalidAlgorithmParameterException {
        if (C0038.m4010() >= 0) {
            ((Signature) obj).setParameter((AlgorithmParameterSpec) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۡۢ, reason: not valid java name and contains not printable characters */
    public static Button m5857(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((C0358f) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟۠, reason: not valid java name and contains not printable characters */
    public static int m5858(Object obj) {
        if (C0026.m2298() < 0) {
            return ((DialogC0448t4) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۢ, reason: not valid java name and contains not printable characters */
    public static Handler m5859(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((a) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤۤ, reason: not valid java name and contains not printable characters */
    public static Type m5860(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((TypeToken) obj).getType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static int m5861(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((Runtime) obj).availableProcessors();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨۤۧ, reason: not valid java name and contains not printable characters */
    public static MatchType m5862() {
        if (C0031.m3075() >= 0) {
            return MatchType.PERFECT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦۡ, reason: not valid java name and contains not printable characters */
    public static SortedMap m5863(Object obj) {
        if (C0067.m5468() <= 0) {
            return ManifestWriter.getAttributesSortedByName((Attributes) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static CharsetDecoder m5864(Object obj, Object obj2) {
        if (C0071.m6069() > 0) {
            return ((CharsetDecoder) obj).onMalformedInput((CodingErrorAction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static KeySpec m5865(Object obj, Object obj2, Object obj3) {
        if (C0017.m846() >= 0) {
            return ((KeyFactory) obj).getKeySpec((Key) obj2, (Class) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static Class m5866() {
        if (C0073.m6356() < 0) {
            return AbstractC0372h.a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5867(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((ZipSections) obj).getZipEndOfCentralDirectory();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static Cursor m5868(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0018.m1064() >= 0) {
            return ((ContentResolver) obj).query((Uri) obj2, (String[]) obj3, (String) obj4, (String[]) obj5, (String) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static String m5869() {
        if (C0027.m2460() >= 0) {
            return "AESCMAC";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5870(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static KeyConfig m5871(Object obj) {
        if (C0067.m5468() < 0) {
            return ((SigningCertificateLineage.SignerConfig) obj).getKeyConfig();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m5872(Object obj, int i) {
        if (C0032.m3184() <= 0) {
            ((MotionEvent) obj).setSource(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5873(Object obj, Object obj2) {
        if (C0027.m2460() > 0) {
            return ((C0439s1) obj).b((Path) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static ImageView m5874(Object obj) {
        if (C0039.m4109() > 0) {
            return ((C0) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۨۨ, reason: not valid java name and contains not printable characters */
    public static String m5875(Object obj) {
        if (C0077.m7272() < 0) {
            return ((Key) obj).getAlgorithm();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m5876(Object obj) {
        if (C0021.m1598() < 0) {
            return ((DialogC0389j4) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5877() {
        if (C0025.m2132() >= 0) {
            return ApkVerifier.Issue.V2_SIG_VERIFY_EXCEPTION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m5878(Object obj) {
        if (C0027.m2460() >= 0) {
            ((K0) obj).e();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۧۦ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m5879() {
        if (C0028.m2593() > 0) {
            return Asn1Type.OBJECT_IDENTIFIER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m5880(Object obj) {
        if (C0018.m1064() >= 0) {
            AbstractC0449u.k((String[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۡ, reason: not valid java name and contains not printable characters */
    public static int m5881(Object obj) {
        if (C0027.m2460() > 0) {
            return ((C0408n) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5882(Object obj) {
        if (C0026.m2298() < 0) {
            return ((C0357e5) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۤ۠, reason: not valid java name and contains not printable characters */
    public static void m5883(Object obj, int i, int i2) {
        if (C0064.m4578() >= 0) {
            ((Calendar) obj).add(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۡ, reason: not valid java name and contains not printable characters */
    public static void m5884(Object obj, Object obj2) {
        if (C0037.m3837() <= 0) {
            ((View) obj).setOnTouchListener((View.OnTouchListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۨۧ, reason: not valid java name and contains not printable characters */
    public static void m5885(Object obj, Object obj2, Object obj3) throws NoSuchAlgorithmException, IOException, CertificateException {
        if (C0038.m4010() >= 0) {
            ((KeyStore) obj).load((InputStream) obj2, (char[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static Object m5886(Object obj) {
        if (C0072.m6216() > 0) {
            return ((ViewOnClickListenerC0480z0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.Builder m5887(Object obj, Object obj2) {
        if (C0030.m2940() > 0) {
            return ((SigningCertificateLineage.Builder) obj).setNewCapabilities((SigningCertificateLineage.SignerCapabilities) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static ApkSignerEngine.InspectJarEntryRequest m5888(Object obj) {
        if (C0017.m846() > 0) {
            return ((ApkSignerEngine.InputJarEntryInstructions) obj).getInspectJarEntryRequest();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m5889(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((V4Signature) obj).hashingInfo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m5890() {
        if (C0031.m3075() >= 0) {
            return "key";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m5891() {
        if (C0034.m3450() > 0) {
            return "mykey";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۢ, reason: not valid java name and contains not printable characters */
    public static int m5892(int i, Object obj) {
        if (C0071.m6069() > 0) {
            return C0387j2.n(i, (byte[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m5893() {
        if (C0034.m3450() >= 0) {
            return "subject.dname";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static void m5894(Object obj, Object obj2, int i, int i2) throws IOException {
        if (C0068.m5678() > 0) {
            ((PushbackInputStream) obj).unread((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5895() {
        if (C0028.m2593() >= 0) {
            return ApkVerifier.Issue.JAR_SIG_MISSING_APK_SIG_REFERENCED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m5896(Object obj) {
        if (C0026.m2298() <= 0) {
            ((C0387j2) obj).f();
        }
    }

    /* JADX INFO: renamed from: ۠ۥۦ۟, reason: not valid java name and contains not printable characters */
    public static Map m5897() {
        if (C0032.m3184() < 0) {
            return Collections.emptyMap();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۨ۠, reason: not valid java name and contains not printable characters */
    public static O0 m5898(Object obj) {
        if (C0072.m6216() > 0) {
            return ((G0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۥۦ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5899(Object obj, byte b) {
        if (C0032.m3184() < 0) {
            return ((ByteBuffer) obj).put(b);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static int m5900(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((ApkSigner.SignerConfig) obj).getMinSdkVersion();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m5901(Object obj, Object obj2) {
        if (C0035.m3569() < 0) {
            return ((X509CertImpl) obj).get((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static C0351e m5902(Object obj) {
        if (C0077.m7272() < 0) {
            return ((ConsumerAbility) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۦ۟, reason: not valid java name and contains not printable characters */
    public static int m5903() {
        return 1751767 ^ C0032.m3236((Object) "ۤۦ۟");
    }

    /* JADX INFO: renamed from: ۡۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m5904(Object obj, Object obj2, Object obj3) {
        if (C0067.m5468() < 0) {
            ((JsonObject) obj).add((String) obj2, (JsonElement) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m5905(Object obj) {
        if (C0038.m4010() > 0) {
            return ((V3SchemeVerifier) obj).h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡۦۧ, reason: not valid java name and contains not printable characters */
    public static DocumentBuilder m5906(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((DocumentBuilderFactory) obj).newDocumentBuilder();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۢۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5907(Object obj) {
        if (C0037.m3837() < 0) {
            return ((ApkSigningBlockUtils.Result) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۥۤ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m5908(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0072.m6216() < 0) {
            return null;
        }
        SigningCertificateLineage.SignerConfig signerConfig = (SigningCertificateLineage.SignerConfig) obj;
        return C0019.m1221(C0111.m13082(new SigningCertificateLineage(new ArrayList(), i), signerConfig, (SigningCertificateLineage.SignerCapabilities) obj2), signerConfig, (SigningCertificateLineage.SignerConfig) obj3, (SigningCertificateLineage.SignerCapabilities) obj4);
    }

    /* JADX INFO: renamed from: ۢۥۨ۟, reason: not valid java name and contains not printable characters */
    public static ScriptProjectBean m5909(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((DialogC0472x4) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m5910(Object obj) {
        if (C0027.m2460() > 0) {
            return ((SourceStampVerifier.Builder) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۦۧ, reason: not valid java name and contains not printable characters */
    public static V4Signature.HashingInfo m5911(Object obj) {
        if (C0065.m4647() >= 0) {
            return V4Signature.HashingInfo.fromByteArray((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5912() {
        if (C0063.m4427() > 0) {
            return ApkVerifier.Issue.V4_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m5913() {
        if (C0025.m2132() > 0) {
            return "<server[:port]>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5914(Object obj) {
        if (C0026.m2298() <= 0) {
            return C0443t.a((C0443t) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m5915() {
        if (C0020.m1385() < 0) {
            return "OpenSSLMac$HmacSHA512";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۡ۠, reason: not valid java name and contains not printable characters */
    public static void m5916(Object obj, float f, float f2, float f3, float f4, Object obj2) {
        if (C0073.m6356() < 0) {
            ((Canvas) obj).drawLine(f, f2, f3, f4, (Paint) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۨۡ, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m5917(Object obj) {
        if (C0071.m6069() > 0) {
            return ((C0444t0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static Button m5918(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((C0344d) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5919(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((DefaultApkSignerEngine.Builder) obj).r;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۦۧ, reason: not valid java name and contains not printable characters */
    public static Stream m5920(Object obj, Object obj2) {
        if (C0039.m4109() > 0) {
            return ((Stream) obj).sorted((Comparator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m5921(Object obj, int i) {
        if (C0069.m5781() < 0) {
            ((ByteArrayOutputStream) obj).write(i);
        }
    }

    /* JADX INFO: renamed from: ۣۤۤ, reason: not valid java name and contains not printable characters */
    public static BigInteger m5922(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((JsonElement) obj).getAsBigInteger();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤ۠, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m5923() {
        if (C0071.m6069() > 0) {
            return TypeAdapters.JSON_ELEMENT_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m5924(Object obj, Object obj2, Object obj3) {
        if (C0031.m3075() >= 0) {
            return ((Method) obj).invoke(obj2, (Object[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۥ۠, reason: not valid java name and contains not printable characters */
    public static String m5925(Object obj, Object obj2) {
        if (C0031.m3075() >= 0) {
            return ((DateFormat) obj).format((Date) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۡۥ, reason: not valid java name and contains not printable characters */
    public static String m5926() {
        if (C0071.m6069() > 0) {
            return "\n";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۧۤ, reason: not valid java name and contains not printable characters */
    public static float m5927(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((B1) obj).d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static Asn1Tagging m5928() {
        if (C0069.m5781() < 0) {
            return Asn1Tagging.IMPLICIT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۥ۠, reason: contains not printable characters */
    public static String m5929() {
        if (C0066.m4827() > 0) {
            return "STARNN";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦ۠ۡ, reason: contains not printable characters */
    public static Intent m5930(Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            return Intent.createChooser((Intent) obj, (CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۥۢ, reason: contains not printable characters */
    public static void m5931(Object obj, Object obj2, int i) {
        if (C0077.m7272() < 0) {
            ((BaseBundle) obj).putInt((String) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۤۥ, reason: contains not printable characters */
    public static String m5932(String str) {
        String strM2993 = C0031.m2993();
        String strM29932 = C0031.m2993();
        for (int i = 0; i < 15; i++) {
            strM2993 = C0077.m7301(C0030.m2967(C0030.m2967(new StringBuffer(), strM2993), C0021.m1651(i)));
            strM29932 = C0077.m7301(C0027.m2461(C0030.m2967(new StringBuffer(), strM29932), ((int) (C0038.m3986() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0078.m7380(str) / 2);
        for (int i2 = 0; i2 < C0078.m7380(str); i2 += 2) {
            m5921(byteArrayOutputStream, (C0024.m2051(strM2993, C0077.m7212(str, i2)) << 4) | C0024.m2051(strM2993, C0077.m7212(str, i2 + 1)));
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

    /* JADX INFO: renamed from: ۦۡ۟۠, reason: contains not printable characters */
    public static Throwable m5933(Object obj, Object obj2) {
        if (C0028.m2593() > 0) {
            return ((Throwable) obj).initCause((Throwable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۢ, reason: contains not printable characters */
    public static void m5934(Object obj, Object obj2) {
        if (C0017.m846() > 0) {
            ((PrintStream) obj).println(obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۥۤۧ, reason: contains not printable characters */
    public static I1 m5935(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((O1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣ۠, reason: contains not printable characters */
    public static JsonElement m5936(Object obj) {
        if (C0025.m2132() > 0) {
            return JsonParser.parseReader((JsonReader) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۡۦ, reason: contains not printable characters */
    public static void m5937(Object obj, Object obj2) {
        if (C0021.m1598() < 0) {
            C0017.m919(C0038.m4019((ApkVerifier.Result) obj), (X509Certificate) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m5938() {
        if (C0036.m3653() <= 0) {
            return "getSelfCert: ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m5939(Object obj) {
        if (C0034.m3450() > 0) {
            return ((ScriptTouchBean) obj).interval;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m5940(Object obj) {
        if (C0028.m2593() > 0) {
            return ((Random) obj).nextInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m5941(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((MatchType) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۨۨ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m5943() {
        if (C0067.m5468() <= 0) {
            return ApkVerifier.Issue.V3_SIG_NO_CERTIFICATES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5944(Object obj, Object obj2) {
        if (C0034.m3450() >= 0) {
            return o5.a((Context) obj, (Uri) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static C0402m m5945() {
        if (C0035.m3569() <= 0) {
            return C0402m.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5946(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((F3) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧۥۤ, reason: not valid java name and contains not printable characters */
    public static Intent m5947(Object obj, Object obj2) {
        if (C0078.m7450() > 0) {
            return ((Intent) obj).setAction((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۦۧ, reason: not valid java name and contains not printable characters */
    public static V2SourceStampSigner m5948(Object obj) {
        if (C0067.m5468() < 0) {
            return ((V2SourceStampSigner.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۦۧ, reason: not valid java name and contains not printable characters */
    public static Type[] m5949(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((WildcardType) obj).getLowerBounds();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static byte[] m5950(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((AbstractC0416o1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static List m5951(Object obj) {
        if (C0037.m3837() < 0) {
            return ApkSigningBlockUtils.getApkSignatureBlocks((DataSource) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m5952() {
        if (C0077.m7272() < 0) {
            return "extensions";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m5953() {
        if (C0073.m6356() <= 0) {
            return TypeAdapters.LOCALE_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۠۟, reason: not valid java name and contains not printable characters */
    public static void m5954(Object obj, Object obj2) {
        if (C0039.m4109() >= 0) {
            ((Context) obj).startActivity((Intent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۡۡ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m5955(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((ScriptActionBean) obj).pointList;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۨۨ, reason: not valid java name and contains not printable characters */
    public static D5 m5956(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((A5) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۤ, reason: not valid java name and contains not printable characters */
    public static i5 m5957() {
        if (C0076.m6903() < 0) {
            return j5.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m5958(Object obj, Object obj2) {
        if (C0076.m6903() < 0) {
            Arrays.fill((Object[]) obj, obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۨۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5959(Object obj, Object obj2, Object obj3) {
        if (C0016.m717() < 0) {
            return ((View.OnTouchListener) obj).onTouch((View) obj2, (MotionEvent) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۨۡۧ, reason: not valid java name and contains not printable characters */
    public static long m5960(Object obj) {
        if (C0064.m4578() > 0) {
            return ((File) obj).length();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۢۦۡ, reason: not valid java name and contains not printable characters */
    public static String m5942(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
