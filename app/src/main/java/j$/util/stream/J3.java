package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.util.function.C0094;

/* JADX INFO: loaded from: classes3.dex */
final class J3 implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Runnable b;

    /* JADX INFO: renamed from: ۤۧۧۤ, reason: not valid java name and contains not printable characters */
    public static Runnable m9517(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((J3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۠۟, reason: not valid java name and contains not printable characters */
    public static Runnable m9518(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((J3) obj).a;
        }
        return null;
    }

    J3(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnableM9517 = m9517(this);
        try {
            C0094.m9128(m9518(this));
            C0094.m9128(runnableM9517);
        } catch (Throwable th) {
            try {
                C0094.m9128(runnableM9517);
            } catch (Throwable th2) {
                try {
                    C0092.m8780(th, th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
