package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J3 {
    public static final LinkOption[] a;
    public static final LinkOption[] b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f258short = {2467, 2482, 2471, 2491, 2589, 2582, 2570, 2681, 2614, 2603, 2681, 2569, 2582, 2570, 2576, 2561, 2681, 2623, 2608, 2613, 2620, 2681, 2614, 2601, 2620, 2603, 2616, 2605, 2608, 2614, 2615, 2602, 2681, 2615, 2614, 2605, 2681, 2616, 2607, 2616, 2608, 2613, 2616, 2619, 2613, 2620, 2681, 2623, 2614, 2603, 2681, 2686, 2684, 2602, 2686, 2681, 2684, 2602};

    static {
        OpenOption[] openOptionArr = new OpenOption[2];
        C0030.m2858();
        C0018.m1033();
        OpenOption[] openOptionArr2 = new OpenOption[2];
        C0030.m2858();
        C0031.m2981();
        CopyOption[] copyOptionArr = new CopyOption[0];
        FileAttribute[] fileAttributeArr = new FileAttribute[0];
        FileVisitOption[] fileVisitOptionArr = new FileVisitOption[0];
        a = new LinkOption[0];
        b = new LinkOption[]{C0111.m13107()};
        OpenOption[] openOptionArr3 = new OpenOption[0];
        Path[] pathArr = new Path[0];
    }

    public static void c(Path path, LinkOption... linkOptionArr) {
        try {
            DosFileAttributeView dosFileAttributeViewM2015 = C0024.m2015(C0074.m6569(path, C0070.m5866(), linkOptionArr));
            if (dosFileAttributeViewM2015 != null) {
                C0031.m2998(dosFileAttributeViewM2015);
                return;
            }
        } catch (IOException unused) {
        }
        BasicFileAttributes basicFileAttributesM3201 = null;
        Path pathM3722 = path == null ? null : C0036.m3722(path);
        if (C0065.m4650(pathM3722, linkOptionArr)) {
            try {
                basicFileAttributesM3201 = C0032.m3201(pathM3722, C0039.m4070(), linkOptionArr);
            } catch (IOException | UnsupportedOperationException unused2) {
            }
            if (C0030.m2958(basicFileAttributesM3201) != null) {
                List listM1596 = C0021.m1596(new PosixFilePermission[]{C0070.m5837(), C0063.m4325()});
                Set setM1541 = C0021.m1541(pathM3722, linkOptionArr);
                HashSet hashSet = new HashSet(setM1541);
                C0028.m2559(hashSet, listM1596);
                if (C0020.m1434(hashSet, setM1541)) {
                    return;
                }
                C0033.m3280(pathM3722, hashSet);
                return;
            }
        }
        throw new IOException(C0021.m1531(C0023.m1904(m6948(), 4, 54, 2649), new Object[]{path, C0072.m6219(linkOptionArr)}));
    }

    /* JADX INFO: renamed from: ۟۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m6947(Object obj, Object obj2) {
        if (C0072.m6216() > 0) {
            return Objects.requireNonNull(obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m6948() {
        if (C0074.m6454() < 0) {
            return f258short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۥۣ, reason: not valid java name and contains not printable characters */
    public static Stream m6949(Object obj) {
        if (C0037.m3837() <= 0) {
            return Stream.CC.of((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6950(Object obj, Object obj2) {
        if (C0075.m6893() > 0) {
            return ((Stream) obj).anyMatch((Predicate) obj2);
        }
        return false;
    }

    public static boolean b(Path path, LinkOption... linkOptionArr) {
        m6947(path, C0027.m2404(m6948(), 0, 4, 2515));
        return linkOptionArr != null ? C0030.m2919(path, linkOptionArr) : C0030.m2919(path, new LinkOption[0]);
    }

    public static C0398l1 a(Path path, LinkOption[] linkOptionArr, R4... r4Arr) throws NoSuchFileException {
        long jM2065;
        BasicFileAttributes basicFileAttributesM3201;
        if (C0018.m1083(path, linkOptionArr)) {
            C0439s1 c0439s1 = new C0439s1(new C0398l1(), linkOptionArr, r4Arr, new String[0]);
            C0024.m2061(path, c0439s1);
            return C0031.m2987(c0439s1);
        }
        if (!C0018.m1083(path, linkOptionArr)) {
            C0398l1 c0398l1 = new C0398l1();
            C0392k1 c0392k1M7310 = C0078.m7310(c0398l1);
            C0392k1 c0392k1M5820 = C0069.m5820(c0398l1);
            long jM20652 = 0;
            if (C0065.m4650(path, linkOptionArr) && !C0066.m4792(path)) {
                jM2065 = C0024.m2065(path);
            } else {
                jM2065 = 0;
            }
            if (C0064.m4520(path)) {
                c0392k1M5820.a = C0064.m4561(c0392k1M5820) + 1;
                c0392k1M7310.a = C0064.m4561(c0392k1M7310) + jM2065;
            } else {
                Path pathM4503 = C0064.m4503(path);
                PosixFileAttributes posixFileAttributesM2958 = null;
                try {
                    if (m6950(m6949(r4Arr), new C0467x(1))) {
                        Class clsM4070 = C0039.m4070();
                        if (pathM4503 != null) {
                            try {
                                basicFileAttributesM3201 = C0032.m3201(pathM4503, clsM4070, linkOptionArr);
                            } catch (IOException | UnsupportedOperationException unused) {
                                basicFileAttributesM3201 = null;
                            }
                            posixFileAttributesM2958 = C0030.m2958(basicFileAttributesM3201);
                            C0035.m3610(path, linkOptionArr);
                        } else {
                            basicFileAttributesM3201 = null;
                            posixFileAttributesM2958 = C0030.m2958(basicFileAttributesM3201);
                            C0035.m3610(path, linkOptionArr);
                        }
                    }
                    if (C0065.m4650(path, linkOptionArr) && !C0066.m4792(path)) {
                        jM20652 = C0024.m2065(path);
                    }
                    if (C0064.m4520(path)) {
                        c0392k1M5820.a = C0064.m4561(c0392k1M5820) + 1;
                        c0392k1M7310.a = C0064.m4561(c0392k1M7310) + jM20652;
                    }
                    if (posixFileAttributesM2958 != null) {
                        C0032.m3233(pathM4503, C0063.m4435(posixFileAttributesM2958));
                    }
                } catch (Throwable th) {
                    if (posixFileAttributesM2958 != null) {
                        C0032.m3233(pathM4503, C0063.m4435(posixFileAttributesM2958));
                    }
                    throw th;
                }
            }
            return c0398l1;
        }
        throw new NoSuchFileException(C0069.m5751(path));
    }
}
