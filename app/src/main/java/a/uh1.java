package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uh1 extends a.uk1 {
    public final /* synthetic */ int b;
    public final android.content.Context c;
    public final android.net.Uri d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uh1(a.uk1 uk1Var, android.content.Context context, android.net.Uri uri, int i) {
        super(uk1Var);
        this.b = i;
        this.c = context;
        this.d = uri;
    }

    @Override // a.uk1
    public final boolean a() {
        android.net.Uri uri = this.d;
        android.content.Context context = this.c;
        switch (this.b) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a.b20.n(context, uri);
            default:
                return a.b20.n(context, uri);
        }
    }

    @Override // a.uk1
    public final a.uh1 b(java.lang.String str) {
        android.net.Uri uri;
        switch (this.b) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                throw new java.lang.UnsupportedOperationException();
            default:
                android.content.Context context = this.c;
                try {
                    uri = android.provider.DocumentsContract.createDocument(context.getContentResolver(), this.d, "vnd.android.document/directory", str);
                } catch (java.lang.Exception unused) {
                    uri = null;
                }
                if (uri != null) {
                    return new a.uh1(this, context, uri, 1);
                }
                return null;
        }
    }

    @Override // a.uk1
    public final java.lang.String d() {
        android.net.Uri uri = this.d;
        android.content.Context context = this.c;
        switch (this.b) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a.b20.V0(context, uri, "_display_name");
            default:
                return a.b20.V0(context, uri, "_display_name");
        }
    }

    @Override // a.uk1
    public final a.uk1[] f() {
        switch (this.b) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                throw new java.lang.UnsupportedOperationException();
            default:
                android.content.Context context = this.c;
                android.content.ContentResolver contentResolver = context.getContentResolver();
                android.net.Uri uri = this.d;
                android.net.Uri buildChildDocumentsUriUsingTree = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(uri, android.provider.DocumentsContract.getDocumentId(uri));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i = 1;
                android.database.Cursor cursor = null;
                try {
                    try {
                        cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new java.lang.String[]{"document_id"}, null, null, null);
                        while (cursor.moveToNext()) {
                            arrayList.add(android.provider.DocumentsContract.buildDocumentUriUsingTree(uri, cursor.getString(0)));
                        }
                    } catch (java.lang.Exception e) {
                        android.util.Log.w("DocumentFile", "Failed query: " + e);
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (java.lang.RuntimeException e2) {
                                throw e2;
                            }
                        }
                    }
                    try {
                        cursor.close();
                        android.net.Uri[] uriArr = (android.net.Uri[]) arrayList.toArray(new android.net.Uri[arrayList.size()]);
                        a.uk1[] uk1VarArr = new a.uk1[uriArr.length];
                        for (int i2 = 0; i2 < uriArr.length; i2++) {
                            uk1VarArr[i2] = new a.uh1(this, context, uriArr[i2], i);
                        }
                        return uk1VarArr;
                    } catch (java.lang.RuntimeException e3) {
                        throw e3;
                    }
                } catch (java.lang.Throwable th) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (java.lang.RuntimeException e4) {
                            throw e4;
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    throw th;
                }
        }
    }
    public boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: uh1.c");
    }
}
