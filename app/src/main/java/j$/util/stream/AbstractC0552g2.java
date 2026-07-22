package j$.util.stream;

import j$.time.zone.C0087;
import j$.util.function.C0094;

/* JADX INFO: renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0552g2 extends AbstractC0557h2 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0552g2(AbstractC0524b abstractC0524b, int i, int i2) {
        super(abstractC0524b, i);
        this.l = i2;
    }

    /* JADX INFO: renamed from: ۤۢۥۧ, reason: not valid java name and contains not printable characters */
    public static int m10126() {
        if (C0094.m9148() > 0) {
            return EnumC0543e3.r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۡۦ, reason: contains not printable characters */
    public static boolean m10127(Object obj) {
        if (C0097.m10823() > 0) {
            return ((AbstractC0524b) obj).H();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۡۧ, reason: not valid java name and contains not printable characters */
    public static int m10128(Object obj) {
        if (C0087.m8458() < 0) {
            return ((AbstractC0552g2) obj).l;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0524b
    final boolean M() {
        switch (m10128(this)) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        switch (m10128(this)) {
            case 0:
                if (!m10127(this)) {
                }
                break;
            default:
                if (!m10127(this)) {
                }
                break;
        }
        return new C0542e2(this, m10126(), 1);
    }
}
