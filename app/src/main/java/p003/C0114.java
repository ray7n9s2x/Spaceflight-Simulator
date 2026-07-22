package p003;

import android.content.Context;
import android.os.Build;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.PointerIconCompat;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.zip.ZipUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.io.encoding.Base64;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟۟۟۟۠۟۟ۡ۟۟ۢ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0114 {

    /* JADX INFO: renamed from: ۟۟۟۟ۤ۟۟۟۟ۥ۟۟۟۟ۦ۟۟۟۟ۧ۟۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static int f579;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f578short = {2431, 2404, 2370, 2378, 2373, 2378, 568, 547, 517, 525, 514, 525, 2772, 2774, 2753, 2770, 2765, 2753, 2771, 2779, 2775, 2752, 2767, 2779, 2765, 2762, 2768, 2750, 2724, 801, 822, 825, 813, 827, 828, 806, 840, 850, 2600, 2623, 2614, 2623, 2619, 2601, 2623, 2624, 2650, 20598, -31900, 19875, 1009, 1008, 1021, 1021, 1020, 1015, 21092, 26345, -875, 24452, -30644, 22626, 25063, -893, 3084, 3095, 3121, 3129, 3126, 3129, 25006, 20960, 19798, -822, 20758, -32252, 22896, 20906, 32258, 31782, 28849, 26069, 726, 702, 664, 660, 668, 20769, 20975, -523, 22789, -31987, 21252, 26505, 20795, 26505, 20776, 30694, 20769, 20975, -541, 2403, 2424, 2401, 2401, 2349, 2425, 2412, 2431, 2410, 2408, 2425, 2349, 2400, 2408, 2425, 2405, 2402, 2409, 1150, 1125, 1148, 1148, 1072, 1149, 1141, 1124, 1144, 1151, 1140, 1072, 1123, 1145, 1143, 1150, 1137, 1124, 1125, 1122, 1141, 1820, 1799, 1822, 1822, 1874, 1823, 1815, 1798, 1818, 1821, 1814, 1874, 1820, 1811, 1823, 1815, 3088, 3083, 3090, 3090, 3166, 3082, 3103, 3084, 3097, 3099, 3082, 3166, 3101, 3090, 3103, 3085, 3085, 1665, 1748, 1747, 1748, 1737, 1667, 1796, 1803, 1796, 1917, 1819, 1852, 1852, 1848, 1917, 1840, 1852, 1825, 1846, 1917, 1819, 1852, 1852, 1848, 1818, 1853, 1845, 1852, 1754, 1757, 1757, 1753, 1787, 1734, 1751, 1759, 1788, 1747, 1759, 1751, 1729, 1327, 1305, 1288, 1327, 1288, 1294, 2813, 2802, 2815, 2797, 2797, 2768, 2815, 2803, 2811, 2491, 2483, 2466, 2494, 2489, 2482, 2456, 2487, 2491, 2483, 1861, 1869, 1884, 1856, 1863, 1868, 1915, 1857, 1871, 2485, 2482, 2482, 2486, 1561, 1562, 1560, 1552, 1550, 1547, 2555, 2528, 2502, 2510, 2497, 2510, 1582, 1581, 1583, 1575, 1593, 1596, 1644, 1569, 1593, 1599, 1592, 1644, 1582, 1577, 1644, 1581, 1644, 1599, 1592, 1581, 1592, 1573, 1583, 1644, 1569, 1577, 1592, 1572, 1571, 1576, 1654, 1644, 1157, 1191, 1192, 1249, 1202, 1254, 1198, 1193, 1193, 1197, 1276, 1254, 454, 477, 507, 499, 508, 499, 3055, 3060, 3053, 3053, 2977, 3049, 3054, 3054, 3050, 2977, 3052, 3044, 3061, 3049, 3054, 3045, 2977, 3054, 3059, 2977, 3049, 3054, 3054, 3050, 2977, 3052, 3060, 3058, 3061, 2977, 3043, 3044, 2977, 3040, 2977, 3058, 3061, 3040, 3061, 3048, 3042, 2977, 3052, 3044, 3061, 3049, 3054, 3045, 3003, 2977, 2769, 2778, 2765, 2778, 2709, 2775, 2778, 2773, 2780, 2709, 2815, 2772, 2766, 2777, 2775, 2782, 3115, 3104, 3127, 3104, 3183, 3117, 3104, 3119, 3110, 3183, 3095, 3118, 3112, 3109, 3276, 3271, 3280, 3271, 3208, 3274, 3271, 3272, 3265, 3208, 3306, 3273, 3272, 3265, 1049, 1042, 1029, 1042, 1117, 1055, 1042, 1053, 1044, 1117, 1073, 1034, 1031, 1046, 513, 522, 541, 522, 581, 519, 522, 517, 524, 581, 553, 516, 516, 519, 526, 522, 517, 2213, 2222, 2233, 2222, 2273, 2211, 2222, 2209, 2216, 2273, 2188, 2215, 2222, 2237, 2222, 2220, 2235, 2218, 2237, 1596, 1591, 1568, 1591, 1656, 1594, 1591, 1592, 1585, 1656, 1541, 1598, 1593, 1572, 1570, 1886, 1877, 1858, 1877, 1818, 1880, 1877, 1882, 1875, 1818, 1906, 1880, 1883, 1877, 1856, 570, 561, 550, 561, 638, 572, 561, 574, 567, 638, 537, 574, 548, 565, 567, 565, 546, 2449, 2494, 2483, 2465, 2465, 2546, 2492, 2493, 2470, 2546, 2484, 2493, 2471, 2492, 2486, 2536, 2546, 1496, 875, 3091, 1670, 1717, 1717, 1702, 1726, 1767, 1715, 1726, 1719, 1698, 1767, 1705, 1704, 1715, 1767, 1697, 1704, 1714, 1705, 1699, 1789, 1767, 1155, 1188, 1212, 1195, 1190, 1187, 1198, 1258, 1195, 1208, 1208, 1195, 1203, 1258, 1214, 1203, 1210, 1199, 2096, 2059, 2070, 2064, 2069, 2069, 2058, 2071, 2065, ZipUtils.GP_FLAG_EFS, 2049, 2117, 2065, 2076, 2069, ZipUtils.GP_FLAG_EFS, 2143, 2117};
    public static final String TAG_FLAG = C0205.m13272(f578short, 0, 6, 2333);

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00ae. Please report as an issue. */
    static {
        int i = Build.VERSION.SDK_INT;
        f579 = i;
        C0204.m13267(f578short, 6, 6, 602);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = i < 23 ? 1678 : 1709;
                    break;
                case 204:
                    try {
                        String str = C0203.m13263(f578short, 12, 17, 2692) + Build.VERSION.PREVIEW_SDK_INT;
                        int i3 = Build.VERSION.PREVIEW_SDK_INT;
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = i3 == 0 ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    f579++;
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }
                    break;
                case 239:
                    break;
            }
        }
        String str2 = C0203.m13263(f578short, 29, 9, 882) + f579;
        String str3 = C0205.m13272(f578short, 38, 9, 2682) + Build.VERSION.RELEASE;
        String strSN = C0112.SN();
        int i6 = 48767;
        while (true) {
            i6 ^= 48784;
            switch (i6) {
                case 14:
                    break;
                case 45:
                    System.load(C0193.f706);
                    break;
                case Base64.mimeLineLength /* 76 */:
                    System.loadLibrary(C0112.SN());
                    int i7 = 48891;
                    while (true) {
                        i7 ^= 48908;
                        switch (i7) {
                            case 22:
                                break;
                            case 503:
                                i7 = 48922;
                                break;
                        }
                    }
                    break;
                case 239:
                    i6 = strSN == null ? 48829 : 48860;
                    break;
            }
        }
        init(f579, m13195(C0193.f695));
        C0115.init();
    }

    public static native void NativeInit(String str, String str2, String str3, int i, boolean z, boolean z2);

    public static native boolean backupAndHookNative(Object obj, Method method, Method method2);

    public static native void ensureMethodCached(Method method, Method method2);

    public static native Object findMethodNative(Class cls, String str, String str2);

    public static native void fixR(long j);

    public static native long getThread();

    public static native void init(int i, boolean z);

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m13189(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    /* JADX WARN: Removed duplicated region for block: B:59:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m13190(java.lang.Class<?> r5, java.lang.String r6, java.lang.Class<?>... r7) {
        /*
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 1616(0x650, float:2.264E-42)
        L4:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto La;
                case 49: goto Ld;
                case 204: goto L14;
                case 239: goto L58;
                default: goto L9;
            }
        L9:
            goto L4
        La:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L4
        Ld:
            r1 = 28
            if (r2 < r1) goto La
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L4
        L14:
            short[] r1 = p003.C0114.f578short     // Catch: java.lang.Exception -> L5a
            r2 = 173(0xad, float:2.42E-43)
            r3 = 6
            r4 = 1725(0x6bd, float:2.417E-42)
            java.lang.String r1 = p003.C0203.m13263(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L5a
            boolean r2 = r6.equals(r1)     // Catch: java.lang.Exception -> L5a
            r1 = 1740(0x6cc, float:2.438E-42)
        L25:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2b;
                case 54: goto L30;
                case 471: goto L4b;
                case 500: goto L33;
                default: goto L2a;
            }     // Catch: java.lang.Exception -> L5a
        L2a:
            goto L25
        L2b:
            if (r2 == 0) goto L30
            r1 = 1833(0x729, float:2.569E-42)
            goto L25
        L30:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L25
        L33:
            java.lang.reflect.Constructor r2 = p003.C0202.m13259(r5, r7)     // Catch: java.lang.Exception -> L5a
            r0 = r2
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch: java.lang.Exception -> L5a
            r1 = r0
            r1 = 1
            r2.setAccessible(r1)     // Catch: java.lang.Exception -> L5a
            r1 = 1864(0x748, float:2.612E-42)
        L41:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L47;
                case 47483: goto L57;
                default: goto L46;
            }     // Catch: java.lang.Exception -> L5a
        L46:
            goto L41
        L47:
            r1 = 48674(0xbe22, float:6.8207E-41)
            goto L41
        L4b:
            java.lang.reflect.Method r2 = p003.C0202.m13261(r5, r6, r7)     // Catch: java.lang.Exception -> L5a
            r0 = r2
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L5a
            r1 = r0
            r1 = 1
            r2.setAccessible(r1)     // Catch: java.lang.Exception -> L5a
        L57:
            return r2
        L58:
            r2 = 0
            goto L57
        L5a:
            r1 = move-exception
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L5e:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L58;
                case 239: goto L66;
                default: goto L65;
            }
        L65:
            goto L5e
        L66:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: p003.C0114.m13190(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m13191(ClassLoader classLoader, ClassLoader classLoader2) {
        String[] strArr;
        int length;
        int i;
        try {
            strArr = (String[]) Class.forName(C0203.m13263(f578short, 179, 22, 1875), true, classLoader).getField(C0205.m13272(f578short, 201, 13, 1714)).get(null);
            length = strArr.length;
            i = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i >= length ? 1678 : 1709;
                        break;
                    case 204:
                        m13192(classLoader, strArr[i], classLoader2);
                        i++;
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
            }
            int iM13275 = C0206.m13275();
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        i4 = iM13275 < 0 ? 48705 : 48736;
                        break;
                    case 47384:
                        break;
                    case 47417:
                        System.out.println(Integer.parseInt(C0206.m13276("0gfG3a")));
                        break;
                    case 47483:
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x00ac. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x0108. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m13192(ClassLoader classLoader, String str, ClassLoader classLoader2) {
        try {
            Class<?> cls = Class.forName(str, true, classLoader);
            int i = 0;
            cls.getDeclaredMethod(C0205.m13272(f578short, 214, 6, 1404), new Class[0]).invoke(cls, new Object[0]);
            Method method = null;
            String str2 = (String) cls.getField(C0204.m13267(f578short, 220, 9, 2718)).get(null);
            String str3 = (String) cls.getField(C0207.m13281(f578short, 229, 10, 2518)).get(null);
            String str4 = (String) cls.getField(C0203.m13263(f578short, 239, 9, 1832)).get(null);
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = str2 == null ? 1678 : 1709;
                        break;
                    case 204:
                        boolean zEquals = str2.equals("");
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = !zEquals ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    Class<?> cls2 = Class.forName(str2, true, classLoader2);
                                    Method[] declaredMethods = cls.getDeclaredMethods();
                                    int length = declaredMethods.length;
                                    Method method2 = null;
                                    while (true) {
                                        int i4 = 48767;
                                        while (true) {
                                            i4 ^= 48784;
                                            switch (i4) {
                                                case 14:
                                                    break;
                                                case 45:
                                                    break;
                                                case Base64.mimeLineLength /* 76 */:
                                                    Method method3 = declaredMethods[i];
                                                    boolean zEquals2 = method3.getName().equals(C0205.m13272(f578short, 248, 4, 2525));
                                                    int i5 = 48891;
                                                    while (true) {
                                                        i5 ^= 48908;
                                                        switch (i5) {
                                                            case 22:
                                                                break;
                                                            case 53:
                                                                break;
                                                            case 503:
                                                                i5 = !zEquals2 ? 48953 : 49635;
                                                                break;
                                                            case 32495:
                                                                boolean zIsStatic = Modifier.isStatic(method3.getModifiers());
                                                                int i6 = 49666;
                                                                while (true) {
                                                                    i6 ^= 49683;
                                                                    switch (i6) {
                                                                        case 17:
                                                                            i6 = !zIsStatic ? 49728 : 49759;
                                                                            break;
                                                                        case 50:
                                                                            break;
                                                                        case Base64.mimeLineLength /* 76 */:
                                                                            int i7 = 49790;
                                                                            while (true) {
                                                                                i7 ^= 49807;
                                                                                switch (i7) {
                                                                                    case 18:
                                                                                        break;
                                                                                    case 241:
                                                                                        i7 = 49821;
                                                                                        break;
                                                                                }
                                                                                method = method3;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    boolean zEquals3 = method3.getName().equals(C0203.m13263(f578short, 252, 6, 1659));
                                                    int i8 = 49914;
                                                    while (true) {
                                                        i8 ^= 49931;
                                                        switch (i8) {
                                                            case 497:
                                                                i8 = !zEquals3 ? 50627 : 50658;
                                                                break;
                                                            case 1711:
                                                                break;
                                                            case 1736:
                                                                break;
                                                            case 1769:
                                                                boolean zIsStatic2 = Modifier.isStatic(method3.getModifiers());
                                                                int i9 = 50689;
                                                                while (true) {
                                                                    i9 ^= 50706;
                                                                    switch (i9) {
                                                                        case 19:
                                                                            i9 = !zIsStatic2 ? 50751 : 50782;
                                                                            break;
                                                                        case 45:
                                                                            break;
                                                                        case 50:
                                                                            break;
                                                                        case Base64.mimeLineLength /* 76 */:
                                                                            method2 = method3;
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    i++;
                                                    int i10 = 50813;
                                                    while (true) {
                                                        i10 ^= 50830;
                                                        switch (i10) {
                                                            case 18:
                                                                break;
                                                            case 243:
                                                                i10 = 50844;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 239:
                                                    i4 = i >= length ? 48829 : 48860;
                                                    break;
                                            }
                                            m13194(m13189(cls2, str3, str4), method, method2);
                                            int i11 = 51588;
                                            while (true) {
                                                i11 ^= 51605;
                                                switch (i11) {
                                                    case 17:
                                                        i11 = 51619;
                                                        break;
                                                    case 54:
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 500:
                                    int i12 = 1864;
                                    while (true) {
                                        i12 ^= 1881;
                                        switch (i12) {
                                            case 17:
                                                i12 = 48674;
                                                continue;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
                return;
            }
            int iM13262 = C0203.m13262();
            int i13 = 51712;
            while (true) {
                i13 ^= 51729;
                switch (i13) {
                    case 14:
                        break;
                    case 17:
                        i13 = iM13262 > 0 ? 51774 : 51805;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        break;
                    case Base64.mimeLineLength /* 76 */:
                        System.out.println(Float.valueOf(C0204.m13269("7aK")));
                        break;
                }
                return;
            }
        } catch (Exception e) {
            C0205.m13272(f578short, AndroidBinXmlParser.Chunk.RES_XML_TYPE_START_ELEMENT, 6, 2457);
            e.toString();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m13193(ClassLoader classLoader, String[] strArr, ClassLoader classLoader2) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i >= length ? 1678 : 1709;
                        break;
                    case 204:
                        m13192(classLoader, strArr[i], classLoader2);
                        i++;
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m13194(Object obj, Method method, Method method2) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = method == null ? 1678 : 1709;
                    break;
                case 204:
                    boolean zIsStatic = Modifier.isStatic(method.getModifiers());
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zIsStatic ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = method2 == null ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zIsStatic2 = Modifier.isStatic(method2.getModifiers());
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        throw new IllegalArgumentException(C0204.m13267(f578short, 264, 32, 1612) + method2);
                                                    case Base64.mimeLineLength /* 76 */:
                                                        C0115.m13203(method, method2);
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 503:
                                                                    i5 = 48922;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i4 = !zIsStatic2 ? 48829 : 48860;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                int i6 = f579;
                                int i7 = 49666;
                                while (true) {
                                    i7 ^= 49683;
                                    switch (i7) {
                                        case 17:
                                            i7 = i6 < 30 ? 49728 : 49759;
                                            break;
                                        case 50:
                                            break;
                                        case Base64.mimeLineLength /* 76 */:
                                            fixR(getThread());
                                            break;
                                        case 83:
                                            break;
                                    }
                                }
                                boolean zBackupAndHookNative = backupAndHookNative(obj, method, method2);
                                int i8 = 49790;
                                while (true) {
                                    i8 ^= 49807;
                                    switch (i8) {
                                        case 18:
                                            break;
                                        case 51:
                                            return;
                                        case 84:
                                            C0203.m13263(f578short, 308, 6, 420);
                                            String str = C0207.m13281(f578short, 296, 12, 1222) + obj;
                                            return;
                                        case 241:
                                            i8 = !zBackupAndHookNative ? 49883 : 49852;
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        throw new IllegalArgumentException(C0205.m13272(f578short, 314, 50, 2945) + method);
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m13195(Context context) {
        int i = context.getApplicationInfo().flags;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = (i & 2) == 0 ? 1678 : 1709;
                    break;
                case 204:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return true;
                        }
                    }
                    break;
                case 239:
                    return false;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:109:0x01c3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:114:0x01d3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:126:0x0207. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:131:0x0217. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:143:0x024b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:148:0x025b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:160:0x028f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:165:0x029f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:177:0x02d3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:186:0x0306. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:190:0x0316. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:196:0x032b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:201:0x033c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:206:0x034d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:211:0x035e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:216:0x036f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:221:0x0380. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:226:0x0391. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0068. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x009c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00ae. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00c3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00f7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0107. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x013b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x014b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:92:0x017f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x018f. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static Class<?>[] m13196(String str) {
        Class<?> cls;
        String strValueOf;
        Class cls2;
        String strSubstring = str.substring(str.indexOf(40) + 1, str.indexOf(41));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = strSubstring.length();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i >= length ? 1678 : 1709;
                        break;
                    case 204:
                        char cCharAt = strSubstring.charAt(i);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = cCharAt != 'L' ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    int i4 = 1512494;
                                    while (true) {
                                        i4 ^= 1512511;
                                        switch (i4) {
                                            case 17:
                                                i4 = cCharAt != '[' ? 1512556 : 1513238;
                                                break;
                                            case 83:
                                                int i5 = 1515439;
                                                while (true) {
                                                    i5 ^= 1515456;
                                                    switch (i5) {
                                                        case 111:
                                                            i5 = cCharAt == 'F' ? 1516152 : 1516183;
                                                            break;
                                                        case 15703:
                                                            int i6 = 1516214;
                                                            while (true) {
                                                                i6 ^= 1516231;
                                                                switch (i6) {
                                                                    case 18:
                                                                        break;
                                                                    case 51:
                                                                        cls2 = Short.TYPE;
                                                                        int i7 = 1540239;
                                                                        while (true) {
                                                                            i7 ^= 1540256;
                                                                            switch (i7) {
                                                                                case 14:
                                                                                    break;
                                                                                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                                                                    i7 = 1540270;
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 113:
                                                                        i6 = cCharAt == 'S' ? 1516276 : 1516307;
                                                                        break;
                                                                    case 468:
                                                                        int i8 = 1516338;
                                                                        while (true) {
                                                                            i8 ^= 1516355;
                                                                            switch (i8) {
                                                                                case 18:
                                                                                    break;
                                                                                case 51:
                                                                                    cls2 = Boolean.TYPE;
                                                                                    int i9 = 1539464;
                                                                                    while (true) {
                                                                                        i9 ^= 1539481;
                                                                                        switch (i9) {
                                                                                            case 17:
                                                                                                i9 = 1540146;
                                                                                                break;
                                                                                            case 64939:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 113:
                                                                                    i8 = cCharAt == 'Z' ? 1516400 : 1537263;
                                                                                    break;
                                                                                case 22444:
                                                                                    int i10 = 1537294;
                                                                                    while (true) {
                                                                                        i10 ^= 1537311;
                                                                                        switch (i10) {
                                                                                            case 17:
                                                                                                i10 = cCharAt == 'I' ? 1537356 : 1537387;
                                                                                                break;
                                                                                            case 50:
                                                                                                break;
                                                                                            case 83:
                                                                                                cls2 = Integer.TYPE;
                                                                                                int i11 = 1539340;
                                                                                                while (true) {
                                                                                                    i11 ^= 1539357;
                                                                                                    switch (i11) {
                                                                                                        case 17:
                                                                                                            i11 = 1539371;
                                                                                                            break;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 116:
                                                                                                int i12 = 1537418;
                                                                                                while (true) {
                                                                                                    i12 ^= 1537435;
                                                                                                    switch (i12) {
                                                                                                        case 17:
                                                                                                            i12 = cCharAt == 'J' ? 1537480 : 1537511;
                                                                                                            break;
                                                                                                        case 50:
                                                                                                            break;
                                                                                                        case 83:
                                                                                                            cls2 = Long.TYPE;
                                                                                                            int i13 = 1539216;
                                                                                                            while (true) {
                                                                                                                i13 ^= 1539233;
                                                                                                                switch (i13) {
                                                                                                                    case 14:
                                                                                                                        break;
                                                                                                                    case 49:
                                                                                                                        i13 = 1539247;
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        case 124:
                                                                                                            switch (cCharAt) {
                                                                                                                case 'B':
                                                                                                                    cls2 = Byte.TYPE;
                                                                                                                    int i14 = 1538441;
                                                                                                                    while (true) {
                                                                                                                        i14 ^= 1538458;
                                                                                                                        switch (i14) {
                                                                                                                            case 19:
                                                                                                                                i14 = 1538472;
                                                                                                                                break;
                                                                                                                            case 50:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'C':
                                                                                                                    cls2 = Character.TYPE;
                                                                                                                    int i15 = 1538317;
                                                                                                                    while (true) {
                                                                                                                        i15 ^= 1538334;
                                                                                                                        switch (i15) {
                                                                                                                            case 19:
                                                                                                                                i15 = 1538348;
                                                                                                                                break;
                                                                                                                            case 50:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'D':
                                                                                                                    cls2 = Double.TYPE;
                                                                                                                    int i16 = 1537542;
                                                                                                                    while (true) {
                                                                                                                        i16 ^= 1537559;
                                                                                                                        switch (i16) {
                                                                                                                            case 17:
                                                                                                                                i16 = 1538224;
                                                                                                                                break;
                                                                                                                            case 3751:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    throw new IllegalArgumentException(C0204.m13267(f578short, 565, 18, 2149) + cCharAt);
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 15769:
                                                            break;
                                                        case 15800:
                                                            cls2 = Float.TYPE;
                                                            break;
                                                    }
                                                }
                                                arrayList.add(cls2);
                                                i++;
                                                int i17 = 1540363;
                                                while (true) {
                                                    i17 ^= 1540380;
                                                    switch (i17) {
                                                        case 23:
                                                            i17 = 1540394;
                                                            break;
                                                        case 54:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 114:
                                                break;
                                            case 809:
                                                int i18 = 0;
                                                while (true) {
                                                    int length2 = strSubstring.length();
                                                    int i19 = 1513269;
                                                    while (true) {
                                                        i19 ^= 1513286;
                                                        switch (i19) {
                                                            case 18:
                                                                break;
                                                            case 53:
                                                                break;
                                                            case 115:
                                                                i19 = i >= length2 ? 1513331 : 1513362;
                                                                break;
                                                            case 212:
                                                                char cCharAt2 = strSubstring.charAt(i);
                                                                int i20 = 1513393;
                                                                while (true) {
                                                                    i20 ^= 1513410;
                                                                    switch (i20) {
                                                                        case 18:
                                                                            break;
                                                                        case 45:
                                                                            break;
                                                                        case 115:
                                                                            i20 = cCharAt2 != '[' ? 1513455 : 1513486;
                                                                            break;
                                                                        case 4044:
                                                                            i18++;
                                                                            i++;
                                                                            int i21 = 1513517;
                                                                            while (true) {
                                                                                i21 ^= 1513534;
                                                                                switch (i21) {
                                                                                    case 19:
                                                                                        i21 = 1514199;
                                                                                        break;
                                                                                    case 745:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                                int length3 = strSubstring.length();
                                                int i22 = 1514292;
                                                while (true) {
                                                    i22 ^= 1514309;
                                                    switch (i22) {
                                                        case 22:
                                                            break;
                                                        case 55:
                                                            throw new IllegalArgumentException(C0204.m13267(f578short, 547, 18, 1226));
                                                        case 113:
                                                            i22 = i >= length3 ? 1514354 : 1514385;
                                                            break;
                                                        case 212:
                                                            char cCharAt3 = strSubstring.charAt(i);
                                                            int i23 = 1514416;
                                                            while (true) {
                                                                i23 ^= 1514433;
                                                                switch (i23) {
                                                                    case 14:
                                                                        break;
                                                                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                                                        i++;
                                                                        strValueOf = String.valueOf(cCharAt3);
                                                                        break;
                                                                    case 113:
                                                                        i23 = cCharAt3 != 'L' ? 1514478 : 1515160;
                                                                        break;
                                                                    case 1369:
                                                                        int iIndexOf = strSubstring.indexOf(59, i);
                                                                        strValueOf = C0203.m13263(f578short, 522, 1, 1428) + strSubstring.substring(i + 1, iIndexOf).replace('/', '.') + C0205.m13272(f578short, 523, 1, 848);
                                                                        i = iIndexOf + 1;
                                                                        int i24 = 1515191;
                                                                        while (true) {
                                                                            i24 ^= 1515208;
                                                                            switch (i24) {
                                                                                case 30:
                                                                                    break;
                                                                                case WorkQueueKt.MASK /* 127 */:
                                                                                    i24 = 1515222;
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                            try {
                                                                arrayList.add(Class.forName(C0188.m13213("", Collections.nCopies(i18, C0205.m13272(f578short, 524, 1, 3144))) + strValueOf));
                                                                int i25 = 1515315;
                                                                while (true) {
                                                                    i25 ^= 1515332;
                                                                    switch (i25) {
                                                                        case 22:
                                                                            continue;
                                                                        case 119:
                                                                            i25 = 1515346;
                                                                            break;
                                                                    }
                                                                }
                                                            } catch (ClassNotFoundException e) {
                                                                throw new RuntimeException(C0203.m13263(f578short, 525, 22, 1735) + strValueOf, e);
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 500:
                                    int iIndexOf2 = strSubstring.indexOf(59, i);
                                    String strReplace = strSubstring.substring(i + 1, iIndexOf2).replace('/', '.');
                                    strReplace.hashCode();
                                    strReplace.hashCode();
                                    byte b = -1;
                                    switch (strReplace.hashCode()) {
                                        case -2056817302:
                                            boolean zEquals = strReplace.equals(C0207.m13281(f578short, 488, 17, 592));
                                            int i26 = 1507751;
                                            while (true) {
                                                i26 ^= 1507768;
                                                switch (i26) {
                                                    case 31:
                                                        i26 = !zEquals ? 1508495 : 1508464;
                                                        break;
                                                    case 1335:
                                                        int i27 = 1508526;
                                                        while (true) {
                                                            i27 ^= 1508543;
                                                            switch (i27) {
                                                                case 17:
                                                                    i27 = 1508557;
                                                                    break;
                                                                case 114:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 1480:
                                                        b = 0;
                                                        break;
                                                    case 1513:
                                                        break;
                                                }
                                            }
                                            break;
                                        case -527879800:
                                            boolean zEquals2 = strReplace.equals(C0205.m13272(f578short, 473, 15, 1844));
                                            int i28 = 56579;
                                            while (true) {
                                                i28 ^= 56596;
                                                switch (i28) {
                                                    case 23:
                                                        i28 = !zEquals2 ? 1507472 : 56641;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        b = 1;
                                                        int i29 = 1507627;
                                                        while (true) {
                                                            i29 ^= 1507644;
                                                            switch (i29) {
                                                                case 23:
                                                                    i29 = 1507658;
                                                                    break;
                                                                case 118:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 1564036:
                                                        int i30 = 1507503;
                                                        while (true) {
                                                            i30 ^= 1507520;
                                                            switch (i30) {
                                                                case 14:
                                                                    break;
                                                                case 111:
                                                                    i30 = 1507534;
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case -515992664:
                                            boolean zEquals3 = strReplace.equals(C0204.m13267(f578short, 458, 15, 1622));
                                            int i31 = 55556;
                                            while (true) {
                                                i31 ^= 55573;
                                                switch (i31) {
                                                    case 17:
                                                        i31 = !zEquals3 ? 55649 : 55618;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        b = 2;
                                                        int i32 = 56455;
                                                        while (true) {
                                                            i32 ^= 56472;
                                                            switch (i32) {
                                                                case 31:
                                                                    i32 = 56486;
                                                                    break;
                                                                case 62:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 116:
                                                        int i33 = 55680;
                                                        while (true) {
                                                            i33 ^= 55697;
                                                            switch (i33) {
                                                                case 17:
                                                                    i33 = 56362;
                                                                    break;
                                                                case 1467:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 155276373:
                                            boolean zEquals4 = strReplace.equals(C0205.m13272(f578short, 439, 19, 2255));
                                            int i34 = 54533;
                                            while (true) {
                                                i34 ^= 54550;
                                                switch (i34) {
                                                    case 19:
                                                        i34 = !zEquals4 ? 54626 : 54595;
                                                        break;
                                                    case 50:
                                                        break;
                                                    case 85:
                                                        b = 3;
                                                        int i35 = 55432;
                                                        while (true) {
                                                            i35 ^= 55449;
                                                            switch (i35) {
                                                                case 17:
                                                                    i35 = 55463;
                                                                    break;
                                                                case 62:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 116:
                                                        int i36 = 54657;
                                                        while (true) {
                                                            i36 ^= 54674;
                                                            switch (i36) {
                                                                case 19:
                                                                    i36 = 54688;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 344809556:
                                            boolean zEquals5 = strReplace.equals(C0204.m13267(f578short, 422, 17, 619));
                                            int i37 = 53510;
                                            while (true) {
                                                i37 ^= 53527;
                                                switch (i37) {
                                                    case 17:
                                                        i37 = !zEquals5 ? 53603 : 53572;
                                                        break;
                                                    case 50:
                                                        break;
                                                    case 83:
                                                        b = 4;
                                                        int i38 = 53758;
                                                        while (true) {
                                                            i38 ^= 53775;
                                                            switch (i38) {
                                                                case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                                                                    i38 = 54440;
                                                                    break;
                                                                case 1703:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 116:
                                                        int i39 = 53634;
                                                        while (true) {
                                                            i39 ^= 53651;
                                                            switch (i39) {
                                                                case 17:
                                                                    i39 = 53665;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 398507100:
                                            boolean zEquals6 = strReplace.equals(C0205.m13272(f578short, 408, 14, 1139));
                                            int i40 = 51836;
                                            while (true) {
                                                i40 ^= 51853;
                                                switch (i40) {
                                                    case 241:
                                                        i40 = !zEquals6 ? 52580 : 52549;
                                                        break;
                                                    case 1963:
                                                        break;
                                                    case 1992:
                                                        b = 5;
                                                        int i41 = 52735;
                                                        while (true) {
                                                            i41 ^= 52752;
                                                            switch (i41) {
                                                                case 14:
                                                                    break;
                                                                case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                                                                    i41 = 52766;
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 2025:
                                                        int i42 = 52611;
                                                        while (true) {
                                                            i42 ^= 52628;
                                                            switch (i42) {
                                                                case 23:
                                                                    i42 = 52642;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 398795216:
                                            boolean zEquals7 = strReplace.equals(C0203.m13263(f578short, 394, 14, 3238));
                                            int i43 = 50813;
                                            while (true) {
                                                i43 ^= 50830;
                                                switch (i43) {
                                                    case 18:
                                                        break;
                                                    case 53:
                                                        b = 6;
                                                        int i44 = 51712;
                                                        while (true) {
                                                            i44 ^= 51729;
                                                            switch (i44) {
                                                                case 17:
                                                                    i44 = 51743;
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 243:
                                                        i43 = !zEquals7 ? 51557 : 50875;
                                                        break;
                                                    case 4075:
                                                        int i45 = 51588;
                                                        while (true) {
                                                            i45 ^= 51605;
                                                            switch (i45) {
                                                                case 17:
                                                                    i45 = 51619;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 399092968:
                                            boolean zEquals8 = strReplace.equals(C0204.m13267(f578short, 380, 14, 3137));
                                            int i46 = 49790;
                                            while (true) {
                                                i46 ^= 49807;
                                                switch (i46) {
                                                    case 18:
                                                        break;
                                                    case 51:
                                                        b = 7;
                                                        int i47 = 50689;
                                                        while (true) {
                                                            i47 ^= 50706;
                                                            switch (i47) {
                                                                case 19:
                                                                    i47 = 50720;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 84:
                                                        int i48 = 49914;
                                                        while (true) {
                                                            i48 ^= 49931;
                                                            switch (i48) {
                                                                case 497:
                                                                    i48 = 50596;
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 241:
                                                        i46 = !zEquals8 ? 49883 : 49852;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 761287205:
                                            boolean zEquals9 = strReplace.equals(C0205.m13272(f578short, 364, 16, 2747));
                                            int i49 = 48767;
                                            while (true) {
                                                i49 ^= 48784;
                                                switch (i49) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        b = 8;
                                                        int i50 = 49666;
                                                        while (true) {
                                                            i50 ^= 49683;
                                                            switch (i50) {
                                                                case 17:
                                                                    i50 = 49697;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        int i51 = 48891;
                                                        while (true) {
                                                            i51 ^= 48908;
                                                            switch (i51) {
                                                                case 22:
                                                                    break;
                                                                case 503:
                                                                    i51 = 48922;
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 239:
                                                        i49 = !zEquals9 ? 48860 : 48829;
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            int i52 = 1864;
                                            while (true) {
                                                i52 ^= 1881;
                                                switch (i52) {
                                                    case 17:
                                                        i52 = 48674;
                                                        break;
                                                    case 47483:
                                                        break;
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    switch (b) {
                                        case 0:
                                            cls = Integer.TYPE;
                                            break;
                                        case 1:
                                            cls = Float.TYPE;
                                            int i53 = 1511595;
                                            while (true) {
                                                i53 ^= 1511612;
                                                switch (i53) {
                                                    case 23:
                                                        i53 = 1512277;
                                                        break;
                                                    case 1001:
                                                        break;
                                                }
                                                break;
                                            }
                                            break;
                                        case 2:
                                            cls = Short.TYPE;
                                            int i54 = 1511471;
                                            while (true) {
                                                i54 ^= 1511488;
                                                switch (i54) {
                                                    case 14:
                                                        break;
                                                    case 111:
                                                        i54 = 1511502;
                                                        break;
                                                }
                                                break;
                                            }
                                            break;
                                        case 3:
                                            cls = Character.TYPE;
                                            int i55 = 1511347;
                                            while (true) {
                                                i55 ^= 1511364;
                                                switch (i55) {
                                                    case 22:
                                                        break;
                                                    case 119:
                                                        i55 = 1511378;
                                                        break;
                                                }
                                                break;
                                            }
                                            break;
                                        case 4:
                                            cls = Boolean.TYPE;
                                            int i56 = 1510572;
                                            while (true) {
                                                i56 ^= 1510589;
                                                switch (i56) {
                                                    case 17:
                                                        i56 = 1510603;
                                                        break;
                                                    case 118:
                                                        break;
                                                }
                                                break;
                                            }
                                            break;
                                        case 5:
                                            cls = Byte.TYPE;
                                            int i57 = 1510448;
                                            while (true) {
                                                i57 ^= 1510465;
                                                switch (i57) {
                                                    case 14:
                                                        break;
                                                    case 113:
                                                        i57 = 1510479;
                                                        break;
                                                }
                                                break;
                                            }
                                            break;
                                        case 6:
                                            cls = Long.TYPE;
                                            int i58 = 1509673;
                                            while (true) {
                                                i58 ^= 1509690;
                                                switch (i58) {
                                                    case 19:
                                                        i58 = 1510355;
                                                        break;
                                                    case 745:
                                                        break;
                                                }
                                                break;
                                            }
                                            break;
                                        case 7:
                                            cls = Void.TYPE;
                                            int i59 = 1509549;
                                            while (true) {
                                                i59 ^= 1509566;
                                                switch (i59) {
                                                    case 19:
                                                        i59 = 1509580;
                                                        break;
                                                    case 114:
                                                        break;
                                                }
                                                break;
                                            }
                                            break;
                                        case 8:
                                            cls = Double.TYPE;
                                            int i60 = 1509425;
                                            while (true) {
                                                i60 ^= 1509442;
                                                switch (i60) {
                                                    case 18:
                                                        break;
                                                    case 115:
                                                        i60 = 1509456;
                                                        break;
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            try {
                                                cls = Class.forName(strReplace);
                                                int i61 = 1508650;
                                                while (true) {
                                                    i61 ^= 1508667;
                                                    switch (i61) {
                                                        case 17:
                                                            i61 = 1508681;
                                                            break;
                                                        case 114:
                                                            break;
                                                    }
                                                }
                                            } catch (ClassNotFoundException e2) {
                                                throw new RuntimeException(C0204.m13267(f578short, 505, 17, 2514) + strReplace, e2);
                                            }
                                            break;
                                    }
                                    arrayList.add(cls);
                                    i = iIndexOf2 + 1;
                                    int i62 = 1512370;
                                    while (true) {
                                        i62 ^= 1512387;
                                        switch (i62) {
                                            case 18:
                                                break;
                                            case 113:
                                                i62 = 1512401;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 239:
                        return (Class[]) arrayList.toArray(new Class[0]);
                }
            }
        }
    }
}
