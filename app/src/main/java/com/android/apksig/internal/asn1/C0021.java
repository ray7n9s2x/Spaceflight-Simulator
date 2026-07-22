package com.android.apksig.internal.asn1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerificationIssue;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.JcaSignerEngine;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.SourceStampVerifier;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v4.V4SchemeSigner;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestWriter;
import com.android.apksig.internal.jar.SignatureFileWriter;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.oid.OidConstants;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.basetoollib.LoadDrawableUtils;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.C$Gson$Types;
import com.joke.plugin.gson.internal.LinkedTreeMap;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptActionBean;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.script.bean.ScriptProjectBean;
import com.joke.script.bean.ScriptRecordType;
import com.joke.script.bean.ScriptTouchBean;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.A1;
import com.zfork.multiplatforms.android.bomb.A5;
import com.zfork.multiplatforms.android.bomb.AbstractC0325a1;
import com.zfork.multiplatforms.android.bomb.AbstractC0400l3;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractC0416o1;
import com.zfork.multiplatforms.android.bomb.C0;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0330b;
import com.zfork.multiplatforms.android.bomb.C0361f2;
import com.zfork.multiplatforms.android.bomb.C0370g4;
import com.zfork.multiplatforms.android.bomb.C0381i2;
import com.zfork.multiplatforms.android.bomb.C0453u3;
import com.zfork.multiplatforms.android.bomb.C0468x0;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.DialogC0385j0;
import com.zfork.multiplatforms.android.bomb.DialogC0389j4;
import com.zfork.multiplatforms.android.bomb.DialogC0419o4;
import com.zfork.multiplatforms.android.bomb.DialogC0448t4;
import com.zfork.multiplatforms.android.bomb.E;
import com.zfork.multiplatforms.android.bomb.E2;
import com.zfork.multiplatforms.android.bomb.G0;
import com.zfork.multiplatforms.android.bomb.G4;
import com.zfork.multiplatforms.android.bomb.InterfaceC0401l4;
import com.zfork.multiplatforms.android.bomb.J2;
import com.zfork.multiplatforms.android.bomb.K;
import com.zfork.multiplatforms.android.bomb.L;
import com.zfork.multiplatforms.android.bomb.L0;
import com.zfork.multiplatforms.android.bomb.M4;
import com.zfork.multiplatforms.android.bomb.N3;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.Q;
import com.zfork.multiplatforms.android.bomb.Q4;
import com.zfork.multiplatforms.android.bomb.T2;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0480z0;
import com.zfork.multiplatforms.android.bomb.h5;
import com.zfork.multiplatforms.android.bomb.p5;
import com.zfork.multiplatforms.android.bomb.u5;
import j$.util.OptionalInt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.security.CodeSigner;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Dictionary;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.logging.Logger;
import org.conscrypt.C0111;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: com.android.apksig.internal.asn1.۟۠ۥۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0021 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f94short = {806, 2698};

    /* JADX INFO: renamed from: ۣ۟ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean f95 = true;

    /* JADX INFO: renamed from: ۟۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m1523(Object obj) {
        if (C0030.m2940() > 0) {
            ((Q4) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۟۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static L m1524(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((K) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m1525(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((p5) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m1526(Object obj, int i) {
        if (C0072.m6216() > 0) {
            ((URLConnection) obj).setReadTimeout(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m1527(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((ScriptProjectBean) obj).projectName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static OptionalInt m1528(Object obj) {
        if (C0078.m7450() > 0) {
            return ((V3SchemeSigner.Builder) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static StandardOpenOption m1529() {
        if (C0039.m4109() > 0) {
            return StandardOpenOption.TRUNCATE_EXISTING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠, reason: not valid java name and contains not printable characters */
    public static String m1530(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((M4) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m1531(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            return String.format((String) obj, (Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static C0370g4 m1532(Object obj) {
        if (C0017.m846() > 0) {
            return ((DialogC0448t4) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static PosixFilePermission m1533() {
        if (C0038.m4010() > 0) {
            return PosixFilePermission.OWNER_WRITE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۡ, reason: not valid java name and contains not printable characters */
    public static String m1534() {
        if (C0074.m6454() < 0) {
            return "Signature.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static RandomAccessFile m1535(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((C0453u3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static List m1536(Object obj) {
        if (C0038.m4010() > 0) {
            return ((ScriptActionBean) obj).interval;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static E m1537() {
        if (C0034.m3450() >= 0) {
            return h5.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧۧ, reason: not valid java name and contains not printable characters */
    public static String m1538() {
        if (C0023.m1921() >= 0) {
            return "Public.keys.in.reply.and.keystore.don.t.match";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۢ۠, reason: not valid java name and contains not printable characters */
    public static void m1539(Object obj, Object obj2, Object obj3) {
        if (C0111.m13165() < 0) {
            ((T2) obj).c((ConsumerAbility) obj2, (A5) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m1540(Object obj, Object obj2) {
        if (C0016.m717() <= 0) {
            ((ViewOnClickListenerC0480z0) obj).onClick((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۤ, reason: not valid java name and contains not printable characters */
    public static Set m1541(Object obj, Object obj2) {
        if (C0070.m5903() > 0) {
            return C0018.m1022((Path) obj, (LinkOption[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static PosixFilePermission m1542() {
        if (C0032.m3184() < 0) {
            return C0073.m6340();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۢ, reason: not valid java name and contains not printable characters */
    public static List m1543(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((ApkSigningBlockUtils.Result) obj).signers;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static String m1544() {
        if (C0027.m2460() > 0) {
            return "What.is.the.name.of.your.organization.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static void m1545(Object obj, Object obj2) {
        if (C0038.m4010() >= 0) {
            C0017.m919(C0036.m3726((SourceStampVerifier.Result) obj), (SourceStampVerifier.Result.SignerInfo) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۣ, reason: not valid java name and contains not printable characters */
    public static URLConnection m1546(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((URL) obj).openConnection();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static int m1547(Object obj) {
        if (C0033.m3358() < 0) {
            return ((J2) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static Integer m1548(int i) {
        if (C0035.m3569() < 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m1549(Object obj, Object obj2, Object obj3) {
        if (C0065.m4647() > 0) {
            return ((AlertDialog.Builder) obj).setNegativeButton((CharSequence) obj2, (DialogInterface.OnClickListener) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m1550() {
        if (C0066.m4827() > 0) {
            return "SHA1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m1551(Object obj, int i) {
        if (C0016.m717() <= 0) {
            return ((StringBuilder) obj).append(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m1552(Object obj, Object obj2) {
        if (C0030.m2940() >= 0) {
            return ((AbstractC0416o1) obj).b((PushbackInputStream) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۥۧ, reason: not valid java name and contains not printable characters */
    public static Object m1553(Object obj) {
        if (C0033.m3358() < 0) {
            return ((View) obj).getTag();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۨۥ, reason: not valid java name and contains not printable characters */
    public static void m1554(Object obj, int i, int i2) {
        if (C0073.m6356() < 0) {
            ((AtomicIntegerArray) obj).set(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۦۨ, reason: not valid java name and contains not printable characters */
    public static FileTime m1555(long j, Object obj) {
        if (C0068.m5678() >= 0) {
            return m1570(j, (TimeUnit) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۨۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m1556(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((ApkVerificationIssue) obj).getParams();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡۧ, reason: not valid java name and contains not printable characters */
    public static List m1557(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0025.m2132() >= 0) {
            return V1SchemeSigner.signManifest((List) obj, (DigestAlgorithm) obj2, (List) obj3, (String) obj4, (V1SchemeSigner.OutputManifestFile) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m1558(Object obj) {
        if (C0068.m5678() > 0) {
            return ((ApkSigner.Builder) obj).s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۤۢ, reason: not valid java name and contains not printable characters */
    public static TextView m1559(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((DialogC0419o4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦ۟, reason: not valid java name and contains not printable characters */
    public static Map m1560() {
        if (C0064.m4578() > 0) {
            return OidConstants.OID_TO_JCA_DIGEST_ALG;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۧۤ, reason: not valid java name and contains not printable characters */
    public static int m1561() {
        if (C0078.m7450() > 0) {
            return E2.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static int m1562(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((C0468x0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1563(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((Cursor) obj).moveToNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۧ, reason: not valid java name and contains not printable characters */
    public static RunnablesExecutor m1564() {
        if (C0036.m3653() <= 0) {
            return RunnablesExecutor.SINGLE_THREADED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static int m1565(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((View) obj).getTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۤ۟, reason: not valid java name and contains not printable characters */
    public static Node m1566(Object obj, int i) {
        if (C0074.m6454() < 0) {
            return ((NodeList) obj).item(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m1567(Object obj) {
        if (C0078.m7450() > 0) {
            return ((C4) obj).D;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢ۠, reason: not valid java name and contains not printable characters */
    public static List m1568(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((V1SchemeSigner.SignerConfig) obj).certificates;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۦ۠, reason: not valid java name and contains not printable characters */
    public static Integer m1569(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((ApkSigner) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢۨ, reason: not valid java name and contains not printable characters */
    public static FileTime m1570(long j, Object obj) {
        if (C0031.m3075() > 0) {
            return FileTime.from(j, (TimeUnit) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۧۡ, reason: not valid java name and contains not printable characters */
    public static void m1571(Object obj, Object obj2) {
        if (C0064.m4578() > 0) {
            ((AbstractC0325a1) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۡ, reason: not valid java name and contains not printable characters */
    public static String m1572(Object obj, int i, int i2) {
        if (C0024.m2011() < 0) {
            return CentralDirectoryRecord.getName((ByteBuffer) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static ScriptRecordType m1573() {
        if (C0036.m3653() <= 0) {
            return ScriptRecordType.CLICK;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m1574() {
        if (C0070.m5903() > 0) {
            return "PKCS.10.Certificate.Request.Version.1.0.Subject.s.Public.Key.s.format.s.key.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m1575() {
        if (C0027.m2460() > 0) {
            return f94short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۥۢ, reason: not valid java name and contains not printable characters */
    public static Logger m1576() {
        if (C0027.m2460() > 0) {
            return AbstractC0400l3.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static void m1577(Object obj, Object obj2, Object obj3) {
        if (C0038.m4010() >= 0) {
            ManifestWriter.writeIndividualSection((OutputStream) obj, (String) obj2, (Attributes) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۥ, reason: not valid java name and contains not printable characters */
    public static long m1578(Object obj) {
        if (C0033.m3358() < 0) {
            return ZipUtils.getUnsignedInt32((ByteBuffer) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static List m1579(Object obj) {
        if (C0019.m1311() == 0) {
            return ((ApkVerifier.Result.V2SchemeSignerInfo) obj).getContentDigests();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage.SignerConfig m1580(Object obj) {
        if (m1598() <= 0) {
            return ((SigningCertificateLineage.Builder) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m1581(Object obj) {
        if (C0031.m3075() >= 0) {
            L.f((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1582(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((File) obj).canRead();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static TextView m1583(Object obj) {
        if (C0029.m2791() > 0) {
            return ((DialogC0448t4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static Locale m1584() {
        if (C0029.m2791() >= 0) {
            return Locale.ROOT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m1585(Object obj, Object obj2, long j) {
        if (C0077.m7272() < 0) {
            return LocalFileRecord.getUncompressedData((DataSource) obj, (CentralDirectoryRecord) obj2, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1586() {
        if (C0065.m4647() > 0) {
            return C0.M;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static String m1587() {
        if (C0027.m2460() > 0) {
            return "PKCS#8|X.509";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m1588(Object obj) {
        if (C0018.m1064() > 0) {
            return C$Gson$Types.hashCodeOrZero(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۢۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m1589(Object obj, Object obj2) {
        if (C0072.m6216() > 0) {
            return ((LoadDrawableUtils) obj).getDrawable((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۤۥ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m1590() {
        if (C0065.m4647() > 0) {
            return ApkVerifier.Issue.SOURCE_STAMP_CERT_DIGEST_AND_SIG_BLOCK_MISSING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۢ, reason: not valid java name and contains not printable characters */
    public static void m1591(Object obj, int i) {
        if (C0016.m717() <= 0) {
            ((ListView) obj).setDividerHeight(i);
        }
    }

    /* JADX INFO: renamed from: ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1592(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((SharedPreferences.Editor) obj).commit();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۧ۟, reason: not valid java name and contains not printable characters */
    public static Uri m1593(Object obj) {
        if (C0020.m1385() < 0) {
            return ((G4) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۨۧ, reason: not valid java name and contains not printable characters */
    public static NamedNodeMap m1594(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((Node) obj).getAttributes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۦۧ, reason: not valid java name and contains not printable characters */
    public static int m1595(Object obj) {
        if (C0070.m5903() > 0) {
            return ((C0330b) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧۥ۟, reason: not valid java name and contains not printable characters */
    public static List m1596(Object obj) {
        if (C0035.m3569() <= 0) {
            return Arrays.asList((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m1597(Object obj, Object obj2) {
        if (C0034.m3450() >= 0) {
            return ((AlertDialog.Builder) obj).setTitle((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟۟, reason: not valid java name and contains not printable characters */
    public static int m1598() {
        return (-1748891) ^ C0032.m3236((Object) "ۡۧۧ");
    }

    /* JADX INFO: renamed from: ۢ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m1599() {
        if (C0074.m6454() < 0) {
            return "OpenSSLCipherRSA$OAEP$SHA256";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۥۤ, reason: not valid java name and contains not printable characters */
    public static void m1600(Object obj, int i, int i2) {
        if (C0017.m846() >= 0) {
            ((Calendar) obj).set(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۢۤۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m1601(Object obj, Object obj2, Object obj3) {
        if (C0073.m6356() < 0) {
            return ((Dictionary) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۢ۠, reason: not valid java name and contains not printable characters */
    public static void m1602(Object obj, Object obj2) {
        if (C0077.m7272() < 0) {
            ((SourceStampVerifier.Result.SignerInfo) obj).setSigningCertificate((X509Certificate) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۧۦۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m1603(Object obj, Object obj2, int i, int i2) {
        if (C0037.m3837() <= 0) {
            return V1SchemeVerifier.access$1100((String) obj, (byte[]) obj2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۨ, reason: not valid java name and contains not printable characters */
    public static TextView m1604(Object obj) {
        if (C0036.m3653() < 0) {
            return ((DialogC0389j4) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static String m1605(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((O2) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static Activity m1606(Object obj) {
        if (C0017.m846() >= 0) {
            return ((G0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static long m1607(Object obj) {
        if (m1598() <= 0) {
            return ((N3) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static float m1608(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((View) obj).getY();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۢۡ۟, reason: not valid java name and contains not printable characters */
    public static int[] m1609(Object obj) {
        if (C0111.m13165() < 0) {
            return ((u5) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۢ, reason: not valid java name and contains not printable characters */
    public static Type[] m1610(Object obj) {
        if (C0072.m6216() > 0) {
            return ((WildcardType) obj).getUpperBounds();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۢ۟, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.SignerConfig m1611(Object obj) {
        if (C0063.m4427() > 0) {
            return ((V4SchemeSigner.SignerConfig) obj).v4Config;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡ, reason: not valid java name and contains not printable characters */
    public static void m1612(Object obj, Object obj2, Object obj3) {
        if (C0065.m4647() > 0) {
            ((ApkVerifier.Result) obj).addError((ApkVerifier.Issue) obj2, (Object[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۤ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static double m1613(Object obj) {
        return C0078.m7450() > 0 ? ((L0) obj).c : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۤۡۦۨ, reason: not valid java name and contains not printable characters */
    public static int m1614(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((a) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۢۤۦ, reason: not valid java name and contains not printable characters */
    public static List m1615(Object obj) {
        if (C0038.m4010() > 0) {
            return ((ApkVerifier.Result.V4SchemeSignerInfo) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۡۦ, reason: not valid java name and contains not printable characters */
    public static void m1616(Object obj, float f, float f2) {
        if (C0065.m4647() > 0) {
            ((android.graphics.Path) obj).lineTo(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۤۨۦۡ, reason: not valid java name and contains not printable characters */
    public static String m1617(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((ScriptProjectAliasBean) obj).name;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠۠, reason: contains not printable characters */
    public static AutoClickPointerBean m1618(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((DialogC0385j0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۥ, reason: contains not printable characters */
    public static float m1619(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((ScriptTouchBean) obj).y;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۠ۡۡ, reason: contains not printable characters */
    public static int m1620(Object obj, Object obj2, Object obj3) {
        if (C0019.m1311() <= 0) {
            return Log.w((String) obj, (String) obj2, (Throwable) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۨ, reason: contains not printable characters */
    public static File m1621(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((ApkSigner) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۡۨ, reason: contains not printable characters */
    public static void m1622(Object obj, Object obj2) {
        if (C0072.m6216() >= 0) {
            SignatureFileWriter.writeMainSection((OutputStream) obj, (Attributes) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢۤ۟, reason: contains not printable characters */
    public static View m1623(Object obj) {
        if (C0039.m4109() > 0) {
            return ((A1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦ, reason: contains not printable characters */
    public static void m1624(Object obj) {
        if (C0026.m2298() <= 0) {
            AbstractC0406m3.p((Application) obj);
        }
    }

    /* JADX INFO: renamed from: ۥۢۦۧ, reason: contains not printable characters */
    public static CodeSigner[] m1625(Object obj) {
        if (C0065.m4647() > 0) {
            return ((JarEntry) obj).getCodeSigners();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۥ۟, reason: contains not printable characters */
    public static ImageView m1626(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((C0361f2) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۠ۦ, reason: contains not printable characters */
    public static TextView m1627(Object obj) {
        if (C0077.m7272() < 0) {
            return ((C4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۦ, reason: contains not printable characters */
    public static Paint.FontMetricsInt m1628(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((Paint) obj).getFontMetricsInt();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۡۦ, reason: contains not printable characters */
    public static String m1629(Object obj) {
        if (C0039.m4109() > 0) {
            return ((JcaSignerEngine) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠۠ۥ, reason: contains not printable characters */
    public static Bundle m1630(Object obj) {
        if (C0025.m2132() > 0) {
            return ((ApplicationInfo) obj).metaData;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۦۣ, reason: contains not printable characters */
    public static String m1631(String str) {
        String strM2993 = C0031.m2993();
        String strM29932 = C0031.m2993();
        for (int i = 0; i < 15; i++) {
            strM2993 = C0077.m7301(C0030.m2967(C0030.m2967(new StringBuffer(), strM2993), m1651(i)));
            strM29932 = C0077.m7301(C0027.m2461(C0030.m2967(new StringBuffer(), strM29932), ((int) (C0038.m3986() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0078.m7380(str) / 2);
        for (int i2 = 0; i2 < C0078.m7380(str); i2 += 2) {
            C0070.m5921(byteArrayOutputStream, (C0024.m2051(strM2993, C0077.m7212(str, i2)) << 4) | C0024.m2051(strM2993, C0077.m7212(str, i2 + 1)));
        }
        byte[] bArrM7297 = C0077.m7297(byteArrayOutputStream);
        String strM1728 = C0022.m1728(m1575(), 0, 1, 839);
        while (C0078.m7380(strM1728) > 0) {
            strM1728 = C0031.m2993();
            if (C0078.m7380(strM1728) == 0) {
                strM1728 = C0070.m5942(m1575(), 1, 1, 2795);
            }
        }
        int iM7380 = C0078.m7380(strM1728);
        int iM73802 = C0078.m7380(strM29932);
        for (int i3 = 0; i3 < iM7380; i3++) {
            bArrM7297[i3] = (byte) (bArrM7297[i3] ^ C0077.m7212(strM29932, i3 % iM73802));
        }
        for (int iM73803 = 0; iM73803 < bArrM7297.length; iM73803 = C0078.m7380(C0031.m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۦۣۤۢ, reason: contains not printable characters */
    public static AutoClickPlanBean m1632(Object obj) {
        if (C0018.m1064() > 0) {
            return ((L) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۤۡ, reason: contains not printable characters */
    public static String m1633() {
        if (C0039.m4109() >= 0) {
            return "Secret.key.not.generated.alias.alias.already.exists";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۦۤ, reason: contains not printable characters */
    public static int m1634(Object obj) {
        if (C0065.m4647() > 0) {
            return ((Q) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۧۧ, reason: contains not printable characters */
    public static void m1635(Object obj, Object obj2, long j) {
        if (C0066.m4827() > 0) {
            ((Timer) obj).schedule((TimerTask) obj2, j);
        }
    }

    /* JADX INFO: renamed from: ۦۣۨ۟, reason: contains not printable characters */
    public static DateFormat m1636(int i, Object obj) {
        if (C0074.m6454() < 0) {
            return DateFormat.getDateInstance(i, (Locale) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m1637(Object obj) {
        if (C0029.m2791() > 0) {
            ((LinkedTreeMap) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m1638() {
        if (C0065.m4647() >= 0) {
            return "Signature.NONEwithRSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1639(Object obj, Object obj2) {
        if (C0072.m6216() >= 0) {
            return ((SigningCertificateLineage) obj).isCertificateLatestInLineage((X509Certificate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Set m1640(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((LinkedTreeMap) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۥۨ, reason: not valid java name and contains not printable characters */
    public static String m1641(Object obj, int i) {
        if (C0020.m1385() < 0) {
            return ((Q) obj).a(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣ۠, reason: not valid java name and contains not printable characters */
    public static String m1642() {
        if (C0033.m3358() < 0) {
            return "What.is.your.first.and.last.name.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Looper m1643() {
        if (C0024.m2011() < 0) {
            return Looper.myLooper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨ, reason: not valid java name and contains not printable characters */
    public static void m1644(Object obj, float f) {
        if (C0074.m6454() < 0) {
            ((AutoClickPointerBean) obj).setRelativePercentY(f);
        }
    }

    /* JADX INFO: renamed from: ۧۨۧۦ, reason: not valid java name and contains not printable characters */
    public static Pair m1645(Object obj, Object obj2, Object obj3) {
        if (C0026.m2298() < 0) {
            return V1SchemeVerifier.parseManifest((byte[]) obj, (Set) obj2, (V1SchemeVerifier.Result) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m1646(Object obj) {
        if (C0036.m3653() <= 0) {
            ((C0381i2) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۣۨۢۥ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m1647(Object obj, int i, int i2) {
        if (C0024.m2011() < 0) {
            return ((ByteBuffer) obj).putInt(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1648(int i) {
        if (C0025.m2132() >= 0) {
            return Modifier.isInterface(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۧ۟, reason: not valid java name and contains not printable characters */
    public static void m1649(Object obj) {
        if (C0029.m2791() >= 0) {
            ((InterfaceC0401l4) obj).cancel();
        }
    }

    /* JADX INFO: renamed from: ۨۧۡۦ, reason: not valid java name and contains not printable characters */
    public static String m1651(int i) {
        if (C0072.m6216() > 0) {
            return Integer.toHexString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1652(byte b, int i) {
        if (C0024.m2011() < 0) {
            return AbstractC0406m3.q(b, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤۨۧ, reason: not valid java name and contains not printable characters */
    public static String m1650(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
