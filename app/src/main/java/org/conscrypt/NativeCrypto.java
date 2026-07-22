package org.conscrypt;

import androidx.appcompat.app.AppCompatDelegate;
import com.android.apksig.C0039;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.util.Calendar;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeCrypto {
    public static final UnsatisfiedLinkError a;
    public static final HashSet b;
    public static final HashSet c;
    public static final String[] d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f573short = {1816, 1792, 1823, 1811, 1807, 1796, 1805, 1807, 1796, 1805, 1918, 1916, 1811, 1820, 1795, 1792, 1813, 1917, 1919, 1916, 1913, 1811, 1823, 1796, 1805, 1918, 1913, 1914, 2025, 2033, 2030, 2018, 2044, 2040, 2030, 2018, 1932, 1935, 1925, 2018, 2042, 2046, 2032, 2018, 2030, 2037, 2044, 1935, 1928, 1931, 1286, 1310, 1281, 1293, 1299, 1303, 1281, 1293, 1376, 1383, 1380, 1293, 1301, 1297, 1311, 1293, 1281, 1306, 1299, 1377, 1386, 1382, 1576, 1573, 1573, 1619, 1626, 1581, 1580, 1594, 2934, 2926, 2929, 2941, 2928, 2929, 2915, 2941, 2933, 2923, 2934, 2922, 2941, 2833, 2918, 2919, 2929, 2941, 2919, 2918, 2919, 2941, 2913, 2912, 2913, 2941, 2929, 2922, 2915, 2006, 2006, 1993, 2010, 2007, 2006, 1988, 2010, 2002, 1996, 2001, 1997, 2010, 1974, 1985, 1984, 2006, 2010, 1984, 1985, 1984, 2010, 1990, 1991, 1990, 2010, 2006, 1997, 1988, 3031, 3023, 3024, 3036, 3014, 3022, 3027, 3031, 3034, 3036, 3025, 3014, 3021, 3014, 3012, 3020, 3031, 3018, 3010, 3031, 3018, 3020, 3021, 3036, 3018, 3021, 3013, 3020, 3036, 3024, 3008, 3024, 3029, 1387, 1395, 1388, 1376, 1401, 1406, 1395, 1395, 1405, 1406, 1404, 1396, 1376, 1388, 1404, 1388, 1385, 2948, 2979, 3003, 2988, 2977, 2980, 2985, 3053, 2990, 2980, 3005, 2981, 2984, 3007, 3053, 2977, 2980, 3006, 3001, 3053, 3007, 2984, 3001, 3000, 3007, 2979, 2984, 2985, 3053, 2991, 2996, 3053, 2986, 2984, 3001, 2962, 2990, 2980, 3005, 2981, 2984, 3007, 2962, 2979, 2988, 2976, 2984, 3006, 1417, 1425, 1422, 1451, 1516, 1523, 1519, 2370, 2394, 2373, 2400, 2343, 2360, 2341};

    public interface SSLHandshakeCallbacks {
    }

    static {
        try {
            C0030.m2962();
            m13024();
            e = null;
        } catch (UnsatisfiedLinkError e) {
            e = e;
        }
        a = e;
        String[] strArr = {C0078.m7427(m13025(), 28, 22, 1981), C0077.m7205(m13025(), 50, 22, 1362), C0069.m5807(m13025(), 0, 28, 1868)};
        b = new HashSet();
        c = new HashSet();
        new HashSet(C0021.m1596(strArr));
        if (e == null) {
            String[] strArrM3320 = C0033.m3320(C0065.m4757(m13025(), 72, 8, 1641));
            int length = strArrM3320.length;
            if (length % 2 != 0) {
                throw new IllegalArgumentException(C0031.m3047(m13025(), 188, 48, 3021));
            }
            int i = length / 2;
            d = new String[i + 2];
            for (int i2 = 0; i2 < length; i2 += 2) {
                String strM4545 = strArrM3320[i2];
                if (C0070.m5838(C0072.m6116(m13025(), 80, 29, 2850), strM4545)) {
                    strM4545 = C0064.m4545(m13025(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 29, 1925);
                }
                C0071.m5988()[i2 / 2] = strM4545;
                C0077.m7232(C0069.m5748(), strM4545);
                C0077.m7232(C0034.m3386(), strArrM3320[i2 + 1]);
            }
            String[] strArrM5988 = C0071.m5988();
            strArrM5988[i] = C0034.m3431(m13025(), 138, 33, 2947);
            strArrM5988[i + 1] = C0024.m1945(m13025(), 171, 17, 1343);
            C0069.m5809();
        } else {
            d = new String[0];
        }
        C0063.m4387();
        String[] strArr2 = new String[0];
        String strM4315 = C0063.m4315(m13025(), 236, 7, 1501);
        String strM4828 = C0066.m4828(m13025(), 243, 7, 2326);
        Object[] objArrM5421 = C0067.m5421(strArr2, 2);
        C0027.m2519(new String[]{strM4315, strM4828}, 0, objArrM5421, 0, 2);
        Object[] objArrM54212 = C0067.m5421(strArr2, 1);
        C0027.m2519(new String[]{strM4315}, 0, objArrM54212, 0, 1);
        Object[] objArrM54213 = C0067.m5421(new String[0], 2);
        C0027.m2519(new String[]{strM4315, strM4828}, 0, objArrM54213, 0, 2);
    }

    public static native void ASN1_TIME_to_Calendar(long j, Calendar calendar);

    public static native byte[] ASN1_seq_pack_X509(long[] jArr);

    public static native long[] ASN1_seq_unpack_X509_bio(long j);

    public static native void BIO_free_all(long j);

    public static native int BIO_read(long j, byte[] bArr);

    public static native void BIO_write(long j, byte[] bArr, int i, int i2);

    public static native void CMAC_CTX_free(long j);

    public static native long CMAC_CTX_new();

    public static native byte[] CMAC_Final(NativeRef$CMAC_CTX nativeRef$CMAC_CTX);

    public static native void CMAC_Init(NativeRef$CMAC_CTX nativeRef$CMAC_CTX, byte[] bArr);

    public static native void CMAC_Reset(NativeRef$CMAC_CTX nativeRef$CMAC_CTX);

    public static native void CMAC_Update(NativeRef$CMAC_CTX nativeRef$CMAC_CTX, byte[] bArr, int i, int i2);

    public static native void CMAC_UpdateDirect(NativeRef$CMAC_CTX nativeRef$CMAC_CTX, long j, int i);

    public static native int ECDH_compute_key(byte[] bArr, int i, NativeRef$EVP_PKEY nativeRef$EVP_PKEY, NativeRef$EVP_PKEY nativeRef$EVP_PKEY2);

    public static native int ECDSA_sign(byte[] bArr, byte[] bArr2, NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native int ECDSA_size(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native int ECDSA_verify(byte[] bArr, byte[] bArr2, NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native void EC_GROUP_clear_free(long j);

    public static native byte[] EC_GROUP_get_cofactor(NativeRef$EC_GROUP nativeRef$EC_GROUP);

    public static native byte[][] EC_GROUP_get_curve(NativeRef$EC_GROUP nativeRef$EC_GROUP);

    public static native String EC_GROUP_get_curve_name(NativeRef$EC_GROUP nativeRef$EC_GROUP);

    public static native int EC_GROUP_get_degree(NativeRef$EC_GROUP nativeRef$EC_GROUP);

    public static native long EC_GROUP_get_generator(NativeRef$EC_GROUP nativeRef$EC_GROUP);

    public static native byte[] EC_GROUP_get_order(NativeRef$EC_GROUP nativeRef$EC_GROUP);

    public static native long EC_GROUP_new_arbitrary(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, int i);

    public static native long EC_GROUP_new_by_curve_name(String str);

    public static native long EC_KEY_generate_key(NativeRef$EC_GROUP nativeRef$EC_GROUP);

    public static native long EC_KEY_get1_group(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native byte[] EC_KEY_get_private_key(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native long EC_KEY_get_public_key(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native byte[] EC_KEY_marshal_curve_name(NativeRef$EC_GROUP nativeRef$EC_GROUP);

    public static native long EC_KEY_parse_curve_name(byte[] bArr);

    public static native void EC_POINT_clear_free(long j);

    public static native byte[][] EC_POINT_get_affine_coordinates(NativeRef$EC_GROUP nativeRef$EC_GROUP, NativeRef$EC_POINT nativeRef$EC_POINT);

    public static native long EC_POINT_new(NativeRef$EC_GROUP nativeRef$EC_GROUP);

    public static native void EC_POINT_set_affine_coordinates(NativeRef$EC_GROUP nativeRef$EC_GROUP, NativeRef$EC_POINT nativeRef$EC_POINT, byte[] bArr, byte[] bArr2);

    public static native int ENGINE_SSL_do_handshake(long j, NativeSsl nativeSsl, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    public static native void ENGINE_SSL_force_read(long j, NativeSsl nativeSsl, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    public static native int ENGINE_SSL_read_BIO_direct(long j, NativeSsl nativeSsl, long j2, long j3, int i, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    public static native int ENGINE_SSL_read_direct(long j, NativeSsl nativeSsl, long j2, int i, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    public static native void ENGINE_SSL_shutdown(long j, NativeSsl nativeSsl, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    public static native int ENGINE_SSL_write_BIO_direct(long j, NativeSsl nativeSsl, long j2, long j3, int i, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    public static native int ENGINE_SSL_write_direct(long j, NativeSsl nativeSsl, long j2, int i, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    public static native int EVP_AEAD_CTX_open(long j, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5);

    public static native int EVP_AEAD_CTX_open_buf(long j, byte[] bArr, int i, ByteBuffer byteBuffer, byte[] bArr2, ByteBuffer byteBuffer2, byte[] bArr3);

    public static native int EVP_AEAD_CTX_seal(long j, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5);

    public static native int EVP_AEAD_CTX_seal_buf(long j, byte[] bArr, int i, ByteBuffer byteBuffer, byte[] bArr2, ByteBuffer byteBuffer2, byte[] bArr3);

    public static native int EVP_AEAD_max_overhead(long j);

    public static native int EVP_AEAD_nonce_length(long j);

    public static native int EVP_CIPHER_CTX_block_size(NativeRef$EVP_CIPHER_CTX nativeRef$EVP_CIPHER_CTX);

    public static native void EVP_CIPHER_CTX_free(long j);

    public static native long EVP_CIPHER_CTX_new();

    public static native void EVP_CIPHER_CTX_set_key_length(NativeRef$EVP_CIPHER_CTX nativeRef$EVP_CIPHER_CTX, int i);

    public static native void EVP_CIPHER_CTX_set_padding(NativeRef$EVP_CIPHER_CTX nativeRef$EVP_CIPHER_CTX, boolean z);

    public static native int EVP_CIPHER_iv_length(long j);

    public static native int EVP_CipherFinal_ex(NativeRef$EVP_CIPHER_CTX nativeRef$EVP_CIPHER_CTX, byte[] bArr, int i);

    public static native void EVP_CipherInit_ex(NativeRef$EVP_CIPHER_CTX nativeRef$EVP_CIPHER_CTX, long j, byte[] bArr, byte[] bArr2, boolean z);

    public static native int EVP_CipherUpdate(NativeRef$EVP_CIPHER_CTX nativeRef$EVP_CIPHER_CTX, byte[] bArr, int i, byte[] bArr2, int i2, int i3);

    public static native int EVP_DigestFinal_ex(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX, byte[] bArr, int i);

    public static native int EVP_DigestInit_ex(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX, long j);

    public static native byte[] EVP_DigestSignFinal(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX);

    public static native long EVP_DigestSignInit(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX, long j, NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native void EVP_DigestSignUpdate(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX, byte[] bArr, int i, int i2);

    public static native void EVP_DigestSignUpdateDirect(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX, long j, int i);

    public static native void EVP_DigestUpdate(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX, byte[] bArr, int i, int i2);

    public static native void EVP_DigestUpdateDirect(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX, long j, int i);

    public static native boolean EVP_DigestVerifyFinal(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX, byte[] bArr, int i, int i2);

    public static native long EVP_DigestVerifyInit(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX, long j, NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native void EVP_DigestVerifyUpdate(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX, byte[] bArr, int i, int i2);

    public static native void EVP_DigestVerifyUpdateDirect(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX, long j, int i);

    public static native byte[] EVP_HPKE_CTX_export(NativeRef$EVP_HPKE_CTX nativeRef$EVP_HPKE_CTX, byte[] bArr, int i);

    public static native void EVP_HPKE_CTX_free(long j);

    public static native byte[] EVP_HPKE_CTX_open(NativeRef$EVP_HPKE_CTX nativeRef$EVP_HPKE_CTX, byte[] bArr, byte[] bArr2);

    public static native byte[] EVP_HPKE_CTX_seal(NativeRef$EVP_HPKE_CTX nativeRef$EVP_HPKE_CTX, byte[] bArr, byte[] bArr2);

    public static native Object EVP_HPKE_CTX_setup_base_mode_recipient(int i, int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native Object[] EVP_HPKE_CTX_setup_base_mode_sender(int i, int i2, int i3, byte[] bArr, byte[] bArr2);

    public static native Object[] EVP_HPKE_CTX_setup_base_mode_sender_with_seed_for_testing(int i, int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native void EVP_MD_CTX_cleanup(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX);

    public static native int EVP_MD_CTX_copy_ex(NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX, NativeRef$EVP_MD_CTX nativeRef$EVP_MD_CTX2);

    public static native long EVP_MD_CTX_create();

    public static native void EVP_MD_CTX_destroy(long j);

    public static native int EVP_MD_size(long j);

    public static native void EVP_PKEY_CTX_free(long j);

    public static native void EVP_PKEY_CTX_set_rsa_mgf1_md(long j, long j2);

    public static native void EVP_PKEY_CTX_set_rsa_oaep_label(long j, byte[] bArr);

    public static native void EVP_PKEY_CTX_set_rsa_oaep_md(long j, long j2);

    public static native void EVP_PKEY_CTX_set_rsa_padding(long j, int i);

    public static native void EVP_PKEY_CTX_set_rsa_pss_saltlen(long j, int i);

    public static native int EVP_PKEY_cmp(NativeRef$EVP_PKEY nativeRef$EVP_PKEY, NativeRef$EVP_PKEY nativeRef$EVP_PKEY2);

    public static native int EVP_PKEY_decrypt(NativeRef$EVP_PKEY_CTX nativeRef$EVP_PKEY_CTX, byte[] bArr, int i, byte[] bArr2, int i2, int i3);

    public static native long EVP_PKEY_decrypt_init(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native int EVP_PKEY_encrypt(NativeRef$EVP_PKEY_CTX nativeRef$EVP_PKEY_CTX, byte[] bArr, int i, byte[] bArr2, int i2, int i3);

    public static native long EVP_PKEY_encrypt_init(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native void EVP_PKEY_free(long j);

    public static native long EVP_PKEY_new_EC_KEY(NativeRef$EC_GROUP nativeRef$EC_GROUP, NativeRef$EC_POINT nativeRef$EC_POINT, byte[] bArr);

    public static native long EVP_PKEY_new_RSA(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8);

    public static native String EVP_PKEY_print_params(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native String EVP_PKEY_print_public(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native int EVP_PKEY_type(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native long EVP_aead_aes_128_gcm();

    public static native long EVP_aead_aes_128_gcm_siv();

    public static native long EVP_aead_aes_256_gcm();

    public static native long EVP_aead_aes_256_gcm_siv();

    public static native long EVP_aead_chacha20_poly1305();

    public static native long EVP_get_cipherbyname(String str);

    public static native long EVP_get_digestbyname(String str);

    public static native int EVP_has_aes_hardware();

    public static native byte[] EVP_marshal_private_key(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native byte[] EVP_marshal_public_key(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native long EVP_parse_private_key(byte[] bArr);

    public static native long EVP_parse_public_key(byte[] bArr);

    public static native byte[] EVP_raw_X25519_private_key(byte[] bArr);

    public static native void HMAC_CTX_free(long j);

    public static native long HMAC_CTX_new();

    public static native byte[] HMAC_Final(NativeRef$HMAC_CTX nativeRef$HMAC_CTX);

    public static native void HMAC_Init_ex(NativeRef$HMAC_CTX nativeRef$HMAC_CTX, byte[] bArr, long j);

    public static native void HMAC_Reset(NativeRef$HMAC_CTX nativeRef$HMAC_CTX);

    public static native void HMAC_Update(NativeRef$HMAC_CTX nativeRef$HMAC_CTX, byte[] bArr, int i, int i2);

    public static native void HMAC_UpdateDirect(NativeRef$HMAC_CTX nativeRef$HMAC_CTX, long j, int i);

    public static native long[] PEM_read_bio_PKCS7(long j, int i);

    public static native long PEM_read_bio_PUBKEY(long j);

    public static native long PEM_read_bio_PrivateKey(long j);

    public static native long PEM_read_bio_X509(long j);

    public static native long PEM_read_bio_X509_CRL(long j);

    public static native void RAND_bytes(byte[] bArr);

    public static native long RSA_generate_key_ex(int i, byte[] bArr);

    public static native int RSA_private_decrypt(int i, byte[] bArr, byte[] bArr2, NativeRef$EVP_PKEY nativeRef$EVP_PKEY, int i2);

    public static native int RSA_private_encrypt(int i, byte[] bArr, byte[] bArr2, NativeRef$EVP_PKEY nativeRef$EVP_PKEY, int i2);

    public static native int RSA_public_decrypt(int i, byte[] bArr, byte[] bArr2, NativeRef$EVP_PKEY nativeRef$EVP_PKEY, int i2);

    public static native int RSA_public_encrypt(int i, byte[] bArr, byte[] bArr2, NativeRef$EVP_PKEY nativeRef$EVP_PKEY, int i2);

    public static native int RSA_size(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native long SSL_BIO_new(long j, NativeSsl nativeSsl);

    public static native String SSL_CIPHER_get_kx_name(long j);

    public static native void SSL_CTX_free(long j, AbstractSessionContext abstractSessionContext);

    public static native long SSL_CTX_new();

    public static native void SSL_CTX_set_session_id_context(long j, AbstractSessionContext abstractSessionContext, byte[] bArr);

    public static native long SSL_CTX_set_timeout(long j, AbstractSessionContext abstractSessionContext, long j2);

    public static native String SSL_SESSION_cipher(long j);

    public static native void SSL_SESSION_free(long j);

    public static native long SSL_SESSION_get_time(long j);

    public static native long SSL_SESSION_get_timeout(long j);

    public static native String SSL_SESSION_get_version(long j);

    public static native byte[] SSL_SESSION_session_id(long j);

    public static native boolean SSL_SESSION_should_be_single_use(long j);

    public static native void SSL_SESSION_up_ref(long j);

    public static native void SSL_accept_renegotiations(long j, NativeSsl nativeSsl);

    public static native void SSL_clear_error();

    public static native long SSL_clear_mode(long j, NativeSsl nativeSsl, long j2);

    public static native long SSL_clear_options(long j, NativeSsl nativeSsl, long j2);

    public static native void SSL_do_handshake(long j, NativeSsl nativeSsl, FileDescriptor fileDescriptor, SSLHandshakeCallbacks sSLHandshakeCallbacks, int i);

    public static native void SSL_enable_ocsp_stapling(long j, NativeSsl nativeSsl);

    public static native void SSL_enable_signed_cert_timestamps(long j, NativeSsl nativeSsl);

    public static native void SSL_enable_tls_channel_id(long j, NativeSsl nativeSsl);

    public static native byte[] SSL_export_keying_material(long j, NativeSsl nativeSsl, byte[] bArr, byte[] bArr2, int i);

    public static native void SSL_free(long j, NativeSsl nativeSsl);

    public static native byte[][] SSL_get0_peer_certificates(long j, NativeSsl nativeSsl);

    public static native long SSL_get1_session(long j, NativeSsl nativeSsl);

    public static native long[] SSL_get_ciphers(long j, NativeSsl nativeSsl);

    public static native String SSL_get_current_cipher(long j, NativeSsl nativeSsl);

    public static native int SSL_get_error(long j, NativeSsl nativeSsl, int i);

    public static native long SSL_get_mode(long j, NativeSsl nativeSsl);

    public static native byte[] SSL_get_ocsp_response(long j, NativeSsl nativeSsl);

    public static native long SSL_get_options(long j, NativeSsl nativeSsl);

    public static native String SSL_get_servername(long j, NativeSsl nativeSsl);

    public static native int SSL_get_shutdown(long j, NativeSsl nativeSsl);

    public static native int SSL_get_signature_algorithm_key_type(int i);

    public static native byte[] SSL_get_signed_cert_timestamp_list(long j, NativeSsl nativeSsl);

    public static native long SSL_get_time(long j, NativeSsl nativeSsl);

    public static native long SSL_get_timeout(long j, NativeSsl nativeSsl);

    public static native byte[] SSL_get_tls_channel_id(long j, NativeSsl nativeSsl);

    public static native byte[] SSL_get_tls_unique(long j, NativeSsl nativeSsl);

    public static native String SSL_get_version(long j, NativeSsl nativeSsl);

    public static native void SSL_interrupt(long j, NativeSsl nativeSsl);

    public static native int SSL_max_seal_overhead(long j, NativeSsl nativeSsl);

    public static native long SSL_new(long j, AbstractSessionContext abstractSessionContext);

    public static native int SSL_pending_readable_bytes(long j, NativeSsl nativeSsl);

    public static native int SSL_pending_written_bytes_in_BIO(long j);

    public static native int SSL_read(long j, NativeSsl nativeSsl, FileDescriptor fileDescriptor, SSLHandshakeCallbacks sSLHandshakeCallbacks, byte[] bArr, int i, int i2, int i3);

    public static native byte[] SSL_session_id(long j, NativeSsl nativeSsl);

    public static native boolean SSL_session_reused(long j, NativeSsl nativeSsl);

    public static native void SSL_set1_tls_channel_id(long j, NativeSsl nativeSsl, NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native void SSL_set_accept_state(long j, NativeSsl nativeSsl);

    public static native void SSL_set_cipher_lists(long j, NativeSsl nativeSsl, String[] strArr);

    public static native void SSL_set_client_CA_list(long j, NativeSsl nativeSsl, byte[][] bArr);

    public static native void SSL_set_connect_state(long j, NativeSsl nativeSsl);

    public static native long SSL_set_mode(long j, NativeSsl nativeSsl, long j2);

    public static native void SSL_set_ocsp_response(long j, NativeSsl nativeSsl, byte[] bArr);

    public static native long SSL_set_options(long j, NativeSsl nativeSsl, long j2);

    public static native int SSL_set_protocol_versions(long j, NativeSsl nativeSsl, int i, int i2);

    public static native void SSL_set_session(long j, NativeSsl nativeSsl, long j2);

    public static native void SSL_set_session_creation_enabled(long j, NativeSsl nativeSsl, boolean z);

    public static native void SSL_set_signed_cert_timestamp_list(long j, NativeSsl nativeSsl, byte[] bArr);

    public static native long SSL_set_timeout(long j, NativeSsl nativeSsl, long j2);

    public static native void SSL_set_tlsext_host_name(long j, NativeSsl nativeSsl, String str);

    public static native void SSL_set_verify(long j, NativeSsl nativeSsl, int i);

    public static native void SSL_shutdown(long j, NativeSsl nativeSsl, FileDescriptor fileDescriptor, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    public static native void SSL_use_psk_identity_hint(long j, NativeSsl nativeSsl, String str);

    public static native void SSL_write(long j, NativeSsl nativeSsl, FileDescriptor fileDescriptor, SSLHandshakeCallbacks sSLHandshakeCallbacks, byte[] bArr, int i, int i2, int i3);

    public static native byte[] Scrypt_generate_key(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4);

    public static native boolean X25519(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native void X25519_keypair(byte[] bArr, byte[] bArr2);

    public static native void X509_CRL_free(long j, OpenSSLX509CRL openSSLX509CRL);

    public static native long X509_CRL_get0_by_cert(long j, OpenSSLX509CRL openSSLX509CRL, long j2, OpenSSLX509Certificate openSSLX509Certificate);

    public static native long X509_CRL_get0_by_serial(long j, OpenSSLX509CRL openSSLX509CRL, byte[] bArr);

    public static native long[] X509_CRL_get_REVOKED(long j, OpenSSLX509CRL openSSLX509CRL);

    public static native long X509_CRL_get_ext(long j, OpenSSLX509CRL openSSLX509CRL, String str);

    public static native byte[] X509_CRL_get_ext_oid(long j, OpenSSLX509CRL openSSLX509CRL, String str);

    public static native byte[] X509_CRL_get_issuer_name(long j, OpenSSLX509CRL openSSLX509CRL);

    public static native long X509_CRL_get_lastUpdate(long j, OpenSSLX509CRL openSSLX509CRL);

    public static native long X509_CRL_get_nextUpdate(long j, OpenSSLX509CRL openSSLX509CRL);

    public static native long X509_CRL_get_version(long j, OpenSSLX509CRL openSSLX509CRL);

    public static native void X509_CRL_print(long j, long j2, OpenSSLX509CRL openSSLX509CRL);

    public static native void X509_CRL_verify(long j, OpenSSLX509CRL openSSLX509CRL, NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native long X509_REVOKED_dup(long j);

    public static native long X509_REVOKED_get_ext(long j, String str);

    public static native byte[] X509_REVOKED_get_ext_oid(long j, String str);

    public static native byte[] X509_REVOKED_get_serialNumber(long j);

    public static native void X509_REVOKED_print(long j, long j2);

    public static native int X509_check_issued(long j, OpenSSLX509Certificate openSSLX509Certificate, long j2, OpenSSLX509Certificate openSSLX509Certificate2);

    public static native int X509_cmp(long j, OpenSSLX509Certificate openSSLX509Certificate, long j2, OpenSSLX509Certificate openSSLX509Certificate2);

    public static native void X509_free(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native byte[] X509_get_ext_oid(long j, OpenSSLX509Certificate openSSLX509Certificate, String str);

    public static native byte[] X509_get_issuer_name(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native long X509_get_notAfter(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native long X509_get_notBefore(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native long X509_get_pubkey(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native byte[] X509_get_serialNumber(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native byte[] X509_get_subject_name(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native long X509_get_version(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native void X509_print_ex(long j, long j2, OpenSSLX509Certificate openSSLX509Certificate, long j3, long j4);

    public static native int X509_supported_extension(long j);

    public static native void X509_verify(long j, OpenSSLX509Certificate openSSLX509Certificate, NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native void asn1_read_free(long j);

    public static native long asn1_read_init(byte[] bArr);

    public static native boolean asn1_read_is_empty(long j);

    public static native boolean asn1_read_next_tag_is(long j, int i);

    public static native void asn1_read_null(long j);

    public static native byte[] asn1_read_octetstring(long j);

    public static native String asn1_read_oid(long j);

    public static native long asn1_read_sequence(long j);

    public static native long asn1_read_tagged(long j);

    public static native long asn1_read_uint64(long j);

    public static native void asn1_write_cleanup(long j);

    public static native byte[] asn1_write_finish(long j);

    public static native void asn1_write_flush(long j);

    public static native void asn1_write_free(long j);

    public static native long asn1_write_init();

    public static native void asn1_write_null(long j);

    public static native void asn1_write_octetstring(long j, byte[] bArr);

    public static native void asn1_write_oid(long j, String str);

    public static native long asn1_write_sequence(long j);

    public static native long asn1_write_tag(long j, int i);

    public static native void asn1_write_uint64(long j, long j2);

    public static native void chacha20_encrypt_decrypt(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, byte[] bArr4, int i4);

    private static native void clinit();

    public static native long create_BIO_InputStream(OpenSSLBIOInputStream openSSLBIOInputStream, boolean z);

    public static native long create_BIO_OutputStream(OutputStream outputStream);

    public static native long[] d2i_PKCS7_bio(long j, int i);

    public static native long d2i_SSL_SESSION(byte[] bArr);

    public static native long d2i_X509(byte[] bArr);

    public static native long d2i_X509_CRL_bio(long j);

    public static native long d2i_X509_bio(long j);

    public static native byte[] getApplicationProtocol(long j, NativeSsl nativeSsl);

    public static native long getDirectBufferAddress(Buffer buffer);

    public static native long getECPrivateKeyWrapper(PrivateKey privateKey, NativeRef$EC_GROUP nativeRef$EC_GROUP);

    public static native long getRSAPrivateKeyWrapper(PrivateKey privateKey, byte[] bArr);

    public static native int get_EVP_CIPHER_CTX_buf_len(NativeRef$EVP_CIPHER_CTX nativeRef$EVP_CIPHER_CTX);

    public static native boolean get_EVP_CIPHER_CTX_final_used(NativeRef$EVP_CIPHER_CTX nativeRef$EVP_CIPHER_CTX);

    public static native byte[][] get_RSA_private_params(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native byte[][] get_RSA_public_params(NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native byte[] get_X509_CRL_crl_enc(long j, OpenSSLX509CRL openSSLX509CRL);

    public static native String[] get_X509_CRL_ext_oids(long j, OpenSSLX509CRL openSSLX509CRL, int i);

    public static native String get_X509_CRL_sig_alg_oid(long j, OpenSSLX509CRL openSSLX509CRL);

    public static native byte[] get_X509_CRL_sig_alg_parameter(long j, OpenSSLX509CRL openSSLX509CRL);

    public static native byte[] get_X509_CRL_signature(long j, OpenSSLX509CRL openSSLX509CRL);

    public static native Object[][] get_X509_GENERAL_NAME_stack(long j, OpenSSLX509Certificate openSSLX509Certificate, int i);

    public static native String[] get_X509_REVOKED_ext_oids(long j, int i);

    public static native long get_X509_REVOKED_revocationDate(long j);

    public static native int get_X509_ex_flags(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native boolean[] get_X509_ex_kusage(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native int get_X509_ex_pathlen(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native String[] get_X509_ex_xkusage(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native String[] get_X509_ext_oids(long j, OpenSSLX509Certificate openSSLX509Certificate, int i);

    public static native boolean[] get_X509_issuerUID(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native String get_X509_pubkey_oid(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native String get_X509_sig_alg_oid(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native byte[] get_X509_sig_alg_parameter(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native byte[] get_X509_signature(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native boolean[] get_X509_subjectUID(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native byte[] get_X509_tbs_cert(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native byte[] get_X509_tbs_cert_without_ext(long j, OpenSSLX509Certificate openSSLX509Certificate, String str);

    public static native String[] get_cipher_names(String str);

    public static native byte[] get_ocsp_single_extension(byte[] bArr, String str, long j, OpenSSLX509Certificate openSSLX509Certificate, long j2, OpenSSLX509Certificate openSSLX509Certificate2);

    public static native byte[] i2d_PKCS7(long[] jArr);

    public static native byte[] i2d_SSL_SESSION(long j);

    public static native byte[] i2d_X509(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native byte[] i2d_X509_CRL(long j, OpenSSLX509CRL openSSLX509CRL);

    public static native byte[] i2d_X509_PUBKEY(long j, OpenSSLX509Certificate openSSLX509Certificate);

    public static native byte[] i2d_X509_REVOKED(long j);

    public static native void setApplicationProtocols(long j, NativeSsl nativeSsl, boolean z, byte[] bArr);

    public static native void setHasApplicationProtocolSelector(long j, NativeSsl nativeSsl, boolean z);

    public static native void setLocalCertsAndPrivateKey(long j, NativeSsl nativeSsl, byte[][] bArr, NativeRef$EVP_PKEY nativeRef$EVP_PKEY);

    public static native void set_SSL_psk_client_callback_enabled(long j, NativeSsl nativeSsl, boolean z);

    public static native void set_SSL_psk_server_callback_enabled(long j, NativeSsl nativeSsl, boolean z);

    public static native boolean usesBoringSsl_FIPS_mode();

    /* JADX INFO: renamed from: ۟ۢۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m13024() {
        if (C0039.m4109() >= 0) {
            clinit();
        }
    }

    /* JADX INFO: renamed from: ۢۡۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m13025() {
        if (C0030.m2940() >= 0) {
            return f573short;
        }
        return null;
    }
}
