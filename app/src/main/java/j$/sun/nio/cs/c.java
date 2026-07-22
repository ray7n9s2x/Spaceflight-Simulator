package j$.sun.nio.cs;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.PointerIconCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.stream.C0098;
import java.io.C0104;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Charset {
    public static final c a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f387short = {3126, 3116, 3120, 3104, 3143, 3143, 3146, 3142, 3154, 3150, 3141, 3150, 3142, 3143, 3144, 949, 943, 947, 931, 964, 964, 969, 965, 931, 973, 911, 917, 905, 971, 911, 916, 971, 983, 982, 982, 2833, 2827, 2839, 2823, 2912, 2912, 2925, 2913, 2933, 2921, 1506, 1519, 1530, 1511, 1504, 1471, 315, 358, 467, 472, 471, 418, 427, 419, 1882, 1865, 1793, 1800, 1792, 1185, 1201, 1163, 1169, 1165, 1166, 1187, 1206, 1195, 1196, 1267, 1068, 1061, 1069, 927, 916, 923, 1019, 1006, 999, 1007, 3209, 3219, 3215, 3320, 3320, 3317, 3321, 3231, 3313, 1303, 1303, 1306, 1302, 1392, 1310, 1261, 1271, 1259, 1180, 1180, 1169, 1181, 1161, 1173, 1761, 1787, 1767, 1669, 1680, 1680, 1693, 1681, 1669, 1689};

    /* JADX INFO: renamed from: ۟ۥۣۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7531() {
        if (C0088.m8503() > 0) {
            return f387short;
        }
        return null;
    }

    static {
        C0083.m8046();
        a = new c(C0105.m11310(m7531(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 10, 1704), new String[]{C0092.m8731(m7531(), 25, 10, DescriptorProtos.Edition.EDITION_PROTO2_VALUE), C0093.m9062(m7531(), 35, 10, 2904), C0104.m11206(m7531(), 45, 6, 1422), C0085.m8236(m7531(), 51, 2, 343), C0084.m8120(m7531(), 53, 6, 410), C0088.m8518(m7531(), 59, 5, 1849), C0081.m7837(m7531(), 64, 11, 1218), C0093.m9062(m7531(), 75, 3, 1044), C0101.m11060(m7531(), 78, 7, 982), C0102.m11094(m7531(), 85, 9, 3264), C0098.m10856(m7531(), 0, 15, 3199), C0088.m8518(m7531(), 15, 10, PointerIconCompat.TYPE_GRAB), C0093.m9062(m7531(), 94, 6, 1327), C0088.m8518(m7531(), 100, 9, 1188)});
    }

    @Override // java.nio.charset.Charset
    public final boolean contains(Charset charset) {
        return charset instanceof c;
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new a(this);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new b(this);
    }
}
