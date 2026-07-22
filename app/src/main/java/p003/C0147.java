package p003;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۠ۤ۟۟۠ۥ۟۟۠ۦ۟۟۠ۧ۟۟۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0147 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f623short = {1540, 1547, 1537, 1559, 1546, 1548, 1537, 1611, 1554, 1548, 1537, 1538, 1536, 1553, 1611, 1585, 1546, 1540, 1558, 1553, 1163, 1159, 1165, 1155, 1202, 1155, 1182, 1170, 1763, 1671, 1706, 1701, 1711, 1721, 1700, 1698, 1711, 1764, 1704, 1700, 1701, 1727, 1710, 1701, 1727, 1764, 1672, 1700, 1701, 1727, 1710, 1715, 1727, 1776, 1671, 1697, 1706, 1725, 1706, 1764, 1703, 1706, 1701, 1708, 1764, 1672, 1699, 1706, 1721, 1688, 1710, 1722, 1726, 1710, 1701, 1704, 1710, 1776, 1666, 1762, 1671, 1706, 1701, 1711, 1721, 1700, 1698, 1711, 1764, 1724, 1698, 1711, 1708, 1710, 1727, 1764, 1695, 1700, 1706, 1720, 1727, 1776, 743, 747, 745, 737, 676, 749, 746, 676, 748, 747, 747, 751, 731, 720, 747, 741, 759, 752, 731, 745, 741, 751, 737, 720, 737, 764, 752, 680, 676, 752, 737, 764, 752, 697, 1013, 1006, 968, 960, 975, 960};

    public C0147() {
        int iM13266 = C0204.m13266();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13266 > 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Float.decode(C0205.m13270("HGZLdiWO94EJIO")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0205.m13272(f623short, 0, 20, 1637);
        methodName = C0205.m13272(f623short, 20, 8, 1254);
        methodSig = C0207.m13281(f623short, 28, 74, 1739);
        int iM13275 = C0206.m13275();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13275 < 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0205.m13270("Yep44LC3NgciLSI")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native Toast backup(Context context, CharSequence charSequence, int i);

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002d. Please report as an issue. */
    public static Toast hook(Context context, CharSequence charSequence, int i) {
        C0207.m13281(f623short, 136, 6, 919);
        String str = C0204.m13267(f623short, 102, 34, 644) + ((Object) charSequence);
        Toast toastBackup = backup(context, charSequence, i);
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = !zIsEmpty ? 1709 : 1678;
                    break;
                case 204:
                    C0148.Toast_for_Android11.put(toastBackup, charSequence);
                    break;
                case 239:
                    break;
            }
        }
        return toastBackup;
    }
}
