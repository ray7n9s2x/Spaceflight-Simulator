package com.unity.androidnotifications;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
class UnityNotificationUtilities {
    private static final int INTENT_SERIALIZATION_VERSION = 0;
    private static final int NOTIFICATION_SERIALIZATION_VERSION = 3;
    static final String SAVED_NOTIFICATION_FALLBACK_KEY = "fallback.data";
    static final String SAVED_NOTIFICATION_PRIMARY_KEY = "data";
    static final byte[] UNITY_MAGIC_NUMBER = {85, 77, 78, 78};
    private static final byte[] UNITY_MAGIC_NUMBER_PARCELLED = {85, 77, 78, 80};

    UnityNotificationUtilities() {
    }

    protected static int findResourceIdInContextByName(Context context, String str) {
        if (str == null) {
            return 0;
        }
        try {
            Resources resources = context.getResources();
            if (resources != null) {
                int identifier = resources.getIdentifier(str, "mipmap", context.getPackageName());
                return identifier == 0 ? resources.getIdentifier(str, "drawable", context.getPackageName()) : identifier;
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    protected static void serializeNotification(SharedPreferences sharedPreferences, Notification notification, boolean z) {
        String strEncodeToString;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (z) {
                Intent intent = new Intent();
                intent.putExtra(UnityNotificationManager.KEY_NOTIFICATION, notification);
                if (!serializeNotificationParcel(intent, dataOutputStream)) {
                    return;
                }
                dataOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                strEncodeToString = Base64.encodeToString(byteArray, 0, byteArray.length, 0);
            } else {
                if (!serializeNotificationCustom(notification, dataOutputStream)) {
                    return;
                }
                dataOutputStream.flush();
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                strEncodeToString = Base64.encodeToString(byteArray2, 0, byteArray2.length, 0);
            }
            SharedPreferences.Editor editorClear = sharedPreferences.edit().clear();
            editorClear.putString("data", strEncodeToString);
            editorClear.apply();
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to serialize notification", e);
        }
    }

    static boolean serializeNotificationParcel(Intent intent, DataOutputStream dataOutputStream) {
        try {
            byte[] bArrSerializeParcelable = serializeParcelable(intent);
            if (bArrSerializeParcelable != null && bArrSerializeParcelable.length != 0) {
                dataOutputStream.write(UNITY_MAGIC_NUMBER_PARCELLED);
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(bArrSerializeParcelable.length);
                dataOutputStream.write(bArrSerializeParcelable);
                return true;
            }
            return false;
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to serialize notification as Parcel", e);
            return false;
        } catch (OutOfMemoryError e2) {
            Log.e("UnityNotifications", "Failed to serialize notification as Parcel", e2);
            return false;
        }
    }

    private static boolean serializeNotificationCustom(Notification notification, DataOutputStream dataOutputStream) {
        try {
            dataOutputStream.write(UNITY_MAGIC_NUMBER);
            dataOutputStream.writeInt(3);
            boolean z = notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_WHEN, false);
            dataOutputStream.writeInt(notification.extras.getInt(UnityNotificationManager.KEY_ID));
            serializeString(dataOutputStream, notification.extras.getString(NotificationCompat.EXTRA_TITLE));
            serializeString(dataOutputStream, notification.extras.getString(NotificationCompat.EXTRA_TEXT));
            serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_SMALL_ICON));
            serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_LARGE_ICON));
            dataOutputStream.writeLong(notification.extras.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L));
            dataOutputStream.writeLong(notification.extras.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L));
            serializeString(dataOutputStream, notification.extras.getString(NotificationCompat.EXTRA_BIG_TEXT));
            dataOutputStream.writeBoolean(notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_CHRONOMETER, false));
            dataOutputStream.writeBoolean(z);
            serializeString(dataOutputStream, notification.extras.getString("data"));
            dataOutputStream.writeBoolean(notification.extras.getBoolean(UnityNotificationManager.KEY_SHOW_IN_FOREGROUND, true));
            String string = notification.extras.getString(UnityNotificationManager.KEY_BIG_PICTURE);
            serializeString(dataOutputStream, string);
            if (string != null && string.length() > 0) {
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_LARGE_ICON));
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_CONTENT_TITLE));
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_CONTENT_DESCRIPTION));
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_SUMMARY_TEXT));
                dataOutputStream.writeBoolean(notification.extras.getBoolean(UnityNotificationManager.KEY_BIG_SHOW_WHEN_COLLAPSED, false));
            }
            serializeString(dataOutputStream, Build.VERSION.SDK_INT < 26 ? null : notification.getChannelId());
            Integer notificationColor = UnityNotificationManager.getNotificationColor(notification);
            dataOutputStream.writeBoolean(notificationColor != null);
            if (notificationColor != null) {
                dataOutputStream.writeInt(notificationColor.intValue());
            }
            dataOutputStream.writeInt(notification.number);
            dataOutputStream.writeBoolean((notification.flags & 16) != 0);
            serializeString(dataOutputStream, notification.getGroup());
            dataOutputStream.writeBoolean((notification.flags & 512) != 0);
            dataOutputStream.writeInt(UnityNotificationManager.getNotificationGroupAlertBehavior(notification));
            serializeString(dataOutputStream, notification.getSortKey());
            if (z) {
                dataOutputStream.writeLong(notification.when);
            }
            return true;
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to serialize notification", e);
            return false;
        }
    }

    static void serializeString(DataOutputStream dataOutputStream, String str) throws IOException {
        if (str == null || str.length() == 0) {
            dataOutputStream.writeInt(0);
            return;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
    }

    static byte[] serializeParcelable(Parcelable parcelable) {
        try {
            Parcel parcelObtain = Parcel.obtain();
            Bundle bundle = new Bundle();
            bundle.putParcelable("obj", parcelable);
            parcelObtain.writeParcelable(bundle, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to serialize Parcelable", e);
            return null;
        } catch (OutOfMemoryError e2) {
            Log.e("UnityNotifications", "Failed to serialize Parcelable", e2);
            return null;
        }
    }

    protected static Object deserializeNotification(Context context, SharedPreferences sharedPreferences) throws IOException {
        String string = sharedPreferences.getString("data", "");
        if (string != null && string.length() > 0) {
            Object objDeserializeNotification = deserializeNotification(context, Base64.decode(string, 0));
            if (objDeserializeNotification != null) {
                return objDeserializeNotification;
            }
            String string2 = sharedPreferences.getString(SAVED_NOTIFICATION_FALLBACK_KEY, "");
            if (string2 != null && string2.length() > 0) {
                return deserializeNotification(context, Base64.decode(string2, 0));
            }
        }
        return null;
    }

    private static Object deserializeNotification(Context context, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        Notification notificationDeserializeNotificationParcelable = deserializeNotificationParcelable(dataInputStream);
        if (notificationDeserializeNotificationParcelable != null) {
            return notificationDeserializeNotificationParcelable;
        }
        byteArrayInputStream.reset();
        Notification.Builder builderDeserializeNotificationCustom = deserializeNotificationCustom(context, dataInputStream);
        return builderDeserializeNotificationCustom == null ? deserializedFromOldIntent(context, bArr) : builderDeserializeNotificationCustom;
    }

    private static boolean readAndCheckMagicNumber(DataInputStream dataInputStream, byte[] bArr) {
        for (byte b : bArr) {
            try {
                if (dataInputStream.readByte() != b) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    private static Notification deserializeNotificationParcelable(DataInputStream dataInputStream) {
        int i;
        try {
            if (readAndCheckMagicNumber(dataInputStream, UNITY_MAGIC_NUMBER_PARCELLED) && (i = dataInputStream.readInt()) >= 0 && i <= 0) {
                return (Notification) ((Intent) deserializeParcelable(dataInputStream)).getParcelableExtra(UnityNotificationManager.KEY_NOTIFICATION);
            }
            return null;
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to deserialize notification intent", e);
            return null;
        } catch (OutOfMemoryError e2) {
            Log.e("UnityNotifications", "Failed to deserialize notification intent", e2);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:13|(2:104|15)(1:19)|20|(4:22|(1:24)(1:25)|(4:27|(1:33)(21:31|32|109|39|(1:41)(1:42)|43|(1:45)(1:46)|47|(1:49)(7:50|(1:52)|53|(1:55)|56|(1:58)|59)|(1:61)|(1:63)|64|(1:66)(1:(1:68))|(1:70)|(1:72)|73|(1:77)|78|(1:82)|(1:84)|85)|101|102)(1:34)|35)(2:37|38)|36|109|39|(0)(0)|43|(0)(0)|47|(0)(0)|(0)|(0)|64|(0)(0)|(0)|(0)|73|(2:75|77)|78|(2:80|82)|(0)|85) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x023b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x023d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0250, code lost:
    
        r2 = r19;
        r1 = r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0146 A[Catch: OutOfMemoryError -> 0x023b, Exception -> 0x023d, TryCatch #6 {Exception -> 0x023d, OutOfMemoryError -> 0x023b, blocks: (B:39:0x013c, B:41:0x0146, B:43:0x014d, B:45:0x0171, B:47:0x0178, B:49:0x0186, B:61:0x01d1, B:63:0x01d6, B:66:0x01dd, B:70:0x01f5, B:72:0x01fc, B:73:0x0201, B:75:0x020d, B:77:0x0213, B:78:0x0218, B:80:0x0224, B:82:0x022a, B:84:0x0231, B:68:0x01ec, B:50:0x018c, B:52:0x01a3, B:55:0x01b2, B:58:0x01bd, B:59:0x01c4), top: B:109:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0171 A[Catch: OutOfMemoryError -> 0x023b, Exception -> 0x023d, TryCatch #6 {Exception -> 0x023d, OutOfMemoryError -> 0x023b, blocks: (B:39:0x013c, B:41:0x0146, B:43:0x014d, B:45:0x0171, B:47:0x0178, B:49:0x0186, B:61:0x01d1, B:63:0x01d6, B:66:0x01dd, B:70:0x01f5, B:72:0x01fc, B:73:0x0201, B:75:0x020d, B:77:0x0213, B:78:0x0218, B:80:0x0224, B:82:0x022a, B:84:0x0231, B:68:0x01ec, B:50:0x018c, B:52:0x01a3, B:55:0x01b2, B:58:0x01bd, B:59:0x01c4), top: B:109:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0186 A[Catch: OutOfMemoryError -> 0x023b, Exception -> 0x023d, TryCatch #6 {Exception -> 0x023d, OutOfMemoryError -> 0x023b, blocks: (B:39:0x013c, B:41:0x0146, B:43:0x014d, B:45:0x0171, B:47:0x0178, B:49:0x0186, B:61:0x01d1, B:63:0x01d6, B:66:0x01dd, B:70:0x01f5, B:72:0x01fc, B:73:0x0201, B:75:0x020d, B:77:0x0213, B:78:0x0218, B:80:0x0224, B:82:0x022a, B:84:0x0231, B:68:0x01ec, B:50:0x018c, B:52:0x01a3, B:55:0x01b2, B:58:0x01bd, B:59:0x01c4), top: B:109:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018c A[Catch: OutOfMemoryError -> 0x023b, Exception -> 0x023d, TryCatch #6 {Exception -> 0x023d, OutOfMemoryError -> 0x023b, blocks: (B:39:0x013c, B:41:0x0146, B:43:0x014d, B:45:0x0171, B:47:0x0178, B:49:0x0186, B:61:0x01d1, B:63:0x01d6, B:66:0x01dd, B:70:0x01f5, B:72:0x01fc, B:73:0x0201, B:75:0x020d, B:77:0x0213, B:78:0x0218, B:80:0x0224, B:82:0x022a, B:84:0x0231, B:68:0x01ec, B:50:0x018c, B:52:0x01a3, B:55:0x01b2, B:58:0x01bd, B:59:0x01c4), top: B:109:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d1 A[Catch: OutOfMemoryError -> 0x023b, Exception -> 0x023d, TryCatch #6 {Exception -> 0x023d, OutOfMemoryError -> 0x023b, blocks: (B:39:0x013c, B:41:0x0146, B:43:0x014d, B:45:0x0171, B:47:0x0178, B:49:0x0186, B:61:0x01d1, B:63:0x01d6, B:66:0x01dd, B:70:0x01f5, B:72:0x01fc, B:73:0x0201, B:75:0x020d, B:77:0x0213, B:78:0x0218, B:80:0x0224, B:82:0x022a, B:84:0x0231, B:68:0x01ec, B:50:0x018c, B:52:0x01a3, B:55:0x01b2, B:58:0x01bd, B:59:0x01c4), top: B:109:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6 A[Catch: OutOfMemoryError -> 0x023b, Exception -> 0x023d, TryCatch #6 {Exception -> 0x023d, OutOfMemoryError -> 0x023b, blocks: (B:39:0x013c, B:41:0x0146, B:43:0x014d, B:45:0x0171, B:47:0x0178, B:49:0x0186, B:61:0x01d1, B:63:0x01d6, B:66:0x01dd, B:70:0x01f5, B:72:0x01fc, B:73:0x0201, B:75:0x020d, B:77:0x0213, B:78:0x0218, B:80:0x0224, B:82:0x022a, B:84:0x0231, B:68:0x01ec, B:50:0x018c, B:52:0x01a3, B:55:0x01b2, B:58:0x01bd, B:59:0x01c4), top: B:109:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01dd A[Catch: OutOfMemoryError -> 0x023b, Exception -> 0x023d, TryCatch #6 {Exception -> 0x023d, OutOfMemoryError -> 0x023b, blocks: (B:39:0x013c, B:41:0x0146, B:43:0x014d, B:45:0x0171, B:47:0x0178, B:49:0x0186, B:61:0x01d1, B:63:0x01d6, B:66:0x01dd, B:70:0x01f5, B:72:0x01fc, B:73:0x0201, B:75:0x020d, B:77:0x0213, B:78:0x0218, B:80:0x0224, B:82:0x022a, B:84:0x0231, B:68:0x01ec, B:50:0x018c, B:52:0x01a3, B:55:0x01b2, B:58:0x01bd, B:59:0x01c4), top: B:109:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f5 A[Catch: OutOfMemoryError -> 0x023b, Exception -> 0x023d, TryCatch #6 {Exception -> 0x023d, OutOfMemoryError -> 0x023b, blocks: (B:39:0x013c, B:41:0x0146, B:43:0x014d, B:45:0x0171, B:47:0x0178, B:49:0x0186, B:61:0x01d1, B:63:0x01d6, B:66:0x01dd, B:70:0x01f5, B:72:0x01fc, B:73:0x0201, B:75:0x020d, B:77:0x0213, B:78:0x0218, B:80:0x0224, B:82:0x022a, B:84:0x0231, B:68:0x01ec, B:50:0x018c, B:52:0x01a3, B:55:0x01b2, B:58:0x01bd, B:59:0x01c4), top: B:109:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fc A[Catch: OutOfMemoryError -> 0x023b, Exception -> 0x023d, TryCatch #6 {Exception -> 0x023d, OutOfMemoryError -> 0x023b, blocks: (B:39:0x013c, B:41:0x0146, B:43:0x014d, B:45:0x0171, B:47:0x0178, B:49:0x0186, B:61:0x01d1, B:63:0x01d6, B:66:0x01dd, B:70:0x01f5, B:72:0x01fc, B:73:0x0201, B:75:0x020d, B:77:0x0213, B:78:0x0218, B:80:0x0224, B:82:0x022a, B:84:0x0231, B:68:0x01ec, B:50:0x018c, B:52:0x01a3, B:55:0x01b2, B:58:0x01bd, B:59:0x01c4), top: B:109:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0231 A[Catch: OutOfMemoryError -> 0x023b, Exception -> 0x023d, TRY_LEAVE, TryCatch #6 {Exception -> 0x023d, OutOfMemoryError -> 0x023b, blocks: (B:39:0x013c, B:41:0x0146, B:43:0x014d, B:45:0x0171, B:47:0x0178, B:49:0x0186, B:61:0x01d1, B:63:0x01d6, B:66:0x01dd, B:70:0x01f5, B:72:0x01fc, B:73:0x0201, B:75:0x020d, B:77:0x0213, B:78:0x0218, B:80:0x0224, B:82:0x022a, B:84:0x0231, B:68:0x01ec, B:50:0x018c, B:52:0x01a3, B:55:0x01b2, B:58:0x01bd, B:59:0x01c4), top: B:109:0x013c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.app.Notification.Builder deserializeNotificationCustom(android.content.Context r48, java.io.DataInputStream r49) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity.androidnotifications.UnityNotificationUtilities.deserializeNotificationCustom(android.content.Context, java.io.DataInputStream):android.app.Notification$Builder");
    }

    private static Notification.Builder deserializedFromOldIntent(Context context, byte[] bArr) {
        String str;
        String str2;
        String str3;
        String str4;
        String string;
        try {
            try {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.unmarshall(bArr, 0, bArr.length);
                    parcelObtain.setDataPosition(0);
                    Bundle bundle = new Bundle();
                    bundle.readFromParcel(parcelObtain);
                    int i = bundle.getInt(UnityNotificationManager.KEY_ID, -1);
                    String string2 = bundle.getString(UnityNotificationManager.KEY_CHANNEL_ID);
                    String string3 = bundle.getString("textTitle");
                    String string4 = bundle.getString("textContent");
                    String string5 = bundle.getString("smallIconStr");
                    boolean z = bundle.getBoolean("autoCancel", false);
                    boolean z2 = bundle.getBoolean("usesChronometer", false);
                    long j = bundle.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L);
                    long j2 = bundle.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L);
                    str = "Failed to deserialize old style notification";
                    try {
                        string = bundle.getString("largeIconStr");
                        str4 = "UnityNotifications";
                    } catch (Exception e) {
                        e = e;
                        str4 = "UnityNotifications";
                        str2 = str;
                        str3 = str4;
                        Log.e(str3, str2, e);
                        return null;
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        str4 = "UnityNotifications";
                        Log.e(str4, str, e);
                        return null;
                    }
                    try {
                        int i2 = bundle.getInt("style", -1);
                        int i3 = bundle.getInt("color", 0);
                        int i4 = bundle.getInt("number", 0);
                        String string6 = bundle.getString("data");
                        String string7 = bundle.getString("group");
                        boolean z3 = bundle.getBoolean("groupSummary", false);
                        String string8 = bundle.getString("sortKey");
                        int i5 = bundle.getInt("groupAlertBehaviour", -1);
                        boolean z4 = bundle.getBoolean("showTimestamp", false);
                        Notification.Builder builderCreateNotificationBuilder = UnityNotificationManager.getNotificationManagerImpl(context).createNotificationBuilder(string2);
                        builderCreateNotificationBuilder.getExtras().putInt(UnityNotificationManager.KEY_ID, i);
                        builderCreateNotificationBuilder.setContentTitle(string3);
                        builderCreateNotificationBuilder.setContentText(string4);
                        UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, string5);
                        builderCreateNotificationBuilder.setAutoCancel(z);
                        builderCreateNotificationBuilder.setUsesChronometer(z2);
                        builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, j);
                        builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, j2);
                        UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, string);
                        if (i2 == 2) {
                            builderCreateNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(string4));
                        }
                        if (i3 != 0) {
                            UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, i3);
                        }
                        if (i4 >= 0) {
                            builderCreateNotificationBuilder.setNumber(i4);
                        }
                        if (string6 != null) {
                            builderCreateNotificationBuilder.getExtras().putString("data", string6);
                        }
                        if (string7 != null && string7.length() > 0) {
                            builderCreateNotificationBuilder.setGroup(string7);
                        }
                        builderCreateNotificationBuilder.setGroupSummary(z3);
                        if (string8 != null && string8.length() > 0) {
                            builderCreateNotificationBuilder.setSortKey(string8);
                        }
                        UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, i5);
                        builderCreateNotificationBuilder.setShowWhen(z4);
                        return builderCreateNotificationBuilder;
                    } catch (Exception e3) {
                        e = e3;
                        str2 = str;
                        str3 = str4;
                        Log.e(str3, str2, e);
                        return null;
                    } catch (OutOfMemoryError e4) {
                        e = e4;
                        Log.e(str4, str, e);
                        return null;
                    }
                } catch (Exception e5) {
                    e = e5;
                    str = "Failed to deserialize old style notification";
                }
            } catch (OutOfMemoryError e6) {
                e = e6;
                str = "Failed to deserialize old style notification";
            }
        } catch (Exception e7) {
            e = e7;
            str2 = "Failed to deserialize old style notification";
            str3 = "UnityNotifications";
        }
    }

    private static String deserializeString(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        if (dataInputStream.read(bArr) != i) {
            throw new IOException("Insufficient amount of bytes read");
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    private static <T extends Parcelable> T deserializeParcelable(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        if (dataInputStream.read(bArr) != i) {
            throw new IOException("Insufficient amount of bytes read");
        }
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArr, 0, i);
            parcelObtain.setDataPosition(0);
            Bundle bundle = (Bundle) parcelObtain.readParcelable(UnityNotificationUtilities.class.getClassLoader());
            parcelObtain.recycle();
            if (bundle != null) {
                return (T) bundle.getParcelable("obj");
            }
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to deserialize parcelable", e);
        } catch (OutOfMemoryError e2) {
            Log.e("UnityNotifications", "Failed to deserialize parcelable", e2);
        }
        return null;
    }

    protected static Class<?> getOpenAppActivity(Context context) {
        try {
            try {
                PackageManager packageManager = context.getPackageManager();
                Bundle bundle = packageManager.getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("custom_notification_android_activity")) {
                    try {
                        return Class.forName(bundle.getString("custom_notification_android_activity"));
                    } catch (ClassNotFoundException e) {
                        Log.e("UnityNotifications", "Specified activity class for notifications not found: " + e.getMessage());
                    }
                }
                Log.w("UnityNotifications", "No custom_notification_android_activity found, attempting to find app activity class");
                boolean z = true;
                ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(context.getPackageName(), 1).activities;
                if (activityInfoArr == null) {
                    Log.e("UnityNotifications", "Could not get package activities");
                    return null;
                }
                int length = activityInfoArr.length;
                String str = null;
                int i = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    if (i >= length) {
                        z = z3;
                        break;
                    }
                    ActivityInfo activityInfo = activityInfoArr[i];
                    if (activityInfo.enabled && activityInfo.targetActivity == null) {
                        boolean zIsUnityActivity = isUnityActivity(activityInfo.name);
                        if (str == null) {
                            str = activityInfo.name;
                        } else if (z2 == zIsUnityActivity) {
                            if (z2 && zIsUnityActivity) {
                                break;
                            }
                            z3 = true;
                        } else if (zIsUnityActivity) {
                            str = activityInfo.name;
                            z3 = false;
                        }
                        z2 = zIsUnityActivity;
                    }
                    i++;
                }
                if (z) {
                    Log.e("UnityNotifications", "Multiple choices for activity for notifications, set activity explicitly in Notification Settings");
                    return null;
                }
                if (str != null) {
                    return Class.forName(str);
                }
                Log.e("UnityNotifications", "Activity class for notifications not found");
                return null;
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                return null;
            }
        } catch (ClassNotFoundException e3) {
            Log.e("UnityNotifications", "Failed to find activity class: " + e3.getMessage());
            return null;
        }
    }

    private static boolean isUnityActivity(String str) {
        return str.endsWith(".UnityPlayerActivity") || str.endsWith(".UnityPlayerGameActivity");
    }

    protected static Notification.Builder recoverBuilder(Context context, Notification notification) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notification);
                builderRecoverBuilder.setExtras(notification.extras);
                return builderRecoverBuilder;
            }
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to recover builder for notification!", e);
        } catch (OutOfMemoryError e2) {
            Log.e("UnityNotifications", "Failed to recover builder for notification!", e2);
        }
        return recoverBuilderCustom(context, notification);
    }

    private static Notification.Builder recoverBuilderCustom(Context context, Notification notification) {
        Notification.Builder builderCreateNotificationBuilder = UnityNotificationManager.getNotificationManagerImpl(context).createNotificationBuilder(notification.extras.getString(UnityNotificationManager.KEY_CHANNEL_ID));
        UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, notification.extras.getString(UnityNotificationManager.KEY_SMALL_ICON));
        String string = notification.extras.getString(UnityNotificationManager.KEY_LARGE_ICON);
        if (string != null && !string.isEmpty()) {
            UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, string);
        }
        builderCreateNotificationBuilder.setContentTitle(notification.extras.getString(NotificationCompat.EXTRA_TITLE));
        builderCreateNotificationBuilder.setContentText(notification.extras.getString(NotificationCompat.EXTRA_TEXT));
        builderCreateNotificationBuilder.setAutoCancel((notification.flags & 16) != 0);
        if (notification.number >= 0) {
            builderCreateNotificationBuilder.setNumber(notification.number);
        }
        String string2 = notification.extras.getString(NotificationCompat.EXTRA_BIG_TEXT);
        if (string2 != null) {
            builderCreateNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(string2));
        }
        builderCreateNotificationBuilder.setWhen(notification.when);
        String group = notification.getGroup();
        if (group != null && !group.isEmpty()) {
            builderCreateNotificationBuilder.setGroup(group);
        }
        builderCreateNotificationBuilder.setGroupSummary((notification.flags & 512) != 0);
        String sortKey = notification.getSortKey();
        if (sortKey != null && !sortKey.isEmpty()) {
            builderCreateNotificationBuilder.setSortKey(sortKey);
        }
        builderCreateNotificationBuilder.setShowWhen(notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_WHEN, false));
        Integer notificationColor = UnityNotificationManager.getNotificationColor(notification);
        if (notificationColor != null) {
            UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, notificationColor.intValue());
        }
        UnityNotificationManager.setNotificationUsesChronometer(builderCreateNotificationBuilder, notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_CHRONOMETER, false));
        UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, UnityNotificationManager.getNotificationGroupAlertBehavior(notification));
        builderCreateNotificationBuilder.getExtras().putInt(UnityNotificationManager.KEY_ID, notification.extras.getInt(UnityNotificationManager.KEY_ID, 0));
        builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, notification.extras.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, 0L));
        builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, notification.extras.getLong(UnityNotificationManager.KEY_FIRE_TIME, 0L));
        String string3 = notification.extras.getString("data");
        if (string3 != null && !string3.isEmpty()) {
            builderCreateNotificationBuilder.getExtras().putString("data", string3);
        }
        return builderCreateNotificationBuilder;
    }
}
