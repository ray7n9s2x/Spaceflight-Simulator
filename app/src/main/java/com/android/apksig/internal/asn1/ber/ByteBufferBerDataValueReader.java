package com.android.apksig.internal.asn1.ber;

import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.nio.ByteBuffer;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class ByteBufferBerDataValueReader implements BerDataValueReader {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f91short = {669, 650, 665, 735, 706, 706, 735, 657, 650, 659, 659, 1662, 1624, 1631, 1604, 1609, 1611, 1630, 1615, 1614, 1546, 1609, 1605, 1604, 1630, 1615, 1604, 1630, 1625, 1540, 1546, 1636, 1615, 1615, 1614, 1552, 1546, 1513, 1451, 1456, 1469, 1452, 1466, 1509, 1513, 1448, 1471, 1448, 1440, 1445, 1448, 1451, 1445, 1452, 1523, 1513, 1219, 1270, 1264, 1207, 1273, 1250, 1274, 1269, 1266, 1253, 1207, 1251, 1272, 1272, 1207, 1275, 1270, 1253, 1264, 1266, 680, 654, 649, 658, 671, 669, 648, 665, 664, 732, 648, 669, 667, 732, 658, 649, 657, 670, 665, 654, 912, 953, 946, 955, 936, 948, 1020, 936, 947, 947, 1020, 944, 957, 942, 955, 953, 1817, 1855, 1848, 1827, 1838, 1836, 1849, 1832, 1833, 1901, 1825, 1832, 1827, 1834, 1849, 1829, 1069, 1028, 1039, 1030, 1045, 1033, 1089, 1045, 1038, 1038, 1089, 1037, 1024, 1043, 1030, 1028, 1115, 1089, 831, 893, 870, 875, 890, 876, 577, 515, 536, 533, 516, 530, 577, 531, 516, 512, 517, 979, 1013, 1010, 1001, 996, 998, 1011, 994, 995, 935, 1006, 1001, 995, 994, 993, 1006, 1001, 1006, 1011, 994, 938, 1003, 994, 1001, 992, 1011, 1007, 935, 996, 1000, 1001, 1011, 994, 1001, 1011, 1012, 957, 935, 805, 770, 776, 777, 778, 773, 770, 773, 792, 777, 833, 768, 777, 770, 779, 792, 772, 844, 783, 771, 770, 792, 777, 770, 792, 799, 844, 792, 771, 771, 844, 768, 771, 770, 779, 1549, 1577, 1587, 1587, 1577, 1582, 1575, 1632, 1580, 1573, 1582, 1575, 1588, 1576};
    public final ByteBuffer a;

    /* JADX INFO: renamed from: ۟ۢۥۢۤ, reason: not valid java name and contains not printable characters */
    public static short[] m1514() {
        if (C0016.m717() <= 0) {
            return f91short;
        }
        return null;
    }

    public final void a(int i) throws BerDataValueFormatException {
        ByteBuffer byteBufferM3832 = C0037.m3832(this);
        if (C0071.m5984(byteBufferM3832) >= i) {
            C0037.m3886(byteBufferM3832, C0035.m3629(byteBufferM3832) + i);
            return;
        }
        StringBuilder sb = new StringBuilder(C0021.m1650(m1514(), 11, 26, 1578));
        C0021.m1551(sb, i);
        C0077.m7290(sb, C0035.m3603(m1514(), 37, 19, 1481));
        C0021.m1551(sb, C0071.m5984(byteBufferM3832));
        throw new BerDataValueFormatException(C0068.m5536(sb));
    }

    @Override // com.android.apksig.internal.asn1.ber.BerDataValueReader
    public BerDataValue readDataValue() throws BerDataValueFormatException {
        int iM3629;
        int iM36292;
        ByteBuffer byteBufferM3832 = C0037.m3832(this);
        int iM36293 = C0035.m3629(byteBufferM3832);
        if (!C0111.m13127(byteBufferM3832)) {
            return null;
        }
        byte bM5826 = C0069.m5826(byteBufferM3832);
        int iM4127 = C0039.m4127(bM5826);
        if (iM4127 == 31) {
            iM4127 = 0;
            while (C0111.m13127(byteBufferM3832)) {
                byte bM58262 = C0069.m5826(byteBufferM3832);
                if (iM4127 > 16777215) {
                    throw new BerDataValueFormatException(C0063.m4315(m1514(), 56, 20, 1175));
                }
                iM4127 = (iM4127 << 7) | (bM58262 & 127);
                if ((bM58262 & 128) == 0) {
                }
            }
            throw new BerDataValueFormatException(C0031.m3047(m1514(), 76, 20, 764));
        }
        int i = iM4127;
        boolean zM13122 = C0111.m13122(bM5826);
        if (!C0111.m13127(byteBufferM3832)) {
            throw new BerDataValueFormatException(C0021.m1650(m1514(), 236, 14, 1600));
        }
        byte bM58263 = C0069.m5826(byteBufferM3832);
        int i2 = bM58263 & 255;
        if ((bM58263 & 128) == 0) {
            iM36292 = bM58263 & 127;
            iM3629 = C0035.m3629(byteBufferM3832) - iM36293;
            C0019.m1218(this, iM36292);
        } else {
            if (i2 == 128) {
                iM3629 = C0035.m3629(byteBufferM3832) - iM36293;
                String strM1443 = C0020.m1443(m1514(), 152, 11, 609);
                String strM5544 = C0068.m5544(m1514(), 163, 38, 903);
                if (zM13122) {
                    int iM36294 = C0035.m3629(byteBufferM3832);
                    while (C0111.m13127(byteBufferM3832)) {
                        if (C0071.m5984(byteBufferM3832) <= 1 || C0039.m4059(byteBufferM3832, C0035.m3629(byteBufferM3832)) != 0) {
                            C0019.m1224(this);
                        } else {
                            iM36292 = C0035.m3629(byteBufferM3832) - iM36294;
                            C0037.m3886(byteBufferM3832, C0035.m3629(byteBufferM3832) + 2);
                        }
                    }
                    StringBuilder sb = new StringBuilder(strM5544);
                    C0021.m1551(sb, C0035.m3629(byteBufferM3832) - iM36294);
                    C0077.m7290(sb, strM1443);
                    throw new BerDataValueFormatException(C0068.m5536(sb));
                }
                int i3 = 0;
                boolean z = false;
                while (C0111.m13127(byteBufferM3832)) {
                    byte bM58264 = C0069.m5826(byteBufferM3832);
                    int i4 = i3 + 1;
                    if (i4 < 0) {
                        throw new BerDataValueFormatException(C0028.m2609(m1514(), 201, 35, 876));
                    }
                    if (bM58264 != 0) {
                        z = false;
                    } else if (z) {
                        iM36292 = i3 - 1;
                    } else {
                        z = true;
                    }
                    i3 = i4;
                }
                throw new BerDataValueFormatException(C0025.m2086(strM5544, i3, strM1443));
            }
            int i5 = bM58263 & 127;
            if (i5 > 4) {
                throw new BerDataValueFormatException(C0025.m2086(C0020.m1443(m1514(), 128, 18, 1121), i5, C0075.m6791(m1514(), 146, 6, 799)));
            }
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                if (!C0111.m13127(byteBufferM3832)) {
                    throw new BerDataValueFormatException(C0017.m936(m1514(), 112, 16, 1869));
                }
                byte bM58265 = C0069.m5826(byteBufferM3832);
                if (i6 > 8388607) {
                    throw new BerDataValueFormatException(C0018.m1070(m1514(), 96, 16, 988));
                }
                i6 = (i6 << 8) | (bM58265 & 255);
            }
            int iM36295 = C0035.m3629(byteBufferM3832) - iM36293;
            C0019.m1218(this, i6);
            int i8 = i6;
            iM3629 = iM36295;
            iM36292 = i8;
        }
        int iM36296 = C0035.m3629(byteBufferM3832);
        C0037.m3886(byteBufferM3832, iM36293);
        int iM6818 = C0075.m6818(byteBufferM3832);
        C0034.m3392(byteBufferM3832, iM36296);
        ByteBuffer byteBufferM6043 = C0071.m6043(byteBufferM3832);
        C0037.m3886(byteBufferM3832, C0075.m6818(byteBufferM3832));
        C0034.m3392(byteBufferM3832, iM6818);
        C0037.m3886(byteBufferM6043, iM3629);
        C0034.m3392(byteBufferM6043, iM3629 + iM36292);
        ByteBuffer byteBufferM60432 = C0071.m6043(byteBufferM6043);
        C0020.m1405(byteBufferM6043);
        return new BerDataValue(byteBufferM6043, byteBufferM60432, C0111.m13045(bM5826), zM13122, i);
    }

    public ByteBufferBerDataValueReader(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            this.a = byteBuffer;
            return;
        }
        throw new NullPointerException(C0017.m936(m1514(), 0, 11, 767));
    }
}
