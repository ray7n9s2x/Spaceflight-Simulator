package com.android.apksig;

import com.android.apksig.ApkSignerEngine;
import com.android.apksig.KeyConfig;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.ReadableDataSink;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipFormatException;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.r;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class ApkSigner {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f15short = {3103, 3123, 3134, 3124, 3133, 3104, 3135, 3127, 3126, 3186, 3080, 3099, 3074, 3186, 3127, 3132, 3110, 3104, 3115, 3176, 3186, 3028, 3067, 3057, 3047, 3066, 3068, 3057, 3032, 3060, 3067, 3068, 3059, 3056, 3046, 3041, 3003, 3053, 3064, 3065, 2299, 2271, 2245, 2245, 2271, 2264, 2257, 2198, 2295, 2264, 2258, 2244, 2265, 2271, 2258, 2299, 2263, 2264, 2271, 2256, 2259, 2245, 2242, 2200, 2254, 2267, 2266, 2101, 2061, 2068, 2060, 2065, 2056, 2068, 2077, 2136, 2082, 2097, 2088, 2136, 2077, 2070, 2060, 2058, 2065, 2077, 2059, 2136, 2063, 2065, 2060, 2064, 2136, 2060, 2064, 2077, 2136, 2059, 2073, 2069, 2077, 2136, 2070, 2073, 2069, 2077, 2114, 2136, 2081, 2061, ZipUtils.GP_FLAG_EFS, 2058, 2051, 2078, 2049, 2057, 2056, 2124, 2102, 2085, 2108, 2124, 2095, 2057, 2050, 2072, 2078, 2061, ZipUtils.GP_FLAG_EFS, 2124, 2088, 2053, 2078, 2057, 2063, 2072, 2051, 2078, 2069, 2124, 2078, 2057, 2063, 2051, 2078, 2056, 2124, 2127, 2476, 2541, 2552, 2476, 2538, 2533, 2528, 2537, 2476, 2531, 2538, 2538, 2559, 2537, 2552, 2476, 2885, 2903, 2903, 2881, 2896, 2903, 2827, 2887, 2891, 2889, 2826, 2885, 2890, 2880, 2902, 2891, 2893, 2880, 2826, 2892, 2893, 2890, 2896, 2903, 2826, 2900, 2893, 2890, 2903, 2826, 2896, 2908, 2896, 2740, 2711, 2706, 2774, 2947, 2970, 2973, 2975, 2970, 2944, 2951, 3037, 2974, 2966, 2951, 2962, 1174, 1169, 1156, 1160, 1173, 1224, 1158, 1152, 1175, 1169, 1224, 1174, 1165, 1156, 1239, 1232, 1235, 3078, 3109, 3104, 3172, 3127, 3115, 3121, 3126, 3111, 3105, 3172, 3127, 3120, 3109, 3113, 3124, 3172, 3105, 3114, 3120, 3126, 3133, 703, 644, 641, 644, 645, 669, 644, 714, 645, 671, 670, 666, 671, 670, 714, 666, 645, 646, 643, 649, 659, 720, 714, 2404, 2361, 2341, 2362, 2326, 2331, 2321, 2328, 2309, 2330, 2322, 2323, 2391, 2349, 2366, 2343, 2391, 2322, 2329, 2307, 2309, 2318, 2381, 2391, 2586, 2616, 2615, 2615, 2614, 2605, 2681, 2622, 2620, 2615, 2620, 2603, 2616, 2605, 2620, 2681, 2570, 2614, 2604, 2603, 2618, 2620, 2570, 2605, 2616, 2612, 2601, 2679, 2681, 2584, 2569, 2578, 2681, 2618, 2614, 2615, 2605, 2616, 2608, 2615, 2602, 2681, 2616, 2615, 2681, 2620, 2593, 2608, 2602, 2605, 2608, 2615, 2622, 2681, 2620, 2615, 2605, 2603, 2592, 2681, 2606, 2608, 2605, 2609, 2681, 2605, 2609, 2620, 2681, 2615, 2616, 2612, 2620, 2659, 2681, 2602, 2605, 2616, 2612, 2601, 2676, 2618, 2620, 2603, 2605, 2676, 2602, 2609, 2616, 2667, 2668, 2671, 2677, 2681, 2616, 2615, 2621, 2681, 2608, 2605, 2681, 2608, 2602, 2681, 2621, 2608, 2623, 2623, 2620, 2603, 2620, 2615, 2605, 2681, 2605, 2609, 2616, 2615, 2681, 2605, 2609, 2620, 2681, 2601, 2603, 2614, 2607, 2608, 2621, 2620, 2621, 2681, 2602, 2614, 2604, 2603, 2618, 2620, 2681, 2602, 2605, 2616, 2612, 2601, 2681, 2618, 2620, 2603, 2605, 2608, 2623, 2608, 2618, 2616, 2605, 2620, 1491, 1492, 1473, 1485, 1488, 1421, 1475, 1477, 1490, 1492, 1421, 1491, 1480, 1473, 1426, 1429, 1430, 2143, 2118, 2113, 2115, 2118, 2140, 2139, 2049, 2114, 2122, 2139, 2126, 2065, 2091, 2090, 2094, 2091, 2090, 2174, 2052, 2071, 2062, 2174, 2077, 2107, 2096, 2090, 2092, 2111, 2098, 2174, 2074, 2103, 2092, 2107, 2109, 2090, 2097, 2092, 2087, 2174, 2090, 2097, 2097, 2174, 2098, 2111, 2092, 2105, 2107, 2148, 2174, 1552, 1618, 1609, 1604, 1621, 1603, 3305, 3278, 3270, 3267, 3274, 3275, 3215, 3291, 3264, 3215, 3275, 3274, 3291, 3274, 3293, 3266, 3270, 3265, 3274, 3215, 3310, 3327, 3300, 3208, 3292, 3215, 3266, 3270, 3265, 3270, 3266, 3290, 3266, 3215, 3292, 3290, 3295, 3295, 3264, 3293, 3291, 3274, 3275, 3215, 3310, 3265, 3275, 3293, 3264, 3270, 3275, 3215, 3295, 3267, 3278, 3291, 3273, 3264, 3293, 3266, 3215, 3289, 3274, 3293, 3292, 3270, 3264, 3265, 3094, 3117, 3126, 3120, 3110, 3111, 3171, 3120, 3123, 3106, 3104, 3110, 3171, 3106, 3127, 3171, 3127, 3115, 3110, 3171, 3110, 3117, 3111, 3171, 3116, 3109, 3171, 3097, 3082, 3091, 3171, 3072, 3110, 3117, 3127, 3121, 3106, 3119, 3171, 3079, 3114, 3121, 3110, 3104, 3127, 3116, 3121, 3130, 3193, 3171, 2483, 2545, 2538, 2535, 2550, 2528, 2483, 2528, 2535, 2546, 2529, 2535, 2554, 2557, 2548, 2483, 2546, 2535, 2483, 2549, 2554, 2559, 2550, 2483, 2556, 2549, 2549, 2528, 2550, 2535, 2483, 1882, 1865, 1872, 1824, 1859, 1893, 1902, 1908, 1906, 1889, 1900, 1824, 1860, 1897, 1906, 1893, 1891, 1908, 1903, 1906, 1913, 1824, 1908, 1903, 1903, 1824, 1900, 1889, 1906, 1895, 1893, 1850, 1824, 3210, 3238, 3243, 3233, 3240, 3253, 3242, 3234, 3235, 3303, 3206, 3223, 3212, 3325, 3303, 3241, 3240, 3251, 3303, 3238, 3303, 3229, 3214, 3223, 3303, 3238, 3253, 3236, 3247, 3246, 3249, 3234, 3041, 275, 278, 487, 477, 476, 472, 477, 476, 392, 489, 504, 483, 392, 454, 455, 476, 392, 475, 472, 461, 459, 449, 462, 449, 461, 460, 1866, 1901, 1907, 1910, 1911, 1827, 1858, 1875, 1864, 1827, 1901, 1900, 1911, 1827, 1904, 1907, 1894, 1888, 1898, 1893, 1898, 1894, 1895};
    public final File A;
    public final SigningCertificateLineage B;
    public final List a;
    public final SignerConfig b;
    public final SigningCertificateLineage c;
    public final boolean d;
    public final boolean e;
    public final Integer f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final String t;
    public final ApkSignerEngine u;
    public final File v;
    public final DataSource w;
    public final File x;
    public final DataSink y;
    public final DataSource z;

    public static class Builder {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f16short = {277, 271, 257, 264, 259, 276, 291, 264, 257, 271, 264, 259, 326, 347, 347, 326, 264, 275, 266, 266, 2240, 2293, 2209, 2285, 2276, 2272, 2290, 2293, 2209, 2286, 2287, 2276, 2209, 2290, 2280, 2278, 2287, 2276, 2291, 2209, 2274, 2286, 2287, 2279, 2280, 2278, 2209, 2284, 2292, 2290, 2293, 2209, 2275, 2276, 2209, 2289, 2291, 2286, 2295, 2280, 2277, 2276, 2277, 3044, 3035, 3022, 3033, 3018, 3039, 3010, 3012, 3013, 2955, 3010, 3032, 2955, 3013, 3012, 3039, 2955, 3018, 3037, 3018, 3010, 3015, 3018, 3017, 3015, 3022, 2955, 3036, 3011, 3022, 3013, 2955, 3017, 3038, 3010, 3015, 3023, 3022, 3033, 2955, 3010, 3013, 3010, 3039, 3010, 3018, 3015, 3010, 3025, 3022, 3023, 2955, 3036, 3010, 3039, 3011, 2955, 3018, 3013, 2955, 3022, 3013, 3020, 3010, 3013, 3022, 641, 694, 682, 687, 679, 678, 689, 739, 672, 684, 685, 677, 682, 676, 694, 689, 678, 679, 739, 695, 684, 739, 673, 684, 695, 683, 739, 678, 685, 674, 673, 687, 678, 739, 674, 685, 679, 739, 679, 682, 688, 674, 673, 687, 678, 739, 642, 659, 648, 739, 656, 682, 676, 685, 674, 695, 694, 689, 678, 739, 656, 672, 683, 678, 686, 678, 739, 693, 752, 739, 688, 682, 676, 685, 682, 685, 676, 1815, 1798, 1821, 1910, 1797, 1855, 1841, 1848, 1847, 1826, 1827, 1828, 1843, 1910, 1797, 1845, 1854, 1843, 1851, 1843, 1910, 1824, 1890, 1910, 1829, 1855, 1841, 1848, 1855, 1848, 1841, 1910, 1828, 1843, 1831, 1827, 1855, 1828, 1843, 1829, 1910, 1847, 1826, 1910, 1850, 1843, 1847, 1829, 1826, 1910, 1824, 1892, 1910, 1849, 1828, 1910, 1824, 1893, 1910, 1829, 1855, 1841, 1848, 1855, 1848, 1841, 1910, 1826, 1849, 1910, 1844, 1843, 1910, 1843, 1848, 1847, 1844, 1850, 1843, 1842, 1052, 1051, 1029, 1024, 1025, 1076, 1029, 1054, 1109, 1096, 1096, 1109, 1051, 1024, 1049, 1049, 3128, 3135, 3105, 3108, 3109, 3088, 3105, 3130, 3185, 3180, 3180, 3185, 3135, 3108, 3133, 3133, 2024, 2034, 2035, 2039, 2034, 2035, 1990, 2039, 2028, 1998, 2025, 1959, 1978, 1978, 1959, 2025, 2034, 2027, 2027, 3133, 3111, 3110, 3106, 3111, 3110, 3091, 3106, 3129, 3101, 3111, 3110, 3186, 3183, 3183, 3186, 3132, 3111, 3134, 3134, 1124, 1150, 1151, 1147, 1150, 1151, 1098, 1147, 1120, 1067, 1078, 1078, 1067, 1125, 1150, 1127, 1127, 2440, 2450, 2451, 2455, 2450, 2451, 2470, 2455, 2444, 2503, 2522, 2522, 2503, 2441, 2450, 2443, 2443, 1218, 1152, 1276, 1237, 1223, 1244, 1254, 1243, 1243, 1216, 1275, 1217, 1216, 1220, 1217, 1216, 1266, 1245, 1240, 1233, 1172, 1161, 1161, 1172, 1242, 1217, 1240, 1240};
        public File A;
        public SigningCertificateLineage B;
        public boolean C;
        public boolean D;
        public final ArrayList a;
        public SignerConfig b;
        public SigningCertificateLineage c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public int p;
        public String q;
        public Integer r;
        public int s;
        public boolean t;
        public final ApkSignerEngine u;
        public File v;
        public DataSource w;
        public File x;
        public DataSink y;
        public DataSource z;

        public Builder(List<SignerConfig> list) {
            this.d = false;
            this.e = true;
            this.f = true;
            this.g = true;
            this.h = true;
            this.i = true;
            this.j = false;
            this.k = false;
            this.l = false;
            this.m = true;
            this.o = false;
            this.p = 16384;
            this.s = 33;
            this.t = false;
            this.C = false;
            this.D = false;
            if (C0025.m2084(list)) {
                throw new IllegalArgumentException(C0018.m1070(m512(), 20, 43, 2177));
            }
            if (C0034.m3427(list) > 1) {
                this.h = false;
            }
            this.a = new ArrayList(list);
            this.u = null;
        }

        /* JADX INFO: renamed from: ۟ۤۤۥۥ, reason: not valid java name and contains not printable characters */
        public static short[] m512() {
            if (C0064.m4578() > 0) {
                return f16short;
            }
            return null;
        }

        public Builder setInputApk(File file) {
            if (file == null) {
                throw new NullPointerException(C0026.m2321(m512(), 302, 16, 3153));
            }
            this.v = file;
            this.w = null;
            return this;
        }

        public Builder setOutputApk(File file) {
            if (file == null) {
                throw new NullPointerException(C0022.m1728(m512(), 374, 17, 2535));
            }
            this.x = file;
            this.y = null;
            this.z = null;
            return this;
        }

        public final void a() {
            if (C0020.m1424(this) != null) {
                throw new IllegalStateException(C0021.m1650(m512(), 63, 66, 2987));
            }
        }

        public ApkSigner build() {
            boolean zM6364 = C0073.m6364(this);
            if (zM6364 && C0036.m3694(this)) {
                throw new IllegalStateException(C0036.m3678(m512(), 129, 77, 707));
            }
            if (zM6364) {
                this.h = false;
            }
            if (C0036.m3694(this)) {
                this.h = true;
            }
            if (C0073.m6298(this) && !C0016.m696(this) && !C0065.m4670(this)) {
                if (C0038.m3990(this)) {
                    throw new IllegalStateException(C0026.m2321(m512(), 206, 80, 1878));
                }
                this.i = false;
            }
            return new ApkSigner(C0038.m3964(this), C0018.m1029(this), C0035.m3600(this), C0065.m4733(this), C0069.m5705(this), C0068.m5672(this), C0021.m1558(this), C0067.m5474(this), C0075.m6890(this), C0016.m696(this), C0065.m4670(this), C0073.m6298(this), C0018.m1042(this), C0067.m5473(this), C0038.m3990(this), C0030.m2845(this), C0031.m3037(this), C0025.m2174(this), C0019.m1315(this), C0025.m2216(this), C0020.m1424(this), C0017.m892(this), C0075.m6817(this), C0036.m3715(this), C0068.m5553(this), C0032.m3115(this), C0031.m3017(this), C0075.m6870(this), null);
        }

        public Builder setAlignmentPreserved(boolean z) {
            this.o = z;
            return this;
        }

        public Builder setForceSourceStampOverwrite(boolean z) {
            this.d = z;
            return this;
        }

        public Builder setLibraryPageAlignmentBytes(int i) {
            this.p = i;
            return this;
        }

        public Builder setSigningCertificateLineage(SigningCertificateLineage signingCertificateLineage) {
            if (signingCertificateLineage != null) {
                this.h = true;
                this.B = signingCertificateLineage;
            }
            return this;
        }

        public Builder setSourceStampSignerConfig(SignerConfig signerConfig) {
            this.b = signerConfig;
            return this;
        }

        public Builder setSourceStampSigningCertificateLineage(SigningCertificateLineage signingCertificateLineage) {
            this.c = signingCertificateLineage;
            return this;
        }

        public Builder setSourceStampTimestampEnabled(boolean z) {
            this.e = z;
            return this;
        }

        public Builder setV4SignatureOutputFile(File file) {
            if (file == null) {
                throw new NullPointerException(C0019.m1189(m512(), 391, 28, 1204));
            }
            this.A = file;
            return this;
        }

        public Builder setAlignFileSize(boolean z) {
            C0078.m7422(this);
            this.j = z;
            return this;
        }

        public Builder setCreatedBy(String str) {
            C0078.m7422(this);
            C0030.m2951(str);
            this.q = str;
            return this;
        }

        public Builder setDebuggableApkPermitted(boolean z) {
            C0078.m7422(this);
            this.m = z;
            return this;
        }

        public Builder setMinSdkVersion(int i) {
            C0078.m7422(this);
            this.r = C0021.m1548(i);
            return this;
        }

        public Builder setMinSdkVersionForRotation(int i) {
            C0078.m7422(this);
            if (i < 33) {
                this.s = 28;
            } else {
                this.s = i;
            }
            return this;
        }

        public Builder setOtherSignersSignaturesPreserved(boolean z) {
            C0078.m7422(this);
            this.n = z;
            return this;
        }

        public Builder setRotationTargetsDevRelease(boolean z) {
            C0078.m7422(this);
            this.t = z;
            return this;
        }

        public Builder setV1SigningEnabled(boolean z) {
            C0078.m7422(this);
            this.f = z;
            return this;
        }

        public Builder setV2SigningEnabled(boolean z) {
            C0078.m7422(this);
            this.g = z;
            return this;
        }

        public Builder setV3SigningEnabled(boolean z) {
            C0078.m7422(this);
            this.h = z;
            if (z) {
                this.D = true;
            } else {
                this.C = true;
            }
            return this;
        }

        public Builder setV4ErrorReportingEnabled(boolean z) {
            C0078.m7422(this);
            this.l = z;
            return this;
        }

        public Builder setV4SigningEnabled(boolean z) {
            C0078.m7422(this);
            this.i = z;
            this.l = z;
            return this;
        }

        public Builder setVerityEnabled(boolean z) {
            C0078.m7422(this);
            this.k = z;
            return this;
        }

        public Builder setInputApk(DataSource dataSource) {
            if (dataSource != null) {
                this.w = dataSource;
                this.v = null;
                return this;
            }
            throw new NullPointerException(C0027.m2404(m512(), 286, 16, 1141));
        }

        public Builder setOutputApk(ReadableDataSink readableDataSink) {
            if (readableDataSink != null) {
                return C0038.m4027(this, readableDataSink, readableDataSink);
            }
            throw new NullPointerException(C0017.m936(m512(), 357, 17, 1035));
        }

        public Builder setOutputApk(DataSink dataSink, DataSource dataSource) {
            if (dataSink == null) {
                throw new NullPointerException(C0021.m1650(m512(), 337, 20, 3154));
            }
            if (dataSource != null) {
                this.x = null;
                this.y = dataSink;
                this.z = dataSource;
                return this;
            }
            throw new NullPointerException(C0029.m2695(m512(), 318, 19, 1927));
        }

        public Builder(ApkSignerEngine apkSignerEngine) {
            this.d = false;
            this.e = true;
            this.f = true;
            this.g = true;
            this.h = true;
            this.i = true;
            this.j = false;
            this.k = false;
            this.l = false;
            this.m = true;
            this.o = false;
            this.p = 16384;
            this.s = 33;
            this.t = false;
            this.C = false;
            this.D = false;
            if (apkSignerEngine != null) {
                this.u = apkSignerEngine;
                this.a = null;
                return;
            }
            throw new NullPointerException(C0065.m4757(m512(), 0, 20, 358));
        }
    }

    public static class SignerConfig {
        public final String a;
        public final KeyConfig b;
        public final List c;
        public final boolean d;
        public final int e;
        public final SigningCertificateLineage f;

        public static class Builder {

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f17short = {2926, 2886, 2907, 2911, 2898, 2827, 2885, 2890, 2886, 2894, 1005, 965, 984, 988, 977, 904, 966, 969, 965, 973, 823, 779, 774, 835, 787, 785, 780, 789, 778, 775, 774, 775, 835, 783, 778, 781, 774, 770, 772, 774, 835, 775, 780, 774, 784, 835, 781, 780, 791, 835, 768, 780, 781, 791, 770, 778, 781, 835, 791, 779, 774, 835, 784, 778, 772, 781, 778, 781, 772, 835, 768, 774, 785, 791, 778, 773, 778, 768, 770, 791, 774, 847, 835, 1231, 1219, 1157, 1164, 1169, 1219, 1175, 1163, 1162, 1168, 1219, 1200, 1162, 1156, 1165, 1158, 1169, 1184, 1164, 1165, 1157, 1162, 1156, 3175, 3184, 3199, 3092, 3136, 3157, 3142, 3155, 3153, 3136, 3153, 3152, 3092, 3143, 3165, 3155, 3162, 3165, 3162, 3155, 3092, 3159, 3163, 3162, 3154, 3165, 3155, 3092, 3165, 3143, 3092, 3163, 3162, 3160, 3149, 3092, 3143, 3137, 3140, 3140, 3163, 3142, 3136, 3153, 3152, 3092, 3139, 3165, 3136, 3164, 3092, 3136, 3164, 3153, 3092, 3170, 3079, 3092, 3143, 3165, 3155, 3162, 3157, 3136, 3137, 3142, 3153, 3092, 3143, 3159, 3164, 3153, 3161, 3153, 3092, 3163, 3162, 3092, 3189, 3162, 3152, 3142, 3163, 3165, 3152, 3092, 3172, 3092, 3100, 3175, 3184, 3199, 3092, 3138, 3153, 3142, 3143, 3165, 3163, 3162, 3092, 3078, 3084, 3101, 3092, 3157, 3162, 3152, 3092, 3160, 3157, 3136, 3153, 3142};
            public final String a;
            public final KeyConfig b;
            public final ArrayList c;
            public final boolean d;
            public int e;
            public SigningCertificateLineage f;

            @Deprecated
            public Builder(String str, PrivateKey privateKey, List<X509Certificate> list) {
                this(str, privateKey, list, false);
            }

            /* JADX INFO: renamed from: ۟ۧۢ۠ۤ, reason: not valid java name and contains not printable characters */
            public static short[] m514() {
                if (C0067.m5468() <= 0) {
                    return f17short;
                }
                return null;
            }

            public Builder setMinSdkVersion(int i) {
                return C0111.m13041(this, null, i);
            }

            @Deprecated
            public Builder(String str, PrivateKey privateKey, List<X509Certificate> list, boolean z) {
                if (C0077.m7292(str)) {
                    throw new IllegalArgumentException(C0031.m3047(m514(), 10, 10, 936));
                }
                this.a = str;
                this.b = new KeyConfig.Jca(privateKey);
                this.c = new ArrayList(list);
                this.d = z;
            }

            public SignerConfig build() {
                return new SignerConfig(this, null);
            }

            public Builder setLineageForMinSdkVersion(SigningCertificateLineage signingCertificateLineage, int i) {
                int i2 = i;
                if (i2 < 28) {
                    throw new IllegalArgumentException(C0036.m3678(m514(), 106, 114, 3124));
                }
                if (i2 < 33) {
                    i2 = 28;
                }
                this.e = i2;
                if (signingCertificateLineage != null) {
                    ArrayList arrayListM2604 = C0028.m2604(this);
                    if (!C0022.m1653(signingCertificateLineage, (X509Certificate) C0064.m4526(arrayListM2604, 0))) {
                        StringBuilder sb = new StringBuilder(C0037.m3829(m514(), 20, 63, 867));
                        C0036.m3741(sb, C0017.m906((X509Certificate) C0064.m4526(arrayListM2604, 0)));
                        C0077.m7290(sb, C0037.m3829(m514(), 83, 23, 1251));
                        throw new IllegalArgumentException(C0068.m5536(sb));
                    }
                }
                this.f = signingCertificateLineage;
                return this;
            }

            public Builder(String str, KeyConfig keyConfig, List<X509Certificate> list) {
                this(str, keyConfig, list, false);
            }

            public Builder(String str, KeyConfig keyConfig, List<X509Certificate> list, boolean z) {
                if (!C0077.m7292(str)) {
                    this.a = str;
                    this.b = keyConfig;
                    this.c = new ArrayList(list);
                    this.d = z;
                    return;
                }
                throw new IllegalArgumentException(C0019.m1189(m514(), 0, 10, 2859));
            }
        }

        /* JADX INFO: renamed from: ۡۤۤۢ, reason: not valid java name and contains not printable characters */
        public static List m513(Object obj) {
            if (C0077.m7272() <= 0) {
                return DesugarCollections.unmodifiableList((List) obj);
            }
            return null;
        }

        public List<X509Certificate> getCertificates() {
            return C0022.m1693(this);
        }

        public boolean getDeterministicDsaSigning() {
            return C0068.m5597(this);
        }

        public KeyConfig getKeyConfig() {
            return C0111.m13153(this);
        }

        public int getMinSdkVersion() {
            return C0031.m3109(this);
        }

        public String getName() {
            return C0069.m5774(this);
        }

        @Deprecated
        public PrivateKey getPrivateKey() {
            return (PrivateKey) C0036.m3647(C0111.m13153(this), new r(0), new r(1));
        }

        public SigningCertificateLineage getSigningCertificateLineage() {
            return C0024.m2029(this);
        }

        public SignerConfig(Builder builder, AnonymousClass1 anonymousClass1) {
            this.a = C0063.m4441(builder);
            this.b = C0074.m6561(builder);
            this.c = m513(new ArrayList(C0033.m3376(builder)));
            this.d = C0024.m1980(builder);
            this.e = C0077.m7210(builder);
            this.f = C0036.m3649(builder);
        }
    }

    public ApkSigner(List list, SignerConfig signerConfig, SigningCertificateLineage signingCertificateLineage, boolean z, boolean z2, Integer num, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i2, String str, ApkSignerEngine apkSignerEngine, File file, DataSource dataSource, File file2, DataSink dataSink, DataSource dataSource2, File file3, SigningCertificateLineage signingCertificateLineage2, AnonymousClass1 anonymousClass1) {
        this.a = list;
        this.b = signerConfig;
        this.c = signingCertificateLineage;
        this.d = z;
        this.e = z2;
        this.f = num;
        this.g = i;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = z10;
        this.p = z11;
        this.q = z12;
        this.r = z13;
        this.s = i2;
        this.t = str;
        this.u = apkSignerEngine;
        this.v = file;
        this.w = dataSource;
        this.x = file2;
        this.y = dataSink;
        this.z = dataSource2;
        this.A = file3;
        this.B = signingCertificateLineage2;
    }

    /* JADX INFO: renamed from: ۟ۢۥۨۤ, reason: not valid java name and contains not printable characters */
    public static int[] m507() {
        if (C0019.m1311() == 0) {
            return AnonymousClass1.$SwitchMap$com$android$apksig$ApkSignerEngine$InputJarEntryInstructions$OutputPolicy;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static long m508(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((OutputSizeAndDataOffset) obj).outputBytes;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m509() {
        if (C0020.m1385() < 0) {
            return f15short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۧۨ, reason: contains not printable characters */
    public static long m510(Object obj) {
        if (C0036.m3653() < 0) {
            return ((OutputSizeAndDataOffset) obj).dataOffsetBytes;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x059e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.android.apksig.util.DataSource r90, com.android.apksig.util.DataSink r91, com.android.apksig.util.DataSource r92) throws java.io.IOException, com.android.apksig.apk.ApkFormatException {
        /*
            Method dump skipped, instruction units count: 2288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.apksig.ApkSigner.c(com.android.apksig.util.DataSource, com.android.apksig.util.DataSink, com.android.apksig.util.DataSource):void");
    }

    public void sign() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th;
        DataSource dataSourceM2036;
        RandomAccessFile randomAccessFile2 = null;
        try {
            DataSource dataSourceM4028 = C0038.m4028(this);
            if (dataSourceM4028 != null) {
                randomAccessFile = null;
            } else {
                File fileM1621 = C0021.m1621(this);
                if (fileM1621 == null) {
                    throw new IllegalStateException(C0024.m1945(m509(), 771, 23, 1795));
                }
                randomAccessFile = new RandomAccessFile(fileM1621, C0072.m6116(m509(), 744, 1, 2963));
                try {
                    dataSourceM4028 = C0024.m2036(randomAccessFile);
                } catch (Throwable th2) {
                    th = th2;
                    if (randomAccessFile != null) {
                        C0022.m1770(randomAccessFile);
                    }
                    throw th;
                }
            }
            try {
                DataSink dataSinkM2217 = C0025.m2217(this);
                if (dataSinkM2217 != null) {
                    dataSourceM2036 = C0027.m2491(this);
                } else {
                    File fileM3763 = C0036.m3763(this);
                    if (fileM3763 == null) {
                        throw new IllegalStateException(C0023.m1904(m509(), 747, 24, 424));
                    }
                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(fileM3763, C0068.m5544(m509(), 745, 2, 353));
                    try {
                        C0073.m6334(randomAccessFile3, 0L);
                        dataSinkM2217 = C0064.m4554(randomAccessFile3);
                        dataSourceM2036 = C0024.m2036(randomAccessFile3);
                        randomAccessFile2 = randomAccessFile3;
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile2 = randomAccessFile3;
                        if (randomAccessFile2 != null) {
                            C0022.m1770(randomAccessFile2);
                        }
                        throw th;
                    }
                }
                C0019.m1233(this, dataSourceM4028, dataSinkM2217, dataSourceM2036);
                if (randomAccessFile2 != null) {
                    C0022.m1770(randomAccessFile2);
                }
                if (randomAccessFile != null) {
                    C0022.m1770(randomAccessFile);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            randomAccessFile = null;
            th = th5;
        }
    }

    /* JADX INFO: renamed from: com.android.apksig.ApkSigner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$ApkSignerEngine$InputJarEntryInstructions$OutputPolicy;

        /* JADX INFO: renamed from: ۠ۥۣ۠, reason: not valid java name and contains not printable characters */
        public static int[] m511() {
            if (C0019.m1311() == 0) {
                return $SwitchMap$com$android$apksig$ApkSignerEngine$InputJarEntryInstructions$OutputPolicy;
            }
            return null;
        }

        static {
            int[] iArr = new int[C0033.m3255().length];
            $SwitchMap$com$android$apksig$ApkSignerEngine$InputJarEntryInstructions$OutputPolicy = iArr;
            try {
                iArr[C0030.m2893(C0026.m2358())] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m511()[C0030.m2893(C0016.m619())] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                m511()[C0030.m2893(C0023.m1821())] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class OutputSizeAndDataOffset {
        public long dataOffsetBytes;
        public long outputBytes;

        public OutputSizeAndDataOffset(long j, long j2) {
            this.outputBytes = j;
            this.dataOffsetBytes = j2;
        }
    }

    public static long b(String str, byte[] bArr, long j, ArrayList arrayList, int i, int i2, DataSink dataSink) {
        ZipUtils.DeflateResult deflateResultM6041 = C0071.m6041(C0020.m1393(bArr));
        byte[] bArrM2283 = C0026.m2283(deflateResultM6041);
        long jM7155 = C0077.m7155(deflateResultM6041);
        long jM3415 = C0034.m3415(str, i, i2, bArrM2283, jM7155, bArr.length, dataSink);
        C0017.m919(arrayList, C0075.m6827(str, i, i2, jM7155, bArrM2283.length, bArr.length, j));
        return jM3415;
    }

    public static void a(DataSource dataSource, LocalFileRecord localFileRecord, ApkSignerEngine.InspectJarEntryRequest inspectJarEntryRequest) throws ApkFormatException {
        try {
            C0026.m2286(localFileRecord, dataSource, C0037.m3859(inspectJarEntryRequest));
            C0077.m7213(inspectJarEntryRequest);
        } catch (ZipFormatException e) {
            StringBuilder sb = new StringBuilder(C0027.m2404(m509(), 0, 21, 3154));
            C0077.m7290(sb, C0027.m2532(localFileRecord));
            throw new ApkFormatException(C0068.m5536(sb), e);
        }
    }

    public static ByteBuffer getAndroidManifestFromApk(List<CentralDirectoryRecord> list, DataSource dataSource) throws ApkFormatException {
        CentralDirectoryRecord centralDirectoryRecord;
        Iterator itM4732 = C0065.m4732(list);
        while (true) {
            if (C0036.m3657(itM4732)) {
                centralDirectoryRecord = (CentralDirectoryRecord) C0071.m6012(itM4732);
                if (C0070.m5838(C0071.m5991(m509(), 21, 19, 2965), C0073.m6387(centralDirectoryRecord))) {
                    break;
                }
            } else {
                centralDirectoryRecord = null;
                break;
            }
        }
        if (centralDirectoryRecord != null) {
            return C0020.m1393(C0021.m1585(dataSource, centralDirectoryRecord, C0072.m6146(dataSource)));
        }
        throw new ApkFormatException(C0078.m7427(m509(), 40, 27, 2230));
    }
}
