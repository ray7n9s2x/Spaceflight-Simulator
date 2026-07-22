package com.android.apksig.util;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0451u1;
import com.zfork.multiplatforms.android.bomb.R1;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Phaser;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public interface RunnablesExecutor {
    public static final RunnablesExecutor SINGLE_THREADED = new C0451u1(4);
    public static final RunnablesExecutor MULTI_THREADED = new RunnablesExecutor() { // from class: com.android.apksig.util.RunnablesExecutor.1
        public final int a = C0032.m3151(32, C0070.m5861(C0064.m4506()));

        /* JADX INFO: renamed from: ۡ۟ۢۦ, reason: not valid java name and contains not printable characters */
        public static int m2970(Object obj) {
            if (C0039.m4109() >= 0) {
                return ((AnonymousClass1) obj).a;
            }
            return 0;
        }

        @Override // com.android.apksig.util.RunnablesExecutor
        public void execute(RunnablesProvider runnablesProvider) {
            TimeUnit timeUnitM13080 = C0111.m13080();
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(4);
            ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
            int iM2970 = m2970(this);
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iM2970, iM2970, 0L, timeUnitM13080, arrayBlockingQueue, callerRunsPolicy);
            Phaser phaser = new Phaser(1);
            for (int i = 0; i < m2970(this); i++) {
                R1 r1 = new R1(runnablesProvider, phaser, 2);
                C0022.m1700(phaser);
                C0034.m3490(threadPoolExecutor, r1);
            }
            C0038.m3993(phaser);
            C0078.m7415(threadPoolExecutor);
        }
    };

    void execute(RunnablesProvider runnablesProvider);
}
