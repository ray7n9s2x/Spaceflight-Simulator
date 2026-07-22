package j$.util.concurrent;

/* JADX INFO: loaded from: classes3.dex */
final class u extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final Object initialValue() {
        return new z(0);
    }
}
