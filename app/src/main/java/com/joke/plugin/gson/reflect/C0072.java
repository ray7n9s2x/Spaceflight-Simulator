package com.joke.plugin.gson.reflect;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Environment;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.DynamicDrawableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
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
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.AlgorithmIdentifier;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.pkcs7.ContentInfo;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipSections;
import com.joke.basetoollib.C0063;
import com.joke.basetoollib.GsonUtils;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.bmJiasu.xhook.basic.NativeHandler;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.JsonArray;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.annotations.JsonAdapter;
import com.joke.plugin.gson.internal.LinkedTreeMap;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.DateTypeAdapter;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.bind.util.ISO8601Utils;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.zfork.entry.C0075;
import com.zfork.entry.MetaSelectAppAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.B3;
import com.zfork.multiplatforms.android.bomb.B4;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0358f;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0363f4;
import com.zfork.multiplatforms.android.bomb.C0365g;
import com.zfork.multiplatforms.android.bomb.C0382i3;
import com.zfork.multiplatforms.android.bomb.C0392k1;
import com.zfork.multiplatforms.android.bomb.C0398l1;
import com.zfork.multiplatforms.android.bomb.C0404m1;
import com.zfork.multiplatforms.android.bomb.C0408n;
import com.zfork.multiplatforms.android.bomb.C0412n3;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C5;
import com.zfork.multiplatforms.android.bomb.D3;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.E;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.F5;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.InterfaceC0477y3;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.P;
import com.zfork.multiplatforms.android.bomb.RunnableC0353e1;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.T3;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.V4;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0454u4;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0462w0;
import com.zfork.multiplatforms.android.bomb.W;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.u5;
import com.zfork.multiplatforms.android.bomb.y5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttributeView;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.conscrypt.C0111;
import org.w3c.dom.NamedNodeMap;

/* JADX INFO: renamed from: com.joke.plugin.gson.reflect.ۣۨۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0072 {

    /* JADX INFO: renamed from: ۠ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static int f210 = -16;

    /* JADX INFO: renamed from: ۟۟۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static long m6106(Object obj) {
        if (C0017.m846() > 0) {
            return ((LocalFileRecord) obj).getStartOffsetInArchive();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static MatchType m6107(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((B4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m6108(Object obj, Object obj2) {
        if (C0029.m2791() > 0) {
            return ((Map) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static FileVisitResult m6109() {
        if (C0026.m2298() < 0) {
            return C0064.m4548();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static byte m6110(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((u5) obj).a();
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static void m6111(Object obj) {
        if (C0078.m7450() >= 0) {
            ((Dialog) obj).hide();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6112(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((ApkSigner) obj).j;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6113(Object obj) {
        if (C0026.m2298() < 0) {
            return ((C5) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m6114(Object obj, Object obj2) {
        if (C0025.m2132() >= 0) {
            ((W) obj).g((ByteBuffer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m6115(Object obj) {
        if (C0070.m5903() > 0) {
            return ((F5) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6117() {
        if (C0032.m3184() <= 0) {
            return ApkVerifier.Issue.JAR_SIG_ZIP_ENTRY_DIGEST_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6118(Object obj, Object obj2) {
        if (C0111.m13165() <= 0) {
            return ((E1) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.Builder m6119(Object obj, Object obj2) {
        if (C0026.m2298() < 0) {
            return ((DefaultApkSignerEngine.Builder) obj).setSourceStampSigningCertificateLineage((SigningCertificateLineage) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static C0408n m6120() {
        if (C0030.m2940() > 0) {
            return o5.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static Thread m6121() {
        if (C0077.m7272() <= 0) {
            return Thread.currentThread();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static int m6122(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((B3) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۨ۟, reason: not valid java name and contains not printable characters */
    public static void m6123(Object obj, Object obj2) {
        if (C0027.m2460() >= 0) {
            ((Signature) obj).initVerify((PublicKey) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6124() {
        if (C0066.m4827() > 0) {
            return ApkVerifier.Issue.V3_SIG_POR_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static N2 m6125() {
        if (C0068.m5678() > 0) {
            return N2.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m6126(Object obj, int i) {
        if (C0017.m846() >= 0) {
            ((ViewGroup.MarginLayoutParams) obj).setMarginEnd(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۡۢۨ, reason: not valid java name and contains not printable characters */
    public static ActivityInfo m6127(Object obj) {
        if (C0025.m2132() > 0) {
            return ((ResolveInfo) obj).activityInfo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m6128(Object obj) {
        if (C0111.m13165() < 0) {
            return ((DefaultApkSignerEngine) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m6129() {
        if (C0029.m2791() > 0) {
            return System.nanoTime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static Drawable m6130(Object obj) {
        if (C0032.m3184() < 0) {
            return ((DynamicDrawableSpan) obj).getDrawable();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m6131(Object obj) throws IOException {
        if (C0033.m3358() < 0) {
            ((Reader) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6132(Object obj, Object obj2) {
        if (C0019.m1311() == 0) {
            return ((LinkedTreeMap) obj).containsKey(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥۤۨ, reason: not valid java name and contains not printable characters */
    public static void m6133(Object obj) {
        if (C0030.m2940() >= 0) {
            ((G0) obj).d();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨۤۨ, reason: not valid java name and contains not printable characters */
    public static FileAttributeView m6134(Object obj, Object obj2, Object obj3) {
        if (C0028.m2593() > 0) {
            return Files.getFileAttributeView((Path) obj, (Class) obj2, (LinkOption[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static NativeHandler m6135() {
        if (C0016.m717() <= 0) {
            return NativeHandler.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m6136(Object obj) {
        if (m6216() >= 0) {
            ((DialogC0421p0) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۤ, reason: not valid java name and contains not printable characters */
    public static char[] m6137(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((O2) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۤ, reason: not valid java name and contains not printable characters */
    public static int m6138(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((V4) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢۢ, reason: not valid java name and contains not printable characters */
    public static int[] m6139(Object obj) {
        if (m6216() > 0) {
            return ((C0361f2) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۧۤ, reason: not valid java name and contains not printable characters */
    public static String m6140() {
        if (C0028.m2593() > 0) {
            return "Alg.Alias.Signature.2.16.840.1.101.3.4.2.4with1.2.840.10045.2.1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static JsonArray m6141(Object obj) {
        if (C0021.m1598() < 0) {
            return ((JsonElement) obj).getAsJsonArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧۦ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m6142(Object obj, boolean z) {
        if (C0016.m717() < 0) {
            return ((ApkSigner.Builder) obj).setV2SigningEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6143(Object obj) {
        if (m6216() >= 0) {
            return ((Cursor) obj).moveToFirst();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨۨ, reason: not valid java name and contains not printable characters */
    public static ImageView m6144(Object obj) {
        if (C0025.m2132() > 0) {
            return ((C0363f4) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static View m6145(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((C0) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static long m6146(Object obj) {
        if (C0027.m2460() > 0) {
            return ((DataSource) obj).size();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6147() {
        if (C0027.m2460() > 0) {
            return ApkVerifier.Issue.JAR_SIG_ZIP_ENTRY_SIGNERS_MISMATCH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static byte m6148(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((Number) obj).byteValue();
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m6149(Object obj, Object obj2) {
        if (C0073.m6356() <= 0) {
            ApkVerifier.i((List) obj, (HashMap) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6150(Object obj, Object obj2) {
        if (C0031.m3075() >= 0) {
            return ((String) obj).endsWith((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static HashSet m6151(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((MetaSelectAppAbility) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m6152(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((U3) obj).u;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static C0392k1 m6153(Object obj) {
        if (C0020.m1385() < 0) {
            return ((C0398l1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static void m6154(Object obj, Object obj2) {
        if (C0031.m3075() >= 0) {
            C0017.m919(C0064.m4519((SourceStampVerifier.Result) obj), (SourceStampVerifier.Result.SignerInfo) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static D3 m6155(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0032.m3184() <= 0) {
            return ((O2) obj).O((KeyStore) obj2, (String) obj3, (char[]) obj4, (char[]) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۥۢ, reason: not valid java name and contains not printable characters */
    public static void m6156(Object obj, int i) throws IOException {
        if (C0075.m6893() >= 0) {
            ((OutputStream) obj).write(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۨ, reason: not valid java name and contains not printable characters */
    public static EditText m6157(Object obj) {
        if (C0017.m846() >= 0) {
            return ((DialogC0385j0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static int m6158(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((AutoClickPointerBean) obj).getSlideEndPointerX();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۡ, reason: not valid java name and contains not printable characters */
    public static void m6159(Object obj, Object obj2, Object obj3) {
        if (C0018.m1064() > 0) {
            ((O2) obj).J((InputStream) obj2, (PrintStream) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۤ۟, reason: not valid java name and contains not printable characters */
    public static String m6160(Object obj) {
        if (C0038.m4010() > 0) {
            return ((ContentInfo) obj).contentType;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static V4Signature.SigningInfos m6161(Object obj) {
        if (C0064.m4578() > 0) {
            return V4Signature.SigningInfos.fromByteArray((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6162(Object obj) {
        if (m6216() >= 0) {
            return ((C0382i3) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۧ, reason: not valid java name and contains not printable characters */
    public static char[] m6163(Object obj) {
        if (C0034.m3450() > 0) {
            return ((O2) obj).z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۢ, reason: not valid java name and contains not printable characters */
    public static long m6164(Object obj) {
        if (C0017.m846() >= 0) {
            return ((ZipSections) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static int m6165(Object obj) {
        if (C0065.m4647() > 0) {
            return ((M4) obj).q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6166() {
        if (C0068.m5678() >= 0) {
            return "<keystore>";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۦۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6167() {
        if (C0023.m1921() >= 0) {
            return ApkVerifier.Issue.JAR_SIG_UNSUPPORTED_SIG_ALG;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۨۨ, reason: not valid java name and contains not printable characters */
    public static long m6168(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((AbstractC0384j) obj).f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۧۥۣ, reason: not valid java name and contains not printable characters */
    public static void m6169(Object obj, int i) {
        if (C0074.m6454() <= 0) {
            ((AutoClickPointerBean) obj).setSlideEndPointerX(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۡۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6170() {
        if (C0036.m3653() <= 0) {
            return ApkVerifier.Issue.V4_SIG_VERIFY_EXCEPTION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static byte[] m6171(Object obj) {
        if (C0067.m5468() < 0) {
            return ((X509Certificate) obj).getSignature();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static int m6172(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((SourceStampVerifier.Result.SignerInfo) obj).getMaxSdkVersion();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m6173(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((C0357e5) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۤ, reason: not valid java name and contains not printable characters */
    public static TextView m6174(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((C0365g) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m6175() {
        if (C0067.m5468() < 0) {
            return "subject";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۢ, reason: not valid java name and contains not printable characters */
    public static Charset m6176(Object obj) {
        if (C0028.m2593() > 0) {
            return ((C0412n3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerCapabilities.Builder m6177(Object obj, boolean z) {
        if (C0075.m6893() >= 0) {
            return ((SigningCertificateLineage.SignerCapabilities.Builder) obj).setPermission(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۦ, reason: not valid java name and contains not printable characters */
    public static T3 m6178(Object obj) {
        if (C0024.m2011() < 0) {
            return ((U3) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerCapabilities m6179(Object obj, Object obj2) {
        if (C0028.m2593() > 0) {
            return ((SigningCertificateLineage) obj).getSignerCapabilities((SigningCertificateLineage.SignerConfig) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Pair m6180(Object obj, Object obj2, boolean z) {
        if (C0076.m6903() < 0) {
            return AlgorithmIdentifier.getSignerInfoSignatureAlgorithm((PublicKey) obj, (DigestAlgorithm) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static String m6181(Object obj) {
        if (C0020.m1385() < 0) {
            return ((M4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۦۧ, reason: not valid java name and contains not printable characters */
    public static DataSource m6182(Object obj, long j, long j2) {
        if (m6216() > 0) {
            return ((DataSource) obj).slice(j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m6183(int i, boolean z, int i2, Object obj) {
        if (C0026.m2298() < 0) {
            return C0024.m2042(i, z, i2, (byte[][]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static E m6184() {
        if (C0029.m2791() >= 0) {
            return E.j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m6185(String str) {
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
        for (int i3 = 0; i3 < length; i3++) {
            bArrM7297[i3] = (byte) (bArrM7297[i3] ^ C0077.m7212(strM29932, i3 % iM7380));
        }
        for (int iM73802 = 0; iM73802 < bArrM7297.length; iM73802 = C0078.m7380(C0031.m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۣ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static ContentDigestAlgorithm m6186(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((ApkSigningBlockUtils.VerityTreeAndDigest) obj).contentDigestAlgorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static ScriptProjectAliasBean m6187(Object obj) {
        if (C0065.m4647() > 0) {
            return ((ViewOnClickListenerC0454u4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m6188(Object obj) {
        if (C0026.m2298() < 0) {
            return ((ViewOnClickListenerC0462w0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static RunnablesExecutor m6189() {
        if (C0019.m1311() <= 0) {
            return RunnablesExecutor.MULTI_THREADED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Map m6190(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0037.m3837() < 0) {
            return ApkSigningBlockUtils.computeContentDigests((RunnablesExecutor) obj, (Set<ContentDigestAlgorithm>) obj2, (DataSource) obj3, (DataSource) obj4, (DataSource) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static Class m6191() {
        if (C0068.m5678() >= 0) {
            return Integer.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static Activity m6192(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((O1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m6193(Object obj, Object obj2) {
        if (C0031.m3075() >= 0) {
            ((y5) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۡۥۤ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m6194() {
        if (C0076.m6903() < 0) {
            return DateTypeAdapter.FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6195(Object obj, Object obj2) {
        if (C0021.m1598() <= 0) {
            return ((GuaranteedEncodedFormX509Certificate) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Type m6196(Object obj) {
        if (C0065.m4647() > 0) {
            return GsonUtils.getListType((Type) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static void m6197(Object obj, int i, int i2) {
        if (C0064.m4578() >= 0) {
            ((GradientDrawable) obj).setStroke(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۡۦۦۤ, reason: not valid java name and contains not printable characters */
    public static List m6198(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((AutoClickPlanBean) obj).getPointerViewList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m6199(Object obj, Object obj2) {
        if (C0030.m2940() >= 0) {
            ((C0444t0) obj).setOnCreatePlanListener((InterfaceC0477y3) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static void m6200(int i, Object obj) {
        if (C0071.m6069() >= 0) {
            AbstractC0406m3.t(i, (byte[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۢۢۨۢ, reason: not valid java name and contains not printable characters */
    public static int m6201(Object obj) {
        if (C0070.m5903() > 0) {
            return ((ProgressBar) obj).getProgress();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m6202(Object obj, boolean z) {
        if (C0021.m1598() < 0) {
            return ((NativeHandler) obj).refresh(z);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Class m6203(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((JsonAdapter) obj).value();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۤۢ, reason: not valid java name and contains not printable characters */
    public static String m6204() {
        if (C0016.m717() < 0) {
            return "Alg.Alias.Mac.HMAC-SHA384";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨ, reason: not valid java name and contains not printable characters */
    public static String m6205(Object obj) {
        if (C0066.m4827() > 0) {
            return O2.B((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۧۥ, reason: not valid java name and contains not printable characters */
    public static String m6206(Object obj, boolean z, Object obj2) {
        if (C0037.m3837() < 0) {
            return ISO8601Utils.format((Date) obj, z, (TimeZone) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m6207() {
        if (C0069.m5781() <= 0) {
            return Asn1Type.BOOLEAN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m6208(Object obj) {
        if (C0036.m3653() < 0) {
            ((ApkVerifier.Result) obj).k = true;
        }
    }

    /* JADX INFO: renamed from: ۤۢۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m6209(Object obj) {
        if (C0027.m2460() >= 0) {
            return AbstractC0406m3.c(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۧۦ, reason: not valid java name and contains not printable characters */
    public static void m6210(Object obj) {
        if (C0029.m2791() > 0) {
            ((SharedPreferences.Editor) obj).apply();
        }
    }

    /* JADX INFO: renamed from: ۤۦۦۢ, reason: not valid java name and contains not printable characters */
    public static ApkSigner.Builder m6211(Object obj, Object obj2) {
        if (C0017.m846() > 0) {
            return ((ApkSigner.Builder) obj).setSigningCertificateLineage((SigningCertificateLineage) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۡۤ, reason: not valid java name and contains not printable characters */
    public static int m6212(Object obj) {
        if (C0064.m4578() > 0) {
            return ((View) obj).getId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Result m6213(Object obj, Object obj2) {
        if (C0027.m2460() > 0) {
            return ((ApkVerifier) obj).k((DataSource) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۢ۟, reason: contains not printable characters */
    public static byte[] m6214(Object obj) {
        if (C0030.m2940() > 0) {
            return Asn1DerEncoder.encode(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۨ۠, reason: contains not printable characters */
    public static String m6215() {
        if (C0076.m6903() < 0) {
            return "Alg.Alias.Mac.HMAC-SHA224";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۟, reason: contains not printable characters */
    public static int m6216() {
        return 1754744 ^ C0032.m3236((Object) "ۧۨۥ");
    }

    /* JADX INFO: renamed from: ۥۤ۠ۥ, reason: contains not printable characters */
    public static ByteOrder m6217() {
        if (m6216() > 0) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦ۟ۢ, reason: contains not printable characters */
    public static void m6218(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0074.m6454() < 0) {
            ((SpannableString) obj).setSpan(obj2, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۥۧۧ۟, reason: contains not printable characters */
    public static String m6219(Object obj) {
        if (C0032.m3184() <= 0) {
            return Arrays.toString((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠۟ۨ, reason: contains not printable characters */
    public static ArrayList m6220(Object obj) {
        if (C0064.m4578() > 0) {
            return ((ApkSigningBlockUtils.Result) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ۟ۤ, reason: contains not printable characters */
    public static byte[] m6221(Object obj) {
        if (C0036.m3653() < 0) {
            return ((ManifestParser) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۨ, reason: contains not printable characters */
    public static C0358f m6222(Object obj) {
        if (C0076.m6903() < 0) {
            return C0358f.a((LayoutInflater) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۤۧ, reason: contains not printable characters */
    public static C0479z m6223(Object obj) {
        if (C0037.m3837() < 0) {
            return ((A5) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۧ۟, reason: contains not printable characters */
    public static boolean m6224(Object obj) {
        if (C0020.m1385() <= 0) {
            return AbstractC0406m3.r((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۥ, reason: contains not printable characters */
    public static KeyPairGenerator m6225(Object obj, Object obj2) {
        if (C0019.m1311() <= 0) {
            return KeyPairGenerator.getInstance((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static int m6226(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((NamedNodeMap) obj).getLength();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥ۠۟, reason: contains not printable characters */
    public static P m6227(Object obj) {
        if (C0035.m3569() < 0) {
            return ((T1) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۡ۠, reason: contains not printable characters */
    public static Character m6228(char c) {
        if (C0026.m2298() < 0) {
            return Character.valueOf(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۨ, reason: contains not printable characters */
    public static void m6229(Object obj, Object obj2, Object obj3) {
        if (C0038.m4010() > 0) {
            ((ContentValues) obj).put((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m6230(Object obj) {
        if (C0028.m2593() >= 0) {
            return Array.getLength(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static Point m6231(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((DialogC0373h0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥۣ, reason: not valid java name and contains not printable characters */
    public static int m6232(Object obj) {
        if (C0078.m7450() > 0) {
            return ((RunnableC0353e1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m6233() {
        if (C0016.m717() < 0) {
            return Environment.DIRECTORY_DOWNLOADS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m6234(Object obj, Object obj2) {
        if (C0069.m5781() < 0) {
            ((Throwable) obj).addSuppressed((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static SecurityManager m6235() {
        if (C0028.m2593() > 0) {
            return System.getSecurityManager();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static long m6236() {
        if (C0074.m6454() <= 0) {
            return SystemClock.uptimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۢۥۣ, reason: not valid java name and contains not printable characters */
    public static long m6237(Object obj) {
        if (C0017.m846() >= 0) {
            return ((C0404m1) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۥۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m6238(Object obj) {
        if (C0033.m3358() < 0) {
            return ((D3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۦۣ, reason: not valid java name and contains not printable characters */
    public static void m6239(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            ((AbsSeekBar) obj).setThumb((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m6116(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
