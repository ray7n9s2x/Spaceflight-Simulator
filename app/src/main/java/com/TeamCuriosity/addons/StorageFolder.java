package com.teamcuriosity.addons;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.teamcuriosity.addons.IStorageObject;

/* JADX INFO: loaded from: classes2.dex */
public class StorageFolder implements IStorageObject {
    private static final String TAG = "SafUtil";
    private DocLocation location;
    private final String name;
    private final StorageFolder parent;
    private final String path;
    private final ContentResolver resolver;
    private final Uri treeUri;

    @Override // com.teamcuriosity.addons.IStorageObject
    public /* synthetic */ boolean isDirectory() {
        return IStorageObject.CC.$default$isDirectory(this);
    }

    public StorageFolder(ContentResolver contentResolver, StorageFolder storageFolder, Uri uri, DocLocation docLocation, String str, String str2) {
        this.resolver = contentResolver;
        this.parent = storageFolder;
        this.treeUri = uri;
        this.location = docLocation;
        this.path = str;
        this.name = str2;
    }

    @Override // com.teamcuriosity.addons.IStorageObject
    public Uri getDocUri() {
        DocLocation docLocation = this.location;
        if (docLocation == null) {
            return null;
        }
        return docLocation.docUri;
    }

    @Override // com.teamcuriosity.addons.IStorageObject
    public String getLocation() {
        Uri docUri = getDocUri();
        if (docUri == null) {
            return null;
        }
        return docUri.toString();
    }

    @Override // com.teamcuriosity.addons.IStorageObject
    public String getPath() {
        return this.path;
    }

    @Override // com.teamcuriosity.addons.IStorageObject
    public String getName() {
        return this.name;
    }

    @Override // com.teamcuriosity.addons.IStorageObject
    public boolean exists() throws Throwable {
        if (this.location != null) {
            return true;
        }
        if (!this.parent.exists()) {
            return false;
        }
        DocLocation docLocationFindChildDocument = Utils.findChildDocument(this.resolver, this.treeUri, this.parent.getDocUri(), this.name, true);
        this.location = docLocationFindChildDocument;
        return docLocationFindChildDocument != null;
    }

    @Override // com.teamcuriosity.addons.IStorageObject
    public void delete() throws Exception {
        if (exists()) {
            DocumentsContract.deleteDocument(this.resolver, this.location.docUri);
            this.location = null;
        }
    }

    public long getLastModifiedTime() {
        int columnIndex;
        if (!exists()) {
            throw new IllegalStateException("File does not exist: " + this.path);
        }
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.resolver.query(this.location.docUri, new String[]{"last_modified"}, "document_id = ?", new String[]{this.location.docId}, null);
            if (cursorQuery != null && cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("last_modified")) != -1) {
                return cursorQuery.getLong(columnIndex);
            }
            if (cursorQuery == null) {
                return 0L;
            }
            cursorQuery.close();
            return 0L;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public void create() throws Exception {
        StorageFolder storageFolder = this.parent;
        if (storageFolder != null) {
            storageFolder.create();
        }
        if (exists()) {
            return;
        }
        StorageFolder storageFolder2 = this.parent;
        if (storageFolder2 == null) {
            throw new Exception("Parent ís null!");
        }
        try {
            if (DocumentsContract.createDocument(this.resolver, storageFolder2.getDocUri(), "vnd.android.document/directory", this.name) == null) {
                throw new Exception("Failed to create directory");
            }
            this.location = Utils.findChildDocument(this.resolver, this.treeUri, this.parent.getDocUri(), this.name, false);
        } catch (Exception e) {
            Log.e(TAG, "ensureDirectoryByPath: failed to create dir " + this.name, e);
        }
    }

    public StorageFile getFile(String str) {
        String str2;
        String str3 = this.path;
        if (str3 == null || str3.isEmpty()) {
            str2 = DomExceptionUtils.SEPARATOR + str;
        } else {
            str2 = this.path + DomExceptionUtils.SEPARATOR + str;
        }
        return new StorageFile(this.resolver, this, this.treeUri, exists() ? Utils.findChildDocument(this.resolver, this.treeUri, getDocUri(), str, false) : null, str2, str);
    }

    public StorageFolder getFolder(String str) {
        String str2;
        String str3 = this.path;
        if (str3 == null || str3.isEmpty()) {
            str2 = DomExceptionUtils.SEPARATOR + str;
        } else {
            str2 = this.path + DomExceptionUtils.SEPARATOR + str;
        }
        return new StorageFolder(this.resolver, this, this.treeUri, exists() ? Utils.findChildDocument(this.resolver, this.treeUri, getDocUri(), str, true) : null, str2, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00df A[PHI: r1
  0x00df: PHI (r1v4 android.database.Cursor) = (r1v3 android.database.Cursor), (r1v6 android.database.Cursor) binds: [B:43:0x00dd, B:37:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.teamcuriosity.addons.IStorageObject[] getChildren() {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.teamcuriosity.addons.StorageFolder.getChildren():com.teamcuriosity.addons.IStorageObject[]");
    }
}
