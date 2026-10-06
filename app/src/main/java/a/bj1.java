package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bj1 extends a.vz implements android.view.View.OnClickListener {
    public static final /* synthetic */ int z = 0;
    public final int j;
    public final int k;
    public final android.view.LayoutInflater l;
    public final androidx.appcompat.widget.SearchView m;
    public final android.app.SearchableInfo n;
    public final android.content.Context o;
    public final java.util.WeakHashMap p;
    public final int q;
    public int r;
    public android.content.res.ColorStateList s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;

    public bj1(android.content.Context context, androidx.appcompat.widget.SearchView searchView, android.app.SearchableInfo searchableInfo, java.util.WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.d = true;
        this.e = null;
        this.c = false;
        this.f = -1;
        this.g = new a.uz(this);
        this.h = new a.sw0(1, this);
        this.k = suggestionRowLayout;
        this.j = suggestionRowLayout;
        this.l = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        this.r = 1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.m = searchView;
        this.n = searchableInfo;
        this.q = searchView.getSuggestionCommitIconResId();
        this.o = context;
        this.p = weakHashMap;
    }

    public static java.lang.String h(android.database.Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (java.lang.Exception e) {
            android.util.Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    @Override // a.vz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bj1.a(android.view.View, android.database.Cursor):void");
    }

    @Override // a.vz
    public final void b(android.database.Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.t = cursor.getColumnIndex("suggest_text_1");
                this.u = cursor.getColumnIndex("suggest_text_2");
                this.v = cursor.getColumnIndex("suggest_text_2_url");
                this.w = cursor.getColumnIndex("suggest_icon_1");
                this.x = cursor.getColumnIndex("suggest_icon_2");
                this.y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // a.vz
    public final java.lang.String c(android.database.Cursor cursor) {
        java.lang.String h;
        java.lang.String h2;
        if (cursor == null) {
            return null;
        }
        java.lang.String h3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h3 != null) {
            return h3;
        }
        android.app.SearchableInfo searchableInfo = this.n;
        if (searchableInfo.shouldRewriteQueryFromData() && (h2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h;
    }

    @Override // a.vz
    public final android.view.View d(android.view.ViewGroup viewGroup) {
        android.view.View inflate = this.l.inflate(this.j, viewGroup, false);
        inflate.setTag(new a.aj1(inflate));
        ((android.widget.ImageView) inflate.findViewById(2131362450)).setImageResource(this.q);
        return inflate;
    }

    public final android.graphics.drawable.Drawable e(android.net.Uri uri) {
        int parseInt;
        java.lang.String authority = uri.getAuthority();
        if (android.text.TextUtils.isEmpty(authority)) {
            throw new java.io.FileNotFoundException("No authority: " + uri);
        }
        try {
            android.content.res.Resources resourcesForApplication = this.o.getPackageManager().getResourcesForApplication(authority);
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new java.io.FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = java.lang.Integer.parseInt(pathSegments.get(0));
                } catch (java.lang.NumberFormatException unused) {
                    throw new java.io.FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new java.io.FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new java.io.FileNotFoundException("No resource found for: " + uri);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            throw new java.io.FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bj1.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final android.database.Cursor g(android.app.SearchableInfo searchableInfo, java.lang.String str) {
        java.lang.String suggestAuthority;
        java.lang.String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        android.net.Uri.Builder fragment = new android.net.Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        java.lang.String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        java.lang.String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new java.lang.String[]{str};
        } else {
            fragment.appendPath(str);
        }
        java.lang.String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", java.lang.String.valueOf(50));
        return this.o.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // a.vz, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final android.view.View getDropDownView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (java.lang.RuntimeException e) {
            android.util.Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            android.view.View inflate = this.l.inflate(this.k, viewGroup, false);
            if (inflate != null) {
                ((a.aj1) inflate.getTag()).f14a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // a.vz, android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (java.lang.RuntimeException e) {
            android.util.Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            android.view.View d = d(viewGroup);
            ((a.aj1) d.getTag()).f14a.setText(e.toString());
            return d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        android.database.Cursor cursor = this.e;
        android.os.Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        android.database.Cursor cursor = this.e;
        android.os.Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object tag = view.getTag();
        if (tag instanceof java.lang.CharSequence) {
            this.m.onTextChanged((java.lang.CharSequence) tag);
        }
    }
}
