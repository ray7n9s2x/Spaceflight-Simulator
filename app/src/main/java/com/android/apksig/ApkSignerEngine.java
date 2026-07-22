package com.android.apksig;

import com.android.apksig.internal.jar.C0024;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.reflect.C0071;
import java.io.Closeable;
import java.io.File;
import java.util.List;
import java.util.Set;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public interface ApkSignerEngine extends Closeable {

    public static class InputJarEntryInstructions {
        public final OutputPolicy a;
        public final InspectJarEntryRequest b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class OutputPolicy {
            public static final OutputPolicy OUTPUT;
            public static final OutputPolicy OUTPUT_BY_ENGINE;
            public static final OutputPolicy SKIP;
            public static final /* synthetic */ OutputPolicy[] a;

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f18short = {1132, 1140, 1142, 1135, 2267, 2241, 2240, 2244, 2241, 2240, 3283, 3273, 3272, 3276, 3273, 3272, 3267, 3294, 3269, 3267, 3289, 3282, 3291, 3285, 3282, 3289};

            static {
                OutputPolicy outputPolicy = new OutputPolicy(C0111.m13097(f18short, 0, 4, 1087), 0);
                SKIP = outputPolicy;
                OutputPolicy outputPolicy2 = new OutputPolicy(C0024.m1945(f18short, 4, 6, 2196), 1);
                OUTPUT = outputPolicy2;
                OutputPolicy outputPolicy3 = new OutputPolicy(C0031.m3047(f18short, 10, 16, 3228), 2);
                OUTPUT_BY_ENGINE = outputPolicy3;
                a = new OutputPolicy[]{outputPolicy, outputPolicy2, outputPolicy3};
            }

            public static OutputPolicy valueOf(String str) {
                return (OutputPolicy) Enum.valueOf(OutputPolicy.class, str);
            }

            public static OutputPolicy[] values() {
                return (OutputPolicy[]) a.clone();
            }
        }

        public InputJarEntryInstructions(OutputPolicy outputPolicy) {
            this(outputPolicy, null);
        }

        public InputJarEntryInstructions(OutputPolicy outputPolicy, InspectJarEntryRequest inspectJarEntryRequest) {
            this.a = outputPolicy;
            this.b = inspectJarEntryRequest;
        }

        public InspectJarEntryRequest getInspectJarEntryRequest() {
            return C0036.m3717(this);
        }

        public OutputPolicy getOutputPolicy() {
            return C0065.m4667(this);
        }
    }

    public interface InspectJarEntryRequest {
        void done();

        DataSink getDataSink();

        String getEntryName();
    }

    @Deprecated
    public interface OutputApkSigningBlockRequest {
        void done();

        byte[] getApkSigningBlock();
    }

    public interface OutputApkSigningBlockRequest2 {
        void done();

        byte[] getApkSigningBlock();

        int getPaddingSizeBeforeApkSigningBlock();
    }

    public interface OutputJarSignatureRequest {

        public static class JarEntry {
            public final String a;
            public final byte[] b;

            /* JADX INFO: renamed from: ۟ۥۣۤۨ, reason: not valid java name and contains not printable characters */
            public static Object m515(Object obj) {
                if (C0036.m3653() < 0) {
                    return ((byte[]) obj).clone();
                }
                return null;
            }

            public byte[] getData() {
                return (byte[]) m515(C0071.m6073(this));
            }

            public String getName() {
                return C0071.m6002(this);
            }

            public JarEntry(String str, byte[] bArr) {
                this.a = str;
                this.b = (byte[]) m515(bArr);
            }
        }

        void done();

        List<JarEntry> getAdditionalJarEntries();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    byte[] generateSourceStampCertificateDigest();

    Set<String> initWith(byte[] bArr, Set<String> set);

    void inputApkSigningBlock(DataSource dataSource);

    InputJarEntryInstructions inputJarEntry(String str);

    InputJarEntryInstructions.OutputPolicy inputJarEntryRemoved(String str);

    boolean isEligibleForSourceStamp();

    void outputDone();

    OutputJarSignatureRequest outputJarEntries();

    InspectJarEntryRequest outputJarEntry(String str);

    void outputJarEntryRemoved(String str);

    @Deprecated
    OutputApkSigningBlockRequest outputZipSections(DataSource dataSource, DataSource dataSource2, DataSource dataSource3);

    OutputApkSigningBlockRequest2 outputZipSections2(DataSource dataSource, DataSource dataSource2, DataSource dataSource3);

    void setExecutor(RunnablesExecutor runnablesExecutor);

    void signV4(DataSource dataSource, File file, boolean z);
}
