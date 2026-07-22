package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class Camera2Wrapper implements com.unity3d.player.a.b {
    private Context a;
    private C0315w b = null;

    public Camera2Wrapper(Context context) {
        this.a = context;
        initCamera2Jni();
    }

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    public final void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }

    public final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3) {
        nativeFrameReady(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3);
    }

    protected void closeCamera2() {
        C0315w c0315w = this.b;
        if (c0315w != null) {
            c0315w.a();
        }
        this.b = null;
    }

    protected int getCamera2Count() {
        return C0315w.getCameraIds(this.a).length;
    }

    protected int getCamera2FocalLengthEquivalent(int i) {
        return C0315w.a(this.a, i);
    }

    protected int[] getCamera2Resolutions(int i) {
        return C0315w.b(this.a, i);
    }

    protected int getCamera2SensorOrientation(int i) {
        return C0315w.c(this.a, i);
    }

    protected Rect getFrameSizeCamera2() {
        C0315w c0315w = this.b;
        return c0315w != null ? c0315w.c() : new Rect();
    }

    protected boolean initializeCamera2(int i, int i2, int i3, int i4, int i5, Surface surface) {
        if (this.b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        int i6 = C0315w.E;
        C0315w c0321z = PlatformSupport.QUINCE_TART_SUPPORT ? new C0321z(this) : new C0315w(this);
        this.b = c0321z;
        return c0321z.a(this.a, i, i2, i3, i4, i5, surface);
    }

    protected boolean isCamera2AutoFocusPointSupported(int i) {
        return C0315w.d(this.a, i);
    }

    protected boolean isCamera2FrontFacing(int i) {
        return C0315w.e(this.a, i);
    }

    protected void pauseCamera2() {
        C0315w c0315w = this.b;
        if (c0315w != null) {
            c0315w.d();
        }
    }

    protected boolean setAutoFocusPoint(float f, float f2) {
        C0315w c0315w = this.b;
        if (c0315w != null) {
            return c0315w.a(f, f2);
        }
        return false;
    }

    protected void startCamera2() {
        C0315w c0315w = this.b;
        if (c0315w != null) {
            c0315w.h();
        }
    }

    protected void stopCamera2() {
        C0315w c0315w = this.b;
        if (c0315w != null) {
            c0315w.i();
        }
    }
}
