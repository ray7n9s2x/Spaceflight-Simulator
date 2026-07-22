package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrn;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgi extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private List zzi;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    zzgi(zzic zzicVar, long j, long j2) {
        super(zzicVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j;
        this.zzh = j2;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:4)(17:79|6|(1:10)(2:11|(1:13))|83|14|(4:16|(1:18)(1:20)|77|21)|26|(2:28|(2:30|(2:32|(2:34|(2:36|(2:38|(1:40)(1:41))(1:42))(1:43))(1:44))(1:45))(1:46))(1:47)|48|81|49|(1:51)(1:52)|53|(1:55)|59|(2:62|(1:64)(4:65|(3:68|(1:86)(1:87)|66)|85|71))(1:71)|(2:73|74)(2:75|76))|5|26|(0)(0)|48|81|49|(0)(0)|53|(0)|59|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019a, code lost:
    
        r11.zzu.zzaV().zzb().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r1), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187 A[Catch: IllegalStateException -> 0x0199, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0199, blocks: (B:49:0x016d, B:53:0x0183, B:55:0x0187), top: B:81:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202  */
    @Override // com.google.android.gms.measurement.internal.zzg
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void zzf() {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgi.zzf():void");
    }

    final zzr zzh(String str) {
        String str2;
        String str3;
        boolean z;
        long j;
        int i;
        List list;
        String str4;
        int i2;
        long j2;
        ApplicationInfo applicationInfo;
        long jZzP;
        zzg();
        String strZzj = zzj();
        String strZzk = zzk();
        zzb();
        String str5 = this.zzb;
        zzb();
        long j3 = this.zzc;
        zzb();
        Preconditions.checkNotNull(this.zzd);
        String str6 = this.zzd;
        zzic zzicVar = this.zzu;
        zzicVar.zzc().zzi();
        zzb();
        zzg();
        long j4 = this.zzf;
        if (j4 == 0) {
            zzpp zzppVarZzk = this.zzu.zzk();
            Context contextZzaY = zzicVar.zzaY();
            String packageName = zzicVar.zzaY().getPackageName();
            zzppVarZzk.zzg();
            Preconditions.checkNotNull(contextZzaY);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = contextZzaY.getPackageManager();
            MessageDigest messageDigestZzO = zzpp.zzO();
            if (messageDigestZzO == null) {
                zzppVarZzk.zzu.zzaV().zzb().zza("Could not get MD5 instance");
                j4 = -1;
            } else if (packageManager != null) {
                try {
                    if (zzppVarZzk.zzad(contextZzaY, packageName)) {
                        jZzP = 0;
                    } else {
                        PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(contextZzaY);
                        zzic zzicVar2 = zzppVarZzk.zzu;
                        PackageInfo packageInfo = packageManagerWrapperPackageManager.getPackageInfo(zzicVar2.zzaY().getPackageName(), 64);
                        if (packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                            zzicVar2.zzaV().zze().zza("Could not get signatures");
                            jZzP = -1;
                        } else {
                            jZzP = zzpp.zzP(messageDigestZzO.digest(packageInfo.signatures[0].toByteArray()));
                        }
                    }
                    j4 = jZzP;
                } catch (PackageManager.NameNotFoundException e) {
                    zzppVarZzk.zzu.zzaV().zzb().zzb("Package name not found", e);
                    j4 = 0;
                }
            } else {
                j4 = 0;
            }
            this.zzf = j4;
        }
        long j5 = j4;
        zzic zzicVar3 = this.zzu;
        zzic zzicVar4 = this.zzu;
        boolean zZzB = zzicVar3.zzB();
        boolean z2 = !zzicVar4.zzd().zzm;
        zzg();
        if (zzicVar3.zzB()) {
            zzrn.zza();
            if (zzicVar4.zzc().zzp(null, zzfy.zzaH)) {
                this.zzu.zzaV().zzk().zza("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = zzicVar4.zzaY().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zzu.zzaY());
                            if (objInvoke != null) {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    this.zzu.zzaV().zzh().zza("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            this.zzu.zzaV().zzf().zza("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        zzic zzicVar5 = this.zzu;
        long jZza = zzicVar5.zzd().zzc.zza();
        long jMin = jZza == 0 ? zzicVar5.zza : Math.min(zzicVar5.zza, jZza);
        zzb();
        int i3 = this.zzk;
        zzic zzicVar6 = this.zzu;
        boolean zZzu = zzicVar6.zzc().zzu();
        zzhh zzhhVarZzd = zzicVar6.zzd();
        zzhhVarZzd.zzg();
        boolean z3 = zzhhVarZzd.zzd().getBoolean("deferred_analytics_collection", false);
        if (zzicVar6.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED) {
            str3 = "google_analytics_default_allow_ad_personalization_signals";
            z = true;
        } else {
            str3 = "google_analytics_default_allow_ad_personalization_signals";
            z = false;
        }
        long j6 = this.zzg;
        Boolean boolValueOf = Boolean.valueOf(z);
        List list2 = this.zzi;
        String strZzl = zzicVar6.zzd().zzl().zzl();
        if (this.zzj == null) {
            this.zzj = zzicVar6.zzk().zzaw();
        }
        String str7 = this.zzj;
        if (zzicVar6.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            zzg();
            j = 0;
            if (this.zzn == 0) {
                i = i3;
                list = list2;
            } else {
                i = i3;
                list = list2;
                long jCurrentTimeMillis = zzicVar6.zzaZ().currentTimeMillis() - this.zzn;
                if (this.zzm != null && jCurrentTimeMillis > 86400000 && this.zzo == null) {
                    zzi();
                }
            }
            if (this.zzm == null) {
                zzi();
            }
            str4 = this.zzm;
        } else {
            i = i3;
            list = list2;
            j = 0;
            str4 = null;
        }
        boolean zZzx = zzicVar6.zzc().zzx();
        zzpp zzppVarZzk2 = zzicVar6.zzk();
        String strZzj2 = zzj();
        zzic zzicVar7 = zzppVarZzk2.zzu;
        if (zzicVar7.zzaY().getPackageManager() == null) {
            j2 = j;
            i2 = 0;
        } else {
            try {
                i2 = 0;
            } catch (PackageManager.NameNotFoundException unused4) {
                i2 = 0;
            }
            try {
                applicationInfo = Wrappers.packageManager(zzicVar7.zzaY()).getApplicationInfo(strZzj2, 0);
            } catch (PackageManager.NameNotFoundException unused5) {
                zzic zzicVar8 = zzppVarZzk2.zzu;
                zzicVar8.zzaU();
                zzicVar8.zzaV().zzi().zzb("PackageManager failed to find running app: app_id", strZzj2);
            }
            int i4 = applicationInfo != null ? applicationInfo.targetSdkVersion : i2;
            j2 = i4;
        }
        zzic zzicVar9 = this.zzu;
        int iZzb = zzicVar9.zzd().zzl().zzb();
        String strZze = zzicVar9.zzd().zzj().zze();
        zzqp.zza();
        zzal zzalVarZzc = zzicVar9.zzc();
        zzfx zzfxVar = zzfy.zzaQ;
        int iZzU = zzalVarZzc.zzp(null, zzfxVar) ? zzicVar9.zzk().zzU() : i2;
        zzqp.zza();
        return new zzr(strZzj, strZzk, str5, j3, str6, 133005L, j5, str, zZzB, z2, str2, jMin, i, zZzu, z3, boolValueOf, j6, list, strZzl, str7, str4, zZzx, j2, iZzb, strZze, iZzU, zzicVar9.zzc().zzp(null, zzfxVar) ? zzicVar9.zzk().zzV() : j, zzicVar9.zzc().zzz(), new zze(zzicVar9.zzc().zzw(str3, true)).zzb(), this.zzu.zza, this.zzu.zzx().zzj().zza());
    }

    final void zzi() {
        String str;
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzicVar.zzk().zzf().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzicVar.zzaV().zzj().zza("Analytics Storage consent is not granted");
            str = null;
        }
        zzicVar.zzaV().zzj().zza(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.zzm = str;
        this.zzn = zzicVar.zzaZ().currentTimeMillis();
    }

    final String zzj() {
        zzb();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzk() {
        zzg();
        zzb();
        Preconditions.checkNotNull(this.zzl);
        return this.zzl;
    }

    final String zzl() {
        zzb();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    final int zzm() {
        zzb();
        return this.zzc;
    }

    final long zzn() {
        return this.zzh;
    }

    final int zzo() {
        zzb();
        return this.zzk;
    }

    final List zzp() {
        return this.zzi;
    }

    final boolean zzq(String str) {
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzo = str;
        return z;
    }
}
