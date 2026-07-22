package j$.util.stream;

import j$.time.C0089;
import j$.time.zone.C0088;
import j$.util.C0102;
import java.util.function.C0105;

/* JADX INFO: renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0520a0 extends AbstractC0525b0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0520a0(AbstractC0524b abstractC0524b, int i, int i2) {
        super(abstractC0524b, i);
        this.l = i2;
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۧ, reason: not valid java name and contains not printable characters */
    public static BaseStream m9923(Object obj) {
        if (C0088.m8503() > 0) {
            return ((AbstractC0524b) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9924(Object obj) {
        if (C0097.m10823() > 0) {
            return ((AbstractC0524b) obj).H();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۢ, reason: not valid java name and contains not printable characters */
    public static int m9925() {
        if (C0105.m11264() > 0) {
            return EnumC0543e3.r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۧۥ, reason: not valid java name and contains not printable characters */
    public static int m9926(Object obj) {
        if (C0102.m11109() < 0) {
            return ((AbstractC0520a0) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۦۤ, reason: not valid java name and contains not printable characters */
    public static BaseStream m9927(Object obj) {
        if (C0089.m8594() < 0) {
            return ((AbstractC0524b) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠۟, reason: not valid java name and contains not printable characters */
    public static j$.util.W m9928(Object obj) {
        if (C0102.m11109() < 0) {
            return ((AbstractC0525b0) obj).spliterator();
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0524b
    final boolean M() {
        switch (m9926(this)) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        switch (m9926(this)) {
            case 0:
                if (!m9924(this)) {
                }
                break;
            default:
                if (!m9924(this)) {
                }
                break;
        }
        return new C0623v(this, m9925(), 2);
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        switch (m9926(this)) {
            case 0:
                m9927(this);
                break;
            default:
                m9927(this);
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        switch (m9926(this)) {
            case 0:
                m9923(this);
                break;
            default:
                m9923(this);
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ j$.util.f0 spliterator() {
        switch (m9926(this)) {
        }
        return m9928(this);
    }
}
