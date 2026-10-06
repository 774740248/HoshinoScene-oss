package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class rm extends android.widget.ImageButton {
    public final a.ol c;
    public final a.sm d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a.mm1.a(context);
        this.e = false;
        a.rl1.a(getContext(), this);
        a.ol olVar = new a.ol(this);
        this.c = olVar;
        olVar.e(attributeSet, i);
        a.sm smVar = new a.sm(this);
        this.d = smVar;
        smVar.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a.ol olVar = this.c;
        if (olVar != null) {
            olVar.a();
        }
        a.sm smVar = this.d;
        if (smVar != null) {
            smVar.a();
        }
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        a.ol olVar = this.c;
        if (olVar != null) {
            return olVar.c();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        a.ol olVar = this.c;
        if (olVar != null) {
            return olVar.d();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportImageTintList() {
        a.nm1 nm1Var;
        a.sm smVar = this.d;
        if (smVar == null || (nm1Var = smVar.b) == null) {
            return null;
        }
        return (android.content.res.ColorStateList) nm1Var.c;
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
        a.nm1 nm1Var;
        a.sm smVar = this.d;
        if (smVar == null || (nm1Var = smVar.b) == null) {
            return null;
        }
        return (android.graphics.PorterDuff.Mode) nm1Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((this.d.f530a.getBackground() instanceof android.graphics.drawable.RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a.ol olVar = this.c;
        if (olVar != null) {
            olVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        a.ol olVar = this.c;
        if (olVar != null) {
            olVar.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a.sm smVar = this.d;
        if (smVar != null) {
            smVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        a.sm smVar = this.d;
        if (smVar != null && drawable != null && !this.e) {
            smVar.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (smVar != null) {
            smVar.a();
            if (this.e) {
                return;
            }
            android.widget.ImageView imageView = smVar.f530a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(smVar.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.e = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.d.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        a.sm smVar = this.d;
        if (smVar != null) {
            smVar.a();
        }
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        a.ol olVar = this.c;
        if (olVar != null) {
            olVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        a.ol olVar = this.c;
        if (olVar != null) {
            olVar.j(mode);
        }
    }

    public void setSupportImageTintList(android.content.res.ColorStateList colorStateList) {
        a.sm smVar = this.d;
        if (smVar != null) {
            if (smVar.b == null) {
                smVar.b = new a.nm1(0);
            }
            a.nm1 nm1Var = smVar.b;
            nm1Var.c = colorStateList;
            nm1Var.b = true;
            smVar.a();
        }
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode) {
        a.sm smVar = this.d;
        if (smVar != null) {
            if (smVar.b == null) {
                smVar.b = new a.nm1(0);
            }
            a.nm1 nm1Var = smVar.b;
            nm1Var.d = mode;
            nm1Var.f385a = true;
            smVar.a();
        }
    }
}
