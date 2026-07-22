package p003;

import dalvik.system.PathClassLoader;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Executable;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣۣۣۣۣۣ۟۟۠۟۟۟۠۠۟۟۠ۡ۟۟۠ۢ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
final class C0195 extends PathClassLoader {
    C0195() {
        super(m13257(), null);
    }

    /* JADX INFO: renamed from: ۟۟۟ۥۤ۟۟۟ۥۥ۟۟۟ۥۦ۟۟۟ۥۧ۟۟۟ۥۨ, reason: not valid java name and contains not printable characters */
    private static String m13257() {
        return System.getProperty("java.boot.class.path", "").split(":", 2)[0];
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        if (Object.class.getName().equals(str)) {
            return Object.class;
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException unused) {
            return Executable.class.getName().equals(str) ? C0199.class : MethodHandle.class.getName().equals(str) ? C0200.class : Class.class.getName().equals(str) ? C0198.class : super.loadClass(str);
        }
    }
}
