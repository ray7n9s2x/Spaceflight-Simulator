package com.android.apksig.internal.apk.v4;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class V4Signature {
    public static final int CURRENT_VERSION = 2;
    public static final int HASHING_ALGORITHM_SHA256 = 1;
    public static final byte LOG2_BLOCK_SIZE_4096_BYTES = 12;
    public static final int MAX_SIGNING_INFOS_SIZE = 7168;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f77short = {1873, 1910, 1902, 1913, 1908, 1905, 1916, 1848, 1899, 1905, 1919, 1910, 1913, 1900, 1901, 1898, 1917, 1848, 1902, 1917, 1898, 1899, 1905, 1911, 1910, 1846};
    public final byte[] hashingInfo;
    public final byte[] signingInfos;
    public final int version;

    public static class HashingInfo {
        public final int hashAlgorithm;
        public final byte log2BlockSize;
        public final byte[] rawRootHash;
        public final byte[] salt;

        public byte[] toByteArray() {
            ByteBuffer byteBufferM4604 = C0064.m4604(C0035.m3516(C0078.m7430(C0030.m2839(this)) + C0078.m7430(C0020.m1396(this)) + 5), C0072.m6217());
            C0038.m4018(byteBufferM4604, C0025.m2093(this));
            C0070.m5899(byteBufferM4604, C0018.m1085(this));
            C0078.m7441(byteBufferM4604, C0020.m1396(this));
            C0078.m7441(byteBufferM4604, C0030.m2839(this));
            return C0027.m2445(byteBufferM4604);
        }

        public HashingInfo(int i, byte b, byte[] bArr, byte[] bArr2) {
            this.hashAlgorithm = i;
            this.log2BlockSize = b;
            this.salt = bArr;
            this.rawRootHash = bArr2;
        }

        public static HashingInfo fromByteArray(byte[] bArr) {
            ByteBuffer byteBufferM4604 = C0064.m4604(C0020.m1393(bArr), C0072.m6217());
            return new HashingInfo(C0064.m4566(byteBufferM4604), C0069.m5826(byteBufferM4604), C0068.m5531(byteBufferM4604), C0068.m5531(byteBufferM4604));
        }
    }

    public static class SigningInfo {
        public final byte[] additionalData;
        public final byte[] apkDigest;
        public final byte[] certificate;
        public final byte[] publicKey;
        public final byte[] signature;
        public final int signatureAlgorithmId;

        public byte[] toByteArray() {
            ByteBuffer byteBufferM4604 = C0064.m4604(C0035.m3516(C0078.m7430(C0038.m3995(this)) + C0078.m7430(C0031.m3040(this)) + C0078.m7430(C0016.m691(this)) + C0078.m7430(C0026.m2306(this)) + C0078.m7430(C0069.m5738(this)) + 4), C0072.m6217());
            C0078.m7441(byteBufferM4604, C0069.m5738(this));
            C0078.m7441(byteBufferM4604, C0026.m2306(this));
            C0078.m7441(byteBufferM4604, C0016.m691(this));
            C0078.m7441(byteBufferM4604, C0031.m3040(this));
            C0038.m4018(byteBufferM4604, C0034.m3472(this));
            C0078.m7441(byteBufferM4604, C0038.m3995(this));
            return C0027.m2445(byteBufferM4604);
        }

        public SigningInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5) {
            this.apkDigest = bArr;
            this.certificate = bArr2;
            this.additionalData = bArr3;
            this.publicKey = bArr4;
            this.signatureAlgorithmId = i;
            this.signature = bArr5;
        }

        public static SigningInfo fromByteArray(byte[] bArr) {
            return C0019.m1269(C0064.m4604(C0020.m1393(bArr), C0072.m6217()));
        }

        public static SigningInfo fromByteBuffer(ByteBuffer byteBuffer) {
            return new SigningInfo(C0068.m5531(byteBuffer), C0068.m5531(byteBuffer), C0068.m5531(byteBuffer), C0068.m5531(byteBuffer), C0064.m4566(byteBuffer), C0068.m5531(byteBuffer));
        }
    }

    public static class SigningInfoBlock {
        public final int blockId;
        public final byte[] signingInfo;

        public byte[] toByteArray() {
            ByteBuffer byteBufferM4604 = C0064.m4604(C0035.m3516(C0078.m7430(C0025.m2090(this)) + 4), C0072.m6217());
            C0038.m4018(byteBufferM4604, C0018.m955(this));
            C0078.m7441(byteBufferM4604, C0025.m2090(this));
            return C0027.m2445(byteBufferM4604);
        }

        public SigningInfoBlock(int i, byte[] bArr) {
            this.blockId = i;
            this.signingInfo = bArr;
        }

        public static SigningInfoBlock fromByteBuffer(ByteBuffer byteBuffer) {
            return new SigningInfoBlock(C0064.m4566(byteBuffer), C0068.m5531(byteBuffer));
        }
    }

    public static class SigningInfos {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f78short = {725, 761, 763, 756, 767, 760, 755, 754, 694, 709, 767, 753, 760, 767, 760, 753, 735, 760, 752, 761, 741, 694, 762, 755, 760, 753, 738, 766, 694, 755, 750, 757, 755, 755, 754, 755, 754, 694, 762, 767, 763, 767, 738, 694, 761, 752, 694, 673, 733, 684, 694};
        public final SigningInfo signingInfo;
        public final SigningInfoBlock[] signingInfoBlocks;

        public SigningInfos(SigningInfo signingInfo) {
            this.signingInfo = signingInfo;
            this.signingInfoBlocks = new SigningInfoBlock[0];
        }

        /* JADX INFO: renamed from: ۥۣۤ, reason: contains not printable characters */
        public static short[] m1174() {
            if (C0032.m3184() < 0) {
                return f78short;
            }
            return null;
        }

        public byte[] toByteArray() {
            byte[][] bArr = new byte[C0070.m5846(this).length + 1][];
            byte[] bArrM4788 = C0065.m4788(C0074.m6510(this));
            bArr[0] = bArrM4788;
            int length = bArrM4788.length;
            int length2 = C0070.m5846(this).length;
            int i = 0;
            while (i < length2) {
                int i2 = i + 1;
                byte[] bArrM1279 = C0019.m1279(C0070.m5846(this)[i]);
                bArr[i2] = bArrM1279;
                length += bArrM1279.length;
                i = i2;
            }
            if (length > 7168) {
                throw new IllegalArgumentException(C0071.m6038(length, C0038.m4022(m1174(), 0, 51, 662)));
            }
            byte[] bArrM7349 = C0078.m7349(bArr[0], length);
            int length3 = bArr[0].length;
            int length4 = C0070.m5846(this).length;
            int i3 = 0;
            while (i3 < length4) {
                i3++;
                byte[] bArr2 = bArr[i3];
                C0027.m2519(bArr2, 0, bArrM7349, length3, bArr2.length);
                length3 += bArr[i3].length;
            }
            return bArrM7349;
        }

        public static SigningInfos fromByteArray(byte[] bArr) {
            ByteBuffer byteBufferM4604 = C0064.m4604(C0020.m1393(bArr), C0072.m6217());
            SigningInfo signingInfoM1269 = C0019.m1269(byteBufferM4604);
            if (!C0111.m13127(byteBufferM4604)) {
                return new SigningInfos(signingInfoM1269);
            }
            ArrayList arrayList = new ArrayList(1);
            while (C0111.m13127(byteBufferM4604)) {
                C0017.m919(arrayList, C0078.m7332(byteBufferM4604));
            }
            return new SigningInfos(signingInfoM1269, (SigningInfoBlock[]) C0039.m4172(arrayList, new SigningInfoBlock[C0018.m1084(arrayList)]));
        }

        public SigningInfos(SigningInfo signingInfo, SigningInfoBlock... signingInfoBlockArr) {
            this.signingInfo = signingInfo;
            this.signingInfoBlocks = signingInfoBlockArr;
        }
    }

    public static byte[] readBytes(InputStream inputStream) {
        try {
            byte[] bArr = new byte[C0027.m2478(inputStream)];
            C0019.m1203(inputStream, bArr);
            return bArr;
        } catch (EOFException unused) {
            return null;
        }
    }

    public static void readFully(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int iM3212 = C0032.m3212(inputStream, bArr, i, length - i);
            if (iM3212 < 0) {
                throw new EOFException();
            }
            i += iM3212;
        }
    }

    public static int readIntLE(InputStream inputStream) {
        byte[] bArr = new byte[4];
        C0019.m1203(inputStream, bArr);
        return C0064.m4566(C0064.m4604(C0020.m1393(bArr), C0072.m6217()));
    }

    public static void writeBytes(OutputStream outputStream, byte[] bArr) {
        if (bArr == null) {
            C0064.m4565(outputStream, 0);
        } else {
            C0064.m4565(outputStream, bArr.length);
            C0033.m3292(outputStream, bArr);
        }
    }

    public static void writeIntLE(OutputStream outputStream, int i) {
        C0033.m3292(outputStream, C0027.m2445(C0038.m4018(C0064.m4604(C0020.m1393(new byte[4]), C0072.m6217()), i)));
    }

    /* JADX INFO: renamed from: ۟ۤۧۥ۠, reason: not valid java name and contains not printable characters */
    public static short[] m1173() {
        if (C0019.m1311() == 0) {
            return f77short;
        }
        return null;
    }

    public static int bytesSize(byte[] bArr) {
        return (bArr == null ? 0 : bArr.length) + 4;
    }

    public static byte[] getSignedData(long j, HashingInfo hashingInfo, SigningInfo signingInfo) {
        int iM7430 = C0078.m7430(C0016.m691(signingInfo)) + C0078.m7430(C0026.m2306(signingInfo)) + C0078.m7430(C0069.m5738(signingInfo)) + C0078.m7430(C0030.m2839(hashingInfo)) + C0078.m7430(C0020.m1396(hashingInfo)) + 17;
        ByteBuffer byteBufferM4604 = C0064.m4604(C0035.m3516(iM7430), C0072.m6217());
        C0038.m4018(byteBufferM4604, iM7430);
        C0018.m961(byteBufferM4604, j);
        C0038.m4018(byteBufferM4604, C0025.m2093(hashingInfo));
        C0070.m5899(byteBufferM4604, C0018.m1085(hashingInfo));
        C0078.m7441(byteBufferM4604, C0020.m1396(hashingInfo));
        C0078.m7441(byteBufferM4604, C0030.m2839(hashingInfo));
        C0078.m7441(byteBufferM4604, C0069.m5738(signingInfo));
        C0078.m7441(byteBufferM4604, C0026.m2306(signingInfo));
        C0078.m7441(byteBufferM4604, C0016.m691(signingInfo));
        return C0027.m2445(byteBufferM4604);
    }

    public void writeTo(OutputStream outputStream) {
        C0064.m4565(outputStream, C0031.m3081(this));
        C0067.m5484(outputStream, C0070.m5889(this));
        C0067.m5484(outputStream, C0065.m4721(this));
    }

    public V4Signature(int i, byte[] bArr, byte[] bArr2) {
        this.version = i;
        this.hashingInfo = bArr;
        this.signingInfos = bArr2;
    }

    public static V4Signature readFrom(InputStream inputStream) throws IOException {
        int iM2478 = C0027.m2478(inputStream);
        if (iM2478 == 2) {
            return new V4Signature(iM2478, C0068.m5533(inputStream), C0068.m5533(inputStream));
        }
        throw new IOException(C0025.m2151(m1173(), 0, 26, 1816));
    }

    public static byte[] readBytes(ByteBuffer byteBuffer) throws EOFException {
        if (C0071.m5984(byteBuffer) >= 4) {
            int iM4566 = C0064.m4566(byteBuffer);
            if (C0071.m5984(byteBuffer) >= iM4566) {
                byte[] bArr = new byte[iM4566];
                C0029.m2812(byteBuffer, bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public static void writeBytes(ByteBuffer byteBuffer, byte[] bArr) {
        if (bArr == null) {
            C0038.m4018(byteBuffer, 0);
        } else {
            C0038.m4018(byteBuffer, bArr.length);
            C0068.m5569(byteBuffer, bArr);
        }
    }
}
