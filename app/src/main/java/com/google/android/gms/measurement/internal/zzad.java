package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzad(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i, int i2) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:402:0x097f, code lost:
    
        r0 = r13.zzaV().zze();
        r1 = com.google.android.gms.measurement.internal.zzgu.zzl(r30.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0991, code lost:
    
        if (r8.zza() == false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0993, code lost:
    
        r6 = java.lang.Integer.valueOf(r8.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x099c, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x099d, code lost:
    
        r0.zzc("Invalid property filter ID. appId, id", r1, java.lang.String.valueOf(r6));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bf A[PHI: r0 r5
  0x02bf: PHI (r0v55 java.util.Map) = (r0v40 java.util.Map), (r0v57 java.util.Map), (r0v34 java.util.Map) binds: [B:126:0x02ec, B:115:0x02c7, B:112:0x02bd] A[DONT_GENERATE, DONT_INLINE]
  0x02bf: PHI (r5v14 android.database.Cursor) = (r5v9 android.database.Cursor), (r5v15 android.database.Cursor), (r5v15 android.database.Cursor) binds: [B:126:0x02ec, B:115:0x02c7, B:112:0x02bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06b0 A[PHI: r0 r5 r23 r27 r28
  0x06b0: PHI (r0v78 java.util.Map) = (r0v80 java.util.Map), (r0v86 java.util.Map) binds: [B:293:0x06e8, B:274:0x06ae] A[DONT_GENERATE, DONT_INLINE]
  0x06b0: PHI (r5v26 android.database.Cursor) = (r5v27 android.database.Cursor), (r5v28 android.database.Cursor) binds: [B:293:0x06e8, B:274:0x06ae] A[DONT_GENERATE, DONT_INLINE]
  0x06b0: PHI (r23v9 com.google.android.gms.measurement.internal.zzbc) = (r23v10 com.google.android.gms.measurement.internal.zzbc), (r23v14 com.google.android.gms.measurement.internal.zzbc) binds: [B:293:0x06e8, B:274:0x06ae] A[DONT_GENERATE, DONT_INLINE]
  0x06b0: PHI (r27v7 java.lang.String) = (r27v8 java.lang.String), (r27v11 java.lang.String) binds: [B:293:0x06e8, B:274:0x06ae] A[DONT_GENERATE, DONT_INLINE]
  0x06b0: PHI (r28v8 java.lang.String) = (r28v9 java.lang.String), (r28v11 java.lang.String) binds: [B:293:0x06e8, B:274:0x06ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x085f A[PHI: r0 r13 r31
  0x085f: PHI (r0v126 java.util.Map) = (r0v128 java.util.Map), (r0v133 java.util.Map) binds: [B:367:0x088d, B:353:0x085d] A[DONT_GENERATE, DONT_INLINE]
  0x085f: PHI (r13v22 android.database.Cursor) = (r13v23 android.database.Cursor), (r13v24 android.database.Cursor) binds: [B:367:0x088d, B:353:0x085d] A[DONT_GENERATE, DONT_INLINE]
  0x085f: PHI (r31v6 java.util.Iterator) = (r31v7 java.util.Iterator), (r31v10 java.util.Iterator) binds: [B:367:0x088d, B:353:0x085d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ac A[Catch: SQLiteException -> 0x0220, all -> 0x0a6c, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x0220, blocks: (B:61:0x01a6, B:63:0x01ac, B:67:0x01bc, B:68:0x01c1, B:69:0x01cb, B:70:0x01db, B:72:0x01ea), top: B:441:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc A[Catch: SQLiteException -> 0x0220, all -> 0x0a6c, TRY_ENTER, TryCatch #6 {SQLiteException -> 0x0220, blocks: (B:61:0x01a6, B:63:0x01ac, B:67:0x01bc, B:68:0x01c1, B:69:0x01cb, B:70:0x01db, B:72:0x01ea), top: B:441:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0249  */
    /* JADX WARN: Type inference failed for: r0v189, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v26, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v45, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List zzb(java.lang.String r31, java.util.List r32, java.util.List r33, java.lang.Long r34, java.lang.Long r35, boolean r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzad.zzb(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    protected final boolean zzbb() {
        return false;
    }
}
