package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.net.HttpHeaders;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpg implements zzjg {
    private static volatile zzpg zzb;
    private List zzA;
    private long zzB;
    private final Map zzC;
    private final Map zzD;
    private final Map zzE;
    private zzlu zzG;
    private String zzH;
    private zzay zzI;
    private long zzJ;
    long zza;
    private final zzht zzc;
    private final zzgz zzd;
    private zzav zze;
    private zzhb zzf;
    private zzok zzg;
    private zzad zzh;
    private final zzpk zzi;
    private zzlp zzj;
    private zznn zzk;
    private final zzou zzl;
    private zzhk zzm;
    private final zzic zzn;
    private boolean zzp;
    private List zzq;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List zzz;
    private final AtomicBoolean zzo = new AtomicBoolean(false);
    private final Deque zzr = new LinkedList();
    private final Map zzF = new HashMap();
    private final zzpo zzK = new zzpb(this);

    zzpg(zzph zzphVar, zzic zzicVar) {
        Preconditions.checkNotNull(zzphVar);
        this.zzn = zzic.zzy(zzphVar.zza, null, null);
        this.zzB = -1L;
        this.zzl = new zzou(this);
        zzpk zzpkVar = new zzpk(this);
        zzpkVar.zzax();
        this.zzi = zzpkVar;
        zzgz zzgzVar = new zzgz(this);
        zzgzVar.zzax();
        this.zzd = zzgzVar;
        zzht zzhtVar = new zzht(this);
        zzhtVar.zzax();
        this.zzc = zzhtVar;
        this.zzC = new HashMap();
        this.zzD = new HashMap();
        this.zzE = new HashMap();
        zzaW().zzj(new zzov(this, zzphVar));
    }

    public static zzpg zza(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzpg.class) {
                if (zzb == null) {
                    zzb = new zzpg((zzph) Preconditions.checkNotNull(new zzph(context)), null);
                }
            }
        }
        return zzb;
    }

    static final void zzaA(com.google.android.gms.internal.measurement.zzhr zzhrVar, int i, String str) {
        List listZza = zzhrVar.zza();
        for (int i2 = 0; i2 < listZza.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i2)).zzb())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzhvVarZzn.zzb("_err");
        long j = i;
        Long.valueOf(j).getClass();
        zzhvVarZzn.zzf(j);
        com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn.zzbc();
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzhvVarZzn2.zzb("_ev");
        zzhvVarZzn2.zzd(str);
        com.google.android.gms.internal.measurement.zzhw zzhwVar2 = (com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn2.zzbc();
        zzhrVar.zzf(zzhwVar);
        zzhrVar.zzf(zzhwVar2);
    }

    static final void zzaB(com.google.android.gms.internal.measurement.zzhr zzhrVar, String str) {
        List listZza = zzhrVar.zza();
        for (int i = 0; i < listZza.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i)).zzb())) {
                zzhrVar.zzj(i);
                return;
            }
        }
    }

    private final int zzaC(String str, zzan zzanVar) {
        zzjk zzjkVar;
        zzji zzjiVarZzA;
        zzht zzhtVar = this.zzc;
        if (zzhtVar.zzx(str) == null) {
            zzanVar.zzc(zzjk.AD_PERSONALIZATION, zzam.FAILSAFE);
            return 1;
        }
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null && zze.zzc(zzhVarZzu.zzaH()).zza() == zzji.POLICY && (zzjiVarZzA = zzhtVar.zzA(str, (zzjkVar = zzjk.AD_PERSONALIZATION))) != zzji.UNINITIALIZED) {
            zzanVar.zzc(zzjkVar, zzam.REMOTE_ENFORCED_DEFAULT);
            return zzjiVarZzA == zzji.GRANTED ? 0 : 1;
        }
        zzjk zzjkVar2 = zzjk.AD_PERSONALIZATION;
        zzanVar.zzc(zzjkVar2, zzam.REMOTE_DEFAULT);
        return zzhtVar.zzv(str, zzjkVar2) ? 0 : 1;
    }

    private final Map zzaD(com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        HashMap map = new HashMap();
        zzp();
        for (Map.Entry entry : zzpk.zzH(zzhsVar, "gad_").entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    private final zzay zzaE() {
        if (this.zzI == null) {
            this.zzI = new zzoy(this, this.zzn);
        }
        return this.zzI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public final void zzav() {
        zzaW().zzg();
        if (this.zzr.isEmpty() || zzaE().zzc()) {
            return;
        }
        long jMax = Math.max(0L, ((long) ((Integer) zzfy.zzaB.zzb(null)).intValue()) - (zzaZ().elapsedRealtime() - this.zzJ));
        zzaV().zzk().zzb("Scheduling notify next app runnable, delay in ms", Long.valueOf(jMax));
        zzaE().zzb(jMax);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:8|(5:9|10|(4:12|13|(4:15|(1:22)|23|483)(19:24|25|(2:31|(3:33|(1:40)(1:39)|41)(0))|42|(2:44|(3:46|(4:49|(1:488)(2:55|485)|56|47)|484))|57|58|(4:60|61|(0)(1:67)|(11:115|(5:119|(2:121|499)(2:122|(2:124|498)(1:500))|125|116|117)|497|126|(2:129|(3:134|(1:136)(2:137|(3:139|(3:142|(1:144)(1:516)|140)|515))|145)(2:133|146))(1:128)|147|(2:149|(2:(2:154|(2:156|157))|158)(4:159|160|172|190))(4:161|(2:163|(2:(2:168|(2:170|157))|171)(1:160))(3:173|(2:175|(2:183|(2:184|(2:186|(2:514|188)(1:189))(1:513)))(0))(0)|190)|172|190)|191|(9:193|(4:196|(2:209|(2:211|502)(1:504))(5:200|(5:203|(2:206|204)|506|207|201)|505|208|503)|212|194)|501|213|(4:216|(3:508|218|511)(1:510)|509|214)|507|219|(2:222|220)|512)(1:223)|224|482)(7:146|147|(0)(0)|191|(0)(0)|224|482))(1:68)|69|(3:70|71|(3:73|(2:75|491)(2:76|(2:78|490)(1:492))|79)(1:489))|80|(1:83)|(1:85)|86|(1:88)(1:89)|90|(1:112)(2:93|(4:95|(4:98|(2:100|495)(2:101|(2:103|494)(1:496))|104|96)|493|(1:(1:110)(1:111))(1:(1:107)(2:108|(0)(0)))))|113|(0)(0))|225)(1:481)|470|471)|226|(3:228|(2:230|(2:232|519)(2:233|(1:520)(3:235|(1:237)(1:238)|(1:522)(2:242|518))))(0)|243)|517|244|(3:245|246|(1:523)(2:248|(2:524|250)(1:525)))|251|(1:253)(2:254|(1:256))|257|(1:259)(1:260)|261|(1:263)(1:264)|265|(6:268|(1:270)|271|(2:273|527)(1:528)|274|266)|526|275|(2:280|(1:284))(1:279)|285|(1:287)|288|(1:290)|291|(1:299)|300|(9:477|302|(8:305|306|(4:308|(1:312)|(5:316|(1:320)|321|(1:325)|326)|327)(3:330|(4:475|332|338|(4:340|(2:341|(2:343|(3:536|345|(1:347)(1:348))(1:349))(1:535))|350|(1:352)(6:353|(2:355|(1:357))(1:358)|359|(1:361)(1:362)|363|(5:365|(1:373)|374|329|534)(4:375|(3:377|(1:379)|380)(5:381|(1:383)(1:384)|385|(3:387|(1:389)(1:390)|391)(2:392|(1:394))|395)|396|533)))(2:350|(0)(0)))(3:337|338|(0)(0))|397)|328|329|534|397|303)|532|398|(1:400)|401|(2:404|402)|537)(1:405)|406|(1:408)(13:409|(9:411|(1:413)(1:414)|415|(1:417)(1:418)|419|(1:421)(1:422)|423|(1:425)(1:426)|427)|429|(4:431|432|(2:438|(1:440)(1:441))(1:437)|442)(1:443)|444|(3:(2:448|530)(1:531)|449|445)|529|450|(1:452)|453|479|454|459)|428|429|(0)(0)|444|(1:445)|529|450|(0)|453|479|454|459) */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0dde, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0de0, code lost:
    
        r1.zzu.zzaV().zzb().zzc("Failed to remove unused event metadata. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r3), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a3 A[Catch: all -> 0x0e14, TryCatch #1 {all -> 0x0e14, blocks: (B:3:0x0011, B:5:0x0029, B:8:0x0031, B:9:0x0045, B:12:0x005d, B:15:0x0083, B:17:0x00b8, B:20:0x00c9, B:22:0x00d3, B:225:0x06de, B:24:0x0102, B:27:0x0114, B:29:0x011a, B:42:0x0155, B:44:0x0163, B:47:0x0183, B:49:0x0189, B:51:0x0199, B:53:0x01a7, B:55:0x01b7, B:56:0x01c4, B:57:0x01c7, B:60:0x01dd, B:70:0x020e, B:73:0x0218, B:75:0x0226, B:79:0x026b, B:76:0x0242, B:78:0x0252, B:83:0x0278, B:85:0x02a4, B:86:0x02ce, B:88:0x0305, B:90:0x030c, B:93:0x0318, B:95:0x0352, B:96:0x036d, B:98:0x0373, B:100:0x0381, B:104:0x0395, B:101:0x038a, B:107:0x039c, B:110:0x03a3, B:111:0x03bb, B:115:0x03da, B:116:0x03e6, B:119:0x03f0, B:125:0x0413, B:122:0x0402, B:147:0x0492, B:149:0x049c, B:152:0x04ad, B:154:0x04c0, B:156:0x04cc, B:191:0x059b, B:193:0x05a1, B:194:0x05ad, B:196:0x05b3, B:198:0x05c3, B:200:0x05cd, B:201:0x05e2, B:203:0x05e8, B:204:0x0603, B:206:0x0609, B:207:0x0627, B:208:0x0632, B:212:0x065b, B:209:0x0638, B:211:0x0648, B:213:0x0668, B:214:0x0684, B:216:0x068a, B:218:0x069d, B:219:0x06aa, B:220:0x06ae, B:222:0x06b4, B:224:0x06c6, B:161:0x04e8, B:163:0x04f6, B:166:0x0509, B:168:0x051c, B:170:0x0528, B:173:0x0537, B:175:0x0546, B:177:0x0552, B:179:0x055e, B:181:0x0568, B:184:0x0575, B:186:0x057b, B:188:0x058b, B:189:0x0596, B:129:0x041b, B:131:0x0427, B:133:0x0433, B:145:0x0478, B:137:0x0450, B:140:0x0462, B:142:0x0468, B:144:0x0472, B:31:0x0120, B:33:0x012b, B:35:0x0137, B:37:0x013d, B:41:0x0148, B:228:0x06f5, B:230:0x0703, B:232:0x070c, B:243:0x073d, B:233:0x0714, B:235:0x071d, B:237:0x0723, B:240:0x072f, B:242:0x0737, B:244:0x0740, B:245:0x074c, B:248:0x0754, B:250:0x0766, B:251:0x0771, B:253:0x0779, B:257:0x079e, B:259:0x07b8, B:261:0x07cd, B:263:0x07e7, B:265:0x07fc, B:266:0x080a, B:268:0x0810, B:270:0x0820, B:271:0x0827, B:273:0x0833, B:274:0x083a, B:275:0x083d, B:277:0x087f, B:279:0x0885, B:285:0x08ac, B:287:0x08b4, B:288:0x08bd, B:290:0x08c3, B:291:0x08c9, B:293:0x08de, B:295:0x08ee, B:297:0x08fe, B:299:0x0906, B:300:0x0909, B:308:0x097b, B:310:0x0994, B:312:0x09aa, B:314:0x09af, B:316:0x09b3, B:318:0x09b7, B:320:0x09c1, B:321:0x09c7, B:323:0x09cb, B:325:0x09d1, B:326:0x09df, B:327:0x09e8, B:332:0x0a0b, B:336:0x0a12, B:280:0x0893, B:282:0x0899, B:284:0x089f, B:264:0x07f9, B:260:0x07ca, B:254:0x077e, B:256:0x0784), top: B:473:0x0011, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03bb A[Catch: all -> 0x0e14, TryCatch #1 {all -> 0x0e14, blocks: (B:3:0x0011, B:5:0x0029, B:8:0x0031, B:9:0x0045, B:12:0x005d, B:15:0x0083, B:17:0x00b8, B:20:0x00c9, B:22:0x00d3, B:225:0x06de, B:24:0x0102, B:27:0x0114, B:29:0x011a, B:42:0x0155, B:44:0x0163, B:47:0x0183, B:49:0x0189, B:51:0x0199, B:53:0x01a7, B:55:0x01b7, B:56:0x01c4, B:57:0x01c7, B:60:0x01dd, B:70:0x020e, B:73:0x0218, B:75:0x0226, B:79:0x026b, B:76:0x0242, B:78:0x0252, B:83:0x0278, B:85:0x02a4, B:86:0x02ce, B:88:0x0305, B:90:0x030c, B:93:0x0318, B:95:0x0352, B:96:0x036d, B:98:0x0373, B:100:0x0381, B:104:0x0395, B:101:0x038a, B:107:0x039c, B:110:0x03a3, B:111:0x03bb, B:115:0x03da, B:116:0x03e6, B:119:0x03f0, B:125:0x0413, B:122:0x0402, B:147:0x0492, B:149:0x049c, B:152:0x04ad, B:154:0x04c0, B:156:0x04cc, B:191:0x059b, B:193:0x05a1, B:194:0x05ad, B:196:0x05b3, B:198:0x05c3, B:200:0x05cd, B:201:0x05e2, B:203:0x05e8, B:204:0x0603, B:206:0x0609, B:207:0x0627, B:208:0x0632, B:212:0x065b, B:209:0x0638, B:211:0x0648, B:213:0x0668, B:214:0x0684, B:216:0x068a, B:218:0x069d, B:219:0x06aa, B:220:0x06ae, B:222:0x06b4, B:224:0x06c6, B:161:0x04e8, B:163:0x04f6, B:166:0x0509, B:168:0x051c, B:170:0x0528, B:173:0x0537, B:175:0x0546, B:177:0x0552, B:179:0x055e, B:181:0x0568, B:184:0x0575, B:186:0x057b, B:188:0x058b, B:189:0x0596, B:129:0x041b, B:131:0x0427, B:133:0x0433, B:145:0x0478, B:137:0x0450, B:140:0x0462, B:142:0x0468, B:144:0x0472, B:31:0x0120, B:33:0x012b, B:35:0x0137, B:37:0x013d, B:41:0x0148, B:228:0x06f5, B:230:0x0703, B:232:0x070c, B:243:0x073d, B:233:0x0714, B:235:0x071d, B:237:0x0723, B:240:0x072f, B:242:0x0737, B:244:0x0740, B:245:0x074c, B:248:0x0754, B:250:0x0766, B:251:0x0771, B:253:0x0779, B:257:0x079e, B:259:0x07b8, B:261:0x07cd, B:263:0x07e7, B:265:0x07fc, B:266:0x080a, B:268:0x0810, B:270:0x0820, B:271:0x0827, B:273:0x0833, B:274:0x083a, B:275:0x083d, B:277:0x087f, B:279:0x0885, B:285:0x08ac, B:287:0x08b4, B:288:0x08bd, B:290:0x08c3, B:291:0x08c9, B:293:0x08de, B:295:0x08ee, B:297:0x08fe, B:299:0x0906, B:300:0x0909, B:308:0x097b, B:310:0x0994, B:312:0x09aa, B:314:0x09af, B:316:0x09b3, B:318:0x09b7, B:320:0x09c1, B:321:0x09c7, B:323:0x09cb, B:325:0x09d1, B:326:0x09df, B:327:0x09e8, B:332:0x0a0b, B:336:0x0a12, B:280:0x0893, B:282:0x0899, B:284:0x089f, B:264:0x07f9, B:260:0x07ca, B:254:0x077e, B:256:0x0784), top: B:473:0x0011, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03da A[Catch: all -> 0x0e14, TryCatch #1 {all -> 0x0e14, blocks: (B:3:0x0011, B:5:0x0029, B:8:0x0031, B:9:0x0045, B:12:0x005d, B:15:0x0083, B:17:0x00b8, B:20:0x00c9, B:22:0x00d3, B:225:0x06de, B:24:0x0102, B:27:0x0114, B:29:0x011a, B:42:0x0155, B:44:0x0163, B:47:0x0183, B:49:0x0189, B:51:0x0199, B:53:0x01a7, B:55:0x01b7, B:56:0x01c4, B:57:0x01c7, B:60:0x01dd, B:70:0x020e, B:73:0x0218, B:75:0x0226, B:79:0x026b, B:76:0x0242, B:78:0x0252, B:83:0x0278, B:85:0x02a4, B:86:0x02ce, B:88:0x0305, B:90:0x030c, B:93:0x0318, B:95:0x0352, B:96:0x036d, B:98:0x0373, B:100:0x0381, B:104:0x0395, B:101:0x038a, B:107:0x039c, B:110:0x03a3, B:111:0x03bb, B:115:0x03da, B:116:0x03e6, B:119:0x03f0, B:125:0x0413, B:122:0x0402, B:147:0x0492, B:149:0x049c, B:152:0x04ad, B:154:0x04c0, B:156:0x04cc, B:191:0x059b, B:193:0x05a1, B:194:0x05ad, B:196:0x05b3, B:198:0x05c3, B:200:0x05cd, B:201:0x05e2, B:203:0x05e8, B:204:0x0603, B:206:0x0609, B:207:0x0627, B:208:0x0632, B:212:0x065b, B:209:0x0638, B:211:0x0648, B:213:0x0668, B:214:0x0684, B:216:0x068a, B:218:0x069d, B:219:0x06aa, B:220:0x06ae, B:222:0x06b4, B:224:0x06c6, B:161:0x04e8, B:163:0x04f6, B:166:0x0509, B:168:0x051c, B:170:0x0528, B:173:0x0537, B:175:0x0546, B:177:0x0552, B:179:0x055e, B:181:0x0568, B:184:0x0575, B:186:0x057b, B:188:0x058b, B:189:0x0596, B:129:0x041b, B:131:0x0427, B:133:0x0433, B:145:0x0478, B:137:0x0450, B:140:0x0462, B:142:0x0468, B:144:0x0472, B:31:0x0120, B:33:0x012b, B:35:0x0137, B:37:0x013d, B:41:0x0148, B:228:0x06f5, B:230:0x0703, B:232:0x070c, B:243:0x073d, B:233:0x0714, B:235:0x071d, B:237:0x0723, B:240:0x072f, B:242:0x0737, B:244:0x0740, B:245:0x074c, B:248:0x0754, B:250:0x0766, B:251:0x0771, B:253:0x0779, B:257:0x079e, B:259:0x07b8, B:261:0x07cd, B:263:0x07e7, B:265:0x07fc, B:266:0x080a, B:268:0x0810, B:270:0x0820, B:271:0x0827, B:273:0x0833, B:274:0x083a, B:275:0x083d, B:277:0x087f, B:279:0x0885, B:285:0x08ac, B:287:0x08b4, B:288:0x08bd, B:290:0x08c3, B:291:0x08c9, B:293:0x08de, B:295:0x08ee, B:297:0x08fe, B:299:0x0906, B:300:0x0909, B:308:0x097b, B:310:0x0994, B:312:0x09aa, B:314:0x09af, B:316:0x09b3, B:318:0x09b7, B:320:0x09c1, B:321:0x09c7, B:323:0x09cb, B:325:0x09d1, B:326:0x09df, B:327:0x09e8, B:332:0x0a0b, B:336:0x0a12, B:280:0x0893, B:282:0x0899, B:284:0x089f, B:264:0x07f9, B:260:0x07ca, B:254:0x077e, B:256:0x0784), top: B:473:0x0011, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x049c A[Catch: all -> 0x0e14, TryCatch #1 {all -> 0x0e14, blocks: (B:3:0x0011, B:5:0x0029, B:8:0x0031, B:9:0x0045, B:12:0x005d, B:15:0x0083, B:17:0x00b8, B:20:0x00c9, B:22:0x00d3, B:225:0x06de, B:24:0x0102, B:27:0x0114, B:29:0x011a, B:42:0x0155, B:44:0x0163, B:47:0x0183, B:49:0x0189, B:51:0x0199, B:53:0x01a7, B:55:0x01b7, B:56:0x01c4, B:57:0x01c7, B:60:0x01dd, B:70:0x020e, B:73:0x0218, B:75:0x0226, B:79:0x026b, B:76:0x0242, B:78:0x0252, B:83:0x0278, B:85:0x02a4, B:86:0x02ce, B:88:0x0305, B:90:0x030c, B:93:0x0318, B:95:0x0352, B:96:0x036d, B:98:0x0373, B:100:0x0381, B:104:0x0395, B:101:0x038a, B:107:0x039c, B:110:0x03a3, B:111:0x03bb, B:115:0x03da, B:116:0x03e6, B:119:0x03f0, B:125:0x0413, B:122:0x0402, B:147:0x0492, B:149:0x049c, B:152:0x04ad, B:154:0x04c0, B:156:0x04cc, B:191:0x059b, B:193:0x05a1, B:194:0x05ad, B:196:0x05b3, B:198:0x05c3, B:200:0x05cd, B:201:0x05e2, B:203:0x05e8, B:204:0x0603, B:206:0x0609, B:207:0x0627, B:208:0x0632, B:212:0x065b, B:209:0x0638, B:211:0x0648, B:213:0x0668, B:214:0x0684, B:216:0x068a, B:218:0x069d, B:219:0x06aa, B:220:0x06ae, B:222:0x06b4, B:224:0x06c6, B:161:0x04e8, B:163:0x04f6, B:166:0x0509, B:168:0x051c, B:170:0x0528, B:173:0x0537, B:175:0x0546, B:177:0x0552, B:179:0x055e, B:181:0x0568, B:184:0x0575, B:186:0x057b, B:188:0x058b, B:189:0x0596, B:129:0x041b, B:131:0x0427, B:133:0x0433, B:145:0x0478, B:137:0x0450, B:140:0x0462, B:142:0x0468, B:144:0x0472, B:31:0x0120, B:33:0x012b, B:35:0x0137, B:37:0x013d, B:41:0x0148, B:228:0x06f5, B:230:0x0703, B:232:0x070c, B:243:0x073d, B:233:0x0714, B:235:0x071d, B:237:0x0723, B:240:0x072f, B:242:0x0737, B:244:0x0740, B:245:0x074c, B:248:0x0754, B:250:0x0766, B:251:0x0771, B:253:0x0779, B:257:0x079e, B:259:0x07b8, B:261:0x07cd, B:263:0x07e7, B:265:0x07fc, B:266:0x080a, B:268:0x0810, B:270:0x0820, B:271:0x0827, B:273:0x0833, B:274:0x083a, B:275:0x083d, B:277:0x087f, B:279:0x0885, B:285:0x08ac, B:287:0x08b4, B:288:0x08bd, B:290:0x08c3, B:291:0x08c9, B:293:0x08de, B:295:0x08ee, B:297:0x08fe, B:299:0x0906, B:300:0x0909, B:308:0x097b, B:310:0x0994, B:312:0x09aa, B:314:0x09af, B:316:0x09b3, B:318:0x09b7, B:320:0x09c1, B:321:0x09c7, B:323:0x09cb, B:325:0x09d1, B:326:0x09df, B:327:0x09e8, B:332:0x0a0b, B:336:0x0a12, B:280:0x0893, B:282:0x0899, B:284:0x089f, B:264:0x07f9, B:260:0x07ca, B:254:0x077e, B:256:0x0784), top: B:473:0x0011, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04e8 A[Catch: all -> 0x0e14, TryCatch #1 {all -> 0x0e14, blocks: (B:3:0x0011, B:5:0x0029, B:8:0x0031, B:9:0x0045, B:12:0x005d, B:15:0x0083, B:17:0x00b8, B:20:0x00c9, B:22:0x00d3, B:225:0x06de, B:24:0x0102, B:27:0x0114, B:29:0x011a, B:42:0x0155, B:44:0x0163, B:47:0x0183, B:49:0x0189, B:51:0x0199, B:53:0x01a7, B:55:0x01b7, B:56:0x01c4, B:57:0x01c7, B:60:0x01dd, B:70:0x020e, B:73:0x0218, B:75:0x0226, B:79:0x026b, B:76:0x0242, B:78:0x0252, B:83:0x0278, B:85:0x02a4, B:86:0x02ce, B:88:0x0305, B:90:0x030c, B:93:0x0318, B:95:0x0352, B:96:0x036d, B:98:0x0373, B:100:0x0381, B:104:0x0395, B:101:0x038a, B:107:0x039c, B:110:0x03a3, B:111:0x03bb, B:115:0x03da, B:116:0x03e6, B:119:0x03f0, B:125:0x0413, B:122:0x0402, B:147:0x0492, B:149:0x049c, B:152:0x04ad, B:154:0x04c0, B:156:0x04cc, B:191:0x059b, B:193:0x05a1, B:194:0x05ad, B:196:0x05b3, B:198:0x05c3, B:200:0x05cd, B:201:0x05e2, B:203:0x05e8, B:204:0x0603, B:206:0x0609, B:207:0x0627, B:208:0x0632, B:212:0x065b, B:209:0x0638, B:211:0x0648, B:213:0x0668, B:214:0x0684, B:216:0x068a, B:218:0x069d, B:219:0x06aa, B:220:0x06ae, B:222:0x06b4, B:224:0x06c6, B:161:0x04e8, B:163:0x04f6, B:166:0x0509, B:168:0x051c, B:170:0x0528, B:173:0x0537, B:175:0x0546, B:177:0x0552, B:179:0x055e, B:181:0x0568, B:184:0x0575, B:186:0x057b, B:188:0x058b, B:189:0x0596, B:129:0x041b, B:131:0x0427, B:133:0x0433, B:145:0x0478, B:137:0x0450, B:140:0x0462, B:142:0x0468, B:144:0x0472, B:31:0x0120, B:33:0x012b, B:35:0x0137, B:37:0x013d, B:41:0x0148, B:228:0x06f5, B:230:0x0703, B:232:0x070c, B:243:0x073d, B:233:0x0714, B:235:0x071d, B:237:0x0723, B:240:0x072f, B:242:0x0737, B:244:0x0740, B:245:0x074c, B:248:0x0754, B:250:0x0766, B:251:0x0771, B:253:0x0779, B:257:0x079e, B:259:0x07b8, B:261:0x07cd, B:263:0x07e7, B:265:0x07fc, B:266:0x080a, B:268:0x0810, B:270:0x0820, B:271:0x0827, B:273:0x0833, B:274:0x083a, B:275:0x083d, B:277:0x087f, B:279:0x0885, B:285:0x08ac, B:287:0x08b4, B:288:0x08bd, B:290:0x08c3, B:291:0x08c9, B:293:0x08de, B:295:0x08ee, B:297:0x08fe, B:299:0x0906, B:300:0x0909, B:308:0x097b, B:310:0x0994, B:312:0x09aa, B:314:0x09af, B:316:0x09b3, B:318:0x09b7, B:320:0x09c1, B:321:0x09c7, B:323:0x09cb, B:325:0x09d1, B:326:0x09df, B:327:0x09e8, B:332:0x0a0b, B:336:0x0a12, B:280:0x0893, B:282:0x0899, B:284:0x089f, B:264:0x07f9, B:260:0x07ca, B:254:0x077e, B:256:0x0784), top: B:473:0x0011, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05a1 A[Catch: all -> 0x0e14, TryCatch #1 {all -> 0x0e14, blocks: (B:3:0x0011, B:5:0x0029, B:8:0x0031, B:9:0x0045, B:12:0x005d, B:15:0x0083, B:17:0x00b8, B:20:0x00c9, B:22:0x00d3, B:225:0x06de, B:24:0x0102, B:27:0x0114, B:29:0x011a, B:42:0x0155, B:44:0x0163, B:47:0x0183, B:49:0x0189, B:51:0x0199, B:53:0x01a7, B:55:0x01b7, B:56:0x01c4, B:57:0x01c7, B:60:0x01dd, B:70:0x020e, B:73:0x0218, B:75:0x0226, B:79:0x026b, B:76:0x0242, B:78:0x0252, B:83:0x0278, B:85:0x02a4, B:86:0x02ce, B:88:0x0305, B:90:0x030c, B:93:0x0318, B:95:0x0352, B:96:0x036d, B:98:0x0373, B:100:0x0381, B:104:0x0395, B:101:0x038a, B:107:0x039c, B:110:0x03a3, B:111:0x03bb, B:115:0x03da, B:116:0x03e6, B:119:0x03f0, B:125:0x0413, B:122:0x0402, B:147:0x0492, B:149:0x049c, B:152:0x04ad, B:154:0x04c0, B:156:0x04cc, B:191:0x059b, B:193:0x05a1, B:194:0x05ad, B:196:0x05b3, B:198:0x05c3, B:200:0x05cd, B:201:0x05e2, B:203:0x05e8, B:204:0x0603, B:206:0x0609, B:207:0x0627, B:208:0x0632, B:212:0x065b, B:209:0x0638, B:211:0x0648, B:213:0x0668, B:214:0x0684, B:216:0x068a, B:218:0x069d, B:219:0x06aa, B:220:0x06ae, B:222:0x06b4, B:224:0x06c6, B:161:0x04e8, B:163:0x04f6, B:166:0x0509, B:168:0x051c, B:170:0x0528, B:173:0x0537, B:175:0x0546, B:177:0x0552, B:179:0x055e, B:181:0x0568, B:184:0x0575, B:186:0x057b, B:188:0x058b, B:189:0x0596, B:129:0x041b, B:131:0x0427, B:133:0x0433, B:145:0x0478, B:137:0x0450, B:140:0x0462, B:142:0x0468, B:144:0x0472, B:31:0x0120, B:33:0x012b, B:35:0x0137, B:37:0x013d, B:41:0x0148, B:228:0x06f5, B:230:0x0703, B:232:0x070c, B:243:0x073d, B:233:0x0714, B:235:0x071d, B:237:0x0723, B:240:0x072f, B:242:0x0737, B:244:0x0740, B:245:0x074c, B:248:0x0754, B:250:0x0766, B:251:0x0771, B:253:0x0779, B:257:0x079e, B:259:0x07b8, B:261:0x07cd, B:263:0x07e7, B:265:0x07fc, B:266:0x080a, B:268:0x0810, B:270:0x0820, B:271:0x0827, B:273:0x0833, B:274:0x083a, B:275:0x083d, B:277:0x087f, B:279:0x0885, B:285:0x08ac, B:287:0x08b4, B:288:0x08bd, B:290:0x08c3, B:291:0x08c9, B:293:0x08de, B:295:0x08ee, B:297:0x08fe, B:299:0x0906, B:300:0x0909, B:308:0x097b, B:310:0x0994, B:312:0x09aa, B:314:0x09af, B:316:0x09b3, B:318:0x09b7, B:320:0x09c1, B:321:0x09c7, B:323:0x09cb, B:325:0x09d1, B:326:0x09df, B:327:0x09e8, B:332:0x0a0b, B:336:0x0a12, B:280:0x0893, B:282:0x0899, B:284:0x089f, B:264:0x07f9, B:260:0x07ca, B:254:0x077e, B:256:0x0784), top: B:473:0x0011, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0714 A[Catch: all -> 0x0e14, TryCatch #1 {all -> 0x0e14, blocks: (B:3:0x0011, B:5:0x0029, B:8:0x0031, B:9:0x0045, B:12:0x005d, B:15:0x0083, B:17:0x00b8, B:20:0x00c9, B:22:0x00d3, B:225:0x06de, B:24:0x0102, B:27:0x0114, B:29:0x011a, B:42:0x0155, B:44:0x0163, B:47:0x0183, B:49:0x0189, B:51:0x0199, B:53:0x01a7, B:55:0x01b7, B:56:0x01c4, B:57:0x01c7, B:60:0x01dd, B:70:0x020e, B:73:0x0218, B:75:0x0226, B:79:0x026b, B:76:0x0242, B:78:0x0252, B:83:0x0278, B:85:0x02a4, B:86:0x02ce, B:88:0x0305, B:90:0x030c, B:93:0x0318, B:95:0x0352, B:96:0x036d, B:98:0x0373, B:100:0x0381, B:104:0x0395, B:101:0x038a, B:107:0x039c, B:110:0x03a3, B:111:0x03bb, B:115:0x03da, B:116:0x03e6, B:119:0x03f0, B:125:0x0413, B:122:0x0402, B:147:0x0492, B:149:0x049c, B:152:0x04ad, B:154:0x04c0, B:156:0x04cc, B:191:0x059b, B:193:0x05a1, B:194:0x05ad, B:196:0x05b3, B:198:0x05c3, B:200:0x05cd, B:201:0x05e2, B:203:0x05e8, B:204:0x0603, B:206:0x0609, B:207:0x0627, B:208:0x0632, B:212:0x065b, B:209:0x0638, B:211:0x0648, B:213:0x0668, B:214:0x0684, B:216:0x068a, B:218:0x069d, B:219:0x06aa, B:220:0x06ae, B:222:0x06b4, B:224:0x06c6, B:161:0x04e8, B:163:0x04f6, B:166:0x0509, B:168:0x051c, B:170:0x0528, B:173:0x0537, B:175:0x0546, B:177:0x0552, B:179:0x055e, B:181:0x0568, B:184:0x0575, B:186:0x057b, B:188:0x058b, B:189:0x0596, B:129:0x041b, B:131:0x0427, B:133:0x0433, B:145:0x0478, B:137:0x0450, B:140:0x0462, B:142:0x0468, B:144:0x0472, B:31:0x0120, B:33:0x012b, B:35:0x0137, B:37:0x013d, B:41:0x0148, B:228:0x06f5, B:230:0x0703, B:232:0x070c, B:243:0x073d, B:233:0x0714, B:235:0x071d, B:237:0x0723, B:240:0x072f, B:242:0x0737, B:244:0x0740, B:245:0x074c, B:248:0x0754, B:250:0x0766, B:251:0x0771, B:253:0x0779, B:257:0x079e, B:259:0x07b8, B:261:0x07cd, B:263:0x07e7, B:265:0x07fc, B:266:0x080a, B:268:0x0810, B:270:0x0820, B:271:0x0827, B:273:0x0833, B:274:0x083a, B:275:0x083d, B:277:0x087f, B:279:0x0885, B:285:0x08ac, B:287:0x08b4, B:288:0x08bd, B:290:0x08c3, B:291:0x08c9, B:293:0x08de, B:295:0x08ee, B:297:0x08fe, B:299:0x0906, B:300:0x0909, B:308:0x097b, B:310:0x0994, B:312:0x09aa, B:314:0x09af, B:316:0x09b3, B:318:0x09b7, B:320:0x09c1, B:321:0x09c7, B:323:0x09cb, B:325:0x09d1, B:326:0x09df, B:327:0x09e8, B:332:0x0a0b, B:336:0x0a12, B:280:0x0893, B:282:0x0899, B:284:0x089f, B:264:0x07f9, B:260:0x07ca, B:254:0x077e, B:256:0x0784), top: B:473:0x0011, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0a46 A[Catch: all -> 0x0dfc, TryCatch #3 {all -> 0x0dfc, blocks: (B:302:0x094a, B:303:0x095d, B:305:0x0963, B:397:0x0c21, B:330:0x09f5, B:338:0x0a26, B:340:0x0a46, B:341:0x0a4e, B:343:0x0a54, B:345:0x0a66, B:352:0x0a8e, B:353:0x0ab1, B:355:0x0abd, B:357:0x0ad3, B:359:0x0b12, B:363:0x0b28, B:365:0x0b31, B:367:0x0b3f, B:369:0x0b43, B:371:0x0b47, B:373:0x0b4b, B:374:0x0b57, B:375:0x0b5c, B:377:0x0b62, B:379:0x0b7d, B:380:0x0b82, B:396:0x0c1e, B:381:0x0b9a, B:383:0x0ba0, B:387:0x0bc3, B:389:0x0bea, B:391:0x0bf6, B:392:0x0c06, B:394:0x0c0e, B:384:0x0bab, B:350:0x0a7a, B:398:0x0c2e, B:400:0x0c3c, B:401:0x0c42, B:402:0x0c4a, B:404:0x0c50, B:406:0x0c68, B:408:0x0c7a, B:429:0x0cfd, B:409:0x0c92, B:411:0x0c98, B:413:0x0ca2, B:415:0x0ca9, B:421:0x0cb9, B:423:0x0cc0, B:425:0x0cec, B:427:0x0cf3, B:426:0x0cf0, B:422:0x0cbd, B:414:0x0ca6), top: B:477:0x094a }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0a7a A[Catch: all -> 0x0dfc, EDGE_INSN: B:535:0x0a7a->B:350:0x0a7a BREAK  A[LOOP:17: B:341:0x0a4e->B:349:0x0a77], TryCatch #3 {all -> 0x0dfc, blocks: (B:302:0x094a, B:303:0x095d, B:305:0x0963, B:397:0x0c21, B:330:0x09f5, B:338:0x0a26, B:340:0x0a46, B:341:0x0a4e, B:343:0x0a54, B:345:0x0a66, B:352:0x0a8e, B:353:0x0ab1, B:355:0x0abd, B:357:0x0ad3, B:359:0x0b12, B:363:0x0b28, B:365:0x0b31, B:367:0x0b3f, B:369:0x0b43, B:371:0x0b47, B:373:0x0b4b, B:374:0x0b57, B:375:0x0b5c, B:377:0x0b62, B:379:0x0b7d, B:380:0x0b82, B:396:0x0c1e, B:381:0x0b9a, B:383:0x0ba0, B:387:0x0bc3, B:389:0x0bea, B:391:0x0bf6, B:392:0x0c06, B:394:0x0c0e, B:384:0x0bab, B:350:0x0a7a, B:398:0x0c2e, B:400:0x0c3c, B:401:0x0c42, B:402:0x0c4a, B:404:0x0c50, B:406:0x0c68, B:408:0x0c7a, B:429:0x0cfd, B:409:0x0c92, B:411:0x0c98, B:413:0x0ca2, B:415:0x0ca9, B:421:0x0cb9, B:423:0x0cc0, B:425:0x0cec, B:427:0x0cf3, B:426:0x0cf0, B:422:0x0cbd, B:414:0x0ca6), top: B:477:0x094a }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0a8e A[Catch: all -> 0x0dfc, TryCatch #3 {all -> 0x0dfc, blocks: (B:302:0x094a, B:303:0x095d, B:305:0x0963, B:397:0x0c21, B:330:0x09f5, B:338:0x0a26, B:340:0x0a46, B:341:0x0a4e, B:343:0x0a54, B:345:0x0a66, B:352:0x0a8e, B:353:0x0ab1, B:355:0x0abd, B:357:0x0ad3, B:359:0x0b12, B:363:0x0b28, B:365:0x0b31, B:367:0x0b3f, B:369:0x0b43, B:371:0x0b47, B:373:0x0b4b, B:374:0x0b57, B:375:0x0b5c, B:377:0x0b62, B:379:0x0b7d, B:380:0x0b82, B:396:0x0c1e, B:381:0x0b9a, B:383:0x0ba0, B:387:0x0bc3, B:389:0x0bea, B:391:0x0bf6, B:392:0x0c06, B:394:0x0c0e, B:384:0x0bab, B:350:0x0a7a, B:398:0x0c2e, B:400:0x0c3c, B:401:0x0c42, B:402:0x0c4a, B:404:0x0c50, B:406:0x0c68, B:408:0x0c7a, B:429:0x0cfd, B:409:0x0c92, B:411:0x0c98, B:413:0x0ca2, B:415:0x0ca9, B:421:0x0cb9, B:423:0x0cc0, B:425:0x0cec, B:427:0x0cf3, B:426:0x0cf0, B:422:0x0cbd, B:414:0x0ca6), top: B:477:0x094a }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0ab1 A[Catch: all -> 0x0dfc, TryCatch #3 {all -> 0x0dfc, blocks: (B:302:0x094a, B:303:0x095d, B:305:0x0963, B:397:0x0c21, B:330:0x09f5, B:338:0x0a26, B:340:0x0a46, B:341:0x0a4e, B:343:0x0a54, B:345:0x0a66, B:352:0x0a8e, B:353:0x0ab1, B:355:0x0abd, B:357:0x0ad3, B:359:0x0b12, B:363:0x0b28, B:365:0x0b31, B:367:0x0b3f, B:369:0x0b43, B:371:0x0b47, B:373:0x0b4b, B:374:0x0b57, B:375:0x0b5c, B:377:0x0b62, B:379:0x0b7d, B:380:0x0b82, B:396:0x0c1e, B:381:0x0b9a, B:383:0x0ba0, B:387:0x0bc3, B:389:0x0bea, B:391:0x0bf6, B:392:0x0c06, B:394:0x0c0e, B:384:0x0bab, B:350:0x0a7a, B:398:0x0c2e, B:400:0x0c3c, B:401:0x0c42, B:402:0x0c4a, B:404:0x0c50, B:406:0x0c68, B:408:0x0c7a, B:429:0x0cfd, B:409:0x0c92, B:411:0x0c98, B:413:0x0ca2, B:415:0x0ca9, B:421:0x0cb9, B:423:0x0cc0, B:425:0x0cec, B:427:0x0cf3, B:426:0x0cf0, B:422:0x0cbd, B:414:0x0ca6), top: B:477:0x094a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0d62  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0d80  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0db1 A[Catch: all -> 0x0e12, TryCatch #0 {all -> 0x0e12, blocks: (B:432:0x0d05, B:434:0x0d1a, B:437:0x0d21, B:442:0x0d52, B:444:0x0d64, B:445:0x0d7a, B:448:0x0d82, B:449:0x0d87, B:450:0x0d97, B:452:0x0db1, B:453:0x0dcc, B:454:0x0dd4, B:459:0x0df3, B:458:0x0de0, B:438:0x0d29, B:440:0x0d35, B:441:0x0d3b, B:462:0x0e00), top: B:472:0x0027, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzaG(java.lang.String r41, long r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzaG(java.lang.String, long):boolean");
    }

    private final void zzaH(com.google.android.gms.internal.measurement.zzic zzicVar, long j, boolean z) {
        Object obj;
        String str = true != z ? "_lte" : "_se";
        zzpn zzpnVarZzm = zzj().zzm(zzicVar.zzK(), str);
        zzpn zzpnVar = (zzpnVarZzm == null || (obj = zzpnVarZzm.zze) == null) ? new zzpn(zzicVar.zzK(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str, zzaZ().currentTimeMillis(), Long.valueOf(j)) : new zzpn(zzicVar.zzK(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str, zzaZ().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
        zzitVarZzm.zzb(str);
        zzitVarZzm.zza(zzaZ().currentTimeMillis());
        Object obj2 = zzpnVar.zze;
        zzitVarZzm.zze(((Long) obj2).longValue());
        com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbc();
        int iZzx = zzpk.zzx(zzicVar, str);
        if (iZzx >= 0) {
            zzicVar.zzn(iZzx, zziuVar);
        } else {
            zzicVar.zzo(zziuVar);
        }
        if (j > 0) {
            zzj().zzl(zzpnVar);
            zzaV().zzk().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj2);
        }
    }

    private final boolean zzaI(com.google.android.gms.internal.measurement.zzhr zzhrVar, com.google.android.gms.internal.measurement.zzhr zzhrVar2) {
        Preconditions.checkArgument("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc(), "_sc");
        String strZzd = zzhwVarZzF == null ? null : zzhwVarZzF.zzd();
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF2 = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar2.zzbc(), "_pc");
        String strZzd2 = zzhwVarZzF2 != null ? zzhwVarZzF2.zzd() : null;
        if (strZzd2 == null || !strZzd2.equals(strZzd)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF3 = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc(), "_et");
        if (zzhwVarZzF3 == null || !zzhwVarZzF3.zze() || zzhwVarZzF3.zzf() <= 0) {
            return true;
        }
        long jZzf = zzhwVarZzF3.zzf();
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF4 = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar2.zzbc(), "_et");
        if (zzhwVarZzF4 != null && zzhwVarZzF4.zzf() > 0) {
            jZzf += zzhwVarZzF4.zzf();
        }
        zzp();
        zzpk.zzC(zzhrVar2, "_et", Long.valueOf(jZzf));
        zzp();
        zzpk.zzC(zzhrVar, "_fr", 1L);
        return true;
    }

    private final boolean zzaJ() {
        zzaW().zzg();
        zzu();
        return zzj().zzP() || !TextUtils.isEmpty(zzj().zzF());
    }

    private static String zzaK(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    private final void zzaL() {
        long jMax;
        long jMax2;
        zzaW().zzg();
        zzu();
        if (this.zza > 0) {
            long jAbs = 3600000 - Math.abs(zzaZ().elapsedRealtime() - this.zza);
            if (jAbs > 0) {
                zzaV().zzk().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                zzk().zzb();
                zzl().zzd();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzH() || !zzaJ()) {
            zzaV().zzk().zza("Nothing to upload or uploading impossible");
            zzk().zzb();
            zzl().zzd();
            return;
        }
        long jCurrentTimeMillis = zzaZ().currentTimeMillis();
        zzd();
        long jMax3 = Math.max(0L, ((Long) zzfy.zzO.zzb(null)).longValue());
        boolean z = true;
        if (!zzj().zzR() && !zzj().zzG()) {
            z = false;
        }
        if (z) {
            String strZzA = zzd().zzA();
            if (TextUtils.isEmpty(strZzA) || ".none.".equals(strZzA)) {
                zzd();
                jMax = Math.max(0L, ((Long) zzfy.zzI.zzb(null)).longValue());
            } else {
                zzd();
                jMax = Math.max(0L, ((Long) zzfy.zzJ.zzb(null)).longValue());
            }
        } else {
            zzd();
            jMax = Math.max(0L, ((Long) zzfy.zzH.zzb(null)).longValue());
        }
        long jZza = this.zzk.zzd.zza();
        long jZza2 = this.zzk.zze.zza();
        boolean z2 = z;
        long jMax4 = Math.max(zzj().zzM(), zzj().zzO());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = jCurrentTimeMillis - Math.abs(jZza - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jZza2 - jCurrentTimeMillis);
            jMax2 = jAbs2 + jMax3;
            long jMax5 = Math.max(jAbs3, jAbs4);
            if (z2 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            if (!zzp().zzs(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i = 0;
                while (true) {
                    zzd();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzfy.zzQ.zzb(null)).intValue()))) {
                        break;
                    }
                    zzd();
                    jMax2 += Math.max(0L, ((Long) zzfy.zzP.zzb(null)).longValue()) * (1 << i);
                    if (jMax2 > jAbs4) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        if (jMax2 == 0) {
            zzaV().zzk().zza("Next upload time is 0");
            zzk().zzb();
            zzl().zzd();
            return;
        }
        if (!zzi().zzb()) {
            zzaV().zzk().zza("No network");
            zzk().zza();
            zzl().zzd();
            return;
        }
        long jZza3 = this.zzk.zzc.zza();
        zzd();
        long jMax6 = Math.max(0L, ((Long) zzfy.zzF.zzb(null)).longValue());
        if (!zzp().zzs(jZza3, jMax6)) {
            jMax2 = Math.max(jMax2, jZza3 + jMax6);
        }
        zzk().zzb();
        long jCurrentTimeMillis2 = jMax2 - zzaZ().currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            zzd();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) zzfy.zzK.zzb(null)).longValue());
            this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
        }
        zzaV().zzk().zzb("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
        zzl().zzc(jCurrentTimeMillis2);
    }

    private final void zzaM() {
        zzaW().zzg();
        if (this.zzu || this.zzv || this.zzw) {
            zzaV().zzk().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
            return;
        }
        zzaV().zzk().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    private final Boolean zzaN(zzh zzhVar) {
        try {
            if (zzhVar.zzt() != -2147483648L) {
                if (zzhVar.zzt() == Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(zzhVar.zzc(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(zzhVar.zzc(), 0).versionName;
                String strZzr = zzhVar.zzr();
                if (strZzr != null && strZzr.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final zzr zzaO(String str) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu == null || TextUtils.isEmpty(zzhVarZzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean boolZzaN = zzaN(zzhVarZzu);
        if (boolZzaN == null || boolZzaN.booleanValue()) {
            return new zzr(str, zzhVarZzu.zzf(), zzhVarZzu.zzr(), zzhVarZzu.zzt(), zzhVarZzu.zzv(), zzhVarZzu.zzx(), zzhVarZzu.zzz(), (String) null, zzhVarZzu.zzD(), false, zzhVarZzu.zzl(), 0L, 0, zzhVarZzu.zzac(), false, zzhVarZzu.zzae(), zzhVarZzu.zzB(), zzhVarZzu.zzag(), zzB(str).zzl(), "", (String) null, zzhVarZzu.zzai(), zzhVarZzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzhVarZzu.zzao(), zzhVarZzu.zzaw(), zzhVarZzu.zzay(), zzhVarZzu.zzaH(), 0L, zzhVarZzu.zzaL());
        }
        zzaV().zzb().zzb("App version does not match; dropping. appId", zzgu.zzl(str));
        return null;
    }

    private final boolean zzaP(String str, String str2) {
        zzbc zzbcVarZzf = zzj().zzf(str, str2);
        return zzbcVarZzf == null || zzbcVarZzf.zzc < 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzaQ(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    private static final boolean zzaR(zzr zzrVar) {
        return !TextUtils.isEmpty(zzrVar.zzb);
    }

    private static final zzos zzaS(zzos zzosVar) {
        if (zzosVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzosVar.zzav()) {
            return zzosVar;
        }
        String strValueOf = String.valueOf(zzosVar.getClass());
        String.valueOf(strValueOf);
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(strValueOf)));
    }

    private static final Boolean zzaT(zzr zzrVar) {
        Boolean bool = zzrVar.zzp;
        String str = zzrVar.zzC;
        if (!TextUtils.isEmpty(str)) {
            zzji zzjiVarZza = zze.zzc(str).zza();
            zzji zzjiVar = zzji.UNINITIALIZED;
            int iOrdinal = zzjiVarZza.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal == 3) {
                return false;
            }
        }
        return bool;
    }

    final void zzA(String str, zzjl zzjlVar) {
        zzaW().zzg();
        zzu();
        this.zzC.put(str, zzjlVar);
        zzj().zzZ(str, zzjlVar);
    }

    final zzjl zzB(String str) {
        zzjl zzjlVar = zzjl.zza;
        zzaW().zzg();
        zzu();
        zzjl zzjlVarZzX = (zzjl) this.zzC.get(str);
        if (zzjlVarZzX == null) {
            zzjlVarZzX = zzj().zzX(str);
            if (zzjlVarZzX == null) {
                zzjlVarZzX = zzjl.zza;
            }
            zzA(str, zzjlVarZzX);
        }
        return zzjlVarZzX;
    }

    final long zzC() {
        long jCurrentTimeMillis = zzaZ().currentTimeMillis();
        zznn zznnVar = this.zzk;
        zznnVar.zzaw();
        zznnVar.zzg();
        zzhe zzheVar = zznnVar.zzf;
        long jZza = zzheVar.zza();
        if (jZza == 0) {
            jZza = ((long) zznnVar.zzu.zzk().zzf().nextInt(86400000)) + 1;
            zzheVar.zzb(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    final void zzD(zzbg zzbgVar, String str) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu == null || TextUtils.isEmpty(zzhVarZzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzaN = zzaN(zzhVarZzu);
        if (boolZzaN == null) {
            if (!"_ui".equals(zzbgVar.zza)) {
                zzaV().zze().zzb("Could not find package. appId", zzgu.zzl(str));
            }
        } else if (!boolZzaN.booleanValue()) {
            zzaV().zzb().zzb("App version does not match; dropping event. appId", zzgu.zzl(str));
            return;
        }
        zzE(zzbgVar, new zzr(str, zzhVarZzu.zzf(), zzhVarZzu.zzr(), zzhVarZzu.zzt(), zzhVarZzu.zzv(), zzhVarZzu.zzx(), zzhVarZzu.zzz(), (String) null, zzhVarZzu.zzD(), false, zzhVarZzu.zzl(), 0L, 0, zzhVarZzu.zzac(), false, zzhVarZzu.zzae(), zzhVarZzu.zzB(), zzhVarZzu.zzag(), zzB(str).zzl(), "", (String) null, zzhVarZzu.zzai(), zzhVarZzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzhVarZzu.zzao(), zzhVarZzu.zzaw(), zzhVarZzu.zzay(), zzhVarZzu.zzaH(), 0L, zzhVarZzu.zzaL()));
    }

    final void zzE(zzbg zzbgVar, zzr zzrVar) {
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzgv zzgvVarZza = zzgv.zza(zzbgVar);
        zzt().zzI(zzgvVarZza.zzd, zzj().zzU(str));
        zzt().zzG(zzgvVarZza, zzd().zzd(str));
        zzbg zzbgVarZzb = zzgvVarZza.zzb();
        if (!zzd().zzp(null, zzfy.zzbf) && Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzbgVarZzb.zza)) {
            zzbe zzbeVar = zzbgVarZzb.zzb;
            if ("referrer API v2".equals(zzbeVar.zzd("_cis"))) {
                String strZzd = zzbeVar.zzd("gclid");
                if (!TextUtils.isEmpty(strZzd)) {
                    zzac(new zzpl("_lgclid", zzbgVarZzb.zzd, strZzd, DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzrVar);
                }
            }
        }
        zzF(zzbgVarZzb, zzrVar);
    }

    final void zzF(zzbg zzbgVar, zzr zzrVar) {
        zzbg zzbgVar2;
        List<zzah> listZzt;
        List<zzah> listZzt2;
        List<zzah> listZzt3;
        String str;
        Preconditions.checkNotNull(zzrVar);
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        zzaW().zzg();
        zzu();
        long j = zzbgVar.zzd;
        zzgv zzgvVarZza = zzgv.zza(zzbgVar);
        zzaW().zzg();
        zzpp.zzav((this.zzG == null || (str = this.zzH) == null || !str.equals(str2)) ? null : this.zzG, zzgvVarZza.zzd, false);
        zzbg zzbgVarZzb = zzgvVarZza.zzb();
        zzp();
        if (zzpk.zzD(zzbgVarZzb, zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            List list = zzrVar.zzr;
            if (list != null) {
                String str3 = zzbgVarZzb.zza;
                if (!list.contains(str3)) {
                    zzaV().zzj().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzbgVarZzb.zza, zzbgVarZzb.zzc);
                    return;
                } else {
                    Bundle bundleZzf = zzbgVarZzb.zzb.zzf();
                    bundleZzf.putLong("ga_safelisted", 1L);
                    zzbgVar2 = new zzbg(str3, new zzbe(bundleZzf), zzbgVarZzb.zzc, zzbgVarZzb.zzd);
                }
            } else {
                zzbgVar2 = zzbgVarZzb;
            }
            zzj().zzb();
            try {
                String str4 = zzbgVar2.zza;
                if ("_s".equals(str4) && !zzj().zzQ(str2, "_s") && zzbgVar2.zzb.zzb("_sid").longValue() != 0) {
                    if (zzj().zzQ(str2, "_f") || zzj().zzQ(str2, "_v")) {
                        zzj().zzW(str2, null, "_sid", zzG(str2, zzbgVar2));
                    } else {
                        zzj().zzW(str2, Long.valueOf(zzaZ().currentTimeMillis() - 15000), "_sid", zzG(str2, zzbgVar2));
                    }
                }
                zzav zzavVarZzj = zzj();
                Preconditions.checkNotEmpty(str2);
                zzavVarZzj.zzg();
                zzavVarZzj.zzaw();
                if (j < 0) {
                    zzavVarZzj.zzu.zzaV().zze().zzc("Invalid time querying timed out conditional properties", zzgu.zzl(str2), Long.valueOf(j));
                    listZzt = Collections.emptyList();
                } else {
                    listZzt = zzavVarZzj.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzah zzahVar : listZzt) {
                    if (zzahVar != null) {
                        zzaV().zzk().zzd("User property timed out", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb), zzahVar.zzc.zza());
                        zzbg zzbgVar3 = zzahVar.zzg;
                        if (zzbgVar3 != null) {
                            zzH(new zzbg(zzbgVar3, j), zzrVar);
                        }
                        zzj().zzr(str2, zzahVar.zzc.zzb);
                    }
                }
                zzav zzavVarZzj2 = zzj();
                Preconditions.checkNotEmpty(str2);
                zzavVarZzj2.zzg();
                zzavVarZzj2.zzaw();
                if (j < 0) {
                    zzavVarZzj2.zzu.zzaV().zze().zzc("Invalid time querying expired conditional properties", zzgu.zzl(str2), Long.valueOf(j));
                    listZzt2 = Collections.emptyList();
                } else {
                    listZzt2 = zzavVarZzj2.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listZzt2.size());
                for (zzah zzahVar2 : listZzt2) {
                    if (zzahVar2 != null) {
                        zzaV().zzk().zzd("User property expired", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                        zzj().zzk(str2, zzahVar2.zzc.zzb);
                        zzbg zzbgVar4 = zzahVar2.zzk;
                        if (zzbgVar4 != null) {
                            arrayList.add(zzbgVar4);
                        }
                        zzj().zzr(str2, zzahVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzH(new zzbg((zzbg) it.next(), j), zzrVar);
                }
                zzav zzavVarZzj3 = zzj();
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str4);
                zzavVarZzj3.zzg();
                zzavVarZzj3.zzaw();
                if (j < 0) {
                    zzic zzicVar = zzavVarZzj3.zzu;
                    zzicVar.zzaV().zze().zzd("Invalid time querying triggered conditional properties", zzgu.zzl(str2), zzicVar.zzl().zza(str4), Long.valueOf(j));
                    listZzt3 = Collections.emptyList();
                } else {
                    listZzt3 = zzavVarZzj3.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listZzt3.size());
                for (zzah zzahVar3 : listZzt3) {
                    if (zzahVar3 != null) {
                        zzpl zzplVar = zzahVar3.zzc;
                        zzpn zzpnVar = new zzpn((String) Preconditions.checkNotNull(zzahVar3.zza), zzahVar3.zzb, zzplVar.zzb, j, Preconditions.checkNotNull(zzplVar.zza()));
                        if (zzj().zzl(zzpnVar)) {
                            zzaV().zzk().zzd("User property triggered", zzahVar3.zza, this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                        } else {
                            zzaV().zzb().zzd("Too many active user properties, ignoring", zzgu.zzl(zzahVar3.zza), this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                        }
                        zzbg zzbgVar5 = zzahVar3.zzi;
                        if (zzbgVar5 != null) {
                            arrayList2.add(zzbgVar5);
                        }
                        zzahVar3.zzc = new zzpl(zzpnVar);
                        zzahVar3.zze = true;
                        zzj().zzp(zzahVar3);
                    }
                }
                zzH(zzbgVar2, zzrVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzH(new zzbg((zzbg) it2.next(), j), zzrVar);
                }
                zzj().zzc();
            } finally {
                zzj().zzd();
            }
        }
    }

    final Bundle zzG(String str, zzbg zzbgVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbgVar.zzb.zzb("_sid").longValue());
        zzpn zzpnVarZzm = zzj().zzm(str, "_sno");
        if (zzpnVarZzm != null) {
            Object obj = zzpnVarZzm.zze;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0387 A[Catch: all -> 0x0bb2, TryCatch #2 {all -> 0x0bb2, blocks: (B:37:0x0157, B:40:0x0166, B:42:0x016e, B:47:0x0178, B:91:0x030d, B:100:0x0344, B:102:0x0387, B:104:0x038e, B:105:0x03a5, B:108:0x03b2, B:110:0x03ca, B:112:0x03d1, B:113:0x03e8, B:116:0x040c, B:120:0x042f, B:121:0x0446, B:122:0x044f, B:125:0x046e, B:127:0x0487, B:129:0x048f, B:131:0x049b, B:133:0x04a1, B:134:0x04a8, B:136:0x04b5, B:138:0x04bd, B:140:0x04c5, B:142:0x04cf, B:143:0x04db, B:144:0x04e8, B:146:0x050d, B:156:0x0531, B:157:0x0546, B:159:0x0572, B:162:0x0589, B:165:0x05c5, B:167:0x05ed, B:169:0x0625, B:170:0x0628, B:172:0x0630, B:173:0x0633, B:175:0x063b, B:176:0x063e, B:178:0x0646, B:179:0x0649, B:181:0x0652, B:182:0x0656, B:184:0x0663, B:185:0x0666, B:187:0x0692, B:189:0x069c, B:193:0x06b3, B:198:0x06c0, B:231:0x0737, B:233:0x073f, B:234:0x0742, B:236:0x0765, B:239:0x0770, B:242:0x0778, B:243:0x0792, B:245:0x0798, B:247:0x07ac, B:249:0x07b8, B:251:0x07c5, B:255:0x07df, B:256:0x07ef, B:260:0x07f8, B:261:0x07fb, B:263:0x0808, B:264:0x080d, B:266:0x082b, B:268:0x082f, B:270:0x083f, B:272:0x084a, B:273:0x0855, B:275:0x085f, B:277:0x086b, B:279:0x0875, B:281:0x087b, B:283:0x088b, B:285:0x089f, B:287:0x08a5, B:288:0x08ae, B:290:0x08bf, B:292:0x08fb, B:294:0x0905, B:295:0x0908, B:297:0x0912, B:299:0x092f, B:300:0x093a, B:302:0x0972, B:304:0x097a, B:306:0x0984, B:307:0x0991, B:309:0x099b, B:310:0x09a8, B:311:0x09b1, B:313:0x09b7, B:315:0x09f3, B:317:0x09fd, B:319:0x0a0f, B:321:0x0a15, B:322:0x0a59, B:323:0x0a64, B:324:0x0a6f, B:326:0x0a75, B:335:0x0ac3, B:336:0x0b0e, B:338:0x0b1f, B:352:0x0b81, B:341:0x0b35, B:343:0x0b39, B:329:0x0a85, B:331:0x0aaf, B:347:0x0b52, B:348:0x0b69, B:351:0x0b6c, B:237:0x076a, B:201:0x06cb, B:205:0x06d7, B:209:0x06e5, B:213:0x06f3, B:217:0x0701, B:221:0x070f, B:225:0x071b, B:229:0x0728, B:166:0x05e1, B:153:0x0519, B:94:0x0321, B:95:0x0328, B:97:0x032e, B:99:0x033e, B:54:0x0195, B:56:0x01a3, B:58:0x01b8, B:64:0x01d8, B:69:0x020e, B:71:0x0214, B:73:0x0222, B:75:0x0237, B:78:0x023e, B:87:0x02cb, B:89:0x02d5, B:80:0x026a, B:81:0x028b, B:86:0x02b2, B:85:0x029f, B:67:0x01e4, B:68:0x0202), top: B:362:0x0157, inners: #0, #1, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x044f A[Catch: all -> 0x0bb2, TRY_LEAVE, TryCatch #2 {all -> 0x0bb2, blocks: (B:37:0x0157, B:40:0x0166, B:42:0x016e, B:47:0x0178, B:91:0x030d, B:100:0x0344, B:102:0x0387, B:104:0x038e, B:105:0x03a5, B:108:0x03b2, B:110:0x03ca, B:112:0x03d1, B:113:0x03e8, B:116:0x040c, B:120:0x042f, B:121:0x0446, B:122:0x044f, B:125:0x046e, B:127:0x0487, B:129:0x048f, B:131:0x049b, B:133:0x04a1, B:134:0x04a8, B:136:0x04b5, B:138:0x04bd, B:140:0x04c5, B:142:0x04cf, B:143:0x04db, B:144:0x04e8, B:146:0x050d, B:156:0x0531, B:157:0x0546, B:159:0x0572, B:162:0x0589, B:165:0x05c5, B:167:0x05ed, B:169:0x0625, B:170:0x0628, B:172:0x0630, B:173:0x0633, B:175:0x063b, B:176:0x063e, B:178:0x0646, B:179:0x0649, B:181:0x0652, B:182:0x0656, B:184:0x0663, B:185:0x0666, B:187:0x0692, B:189:0x069c, B:193:0x06b3, B:198:0x06c0, B:231:0x0737, B:233:0x073f, B:234:0x0742, B:236:0x0765, B:239:0x0770, B:242:0x0778, B:243:0x0792, B:245:0x0798, B:247:0x07ac, B:249:0x07b8, B:251:0x07c5, B:255:0x07df, B:256:0x07ef, B:260:0x07f8, B:261:0x07fb, B:263:0x0808, B:264:0x080d, B:266:0x082b, B:268:0x082f, B:270:0x083f, B:272:0x084a, B:273:0x0855, B:275:0x085f, B:277:0x086b, B:279:0x0875, B:281:0x087b, B:283:0x088b, B:285:0x089f, B:287:0x08a5, B:288:0x08ae, B:290:0x08bf, B:292:0x08fb, B:294:0x0905, B:295:0x0908, B:297:0x0912, B:299:0x092f, B:300:0x093a, B:302:0x0972, B:304:0x097a, B:306:0x0984, B:307:0x0991, B:309:0x099b, B:310:0x09a8, B:311:0x09b1, B:313:0x09b7, B:315:0x09f3, B:317:0x09fd, B:319:0x0a0f, B:321:0x0a15, B:322:0x0a59, B:323:0x0a64, B:324:0x0a6f, B:326:0x0a75, B:335:0x0ac3, B:336:0x0b0e, B:338:0x0b1f, B:352:0x0b81, B:341:0x0b35, B:343:0x0b39, B:329:0x0a85, B:331:0x0aaf, B:347:0x0b52, B:348:0x0b69, B:351:0x0b6c, B:237:0x076a, B:201:0x06cb, B:205:0x06d7, B:209:0x06e5, B:213:0x06f3, B:217:0x0701, B:221:0x070f, B:225:0x071b, B:229:0x0728, B:166:0x05e1, B:153:0x0519, B:94:0x0321, B:95:0x0328, B:97:0x032e, B:99:0x033e, B:54:0x0195, B:56:0x01a3, B:58:0x01b8, B:64:0x01d8, B:69:0x020e, B:71:0x0214, B:73:0x0222, B:75:0x0237, B:78:0x023e, B:87:0x02cb, B:89:0x02d5, B:80:0x026a, B:81:0x028b, B:86:0x02b2, B:85:0x029f, B:67:0x01e4, B:68:0x0202), top: B:362:0x0157, inners: #0, #1, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a3 A[Catch: all -> 0x0bb2, TryCatch #2 {all -> 0x0bb2, blocks: (B:37:0x0157, B:40:0x0166, B:42:0x016e, B:47:0x0178, B:91:0x030d, B:100:0x0344, B:102:0x0387, B:104:0x038e, B:105:0x03a5, B:108:0x03b2, B:110:0x03ca, B:112:0x03d1, B:113:0x03e8, B:116:0x040c, B:120:0x042f, B:121:0x0446, B:122:0x044f, B:125:0x046e, B:127:0x0487, B:129:0x048f, B:131:0x049b, B:133:0x04a1, B:134:0x04a8, B:136:0x04b5, B:138:0x04bd, B:140:0x04c5, B:142:0x04cf, B:143:0x04db, B:144:0x04e8, B:146:0x050d, B:156:0x0531, B:157:0x0546, B:159:0x0572, B:162:0x0589, B:165:0x05c5, B:167:0x05ed, B:169:0x0625, B:170:0x0628, B:172:0x0630, B:173:0x0633, B:175:0x063b, B:176:0x063e, B:178:0x0646, B:179:0x0649, B:181:0x0652, B:182:0x0656, B:184:0x0663, B:185:0x0666, B:187:0x0692, B:189:0x069c, B:193:0x06b3, B:198:0x06c0, B:231:0x0737, B:233:0x073f, B:234:0x0742, B:236:0x0765, B:239:0x0770, B:242:0x0778, B:243:0x0792, B:245:0x0798, B:247:0x07ac, B:249:0x07b8, B:251:0x07c5, B:255:0x07df, B:256:0x07ef, B:260:0x07f8, B:261:0x07fb, B:263:0x0808, B:264:0x080d, B:266:0x082b, B:268:0x082f, B:270:0x083f, B:272:0x084a, B:273:0x0855, B:275:0x085f, B:277:0x086b, B:279:0x0875, B:281:0x087b, B:283:0x088b, B:285:0x089f, B:287:0x08a5, B:288:0x08ae, B:290:0x08bf, B:292:0x08fb, B:294:0x0905, B:295:0x0908, B:297:0x0912, B:299:0x092f, B:300:0x093a, B:302:0x0972, B:304:0x097a, B:306:0x0984, B:307:0x0991, B:309:0x099b, B:310:0x09a8, B:311:0x09b1, B:313:0x09b7, B:315:0x09f3, B:317:0x09fd, B:319:0x0a0f, B:321:0x0a15, B:322:0x0a59, B:323:0x0a64, B:324:0x0a6f, B:326:0x0a75, B:335:0x0ac3, B:336:0x0b0e, B:338:0x0b1f, B:352:0x0b81, B:341:0x0b35, B:343:0x0b39, B:329:0x0a85, B:331:0x0aaf, B:347:0x0b52, B:348:0x0b69, B:351:0x0b6c, B:237:0x076a, B:201:0x06cb, B:205:0x06d7, B:209:0x06e5, B:213:0x06f3, B:217:0x0701, B:221:0x070f, B:225:0x071b, B:229:0x0728, B:166:0x05e1, B:153:0x0519, B:94:0x0321, B:95:0x0328, B:97:0x032e, B:99:0x033e, B:54:0x0195, B:56:0x01a3, B:58:0x01b8, B:64:0x01d8, B:69:0x020e, B:71:0x0214, B:73:0x0222, B:75:0x0237, B:78:0x023e, B:87:0x02cb, B:89:0x02d5, B:80:0x026a, B:81:0x028b, B:86:0x02b2, B:85:0x029f, B:67:0x01e4, B:68:0x0202), top: B:362:0x0157, inners: #0, #1, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0202 A[Catch: all -> 0x0bb2, TryCatch #2 {all -> 0x0bb2, blocks: (B:37:0x0157, B:40:0x0166, B:42:0x016e, B:47:0x0178, B:91:0x030d, B:100:0x0344, B:102:0x0387, B:104:0x038e, B:105:0x03a5, B:108:0x03b2, B:110:0x03ca, B:112:0x03d1, B:113:0x03e8, B:116:0x040c, B:120:0x042f, B:121:0x0446, B:122:0x044f, B:125:0x046e, B:127:0x0487, B:129:0x048f, B:131:0x049b, B:133:0x04a1, B:134:0x04a8, B:136:0x04b5, B:138:0x04bd, B:140:0x04c5, B:142:0x04cf, B:143:0x04db, B:144:0x04e8, B:146:0x050d, B:156:0x0531, B:157:0x0546, B:159:0x0572, B:162:0x0589, B:165:0x05c5, B:167:0x05ed, B:169:0x0625, B:170:0x0628, B:172:0x0630, B:173:0x0633, B:175:0x063b, B:176:0x063e, B:178:0x0646, B:179:0x0649, B:181:0x0652, B:182:0x0656, B:184:0x0663, B:185:0x0666, B:187:0x0692, B:189:0x069c, B:193:0x06b3, B:198:0x06c0, B:231:0x0737, B:233:0x073f, B:234:0x0742, B:236:0x0765, B:239:0x0770, B:242:0x0778, B:243:0x0792, B:245:0x0798, B:247:0x07ac, B:249:0x07b8, B:251:0x07c5, B:255:0x07df, B:256:0x07ef, B:260:0x07f8, B:261:0x07fb, B:263:0x0808, B:264:0x080d, B:266:0x082b, B:268:0x082f, B:270:0x083f, B:272:0x084a, B:273:0x0855, B:275:0x085f, B:277:0x086b, B:279:0x0875, B:281:0x087b, B:283:0x088b, B:285:0x089f, B:287:0x08a5, B:288:0x08ae, B:290:0x08bf, B:292:0x08fb, B:294:0x0905, B:295:0x0908, B:297:0x0912, B:299:0x092f, B:300:0x093a, B:302:0x0972, B:304:0x097a, B:306:0x0984, B:307:0x0991, B:309:0x099b, B:310:0x09a8, B:311:0x09b1, B:313:0x09b7, B:315:0x09f3, B:317:0x09fd, B:319:0x0a0f, B:321:0x0a15, B:322:0x0a59, B:323:0x0a64, B:324:0x0a6f, B:326:0x0a75, B:335:0x0ac3, B:336:0x0b0e, B:338:0x0b1f, B:352:0x0b81, B:341:0x0b35, B:343:0x0b39, B:329:0x0a85, B:331:0x0aaf, B:347:0x0b52, B:348:0x0b69, B:351:0x0b6c, B:237:0x076a, B:201:0x06cb, B:205:0x06d7, B:209:0x06e5, B:213:0x06f3, B:217:0x0701, B:221:0x070f, B:225:0x071b, B:229:0x0728, B:166:0x05e1, B:153:0x0519, B:94:0x0321, B:95:0x0328, B:97:0x032e, B:99:0x033e, B:54:0x0195, B:56:0x01a3, B:58:0x01b8, B:64:0x01d8, B:69:0x020e, B:71:0x0214, B:73:0x0222, B:75:0x0237, B:78:0x023e, B:87:0x02cb, B:89:0x02d5, B:80:0x026a, B:81:0x028b, B:86:0x02b2, B:85:0x029f, B:67:0x01e4, B:68:0x0202), top: B:362:0x0157, inners: #0, #1, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0214 A[Catch: all -> 0x0bb2, TryCatch #2 {all -> 0x0bb2, blocks: (B:37:0x0157, B:40:0x0166, B:42:0x016e, B:47:0x0178, B:91:0x030d, B:100:0x0344, B:102:0x0387, B:104:0x038e, B:105:0x03a5, B:108:0x03b2, B:110:0x03ca, B:112:0x03d1, B:113:0x03e8, B:116:0x040c, B:120:0x042f, B:121:0x0446, B:122:0x044f, B:125:0x046e, B:127:0x0487, B:129:0x048f, B:131:0x049b, B:133:0x04a1, B:134:0x04a8, B:136:0x04b5, B:138:0x04bd, B:140:0x04c5, B:142:0x04cf, B:143:0x04db, B:144:0x04e8, B:146:0x050d, B:156:0x0531, B:157:0x0546, B:159:0x0572, B:162:0x0589, B:165:0x05c5, B:167:0x05ed, B:169:0x0625, B:170:0x0628, B:172:0x0630, B:173:0x0633, B:175:0x063b, B:176:0x063e, B:178:0x0646, B:179:0x0649, B:181:0x0652, B:182:0x0656, B:184:0x0663, B:185:0x0666, B:187:0x0692, B:189:0x069c, B:193:0x06b3, B:198:0x06c0, B:231:0x0737, B:233:0x073f, B:234:0x0742, B:236:0x0765, B:239:0x0770, B:242:0x0778, B:243:0x0792, B:245:0x0798, B:247:0x07ac, B:249:0x07b8, B:251:0x07c5, B:255:0x07df, B:256:0x07ef, B:260:0x07f8, B:261:0x07fb, B:263:0x0808, B:264:0x080d, B:266:0x082b, B:268:0x082f, B:270:0x083f, B:272:0x084a, B:273:0x0855, B:275:0x085f, B:277:0x086b, B:279:0x0875, B:281:0x087b, B:283:0x088b, B:285:0x089f, B:287:0x08a5, B:288:0x08ae, B:290:0x08bf, B:292:0x08fb, B:294:0x0905, B:295:0x0908, B:297:0x0912, B:299:0x092f, B:300:0x093a, B:302:0x0972, B:304:0x097a, B:306:0x0984, B:307:0x0991, B:309:0x099b, B:310:0x09a8, B:311:0x09b1, B:313:0x09b7, B:315:0x09f3, B:317:0x09fd, B:319:0x0a0f, B:321:0x0a15, B:322:0x0a59, B:323:0x0a64, B:324:0x0a6f, B:326:0x0a75, B:335:0x0ac3, B:336:0x0b0e, B:338:0x0b1f, B:352:0x0b81, B:341:0x0b35, B:343:0x0b39, B:329:0x0a85, B:331:0x0aaf, B:347:0x0b52, B:348:0x0b69, B:351:0x0b6c, B:237:0x076a, B:201:0x06cb, B:205:0x06d7, B:209:0x06e5, B:213:0x06f3, B:217:0x0701, B:221:0x070f, B:225:0x071b, B:229:0x0728, B:166:0x05e1, B:153:0x0519, B:94:0x0321, B:95:0x0328, B:97:0x032e, B:99:0x033e, B:54:0x0195, B:56:0x01a3, B:58:0x01b8, B:64:0x01d8, B:69:0x020e, B:71:0x0214, B:73:0x0222, B:75:0x0237, B:78:0x023e, B:87:0x02cb, B:89:0x02d5, B:80:0x026a, B:81:0x028b, B:86:0x02b2, B:85:0x029f, B:67:0x01e4, B:68:0x0202), top: B:362:0x0157, inners: #0, #1, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0321 A[Catch: all -> 0x0bb2, TryCatch #2 {all -> 0x0bb2, blocks: (B:37:0x0157, B:40:0x0166, B:42:0x016e, B:47:0x0178, B:91:0x030d, B:100:0x0344, B:102:0x0387, B:104:0x038e, B:105:0x03a5, B:108:0x03b2, B:110:0x03ca, B:112:0x03d1, B:113:0x03e8, B:116:0x040c, B:120:0x042f, B:121:0x0446, B:122:0x044f, B:125:0x046e, B:127:0x0487, B:129:0x048f, B:131:0x049b, B:133:0x04a1, B:134:0x04a8, B:136:0x04b5, B:138:0x04bd, B:140:0x04c5, B:142:0x04cf, B:143:0x04db, B:144:0x04e8, B:146:0x050d, B:156:0x0531, B:157:0x0546, B:159:0x0572, B:162:0x0589, B:165:0x05c5, B:167:0x05ed, B:169:0x0625, B:170:0x0628, B:172:0x0630, B:173:0x0633, B:175:0x063b, B:176:0x063e, B:178:0x0646, B:179:0x0649, B:181:0x0652, B:182:0x0656, B:184:0x0663, B:185:0x0666, B:187:0x0692, B:189:0x069c, B:193:0x06b3, B:198:0x06c0, B:231:0x0737, B:233:0x073f, B:234:0x0742, B:236:0x0765, B:239:0x0770, B:242:0x0778, B:243:0x0792, B:245:0x0798, B:247:0x07ac, B:249:0x07b8, B:251:0x07c5, B:255:0x07df, B:256:0x07ef, B:260:0x07f8, B:261:0x07fb, B:263:0x0808, B:264:0x080d, B:266:0x082b, B:268:0x082f, B:270:0x083f, B:272:0x084a, B:273:0x0855, B:275:0x085f, B:277:0x086b, B:279:0x0875, B:281:0x087b, B:283:0x088b, B:285:0x089f, B:287:0x08a5, B:288:0x08ae, B:290:0x08bf, B:292:0x08fb, B:294:0x0905, B:295:0x0908, B:297:0x0912, B:299:0x092f, B:300:0x093a, B:302:0x0972, B:304:0x097a, B:306:0x0984, B:307:0x0991, B:309:0x099b, B:310:0x09a8, B:311:0x09b1, B:313:0x09b7, B:315:0x09f3, B:317:0x09fd, B:319:0x0a0f, B:321:0x0a15, B:322:0x0a59, B:323:0x0a64, B:324:0x0a6f, B:326:0x0a75, B:335:0x0ac3, B:336:0x0b0e, B:338:0x0b1f, B:352:0x0b81, B:341:0x0b35, B:343:0x0b39, B:329:0x0a85, B:331:0x0aaf, B:347:0x0b52, B:348:0x0b69, B:351:0x0b6c, B:237:0x076a, B:201:0x06cb, B:205:0x06d7, B:209:0x06e5, B:213:0x06f3, B:217:0x0701, B:221:0x070f, B:225:0x071b, B:229:0x0728, B:166:0x05e1, B:153:0x0519, B:94:0x0321, B:95:0x0328, B:97:0x032e, B:99:0x033e, B:54:0x0195, B:56:0x01a3, B:58:0x01b8, B:64:0x01d8, B:69:0x020e, B:71:0x0214, B:73:0x0222, B:75:0x0237, B:78:0x023e, B:87:0x02cb, B:89:0x02d5, B:80:0x026a, B:81:0x028b, B:86:0x02b2, B:85:0x029f, B:67:0x01e4, B:68:0x0202), top: B:362:0x0157, inners: #0, #1, #6, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzH(com.google.android.gms.measurement.internal.zzbg r50, com.google.android.gms.measurement.internal.zzr r51) {
        /*
            Method dump skipped, instruction units count: 3004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzH(com.google.android.gms.measurement.internal.zzbg, com.google.android.gms.measurement.internal.zzr):void");
    }

    final void zzI(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        com.google.android.gms.internal.measurement.zziu zziuVar;
        zzaW().zzg();
        zzu();
        zzan zzanVarZzd = zzan.zzd(zzicVar.zzaA());
        String strZzc = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        zzjl zzjlVarZzB = zzB(strZzc);
        zzji zzjiVar = zzji.UNINITIALIZED;
        int iOrdinal = zzjlVarZzB.zzp().ordinal();
        if (iOrdinal == 1) {
            zzanVarZzd.zzc(zzjk.AD_STORAGE, zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            zzanVarZzd.zzb(zzjk.AD_STORAGE, zzjlVarZzB.zzb());
        } else {
            zzanVarZzd.zzc(zzjk.AD_STORAGE, zzam.FAILSAFE);
        }
        int iOrdinal2 = zzjlVarZzB.zzq().ordinal();
        if (iOrdinal2 == 1) {
            zzanVarZzd.zzc(zzjk.ANALYTICS_STORAGE, zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            zzanVarZzd.zzb(zzjk.ANALYTICS_STORAGE, zzjlVarZzB.zzb());
        } else {
            zzanVarZzd.zzc(zzjk.ANALYTICS_STORAGE, zzam.FAILSAFE);
        }
        String strZzc2 = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        zzaz zzazVarZzz = zzz(strZzc2, zzx(strZzc2), zzB(strZzc2), zzanVarZzd);
        zzicVar.zzaD(((Boolean) Preconditions.checkNotNull(zzazVarZzz.zzj())).booleanValue());
        if (!TextUtils.isEmpty(zzazVarZzz.zzk())) {
            zzicVar.zzaF(zzazVarZzz.zzk());
        }
        zzaW().zzg();
        zzu();
        Iterator it = zzicVar.zzk().iterator();
        while (true) {
            if (it.hasNext()) {
                zziuVar = (com.google.android.gms.internal.measurement.zziu) it.next();
                if ("_npa".equals(zziuVar.zzc())) {
                    break;
                }
            } else {
                zziuVar = null;
                break;
            }
        }
        if (zziuVar != null) {
            zzjk zzjkVar = zzjk.AD_PERSONALIZATION;
            if (zzanVarZzd.zza(zzjkVar) == zzam.UNSET) {
                zzpn zzpnVarZzm = zzj().zzm(zzhVar.zzc(), "_npa");
                if (zzpnVarZzm != null) {
                    String str = zzpnVarZzm.zzb;
                    if ("tcf".equals(str)) {
                        zzanVarZzd.zzc(zzjkVar, zzam.TCF);
                    } else if ("app".equals(str)) {
                        zzanVarZzd.zzc(zzjkVar, zzam.API);
                    } else {
                        zzanVarZzd.zzc(zzjkVar, zzam.MANIFEST);
                    }
                } else {
                    Boolean boolZzae = zzhVar.zzae();
                    if (boolZzae == null || ((boolZzae.booleanValue() && zziuVar.zzg() != 1) || !(boolZzae.booleanValue() || zziuVar.zzg() == 0))) {
                        zzanVarZzd.zzc(zzjkVar, zzam.API);
                    } else {
                        zzanVarZzd.zzc(zzjkVar, zzam.MANIFEST);
                    }
                }
            }
        } else {
            int iZzaC = zzaC(zzhVar.zzc(), zzanVarZzd);
            com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
            zzitVarZzm.zzb("_npa");
            zzitVarZzm.zza(zzaZ().currentTimeMillis());
            zzitVarZzm.zze(iZzaC);
            zzicVar.zzo((com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbc());
            zzaV().zzk().zzc("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iZzaC));
        }
        zzicVar.zzaB(zzanVarZzd.toString());
        boolean zZzy = this.zzc.zzy(zzhVar.zzc());
        List listZzb = zzicVar.zzb();
        int i = 0;
        for (int i2 = 0; i2 < listZzb.size(); i2++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.zzhs) listZzb.get(i2)).zzd())) {
                com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) ((com.google.android.gms.internal.measurement.zzhs) listZzb.get(i2)).zzcl();
                List listZza = zzhrVar.zza();
                int i3 = 0;
                while (true) {
                    if (i3 >= listZza.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i3)).zzb())) {
                        String strZzd = ((com.google.android.gms.internal.measurement.zzhw) listZza.get(i3)).zzd();
                        if (zZzy && strZzd.length() > 4) {
                            char[] charArray = strZzd.toCharArray();
                            int i4 = 1;
                            while (true) {
                                if (i4 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i4)) {
                                    i = i4;
                                    break;
                                }
                                i4++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i | 1);
                            strZzd = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                        zzhvVarZzn.zzb("_tcfd");
                        zzhvVarZzn.zzd(strZzd);
                        zzhrVar.zze(i3, zzhvVarZzn);
                    } else {
                        i3++;
                    }
                }
                zzicVar.zzf(i2, zzhrVar);
                return;
            }
        }
    }

    final void zzJ(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        zzaW().zzg();
        zzu();
        com.google.android.gms.internal.measurement.zzgx zzgxVarZzr = com.google.android.gms.internal.measurement.zzha.zzr();
        byte[] bArrZzaJ = zzhVar.zzaJ();
        if (bArrZzaJ != null) {
            try {
                zzgxVarZzr = (com.google.android.gms.internal.measurement.zzgx) zzpk.zzw(zzgxVarZzr, bArrZzaJ);
            } catch (com.google.android.gms.internal.measurement.zzmr unused) {
                zzaV().zze().zzb("Failed to parse locally stored ad campaign info. appId", zzgu.zzl(zzhVar.zzc()));
            }
        }
        for (com.google.android.gms.internal.measurement.zzhs zzhsVar : zzicVar.zzb()) {
            if (zzhsVar.zzd().equals(Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN)) {
                String str = (String) zzpk.zzJ(zzhsVar, "gclid", "");
                String str2 = (String) zzpk.zzJ(zzhsVar, "gbraid", "");
                String str3 = (String) zzpk.zzJ(zzhsVar, "gad_source", "");
                String[] strArrSplit = ((String) zzfy.zzbg.zzb(null)).split(",");
                zzp();
                if (!zzpk.zzG(zzhsVar, strArrSplit).isEmpty()) {
                    long jLongValue = ((Long) zzpk.zzJ(zzhsVar, "click_timestamp", 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = zzhsVar.zzf();
                    }
                    if ("referrer API v2".equals(zzpk.zzI(zzhsVar, "_cis"))) {
                        if (jLongValue > zzgxVarZzr.zzo()) {
                            if (str.isEmpty()) {
                                zzgxVarZzr.zzj();
                            } else {
                                zzgxVarZzr.zzi(str);
                            }
                            if (str2.isEmpty()) {
                                zzgxVarZzr.zzl();
                            } else {
                                zzgxVarZzr.zzk(str2);
                            }
                            if (str3.isEmpty()) {
                                zzgxVarZzr.zzn();
                            } else {
                                zzgxVarZzr.zzm(str3);
                            }
                            zzgxVarZzr.zzp(jLongValue);
                            zzgxVarZzr.zzs();
                            zzgxVarZzr.zzt(zzaD(zzhsVar));
                        }
                    } else if (jLongValue > zzgxVarZzr.zzg()) {
                        if (str.isEmpty()) {
                            zzgxVarZzr.zzb();
                        } else {
                            zzgxVarZzr.zza(str);
                        }
                        if (str2.isEmpty()) {
                            zzgxVarZzr.zzd();
                        } else {
                            zzgxVarZzr.zzc(str2);
                        }
                        if (str3.isEmpty()) {
                            zzgxVarZzr.zzf();
                        } else {
                            zzgxVarZzr.zze(str3);
                        }
                        zzgxVarZzr.zzh(jLongValue);
                        zzgxVarZzr.zzq();
                        zzgxVarZzr.zzr(zzaD(zzhsVar));
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.zzha) zzgxVarZzr.zzbc()).equals(com.google.android.gms.internal.measurement.zzha.zzs())) {
            zzicVar.zzaM((com.google.android.gms.internal.measurement.zzha) zzgxVarZzr.zzbc());
        }
        zzhVar.zzaI(((com.google.android.gms.internal.measurement.zzha) zzgxVarZzr.zzbc()).zzcc());
        if (zzhVar.zza()) {
            zzj().zzv(zzhVar, false, false);
        }
        if (zzd().zzp(null, zzfy.zzbf)) {
            zzj().zzk(zzhVar.zzc(), "_lgclid");
        }
    }

    final String zzK(zzjl zzjlVar) {
        if (!zzjlVar.zzo(zzjk.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzt().zzf().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final void zzL(List list) {
        Preconditions.checkArgument(!list.isEmpty());
        if (this.zzz != null) {
            zzaV().zzb().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108 A[Catch: all -> 0x01b9, DONT_GENERATE, PHI: r5 r7
  0x0108: PHI (r5v10 long) = (r5v6 long), (r5v11 long), (r5v6 long) binds: [B:43:0x0125, B:37:0x0110, B:33:0x0106] A[DONT_GENERATE, DONT_INLINE]
  0x0108: PHI (r7v13 ??) = (r7v22 ??), (r7v23 ??), (r7v24 ??) binds: [B:43:0x0125, B:37:0x0110, B:33:0x0106] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x01b9, blocks: (B:3:0x000e, B:5:0x001d, B:6:0x002c, B:8:0x0032, B:9:0x0041, B:11:0x0049, B:12:0x004e, B:14:0x0059, B:15:0x0068, B:17:0x0072, B:18:0x0084, B:20:0x00a3, B:22:0x00a9, B:23:0x00ac, B:25:0x00c5, B:26:0x00dc, B:28:0x00ec, B:30:0x00f2, B:34:0x0108, B:45:0x0128, B:47:0x012d, B:48:0x0130, B:49:0x0131, B:50:0x0136, B:56:0x0173, B:70:0x0198, B:72:0x019e, B:74:0x01a8, B:80:0x01b5, B:81:0x01b8, B:31:0x00f6, B:36:0x010c, B:42:0x0116), top: B:92:0x000e, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0173 A[Catch: all -> 0x01b9, PHI: r1 r3 r7
  0x0173: PHI (r1v20 ??) = (r1v41 ??), (r1v42 ??), (r1v43 ??) binds: [B:59:0x017b, B:55:0x0171, B:68:0x0195] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r3v5 ??) = (r3v19 ??), (r3v20 ??), (r3v21 ??) binds: [B:59:0x017b, B:55:0x0171, B:68:0x0195] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r7v2 ??) = (r7v33 ??), (r7v17 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r7v34 ??) binds: [B:59:0x017b, B:55:0x0171, B:68:0x0195] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x01b9, blocks: (B:3:0x000e, B:5:0x001d, B:6:0x002c, B:8:0x0032, B:9:0x0041, B:11:0x0049, B:12:0x004e, B:14:0x0059, B:15:0x0068, B:17:0x0072, B:18:0x0084, B:20:0x00a3, B:22:0x00a9, B:23:0x00ac, B:25:0x00c5, B:26:0x00dc, B:28:0x00ec, B:30:0x00f2, B:34:0x0108, B:45:0x0128, B:47:0x012d, B:48:0x0130, B:49:0x0131, B:50:0x0136, B:56:0x0173, B:70:0x0198, B:72:0x019e, B:74:0x01a8, B:80:0x01b5, B:81:0x01b8, B:31:0x00f6, B:36:0x010c, B:42:0x0116), top: B:92:0x000e, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019e A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:3:0x000e, B:5:0x001d, B:6:0x002c, B:8:0x0032, B:9:0x0041, B:11:0x0049, B:12:0x004e, B:14:0x0059, B:15:0x0068, B:17:0x0072, B:18:0x0084, B:20:0x00a3, B:22:0x00a9, B:23:0x00ac, B:25:0x00c5, B:26:0x00dc, B:28:0x00ec, B:30:0x00f2, B:34:0x0108, B:45:0x0128, B:47:0x012d, B:48:0x0130, B:49:0x0131, B:50:0x0136, B:56:0x0173, B:70:0x0198, B:72:0x019e, B:74:0x01a8, B:80:0x01b5, B:81:0x01b8, B:31:0x00f6, B:36:0x010c, B:42:0x0116), top: B:92:0x000e, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.google.android.gms.measurement.internal.zzav] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.measurement.internal.zzav, com.google.android.gms.measurement.internal.zzje, com.google.android.gms.measurement.internal.zzos] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.google.android.gms.measurement.internal.zzje] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x01ab -> B:93:0x01ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzM() {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzM():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x071a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:451:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:453:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:454:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fb  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.measurement.internal.zzpg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzN(java.lang.String r32, long r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzN(java.lang.String, long):void");
    }

    final boolean zzO(String str, String str2) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null && zzt().zzaa(str, zzhVarZzu.zzay())) {
            this.zzF.remove(str2);
            return true;
        }
        zzpe zzpeVar = (zzpe) this.zzF.get(str2);
        if (zzpeVar == null) {
            return true;
        }
        return zzpeVar.zzb();
    }

    final void zzP(String str) {
        com.google.android.gms.internal.measurement.zzib zzibVarZzd;
        zzaW().zzg();
        zzu();
        this.zzw = true;
        try {
            zzic zzicVar = this.zzn;
            zzicVar.zzaU();
            Boolean boolZzJ = zzicVar.zzt().zzJ();
            if (boolZzJ == null) {
                zzaV().zze().zza("Upload data called on the client side before use of service was decided");
            } else if (boolZzJ.booleanValue()) {
                zzaV().zzb().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaL();
            } else if (!zzi().zzb()) {
                zzaV().zzk().zza("Network not connected, ignoring upload request");
                zzaL();
            } else if (zzj().zzD(str)) {
                zzav zzavVarZzj = zzj();
                Preconditions.checkNotEmpty(str);
                zzavVarZzj.zzg();
                zzavVarZzj.zzaw();
                List listZzC = zzavVarZzj.zzC(str, zzoo.zza(zzls.GOOGLE_SIGNAL), 1);
                zzpj zzpjVar = listZzC.isEmpty() ? null : (zzpj) listZzC.get(0);
                if (zzpjVar != null && (zzibVarZzd = zzpjVar.zzd()) != null) {
                    zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, type, url", str, zzpjVar.zzf(), zzpjVar.zze());
                    byte[] bArrZzcc = zzibVarZzd.zzcc();
                    if (Log.isLoggable(zzaV().zzn(), 2)) {
                        zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrZzcc.length), zzp().zzi(zzibVarZzd));
                    }
                    zzot zzotVarZza = zzpjVar.zza();
                    this.zzv = true;
                    zzi().zzc(str, zzotVarZza, zzibVarZzd, new zzox(this, str, zzpjVar));
                }
            } else {
                zzaV().zzk().zzb("[sgtm] Upload queue has no batches for appId", str);
            }
        } finally {
            this.zzw = false;
            zzaM();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:19:0x005a, B:22:0x0080, B:13:0x001e, B:15:0x0048, B:17:0x0052, B:18:0x0056), top: B:27:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzQ(java.lang.String r4, int r5, java.lang.Throwable r6, byte[] r7, com.google.android.gms.measurement.internal.zzpj r8) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.zzhz r0 = r3.zzaW()
            r0.zzg()
            r3.zzu()
            r0 = 0
            if (r7 != 0) goto L13
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r4 = move-exception
            goto L9b
        L13:
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L1c
            r1 = 204(0xcc, float:2.86E-43)
            if (r5 != r1) goto L5a
            r5 = r1
        L1c:
            if (r6 != 0) goto L5a
            com.google.android.gms.measurement.internal.zzav r6 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            long r7 = r8.zzc()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L10
            r6.zzE(r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgu r6 = r3.zzaV()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgs r6 = r6.zzk()     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r6.zzc(r7, r4, r5)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgz r5 = r3.zzi()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.zzb()     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            com.google.android.gms.measurement.internal.zzav r5 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.zzD(r4)     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            r3.zzP(r4)     // Catch: java.lang.Throwable -> L10
            goto L95
        L56:
            r3.zzaL()     // Catch: java.lang.Throwable -> L10
            goto L95
        L5a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L10
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L10
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L10
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L10
            r2 = 32
            int r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r1.substring(r0, r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgu r1 = r3.zzaV()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzh()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L80
            r6 = r7
        L80:
            r1.zzd(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzav r4 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            long r5 = r8.zzc()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r4.zzK(r5)     // Catch: java.lang.Throwable -> L10
            r3.zzaL()     // Catch: java.lang.Throwable -> L10
        L95:
            r3.zzv = r0
            r3.zzaM()
            return
        L9b:
            r3.zzv = r0
            r3.zzaM()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzQ(java.lang.String, int, java.lang.Throwable, byte[], com.google.android.gms.measurement.internal.zzpj):void");
    }

    final void zzR(String str, boolean z, Long l, Long l2) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null) {
            zzhVarZzu.zzar(z);
            zzhVarZzu.zzat(l);
            zzhVarZzu.zzav(l2);
            if (zzhVarZzu.zza()) {
                zzj().zzv(zzhVarZzu, false, false);
            }
        }
    }

    final void zzS(String str, com.google.android.gms.internal.measurement.zzic zzicVar) {
        int iZzx;
        int iIndexOf;
        Set setZzl = zzh().zzl(str);
        if (setZzl != null) {
            zzicVar.zzaw(setZzl);
        }
        if (zzh().zzp(str)) {
            zzicVar.zzG();
        }
        if (zzh().zzq(str)) {
            String strZzD = zzicVar.zzD();
            if (!TextUtils.isEmpty(strZzD) && (iIndexOf = strZzD.indexOf(".")) != -1) {
                zzicVar.zzE(strZzD.substring(0, iIndexOf));
            }
        }
        if (zzh().zzr(str) && (iZzx = zzpk.zzx(zzicVar, "_id")) != -1) {
            zzicVar.zzr(iZzx);
        }
        if (zzh().zzs(str)) {
            zzicVar.zzan();
        }
        if (zzh().zzt(str)) {
            zzicVar.zzX();
            if (zzB(str).zzo(zzjk.ANALYTICS_STORAGE)) {
                Map map = this.zzE;
                zzpd zzpdVar = (zzpd) map.get(str);
                if (zzpdVar == null || zzpdVar.zzb + zzd().zzl(str, zzfy.zzak) < zzaZ().elapsedRealtime()) {
                    zzpdVar = new zzpd(this, (byte[]) null);
                    map.put(str, zzpdVar);
                }
                zzicVar.zzax(zzpdVar.zza);
            }
        }
        if (zzh().zzu(str)) {
            zzicVar.zzav();
        }
    }

    final void zzT(com.google.android.gms.internal.measurement.zzic zzicVar, zzpc zzpcVar) {
        for (int i = 0; i < zzicVar.zzc(); i++) {
            com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzicVar.zzd(i).zzcl();
            Iterator it = zzhrVar.zza().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.zzhw) it.next()).zzb())) {
                    if (zzpcVar.zza.zzar() >= zzd().zzm(zzpcVar.zza.zzA(), zzfy.zzal)) {
                        int iZzm = zzd().zzm(zzpcVar.zza.zzA(), zzfy.zzay);
                        String strZzaw = null;
                        if (iZzm <= 0) {
                            if (zzd().zzp(zzpcVar.zza.zzA(), zzfy.zzaR)) {
                                strZzaw = zzt().zzaw();
                                com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb("_tu");
                                zzhvVarZzn.zzd(strZzaw);
                                zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn.zzbc());
                            }
                            com.google.android.gms.internal.measurement.zzhv zzhvVarZzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            zzhvVarZzn2.zzb("_tr");
                            zzhvVarZzn2.zzf(1L);
                            zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn2.zzbc());
                            zzoh zzohVarZzf = zzp().zzf(zzpcVar.zza.zzA(), zzicVar, zzhrVar, strZzaw);
                            if (zzohVarZzf != null) {
                                zzaV().zzk().zzc("Generated trigger URI. appId, uri", zzpcVar.zza.zzA(), zzohVarZzf.zza);
                                zzj().zzY(zzpcVar.zza.zzA(), zzohVarZzf);
                                Deque deque = this.zzr;
                                if (!deque.contains(zzpcVar.zza.zzA())) {
                                    deque.add(zzpcVar.zza.zzA());
                                }
                            }
                        } else if (zzj().zzw(zzC(), zzpcVar.zza.zzA(), false, false, false, false, false, false, true).zzg > iZzm) {
                            com.google.android.gms.internal.measurement.zzhv zzhvVarZzn3 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            zzhvVarZzn3.zzb("_tnr");
                            zzhvVarZzn3.zzf(1L);
                            zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn3.zzbc());
                        } else {
                            if (zzd().zzp(zzpcVar.zza.zzA(), zzfy.zzaR)) {
                                strZzaw = zzt().zzaw();
                                com.google.android.gms.internal.measurement.zzhv zzhvVarZzn4 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn4.zzb("_tu");
                                zzhvVarZzn4.zzd(strZzaw);
                                zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn4.zzbc());
                            }
                            com.google.android.gms.internal.measurement.zzhv zzhvVarZzn5 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            zzhvVarZzn5.zzb("_tr");
                            zzhvVarZzn5.zzf(1L);
                            zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn5.zzbc());
                            zzoh zzohVarZzf2 = zzp().zzf(zzpcVar.zza.zzA(), zzicVar, zzhrVar, strZzaw);
                            if (zzohVarZzf2 != null) {
                                zzaV().zzk().zzc("Generated trigger URI. appId, uri", zzpcVar.zza.zzA(), zzohVarZzf2.zza);
                                zzj().zzY(zzpcVar.zza.zzA(), zzohVarZzf2);
                                Deque deque2 = this.zzr;
                                if (!deque2.contains(zzpcVar.zza.zzA())) {
                                    deque2.add(zzpcVar.zza.zzA());
                                }
                            }
                        }
                    }
                    zzicVar.zze(i, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc());
                }
            }
        }
    }

    final void zzU(String str, com.google.android.gms.internal.measurement.zzhv zzhvVar, Bundle bundle, String str2) {
        List listListOf = CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"});
        long jZzf = (zzpp.zzZ(zzhvVar.zza()) || zzpp.zzZ(str)) ? zzd().zzf(str2, true) : zzd().zze(str2, true);
        long jCodePointCount = zzhvVar.zzc().codePointCount(0, zzhvVar.zzc().length());
        zzpp zzppVarZzt = zzt();
        String strZza = zzhvVar.zza();
        zzd();
        String strZzC = zzppVarZzt.zzC(strZza, 40, true);
        if (jCodePointCount <= jZzf || listListOf.contains(zzhvVar.zza())) {
            return;
        }
        if ("_ev".equals(zzhvVar.zza())) {
            bundle.putString("_ev", zzt().zzC(zzhvVar.zzc(), zzd().zzf(str2, true), true));
            return;
        }
        zzaV().zzh().zzc("Param value is too long; discarded. Name, value length", strZzC, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strZzC);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(zzhvVar.zza());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[Catch: all -> 0x0290, TryCatch #0 {all -> 0x0290, blocks: (B:4:0x0015, B:6:0x001a, B:14:0x0033, B:19:0x007f, B:18:0x0070, B:20:0x008b, B:22:0x00a2, B:23:0x00b1, B:25:0x00bf, B:27:0x00df, B:66:0x0216, B:68:0x0229, B:70:0x0233, B:78:0x0253, B:72:0x0239, B:74:0x0243, B:76:0x0249, B:77:0x024d, B:80:0x0257, B:81:0x025e, B:26:0x00d2, B:83:0x0260), top: B:89:0x0015, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[Catch: all -> 0x0290, PHI: r0
  0x008b: PHI (r0v2 int) = (r0v0 int), (r0v37 int) binds: [B:7:0x0026, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0290, blocks: (B:4:0x0015, B:6:0x001a, B:14:0x0033, B:19:0x007f, B:18:0x0070, B:20:0x008b, B:22:0x00a2, B:23:0x00b1, B:25:0x00bf, B:27:0x00df, B:66:0x0216, B:68:0x0229, B:70:0x0233, B:78:0x0253, B:72:0x0239, B:74:0x0243, B:76:0x0249, B:77:0x024d, B:80:0x0257, B:81:0x025e, B:26:0x00d2, B:83:0x0260), top: B:89:0x0015, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf A[Catch: SQLiteException -> 0x025f, all -> 0x0290, TryCatch #2 {SQLiteException -> 0x025f, blocks: (B:22:0x00a2, B:23:0x00b1, B:25:0x00bf, B:27:0x00df, B:66:0x0216, B:68:0x0229, B:70:0x0233, B:78:0x0253, B:72:0x0239, B:74:0x0243, B:76:0x0249, B:77:0x024d, B:80:0x0257, B:81:0x025e, B:26:0x00d2), top: B:91:0x00a2, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2 A[Catch: SQLiteException -> 0x025f, all -> 0x0290, TryCatch #2 {SQLiteException -> 0x025f, blocks: (B:22:0x00a2, B:23:0x00b1, B:25:0x00bf, B:27:0x00df, B:66:0x0216, B:68:0x0229, B:70:0x0233, B:78:0x0253, B:72:0x0239, B:74:0x0243, B:76:0x0249, B:77:0x024d, B:80:0x0257, B:81:0x025e, B:26:0x00d2), top: B:91:0x00a2, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7 A[Catch: all -> 0x0256, TryCatch #1 {all -> 0x0256, blocks: (B:28:0x00e6, B:29:0x00ef, B:31:0x00f7, B:33:0x0111, B:37:0x013c, B:39:0x0146, B:41:0x0154, B:42:0x0159, B:44:0x015f, B:46:0x0176, B:47:0x0198, B:49:0x01b1, B:51:0x01d4, B:52:0x01e5, B:53:0x01e9, B:55:0x01ef, B:56:0x01f6, B:59:0x0203, B:61:0x0207, B:64:0x020e, B:65:0x020f), top: B:90:0x00e6, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f A[Catch: all -> 0x0256, TryCatch #1 {all -> 0x0256, blocks: (B:28:0x00e6, B:29:0x00ef, B:31:0x00f7, B:33:0x0111, B:37:0x013c, B:39:0x0146, B:41:0x0154, B:42:0x0159, B:44:0x015f, B:46:0x0176, B:47:0x0198, B:49:0x01b1, B:51:0x01d4, B:52:0x01e5, B:53:0x01e9, B:55:0x01ef, B:56:0x01f6, B:59:0x0203, B:61:0x0207, B:64:0x020e, B:65:0x020f), top: B:90:0x00e6, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b1 A[Catch: all -> 0x0256, TryCatch #1 {all -> 0x0256, blocks: (B:28:0x00e6, B:29:0x00ef, B:31:0x00f7, B:33:0x0111, B:37:0x013c, B:39:0x0146, B:41:0x0154, B:42:0x0159, B:44:0x015f, B:46:0x0176, B:47:0x0198, B:49:0x01b1, B:51:0x01d4, B:52:0x01e5, B:53:0x01e9, B:55:0x01ef, B:56:0x01f6, B:59:0x0203, B:61:0x0207, B:64:0x020e, B:65:0x020f), top: B:90:0x00e6, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ef A[Catch: all -> 0x0256, TRY_LEAVE, TryCatch #1 {all -> 0x0256, blocks: (B:28:0x00e6, B:29:0x00ef, B:31:0x00f7, B:33:0x0111, B:37:0x013c, B:39:0x0146, B:41:0x0154, B:42:0x0159, B:44:0x015f, B:46:0x0176, B:47:0x0198, B:49:0x01b1, B:51:0x01d4, B:52:0x01e5, B:53:0x01e9, B:55:0x01ef, B:56:0x01f6, B:59:0x0203, B:61:0x0207, B:64:0x020e, B:65:0x020f), top: B:90:0x00e6, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0239 A[Catch: SQLiteException -> 0x025f, all -> 0x0290, TryCatch #2 {SQLiteException -> 0x025f, blocks: (B:22:0x00a2, B:23:0x00b1, B:25:0x00bf, B:27:0x00df, B:66:0x0216, B:68:0x0229, B:70:0x0233, B:78:0x0253, B:72:0x0239, B:74:0x0243, B:76:0x0249, B:77:0x024d, B:80:0x0257, B:81:0x025e, B:26:0x00d2), top: B:91:0x00a2, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024d A[Catch: SQLiteException -> 0x025f, all -> 0x0290, TryCatch #2 {SQLiteException -> 0x025f, blocks: (B:22:0x00a2, B:23:0x00b1, B:25:0x00bf, B:27:0x00df, B:66:0x0216, B:68:0x0229, B:70:0x0233, B:78:0x0253, B:72:0x0239, B:74:0x0243, B:76:0x0249, B:77:0x024d, B:80:0x0257, B:81:0x025e, B:26:0x00d2), top: B:91:0x00a2, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzV(boolean r21, int r22, java.lang.Throwable r23, byte[] r24, java.lang.String r25, java.util.List r26) {
        /*
            Method dump skipped, instruction units count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzV(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    final void zzW(zzh zzhVar) {
        zzaW().zzg();
        if (TextUtils.isEmpty(zzhVar.zzf())) {
            zzX((String) Preconditions.checkNotNull(zzhVar.zzc()), 204, null, null, null);
            return;
        }
        String str = (String) Preconditions.checkNotNull(zzhVar.zzc());
        zzaV().zzk().zzb("Fetching remote configuration", str);
        com.google.android.gms.internal.measurement.zzgl zzglVarZzb = zzh().zzb(str);
        String strZzd = zzh().zzd(str);
        ArrayMap arrayMap = null;
        if (zzglVarZzb != null) {
            if (!TextUtils.isEmpty(strZzd)) {
                ArrayMap arrayMap2 = new ArrayMap();
                arrayMap2.put(HttpHeaders.IF_MODIFIED_SINCE, strZzd);
                arrayMap = arrayMap2;
            }
            String strZze = zzh().zze(str);
            if (!TextUtils.isEmpty(strZze)) {
                if (arrayMap == null) {
                    arrayMap = new ArrayMap();
                }
                arrayMap.put(HttpHeaders.IF_NONE_MATCH, strZze);
            }
        }
        this.zzu = true;
        zzi().zzd(zzhVar, arrayMap, new zzgw() { // from class: com.google.android.gms.measurement.internal.zzpf
            @Override // com.google.android.gms.measurement.internal.zzgw
            public final /* synthetic */ void zza(String str2, int i, Throwable th, byte[] bArr, Map map) {
                this.zza.zzX(str2, i, th, bArr, map);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzX(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzX(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    final void zzY(Runnable runnable) {
        zzaW().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    final void zzZ() {
        zzaW().zzg();
        zzu();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzaa()) {
            FileChannel fileChannel = this.zzy;
            zzaW().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzaV().zzb().zza("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i2 = fileChannel.read(byteBufferAllocate);
                    if (i2 == 4) {
                        byteBufferAllocate.flip();
                        i = byteBufferAllocate.getInt();
                    } else if (i2 != -1) {
                        zzaV().zze().zzb("Unexpected data length. Bytes read", Integer.valueOf(i2));
                    }
                } catch (IOException e) {
                    zzaV().zzb().zzb("Failed to read from channel", e);
                }
            }
            int iZzm = this.zzn.zzv().zzm();
            zzaW().zzg();
            if (i > iZzm) {
                zzaV().zzb().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzm));
                return;
            }
            if (i < iZzm) {
                FileChannel fileChannel2 = this.zzy;
                zzaW().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzaV().zzb().zza("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iZzm);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzaV().zzb().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzaV().zzk().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzm));
                        return;
                    } catch (IOException e2) {
                        zzaV().zzb().zzb("Failed to write to channel", e2);
                    }
                }
                zzaV().zzb().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzm));
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzae zzaU() {
        return this.zzn.zzaU();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzgu zzaV() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzaV();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzhz zzaW() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzaW();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Context zzaY() {
        return this.zzn.zzaY();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Clock zzaZ() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzaZ();
    }

    final boolean zzaa() {
        zzaW().zzg();
        FileLock fileLock = this.zzx;
        if (fileLock != null && fileLock.isValid()) {
            zzaV().zzk().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzu.zzc();
        File filesDir = this.zzn.zzaY().getFilesDir();
        com.google.android.gms.internal.measurement.zzbv.zza();
        int i = com.google.android.gms.internal.measurement.zzca.zzb;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.zzy = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzx = fileLockTryLock;
            if (fileLockTryLock != null) {
                zzaV().zzk().zza("Storage concurrent access okay");
                return true;
            }
            zzaV().zzb().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzaV().zzb().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            zzaV().zzb().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            zzaV().zze().zzb("Storage lock already acquired", e3);
            return false;
        }
    }

    final void zzab(zzr zzrVar) throws PackageManager.NameNotFoundException {
        if (this.zzz != null) {
            ArrayList arrayList = new ArrayList();
            this.zzA = arrayList;
            arrayList.addAll(this.zzz);
        }
        zzav zzavVarZzj = zzj();
        String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        Preconditions.checkNotEmpty(str);
        zzavVarZzj.zzg();
        zzavVarZzj.zzaw();
        try {
            SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseZze.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZze.delete("events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseZze.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZze.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZze.delete("queue", "app_id=?", strArr) + sQLiteDatabaseZze.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZze.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseZze.delete("upload_queue", "app_id=?", strArr);
            com.google.android.gms.internal.measurement.zzpo.zza();
            zzic zzicVar = zzavVarZzj.zzu;
            if (zzicVar.zzc().zzp(null, zzfy.zzbh)) {
                iDelete += sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (iDelete > 0) {
                zzicVar.zzaV().zzk().zzc("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            zzavVarZzj.zzu.zzaV().zzb().zzc("Error resetting analytics data. appId, error", zzgu.zzl(str), e);
        }
        if (zzrVar.zzh) {
            zzah(zzrVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzac(com.google.android.gms.measurement.internal.zzpl r22, com.google.android.gms.measurement.internal.zzr r23) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzac(com.google.android.gms.measurement.internal.zzpl, com.google.android.gms.measurement.internal.zzr):void");
    }

    final void zzad(String str, zzr zzrVar) {
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            Boolean boolZzaT = zzaT(zzrVar);
            if ("_npa".equals(str) && boolZzaT != null) {
                zzaV().zzj().zza("Falling back to manifest metadata value for ad personalization");
                zzac(new zzpl("_npa", zzaZ().currentTimeMillis(), Long.valueOf(true != boolZzaT.booleanValue() ? 0L : 1L), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzrVar);
                return;
            }
            zzgs zzgsVarZzj = zzaV().zzj();
            zzic zzicVar = this.zzn;
            zzgsVarZzj.zzb("Removing user property", zzicVar.zzl().zzc(str));
            zzj().zzb();
            try {
                zzao(zzrVar);
                if ("_id".equals(str)) {
                    zzj().zzk((String) Preconditions.checkNotNull(zzrVar.zza), "_lair");
                }
                zzj().zzk((String) Preconditions.checkNotNull(zzrVar.zza), str);
                zzj().zzc();
                zzaV().zzj().zzb("User property removed", zzicVar.zzl().zzc(str));
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzae() {
        this.zzs++;
    }

    final void zzaf() {
        this.zzt++;
    }

    final zzic zzag() {
        return this.zzn;
    }

    final void zzah(zzr zzrVar) throws PackageManager.NameNotFoundException {
        boolean z;
        zzbc zzbcVarZzf;
        boolean z2;
        String str;
        long j;
        PackageInfo packageInfo;
        String str2;
        ApplicationInfo applicationInfo;
        long j2;
        boolean z3;
        zzaW().zzg();
        zzu();
        Preconditions.checkNotNull(zzrVar);
        String str3 = zzrVar.zza;
        Preconditions.checkNotEmpty(str3);
        if (zzaR(zzrVar)) {
            zzh zzhVarZzu = zzj().zzu(str3);
            if (zzhVarZzu != null && TextUtils.isEmpty(zzhVarZzu.zzf()) && !TextUtils.isEmpty(zzrVar.zzb)) {
                zzhVarZzu.zzI(0L);
                zzj().zzv(zzhVarZzu, false, false);
                zzh().zzh(str3);
            }
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            long jCurrentTimeMillis = zzrVar.zzl;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = zzaZ().currentTimeMillis();
            }
            int i = zzrVar.zzm;
            if (i != 0 && i != 1) {
                zzaV().zze().zzc("Incorrect app type, assuming installed app. appId, appType", zzgu.zzl(str3), Integer.valueOf(i));
                i = 0;
            }
            zzj().zzb();
            try {
                zzpn zzpnVarZzm = zzj().zzm(str3, "_npa");
                Boolean boolZzaT = zzaT(zzrVar);
                if (zzpnVarZzm != null && !DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(zzpnVarZzm.zzb)) {
                    z = true;
                } else if (boolZzaT != null) {
                    z = true;
                    zzpl zzplVar = new zzpl("_npa", jCurrentTimeMillis, Long.valueOf(true != boolZzaT.booleanValue() ? 0L : 1L), DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                    if (zzpnVarZzm == null || !zzpnVarZzm.zze.equals(zzplVar.zzd)) {
                        zzac(zzplVar, zzrVar);
                    }
                } else {
                    z = true;
                    if (zzpnVarZzm != null) {
                        zzad("_npa", zzrVar);
                    }
                }
                if (zzd().zzp(null, zzfy.zzbb)) {
                    zzan(zzrVar, zzrVar.zzD);
                } else {
                    zzan(zzrVar, jCurrentTimeMillis);
                }
                zzao(zzrVar);
                if (i == 0) {
                    zzbcVarZzf = zzj().zzf(str3, "_f");
                    z2 = false;
                } else {
                    zzbcVarZzf = zzj().zzf(str3, "_v");
                    z2 = z;
                }
                if (zzbcVarZzf == null) {
                    long j3 = ((jCurrentTimeMillis / 3600000) + 1) * 3600000;
                    if (z2) {
                        long j4 = jCurrentTimeMillis;
                        zzac(new zzpl("_fvt", j4, Long.valueOf(j3), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzrVar);
                        zzaW().zzg();
                        zzu();
                        Bundle bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (zzrVar.zzo) {
                            bundle.putLong("_dac", 1L);
                        }
                        if (zzd().zzp(null, zzfy.zzbj)) {
                            bundle.putLong("_elt", zzaZ().currentTimeMillis());
                        }
                        zzE(new zzbg("_v", new zzbe(bundle), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, j4), zzrVar);
                    } else {
                        zzac(new zzpl("_fot", jCurrentTimeMillis, Long.valueOf(j3), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzrVar);
                        zzaW().zzg();
                        zzhk zzhkVar = (zzhk) Preconditions.checkNotNull(this.zzm);
                        if (str3 == null || str3.isEmpty()) {
                            str = "_elt";
                            j = jCurrentTimeMillis;
                            zzhkVar.zza.zzaV().zzf().zza("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            zzic zzicVar = zzhkVar.zza;
                            zzicVar.zzaW().zzg();
                            if (zzhkVar.zza()) {
                                str = "_elt";
                                zzhj zzhjVar = new zzhj(zzhkVar, str3);
                                zzicVar.zzaW().zzg();
                                j = jCurrentTimeMillis;
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = zzicVar.zzaY().getPackageManager();
                                if (packageManager == null) {
                                    zzicVar.zzaV().zzf().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                } else {
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        zzicVar.zzaV().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                    } else {
                                        ResolveInfo resolveInfo = listQueryIntentServices.get(0);
                                        if (resolveInfo.serviceInfo != null) {
                                            String str4 = resolveInfo.serviceInfo.packageName;
                                            if (resolveInfo.serviceInfo.name != null && "com.android.vending".equals(str4) && zzhkVar.zza()) {
                                                try {
                                                    zzicVar.zzaV().zzk().zzb("Install Referrer Service is", ConnectionTracker.getInstance().bindService(zzicVar.zzaY(), new Intent(intent), zzhjVar, 1) ? "available" : "not available");
                                                } catch (RuntimeException e) {
                                                    zzhkVar.zza.zzaV().zzb().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                }
                                            } else {
                                                zzicVar.zzaV().zze().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    }
                                }
                            } else {
                                zzicVar.zzaV().zzi().zza("Install Referrer Reporter is not available");
                                str = "_elt";
                                j = jCurrentTimeMillis;
                            }
                        }
                        zzaW().zzg();
                        zzu();
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("_c", 1L);
                        bundle2.putLong("_r", 1L);
                        bundle2.putLong("_uwa", 0L);
                        bundle2.putLong("_pfo", 0L);
                        bundle2.putLong("_sys", 0L);
                        bundle2.putLong("_sysu", 0L);
                        bundle2.putLong("_et", 1L);
                        if (zzrVar.zzo) {
                            bundle2.putLong("_dac", 1L);
                        }
                        String str5 = (String) Preconditions.checkNotNull(zzrVar.zza);
                        zzav zzavVarZzj = zzj();
                        Preconditions.checkNotEmpty(str5);
                        zzavVarZzj.zzg();
                        zzavVarZzj.zzaw();
                        long jZzN = zzavVarZzj.zzN(str5, "first_open_count");
                        zzic zzicVar2 = this.zzn;
                        if (zzicVar2.zzaY().getPackageManager() == null) {
                            zzaV().zzb().zzb("PackageManager is null, first open report might be inaccurate. appId", zzgu.zzl(str5));
                        } else {
                            try {
                                packageInfo = Wrappers.packageManager(zzicVar2.zzaY()).getPackageInfo(str5, 0);
                            } catch (PackageManager.NameNotFoundException e2) {
                                zzaV().zzb().zzc("Package info is null, first open report might be inaccurate. appId", zzgu.zzl(str5), e2);
                                packageInfo = null;
                            }
                            if (packageInfo == null || packageInfo.firstInstallTime == 0) {
                                str2 = "_sysu";
                            } else {
                                str2 = "_sysu";
                                if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                    if (!zzd().zzp(null, zzfy.zzaI)) {
                                        bundle2.putLong("_uwa", 1L);
                                    } else if (jZzN == 0) {
                                        bundle2.putLong("_uwa", 1L);
                                        jZzN = 0;
                                    }
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                zzac(new zzpl("_fi", j, Long.valueOf(true != z3 ? 0L : 1L), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzrVar);
                            }
                            try {
                                applicationInfo = Wrappers.packageManager(this.zzn.zzaY()).getApplicationInfo(str5, 0);
                            } catch (PackageManager.NameNotFoundException e3) {
                                zzaV().zzb().zzc("Application info is null, first open report might be inaccurate. appId", zzgu.zzl(str5), e3);
                                applicationInfo = null;
                            }
                            if (applicationInfo != null) {
                                if ((applicationInfo.flags & 1) != 0) {
                                    j2 = 1;
                                    bundle2.putLong("_sys", 1L);
                                } else {
                                    j2 = 1;
                                }
                                if ((applicationInfo.flags & 128) != 0) {
                                    bundle2.putLong(str2, j2);
                                }
                            }
                        }
                        if (jZzN >= 0) {
                            bundle2.putLong("_pfo", jZzN);
                        }
                        if (zzd().zzp(null, zzfy.zzbj)) {
                            bundle2.putLong(str, zzaZ().currentTimeMillis());
                        }
                        zzE(new zzbg("_f", new zzbe(bundle2), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, j), zzrVar);
                    }
                } else {
                    long j5 = jCurrentTimeMillis;
                    if (zzrVar.zzi) {
                        zzE(new zzbg("_cd", new zzbe(new Bundle()), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, j5), zzrVar);
                    }
                }
                zzj().zzc();
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzai(zzr zzrVar) throws Throwable {
        zzaW().zzg();
        zzu();
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        int i = 0;
        if (zzd().zzp(null, zzfy.zzaz)) {
            long jCurrentTimeMillis = zzaZ().currentTimeMillis();
            int iZzm = zzd().zzm(null, zzfy.zzai);
            zzd();
            long jZzF = jCurrentTimeMillis - zzal.zzF();
            while (i < iZzm && zzaG(null, jZzF)) {
                i++;
            }
        } else {
            zzd();
            long jZzH = zzal.zzH();
            while (i < jZzH && zzaG(str, 0L)) {
                i++;
            }
        }
        if (zzd().zzp(null, zzfy.zzaA)) {
            zzaW().zzg();
            zzav();
        }
        if (this.zzl.zzc(str, com.google.android.gms.internal.measurement.zzin.zzb(zzrVar.zzE))) {
            zzaV().zzk().zzb("[sgtm] Going background, trigger client side upload. appId", str);
            zzN(str, zzaZ().currentTimeMillis());
        }
    }

    final void zzaj(zzah zzahVar) {
        zzr zzrVarZzaO = zzaO((String) Preconditions.checkNotNull(zzahVar.zza));
        if (zzrVarZzaO != null) {
            zzak(zzahVar, zzrVarZzaO);
        }
    }

    final void zzak(zzah zzahVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotEmpty(zzahVar.zza);
        Preconditions.checkNotNull(zzahVar.zzb);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzah zzahVar2 = new zzah(zzahVar);
            boolean z = false;
            zzahVar2.zze = false;
            zzj().zzb();
            try {
                zzah zzahVarZzq = zzj().zzq((String) Preconditions.checkNotNull(zzahVar2.zza), zzahVar2.zzc.zzb);
                if (zzahVarZzq != null && !zzahVarZzq.zzb.equals(zzahVar2.zzb)) {
                    zzaV().zze().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzb, zzahVarZzq.zzb);
                }
                if (zzahVarZzq != null && zzahVarZzq.zze) {
                    zzahVar2.zzb = zzahVarZzq.zzb;
                    zzahVar2.zzd = zzahVarZzq.zzd;
                    zzahVar2.zzh = zzahVarZzq.zzh;
                    zzahVar2.zzf = zzahVarZzq.zzf;
                    zzahVar2.zzi = zzahVarZzq.zzi;
                    zzahVar2.zze = true;
                    zzpl zzplVar = zzahVar2.zzc;
                    zzahVar2.zzc = new zzpl(zzplVar.zzb, zzahVarZzq.zzc.zzc, zzplVar.zza(), zzahVarZzq.zzc.zzf);
                } else if (TextUtils.isEmpty(zzahVar2.zzf)) {
                    zzpl zzplVar2 = zzahVar2.zzc;
                    zzahVar2.zzc = new zzpl(zzplVar2.zzb, zzahVar2.zzd, zzplVar2.zza(), zzahVar2.zzc.zzf);
                    zzahVar2.zze = true;
                    z = true;
                }
                if (zzahVar2.zze) {
                    zzpl zzplVar3 = zzahVar2.zzc;
                    zzpn zzpnVar = new zzpn((String) Preconditions.checkNotNull(zzahVar2.zza), zzahVar2.zzb, zzplVar3.zzb, zzplVar3.zzc, Preconditions.checkNotNull(zzplVar3.zza()));
                    if (zzj().zzl(zzpnVar)) {
                        zzaV().zzj().zzd("User property updated immediately", zzahVar2.zza, this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                    } else {
                        zzaV().zzb().zzd("(2)Too many active user properties, ignoring", zzgu.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                    }
                    if (z && zzahVar2.zzi != null) {
                        zzH(new zzbg(zzahVar2.zzi, zzahVar2.zzd), zzrVar);
                    }
                }
                if (zzj().zzp(zzahVar2)) {
                    zzaV().zzj().zzd("Conditional property added", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                } else {
                    zzaV().zzb().zzd("Too many conditional properties, ignoring", zzgu.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                }
                zzj().zzc();
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzal(zzah zzahVar) {
        zzr zzrVarZzaO = zzaO((String) Preconditions.checkNotNull(zzahVar.zza));
        if (zzrVarZzaO != null) {
            zzam(zzahVar, zzrVarZzaO);
        }
    }

    final void zzam(zzah zzahVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotEmpty(zzahVar.zza);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzj().zzb();
            try {
                zzao(zzrVar);
                String str = (String) Preconditions.checkNotNull(zzahVar.zza);
                zzah zzahVarZzq = zzj().zzq(str, zzahVar.zzc.zzb);
                if (zzahVarZzq != null) {
                    zzaV().zzj().zzc("Removing conditional user property", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                    zzj().zzr(str, zzahVar.zzc.zzb);
                    if (zzahVarZzq.zze) {
                        zzj().zzk(str, zzahVar.zzc.zzb);
                    }
                    zzbg zzbgVar = zzahVar.zzk;
                    if (zzbgVar != null) {
                        zzbe zzbeVar = zzbgVar.zzb;
                        zzH((zzbg) Preconditions.checkNotNull(zzt().zzac(str, ((zzbg) Preconditions.checkNotNull(zzbgVar)).zza, zzbeVar != null ? zzbeVar.zzf() : null, zzahVarZzq.zzb, zzbgVar.zzd, true, true)), zzrVar);
                    }
                } else {
                    zzaV().zze().zzc("Conditional user property doesn't exist", zzgu.zzl(zzahVar.zza), this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                }
                zzj().zzc();
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzan(zzr zzrVar, long j) {
        zzh zzhVarZzu = zzj().zzu((String) Preconditions.checkNotNull(zzrVar.zza));
        if (zzhVarZzu != null && zzt().zzB(zzrVar.zzb, zzhVarZzu.zzf())) {
            zzaV().zze().zzb("New GMP App Id passed in. Removing cached database data. appId", zzgu.zzl(zzhVarZzu.zzc()));
            zzav zzavVarZzj = zzj();
            String strZzc = zzhVarZzu.zzc();
            zzavVarZzj.zzaw();
            zzavVarZzj.zzg();
            Preconditions.checkNotEmpty(strZzc);
            try {
                SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
                String[] strArr = {strZzc};
                int iDelete = sQLiteDatabaseZze.delete("events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZze.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZze.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZze.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseZze.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseZze.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZze.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseZze.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("trigger_uris", "app_id=?", strArr);
                com.google.android.gms.internal.measurement.zzpo.zza();
                zzic zzicVar = zzavVarZzj.zzu;
                if (zzicVar.zzc().zzp(null, zzfy.zzbh)) {
                    iDelete += sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (iDelete > 0) {
                    zzicVar.zzaV().zzk().zzc("Deleted application data. app, records", strZzc, Integer.valueOf(iDelete));
                }
            } catch (SQLiteException e) {
                zzavVarZzj.zzu.zzaV().zzb().zzc("Error deleting application data. appId, error", zzgu.zzl(strZzc), e);
            }
            zzhVarZzu = null;
        }
        if (zzhVarZzu != null) {
            boolean z = (zzhVarZzu.zzt() == -2147483648L || zzhVarZzu.zzt() == zzrVar.zzj) ? false : true;
            String strZzr = zzhVarZzu.zzr();
            if (z || ((zzhVarZzu.zzt() != -2147483648L || strZzr == null || strZzr.equals(zzrVar.zzc)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strZzr);
                zzbg zzbgVar = new zzbg("_au", new zzbe(bundle), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, j);
                if (zzd().zzp(null, zzfy.zzbc)) {
                    zzE(zzbgVar, zzrVar);
                } else {
                    zzF(zzbgVar, zzrVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.google.android.gms.measurement.internal.zzh zzao(com.google.android.gms.measurement.internal.zzr r14) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzao(com.google.android.gms.measurement.internal.zzr):com.google.android.gms.measurement.internal.zzh");
    }

    final String zzap(zzr zzrVar) {
        try {
            return (String) zzaW().zzh(new zzoz(this, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaV().zzb().zzc("Failed to get app instance id. appId", zzgu.zzl(zzrVar.zza), e);
            return null;
        }
    }

    final List zzaq(zzr zzrVar, Bundle bundle) {
        zzaW().zzg();
        zzqp.zza();
        zzal zzalVarZzd = zzd();
        String str = zzrVar.zza;
        if (!zzalVarZzd.zzp(str, zzfy.zzaP) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zzaV().zzb().zza("Uri sources and timestamps do not match");
                } else {
                    for (int i = 0; i < intArray.length; i++) {
                        zzav zzavVarZzj = zzj();
                        int i2 = intArray[i];
                        long j = longArray[i];
                        Preconditions.checkNotEmpty(str);
                        zzavVarZzj.zzg();
                        zzavVarZzj.zzaw();
                        try {
                            int iDelete = zzavVarZzj.zze().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                            zzgs zzgsVarZzk = zzavVarZzj.zzu.zzaV().zzk();
                            StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 46);
                            sb.append("Pruned ");
                            sb.append(iDelete);
                            sb.append(" trigger URIs. appId, source, timestamp");
                            zzgsVarZzk.zzd(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                        } catch (SQLiteException e) {
                            zzavVarZzj.zzu.zzaV().zzb().zzc("Error pruning trigger URIs. appId", zzgu.zzl(str), e);
                        }
                    }
                }
            }
        }
        zzav zzavVarZzj2 = zzj();
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        zzavVarZzj2.zzg();
        zzavVarZzj2.zzaw();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zzavVarZzj2.zze().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzoh(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e2) {
                zzavVarZzj2.zzu.zzaV().zzb().zzc("Error querying trigger uris. appId", zzgu.zzl(str2), e2);
                arrayList = Collections.emptyList();
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    final void zzar(String str, zzaf zzafVar) {
        zzaW().zzg();
        zzu();
        zzav zzavVarZzj = zzj();
        long j = zzafVar.zza;
        zzpj zzpjVarZzB = zzavVarZzj.zzB(j);
        if (zzpjVarZzB == null) {
            zzaV().zze().zzc("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j));
            return;
        }
        String strZze = zzpjVarZzB.zze();
        if (zzafVar.zzb != zzlr.SUCCESS.zza()) {
            if (zzafVar.zzb == zzlr.BACKOFF.zza()) {
                Map map = this.zzF;
                zzpe zzpeVar = (zzpe) map.get(strZze);
                if (zzpeVar == null) {
                    zzpeVar = new zzpe(this);
                    map.put(strZze, zzpeVar);
                } else {
                    zzpeVar.zza();
                }
                zzaV().zzk().zzd("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, strZze, Long.valueOf((zzpeVar.zzc() - zzaZ().currentTimeMillis()) / 1000));
            }
            zzav zzavVarZzj2 = zzj();
            Long lValueOf = Long.valueOf(zzafVar.zza);
            zzavVarZzj2.zzK(lValueOf);
            zzaV().zzk().zzc("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, lValueOf);
            return;
        }
        Map map2 = this.zzF;
        if (map2.containsKey(strZze)) {
            map2.remove(strZze);
        }
        zzav zzavVarZzj3 = zzj();
        Long lValueOf2 = Long.valueOf(j);
        zzavVarZzj3.zzE(lValueOf2);
        zzaV().zzk().zzc("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, lValueOf2);
        long j2 = zzafVar.zzc;
        if (j2 > 0) {
            zzav zzavVarZzj4 = zzj();
            zzavVarZzj4.zzg();
            zzavVarZzj4.zzaw();
            Long lValueOf3 = Long.valueOf(j2);
            Preconditions.checkNotNull(lValueOf3);
            ContentValues contentValues = new ContentValues();
            contentValues.put("upload_type", Integer.valueOf(zzls.GOOGLE_SIGNAL.zza()));
            zzic zzicVar = zzavVarZzj4.zzu;
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzicVar.zzaZ().currentTimeMillis()));
            try {
                if (zzavVarZzj4.zze().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j2), str, String.valueOf(zzls.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                    zzicVar.zzaV().zze().zzc("Google Signal pending batch not updated. appId, rowId", str, lValueOf3);
                }
                zzaV().zzk().zzc("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(zzafVar.zzc));
                zzP(str);
            } catch (SQLiteException e) {
                zzavVarZzj4.zzu.zzaV().zzb().zzd("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j2), e);
                throw e;
            }
        }
    }

    final void zzas(boolean z) {
        zzaL();
    }

    public final void zzat(String str, zzlu zzluVar) {
        zzaW().zzg();
        String str2 = this.zzH;
        if (str2 == null || str2.equals(str) || zzluVar != null) {
            this.zzH = str;
            this.zzG = zzluVar;
        }
    }

    final /* synthetic */ void zzau(zzph zzphVar) {
        zzaW().zzg();
        this.zzm = new zzhk(this);
        zzav zzavVar = new zzav(this);
        zzavVar.zzax();
        this.zze = zzavVar;
        zzd().zza((zzak) Preconditions.checkNotNull(this.zzc));
        zznn zznnVar = new zznn(this);
        zznnVar.zzax();
        this.zzk = zznnVar;
        zzad zzadVar = new zzad(this);
        zzadVar.zzax();
        this.zzh = zzadVar;
        zzlp zzlpVar = new zzlp(this);
        zzlpVar.zzax();
        this.zzj = zzlpVar;
        zzok zzokVar = new zzok(this);
        zzokVar.zzax();
        this.zzg = zzokVar;
        this.zzf = new zzhb(this);
        if (this.zzs != this.zzt) {
            zzaV().zzb().zzc("Not all upload components initialized", Integer.valueOf(this.zzs), Integer.valueOf(this.zzt));
        }
        this.zzo.set(true);
        zzaV().zzk().zza("UploadController is now fully initialized");
    }

    final /* synthetic */ zzic zzax() {
        return this.zzn;
    }

    final /* synthetic */ Deque zzay() {
        return this.zzr;
    }

    final /* synthetic */ void zzaz(long j) {
        this.zzJ = j;
    }

    protected final void zzc() {
        zzaW().zzg();
        zzj().zzI();
        zzav zzavVarZzj = zzj();
        zzavVarZzj.zzg();
        zzavVarZzj.zzaw();
        if (zzavVarZzj.zzag()) {
            zzfx zzfxVar = zzfy.zzav;
            if (((Long) zzfxVar.zzb(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
                zzic zzicVar = zzavVarZzj.zzu;
                int iDelete = sQLiteDatabaseZze.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(zzicVar.zzaZ().currentTimeMillis()), String.valueOf(zzfxVar.zzb(null))});
                if (iDelete > 0) {
                    zzicVar.zzaV().zzk().zzb("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        if (this.zzk.zzd.zza() == 0) {
            this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
        }
        zzaL();
    }

    public final zzal zzd() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzc();
    }

    public final zzou zzf() {
        return this.zzl;
    }

    public final zzht zzh() {
        zzht zzhtVar = this.zzc;
        zzaS(zzhtVar);
        return zzhtVar;
    }

    public final zzgz zzi() {
        zzgz zzgzVar = this.zzd;
        zzaS(zzgzVar);
        return zzgzVar;
    }

    public final zzav zzj() {
        zzav zzavVar = this.zze;
        zzaS(zzavVar);
        return zzavVar;
    }

    public final zzhb zzk() {
        zzhb zzhbVar = this.zzf;
        if (zzhbVar != null) {
            return zzhbVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzok zzl() {
        zzok zzokVar = this.zzg;
        zzaS(zzokVar);
        return zzokVar;
    }

    public final zzad zzm() {
        zzad zzadVar = this.zzh;
        zzaS(zzadVar);
        return zzadVar;
    }

    public final zzlp zzn() {
        zzlp zzlpVar = this.zzj;
        zzaS(zzlpVar);
        return zzlpVar;
    }

    public final zzpk zzp() {
        zzpk zzpkVar = this.zzi;
        zzaS(zzpkVar);
        return zzpkVar;
    }

    public final zznn zzq() {
        return this.zzk;
    }

    public final zzgn zzs() {
        return this.zzn.zzl();
    }

    public final zzpp zzt() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzk();
    }

    final void zzu() {
        if (!this.zzo.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzv(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzjl zzjlVarZzf = zzjl.zzf(zzrVar.zzs, zzrVar.zzx);
        zzB(str);
        zzaV().zzk().zzc("Setting storage consent for package", str, zzjlVarZzf);
        zzA(str, zzjlVarZzf);
    }

    final void zzw(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzaz zzazVarZzg = zzaz.zzg(zzrVar.zzy);
        zzaV().zzk().zzc("Setting DMA consent for package", str, zzazVarZzg);
        zzaW().zzg();
        zzu();
        zzji zzjiVarZzc = zzaz.zzh(zzy(str), 100).zzc();
        this.zzD.put(str, zzazVarZzg);
        zzj().zzab(str, zzazVarZzg);
        zzji zzjiVarZzc2 = zzaz.zzh(zzy(str), 100).zzc();
        zzaW().zzg();
        zzu();
        zzji zzjiVar = zzji.DENIED;
        boolean z = zzjiVarZzc == zzjiVar && zzjiVarZzc2 == zzji.GRANTED;
        boolean z2 = zzjiVarZzc == zzji.GRANTED && zzjiVarZzc2 == zzjiVar;
        if (z || z2) {
            zzaV().zzk().zzb("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (zzj().zzw(zzC(), str, false, false, false, false, false, false, false).zzf < zzd().zzm(str, zzfy.zzam)) {
                bundle.putLong("_r", 1L);
                zzaV().zzk().zzc("_dcu realtime event count", str, Long.valueOf(zzj().zzw(zzC(), str, false, false, false, false, false, true, false).zzf));
            }
            this.zzK.zza(str, "_dcu", bundle);
        }
    }

    final zzaz zzx(String str) {
        zzaW().zzg();
        zzu();
        Map map = this.zzD;
        zzaz zzazVar = (zzaz) map.get(str);
        if (zzazVar != null) {
            return zzazVar;
        }
        zzaz zzazVarZzaa = zzj().zzaa(str);
        map.put(str, zzazVarZzaa);
        return zzazVarZzaa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    final Bundle zzy(String str) {
        zzaW().zzg();
        zzu();
        if (zzh().zzx(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        zzjl zzjlVarZzB = zzB(str);
        bundle.putAll(zzjlVarZzB.zzn());
        bundle.putAll(zzz(str, zzx(str), zzjlVarZzB, new zzan()).zzf());
        zzpn zzpnVarZzm = zzj().zzm(str, "_npa");
        bundle.putString("ad_personalization", 1 != (zzpnVarZzm != null ? zzpnVarZzm.zze.equals(1L) : zzaC(str, new zzan())) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.google.android.gms.measurement.internal.zzaz zzz(java.lang.String r12, com.google.android.gms.measurement.internal.zzaz r13, com.google.android.gms.measurement.internal.zzjl r14, com.google.android.gms.measurement.internal.zzan r15) {
        /*
            r11 = this;
            com.google.android.gms.measurement.internal.zzht r0 = r11.zzh()
            com.google.android.gms.internal.measurement.zzgf r0 = r0.zzx(r12)
            java.lang.String r1 = "-"
            r2 = 90
            r3 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r5 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            if (r0 != 0) goto L37
            com.google.android.gms.measurement.internal.zzji r12 = r13.zzc()
            com.google.android.gms.measurement.internal.zzji r14 = com.google.android.gms.measurement.internal.zzji.DENIED
            if (r12 != r14) goto L2a
            int r2 = r13.zzb()
            com.google.android.gms.measurement.internal.zzjk r12 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            r15.zzb(r12, r2)
            goto L31
        L2a:
            com.google.android.gms.measurement.internal.zzjk r12 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            com.google.android.gms.measurement.internal.zzam r13 = com.google.android.gms.measurement.internal.zzam.FAILSAFE
            r15.zzc(r12, r13)
        L31:
            com.google.android.gms.measurement.internal.zzaz r12 = new com.google.android.gms.measurement.internal.zzaz
            r12.<init>(r4, r2, r6, r1)
            return r12
        L37:
            com.google.android.gms.measurement.internal.zzji r0 = r13.zzc()
            com.google.android.gms.measurement.internal.zzji r7 = com.google.android.gms.measurement.internal.zzji.GRANTED
            if (r0 == r7) goto L88
            com.google.android.gms.measurement.internal.zzji r8 = com.google.android.gms.measurement.internal.zzji.DENIED
            if (r0 != r8) goto L44
            goto L88
        L44:
            com.google.android.gms.measurement.internal.zzji r13 = com.google.android.gms.measurement.internal.zzji.POLICY
            if (r0 != r13) goto L5b
            com.google.android.gms.measurement.internal.zzht r13 = r11.zzc
            com.google.android.gms.measurement.internal.zzjk r0 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            com.google.android.gms.measurement.internal.zzji r13 = r13.zzA(r12, r0)
            com.google.android.gms.measurement.internal.zzji r9 = com.google.android.gms.measurement.internal.zzji.UNINITIALIZED
            if (r13 == r9) goto L5b
            com.google.android.gms.measurement.internal.zzam r14 = com.google.android.gms.measurement.internal.zzam.REMOTE_ENFORCED_DEFAULT
            r15.zzc(r0, r14)
            r0 = r13
            goto L91
        L5b:
            com.google.android.gms.measurement.internal.zzht r13 = r11.zzc
            com.google.android.gms.measurement.internal.zzjk r0 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            com.google.android.gms.measurement.internal.zzjk r9 = r13.zzw(r12, r0)
            com.google.android.gms.measurement.internal.zzji r14 = r14.zzp()
            if (r14 == r7) goto L6b
            if (r14 != r8) goto L6c
        L6b:
            r3 = r5
        L6c:
            com.google.android.gms.measurement.internal.zzjk r10 = com.google.android.gms.measurement.internal.zzjk.AD_STORAGE
            if (r9 != r10) goto L79
            if (r3 == 0) goto L79
            com.google.android.gms.measurement.internal.zzam r13 = com.google.android.gms.measurement.internal.zzam.REMOTE_DELEGATION
            r15.zzc(r0, r13)
            r0 = r14
            goto L91
        L79:
            com.google.android.gms.measurement.internal.zzam r14 = com.google.android.gms.measurement.internal.zzam.REMOTE_DEFAULT
            r15.zzc(r0, r14)
            boolean r13 = r13.zzv(r12, r0)
            if (r5 == r13) goto L86
            r0 = r8
            goto L91
        L86:
            r0 = r7
            goto L91
        L88:
            int r2 = r13.zzb()
            com.google.android.gms.measurement.internal.zzjk r13 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            r15.zzb(r13, r2)
        L91:
            com.google.android.gms.measurement.internal.zzht r13 = r11.zzc
            boolean r13 = r13.zzy(r12)
            com.google.android.gms.measurement.internal.zzht r14 = r11.zzh()
            java.util.SortedSet r12 = r14.zzz(r12)
            com.google.android.gms.measurement.internal.zzji r14 = com.google.android.gms.measurement.internal.zzji.DENIED
            if (r0 == r14) goto Lbc
            boolean r14 = r12.isEmpty()
            if (r14 == 0) goto Laa
            goto Lbc
        Laa:
            com.google.android.gms.measurement.internal.zzaz r14 = new com.google.android.gms.measurement.internal.zzaz
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r13)
            java.lang.String r0 = ""
            if (r13 == 0) goto Lb8
            java.lang.String r0 = android.text.TextUtils.join(r0, r12)
        Lb8:
            r14.<init>(r6, r2, r15, r0)
            return r14
        Lbc:
            com.google.android.gms.measurement.internal.zzaz r12 = new com.google.android.gms.measurement.internal.zzaz
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12.<init>(r4, r2, r13, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzz(java.lang.String, com.google.android.gms.measurement.internal.zzaz, com.google.android.gms.measurement.internal.zzjl, com.google.android.gms.measurement.internal.zzan):com.google.android.gms.measurement.internal.zzaz");
    }
}
