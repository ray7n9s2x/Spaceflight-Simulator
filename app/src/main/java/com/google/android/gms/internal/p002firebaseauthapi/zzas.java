package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.UShort;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* JADX INFO: loaded from: classes6.dex */
final class zzas<K, V> extends zzal<K, V> {
    private static final zzal<Object, Object> zza = new zzas(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    final zzag<V> zza() {
        return new zzaw(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    final zzaq<Map.Entry<K, V>> zzb() {
        return new zzar(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    final zzaq<K> zzc() {
        return new zzat(this, new zzaw(this.zzc, 0, this.zzd));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static <K, V> zzas<K, V> zza(int i, Object[] objArr, zzao<K, V> zzaoVar) {
        int iHighestOneBit;
        short[] sArr;
        char c;
        char c2;
        ?? r3;
        ?? r32;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return (zzas) zza;
        }
        zzan zzanVar = null;
        ?? r33 = 0;
        zzan zzanVar2 = null;
        zzan zzanVar3 = null;
        int i3 = 1;
        if (i2 == 1) {
            zzae.zza(Objects.requireNonNull(objArrCopyOf[0]), Objects.requireNonNull(objArrCopyOf[1]));
            return new zzas<>(null, objArrCopyOf, 1);
        }
        zzu.zzb(i2, objArrCopyOf.length >> 1);
        int iMax = Math.max(i2, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else {
            iHighestOneBit = Ints.MAX_POWER_OF_TWO;
            zzu.zza(iMax < 1073741824, "collection too large");
        }
        if (i2 == 1) {
            zzae.zza(Objects.requireNonNull(objArrCopyOf[0]), Objects.requireNonNull(objArrCopyOf[1]));
            c = 1;
            c2 = 2;
        } else {
            int i4 = iHighestOneBit - 1;
            byte b = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i5 * 2;
                    int i8 = i6 * 2;
                    Object objRequireNonNull = Objects.requireNonNull(objArrCopyOf[i7]);
                    Object objRequireNonNull2 = Objects.requireNonNull(objArrCopyOf[i7 ^ i3]);
                    zzae.zza(objRequireNonNull, objRequireNonNull2);
                    int iZza = zzad.zza(objRequireNonNull.hashCode());
                    while (true) {
                        int i9 = iZza & i4;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i8;
                            if (i6 < i5) {
                                objArrCopyOf[i8] = objRequireNonNull;
                                objArrCopyOf[i8 ^ 1] = objRequireNonNull2;
                            }
                            i6++;
                        } else {
                            if (objRequireNonNull.equals(objArrCopyOf[i10 == true ? 1 : 0])) {
                                int i11 = ~i10;
                                zzanVar2 = new zzan(objRequireNonNull, objRequireNonNull2, Objects.requireNonNull(objArrCopyOf[i11 == true ? 1 : 0]));
                                objArrCopyOf[i11 == true ? 1 : 0] = objRequireNonNull2;
                                break;
                            }
                            iZza = i9 + 1;
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 == i2) {
                    r3 = bArr;
                    c2 = 2;
                    r32 = r3;
                    c = 1;
                    r33 = r32;
                } else {
                    r32 = new Object[]{bArr, Integer.valueOf(i6), zzanVar2};
                    c2 = 2;
                    c = 1;
                    r33 = r32;
                }
            } else {
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i12 = 0;
                    for (int i13 = 0; i13 < i2; i13++) {
                        int i14 = i13 * 2;
                        int i15 = i12 * 2;
                        Object objRequireNonNull3 = Objects.requireNonNull(objArrCopyOf[i14]);
                        Object objRequireNonNull4 = Objects.requireNonNull(objArrCopyOf[i14 ^ 1]);
                        zzae.zza(objRequireNonNull3, objRequireNonNull4);
                        int iZza2 = zzad.zza(objRequireNonNull3.hashCode());
                        while (true) {
                            int i16 = iZza2 & i4;
                            int i17 = sArr[i16] & UShort.MAX_VALUE;
                            if (i17 == 65535) {
                                sArr[i16] = (short) i15;
                                if (i12 < i13) {
                                    objArrCopyOf[i15] = objRequireNonNull3;
                                    objArrCopyOf[i15 ^ 1] = objRequireNonNull4;
                                }
                                i12++;
                            } else {
                                if (objRequireNonNull3.equals(objArrCopyOf[i17 == true ? 1 : 0])) {
                                    int i18 = ~i17;
                                    zzanVar3 = new zzan(objRequireNonNull3, objRequireNonNull4, Objects.requireNonNull(objArrCopyOf[i18 == true ? 1 : 0]));
                                    objArrCopyOf[i18 == true ? 1 : 0] = objRequireNonNull4;
                                    break;
                                }
                                iZza2 = i16 + 1;
                            }
                        }
                    }
                    if (i12 != i2) {
                        c2 = 2;
                        r32 = new Object[]{sArr, Integer.valueOf(i12), zzanVar3};
                        c = 1;
                        r33 = r32;
                    }
                } else {
                    sArr = new int[iHighestOneBit];
                    Arrays.fill((int[]) sArr, -1);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i2) {
                        int i21 = i19 * 2;
                        int i22 = i20 * 2;
                        Object objRequireNonNull5 = Objects.requireNonNull(objArrCopyOf[i21]);
                        Object objRequireNonNull6 = Objects.requireNonNull(objArrCopyOf[i21 ^ 1]);
                        zzae.zza(objRequireNonNull5, objRequireNonNull6);
                        int iZza3 = zzad.zza(objRequireNonNull5.hashCode());
                        while (true) {
                            int i23 = iZza3 & i4;
                            ?? r15 = sArr[i23];
                            if (r15 == b) {
                                sArr[i23] = i22;
                                if (i20 < i19) {
                                    objArrCopyOf[i22] = objRequireNonNull5;
                                    objArrCopyOf[i22 ^ 1] = objRequireNonNull6;
                                }
                                i20++;
                            } else {
                                if (objRequireNonNull5.equals(objArrCopyOf[r15])) {
                                    int i24 = r15 ^ 1;
                                    zzanVar = new zzan(objRequireNonNull5, objRequireNonNull6, Objects.requireNonNull(objArrCopyOf[i24 == true ? 1 : 0]));
                                    objArrCopyOf[i24 == true ? 1 : 0] = objRequireNonNull6;
                                    break;
                                }
                                iZza3 = i23 + 1;
                                b = -1;
                            }
                        }
                        i19++;
                        b = -1;
                    }
                    if (i20 != i2) {
                        c = 1;
                        c2 = 2;
                        r33 = new Object[]{sArr, Integer.valueOf(i20), zzanVar};
                    }
                }
                r3 = sArr;
                c2 = 2;
                r32 = r3;
                c = 1;
                r33 = r32;
            }
        }
        boolean z = r33 instanceof Object[];
        ?? r34 = r33;
        if (z) {
            Object[] objArr2 = (Object[]) r33;
            zzan zzanVar4 = (zzan) objArr2[c2];
            if (zzaoVar == null) {
                throw zzanVar4.zza();
            }
            zzaoVar.zza = zzanVar4;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[c]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
            r34 = obj;
            i2 = iIntValue;
        }
        return new zzas<>(r34, objArrCopyOf, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0039->B:21:0x004f], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0064->B:31:0x007b], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x008a->B:42:0x00a2]] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.zzb
            java.lang.Object[] r1 = r8.zzc
            int r2 = r8.zzd
            r3 = 0
            if (r9 != 0) goto Lc
        L9:
            r9 = r3
            goto L9e
        Lc:
            r4 = 1
            if (r2 != r4) goto L24
            r0 = 0
            r0 = r1[r0]
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L9
            r9 = r1[r4]
            java.lang.Object r9 = java.util.Objects.requireNonNull(r9)
            goto L9e
        L24:
            if (r0 != 0) goto L27
            goto L9
        L27:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L52
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzad.zza(r0)
        L39:
            r0 = r0 & r5
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L42
            goto L9
        L42:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4f
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9e
        L4f:
            int r0 = r0 + 1
            goto L39
        L52:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7e
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzad.zza(r0)
        L64:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6e
            goto L9
        L6e:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L7b
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9e
        L7b:
            int r0 = r0 + 1
            goto L64
        L7e:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = com.google.android.gms.internal.p002firebaseauthapi.zzad.zza(r5)
        L8a:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L92
            goto L9
        L92:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La2
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9e:
            if (r9 != 0) goto La1
            return r3
        La1:
            return r9
        La2:
            int r5 = r5 + 1
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzas.get(java.lang.Object):java.lang.Object");
    }

    private zzas(Object obj, Object[] objArr, int i) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i;
    }
}
