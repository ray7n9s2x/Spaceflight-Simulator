package j$.time.temporal;

import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0097;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements p {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ q(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.p
    public final m w(m mVar) {
        switch (C0087.m8497(this)) {
            case 0:
                int iM10845 = C0097.m10845(mVar, C0093.m9077());
                int iM9131 = C0094.m9131(this);
                if (iM10845 == iM9131) {
                    return mVar;
                }
                return C0100.m10972(mVar, iM10845 - iM9131 >= 0 ? 7 - r0 : -r0, C0095.m9215());
            default:
                int iM108452 = C0097.m10845(mVar, C0093.m9077());
                int iM91312 = C0094.m9131(this);
                if (iM108452 == iM91312) {
                    return mVar;
                }
                return C0094.m9111(mVar, iM91312 - iM108452 >= 0 ? 7 - r1 : -r1, C0095.m9215());
        }
    }
}
