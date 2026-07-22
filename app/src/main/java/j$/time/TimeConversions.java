package j$.time;

import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.stream.C0096;

/* JADX INFO: loaded from: classes3.dex */
public class TimeConversions {
    public static java.time.Instant convert(Instant instant) {
        if (instant == null) {
            return null;
        }
        return C0100.m11004(C0088.m8560(instant), C0096.m10754(instant));
    }
}
