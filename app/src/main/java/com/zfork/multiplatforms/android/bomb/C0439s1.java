package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.entry.C0075;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Predicate;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0439s1 extends AbstractC0410n1 {
    public final String[] d;
    public final boolean e;
    public final LinkOption[] f;

    /* JADX INFO: renamed from: ۟ۧۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m7110(Object obj) {
        if (C0029.m2791() > 0) {
            return Objects.hash((Object[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static Stream m7111(Object obj) {
        if (C0031.m3075() >= 0) {
            return Stream.CC.of((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ۠۟, reason: contains not printable characters */
    public static boolean m7112(Object obj, Object obj2) {
        if (C0073.m6356() <= 0) {
            return ((Stream) obj).anyMatch((Predicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۤ۟, reason: contains not printable characters */
    public static Object m7113(Object obj) {
        if (C0031.m3075() > 0) {
            return ((LinkOption[]) obj).clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m7114(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((String[]) obj).clone();
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0410n1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || C0439s1.class != C0030.m2951(obj)) {
            return false;
        }
        C0439s1 c0439s1 = (C0439s1) obj;
        return C0069.m5724(this) == C0069.m5724(c0439s1) && C0035.m3558(C0025.m2162(this), C0025.m2162(c0439s1));
    }

    public final boolean b(Path path) {
        String[] strArrM2162 = C0025.m2162(this);
        I3 i3 = new I3();
        Path pathM7275 = path != null ? C0077.m7275(path) : null;
        return C0022.m1678(strArrM2162, (String) (pathM7275 != null ? C0023.m1861(i3, pathM7275) : null)) < 0;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        Path path = (Path) obj;
        if (C0070.m5873(this, path)) {
            if (C0078.m7452(path, C0111.m13178(this))) {
                if (C0069.m5724(this)) {
                    C0035.m3610(path, C0111.m13178(this));
                }
                C0064.m4520(path);
            }
            if (C0066.m4792(path)) {
                try {
                    C0022.m1699(path);
                } catch (NoSuchFileException unused) {
                }
            }
        }
        C0398l1 c0398l1M2987 = C0031.m2987(this);
        C0392k1 c0392k1M5820 = C0069.m5820(c0398l1M2987);
        c0392k1M5820.a = C0064.m4561(c0392k1M5820) + 1;
        C0392k1 c0392k1M7310 = C0078.m7310(c0398l1M2987);
        c0392k1M7310.a = C0064.m4561(c0392k1M7310) + C0070.m5850(basicFileAttributes);
        return C0017.m907();
    }

    public C0439s1(C0398l1 c0398l1, LinkOption[] linkOptionArr, R4[] r4Arr, String... strArr) {
        boolean zM7112;
        LinkOption[] linkOptionArr2;
        super(c0398l1);
        String[] strArr2 = (String[]) m7114(strArr);
        C0078.m7354(strArr2);
        this.d = strArr2;
        C0071.m6050();
        if (r4Arr.length == 0) {
            zM7112 = false;
        } else {
            zM7112 = m7112(m7111(r4Arr), new C0467x(2));
        }
        this.e = zM7112;
        if (linkOptionArr == null) {
            linkOptionArr2 = (LinkOption[]) m7113(C0029.m2794());
        } else {
            linkOptionArr2 = (LinkOption[]) m7113(linkOptionArr);
        }
        this.f = linkOptionArr2;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0410n1
    public final int hashCode() {
        return m7110(new Object[]{C0075.m6775(C0069.m5724(this))}) + (((super.hashCode() * 31) + C0035.m3544(C0025.m2162(this))) * 31);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        Path pathM4113 = C0039.m4113(obj);
        DirectoryStream directoryStreamM3421 = C0034.m3421(pathM4113);
        try {
            boolean zM3657 = C0036.m3657(C0064.m4536(directoryStreamM3421));
            C0063.m4399(directoryStreamM3421);
            if (!zM3657) {
                C0068.m5668(pathM4113);
            }
            C0392k1 c0392k1M6153 = C0072.m6153(C0031.m2987(this));
            c0392k1M6153.a = C0064.m4561(c0392k1M6153) + 1;
            return C0030.m2964();
        } catch (Throwable th) {
            if (directoryStreamM3421 != null) {
                try {
                    C0063.m4399(directoryStreamM3421);
                } catch (Throwable th2) {
                    C0072.m6234(th, th2);
                }
            }
            throw th;
        }
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        Path pathM4113 = C0039.m4113(obj);
        if (C0028.m2636(C0069.m5817(this), pathM4113) != C0030.m2964()) {
            C0072.m6109();
        } else {
            C0030.m2964();
        }
        if (C0070.m5873(this, pathM4113)) {
            return C0030.m2964();
        }
        return C0072.m6109();
    }
}
