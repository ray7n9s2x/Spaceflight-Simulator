package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;

/* JADX INFO: loaded from: classes3.dex */
abstract class A extends B {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(AbstractC0524b abstractC0524b, int i, int i2) {
        super(abstractC0524b, i);
        this.l = i2;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static BaseStream m9315(Object obj) {
        if (C0087.m8458() < 0) {
            return ((AbstractC0524b) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m9316() {
        if (C0085.m8230() >= 0) {
            return EnumC0543e3.r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m9317(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((A) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧۤۨ, reason: not valid java name and contains not printable characters */
    public static BaseStream m9318(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((AbstractC0524b) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static j$.util.T m9319(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((B) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9320(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((AbstractC0524b) obj).H();
        }
        return false;
    }

    @Override // j$.util.stream.AbstractC0524b
    final boolean M() {
        switch (m9317(this)) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        switch (m9317(this)) {
            case 0:
                if (!m9320(this)) {
                }
                break;
            default:
                if (!m9320(this)) {
                }
                break;
        }
        return new C0618u(this, m9316(), 1);
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ E parallel() {
        switch (m9317(this)) {
            case 0:
                m9318(this);
                break;
            default:
                m9318(this);
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ E sequential() {
        switch (m9317(this)) {
            case 0:
                m9315(this);
                break;
            default:
                m9315(this);
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ j$.util.f0 spliterator() {
        switch (m9317(this)) {
        }
        return m9319(this);
    }
}
