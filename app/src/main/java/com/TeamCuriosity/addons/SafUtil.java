package com.teamcuriosity.addons;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.UriPermission;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import com.unity3d.player.UnityPlayer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class SafUtil {
    private static final String TAG = "SafUtil";
    private static HashMap<String, StorageFolder> createdFolders = new HashMap<>();

    public static boolean isValidUri(String str) {
        if (str == null) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            Activity activity = UnityPlayer.currentActivity;
            if (activity == null || !DocumentsContract.isTreeUri(uri)) {
                return false;
            }
            ContentResolver contentResolver = activity.getContentResolver();
            for (UriPermission uriPermission : contentResolver.getPersistedUriPermissions()) {
                if (uriPermission.getUri().equals(uri) && uriPermission.isReadPermission() && uriPermission.isWritePermission()) {
                    return true;
                }
            }
            Cursor cursorQuery = contentResolver.query(DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(Utils.getRootDocumentUri(uri))), new String[]{"document_id"}, null, null, null);
            if (cursorQuery != null) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return true;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e) {
            Log.e(TAG, "IsValidUri failed", e);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.teamcuriosity.addons.StorageFolder getStorageFolder(java.lang.String r11) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            android.net.Uri r4 = android.net.Uri.parse(r11)     // Catch: java.lang.Exception -> L9a
            android.app.Activity r11 = com.unity3d.player.UnityPlayer.currentActivity     // Catch: java.lang.Exception -> L9a
            if (r11 != 0) goto Ld
            return r0
        Ld:
            android.content.ContentResolver r2 = r11.getContentResolver()     // Catch: java.lang.Exception -> L9a
            android.net.Uri r11 = com.teamcuriosity.addons.Utils.getRootDocumentUri(r4)     // Catch: java.lang.Exception -> L9a
            java.util.HashMap<java.lang.String, com.teamcuriosity.addons.StorageFolder> r1 = com.teamcuriosity.addons.SafUtil.createdFolders     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r11.toString()     // Catch: java.lang.Exception -> L9a
            boolean r1 = r1.containsKey(r3)     // Catch: java.lang.Exception -> L9a
            if (r1 == 0) goto L2e
            java.util.HashMap<java.lang.String, com.teamcuriosity.addons.StorageFolder> r1 = com.teamcuriosity.addons.SafUtil.createdFolders     // Catch: java.lang.Exception -> L9a
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L9a
            java.lang.Object r11 = r1.get(r11)     // Catch: java.lang.Exception -> L9a
            com.teamcuriosity.addons.StorageFolder r11 = (com.teamcuriosity.addons.StorageFolder) r11     // Catch: java.lang.Exception -> L9a
            return r11
        L2e:
            java.lang.String r1 = ""
            java.lang.String r3 = "_display_name"
            java.lang.String r5 = "document_id"
            java.lang.String[] r7 = new java.lang.String[]{r3, r5}     // Catch: java.lang.Throwable -> L92
            r9 = 0
            r10 = 0
            r8 = 0
            r5 = r2
            r6 = r11
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L92
            if (r3 == 0) goto L56
            boolean r5 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L56
            r1 = 0
            java.lang.String r1 = r3.getString(r1)     // Catch: java.lang.Throwable -> L54
            r5 = 1
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r11 = move-exception
            goto L94
        L56:
            r5 = r0
        L57:
            r7 = r1
            if (r3 == 0) goto L5d
            r3.close()     // Catch: java.lang.Exception -> L9a
        L5d:
            if (r5 == 0) goto L8a
            java.lang.String r1 = r4.getEncodedPath()     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "/"
            java.lang.String[] r1 = r1.split(r3)     // Catch: java.lang.Exception -> L72
            r3 = 2
            r1 = r1[r3]     // Catch: java.lang.Exception -> L72
            java.lang.String r1 = android.net.Uri.decode(r1)     // Catch: java.lang.Exception -> L72
            r6 = r1
            goto L73
        L72:
            r6 = r0
        L73:
            com.teamcuriosity.addons.StorageFolder r8 = new com.teamcuriosity.addons.StorageFolder     // Catch: java.lang.Exception -> L9a
            com.teamcuriosity.addons.DocLocation r9 = new com.teamcuriosity.addons.DocLocation     // Catch: java.lang.Exception -> L9a
            r9.<init>(r11, r5)     // Catch: java.lang.Exception -> L9a
            r3 = 0
            r1 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L9a
            java.util.HashMap<java.lang.String, com.teamcuriosity.addons.StorageFolder> r1 = com.teamcuriosity.addons.SafUtil.createdFolders     // Catch: java.lang.Exception -> L9a
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L9a
            r1.put(r11, r8)     // Catch: java.lang.Exception -> L9a
            return r8
        L8a:
            java.lang.Exception r11 = new java.lang.Exception     // Catch: java.lang.Exception -> L9a
            java.lang.String r1 = "Failed to query for root doc!"
            r11.<init>(r1)     // Catch: java.lang.Exception -> L9a
            throw r11     // Catch: java.lang.Exception -> L9a
        L92:
            r11 = move-exception
            r3 = r0
        L94:
            if (r3 == 0) goto L99
            r3.close()     // Catch: java.lang.Exception -> L9a
        L99:
            throw r11     // Catch: java.lang.Exception -> L9a
        L9a:
            r11 = move-exception
            java.lang.String r1 = "SafUtil"
            java.lang.String r2 = "GetStorageFolder failed"
            android.util.Log.e(r1, r2, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.teamcuriosity.addons.SafUtil.getStorageFolder(java.lang.String):com.teamcuriosity.addons.StorageFolder");
    }
}
