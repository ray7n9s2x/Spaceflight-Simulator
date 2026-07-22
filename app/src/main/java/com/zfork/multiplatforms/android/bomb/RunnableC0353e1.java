package com.zfork.multiplatforms.android.bomb;

import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.VerityTreeBuilder;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import com.zfork.hawk.cheat.C0076;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.Phaser;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0353e1 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f316short = {1549, 1558, 1567, 1651, 1644, 1643, 1640, 3139, 3172, 3180, 3177, 3168, 3169, 3109, 3185, 3178, 3109, 3178, 3175, 3185, 3172, 3180, 3179, 3109, 3172, 3179, 3109, 3180, 3179, 3190, 3185, 3172, 3179, 3174, 3168, 3109, 3178, 3171, 3109, 3172, 3109, 3189, 3191, 3168, 3187, 3180, 3178, 3184, 3190, 3177, 3196, 3109, 3172, 3187, 3172, 3180, 3177, 3172, 3175, 3177, 3168, 3109, 3176, 3168, 3190, 3190, 3172, 3170, 3168, 3109, 3169, 3180, 3170, 3168, 3190, 3185, 2023, 1986, 1986, 1987, 1986, 1926, 1988, 1991, 1989, 1997, 2003, 2006, 1926, 1984, 1999, 1994, 1987, 1926, 1931, 1944, 1926, 1398, 1357, 1344, 1370, 1369, 1349, 1352, 1360, 1398, 1351, 1352, 1348, 1356, 1892, 1912, 1905, 1900, 1909, 1840, 1917, 1905, 1907, 1857, 1919, 1902, 1902, 1879, 1904, 1911, 1898, 1926, 1946, 1939, 1934, 1943, 2002, 1951, 1939, 1937, 1955, 1934, 1945, 1937, 1945, 1937, 1950, 1945, 1934, 1955, 1929, 1934, 1941, 883, 879, 870, 891, 866, 807, 874, 870, 868, 854, 869, 864, 890, 893, 854, 872, 889, 889, 869, 864, 874, 872, 893, 864, 870, 871, 832, 871, 879, 870, 1427, 1423, 1414, 1435, 1410, 1479, 1418, 1414, 1412, 1462, 1413, 1408, 1434, 1437, 1462, 1436, 1435, 1408, 2715, 2765, 2776, 2777};
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Comparable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ RunnableC0353e1(VerityTreeBuilder verityTreeBuilder, ByteBuffer byteBuffer, int i, byte[][] bArr, Phaser phaser) {
        this.c = verityTreeBuilder;
        this.d = byteBuffer;
        this.b = i;
        this.e = bArr;
        this.f = phaser;
    }

    /* JADX INFO: renamed from: ۠ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static short[] m7047() {
        if (C0076.m6903() < 0) {
            return f316short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM1996;
        MessageDigest messageDigestM2835;
        int i = 3;
        Object objM3508 = C0034.m3508(this);
        Object objM4502 = C0064.m4502(this);
        int i2 = 0;
        int iM2235 = C0026.m2235(this);
        Comparable comparableM2932 = C0030.m2932(this);
        Object objM6388 = C0073.m6388(this);
        int i3 = 1;
        switch (C0072.m6232(this)) {
            case 0:
                Intent intent = (Intent) objM3508;
                C0023.m1832();
                ConsumerAbility consumerAbility = (ConsumerAbility) objM6388;
                C0030.m2951(consumerAbility);
                String strM5544 = C0068.m5544(m7047(), 76, 21, 1958);
                String strM7427 = C0078.m7427(m7047(), 97, 13, 1321);
                Uri uriM4176 = (Uri) comparableM2932;
                ClipData clipData = (ClipData) objM4502;
                try {
                    switch (iM2235) {
                        case 9909:
                            if (uriM4176 == null) {
                                uriM4176 = C0063.m4355(clipData) > 0 ? C0039.m4176(C0032.m3141(clipData, 0)) : null;
                            }
                            consumerAbility.b = uriM4176;
                            if (uriM4176 == null || (strM1996 = C0024.m1996(consumerAbility, uriM4176, strM7427)) == null || !C0072.m6150(strM1996, C0037.m3829(m7047(), 197, 4, 2741))) {
                                return;
                            }
                            C0025.m2123(consumerAbility, new RunnableC0346d1(consumerAbility, strM1996, i3));
                            return;
                        case 9910:
                        case 9914:
                            if (uriM4176 != null) {
                                C0066.m4868(consumerAbility, uriM4176, null, iM2235 == 9914);
                                return;
                            }
                            for (int i4 = 0; i4 < C0063.m4355(clipData); i4++) {
                                C0066.m4868(consumerAbility, C0039.m4176(C0032.m3141(clipData, i4)), null, false);
                            }
                            return;
                        case 9911:
                        default:
                            C0025.m2123(consumerAbility, new RunnableC0360f1(consumerAbility, i));
                            return;
                        case 9912:
                            if (uriM4176 == null) {
                                uriM4176 = C0063.m4355(clipData) > 0 ? C0039.m4176(C0032.m3141(clipData, 0)) : null;
                            }
                            consumerAbility.d = uriM4176;
                            if (uriM4176 == null) {
                                return;
                            }
                            StringBuilder sb = new StringBuilder(strM5544);
                            C0077.m7290(sb, C0024.m1996(consumerAbility, C0018.m1063(consumerAbility), strM7427));
                            C0075.m6839(consumerAbility, C0068.m5536(sb));
                            return;
                        case 9913:
                            ArrayList arrayListM2616 = C0028.m2616(intent, C0022.m1728(m7047(), 149, 30, 777));
                            ArrayList arrayListM26162 = C0028.m2616(intent, C0032.m3209(m7047(), 179, 18, 1513));
                            if (arrayListM2616 == null || arrayListM26162 == null) {
                                return;
                            }
                            for (int i5 = 0; i5 < C0018.m1084(arrayListM26162); i5++) {
                                C0066.m4868(consumerAbility, (Uri) C0064.m4526(arrayListM26162, i5), (ApplicationInfo) C0064.m4526(arrayListM2616, i5), false);
                            }
                            return;
                        case 9915:
                            try {
                                C0032.m3183(C0022.m1749(consumerAbility), uriM4176, 3);
                                C0072.m6210(C0029.m2704(C0026.m2261(C0029.m2737(consumerAbility, C0039.m4066(m7047(), 110, 17, 1822), 0)), C0076.m6902(m7047(), WorkQueueKt.MASK, 22, 2044), C0030.m2939(uriM4176)));
                                break;
                            } catch (Exception unused) {
                            }
                            consumerAbility.f = uriM4176;
                            return;
                    }
                } catch (Exception unused2) {
                    return;
                }
            default:
                C0038.m3953();
                VerityTreeBuilder verityTreeBuilder = (VerityTreeBuilder) objM6388;
                C0030.m2951(verityTreeBuilder);
                try {
                    try {
                        messageDigestM2835 = (MessageDigest) C0111.m13187(C0026.m2336(verityTreeBuilder));
                    } catch (NoSuchAlgorithmException e) {
                        throw new IllegalStateException(C0065.m4757(m7047(), 7, 69, 3077), e);
                    }
                    break;
                } catch (CloneNotSupportedException unused3) {
                    messageDigestM2835 = C0030.m2835(C0036.m3678(m7047(), 0, 7, 1630));
                    break;
                }
                ByteBuffer byteBuffer = (ByteBuffer) comparableM2932;
                int iM6516 = C0074.m6516(byteBuffer);
                while (i2 < iM6516) {
                    int i6 = i2 + 4096;
                    ByteBuffer byteBufferM1854 = C0023.m1854(byteBuffer, i2, i6);
                    C0018.m1067(messageDigestM2835);
                    byte[] bArrM3248 = C0032.m3248(verityTreeBuilder);
                    if (bArrM3248 != null) {
                        C0063.m4423(messageDigestM2835, bArrM3248);
                    }
                    C0037.m3779(messageDigestM2835, byteBufferM1854);
                    ((byte[][]) objM4502)[iM2235] = C0033.m3355(messageDigestM2835);
                    iM2235++;
                    i2 = i6;
                }
                C0075.m6869((Phaser) objM3508);
                return;
        }
    }

    public /* synthetic */ RunnableC0353e1(ConsumerAbility consumerAbility, Uri uri, ClipData clipData, int i, Intent intent) {
        this.c = consumerAbility;
        this.d = uri;
        this.e = clipData;
        this.b = i;
        this.f = intent;
    }
}
