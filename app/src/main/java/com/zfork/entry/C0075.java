package com.zfork.entry;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
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
import com.android.apksig.internal.apk.ApkSigResult;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v2.V2SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SigningCertificateLineage;
import com.android.apksig.internal.apk.v4.V4SchemeVerifier;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1Field;
import com.android.apksig.internal.asn1.Asn1TagClass;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestWriter;
import com.android.apksig.internal.jar.SignatureFileWriter;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.AlgorithmIdentifier;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.OutputStreamDataSink;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.DataSources;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickBean;
import com.joke.connectdevice.bean.AutoClickContentBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.annotations.Expose;
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
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptMatchBean;
import com.joke.script.bean.ScriptProjectBean;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A1;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.B0;
import com.zfork.multiplatforms.android.bomb.B1;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0330b;
import com.zfork.multiplatforms.android.bomb.C0344d;
import com.zfork.multiplatforms.android.bomb.C0348d3;
import com.zfork.multiplatforms.android.bomb.C0350d5;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0443t;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.C5;
import com.zfork.multiplatforms.android.bomb.D3;
import com.zfork.multiplatforms.android.bomb.DialogC0359f0;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.E4;
import com.zfork.multiplatforms.android.bomb.F4;
import com.zfork.multiplatforms.android.bomb.F5;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.G5;
import com.zfork.multiplatforms.android.bomb.I0;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.InterfaceC0477y3;
import com.zfork.multiplatforms.android.bomb.J2;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.K3;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q0;
import com.zfork.multiplatforms.android.bomb.Q2;
import com.zfork.multiplatforms.android.bomb.R3;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.U0;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0368g2;
import com.zfork.multiplatforms.android.bomb.Y1;
import com.zfork.multiplatforms.android.bomb.Z4;
import com.zfork.multiplatforms.android.bomb.o5;
import com.zfork.multiplatforms.android.bomb.q5;
import com.zfork.multiplatforms.android.bomb.t5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.attribute.DosFileAttributeView;
import java.security.Key;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.concurrent.Phaser;
import java.util.jar.Attributes;
import javax.crypto.EncryptedPrivateKeyInfo;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.entry.ۣ۠ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0075 {

    /* JADX INFO: renamed from: ۣۡۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean f225 = true;

    /* JADX INFO: renamed from: ۟۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static Boolean m6775(boolean z) {
        if (C0073.m6356() <= 0) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static int m6776(Object obj, Object obj2, int i, int i2) {
        if (C0070.m5903() > 0) {
            return ((G5) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m6777(Object obj, float f) {
        if (m6893() >= 0) {
            return o5.e((Context) obj, f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static Asn1TagClass m6778(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((Asn1Field) obj).cls();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m6779() {
        if (C0019.m1311() == 0) {
            return "Alg.Alias.Mac.HMAC-SHA1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static void m6780(Object obj) throws IOException {
        if (C0068.m5678() > 0) {
            ((OutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟۠۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m6781(Object obj) {
        if (C0034.m3450() > 0) {
            ManifestWriter.writeSectionDelimiter((OutputStream) obj);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m6782(Object obj) {
        if (C0028.m2593() >= 0) {
            return V3SigningCertificateLineage.encodeSigningCertificateNode((V3SigningCertificateLineage.SigningCertificateNode) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static long m6783(Object obj) {
        if (C0111.m13165() < 0) {
            return ((ScriptMatchBean) obj).duration;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static ImageView m6784(Object obj) {
        if (C0111.m13165() < 0) {
            return ((K0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m6785(Object obj, Object obj2) {
        if (C0066.m4827() > 0) {
            ((GradientDrawable) obj).setCornerRadii((float[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static Object m6786(Object obj, Object obj2, Object obj3) {
        if (m6893() >= 0) {
            return ((TreeMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6787() {
        if (C0031.m3075() > 0) {
            return ApkVerifier.Issue.V2_SIG_MALFORMED_DIGEST;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static LinearLayout m6788(Object obj) {
        if (C0065.m4647() > 0) {
            return ((C0361f2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static int m6789(Object obj, Object obj2, int i, int i2) {
        if (m6893() >= 0) {
            return ((Q0) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static List m6790(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((ScriptProjectBean) obj).recordList;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static void m6792(Object obj, Object obj2, Object obj3) {
        if (C0029.m2791() >= 0) {
            SignatureFileWriter.writeIndividualSection((OutputStream) obj, (String) obj2, (Attributes) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥۣ۟, reason: not valid java name and contains not printable characters */
    public static long m6793(Object obj) {
        if (C0063.m4427() > 0) {
            return ((F5) obj).h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۧۢ, reason: not valid java name and contains not printable characters */
    public static int m6794(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((ViewOnClickListenerC0368g2) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static ShapeDrawable m6795(Object obj) {
        if (C0077.m7272() < 0) {
            return C0.b((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m6796(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((Asn1Field) obj).elementType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static JsonWriter m6797(Object obj) {
        if (C0023.m1921() > 0) {
            return ((JsonWriter) obj).endObject();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢۨ, reason: not valid java name and contains not printable characters */
    public static void m6798(Object obj, long j) {
        if (C0074.m6454() <= 0) {
            ((AutoClickBean) obj).setId(j);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static File m6799(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((Context) obj).getCacheDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۦ, reason: not valid java name and contains not printable characters */
    public static int m6800(Object obj, int i) {
        if (C0074.m6454() < 0) {
            return ((AndroidBinXmlParser) obj).getAttributeValueType(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤۦ, reason: not valid java name and contains not printable characters */
    public static Editable m6801(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((EditText) obj).getText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m6802(Object obj, Object obj2, int i, int i2) {
        if (C0037.m3837() < 0) {
            return ((StringBuilder) obj).append((char[]) obj2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢۢ, reason: not valid java name and contains not printable characters */
    public static K0 m6803(Object obj) {
        if (C0024.m2011() < 0) {
            return ((I0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static long m6804(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((t5) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨۡ, reason: not valid java name and contains not printable characters */
    public static List m6805(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((SourceStampVerifier.Result.SignerInfo) obj).getErrors();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m6806(Object obj) {
        if (C0028.m2593() > 0) {
            return ((DialogC0373h0) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m6807(Object obj) {
        if (C0030.m2940() > 0) {
            return ((DefaultApkSignerEngine) obj).x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6808(Object obj) {
        if (C0069.m5781() < 0) {
            return ((Expose) obj).deserialize();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static ApplicationInfo m6809(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((T2) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static void m6810(Object obj, long j) {
        if (C0031.m3075() > 0) {
            ((Calendar) obj).setTimeInMillis(j);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢۢ, reason: not valid java name and contains not printable characters */
    public static void m6811(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, Object obj5) {
        if (C0018.m1064() > 0) {
            V2SchemeVerifier.parseSigners((ByteBuffer) obj, (Set) obj2, (Map) obj3, (Set) obj4, i, i2, (ApkSigningBlockUtils.Result) obj5);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m6812(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((ApkVerifier.Result) obj).m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m6813(Object obj, int i) {
        if (C0027.m2460() >= 0) {
            ((AutoClickPointerBean) obj).setClickCnt(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۤۢ, reason: not valid java name and contains not printable characters */
    public static int m6814(Object obj) {
        if (C0072.m6216() > 0) {
            return ((E4) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m6815(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((LocalFileRecord) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m6816(Object obj) {
        if (C0025.m2132() > 0) {
            return ((SourceStampVerifier.Result) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static DataSource m6817(Object obj) {
        if (C0071.m6069() > 0) {
            return ((ApkSigner.Builder) obj).w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m6818(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((Buffer) obj).limit();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۧ۟, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m6819(Object obj, Object obj2) {
        if (C0068.m5678() > 0) {
            return ((Gson) obj).getAdapter((TypeToken) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟۠, reason: not valid java name and contains not printable characters */
    public static Type m6820(Object obj) {
        if (C0063.m4427() > 0) {
            return C$Gson$Types.getArrayComponentType((Type) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۥ۟, reason: not valid java name and contains not printable characters */
    public static q5 m6821(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((C5) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧۥ, reason: not valid java name and contains not printable characters */
    public static OutputStream m6822(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((OutputStreamDataSink) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m6823() {
        if (C0030.m2940() > 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_CERTIFICATE_MISMATCH_BETWEEN_SIGNATURE_BLOCK_AND_APK;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۤۤ, reason: not valid java name and contains not printable characters */
    public static long m6824(Object obj) {
        if (C0025.m2132() > 0) {
            return ((U0) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢ۠, reason: not valid java name and contains not printable characters */
    public static int m6825(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((T1) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢۧۢ, reason: not valid java name and contains not printable characters */
    public static WindowManager m6826(Object obj) {
        if (C0016.m717() <= 0) {
            return ((A1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۥۣ, reason: not valid java name and contains not printable characters */
    public static CentralDirectoryRecord m6827(Object obj, int i, int i2, long j, long j2, long j3, long j4) {
        if (m6893() >= 0) {
            return CentralDirectoryRecord.createWithDeflateCompressedData((String) obj, i, i2, j, j2, j3, j4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۡۧ, reason: not valid java name and contains not printable characters */
    public static void m6828(Object obj, Object obj2) {
        if (C0078.m7450() >= 0) {
            SourceStampVerifier.Result.access$000((SourceStampVerifier.Result) obj, (ApkSigResult) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۠, reason: not valid java name and contains not printable characters */
    public static int m6829(Object obj) {
        if (C0034.m3450() > 0) {
            return ((t5) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6830(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((J2) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m6831(Object obj, Object obj2) {
        if (C0067.m5468() <= 0) {
            ((PopupWindow) obj).setContentView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6832(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((G0) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6833(int i, int i2) {
        if (C0024.m2011() < 0) {
            return K3.c(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static TextView m6834(Object obj) {
        if (C0077.m7272() < 0) {
            return ((DialogC0359f0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static Handler m6835(Object obj) {
        if (C0069.m5781() < 0) {
            return ((MetaSelectAppAbility) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6836(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((ApkSigner) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m6837() {
        if (C0071.m6069() > 0) {
            return "Alg.Alias.Signature.1.2.840.10045.4.3.3";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۣ, reason: not valid java name and contains not printable characters */
    public static List m6838(Object obj, Object obj2) {
        if (C0024.m2011() < 0) {
            return Asn1BerParser.parseImplicitSetOf((ByteBuffer) obj, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Appendable m6839(Object obj, Object obj2) {
        if (C0068.m5678() >= 0) {
            return ((ConsumerAbility) obj).append((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m6840(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0064.m4578() >= 0) {
            return ApkSigningBlockUtils.generatePkcs7DerEncodedMessage((byte[]) obj, (ByteBuffer) obj2, (List) obj3, (AlgorithmIdentifier) obj4, (AlgorithmIdentifier) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m6841(Object obj, Object obj2) {
        if (C0068.m5678() > 0) {
            ((WebView) obj).loadUrl((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerCapabilities.Builder m6842(Object obj) {
        if (C0038.m4010() > 0) {
            return ((M4) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static int m6843(Object obj) {
        if (C0064.m4578() > 0) {
            return ((AutoClickPointerBean) obj).getPointerX();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6844(Object obj) {
        if (C0023.m1921() > 0) {
            return ((CentralDirectoryRecord) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۡ۠, reason: not valid java name and contains not printable characters */
    public static PublicKey m6845(Object obj) {
        if (C0076.m6903() < 0) {
            return ((Certificate) obj).getPublicKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۥ۠, reason: not valid java name and contains not printable characters */
    public static void m6846(Object obj, int i, int i2, boolean z) {
        if (C0068.m5678() >= 0) {
            ((Z4) obj).d(i, i2, z);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static String m6847(String str) {
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

    /* JADX INFO: renamed from: ۡۡۦۥ, reason: not valid java name and contains not printable characters */
    public static MatchType m6848() {
        if (C0067.m5468() < 0) {
            return MatchType.CONTINUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟۟, reason: not valid java name and contains not printable characters */
    public static String m6849() {
        if (C0038.m4010() > 0) {
            return "AES_256/CBC/PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6850(Object obj) {
        if (C0025.m2132() > 0) {
            return ((L) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤ۟, reason: not valid java name and contains not printable characters */
    public static void m6851(Object obj, Object obj2) {
        if (C0023.m1921() > 0) {
            ((C0444t0) obj).setmPlanEditListener((InterfaceC0477y3) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m6852(Object obj) {
        if (C0030.m2940() > 0) {
            return ((R3) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۠۟, reason: not valid java name and contains not printable characters */
    public static PKCS8EncodedKeySpec m6853(Object obj, Object obj2) {
        if (C0018.m1064() > 0) {
            return ((EncryptedPrivateKeyInfo) obj).getKeySpec((Key) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m6854() {
        if (C0038.m4010() > 0) {
            return "OpenSSLAeadCipherAES$GCM";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۤۥ, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m6855(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0071.m6069() > 0) {
            return ((DialogC0385j0) obj).b((Activity) obj2, (String) obj3, (String) obj4, (EditText) obj5, (EditText) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0477y3 m6856(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((C0444t0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۡۦ, reason: not valid java name and contains not printable characters */
    public static String m6857(Object obj) {
        if (C0029.m2791() > 0) {
            return ((MetaSelectAppAbility) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m6858(Object obj) {
        if (C0024.m2011() < 0) {
            return ((View) obj).getBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۡۦ, reason: not valid java name and contains not printable characters */
    public static TextView m6859(Object obj) {
        if (C0020.m1385() < 0) {
            return ((C0348d3) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۦۥ, reason: not valid java name and contains not printable characters */
    public static void m6860(Object obj, boolean z) {
        if (C0076.m6903() < 0) {
            ((DosFileAttributeView) obj).setReadOnly(z);
        }
    }

    /* JADX INFO: renamed from: ۣۤۧ۟, reason: not valid java name and contains not printable characters */
    public static TextView m6861(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((C0351e) obj).y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m6862(Object obj) {
        if (C0077.m7272() < 0) {
            return ((Y1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m6863(Object obj, Object obj2) {
        if (C0038.m4010() >= 0) {
            return ((Stack) obj).push(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۢۤ, reason: not valid java name and contains not printable characters */
    public static String m6864(Object obj) {
        if (C0020.m1385() < 0) {
            return ((AutoClickContentBean) obj).getPlanName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۦۨ, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.Result m6865(Object obj, Object obj2) {
        if (C0078.m7450() > 0) {
            return V4SchemeVerifier.verify((DataSource) obj, (File) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۡۥ, reason: not valid java name and contains not printable characters */
    public static int m6866(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((L) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦۧۡ, reason: not valid java name and contains not printable characters */
    public static Integer m6867(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((C0443t) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۨ۟, reason: not valid java name and contains not printable characters */
    public static Button m6868(Object obj) {
        if (C0021.m1598() < 0) {
            return ((C0344d) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۧۨ, reason: not valid java name and contains not printable characters */
    public static int m6869(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((Phaser) obj).arriveAndDeregister();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۧ, reason: contains not printable characters */
    public static SigningCertificateLineage m6870(Object obj) {
        if (C0072.m6216() > 0) {
            return ((ApkSigner.Builder) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦ, reason: contains not printable characters */
    public static Context m6871(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((B0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۡ, reason: contains not printable characters */
    public static TypeAdapterFactory m6872() {
        if (C0018.m1064() > 0) {
            return TypeAdapters.ATOMIC_INTEGER_FACTORY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۡۥ, reason: contains not printable characters */
    public static void m6873(Object obj, byte b) {
        if (m6893() > 0) {
            ((Signature) obj).update(b);
        }
    }

    /* JADX INFO: renamed from: ۥۤۢۢ, reason: contains not printable characters */
    public static String m6874(Object obj) {
        if (C0030.m2940() > 0) {
            return ((Attributes.Name) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۥ, reason: contains not printable characters */
    public static TextUtils.TruncateAt m6875() {
        if (C0037.m3837() <= 0) {
            return TextUtils.TruncateAt.END;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۢۤ, reason: contains not printable characters */
    public static D3 m6876(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0026.m2298() < 0) {
            return ((O2) obj).P((String) obj2, (char[]) obj3, (char[]) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static ByteBuffer m6877(Object obj, Object obj2) {
        if (C0023.m1921() > 0) {
            return ((Charset) obj).encode((CharBuffer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۥۧ, reason: contains not printable characters */
    public static String m6878() {
        if (C0067.m5468() < 0) {
            return "OpenSSLSignatureRawRSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۧۡ, reason: contains not printable characters */
    public static float m6879(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((B1) obj).a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦ۟۠ۧ, reason: contains not printable characters */
    public static ArrayList m6880(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((C0350d5) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۢۧ, reason: contains not printable characters */
    public static long m6881(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((AbstractC0384j) obj).h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۤ, reason: contains not printable characters */
    public static int m6882(Object obj) {
        if (C0039.m4109() > 0) {
            return ((CentralDirectoryRecord) obj).getNameSizeBytes();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡۥۦ, reason: contains not printable characters */
    public static ByteArrayOutputStream m6883(Object obj) {
        if (C0017.m846() > 0) {
            return ((Q2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۨ, reason: contains not printable characters */
    public static DataSource m6884(Object obj) {
        if (C0068.m5678() > 0) {
            return DataSources.asDataSource((FileChannel) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ۟۟, reason: contains not printable characters */
    public static int m6885(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((F4) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۢۡ, reason: contains not printable characters */
    public static String m6886() {
        if (C0078.m7450() > 0) {
            return "version";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۥۦ, reason: contains not printable characters */
    public static LinearLayout m6887(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((C0) obj).s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۨۦ, reason: contains not printable characters */
    public static FileChannel m6888(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((RandomAccessFile) obj).getChannel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6889(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((M4) obj).c();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6890(Object obj) {
        if (C0066.m4827() > 0) {
            return ((ApkSigner.Builder) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۤۢۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6891(Object obj) {
        if (C0023.m1921() > 0) {
            return ((V1SchemeVerifier.Result) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۦۡ, reason: not valid java name and contains not printable characters */
    public static BigDecimal m6892() {
        if (C0074.m6454() < 0) {
            return BigDecimal.ONE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۨۡ, reason: not valid java name and contains not printable characters */
    public static int m6893() {
        return 1749682 ^ C0032.m3236((Object) "ۢۤۥ");
    }

    /* JADX INFO: renamed from: ۨۢۤۦ, reason: not valid java name and contains not printable characters */
    public static EditText m6894(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((C4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۤۡ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m6895(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((C0361f2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static ApkSignerEngine.InputJarEntryInstructions.OutputPolicy m6896(Object obj) {
        if (C0078.m7450() > 0) {
            return ((ApkSignerEngine.InputJarEntryInstructions) obj).getOutputPolicy();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۨ۟, reason: not valid java name and contains not printable characters */
    public static int[][] m6897(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((C0330b) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۥۡ, reason: not valid java name and contains not printable characters */
    public static TextView m6898(Object obj) {
        if (C0064.m4578() > 0) {
            return ((I1) obj).getTvSave();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۧ۟, reason: not valid java name and contains not printable characters */
    public static int m6899(Object obj) {
        if (C0067.m5468() < 0) {
            return ZipUtils.getUnsignedInt16((ByteBuffer) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static String m6791(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
