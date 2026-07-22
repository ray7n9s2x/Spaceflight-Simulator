package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzzd {
    private ECPrivateKey zza;

    public zzzd(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i, zzzh zzzhVar) throws GeneralSecurityException {
        byte[] bArrZza = zzzf.zza(this.zza, zzzf.zza(this.zza.getParams(), zzzhVar, bArr));
        int i2 = 1;
        byte[] bArrZza2 = zzyz.zza(bArr, bArrZza);
        Mac macZza = zzzj.zzb.zza(str);
        if (i > macZza.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            macZza.init(new SecretKeySpec(new byte[macZza.getMacLength()], str));
        } else {
            macZza.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArrDoFinal = macZza.doFinal(bArrZza2);
        byte[] bArr4 = new byte[i];
        macZza.init(new SecretKeySpec(bArrDoFinal, str));
        byte[] bArrDoFinal2 = new byte[0];
        int length = 0;
        while (true) {
            macZza.update(bArrDoFinal2);
            macZza.update(bArr3);
            macZza.update((byte) i2);
            bArrDoFinal2 = macZza.doFinal();
            if (bArrDoFinal2.length + length < i) {
                System.arraycopy(bArrDoFinal2, 0, bArr4, length, bArrDoFinal2.length);
                length += bArrDoFinal2.length;
                i2++;
            } else {
                System.arraycopy(bArrDoFinal2, 0, bArr4, length, i - length);
                return bArr4;
            }
        }
    }
}
