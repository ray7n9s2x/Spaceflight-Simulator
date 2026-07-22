package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.apk.C0016;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.joke.plugin.gson.C0073;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0329a5 extends AbstractC0378i implements Serializable {
    static {
        new C0329a5();
    }

    @Override // com.zfork.multiplatforms.android.bomb.G3
    public final FileVisitResult a(Path path) {
        if (C0073.m6437(path)) {
            return C0024.m2047(this);
        }
        return C0016.m642(this);
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return C0073.m6437(C0027.m2458(file));
    }
}
