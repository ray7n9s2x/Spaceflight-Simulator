package j$.sun.nio.cs;

import j$.sun.misc.C0079;
import j$.time.format.C0082;
import j$.time.temporal.C0086;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import java.io.C0103;
import java.io.C0104;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class a extends CharsetDecoder {
    a(c cVar) {
        super(cVar, 1.0f, 1.0f);
    }

    @Override // java.nio.charset.CharsetDecoder
    protected final CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) throws Throwable {
        CoderResult coderResultM11323;
        CoderResult coderResultM113232;
        Object obj = byteBuffer;
        if (C0104.m11239(obj) && C0096.m10765(charBuffer)) {
            byte[] bArrM9201 = C0095.m9201(obj);
            int iM9159 = C0094.m9159(obj) + C0079.m7496(obj);
            int iM11122 = C0102.m11122(obj) + C0079.m7496(obj);
            if (iM9159 > iM11122) {
                iM9159 = iM11122;
            }
            char[] cArrM11155 = C0103.m11155(charBuffer);
            int iM91592 = C0094.m9159(charBuffer) + C0097.m10827(charBuffer);
            int iM111222 = C0102.m11122(charBuffer) + C0097.m10827(charBuffer);
            if (iM91592 > iM111222) {
                iM91592 = iM111222;
            }
            while (true) {
                if (iM9159 < iM11122) {
                    try {
                        byte b = bArrM9201[iM9159];
                        if (iM91592 >= iM111222) {
                            coderResultM113232 = C0097.m10844();
                            break;
                        }
                        int i = iM91592 + 1;
                        try {
                            cArrM11155[iM91592] = (char) (b & 255);
                            iM9159++;
                            iM91592 = i;
                        } catch (Throwable th) {
                            th = th;
                            iM91592 = i;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    coderResultM113232 = C0106.m11323();
                    break;
                }
            }
            iM9159 -= C0079.m7496(obj);
            iM91592 -= C0097.m10827(charBuffer);
            obj = (CharBuffer) C0093.m9090(charBuffer, iM91592);
            return coderResultM113232;
        }
        int iM91593 = C0094.m9159(obj);
        while (true) {
            try {
                if (C0082.m7987(obj)) {
                    byte bM8276 = C0086.m8276(obj);
                    if (!C0082.m7987(charBuffer)) {
                        coderResultM11323 = C0097.m10844();
                        break;
                    }
                    C0082.m7975(charBuffer, (char) (bM8276 & 255));
                    iM91593++;
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
