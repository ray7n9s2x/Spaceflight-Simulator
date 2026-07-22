package com.android.apksig.zip;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.KeyConfig;
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
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SigningCertificateLineage;
import com.android.apksig.internal.apk.v4.V4SchemeSigner;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1Class;
import com.android.apksig.internal.asn1.Asn1Field;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.asn1.ber.BerEncoding;
import com.android.apksig.internal.asn1.ber.InputStreamBerDataValueReader;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.InclusiveIntRange;
import com.android.apksig.internal.x509.SubjectPublicKeyInfo;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.EocdRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.kms.KmsSignerEngine;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickContentBean;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonObject;
import com.joke.plugin.gson.annotations.Expose;
import com.joke.plugin.gson.internal.PreJava9DateFormatProvider;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonToken;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.speedfloatingball.bean.CloudBean;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.AbstractC0372h;
import com.zfork.multiplatforms.android.bomb.AbstractC0400l3;
import com.zfork.multiplatforms.android.bomb.AbstractC0406m3;
import com.zfork.multiplatforms.android.bomb.AbstractViewOnClickListenerC0465w3;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0334b3;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.C0381i2;
import com.zfork.multiplatforms.android.bomb.C0387j2;
import com.zfork.multiplatforms.android.bomb.C0402m;
import com.zfork.multiplatforms.android.bomb.C0404m1;
import com.zfork.multiplatforms.android.bomb.C0413n4;
import com.zfork.multiplatforms.android.bomb.C0444t0;
import com.zfork.multiplatforms.android.bomb.C0476y2;
import com.zfork.multiplatforms.android.bomb.C0479z;
import com.zfork.multiplatforms.android.bomb.C4;
import com.zfork.multiplatforms.android.bomb.D1;
import com.zfork.multiplatforms.android.bomb.D5;
import com.zfork.multiplatforms.android.bomb.DialogC0373h0;
import com.zfork.multiplatforms.android.bomb.DialogC0419o4;
import com.zfork.multiplatforms.android.bomb.E1;
import com.zfork.multiplatforms.android.bomb.E5;
import com.zfork.multiplatforms.android.bomb.F2;
import com.zfork.multiplatforms.android.bomb.F3;
import com.zfork.multiplatforms.android.bomb.G1;
import com.zfork.multiplatforms.android.bomb.G5;
import com.zfork.multiplatforms.android.bomb.I1;
import com.zfork.multiplatforms.android.bomb.InterfaceC0375h2;
import com.zfork.multiplatforms.android.bomb.K0;
import com.zfork.multiplatforms.android.bomb.N2;
import com.zfork.multiplatforms.android.bomb.O1;
import com.zfork.multiplatforms.android.bomb.O2;
import com.zfork.multiplatforms.android.bomb.P4;
import com.zfork.multiplatforms.android.bomb.U3;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0332b1;
import com.zfork.multiplatforms.android.bomb.W;
import com.zfork.multiplatforms.android.bomb.Y2;
import com.zfork.multiplatforms.android.bomb.h5;
import com.zfork.multiplatforms.android.bomb.r5;
import com.zfork.multiplatforms.android.bomb.v5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.security.interfaces.ECKey;
import java.security.spec.ECParameterSpec;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.zip.CRC32;
import javax.xml.parsers.DocumentBuilder;
import org.conscrypt.C0111;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import sun.security.pkcs.PKCS10Attribute;

/* JADX INFO: renamed from: com.android.apksig.zip.ۥۣ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0036 {

    /* JADX INFO: renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean f142;

    /* JADX INFO: renamed from: ۟۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m3641(Object obj) {
        if (C0018.m1064() > 0) {
            return ((C0387j2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static void m3642(Object obj, Object obj2) {
        if (C0032.m3184() <= 0) {
            C0032.m3233((Path) obj, (EnumSet) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m3643(Object obj, Object obj2) {
        if (C0077.m7272() <= 0) {
            return Asn1BerParser.parse((ByteBuffer) obj, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3644() {
        if (C0077.m7272() <= 0) {
            return ApkVerifier.Issue.V2_SIG_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3645(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((C0404m1) obj).c();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۥۥۣ, reason: not valid java name and contains not printable characters */
    public static AtomicInteger m3646(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((C0476y2) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m3647(Object obj, Object obj2, Object obj3) {
        if (C0017.m846() > 0) {
            return ((KeyConfig) obj).match((Function) obj2, (Function) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3648(Object obj) {
        if (C0070.m5903() > 0) {
            return ((HashSet) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static SigningCertificateLineage m3649(Object obj) {
        if (C0064.m4578() > 0) {
            return C0028.m2667((ApkSigner.SignerConfig.Builder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۨۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3650(Object obj) {
        if (C0035.m3569() <= 0) {
            return Asn1BerParser.b((Class) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3651() {
        if (C0065.m4647() >= 0) {
            return ApkVerifier.Issue.V4_SIG_APK_TREE_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static short m3652(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((CentralDirectoryRecord) obj).b;
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m3653() {
        return (-1748918) ^ C0032.m3236((Object) "ۡۨۢ");
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m3654() {
        if (C0030.m2940() > 0) {
            return "Alias.alias.references.an.entry.type.that.is.not.a.private.key.entry.The.keyclone.command.only.supports.cloning.of.private.key";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static TextView m3655(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((I1) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۢۡ, reason: not valid java name and contains not printable characters */
    public static ApkUtils.ZipSections m3656(Object obj) {
        if (C0020.m1385() <= 0) {
            return ApkUtils.findZipSections((DataSource) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3657(Object obj) {
        if (C0067.m5468() < 0) {
            return ((Iterator) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static C0479z m3658(Object obj, Object obj2) {
        if (C0073.m6356() < 0) {
            return C0479z.e((Context) obj, (Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static JsonToken m3659() {
        if (C0024.m2011() <= 0) {
            return JsonToken.END_DOCUMENT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3660() {
        if (C0019.m1311() <= 0) {
            return ApkVerifier.Issue.JAR_SIG_DUPLICATE_ZIP_ENTRY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static int m3661(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((G5) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static TextView m3662(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((DialogC0373h0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۨ۟, reason: not valid java name and contains not printable characters */
    public static void m3663(Object obj) {
        if (C0024.m2011() < 0) {
            AbstractC0372h.s(obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۦۣ, reason: not valid java name and contains not printable characters */
    public static String m3664() {
        if (C0073.m6356() <= 0) {
            return "Password.is.too.short.must.be.at.least.6.characters";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۣ, reason: not valid java name and contains not printable characters */
    public static Class m3665() {
        if (C0077.m7272() <= 0) {
            return Void.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m3666(int i) {
        if (C0077.m7272() <= 0) {
            return Character.isWhitespace(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧۥۤ, reason: not valid java name and contains not printable characters */
    public static int m3667(Object obj) {
        if (C0019.m1311() == 0) {
            return V4SchemeSigner.digestAlgorithmSortingOrder((ContentDigestAlgorithm) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static List m3668(Object obj) {
        if (C0069.m5781() < 0) {
            return ((ApkVerifier.Result.SourceStampInfo) obj).getWarnings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3669(Object obj, Object obj2, boolean z) {
        if (C0111.m13165() < 0) {
            return O1.c((O1) obj, (AutoClickPlanBean) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static long m3670(Object obj) {
        if (C0035.m3569() < 0) {
            return ((AbstractViewOnClickListenerC0465w3) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static long m3671(Object obj) {
        if (C0032.m3184() < 0) {
            return ((O2) obj).h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡ۠, reason: not valid java name and contains not printable characters */
    public static String m3672() {
        if (C0077.m7272() < 0) {
            return "OpenSSLEvpCipherAES$AES_128$ECB$PKCS5Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۦ, reason: not valid java name and contains not printable characters */
    public static KmsSignerEngine m3673(Object obj, Object obj2) {
        if (C0111.m13165() <= 0) {
            return KmsSignerEngine.fromKmsConfig((KeyConfig.Kms) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۥۢ, reason: not valid java name and contains not printable characters */
    public static long m3674(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((ScriptProjectAliasBean) obj).id;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Annotation m3675(Object obj) {
        if (C0024.m2011() <= 0) {
            return C0111.m13062((Class) obj, Asn1Class.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3676(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((Dialog) obj).isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۧۨ, reason: not valid java name and contains not printable characters */
    public static void m3677(Object obj, int i) {
        if (C0033.m3358() <= 0) {
            ((ProgressBar) obj).setProgress(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۥۧ, reason: not valid java name and contains not printable characters */
    public static int m3679(Object obj) {
        if (C0031.m3075() > 0) {
            return ((K0) obj).m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m3680(Object obj, boolean z) {
        if (C0074.m6454() < 0) {
            return AbstractC0406m3.a((char[]) obj, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3681(Object obj, int i, long j, long j2) {
        if (C0067.m5468() <= 0) {
            return EocdRecord.createWithModifiedCentralDirectoryInfo((ByteBuffer) obj, i, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m3682(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((PKCS10Attribute) obj).getAttributeValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static Boolean m3683() {
        if (C0020.m1385() < 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static TextView m3684(Object obj) {
        if (C0065.m4647() > 0) {
            return ((K0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۧ, reason: not valid java name and contains not printable characters */
    public static Document m3685(Object obj, Object obj2) {
        if (C0077.m7272() < 0) {
            return ((DocumentBuilder) obj).parse((InputStream) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m3686(Object obj, Object obj2) {
        if (C0016.m717() <= 0) {
            ((SigningCertificateLineage) obj).writeToFile((File) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟۟, reason: not valid java name and contains not printable characters */
    public static ApkSigningBlockUtils.SignerConfig m3687(Object obj, Object obj2, boolean z, int i) {
        if (C0021.m1598() <= 0) {
            return ((DefaultApkSignerEngine) obj).d((DefaultApkSignerEngine.SignerConfig) obj2, z, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static C0413n4 m3688(Object obj) {
        if (C0070.m5903() > 0) {
            return ((DialogC0419o4) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static String m3689() {
        if (C0025.m2132() >= 0) {
            return "Submit.this.to.your.CA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۥۨ, reason: not valid java name and contains not printable characters */
    public static Button m3690(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((C0351e) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨۥ, reason: not valid java name and contains not printable characters */
    public static int m3691(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((ApkVerifier.Result.V2SchemeSignerInfo) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠۟, reason: not valid java name and contains not printable characters */
    public static DigestAlgorithm m3692(Object obj) {
        if (C0070.m5903() > 0) {
            return ((V1SchemeSigner.SignerConfig) obj).signatureDigestAlgorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۦۨ, reason: not valid java name and contains not printable characters */
    public static ECParameterSpec m3693(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((ECKey) obj).getParams();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3694(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((ApkSigner.Builder) obj).D;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3695() {
        if (C0030.m2940() >= 0) {
            return ApkVerifier.Issue.JAR_SIG_MANIFEST_MAIN_SECTION_DIGEST_DID_NOT_VERIFY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static Integer m3696(Object obj) {
        if (C0023.m1921() > 0) {
            return ((ApkVerifier) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠۠, reason: not valid java name and contains not printable characters */
    public static float m3697(Object obj) {
        if (C0032.m3184() < 0) {
            return Float.parseFloat((String) obj);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۦۤۢۤ, reason: not valid java name and contains not printable characters */
    public static String m3698(Object obj) {
        if (C0030.m2940() > 0) {
            return ((G1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static TextView m3699(Object obj, Object obj2) {
        if (C0069.m5781() <= 0) {
            return K0.d((Context) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static Activity m3700(Object obj) {
        if (m3653() < 0) {
            return ((C0402m) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۨ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3701() {
        if (m3653() <= 0) {
            return ApkVerifier.Issue.V3_INCONSISTENT_SDK_VERSIONS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m3702(Object obj, Object obj2, Object obj3) {
        if (C0024.m2011() <= 0) {
            ((ViewGroup) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static FrameLayout.LayoutParams m3703(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((U3) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۣ, reason: not valid java name and contains not printable characters */
    public static boolean m3704(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((AccessibleObject) obj).isAccessible();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3705(Object obj, int i) {
        if (C0017.m846() >= 0) {
            ((TextView) obj).setText(i);
        }
    }

    /* JADX INFO: renamed from: ۠۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m3706(Object obj, Object obj2) {
        if (C0029.m2791() > 0) {
            ((O1) obj).h((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m3707(Object obj, Object obj2) {
        if (C0078.m7450() > 0) {
            return C0068.m5634((BerDataValue) obj, (Class) obj2, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3708(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((Matcher) obj).matches();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static String m3709(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((Node) obj).getNodeName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static void m3710(Object obj, int i) {
        if (C0028.m2593() >= 0) {
            ((SourceStampVerifier.Result.SignerInfo) obj).setMinSdkVersion(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3711(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((Expose) obj).serialize();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static String m3712(Object obj, Object obj2) {
        if (C0020.m1385() <= 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static Asn1Type m3713(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((Asn1Field) obj).type();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static r5 m3714(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((D5) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
    public static File m3715(Object obj) {
        if (C0019.m1311() == 0) {
            return ((ApkSigner.Builder) obj).x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۦ, reason: not valid java name and contains not printable characters */
    public static void m3716(Object obj, int i) {
        if (C0024.m2011() < 0) {
            ((WebSettings) obj).setCacheMode(i);
        }
    }

    /* JADX INFO: renamed from: ۣۡۦ۟, reason: not valid java name and contains not printable characters */
    public static ApkSignerEngine.InspectJarEntryRequest m3717(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((ApkSignerEngine.InputJarEntryInstructions) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۦ, reason: not valid java name and contains not printable characters */
    public static JsonObject m3718(Object obj) {
        if (C0029.m2791() > 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m3719() {
        if (C0071.m6069() >= 0) {
            return "OpenSSLMac$AesCmac";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static String m3720(Object obj) {
        if (C0065.m4647() > 0) {
            return ((DefaultApkSignerEngine.SignerConfig.Builder) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۢۨ, reason: not valid java name and contains not printable characters */
    public static long m3721(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((D1) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۨ۟, reason: not valid java name and contains not printable characters */
    public static Path m3722(Object obj) {
        if (C0063.m4427() >= 0) {
            return C0064.m4503((Path) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦۦ, reason: not valid java name and contains not printable characters */
    public static void m3723(Object obj, Object obj2) {
        if (C0038.m4010() >= 0) {
            ((P4) obj).a((E1) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۠۟۠, reason: not valid java name and contains not printable characters */
    public static InputStream m3724(Object obj) {
        if (C0074.m6454() < 0) {
            return ((InputStreamBerDataValueReader) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static int m3725(Object obj) {
        if (C0075.m6893() > 0) {
            return ((ViewOnClickListenerC0332b1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢۤۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3726(Object obj) {
        if (C0028.m2593() > 0) {
            return ((SourceStampVerifier.Result) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۤ, reason: not valid java name and contains not printable characters */
    public static void m3727(Object obj) throws IOException {
        if (C0030.m2940() >= 0) {
            ((InputStream) obj).reset();
        }
    }

    /* JADX INFO: renamed from: ۣۢۢۦ, reason: not valid java name and contains not printable characters */
    public static List m3728(Object obj, Object obj2) {
        if (C0075.m6893() > 0) {
            return ((InclusiveIntRange) obj).getValuesNotIn((List) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3729(Object obj) {
        if (C0017.m846() > 0) {
            return ((SigningCertificateLineage.SignerCapabilities) obj).hasPermission();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۤۢۡ, reason: not valid java name and contains not printable characters */
    public static N2 m3730() {
        if (C0076.m6903() <= 0) {
            return N2.k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۤۦ, reason: not valid java name and contains not printable characters */
    public static int m3731(Object obj) {
        if (C0024.m2011() < 0) {
            return ((AutoClickContentBean) obj).getLoopInterval();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۡ۠, reason: not valid java name and contains not printable characters */
    public static BerDataValue m3732(Object obj) {
        if (C0072.m6216() >= 0) {
            return InputStreamBerDataValueReader.a((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۤ, reason: not valid java name and contains not printable characters */
    public static int m3733(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((DefaultApkSignerEngine.SignerConfig.Builder) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۧۨ, reason: not valid java name and contains not printable characters */
    public static void m3734(Object obj, Object obj2, int i, int i2) {
        if (C0035.m3569() <= 0) {
            ((OutputStream) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۠۠, reason: not valid java name and contains not printable characters */
    public static String m3735() {
        if (C0065.m4647() > 0) {
            return "Alg.Alias.Signature.SHA384/ECDSA";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۦ, reason: not valid java name and contains not printable characters */
    public static int m3736(Object obj, Object obj2) {
        if (C0075.m6893() >= 0) {
            return Log.w((String) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۨۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m3737(Object obj) {
        if (C0028.m2593() > 0) {
            return F3.g((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3738(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۢ۠۠, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m3739(Object obj) {
        if (C0070.m5903() > 0) {
            return ((C0444t0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۡ, reason: not valid java name and contains not printable characters */
    public static String m3740() {
        if (C0035.m3569() <= 0) {
            return "Alg.Alias.Cipher.RSA/None/PKCS1Padding";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦۢ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3741(Object obj, Object obj2) {
        if (C0037.m3837() <= 0) {
            return ((StringBuilder) obj).append(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦۥ, reason: not valid java name and contains not printable characters */
    public static String m3742(Object obj, int i, int i2, Object obj2) {
        if (C0066.m4827() >= 0) {
            return h5.b((byte[]) obj, i, i2, (v5) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m3743(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((ApkSigResult) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m3744(Object obj) {
        if (C0020.m1385() <= 0) {
            ((E5) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۤۧۥ۠, reason: not valid java name and contains not printable characters */
    public static Collection m3745(Object obj, Object obj2, int i, int i2) {
        if (C0074.m6454() < 0) {
            return V1SchemeVerifier.getDigestsToVerify((ManifestParser.Section) obj, (String) obj2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧ۠, reason: contains not printable characters */
    public static InterfaceC0375h2 m3746(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((C0381i2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۨۢ, reason: contains not printable characters */
    public static ApkVerifier.Issue m3747() {
        if (C0035.m3569() < 0) {
            return ApkVerifier.Issue.V4_SIG_UNKNOWN_SIG_ALGORITHM;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۣ, reason: contains not printable characters */
    public static boolean m3748(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((DefaultApkSignerEngine.SignerConfig) obj).getDeterministicDsaSigning();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۡ, reason: contains not printable characters */
    public static C0334b3 m3749(Object obj) {
        if (C0020.m1385() < 0) {
            return ((Y2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۡ, reason: contains not printable characters */
    public static boolean m3750(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0075.m6893() >= 0) {
            return AbstractC0400l3.c((ClassLoader) obj, (String) obj2, z, (ArrayList) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۧۢ, reason: contains not printable characters */
    public static int m3751(Object obj, Object obj2, int i, int i2) {
        if (C0037.m3837() < 0) {
            return ((F2) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۧ۟, reason: contains not printable characters */
    public static String m3752() {
        if (C0026.m2298() <= 0) {
            return "RAW";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۦۦ, reason: contains not printable characters */
    public static int m3753(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((CloudBean) obj).getDialogShowTime();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۥۦ, reason: contains not printable characters */
    public static String m3754(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((ApkVerifier.Result.V1SchemeSignerInfo) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠۠, reason: contains not printable characters */
    public static DateFormat m3755(int i, int i2) {
        if (C0069.m5781() <= 0) {
            return PreJava9DateFormatProvider.getUSDateTimeFormat(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۡ, reason: contains not printable characters */
    public static SignatureAlgorithm m3756(Object obj) {
        if (C0037.m3837() < 0) {
            return ((V3SigningCertificateLineage.SigningCertificateNode) obj).sigAlgorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣ۠, reason: contains not printable characters */
    public static TreeSet m3757(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((W) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۧۤ, reason: contains not printable characters */
    public static boolean m3758(Object obj) {
        if (C0016.m717() <= 0) {
            return ((Thread) obj).isInterrupted();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۦۧۨ, reason: contains not printable characters */
    public static long m3759(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((CentralDirectoryRecord) obj).getLocalFileHeaderOffset();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣۧۨ, reason: contains not printable characters */
    public static byte m3760(byte b, int i) {
        if (C0065.m4647() > 0) {
            return BerEncoding.setTagNumber(b, i);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۦۨۦ۠, reason: contains not printable characters */
    public static ByteBuffer m3761(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((SubjectPublicKeyInfo) obj).subjectPublicKey;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m3762() {
        if (C0067.m5468() < 0) {
            return "Alg.Alias.Mac.HMAC/SHA512";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static File m3763(Object obj) {
        if (C0075.m6893() > 0) {
            return ((ApkSigner) obj).x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m3764(Object obj) {
        if (C0035.m3569() < 0) {
            return ConsumerAbility.c((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3765(Object obj, Object obj2) {
        if (C0069.m5781() < 0) {
            return ((List) obj).remove(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۢۧ, reason: not valid java name and contains not printable characters */
    public static void m3766(Object obj) {
        if (C0017.m846() > 0) {
            ((CRC32) obj).reset();
        }
    }

    /* JADX INFO: renamed from: ۧۦۣۧ, reason: not valid java name and contains not printable characters */
    public static ListView m3767(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((C4) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨ۟, reason: not valid java name and contains not printable characters */
    public static AssetManager m3768(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((Context) obj).getAssets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۨ۟, reason: not valid java name and contains not printable characters */
    public static String m3769(String str) {
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

    /* JADX INFO: renamed from: ۨ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static N2 m3770() {
        if (C0065.m4647() >= 0) {
            return N2.g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int m3771(Object obj) {
        if (C0023.m1921() > 0) {
            return ((ApkVerifier.Builder) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۤۡ, reason: not valid java name and contains not printable characters */
    public static ApkVerifier.Issue m3772() {
        if (m3653() <= 0) {
            return ApkVerifier.Issue.JAR_SIG_ZIP_ENTRY_NOT_SIGNED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧۡ, reason: not valid java name and contains not printable characters */
    public static N2 m3773() {
        if (C0074.m6454() <= 0) {
            return N2.m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۢۦ, reason: not valid java name and contains not printable characters */
    public static String m3678(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
