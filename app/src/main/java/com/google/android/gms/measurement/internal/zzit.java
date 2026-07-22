package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzit implements Callable {
    final /* synthetic */ zzbg zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjd zzc;

    zzit(zzjd zzjdVar, zzbg zzbgVar, String str) {
        this.zza = zzbgVar;
        this.zzb = str;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0440 A[Catch: all -> 0x052c, TryCatch #4 {all -> 0x052c, blocks: (B:95:0x03b4, B:96:0x03d1, B:98:0x03d7, B:100:0x03eb, B:101:0x03f6, B:103:0x0440, B:104:0x044e, B:106:0x0456, B:107:0x0459, B:109:0x0461, B:112:0x046a, B:115:0x0481, B:116:0x0484, B:111:0x0467, B:128:0x0512, B:57:0x01eb, B:59:0x01f3, B:61:0x01f9), top: B:145:0x01eb, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0456 A[Catch: all -> 0x052c, TryCatch #4 {all -> 0x052c, blocks: (B:95:0x03b4, B:96:0x03d1, B:98:0x03d7, B:100:0x03eb, B:101:0x03f6, B:103:0x0440, B:104:0x044e, B:106:0x0456, B:107:0x0459, B:109:0x0461, B:112:0x046a, B:115:0x0481, B:116:0x0484, B:111:0x0467, B:128:0x0512, B:57:0x01eb, B:59:0x01f3, B:61:0x01f9), top: B:145:0x01eb, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0461 A[Catch: all -> 0x052c, TryCatch #4 {all -> 0x052c, blocks: (B:95:0x03b4, B:96:0x03d1, B:98:0x03d7, B:100:0x03eb, B:101:0x03f6, B:103:0x0440, B:104:0x044e, B:106:0x0456, B:107:0x0459, B:109:0x0461, B:112:0x046a, B:115:0x0481, B:116:0x0484, B:111:0x0467, B:128:0x0512, B:57:0x01eb, B:59:0x01f3, B:61:0x01f9), top: B:145:0x01eb, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba A[Catch: all -> 0x052e, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x052e, blocks: (B:8:0x0058, B:10:0x0063, B:13:0x007d, B:15:0x0083, B:16:0x0095, B:18:0x00ac, B:19:0x00b3, B:21:0x00bd, B:22:0x00ca, B:24:0x00d4, B:25:0x00e1, B:27:0x00ec, B:28:0x00f4, B:30:0x010c, B:31:0x010f, B:33:0x0129, B:35:0x0139, B:37:0x0141, B:39:0x0147, B:40:0x014a, B:42:0x0159, B:44:0x015f, B:46:0x0171, B:48:0x017b, B:49:0x018c, B:51:0x0190, B:53:0x019d, B:56:0x01ba, B:57:0x01eb, B:59:0x01f3, B:61:0x01f9, B:62:0x0210, B:64:0x021a, B:65:0x0227, B:66:0x0239, B:68:0x023f, B:75:0x0257, B:78:0x0280, B:79:0x0287, B:81:0x028d, B:82:0x02c1, B:77:0x025b), top: B:147:0x0058, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021a A[Catch: all -> 0x052e, TryCatch #6 {all -> 0x052e, blocks: (B:8:0x0058, B:10:0x0063, B:13:0x007d, B:15:0x0083, B:16:0x0095, B:18:0x00ac, B:19:0x00b3, B:21:0x00bd, B:22:0x00ca, B:24:0x00d4, B:25:0x00e1, B:27:0x00ec, B:28:0x00f4, B:30:0x010c, B:31:0x010f, B:33:0x0129, B:35:0x0139, B:37:0x0141, B:39:0x0147, B:40:0x014a, B:42:0x0159, B:44:0x015f, B:46:0x0171, B:48:0x017b, B:49:0x018c, B:51:0x0190, B:53:0x019d, B:56:0x01ba, B:57:0x01eb, B:59:0x01f3, B:61:0x01f9, B:62:0x0210, B:64:0x021a, B:65:0x0227, B:66:0x0239, B:68:0x023f, B:75:0x0257, B:78:0x0280, B:79:0x0287, B:81:0x028d, B:82:0x02c1, B:77:0x025b), top: B:147:0x0058, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023f A[Catch: all -> 0x052e, TryCatch #6 {all -> 0x052e, blocks: (B:8:0x0058, B:10:0x0063, B:13:0x007d, B:15:0x0083, B:16:0x0095, B:18:0x00ac, B:19:0x00b3, B:21:0x00bd, B:22:0x00ca, B:24:0x00d4, B:25:0x00e1, B:27:0x00ec, B:28:0x00f4, B:30:0x010c, B:31:0x010f, B:33:0x0129, B:35:0x0139, B:37:0x0141, B:39:0x0147, B:40:0x014a, B:42:0x0159, B:44:0x015f, B:46:0x0171, B:48:0x017b, B:49:0x018c, B:51:0x0190, B:53:0x019d, B:56:0x01ba, B:57:0x01eb, B:59:0x01f3, B:61:0x01f9, B:62:0x0210, B:64:0x021a, B:65:0x0227, B:66:0x0239, B:68:0x023f, B:75:0x0257, B:78:0x0280, B:79:0x0287, B:81:0x028d, B:82:0x02c1, B:77:0x025b), top: B:147:0x0058, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025b A[Catch: all -> 0x052e, TryCatch #6 {all -> 0x052e, blocks: (B:8:0x0058, B:10:0x0063, B:13:0x007d, B:15:0x0083, B:16:0x0095, B:18:0x00ac, B:19:0x00b3, B:21:0x00bd, B:22:0x00ca, B:24:0x00d4, B:25:0x00e1, B:27:0x00ec, B:28:0x00f4, B:30:0x010c, B:31:0x010f, B:33:0x0129, B:35:0x0139, B:37:0x0141, B:39:0x0147, B:40:0x014a, B:42:0x0159, B:44:0x015f, B:46:0x0171, B:48:0x017b, B:49:0x018c, B:51:0x0190, B:53:0x019d, B:56:0x01ba, B:57:0x01eb, B:59:0x01f3, B:61:0x01f9, B:62:0x0210, B:64:0x021a, B:65:0x0227, B:66:0x0239, B:68:0x023f, B:75:0x0257, B:78:0x0280, B:79:0x0287, B:81:0x028d, B:82:0x02c1, B:77:0x025b), top: B:147:0x0058, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028d A[Catch: all -> 0x052e, LOOP:1: B:79:0x0287->B:81:0x028d, LOOP_END, TryCatch #6 {all -> 0x052e, blocks: (B:8:0x0058, B:10:0x0063, B:13:0x007d, B:15:0x0083, B:16:0x0095, B:18:0x00ac, B:19:0x00b3, B:21:0x00bd, B:22:0x00ca, B:24:0x00d4, B:25:0x00e1, B:27:0x00ec, B:28:0x00f4, B:30:0x010c, B:31:0x010f, B:33:0x0129, B:35:0x0139, B:37:0x0141, B:39:0x0147, B:40:0x014a, B:42:0x0159, B:44:0x015f, B:46:0x0171, B:48:0x017b, B:49:0x018c, B:51:0x0190, B:53:0x019d, B:56:0x01ba, B:57:0x01eb, B:59:0x01f3, B:61:0x01f9, B:62:0x0210, B:64:0x021a, B:65:0x0227, B:66:0x0239, B:68:0x023f, B:75:0x0257, B:78:0x0280, B:79:0x0287, B:81:0x028d, B:82:0x02c1, B:77:0x025b), top: B:147:0x0058, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0328 A[Catch: all -> 0x050b, TryCatch #2 {all -> 0x050b, blocks: (B:84:0x02fc, B:86:0x0328, B:87:0x033c, B:89:0x0348, B:91:0x039d, B:90:0x0380), top: B:141:0x02fc }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0348 A[Catch: all -> 0x050b, TryCatch #2 {all -> 0x050b, blocks: (B:84:0x02fc, B:86:0x0328, B:87:0x033c, B:89:0x0348, B:91:0x039d, B:90:0x0380), top: B:141:0x02fc }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0380 A[Catch: all -> 0x050b, TryCatch #2 {all -> 0x050b, blocks: (B:84:0x02fc, B:86:0x0328, B:87:0x033c, B:89:0x0348, B:91:0x039d, B:90:0x0380), top: B:141:0x02fc }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03d7 A[Catch: all -> 0x052c, TryCatch #4 {all -> 0x052c, blocks: (B:95:0x03b4, B:96:0x03d1, B:98:0x03d7, B:100:0x03eb, B:101:0x03f6, B:103:0x0440, B:104:0x044e, B:106:0x0456, B:107:0x0459, B:109:0x0461, B:112:0x046a, B:115:0x0481, B:116:0x0484, B:111:0x0467, B:128:0x0512, B:57:0x01eb, B:59:0x01f3, B:61:0x01f9), top: B:145:0x01eb, inners: #5 }] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.measurement.internal.zzbg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.measurement.internal.zzol] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzit.call():java.lang.Object");
    }
}
