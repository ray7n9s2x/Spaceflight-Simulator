package androidx.loader.app.services;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f0short = {3088, 3090, 3075, 2825, 2869, 2871, 2879, 2862, 2866, 2867, 2868, 2877, 2938, 2861, 2879, 2868, 2862, 2938, 2861, 2856, 2869, 2868, 2877};
    public HttpURLConnection a;
    public final a b;

    public interface a {
        void a(Throwable th);

        void b(InputStream inputStream);
    }

    public b(String str, a aVar) {
        this.a = null;
        this.b = aVar;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) C0007.m366(new URL(str));
            this.a = httpURLConnection;
            C0008.m393(httpURLConnection, C0007.m374(m267(), 0, 3, 3159));
        } catch (Throwable th) {
            C0005.m281(aVar, th);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۦۢ, reason: not valid java name and contains not printable characters */
    public static short[] m267() {
        if (C0006.m321() > 0) {
            return f0short;
        }
        return null;
    }

    public final boolean a() {
        return C0007.m382(this) != null;
    }

    public void b() {
        if (C0005.m284(this)) {
            try {
                C0007.m357(C0007.m382(this));
                int iM394 = C0008.m394(C0007.m382(this));
                if (iM394 < 200 || iM394 >= 300) {
                    InputStream inputStreamM422 = C0008.m422(C0007.m382(this));
                    if (inputStreamM422 == null) {
                        C0005.m281(C0005.m289(this), new IOException(C0007.m374(m267(), 3, 20, 2906)));
                        return;
                    } else {
                        C0005.m281(C0005.m289(this), new IOException(C0008.m430(inputStreamM422)));
                        return;
                    }
                }
                InputStream inputStreamM396 = C0008.m396(C0007.m382(this));
                try {
                    C0005.m294(C0005.m289(this), inputStreamM396);
                    if (inputStreamM396 != null) {
                        C0005.m277(inputStreamM396);
                    }
                } finally {
                }
            } catch (Throwable th) {
                C0005.m281(C0005.m289(this), th);
            }
        }
    }
}
