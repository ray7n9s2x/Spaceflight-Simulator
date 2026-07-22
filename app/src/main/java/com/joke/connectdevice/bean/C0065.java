package com.joke.connectdevice.bean;

import android.app.Activity;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.KeyConfig;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.ChainedDataSource;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.basetoollib.GsonUtils;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.bmJiasu.xhook.call.a;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.UnsafeAllocator;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.ObjectTypeAdapter;
import com.joke.plugin.gson.internal.bind.TypeAdapters;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptMatchBean;
import com.joke.script.bean.ScriptProjectBean;
import com.joke.script.bean.ScriptRecordType;
import com.joke.script.bean.ScriptTouchBean;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0342c4;
import com.zfork.multiplatforms.android.bomb.AbstractC0356e4;
import com.zfork.multiplatforms.android.bomb.AbstractC0390k;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0324a0;
import com.zfork.multiplatforms.android.bomb.C0330b;
import com.zfork.multiplatforms.android.bomb.C0348d3;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0369g3;
import com.zfork.multiplatforms.android.bomb.C0381i2;
import com.zfork.multiplatforms.android.bomb.C0408n;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.C5;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0421p0;
import com.zfork.multiplatforms.android.bomb.DialogInterfaceOnClickListenerC0374h1;
import com.zfork.multiplatforms.android.bomb.E;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.F3;
import com.zfork.multiplatforms.android.bomb.G;
import com.zfork.multiplatforms.android.bomb.H1;
import com.zfork.multiplatforms.android.bomb.H3;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.J3;
import com.zfork.multiplatforms.android.bomb.K;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.M3;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N;
import com.zfork.multiplatforms.android.bomb.N1;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.P;
import com.zfork.multiplatforms.android.bomb.Q0;
import com.zfork.multiplatforms.android.bomb.Q4;
import com.zfork.multiplatforms.android.bomb.R3;
import com.zfork.multiplatforms.android.bomb.RunnableC0367g1;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.W;
import com.zfork.multiplatforms.android.bomb.r5;
import com.zfork.multiplatforms.android.bomb.y5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.security.Key;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.joke.connectdevice.bean.ۣ۠ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0065 {

    /* JADX INFO: renamed from: ۣۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean f151;

    /* JADX INFO: renamed from: ۟۟ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static List m4643(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((ApkVerifier.Result.SourceStampInfo) obj).getErrors();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m4644(Object obj, Object obj2) {
        if (C0027.m2460() >= 0) {
            return TypeAdapters.newFactory((TypeToken) obj, (TypeAdapter) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static void m4645(Object obj) {
        if (C0111.m13165() < 0) {
            ((JsonReader) obj).nextNull();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4646(char c) {
        if (C0021.m1598() <= 0) {
            return Character.isDigit(c);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static int m4647() {
        return 1754498 ^ C0032.m3236((Object) "ۧۥ۟");
    }

    /* JADX INFO: renamed from: ۟۠۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static TextView m4648(Object obj) {
        if (C0027.m2460() > 0) {
            return ((C0381i2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m4649(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((ManifestParser) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4650(Object obj, Object obj2) {
        if (C0020.m1385() < 0) {
            return J3.b((Path) obj, (LinkOption[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4651(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((DialogC0421p0) obj).k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static void m4652(Object obj) {
        if (C0077.m7272() < 0) {
            ((C0369g3) obj).f();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۧۧ, reason: not valid java name and contains not printable characters */
    public static int m4653(Object obj) {
        if (C0020.m1385() < 0) {
            return C0068.m5547((DisplayCutout) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static List m4654(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((ApkVerifier.Result.SourceStampInfo) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static K m4655(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((L) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static DialogC0421p0 m4656(Object obj) {
        if (m4647() >= 0) {
            return ((N1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۥۥ, reason: not valid java name and contains not printable characters */
    public static Paint m4657(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((P) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦۨ, reason: not valid java name and contains not printable characters */
    public static C0324a0 m4658(Object obj) {
        if (C0016.m717() < 0) {
            return ((C0348d3) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static String m4659() {
        if (C0111.m13165() <= 0) {
            return "Import.command.completed.ok.entries.successfully.imported.fail.entries.failed.or.cancelled";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static CodingErrorAction m4660() {
        if (C0068.m5678() > 0) {
            return CodingErrorAction.REPORT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥۤ, reason: not valid java name and contains not printable characters */
    public static Object m4661(Object obj, Object obj2) {
        if (C0032.m3184() <= 0) {
            return ((Map) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m4662(Object obj) {
        if (C0020.m1385() < 0) {
            return SigningCertificateLineage.readFromSignedData((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۦۤ, reason: not valid java name and contains not printable characters */
    public static TextView m4663(Object obj) {
        if (C0037.m3837() < 0) {
            return ((K0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦۦ, reason: not valid java name and contains not printable characters */
    public static void m4664(Object obj) {
        if (C0067.m5468() < 0) {
            ((E) obj).i();
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static String m4665() {
        if (C0038.m4010() >= 0) {
            return "Alg.Alias.Signature.SHA1withRSAandMGF1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static a m4666() {
        if (C0035.m3569() <= 0) {
            return a.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static ApkSignerEngine.InputJarEntryInstructions.OutputPolicy m4667(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((ApkSignerEngine.InputJarEntryInstructions) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static ContentDigestAlgorithm[] m4668() {
        if (C0070.m5903() > 0) {
            return ContentDigestAlgorithm.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۤ۠, reason: not valid java name and contains not printable characters */
    public static char[] m4669(Object obj, Object obj2) {
        if (C0075.m6893() > 0) {
            return ((O2) obj).w((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4670(Object obj) {
        if (C0066.m4827() > 0) {
            return ((ApkSigner.Builder) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢۤ, reason: not valid java name and contains not printable characters */
    public static ImageView m4671(Object obj) {
        if (C0068.m5678() > 0) {
            return ((N) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m4672() {
        if (C0030.m2940() > 0) {
            return C0330b.g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4673(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((ApkVerifier.Result) obj).isVerified();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m4674(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0066.m4827() >= 0) {
            ((C0324a0) obj).d((C0) obj2, (Boolean) obj3, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m4675(Object obj, int i) {
        if (C0029.m2791() >= 0) {
            return ((Cursor) obj).getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4676() {
        if (C0023.m1921() > 0) {
            return ApkVerifier.Issue.JAR_SIG_NO_SIGNED_ZIP_ENTRIES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static int m4677(Object obj) {
        if (C0068.m5678() > 0) {
            return ((C0479z) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۢ, reason: not valid java name and contains not printable characters */
    public static int m4678(Object obj) {
        if (C0025.m2132() > 0) {
            return ((W) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m4679(Object obj) {
        if (C0071.m6069() > 0) {
            return ((AtomicInteger) obj).getAndIncrement();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static long m4680(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((r5) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4681(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4682(Object obj) {
        if (C0027.m2460() > 0) {
            return ((ApkVerifier.IssueWithParams) obj).getIssue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static int m4683(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((G) obj).b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m4684() {
        if (C0023.m1921() > 0) {
            return ApkVerifier.Issue.JAR_SIG_MISSING_ZIP_ENTRY_REFERENCED_IN_MANIFEST;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m4685(Object obj) {
        if (C0033.m3358() < 0) {
            ((Q4) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m4686(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((JsonPrimitive) obj).getAsInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۡ۟۠, reason: not valid java name and contains not printable characters */
    public static C0351e m4687(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((DialogInterfaceOnClickListenerC0374h1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣ۟, reason: not valid java name and contains not printable characters */
    public static Charset m4688() {
        if (C0025.m2132() >= 0) {
            return StandardCharsets.UTF_16;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡۥ, reason: not valid java name and contains not printable characters */
    public static void m4689(Object obj, Object obj2) {
        if (C0032.m3184() <= 0) {
            ((ViewGroup) obj).addView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۨ, reason: not valid java name and contains not printable characters */
    public static MatchType m4690(Object obj) {
        if (C0018.m1064() > 0) {
            return ((ScriptMatchBean) obj).timeoutType;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m4691() {
        if (C0037.m3837() <= 0) {
            return AbstractC0342c4.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static String m4692() {
        if (C0069.m5781() < 0) {
            return "STAR";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۢ, reason: not valid java name and contains not printable characters */
    public static long m4693(Object obj) {
        if (C0078.m7450() > 0) {
            return ((Q0) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۦ, reason: not valid java name and contains not printable characters */
    public static String m4694(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((O2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۢ, reason: not valid java name and contains not printable characters */
    public static ImageView m4695(Object obj) {
        if (C0036.m3653() < 0) {
            return ((I1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4696(Object obj) {
        if (C0063.m4427() > 0) {
            return ((E5) obj).m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۨ, reason: not valid java name and contains not printable characters */
    public static String m4697(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((DialogC0385j0) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۥ, reason: not valid java name and contains not printable characters */
    public static FileTime m4698(Object obj) {
        if (C0032.m3184() <= 0) {
            return FileTime.from((Instant) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۨۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m4699(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((V4Signature.HashingInfo) obj).toByteArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۢ, reason: not valid java name and contains not printable characters */
    public static String m4700() {
        if (C0021.m1598() <= 0) {
            return "SHA1withRSA/PSS";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۥۡ, reason: not valid java name and contains not printable characters */
    public static void m4701(Object obj, Object obj2) {
        if (C0036.m3653() < 0) {
            ((Drawable) obj).draw((Canvas) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۧۦ, reason: not valid java name and contains not printable characters */
    public static String m4702() {
        if (C0111.m13165() < 0) {
            return "Do you want to quit the import process? [no]:  ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m4703(Object obj, Object obj2) {
        if (C0077.m7272() <= 0) {
            ((Activity) obj).setContentView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m4704(Object obj) {
        if (C0035.m3569() < 0) {
            return ((CentralDirectoryRecord) obj).getSize();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m4705(Object obj) {
        if (C0032.m3184() < 0) {
            return ((DefaultApkSignerEngine.Builder) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static OutputStream m4706(Object obj) {
        if (C0072.m6216() > 0) {
            return ((y5) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡۦ, reason: not valid java name and contains not printable characters */
    public static Key m4707(Object obj, Object obj2, Object obj3) {
        if (C0016.m717() <= 0) {
            return ((KeyStore) obj).getKey((String) obj2, (char[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۨۨ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerCapabilities.Builder m4708(Object obj, boolean z) {
        if (C0029.m2791() >= 0) {
            return ((SigningCertificateLineage.SignerCapabilities.Builder) obj).setInstalledData(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۧۦ, reason: not valid java name and contains not printable characters */
    public static DataSource[] m4709(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((ChainedDataSource) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۤ, reason: not valid java name and contains not printable characters */
    public static long m4710(Object obj) {
        if (C0016.m717() < 0) {
            return ((AtomicLong) obj).get();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4711(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((DefaultApkSignerEngine.Builder) obj).k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4712(Object obj) {
        if (C0067.m5468() < 0) {
            return ((DefaultApkSignerEngine.Builder) obj).n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۧ۠, reason: not valid java name and contains not printable characters */
    public static int m4713(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((AutoClickPointerBean) obj).getOffset();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤ۠, reason: not valid java name and contains not printable characters */
    public static int m4714(Object obj) {
        if (C0039.m4109() > 0) {
            return ((AndroidBinXmlParser) obj).getEventType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۣ, reason: not valid java name and contains not printable characters */
    public static List m4715(Object obj) {
        if (C0072.m6216() > 0) {
            return C0017.m953((DefaultApkSignerEngine.SignerConfig.Builder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m4716(Object obj, Object obj2) throws IOException {
        if (C0028.m2593() >= 0) {
            ((FileOutputStream) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4717() {
        if (C0038.m4010() >= 0) {
            return Process.myPid();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Map m4718(Object obj) {
        if (C0039.m4109() > 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo) obj).verifiedContentDigests;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m4719(Object obj) {
        if (C0016.m717() < 0) {
            return ((GuaranteedEncodedFormX509Certificate) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static void m4720(Object obj, Object obj2, Object obj3) {
        if (C0078.m7450() > 0) {
            ((SigningCertificateLineage) obj).updateSignerCapabilities((X509Certificate) obj2, (SigningCertificateLineage.SignerCapabilities) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m4721(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((V4Signature) obj).signingInfos;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static void m4722(Object obj) {
        if (C0077.m7272() <= 0) {
            ((TextView) obj).setSingleLine();
        }
    }

    /* JADX INFO: renamed from: ۣ۠۠۟, reason: not valid java name and contains not printable characters */
    public static void m4723(Object obj) {
        if (C0024.m2011() <= 0) {
            H3.g(obj);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۢۡ, reason: not valid java name and contains not printable characters */
    public static void m4724(Object obj, Object obj2) {
        if (C0030.m2940() > 0) {
            ((C0408n) obj).a(obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static int[] m4725() {
        if (C0067.m5468() < 0) {
            return AbstractC0356e4.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static String m4726(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((M4) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static void m4727(Object obj, Object obj2) {
        if (C0075.m6893() > 0) {
            ((View) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m4728() {
        if (C0038.m4010() > 0) {
            return ObjectTypeAdapter.FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static ProgressBar m4729(Object obj) {
        if (C0018.m1064() > 0) {
            return ((C0444t0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static URL m4730(Object obj, Object obj2) {
        if (C0032.m3184() <= 0) {
            return ((Class) obj).getResource((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static List m4731(Object obj) {
        if (C0023.m1921() > 0) {
            return V1SchemeVerifier.a((ArrayList) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠۠, reason: not valid java name and contains not printable characters */
    public static Iterator m4732(Object obj) {
        if (C0069.m5781() < 0) {
            return ((List) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4733(Object obj) {
        if (C0075.m6893() > 0) {
            return ((ApkSigner.Builder) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۣۡ, reason: not valid java name and contains not printable characters */
    public static void m4734(Object obj) {
        if (C0028.m2593() >= 0) {
            ((Thread) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۣۣۡۧ, reason: not valid java name and contains not printable characters */
    public static Object[] m4735(Object obj, Object obj2) {
        if (C0072.m6216() > 0) {
            return ((Set) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4736(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((ApkVerifier.Result) obj).p;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۧۨ۠, reason: not valid java name and contains not printable characters */
    public static V1SchemeSigner.OutputManifestFile m4737(Object obj, Object obj2, Object obj3) {
        if (C0072.m6216() >= 0) {
            return V1SchemeSigner.generateManifestFile((DigestAlgorithm) obj, (Map) obj2, (byte[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4738(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((O2) obj).I;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨۨۨ, reason: not valid java name and contains not printable characters */
    public static int m4739(Object obj) {
        if (C0028.m2593() > 0) {
            return ((DialogC0373h0) obj).m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static U3 m4740(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((R3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m4741(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((C0) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static ImageView m4742(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((I1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4743(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0070.m5903() >= 0) {
            return ((F3) obj).e((String) obj2, (String) obj3, (Charset[]) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۧۡ, reason: not valid java name and contains not printable characters */
    public static EditText m4744(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((DialogC0373h0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥۦ, reason: not valid java name and contains not printable characters */
    public static int m4745(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((JsonReader) obj).doPeek();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static File m4746(Object obj) {
        if (C0064.m4578() > 0) {
            return ((File) obj).getAbsoluteFile();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static JsonElement m4747(Object obj, Object obj2, Object obj3) {
        if (C0031.m3075() >= 0) {
            return ((Gson) obj).toJsonTree(obj2, (Type) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨ, reason: not valid java name and contains not printable characters */
    public static long m4748(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((ChainedDataSource) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m4749(Object obj, Object obj2, Object obj3) {
        if (C0072.m6216() > 0) {
            ((Gson) obj).toJson((JsonElement) obj2, (JsonWriter) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۤۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4750(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((C0348d3) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۦ۠, reason: not valid java name and contains not printable characters */
    public static float m4751(float f) {
        if (C0074.m6454() <= 0) {
            return Math.abs(f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۤۨۥ, reason: not valid java name and contains not printable characters */
    public static void m4752(Object obj) {
        if (C0021.m1598() <= 0) {
            UnsafeAllocator.assertInstantiable((Class) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۥۧ۠, reason: not valid java name and contains not printable characters */
    public static void m4753(Object obj) {
        if (C0019.m1311() == 0) {
            ((Matrix) obj).reset();
        }
    }

    /* JADX INFO: renamed from: ۣۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4754(Object obj, Object obj2) {
        if (m4647() > 0) {
            ((T2) obj).b((ConsumerAbility) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static String m4755() {
        if (C0074.m6454() < 0) {
            return "ۥۤۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۟۠, reason: not valid java name and contains not printable characters */
    public static int m4756(Object obj) {
        if (C0077.m7272() < 0) {
            return ((r5) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4758(Object obj) {
        if (C0028.m2593() >= 0) {
            return V3SchemeVerifier.signerTargetsDevRelease((ApkSigningBlockUtils.Result.SignerInfo) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۤۡ, reason: not valid java name and contains not printable characters */
    public static int m4759(Object obj) {
        if (C0037.m3837() <= 0) {
            return SigningCertificateLineage.a((List) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4760(Object obj, int i, Object obj2) {
        if (C0028.m2593() > 0) {
            ((C0408n) obj).b(i, (ScriptProjectBean) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢ۟ۤ, reason: contains not printable characters */
    public static String m4761(String str) {
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

    /* JADX INFO: renamed from: ۥۣۢۧ, reason: contains not printable characters */
    public static N2 m4762() {
        if (C0033.m3358() < 0) {
            return N2.o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۡ, reason: contains not printable characters */
    public static Class m4763(Object obj) {
        if (C0070.m5903() > 0) {
            return ((Class) obj).getSuperclass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۤۤ, reason: contains not printable characters */
    public static long m4764(Object obj) {
        if (C0034.m3450() > 0) {
            return ((AutoClickPlanBean) obj).getId();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۦۥۡ, reason: contains not printable characters */
    public static String m4765() {
        if (C0038.m4010() >= 0) {
            return "-----END CERTIFICATE-----";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۦۦ, reason: contains not printable characters */
    public static void m4766(Object obj, float f) {
        if (C0026.m2298() < 0) {
            ((Window) obj).setDimAmount(f);
        }
    }

    /* JADX INFO: renamed from: ۥۨۨۧ, reason: contains not printable characters */
    public static void m4767(Object obj, Object obj2) {
        if (C0063.m4427() >= 0) {
            ((PrintStream) obj).println((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۧ۟, reason: contains not printable characters */
    public static long m4768(Object obj, int i) {
        if (C0063.m4427() >= 0) {
            return ((AtomicLongArray) obj).get(i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦ۠ۡۢ, reason: contains not printable characters */
    public static boolean m4769(Object obj) {
        if (C0076.m6903() <= 0) {
            return M3.a((File) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۥۢ, reason: contains not printable characters */
    public static AutoClickPointerBean m4770(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((T1) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۨۡ, reason: contains not printable characters */
    public static MatchType m4771(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((C4) obj).F;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧۢ, reason: contains not printable characters */
    public static C5 m4772(Object obj, Object obj2) {
        if (C0023.m1921() > 0) {
            return ((A5) obj).d((E1) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۠۠, reason: contains not printable characters */
    public static float m4773(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((ScriptTouchBean) obj).rawX;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۦۤ, reason: contains not printable characters */
    public static String m4774() {
        if (C0074.m6454() < 0) {
            return "OpenSSLMac$HmacMD5";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۧۤ, reason: contains not printable characters */
    public static TextView m4775(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((C0361f2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ۟, reason: contains not printable characters */
    public static Charset m4776() {
        if (C0068.m5678() >= 0) {
            return StandardCharsets.ISO_8859_1;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۧ, reason: contains not printable characters */
    public static String m4777(Object obj) {
        if (m4647() > 0) {
            return ((Date) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static List m4778(Object obj) {
        if (C0026.m2298() < 0) {
            return ((ApkVerifier.Result.V4SchemeSignerInfo) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static KeyConfig m4779(Object obj) {
        if (C0075.m6893() > 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).getKeyConfig();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۥ۠, reason: not valid java name and contains not printable characters */
    public static String m4780(Object obj, Object obj2) {
        if (C0016.m717() <= 0) {
            return GsonUtils.toJson((Gson) obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧ۠, reason: not valid java name and contains not printable characters */
    public static String m4781() {
        if (C0038.m4010() > 0) {
            return "x509.algorithm";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨۥ, reason: not valid java name and contains not printable characters */
    public static void m4782(boolean z, Object obj, Object obj2) {
        if (C0026.m2298() <= 0) {
            AbstractC0390k.c(z, (File) obj, (File) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۤۨۦ, reason: not valid java name and contains not printable characters */
    public static void m4783(Object obj) {
        if (C0016.m717() < 0) {
            H1.a((File) obj);
        }
    }

    /* JADX INFO: renamed from: ۧۥۢۧ, reason: not valid java name and contains not printable characters */
    public static String m4784(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((M4) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۦ۠, reason: not valid java name and contains not printable characters */
    public static ScriptRecordType m4785() {
        if (C0020.m1385() < 0) {
            return ScriptRecordType.NUMBER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m4786(Object obj) {
        if (C0073.m6356() < 0) {
            return ((G) obj).a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m4787(Object obj) {
        if (C0034.m3450() > 0) {
            return ((C0330b) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۢ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m4788(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((V4Signature.SigningInfo) obj).toByteArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4789(Object obj) {
        if (C0038.m4010() > 0) {
            return ((RunnableC0367g1) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4790(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((DefaultApkSignerEngine) obj).h();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m4757(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
