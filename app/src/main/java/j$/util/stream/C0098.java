package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0092;
import j$.util.C0102;
import j$.util.function.C0095;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.util.stream.ۣۣۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0098 {

    /* JADX INFO: renamed from: ۧۥۤۨ, reason: not valid java name and contains not printable characters */
    public static int f553 = -50;

    /* JADX INFO: renamed from: ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m10857() {
        return (-1746796) ^ C0095.m9217((Object) "۟ۢۢ");
    }

    /* JADX INFO: renamed from: ۣۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m10858(String str) {
        String strM11090 = C0102.m11090();
        String strM110902 = C0102.m11090();
        for (int i = 0; i < 15; i++) {
            strM11090 = C0102.m11076(C0103.m11168(C0103.m11168(new StringBuffer(), strM11090), C0099.m10931(i)));
            strM110902 = C0102.m11076(C0106.m11355(C0103.m11168(new StringBuffer(), strM110902), ((int) (C0104.m11187() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0092.m8751(str) / 2);
        while (C0092.m8751(str) > 0) {
            C0106.m11329(byteArrayOutputStream, (C0080.m7569(strM11090, C0104.m11233(str, -2)) << 4) | C0080.m7569(strM11090, C0104.m11233(str, -1)));
        }
        byte[] bArrM11190 = C0104.m11190(byteArrayOutputStream);
        int length = bArrM11190.length;
        int iM8751 = C0092.m8751(strM110902);
        for (int i2 = 0; i2 < length; i2++) {
            bArrM11190[i2] = (byte) (bArrM11190[i2] ^ C0104.m11233(strM110902, i2 % iM8751));
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۟ۡۡۦۡ, reason: not valid java name and contains not printable characters */
    public static String m10856(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
