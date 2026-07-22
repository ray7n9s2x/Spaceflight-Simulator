package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.zfork.entry.C0075;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f251short = {924, 941, 958, 941, 929, 937, 952, 937, 958, 1004, 1003, 936, 933, 958, 937, 943, 952, 931, 958, 949, 1003, 1004, 933, 959, 1004, 930, 931, 952, 1004, 941, 1004, 936, 933, 958, 937, 943, 952, 931, 958, 949, 1014, 1004, 1003, 3119, 602, 631, 620, 635, 637, 618, 625, 620, 615, 574, 569, 1296, 1303, 1363, 1368, 1362, 1348, 1303, 1369, 1368, 1347, 1303, 1362, 1359, 1374, 1348, 1347, 1305, 1462, 1421, 1416, 1421, 1420, 1428, 1421, 1475, 1450, 1484, 1452, 1475, 1414, 1425, 1425, 1420, 1425, 1475, 1423, 1418, 1424, 1431, 1418, 1421, 1412, 1475, 1408, 1420, 1421, 1431, 1414, 1421, 1431, 1424, 1475, 1420, 1413, 1475, 1415, 1418, 1425, 1414, 1408, 1431, 1420, 1425, 1434, 1497, 1475};

    /* JADX INFO: renamed from: ۟ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static void m6936(Object obj, Object obj2) {
        if (C0066.m4827() >= 0) {
            ((Stream) obj).forEach((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static short[] m6937() {
        if (C0038.m4010() > 0) {
            return f251short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۧۢ, reason: not valid java name and contains not printable characters */
    public static Stream m6938(Object obj) {
        if (C0028.m2593() > 0) {
            return Stream.CC.of((Object[]) obj);
        }
        return null;
    }

    static {
        BigInteger bigIntegerM3948 = C0038.m3948(1024L);
        C0069.m5811(bigIntegerM3948, C0069.m5811(bigIntegerM3948, C0069.m5811(bigIntegerM3948, C0069.m5811(bigIntegerM3948, C0069.m5811(bigIntegerM3948, bigIntegerM3948)))));
        C0069.m5811(bigIntegerM3948, C0069.m5811(C0038.m3948(1024L), C0038.m3948(LockFreeTaskQueueCore.FROZEN_MASK)));
    }

    public static void a(File file) {
        int iM3427;
        if (!C0033.m3343(file)) {
            return;
        }
        if (!C0073.m6437(C0027.m2458(file))) {
            C0451u1 c0451u1 = new C0451u1(3);
            if (!C0030.m2838(file)) {
                if (C0033.m3343(file)) {
                    StringBuilder sb = new StringBuilder(C0033.m3330(m6937(), 0, 43, 972));
                    C0036.m3741(sb, file);
                    C0077.m7290(sb, C0111.m13097(m6937(), 43, 1, 3080));
                    throw new IllegalArgumentException(C0068.m5536(sb));
                }
                StringBuilder sb2 = new StringBuilder(C0075.m6791(m6937(), 44, 11, 542));
                C0036.m3741(sb2, file);
                C0077.m7290(sb2, C0036.m3678(m6937(), 55, 17, 1335));
                throw new FileNotFoundException(C0068.m5536(sb2));
            }
            File[] fileArrM5776 = C0069.m5776(file);
            if (fileArrM5776 != null) {
                C0482z2 c0482z2M4303 = C0063.m4303(m6938(fileArrM5776));
                A2 a2 = new A2();
                C0030.m2951(c0482z2M4303);
                AtomicReference atomicReference = new AtomicReference();
                m6936(C0028.m2568(c0482z2M4303), new C0476y2(c0451u1, atomicReference, a2, new AtomicInteger()));
                List list = (List) C0073.m6438(atomicReference);
                C0078.m7327();
                boolean z = false;
                if (list != null) {
                    iM3427 = C0034.m3427(list);
                } else {
                    iM3427 = 0;
                }
                if (iM3427 == 0) {
                    z = true;
                }
                if (!z) {
                    throw new C0458v2(null, list);
                }
            } else {
                StringBuilder sb3 = new StringBuilder(C0027.m2404(m6937(), 72, 49, 1507));
                C0036.m3741(sb3, file);
                throw new IOException(C0068.m5536(sb3));
            }
        }
        C0111.m13085(C0027.m2458(file));
    }
}
