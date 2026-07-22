package java.io;

import j$.time.zone.C0088;
import j$.util.stream.C0099;

/* JADX INFO: loaded from: classes3.dex */
public class UncheckedIOException extends RuntimeException {
    @Override // java.lang.Throwable
    public /* bridge */ /* synthetic */ Throwable getCause() {
        return C0088.m8532(this);
    }

    public UncheckedIOException(IOException iOException) {
        super((Throwable) C0099.m10863(iOException));
    }

    @Override // java.lang.Throwable
    public IOException getCause() {
        return (IOException) super.getCause();
    }
}
