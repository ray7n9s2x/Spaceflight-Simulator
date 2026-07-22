package com.android.apksig.internal.jar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Message;
import android.util.JsonWriter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerificationIssue;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.KeyConfig;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.util.RandomAccessFileDataSink;
import com.android.apksig.internal.util.VerityTreeBuilder;
import com.android.apksig.internal.x509.Certificate;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.DataSources;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.basetoollib.LoadDrawableUtils;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.ObjectTypeAdapter;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptProjectBean;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.entry.MetaSelectAppAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.AbstractC0372h;
import com.zfork.multiplatforms.android.bomb.AbstractC0378i;
import com.zfork.multiplatforms.android.bomb.AbstractC0384j;
import com.zfork.multiplatforms.android.bomb.AbstractC0441s3;
import com.zfork.multiplatforms.android.bomb.AbstractC0449u;
import com.zfork.multiplatforms.android.bomb.B;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0324a0;
import com.zfork.multiplatforms.android.bomb.C0329a5;
import com.zfork.multiplatforms.android.bomb.C0337c;
import com.zfork.multiplatforms.android.bomb.C0357e5;
import com.zfork.multiplatforms.android.bomb.C0365g;
import com.zfork.multiplatforms.android.bomb.C0369g3;
import com.zfork.multiplatforms.android.bomb.C0370g4;
import com.zfork.multiplatforms.android.bomb.C0371g5;
import com.zfork.multiplatforms.android.bomb.C0381i2;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0413n4;
import com.zfork.multiplatforms.android.bomb.C0456v0;
import com.zfork.multiplatforms.android.bomb.C0469x1;
import com.zfork.multiplatforms.android.bomb.C0474y0;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.C5;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0331b0;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0419o4;
import com.zfork.multiplatforms.android.bomb.F3;
import com.zfork.multiplatforms.android.bomb.F5;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.G2;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.InterfaceC0401l4;
import com.zfork.multiplatforms.android.bomb.InterfaceC0471x3;
import com.zfork.multiplatforms.android.bomb.J0;
import com.zfork.multiplatforms.android.bomb.K;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.M;
import com.zfork.multiplatforms.android.bomb.O;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.S2;
import com.zfork.multiplatforms.android.bomb.T1;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.V;
import com.zfork.multiplatforms.android.bomb.V3;
import com.zfork.multiplatforms.android.bomb.V4;
import com.zfork.multiplatforms.android.bomb.W1;
import com.zfork.multiplatforms.android.bomb.W4;
import com.zfork.multiplatforms.android.bomb.Y2;
import com.zfork.multiplatforms.android.bomb.Y3;
import com.zfork.multiplatforms.android.bomb.Z4;
import com.zfork.multiplatforms.android.bomb.k5;
import com.zfork.multiplatforms.android.bomb.o5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.jar.Attributes;
import java.util.zip.Deflater;
import org.conscrypt.C0111;
import sun.misc.Unsafe;
import sun.security.pkcs.PKCS10;
import sun.security.util.ObjectIdentifier;

/* JADX INFO: renamed from: com.android.apksig.internal.jar.ۥۣۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0024 {

    /* JADX INFO: renamed from: ۟ۤۧۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean f102;

    /* JADX INFO: renamed from: ۟۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static File m1929(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((SourceStampVerifier.Builder) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m1930(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((SourceStampVerifier.Result) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m1931(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((T2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m1932(Object obj, int i, long j) {
        if (C0038.m4010() >= 0) {
            ((AtomicLongArray) obj).set(i, j);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static FileChannel m1933(Object obj, long j) {
        if (C0016.m717() <= 0) {
            return ((FileChannel) obj).position(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static O m1934(Object obj) {
        if (C0074.m6454() < 0) {
            return ((M) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m1935(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((O2) obj).M;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1936(Object obj) {
        if (C0067.m5468() < 0) {
            return ((File) obj).createNewFile();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static List m1937(Object obj) {
        if (C0021.m1598() < 0) {
            return ((DefaultApkSignerEngine) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1938(Object obj, Object obj2) {
        if (C0071.m6069() > 0) {
            return ((ObjectIdentifier) obj).equals((ObjectIdentifier) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۧۨ, reason: not valid java name and contains not printable characters */
    public static void m1939(Object obj, Object obj2) {
        if (C0028.m2593() >= 0) {
            ((Attributes) obj).putAll((Map) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۡۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m1940(Object obj) {
        if (C0023.m1921() > 0) {
            return ((ApkSigningBlockUtils.VerityTreeAndDigest) obj).rootHash;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۥۢ, reason: not valid java name and contains not printable characters */
    public static KeyConfig m1941(Object obj) {
        if (C0020.m1385() < 0) {
            return ((V1SchemeSigner.SignerConfig) obj).keyConfig;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m1942(Object obj, Object obj2) {
        if (C0071.m6069() >= 0) {
            return ((VerityTreeBuilder) obj).getRootHashFromTree((ByteBuffer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static C0324a0 m1943(Object obj) {
        if (C0070.m5903() > 0) {
            return ((S2) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۢۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m1944(Object obj, Object obj2) {
        if (C0067.m5468() <= 0) {
            return V1SchemeSigner.a((V1SchemeSigner.SignerConfig) obj, (byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static long m1946(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0023.m1921() >= 0) {
            return ((LocalFileRecord) obj).outputRecordWithModifiedExtra((DataSource) obj2, (ByteBuffer) obj3, (DataSink) obj4);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m1947() {
        if (C0031.m3075() >= 0) {
            return "Timestamp.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۧ, reason: not valid java name and contains not printable characters */
    public static String m1948() {
        if (C0030.m2940() > 0) {
            return "Re.enter.new.prompt.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۨ, reason: not valid java name and contains not printable characters */
    public static void m1949(Object obj) {
        if (C0029.m2791() > 0) {
            AbstractC0449u.g((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m1950(Object obj) {
        if (C0023.m1921() > 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo.AdditionalAttribute) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦ۠, reason: not valid java name and contains not printable characters */
    public static Message m1951() {
        if (C0070.m5903() >= 0) {
            return Message.obtain();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static W1 m1952(Object obj) {
        if (C0071.m6069() > 0) {
            return ((T1) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۨ, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m1953(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((C4) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1954(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((CompoundButton) obj).isChecked();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨۢۧ, reason: not valid java name and contains not printable characters */
    public static List m1955(Object obj) {
        if (C0018.m1064() > 0) {
            return ((ScriptProjectBean) obj).interval;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static Charset m1956() {
        if (C0074.m6454() < 0) {
            return G2.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static TextView m1957(Object obj) {
        if (C0017.m846() >= 0) {
            return ((DialogC0331b0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m1958(Object obj) throws IOException {
        if (C0072.m6216() >= 0) {
            ((InputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static void m1959(Object obj, Object obj2) {
        if (C0069.m5781() < 0) {
            ((PKCS10) obj).print((PrintStream) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1960(Object obj) {
        if (m2011() < 0) {
            return ((Field) obj).isSynthetic();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static ApkSigner.SignerConfig m1961(Object obj) {
        if (m2011() < 0) {
            return ((ApkSigner.SignerConfig.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1962(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((C0369g3) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1963(Object obj) {
        if (C0078.m7450() > 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static String m1964() {
        if (C0076.m6903() < 0) {
            return "OpenSSLAeadCipherAES$GCM_SIV";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡ۠, reason: not valid java name and contains not printable characters */
    public static C0 m1965(Object obj) {
        if (C0076.m6903() < 0) {
            return ((G0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static long m1966(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((C0357e5) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1967(Object obj, Object obj2) {
        if (C0073.m6356() <= 0) {
            return ((File) obj).renameTo((File) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Context m1968(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((O) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۥ, reason: not valid java name and contains not printable characters */
    public static ViewParent m1969(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((View) obj).getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1970(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((SourceStampVerifier.Result.SourceStampInfo) obj).containsErrors();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static void m1971(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0028.m2593() >= 0) {
            ((F3) obj).b((ArrayList) obj2, (char[]) obj3, (Charset[]) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1972(Object obj) {
        if (C0028.m2593() > 0) {
            return ((F5) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1973(Object obj) {
        if (C0031.m3075() > 0) {
            return ((DefaultApkSignerEngine.SignerConfig.Builder) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m1974(Object obj) {
        if (C0018.m1064() > 0) {
            return ((ManifestParser.Attribute) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ۟, reason: not valid java name and contains not printable characters */
    public static JsonWriter m1975(Object obj) {
        if (C0067.m5468() < 0) {
            return ((JsonWriter) obj).beginObject();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧۦ, reason: not valid java name and contains not printable characters */
    public static X509Certificate m1976(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((SigningCertificateLineage.SignerConfig) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m1977(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((ApkSigningBlockUtils.Result.SignerInfo.Signature) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥ۟, reason: not valid java name and contains not printable characters */
    public static CharsetEncoder m1978(Object obj, Object obj2) {
        if (C0034.m3450() > 0) {
            return ((CharsetEncoder) obj).onMalformedInput((CodingErrorAction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢۨ, reason: not valid java name and contains not printable characters */
    public static void m1979(Object obj, Object obj2, Object obj3) {
        if (C0020.m1385() <= 0) {
            ((C0469x1) obj).a((List) obj2, (InterfaceC0471x3) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1980(Object obj) {
        if (m2011() < 0) {
            return C0020.m1389((ApkSigner.SignerConfig.Builder) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۨ, reason: not valid java name and contains not printable characters */
    public static int m1981(Object obj) {
        if (C0020.m1385() < 0) {
            return ((ApkSigningBlockUtils.SignerConfig) obj).maxSdkVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ۠, reason: not valid java name and contains not printable characters */
    public static InterfaceC0401l4 m1982(Object obj) {
        if (C0035.m3569() < 0) {
            return ((DialogC0419o4) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۡۢ, reason: not valid java name and contains not printable characters */
    public static C0370g4 m1983(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((C0381i2) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۤۧ, reason: not valid java name and contains not printable characters */
    public static ImageView m1984(Object obj) {
        if (C0026.m2298() < 0) {
            return ((C0365g) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1985(Object obj) {
        if (C0067.m5468() < 0) {
            return ((DefaultApkSignerEngine.Builder) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦۡ, reason: not valid java name and contains not printable characters */
    public static int m1986() {
        if (C0020.m1385() < 0) {
            return W4.c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۧۨ, reason: not valid java name and contains not printable characters */
    public static MetaSelectAppAbility m1987(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((Y2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1988() {
        if (C0033.m3358() <= 0) {
            return "Failed.to.establish.chain.from.reply";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static Activity m1989(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((C0456v0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1990() {
        if (C0069.m5781() <= 0) {
            return ApkVerifier.Issue.V3_SIG_PAST_SIGNERS_MISMATCH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۧ۟, reason: not valid java name and contains not printable characters */
    public static long m1991(Object obj) {
        if (C0037.m3837() < 0) {
            return ((U3) obj).l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Collection m1992(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((X509Certificate) obj).getIssuerAlternativeNames();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۤ, reason: not valid java name and contains not printable characters */
    public static CharsetEncoder m1993(Object obj, Object obj2) {
        if (C0029.m2791() >= 0) {
            return ((CharsetEncoder) obj).onUnmappableCharacter((CodingErrorAction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static int m1994(Object obj) {
        if (C0035.m3569() < 0) {
            return ((C0337c) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1995(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((ApkVerifier.Result) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦ۠, reason: not valid java name and contains not printable characters */
    public static String m1996(Object obj, Object obj2, Object obj3) {
        if (C0063.m4427() > 0) {
            return o5.v((Context) obj, (Uri) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static EnumSet m1997(Object obj) {
        if (C0026.m2298() < 0) {
            return EnumSet.copyOf((Collection) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Throwable m1998(Object obj) {
        if (C0021.m1598() < 0) {
            return ((Throwable) obj).getCause();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static long m1999(Object obj, Object obj2, long j) {
        if (C0073.m6356() <= 0) {
            return ((Unsafe) obj).getLong(obj2, j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static ImageView m2000(Object obj) {
        if (C0025.m2132() > 0) {
            return ((I1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۥۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m2001(Object obj) {
        if (C0023.m1921() > 0) {
            return ((Set) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۤۧ, reason: not valid java name and contains not printable characters */
    public static int m2002(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((SigningCertificateLineage.Builder) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m2003(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((K0) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡ۟, reason: not valid java name and contains not printable characters */
    public static String m2004(Object obj, Object obj2) {
        if (C0066.m4827() >= 0) {
            return ((Attributes) obj).getValue((Attributes.Name) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static V4 m2005(Object obj) {
        if (C0034.m3450() > 0) {
            return ((V) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢ۠, reason: not valid java name and contains not printable characters */
    public static void m2006(Object obj, Object obj2) {
        if (C0078.m7450() > 0) {
            L.a((L) obj, (K) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۥ۠, reason: not valid java name and contains not printable characters */
    public static Class m2007() {
        if (C0073.m6356() <= 0) {
            return Boolean.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m2008() {
        if (C0033.m3358() < 0) {
            return "SHA224withECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۡۧ, reason: not valid java name and contains not printable characters */
    public static int m2009(Object obj) {
        if (C0073.m6356() < 0) {
            return ((T1) obj).r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۧۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0441s3 m2010(Object obj, Object obj2, Object obj3) {
        if (C0078.m7450() >= 0) {
            return ((B) obj).b((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static int m2011() {
        return (-1749669) ^ C0032.m3236((Object) "ۢۢۦ");
    }

    /* JADX INFO: renamed from: ۢ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m2012() {
        if (C0019.m1311() <= 0) {
            return ApkVerifier.Issue.V3_SIG_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static File m2013(Object obj) {
        if (C0075.m6893() > 0) {
            return ((ApkSigner) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static void m2014(Object obj, float f) {
        if (C0034.m3450() >= 0) {
            ((GradientDrawable) obj).setCornerRadius(f);
        }
    }

    /* JADX INFO: renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static DosFileAttributeView m2015(Object obj) {
        if (C0033.m3358() < 0) {
            return AbstractC0372h.l(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۨۧ, reason: not valid java name and contains not printable characters */
    public static void m2016(Object obj, int i, int i2) {
        if (C0064.m4578() >= 0) {
            ((Z4) obj).b(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۢ۟, reason: not valid java name and contains not printable characters */
    public static Drawable m2017(Object obj) {
        if (C0038.m4010() > 0) {
            return ((Z4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static K0 m2018(Object obj) {
        if (C0039.m4109() > 0) {
            return ((J0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۦۣ, reason: not valid java name and contains not printable characters */
    public static int m2019(int i, Object obj) {
        if (C0111.m13165() <= 0) {
            return k5.a(i, (String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۨۦ, reason: not valid java name and contains not printable characters */
    public static void m2020(Object obj, Object obj2) {
        if (C0072.m6216() >= 0) {
            ((AdapterView) obj).setOnItemClickListener((AdapterView.OnItemClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۤۥ۟, reason: not valid java name and contains not printable characters */
    public static void m2021(boolean z) {
        if (C0038.m4010() >= 0) {
            C0479z.k(z);
        }
    }

    /* JADX INFO: renamed from: ۢۤۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m2022(Object obj, Object obj2) {
        if (C0034.m3450() > 0) {
            return ((ObjectTypeAdapter) obj).read((JsonReader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۤ۠, reason: not valid java name and contains not printable characters */
    public static Pair m2023(Object obj) {
        if (C0072.m6216() > 0) {
            return ((SignatureAlgorithm) obj).getJcaSignatureAlgorithmAndParams();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m2024(Object obj) {
        if (C0077.m7272() < 0) {
            ((AbsListView) obj).invalidateViews();
        }
    }

    /* JADX INFO: renamed from: ۣۢۨ۟, reason: not valid java name and contains not printable characters */
    public static String m2025() {
        if (C0026.m2298() < 0) {
            return "OpenSSLAeadCipherChaCha20";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static long m2026(long j, long j2) {
        if (C0027.m2460() >= 0) {
            return Math.max(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۥۢۥ, reason: not valid java name and contains not printable characters */
    public static Object[] m2027(Object obj) {
        if (C0025.m2132() > 0) {
            return ((ApkVerificationIssue) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۣۧ, reason: not valid java name and contains not printable characters */
    public static C0370g4 m2028(Object obj) {
        if (C0075.m6893() > 0) {
            return ((C4) obj).t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۟۠, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m2029(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((ApkSigner.SignerConfig) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨۢ, reason: not valid java name and contains not printable characters */
    public static FileVisitResult m2030(Object obj, Object obj2) {
        if (C0029.m2791() >= 0) {
            return ((C0329a5) obj).a((Path) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static LoadDrawableUtils m2031() {
        if (C0035.m3569() <= 0) {
            return LoadDrawableUtils.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Shader m2032(Object obj, Object obj2) {
        if (C0072.m6216() > 0) {
            return ((Paint) obj).setShader((Shader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m2033(Object obj) {
        if (C0071.m6069() > 0) {
            return ((C0474y0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠۠, reason: not valid java name and contains not printable characters */
    public static Object m2034(Object obj, int i) {
        if (C0026.m2298() <= 0) {
            return Array.get(obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۥۨ, reason: not valid java name and contains not printable characters */
    public static void m2035(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0039.m4109() >= 0) {
            ((C0387j2) obj).q((D5) obj2, (ByteArrayOutputStream) obj3, (C0387j2) obj4);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۠۠, reason: not valid java name and contains not printable characters */
    public static DataSource m2036(Object obj) {
        if (C0039.m4109() > 0) {
            return DataSources.asDataSource((RandomAccessFile) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ, reason: not valid java name and contains not printable characters */
    public static DefaultApkSignerEngine.SignerConfig m2037(Object obj) {
        if (C0019.m1311() == 0) {
            return ((DefaultApkSignerEngine.SignerConfig.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m2038() {
        if (C0029.m2791() > 0) {
            return "SecretKeyEntry, ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۦ۠, reason: not valid java name and contains not printable characters */
    public static String m2039() {
        if (C0023.m1921() > 0) {
            return "OpenSSLEvpCipherAES$AES_256$ECB$NoPadding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static TextView m2040(Object obj) {
        if (C0063.m4427() > 0) {
            return ((U3) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۡۥ, reason: not valid java name and contains not printable characters */
    public static List m2041(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((V1SchemeVerifier.Result) obj).signers;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m2042(int i, boolean z, int i2, Object obj) {
        if (C0065.m4647() > 0) {
            return Asn1DerEncoder.a(i, z, i2, (byte[][]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۧۦ, reason: not valid java name and contains not printable characters */
    public static void m2043(Object obj, Object obj2, Object obj3) {
        if (C0031.m3075() > 0) {
            ManifestWriter.writeAttribute((OutputStream) obj, (Attributes.Name) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static byte[] m2044(Object obj, Object obj2) {
        if (C0063.m4427() > 0) {
            return ((X509Extension) obj).getExtensionValue((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۥۢ, reason: contains not printable characters */
    public static int m2045(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((DialogC0389j4) obj).z;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۨ, reason: contains not printable characters */
    public static void m2046(Object obj, int i, int i2, int i3) {
        if (C0037.m3837() < 0) {
            ((Calendar) obj).set(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public static FileVisitResult m2047(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((AbstractC0378i) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۤ, reason: contains not printable characters */
    public static void m2048(Object obj) {
        if (C0073.m6356() <= 0) {
            ((O1) obj).f();
        }
    }

    /* JADX INFO: renamed from: ۥۢۦۨ, reason: contains not printable characters */
    public static RelativeLayout m2049(Object obj) {
        if (C0067.m5468() < 0) {
            return ((C4) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۥ, reason: contains not printable characters */
    public static long m2050(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((C0371g5) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۤ۠, reason: contains not printable characters */
    public static int m2051(Object obj, int i) {
        if (C0019.m1311() <= 0) {
            return ((String) obj).indexOf(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۢۨ, reason: contains not printable characters */
    public static List m2052(Object obj) {
        if (C0031.m3075() > 0) {
            return ((V3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ, reason: contains not printable characters */
    public static byte[] m2053(Object obj) {
        if (C0070.m5903() > 0) {
            return ((AbstractC0384j) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣۢ, reason: contains not printable characters */
    public static boolean m2054(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((Deflater) obj).finished();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۧۢ, reason: contains not printable characters */
    public static List m2055(Object obj) {
        if (C0016.m717() < 0) {
            return Certificate.parseCertificates((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۡۧ, reason: contains not printable characters */
    public static int m2056(Object obj, Object obj2) {
        if (C0029.m2791() > 0) {
            return ((C0387j2) obj).l((PushbackInputStream) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۢ۟, reason: contains not printable characters */
    public static boolean m2057(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((T2) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۢۤ, reason: contains not printable characters */
    public static List m2058(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((SourceStampVerifier.Result.SourceStampInfo) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۢۧ, reason: contains not printable characters */
    public static FileChannel m2059(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((RandomAccessFileDataSink) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۥۧ, reason: contains not printable characters */
    public static ApkVerifier.Issue m2060() {
        if (C0064.m4578() >= 0) {
            return ApkVerifier.Issue.V4_SIG_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣ۟, reason: contains not printable characters */
    public static Path m2061(Object obj, Object obj2) {
        if (C0066.m4827() >= 0) {
            return Files.walkFileTree((Path) obj, (FileVisitor) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡۤ, reason: contains not printable characters */
    public static String m2062(String str) {
        String strM2993 = C0031.m2993();
        String strM29932 = C0031.m2993();
        for (int i = 0; i < 15; i++) {
            strM2993 = C0077.m7301(C0030.m2967(C0030.m2967(new StringBuffer(), strM2993), C0021.m1651(i)));
            strM29932 = C0077.m7301(C0027.m2461(C0030.m2967(new StringBuffer(), strM29932), ((int) (C0038.m3986() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0078.m7380(str) / 2);
        while (C0078.m7380(str) > 0) {
            C0070.m5921(byteArrayOutputStream, (m2051(strM2993, C0077.m7212(str, -2)) << 4) | m2051(strM2993, C0077.m7212(str, -1)));
        }
        byte[] bArrM7297 = C0077.m7297(byteArrayOutputStream);
        int length = bArrM7297.length;
        int iM7380 = C0078.m7380(strM29932);
        for (int i2 = 0; i2 < length; i2++) {
            bArrM7297[i2] = (byte) (bArrM7297[i2] ^ C0077.m7212(strM29932, i2 % iM7380));
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۦۥۢۦ, reason: contains not printable characters */
    public static void m2063(Object obj, Object obj2) {
        if (C0020.m1385() < 0) {
            ((T1) obj).l((Activity) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۦۥۧ, reason: contains not printable characters */
    public static void m2064(Object obj, Object obj2, Object obj3) {
        if (C0016.m717() < 0) {
            ((ApkSigningBlockUtils.Result) obj).addError((ApkVerifier.Issue) obj2, (Object[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦۦۨۤ, reason: contains not printable characters */
    public static long m2065(Object obj) {
        if (C0065.m4647() >= 0) {
            return Files.size((Path) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۧۡۧ, reason: contains not printable characters */
    public static int m2066(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((C0413n4) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۨ۠, reason: contains not printable characters */
    public static CentralDirectoryRecord m2067(Object obj) {
        if (C0039.m4109() >= 0) {
            return CentralDirectoryRecord.getRecord((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۥ۟, reason: contains not printable characters */
    public static int m2068(Object obj) {
        if (C0017.m846() > 0) {
            return ((DialogC0389j4) obj).y;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static void m2069(Object obj) throws IOException {
        if (C0031.m3075() > 0) {
            ((OutputStreamWriter) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۧ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static Uri m2070(Object obj) {
        if (C0067.m5468() < 0) {
            return ((ConsumerAbility) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m2071() {
        if (C0021.m1598() <= 0) {
            return "Alg.Alias.Signature.ECDSAwithSHA1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢ۠۠, reason: not valid java name and contains not printable characters */
    public static String m2072(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((X509Certificate) obj).getSigAlgName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۦۦ, reason: not valid java name and contains not printable characters */
    public static void m2073(Object obj, Object obj2) {
        if (C0036.m3653() <= 0) {
            ((ViewGroup) obj).removeView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۢۢ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Builder m2074(Object obj, Object obj2) {
        if (C0028.m2593() >= 0) {
            return ((ApkVerifier.Builder) obj).setV4SignatureFile((File) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۠۠, reason: not valid java name and contains not printable characters */
    public static int m2075(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((G0) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧۥۤ, reason: not valid java name and contains not printable characters */
    public static void m2076(Object obj, long j) {
        if (C0033.m3358() <= 0) {
            ((AutoClickPointerBean) obj).setId(j);
        }
    }

    /* JADX INFO: renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m2077(Object obj, Object obj2) {
        if (C0072.m6216() > 0) {
            return ((List) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥۤ, reason: not valid java name and contains not printable characters */
    public static C0387j2 m2078(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((Y3) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۧۤ, reason: not valid java name and contains not printable characters */
    public static int m2079(Object obj, Object obj2, int i, int i2) {
        if (C0037.m3837() < 0) {
            return ((C5) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۥ۟, reason: not valid java name and contains not printable characters */
    public static List m2080(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((V3SchemeSigner) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥۥ, reason: not valid java name and contains not printable characters */
    public static String m1945(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
