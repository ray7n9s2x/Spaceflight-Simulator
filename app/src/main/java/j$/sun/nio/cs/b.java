package j$.sun.nio.cs;

import j$.sun.misc.C0079;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class b extends CharsetEncoder {
    private final e a;

    /* JADX INFO: renamed from: ۟ۡ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static e m7529(Object obj) {
        if (C0099.m10878() < 0) {
            return ((b) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۧ۟, reason: not valid java name and contains not printable characters */
    public static int m7530(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0085.m8230() >= 0) {
            return a((char[]) obj, i, (byte[]) obj2, i2, i3);
        }
        return 0;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return c <= 255;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return true;
    }

    b(c cVar) {
        super(cVar, 1.0f, 1.0f);
        this.a = new e();
    }

    private static int a(char[] cArr, int i, byte[] bArr, int i2, int i3) {
        int i4 = i2;
        int i5 = i;
        int i6 = 0;
        if (i3 <= 0) {
            return 0;
        }
        C0099.m10863(cArr);
        C0099.m10863(bArr);
        if (i5 < 0 || i5 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i5);
        }
        if (i4 < 0 || i4 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i4);
        }
        int i7 = (i5 + i3) - 1;
        if (i7 < 0 || i7 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i7);
        }
        int i8 = (i4 + i3) - 1;
        if (i8 < 0 || i8 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i8);
        }
        while (i6 < i3) {
            int i9 = i5 + 1;
            char c = cArr[i5];
            if (c > 255) {
                break;
            }
            bArr[i4] = (byte) c;
            i6++;
            i5 = i9;
            i4++;
        }
        return i6;
    }

    @Override // java.nio.charset.CharsetEncoder
    protected final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResultM11323;
        CoderResult coderResultM113232;
        boolean zM10765 = C0096.m10765(charBuffer);
        e eVarM7529 = m7529(this);
        if (zM10765 && C0104.m11239(byteBuffer)) {
            char[] cArrM11155 = C0103.m11155(charBuffer);
            int iM10827 = C0097.m10827(charBuffer);
            int iM9159 = C0094.m9159(charBuffer) + iM10827;
            int iM11122 = C0102.m11122(charBuffer) + iM10827;
            if (iM9159 > iM11122) {
                iM9159 = iM11122;
            }
            byte[] bArrM9201 = C0095.m9201(byteBuffer);
            int iM7496 = C0079.m7496(byteBuffer);
            int iM91592 = C0094.m9159(byteBuffer) + iM7496;
            int iM111222 = C0102.m11122(byteBuffer) + iM7496;
            if (iM91592 > iM111222) {
                iM91592 = iM111222;
            }
            int i = iM111222 - iM91592;
            int i2 = iM11122 - iM9159;
            if (i >= i2) {
                i = i2;
            }
            try {
                int iM7530 = m7530(cArrM11155, iM9159, bArrM9201, iM91592, i);
                int i3 = iM9159 + iM7530;
                int i4 = iM91592 + iM7530;
                if (iM7530 != i) {
                    if (C0085.m8240(eVarM7529, cArrM11155[i3], cArrM11155, i3, iM11122) < 0) {
                        coderResultM113232 = C0080.m7541(eVarM7529);
                    } else {
                        coderResultM113232 = C0092.m8721(eVarM7529);
                    }
                } else if (i < i2) {
                    coderResultM113232 = C0097.m10844();
                } else {
                    coderResultM113232 = C0106.m11323();
                }
                return coderResultM113232;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iM91593 = C0094.m9159(charBuffer);
        while (true) {
            try {
                if (C0082.m7987(charBuffer)) {
                    char cM10885 = C0099.m10885(charBuffer);
                    if (cM10885 <= 255) {
                        if (!C0082.m7987(byteBuffer)) {
                            coderResultM11323 = C0097.m10844();
                            break;
                        }
                        C0081.m7812(byteBuffer, (byte) cM10885);
                        iM91593++;
                    } else if (C0087.m8466(eVarM7529, cM10885, charBuffer) < 0) {
                        coderResultM11323 = C0080.m7541(eVarM7529);
                    } else {
                        coderResultM11323 = C0092.m8721(eVarM7529);
                    }
                } else {
                    coderResultM11323 = C0106.m11323();
                    break;
                }
            } finally {
            }
        }
        return coderResultM11323;
    }
}
