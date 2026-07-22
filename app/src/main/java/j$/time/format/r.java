package j$.time.format;

import j$.time.C0092;
import j$.util.stream.C0099;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return C0092.m8751((String) C0099.m10870((Map.Entry) obj2)) - C0092.m8751((String) C0099.m10870((Map.Entry) obj));
    }
}
