package com.teamcuriosity.addons;

import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: loaded from: classes2.dex */
public class Utils {
    public static Uri getRootDocumentUri(Uri uri) {
        return DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008e A[PHI: r7
  0x008e: PHI (r7v4 android.database.Cursor) = (r7v3 android.database.Cursor), (r7v5 android.database.Cursor) binds: [B:36:0x008c, B:27:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.teamcuriosity.addons.DocLocation findChildDocument(android.content.ContentResolver r7, android.net.Uri r8, android.net.Uri r9, java.lang.String r10, boolean r11) throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.String r9 = android.provider.DocumentsContract.getDocumentId(r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            android.net.Uri r2 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r8, r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r4 = "_display_name = ?"
            java.lang.String[] r5 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r9 = "document_id"
            java.lang.String r1 = "_display_name"
            java.lang.String r3 = "mime_type"
            java.lang.String r6 = "flags"
            java.lang.String[] r3 = new java.lang.String[]{r9, r1, r3, r6}     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r6 = 0
            r1 = r7
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            if (r7 != 0) goto L29
            if (r7 == 0) goto L28
            r7.close()
        L28:
            return r0
        L29:
            boolean r9 = r7.moveToNext()     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L92
            if (r9 == 0) goto L6d
            r9 = 0
            java.lang.String r1 = r7.getString(r9)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L92
            r2 = 1
            java.lang.String r3 = r7.getString(r2)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L92
            r4 = 2
            java.lang.String r4 = r7.getString(r4)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L92
            r5 = 3
            int r5 = r7.getInt(r5)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L92
            r5 = r5 & 8
            if (r5 == 0) goto L48
            r9 = r2
        L48:
            if (r9 != 0) goto L53
            java.lang.String r5 = "vnd.android.document/directory"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L92
            if (r4 == 0) goto L53
            goto L54
        L53:
            r2 = r9
        L54:
            if (r11 == r2) goto L57
            goto L29
        L57:
            boolean r9 = r10.equals(r3)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L92
            if (r9 != 0) goto L5e
            goto L29
        L5e:
            android.net.Uri r8 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r8, r1)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L92
            com.teamcuriosity.addons.DocLocation r9 = new com.teamcuriosity.addons.DocLocation     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L92
            r9.<init>(r8, r1)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L92
            if (r7 == 0) goto L6c
            r7.close()
        L6c:
            return r9
        L6d:
            if (r7 == 0) goto L91
            goto L8e
        L70:
            r8 = move-exception
            goto L76
        L72:
            r8 = move-exception
            goto L94
        L74:
            r8 = move-exception
            r7 = r0
        L76:
            java.lang.String r9 = "Unity"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r11.<init>()     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = "findChildDocument failed for "
            r11.append(r1)     // Catch: java.lang.Throwable -> L92
            r11.append(r10)     // Catch: java.lang.Throwable -> L92
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L92
            android.util.Log.e(r9, r10, r8)     // Catch: java.lang.Throwable -> L92
            if (r7 == 0) goto L91
        L8e:
            r7.close()
        L91:
            return r0
        L92:
            r8 = move-exception
            r0 = r7
        L94:
            if (r0 == 0) goto L99
            r0.close()
        L99:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.teamcuriosity.addons.Utils.findChildDocument(android.content.ContentResolver, android.net.Uri, android.net.Uri, java.lang.String, boolean):com.teamcuriosity.addons.DocLocation");
    }
}
