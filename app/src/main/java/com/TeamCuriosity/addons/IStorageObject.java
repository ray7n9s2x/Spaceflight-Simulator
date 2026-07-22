package com.teamcuriosity.addons;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public interface IStorageObject {
    void delete() throws Exception;

    boolean exists();

    Uri getDocUri();

    String getLocation();

    String getName();

    String getPath();

    boolean isDirectory();

    /* JADX INFO: renamed from: com.teamcuriosity.addons.IStorageObject$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isDirectory(IStorageObject _this) {
            return _this instanceof StorageFolder;
        }
    }
}
