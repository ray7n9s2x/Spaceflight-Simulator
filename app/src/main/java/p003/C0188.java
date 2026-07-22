package p003;

import java.util.Iterator;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۢۦۤ۟۟ۢۦۥ۟۟ۢۦۦ۟۟ۢۦۧ۟۟ۢۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0188 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f665short = {2854, 2855, 2862, 2859, 2863, 2859, 2870, 2855, 2864};

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ long m13212(int i) {
        return ((long) i) & 4294967295L;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0021. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x003e. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m13213(CharSequence charSequence, Iterable iterable) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = charSequence == null ? 1678 : 1709;
                    break;
                case 204:
                    StringBuilder sb = new StringBuilder();
                    Iterator it = iterable.iterator();
                    boolean zHasNext = it.hasNext();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zHasNext ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                while (true) {
                                    sb.append((CharSequence) it.next());
                                    boolean zHasNext2 = it.hasNext();
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = !zHasNext2 ? 48705 : 48736;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                sb.append(charSequence);
                                                int i4 = 48767;
                                                while (true) {
                                                    i4 ^= 48784;
                                                    switch (i4) {
                                                        case 14:
                                                            break;
                                                        case 239:
                                                            i4 = 48798;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                        }
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                    return sb.toString();
                case 239:
                    throw new NullPointerException(C0204.m13267(f665short, 0, 9, 2882));
            }
        }
    }
}
