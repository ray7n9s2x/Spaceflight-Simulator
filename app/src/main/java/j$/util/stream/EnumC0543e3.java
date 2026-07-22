package j$.util.stream;

import j$.time.temporal.C0085;
import j$.util.C0101;
import j$.util.InterfaceC0654z;
import j$.util.function.C0094;
import java.util.EnumMap;
import java.util.function.C0105;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.util.stream.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class EnumC0543e3 {
    public static final EnumC0543e3 DISTINCT;
    public static final EnumC0543e3 ORDERED;
    public static final EnumC0543e3 SHORT_CIRCUIT;
    public static final EnumC0543e3 SIZED;
    public static final EnumC0543e3 SORTED;
    static final int f;
    static final int g;
    static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    static final int l;
    static final int m;
    static final int n;
    static final int o;
    static final int p;
    static final int q;
    static final int r;
    static final int s;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f535short = {1630, 1619, 1609, 1614, 1619, 1620, 1625, 1614, 1216, 1244, 1217, 1223, 1238, 1239, 261, 280, 270, 271, 280, 271, 270, 3308, 3318, 3301, 3322, 3323, 2007, 1996, 1995, 2006, 2000, 2011, 1991, 1997, 2006, 1991, 2001, 1997, 2000};
    static final int t;
    static final int u;
    private static final /* synthetic */ EnumC0543e3[] v;
    private final EnumMap a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public static EnumC0543e3 valueOf(String str) {
        return (EnumC0543e3) Enum.valueOf(EnumC0543e3.class, str);
    }

    public static EnumC0543e3[] values() {
        return (EnumC0543e3[]) v.clone();
    }

    static {
        EnumC0538d3 enumC0538d3 = EnumC0538d3.SPLITERATOR;
        C0533c3 c0533c3V = v(enumC0538d3);
        EnumC0538d3 enumC0538d32 = EnumC0538d3.STREAM;
        c0533c3V.a(enumC0538d32);
        EnumC0538d3 enumC0538d33 = EnumC0538d3.OP;
        c0533c3V.a.put(enumC0538d33, 3);
        EnumC0543e3 enumC0543e3 = new EnumC0543e3(C0085.m8236(f535short, 0, 8, 1562), 0, 0, c0533c3V);
        DISTINCT = enumC0543e3;
        C0533c3 c0533c3V2 = v(enumC0538d3);
        c0533c3V2.a(enumC0538d32);
        c0533c3V2.a.put(enumC0538d33, 3);
        EnumC0543e3 enumC0543e32 = new EnumC0543e3(C0094.m9107(f535short, 8, 6, 1171), 1, 1, c0533c3V2);
        SORTED = enumC0543e32;
        C0533c3 c0533c3V3 = v(enumC0538d3);
        c0533c3V3.a(enumC0538d32);
        EnumMap enumMap = c0533c3V3.a;
        enumMap.put(enumC0538d33, 3);
        EnumC0538d3 enumC0538d34 = EnumC0538d3.TERMINAL_OP;
        enumMap.put(enumC0538d34, 2);
        EnumC0538d3 enumC0538d35 = EnumC0538d3.UPSTREAM_TERMINAL_OP;
        enumMap.put(enumC0538d35, 2);
        EnumC0543e3 enumC0543e33 = new EnumC0543e3(C0105.m11310(f535short, 14, 7, 330), 2, 2, c0533c3V3);
        ORDERED = enumC0543e33;
        C0533c3 c0533c3V4 = v(enumC0538d3);
        c0533c3V4.a(enumC0538d32);
        c0533c3V4.a.put(enumC0538d33, 2);
        EnumC0543e3 enumC0543e34 = new EnumC0543e3(C0105.m11310(f535short, 21, 5, 3263), 3, 3, c0533c3V4);
        SIZED = enumC0543e34;
        C0533c3 c0533c3V5 = v(enumC0538d33);
        c0533c3V5.a(enumC0538d34);
        EnumC0543e3 enumC0543e35 = new EnumC0543e3(C0101.m11060(f535short, 26, 13, 1924), 4, 12, c0533c3V5);
        SHORT_CIRCUIT = enumC0543e35;
        v = new EnumC0543e3[]{enumC0543e3, enumC0543e32, enumC0543e33, enumC0543e34, enumC0543e35};
        f = k(enumC0538d3);
        g = k(enumC0538d32);
        h = k(enumC0538d33);
        k(enumC0538d34);
        k(enumC0538d35);
        int i2 = 0;
        for (EnumC0543e3 enumC0543e36 : values()) {
            i2 |= enumC0543e36.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        EnumC0543e3 enumC0543e37 = DISTINCT;
        m = enumC0543e37.c;
        n = enumC0543e37.d;
        EnumC0543e3 enumC0543e38 = SORTED;
        o = enumC0543e38.c;
        p = enumC0543e38.d;
        EnumC0543e3 enumC0543e39 = ORDERED;
        q = enumC0543e39.c;
        r = enumC0543e39.d;
        EnumC0543e3 enumC0543e310 = SIZED;
        s = enumC0543e310.c;
        t = enumC0543e310.d;
        u = SHORT_CIRCUIT.c;
    }

    private static C0533c3 v(EnumC0538d3 enumC0538d3) {
        C0533c3 c0533c3 = new C0533c3(new EnumMap(EnumC0538d3.class));
        c0533c3.a(enumC0538d3);
        return c0533c3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EnumC0543e3(String str, int i2, int i3, C0533c3 c0533c3) {
        EnumC0538d3[] enumC0538d3ArrValues = EnumC0538d3.values();
        int length = enumC0538d3ArrValues.length;
        int i4 = 0;
        while (true) {
            EnumMap enumMap = c0533c3.a;
            if (i4 >= length) {
                this.a = enumMap;
                int i5 = i3 * 2;
                this.b = i5;
                this.c = 1 << i5;
                this.d = 2 << i5;
                this.e = 3 << i5;
                return;
            }
            EnumC0538d3 enumC0538d3 = enumC0538d3ArrValues[i4];
            if (enumMap instanceof InterfaceC0654z) {
                ((InterfaceC0654z) enumMap).putIfAbsent(enumC0538d3, 0);
            } else if (enumMap.get(enumC0538d3) == null) {
                enumMap.put(enumC0538d3, 0);
            }
            i4++;
        }
    }

    final boolean n(int i2) {
        return (i2 & this.e) == this.c;
    }

    final boolean s(int i2) {
        int i3 = this.e;
        return (i2 & i3) == i3;
    }

    private static int k(EnumC0538d3 enumC0538d3) {
        int iIntValue = 0;
        for (EnumC0543e3 enumC0543e3 : values()) {
            iIntValue |= ((Integer) enumC0543e3.a.get(enumC0538d3)).intValue() << enumC0543e3.b;
        }
        return iIntValue;
    }

    static int j(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    static int w(int i2) {
        return i2 & ((~i2) >> 1) & j;
    }

    static int m(j$.util.f0 f0Var) {
        int iCharacteristics = f0Var.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || f0Var.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }
}
