package j$.util.stream;

import j$.time.C0089;
import j$.time.temporal.C0085;
import j$.util.C0101;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.function.C0105;

/* JADX INFO: renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0575l0 extends AbstractC0580m0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0575l0(AbstractC0524b abstractC0524b, int i, int i2) {
        super(abstractC0524b, i);
        this.l = i2;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m10303() {
        if (C0101.m11044() <= 0) {
            return EnumC0543e3.r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static BaseStream m10304(Object obj) {
        if (C0104.m11196() > 0) {
            return ((AbstractC0524b) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static BaseStream m10305(Object obj) {
        if (C0095.m9210() > 0) {
            return ((AbstractC0524b) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m10306(Object obj) {
        if (C0085.m8230() > 0) {
            return ((AbstractC0524b) obj).H();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ۢ۟, reason: contains not printable characters */
    public static j$.util.Z m10307(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((AbstractC0580m0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m10308(Object obj) {
        if (C0089.m8594() < 0) {
            return ((AbstractC0575l0) obj).l;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0524b
    final boolean M() {
        switch (m10308(this)) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        switch (m10308(this)) {
            case 0:
                if (!m10306(this)) {
                }
                break;
            default:
                if (!m10306(this)) {
                }
                break;
        }
        return new C0628w(this, m10303(), 4);
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ LongStream parallel() {
        switch (m10308(this)) {
            case 0:
                m10305(this);
                break;
            default:
                m10305(this);
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ LongStream sequential() {
        switch (m10308(this)) {
            case 0:
                m10304(this);
                break;
            default:
                m10304(this);
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ j$.util.f0 spliterator() {
        switch (m10308(this)) {
        }
        return m10307(this);
    }
}
