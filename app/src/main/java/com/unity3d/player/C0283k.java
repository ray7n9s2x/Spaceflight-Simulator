package com.unity3d.player;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Collections;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: renamed from: com.unity3d.player.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0283k implements OnCompleteListener {
    private IAssetPackManagerDownloadStatusCallback a;
    private UnityPlayer b;
    private String[] c;

    public C0283k(UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, String[] strArr) {
        this.b = unityPlayer;
        this.a = iAssetPackManagerDownloadStatusCallback;
        this.c = strArr;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int errorCode;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map mapPackStates = assetPackStates.packStates();
            if (mapPackStates.size() == 0) {
                return;
            }
            Vector vector = new Vector();
            for (AssetPackState assetPackState : mapPackStates.values()) {
                if (assetPackState.errorCode() != 0 || assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                    String strName = assetPackState.name();
                    int iStatus = assetPackState.status();
                    int iErrorCode = assetPackState.errorCode();
                    long j = assetPackStates.totalBytes();
                    this.b.invokeOnMainThread(new RunnableC0271g(Collections.singleton(this.a), strName, iStatus, j, iStatus == 4 ? j : 0L, 0, iErrorCode));
                } else {
                    vector.add(assetPackState.name());
                }
            }
            if (vector.size() > 0) {
                C0292n c0292n = C0292n.e;
                UnityPlayer unityPlayer = this.b;
                IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback = this.a;
                c0292n.getClass();
                synchronized (C0292n.e) {
                    Object obj = c0292n.d;
                    if (obj == null) {
                        C0274h c0274h = new C0274h(c0292n, unityPlayer, iAssetPackManagerDownloadStatusCallback);
                        c0292n.b.registerListener(c0274h);
                        c0292n.d = c0274h;
                    } else {
                        ((C0274h) obj).a(iAssetPackManagerDownloadStatusCallback);
                    }
                    c0292n.c.addAll(vector);
                    c0292n.b.fetch(vector);
                }
            }
        } catch (RuntimeExecutionException e) {
            e = e;
            String[] strArr = this.c;
            if (strArr.length != 1) {
                C0292n c0292n2 = C0292n.e;
                IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback2 = this.a;
                c0292n2.getClass();
                for (String str : strArr) {
                    c0292n2.b.getPackStates(Collections.singletonList(str)).addOnCompleteListener(new C0283k(c0292n2.a, iAssetPackManagerDownloadStatusCallback2, new String[]{str}));
                }
                return;
            }
            String str2 = strArr[0];
            while (true) {
                if (e instanceof AssetPackException) {
                    errorCode = e.getErrorCode();
                    break;
                }
                e = e.getCause();
                if (e == null) {
                    errorCode = -100;
                    break;
                }
            }
            this.b.invokeOnMainThread(new RunnableC0271g(Collections.singleton(this.a), str2, 0, 0L, 0L, 0, errorCode));
        }
    }
}
