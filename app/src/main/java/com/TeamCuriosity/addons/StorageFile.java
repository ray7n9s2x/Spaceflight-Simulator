package com.teamcuriosity.addons;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.teamcuriosity.addons.IStorageObject;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class StorageFile implements IStorageObject {
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

    public StorageFile(ContentResolver contentResolver, StorageFolder storageFolder, Uri uri, DocLocation docLocation, String str, String str2) {
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
        DocLocation docLocationFindChildDocument = Utils.findChildDocument(this.resolver, this.treeUri, this.parent.getDocUri(), this.name, false);
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

    public long getSize() {
        int columnIndex;
        if (!exists()) {
            throw new IllegalStateException("File does not exist: " + this.path);
        }
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.resolver.query(this.location.docUri, new String[]{"_size"}, "document_id = ?", new String[]{this.location.docId}, null);
            if (cursorQuery != null && cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_size")) != -1) {
                return cursorQuery.getLong(columnIndex);
            }
            if (cursorQuery == null) {
                return -1L;
            }
            cursorQuery.close();
            return -1L;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public void createOrGetDocument() throws Exception {
        this.parent.create();
        if (exists()) {
            return;
        }
        if (DocumentsContract.createDocument(this.resolver, this.parent.getDocUri(), "application/octet-stream", this.name) == null) {
            throw new IllegalStateException("Failed to create file: " + this.name);
        }
        this.location = Utils.findChildDocument(this.resolver, this.treeUri, this.parent.getDocUri(), this.name, false);
    }

    public void writeBytes(byte[] bArr) throws Exception {
        if (bArr == null) {
            return;
        }
        if (!exists()) {
            throw new IllegalStateException("File does not exist: " + this.location.docUri);
        }
        OutputStream outputStream = null;
        try {
            OutputStream outputStreamOpenOutputStream = this.resolver.openOutputStream(this.location.docUri, "w");
            if (outputStreamOpenOutputStream == null) {
                throw new IllegalStateException("Failed to open output stream for: " + this.location.docUri);
            }
            outputStreamOpenOutputStream.write(bArr);
            outputStreamOpenOutputStream.flush();
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    public void appendBytes(byte[] bArr) throws Exception {
        if (bArr == null) {
            return;
        }
        if (!exists()) {
            throw new IllegalStateException("File does not exist: " + this.location.docUri);
        }
        OutputStream outputStream = null;
        try {
            OutputStream outputStreamOpenOutputStream = this.resolver.openOutputStream(this.location.docUri, "wa");
            if (outputStreamOpenOutputStream == null) {
                throw new IllegalStateException("Failed to open output stream for: " + this.location.docUri);
            }
            outputStreamOpenOutputStream.write(bArr);
            outputStreamOpenOutputStream.flush();
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    public byte[] readBytes() throws Exception {
        if (!exists()) {
            throw new IllegalStateException("File does not exist: " + this.path);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = this.resolver.openInputStream(this.location.docUri);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException("Failed to open input stream for: " + this.location.docUri);
            }
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStreamOpenInputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (Exception unused) {
                }
            }
            return byteArray;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }
}
