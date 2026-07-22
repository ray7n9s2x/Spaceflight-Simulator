package j$.sun.nio.cs;

import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.stream.C0099;
import java.io.C0104;
import java.nio.CharBuffer;
import java.nio.charset.CoderResult;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private CoderResult a = C0106.m11323();
    private boolean b;

    /* JADX INFO: renamed from: ۠ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static CoderResult m7532(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((e) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7533(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((e) obj).b;
        }
        return false;
    }

    public final CoderResult a() {
        return m7532(this);
    }

    public final CoderResult d() {
        return C0086.m8286(m7533(this) ? 2 : 1);
    }

    public final int b(char c, CharBuffer charBuffer) {
        if (C0102.m11115(c)) {
            if (!C0082.m7987(charBuffer)) {
                this.a = C0106.m11323();
                return -1;
            }
            char cM10885 = C0099.m10885(charBuffer);
            if (C0087.m8470(cM10885)) {
                int iM8237 = C0085.m8237(c, cM10885);
                this.b = true;
                this.a = null;
                return iM8237;
            }
            this.a = C0104.m11222(1);
            return -1;
        }
        if (C0087.m8470(c)) {
            this.a = C0104.m11222(1);
            return -1;
        }
        this.b = false;
        this.a = null;
        return c;
    }

    public final int c(char c, char[] cArr, int i, int i2) {
        if (!C0102.m11115(c)) {
            if (C0087.m8470(c)) {
                this.a = C0104.m11222(1);
                return -1;
            }
            this.b = false;
            this.a = null;
            return c;
        }
        if (i2 - i < 2) {
            this.a = C0106.m11323();
            return -1;
        }
        char c2 = cArr[i + 1];
        if (C0087.m8470(c2)) {
            int iM8237 = C0085.m8237(c, c2);
            this.b = true;
            this.a = null;
            return iM8237;
        }
        this.a = C0104.m11222(1);
        return -1;
    }
}
