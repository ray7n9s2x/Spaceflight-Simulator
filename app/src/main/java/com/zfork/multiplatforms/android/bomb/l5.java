package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.bind.util.C0067;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class l5 implements InterfaceC0464w2, Serializable {
    public static final String a = C0039.m4168(C0018.m1065());
    public static final l5 b = new l5();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return true;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return true;
    }

    public final String toString() {
        return C0067.m5466();
    }

    @Override // com.zfork.multiplatforms.android.bomb.G3
    public final FileVisitResult a(Path path) {
        return C0030.m2964();
    }

    @Override // java.nio.file.PathMatcher
    public final boolean matches(Path path) {
        if (C0064.m4547(this, path) != C0035.m3514()) {
            return true;
        }
        return false;
    }
}
