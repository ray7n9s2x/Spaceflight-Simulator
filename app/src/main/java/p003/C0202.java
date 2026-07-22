package p003;

import android.util.Log;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣۣۣۣ۟۟ۤ۟۟ۥۣۣ۟۟ۦۣۣۣۣ۟۟ۧ۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0202 {

    /* JADX INFO: renamed from: ۟۟ۢۧۤ۟۟ۢۧۥ۟۟ۢۧۦ۟۟ۢۧۧ۟۟ۢۧۨ, reason: not valid java name and contains not printable characters */
    private static final long f731;

    /* JADX INFO: renamed from: ۣ۟۟ۢۨ۟۟۟ۢۨ۠۟۟ۢۨۡ۟۟ۢۨۢ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    private static final long f732;

    /* JADX INFO: renamed from: ۟۟ۢۨۤ۟۟ۢۨۥ۟۟ۢۨۦ۟۟ۢۨۧ۟۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    private static final long f733;

    /* JADX INFO: renamed from: ۣۣۣۣۣۣ۟۟۟۟۟۠۟۟ۡ۟۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    private static final long f734;

    /* JADX INFO: renamed from: ۣۣ۟۟۟ۤ۟۟۟ۥۣ۟۟۟ۦۣۣ۟۟۟ۧ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    private static final long f735;

    /* JADX INFO: renamed from: ۣۣۣۣۣۣ۟۟۠۟۟۟۠۠۟۟۠ۡ۟۟۠ۢ۟۟۠, reason: not valid java name and contains not printable characters */
    private static final long f736;

    /* JADX INFO: renamed from: ۣۣ۟۟۠ۤ۟۟۠ۥۣ۟۟۠ۦۣۣ۟۟۠ۧ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    private static final long f737;

    /* JADX INFO: renamed from: ۣۣۣۣۣۣ۟۟ۡ۟۟۟ۡ۠۟۟ۡۡ۟۟ۡۢ۟۟ۡ, reason: not valid java name and contains not printable characters */
    private static final long f738;

    /* JADX INFO: renamed from: ۣۣ۟۟ۡۤ۟۟ۡۥۣ۟۟ۡۦۣۣ۟۟ۡۧ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    private static final long f739;

    /* JADX INFO: renamed from: ۣۣۣۣۣۣ۟۟ۢ۟۟۟ۢ۠۟۟ۢۡ۟۟ۢۢ۟۟ۢ, reason: not valid java name and contains not printable characters */
    private static final long f740;

    /* JADX INFO: renamed from: ۣۣ۟۟ۢۤ۟۟ۢۥۣ۟۟ۢۦۣۣ۟۟ۢۧ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    private static final Unsafe f741;

    static {
        long jObjectFieldOffset;
        long jObjectFieldOffset2;
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
            f741 = unsafe;
            C0195 c0195 = new C0195();
            Class<?> clsLoadClass = c0195.loadClass(Executable.class.getName());
            Class<?> clsLoadClass2 = c0195.loadClass(MethodHandle.class.getName());
            Class<?> clsLoadClass3 = c0195.loadClass(Class.class.getName());
            f738 = unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("artMethod"));
            f736 = unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("declaringClass"));
            f735 = unsafe.objectFieldOffset(clsLoadClass2.getDeclaredField("artFieldOrMethod"));
            try {
                jObjectFieldOffset = unsafe.objectFieldOffset(clsLoadClass3.getDeclaredField("fields"));
                jObjectFieldOffset2 = jObjectFieldOffset;
            } catch (NoSuchFieldException unused) {
                Unsafe unsafe2 = f741;
                jObjectFieldOffset = unsafe2.objectFieldOffset(clsLoadClass3.getDeclaredField("iFields"));
                jObjectFieldOffset2 = unsafe2.objectFieldOffset(clsLoadClass3.getDeclaredField("sFields"));
            }
            f737 = jObjectFieldOffset;
            f740 = jObjectFieldOffset2;
            Unsafe unsafe3 = f741;
            long jObjectFieldOffset3 = unsafe3.objectFieldOffset(clsLoadClass3.getDeclaredField("methods"));
            f739 = jObjectFieldOffset3;
            Method declaredMethod = C0201.class.getDeclaredMethod("a", new Class[0]);
            Method declaredMethod2 = C0201.class.getDeclaredMethod("۟۟۟ۦ۟۟۟۟ۦ۠۟۟۟ۦۡ۟۟۟ۦۢ۟۟۟ۦۣ", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j = f735;
            long j2 = unsafe3.getLong(methodHandleUnreflect, j);
            long j3 = unsafe3.getLong(methodHandleUnreflect2, j);
            long j4 = unsafe3.getLong(C0201.class, jObjectFieldOffset3);
            long j5 = j3 - j2;
            f734 = j5;
            f733 = (j2 - j4) - j5;
            Field declaredField = C0201.class.getDeclaredField("۟۟ۢۦۤ۟۟ۢۦۥ۟۟ۢۦۦ۟۟ۢۦۧ۟۟ۢۦۨ");
            Field declaredField2 = C0201.class.getDeclaredField("ۣ۟۟ۢۧ۟۟۟ۢۧ۠۟۟ۢۧۡ۟۟ۢۧۢ۟۟ۢۧ");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            long j6 = unsafe3.getLong(methodHandleUnreflectGetter, j);
            long j7 = unsafe3.getLong(methodHandleUnreflectGetter2, j);
            long j8 = unsafe3.getLong(C0201.class, jObjectFieldOffset);
            f732 = j7 - j6;
            f731 = j6 - j8;
        } catch (ReflectiveOperationException e) {
            Log.e("HiddenApiBypass", "Initialize error", e);
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static Constructor<?> m13259(Class<?> cls, Class<?>... clsArr) throws NoSuchMethodException {
        for (Executable executable : m13260(cls)) {
            if (executable instanceof Constructor) {
                Class<?>[] parameterTypes = executable.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i = 0; i < clsArr.length; i++) {
                        if (clsArr[i] != parameterTypes[i]) {
                            break;
                        }
                    }
                    return (Constructor) executable;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static List<Executable> m13260(Class<?> cls) {
        if (cls.isPrimitive() || cls.isArray()) {
            return Collections.emptyList();
        }
        try {
            Method declaredMethod = C0201.class.getDeclaredMethod("a", new Class[0]);
            declaredMethod.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            Unsafe unsafe = f741;
            long j = unsafe.getLong(cls, f739);
            if (j == 0) {
                return Collections.emptyList();
            }
            int i = unsafe.getInt(j);
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                long j2 = f734;
                f741.putLong(methodHandleUnreflect, f735, f733 + (((long) i2) * j2) + j);
                arrayList.add((Executable) MethodHandles.reflectAs(Executable.class, methodHandleUnreflect));
            }
            return arrayList;
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۠۟۟۟ۡ۟۟۟ۢ۟۟۟, reason: not valid java name and contains not printable characters */
    public static Method m13261(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Executable executable : m13260(cls)) {
            if (executable.getName().equals(str) && (executable instanceof Method)) {
                Class<?>[] parameterTypes = executable.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i = 0; i < clsArr.length; i++) {
                        if (clsArr[i] != parameterTypes[i]) {
                            break;
                        }
                    }
                    return (Method) executable;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }
}
