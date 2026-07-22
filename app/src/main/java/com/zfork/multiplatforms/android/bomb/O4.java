package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0071;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.SimpleFileVisitor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class O4 extends SimpleFileVisitor implements FileVisitor {
    public final N4 a = new N4(this);

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return C0068.m5631(C0066.m4875(C0071.m6003(this), C0039.m4113(obj), iOException));
    }
}
