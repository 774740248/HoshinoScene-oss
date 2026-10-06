package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.animation.LayoutTransition;
import android.widget.EdgeEffect;
import java.util.ArrayList;

import a.aa1;
import a.ba1;
import a.ca1;
import a.c91;
import a.cq0;
import a.d91;
import a.da1;
import a.e91;
import a.eq0;
import a.fa1;
import a.g91;
import a.h91;
import a.i91;
import a.j91;
import a.k91;
import a.nq1;
import a.o91;
import a.p4;
import a.p91;
import a.q91;
import a.ru;
import a.s91;
import a.t91;
import a.u91;
import a.vi;
import a.v91;
import a.w91;
import a.y11;
import a.z11;
import a.z91;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
/* [修复] 从 smali 还原的 RecyclerView 混淆版 stub（保编译）。方法体统一抛异常，字段类型与 smali 一致。 */
public class RecyclerView extends ViewGroup implements y11 {

    /* static fields */
    public static boolean D0 = false;
    public static boolean E0 = false;
    public static final int[] F0 = {16843654};
    public static final float G0 = 0.78f;
    public static final boolean H0 = true;
    public static final boolean I0 = true;
    public static final boolean J0 = true;
    public static final Class[] K0 = new Class[0];
    public static final nq1 L0 = new nq1(2);
    public static final aa1 M0 = new aa1();

    /* instance fields (R8 混淆名，类型与 smali 一致) */
    public boolean A;
    public int A0;
    public int B;
    public int B0;
    public boolean C;
    public d91 C0;
    public AccessibilityManager D;
    public ArrayList E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public h91 J;
    public EdgeEffect K;
    public EdgeEffect L;
    public EdgeEffect M;
    public EdgeEffect N;
    public j91 O;
    public int P;
    public int Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public o91 a0;
    public int b0;
    public float c;
    public int c0;
    public v91 d;
    public float d0;
    public t91 e;
    public float e0;
    public w91 f;
    public boolean f0;
    public vi g;
    public ca1 g0;
    public ru h;
    public eq0 h0;
    public p4 i;
    public cq0 i0;
    public boolean j;
    public z91 j0;
    public c91 k;
    public q91 k0;
    public Rect l = new Rect();
    public ArrayList l0;
    public Rect m = new Rect();
    public boolean m0;
    public RectF n = new RectF();
    public boolean n0;
    public e91 o;
    public d91 o0;
    public a p;
    public boolean p0;
    public ArrayList q = new ArrayList();
    public fa1 q0;
    public ArrayList r = new ArrayList();
    public g91 r0;
    public ArrayList s = new ArrayList();
    public int[] s0;
    public p91 t;
    public z11 t0;
    public boolean u;
    public int[] u0;
    public boolean v;
    public int[] v0;
    public boolean w;
    public int[] w0;
    public int x;
    public ArrayList x0 = new ArrayList();
    public boolean y;
    public c91 y0;
    public boolean z;
    public boolean z0;

    public RecyclerView(Context context) {
        super(context);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* static methods */
    public static RecyclerView I(View view) {
        throw new UnsupportedOperationException("stub");
    }

    public static da1 N(View view) {
        throw new UnsupportedOperationException("stub");
    }

    public static void a(RecyclerView recyclerView, View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("stub");
    }

    public static void b(RecyclerView recyclerView, int i) {
        throw new UnsupportedOperationException("stub");
    }

    public static boolean c(RecyclerView recyclerView) {
        throw new UnsupportedOperationException("stub");
    }

    public static void e(RecyclerView recyclerView, View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("stub");
    }

    public static void f(RecyclerView recyclerView, View view) {
        throw new UnsupportedOperationException("stub");
    }

    public static void g(RecyclerView recyclerView, int i, int i2) {
        throw new UnsupportedOperationException("stub");
    }

    public static void l(da1 da1Var) {
        throw new UnsupportedOperationException("stub");
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        throw new UnsupportedOperationException("stub");
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    /* instance methods */
    public final void A() {
        throw new UnsupportedOperationException("stub");
    }

    public final void B() {
        throw new UnsupportedOperationException("stub");
    }

    public final String C() {
        throw new UnsupportedOperationException("stub");
    }

    public final void D(z91 z91Var) {
        throw new UnsupportedOperationException("stub");
    }

    public final View E(float f, float f2) {
        throw new UnsupportedOperationException("stub");
    }

    public final View F(View view) {
        throw new UnsupportedOperationException("stub");
    }

    public final boolean G(MotionEvent motionEvent) {
        throw new UnsupportedOperationException("stub");
    }

    public final void H(int[] iArr) {
        throw new UnsupportedOperationException("stub");
    }

    public final da1 J(int i) {
        throw new UnsupportedOperationException("stub");
    }

    public final int K(da1 da1Var) {
        throw new UnsupportedOperationException("stub");
    }

    public final long L(da1 da1Var) {
        throw new UnsupportedOperationException("stub");
    }

    public final da1 M(View view) {
        throw new UnsupportedOperationException("stub");
    }

    public final Rect O(View view) {
        throw new UnsupportedOperationException("stub");
    }

    public final boolean P() {
        throw new UnsupportedOperationException("stub");
    }

    public final boolean Q() {
        throw new UnsupportedOperationException("stub");
    }

    public final void R(int i) {
        throw new UnsupportedOperationException("stub");
    }

    public final void S() {
        throw new UnsupportedOperationException("stub");
    }

    public final void T(int i, int i2, boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public final void U() {
        throw new UnsupportedOperationException("stub");
    }

    public final void V(boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public final void W(MotionEvent motionEvent) {
        throw new UnsupportedOperationException("stub");
    }

    public final void X() {
        throw new UnsupportedOperationException("stub");
    }

    public final void Y() {
        throw new UnsupportedOperationException("stub");
    }

    public final void Z(boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public final void a0(da1 da1Var, i91 i91Var) {
        throw new UnsupportedOperationException("stub");
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        throw new UnsupportedOperationException("stub");
    }

    public final float b0(int i) {
        throw new UnsupportedOperationException("stub");
    }

    public final float c0(int i) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("stub");
    }

    public int computeHorizontalScrollExtent() {
        throw new UnsupportedOperationException("stub");
    }

    public int computeHorizontalScrollOffset() {
        throw new UnsupportedOperationException("stub");
    }

    public int computeHorizontalScrollRange() {
        throw new UnsupportedOperationException("stub");
    }

    public int computeVerticalScrollExtent() {
        throw new UnsupportedOperationException("stub");
    }

    public int computeVerticalScrollOffset() {
        throw new UnsupportedOperationException("stub");
    }

    public int computeVerticalScrollRange() {
        throw new UnsupportedOperationException("stub");
    }

    public final void d0(k91 k91Var) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        throw new UnsupportedOperationException("stub");
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        throw new UnsupportedOperationException("stub");
    }

    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        throw new UnsupportedOperationException("stub");
    }

    public void draw(Canvas canvas) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        throw new UnsupportedOperationException("stub");
    }

    public final void e0(View view, View view2) {
        throw new UnsupportedOperationException("stub");
    }

    public final void f0() {
        throw new UnsupportedOperationException("stub");
    }

    public View focusSearch(View view, int i) {
        throw new UnsupportedOperationException("stub");
    }

    public final boolean g0(int i, int i2, MotionEvent motionEvent, int i3) {
        throw new UnsupportedOperationException("stub");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        throw new UnsupportedOperationException("stub");
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        throw new UnsupportedOperationException("stub");
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("stub");
    }

    public CharSequence getAccessibilityClassName() {
        throw new UnsupportedOperationException("stub");
    }

    public e91 getAdapter() {
        throw new UnsupportedOperationException("stub");
    }

    public int getBaseline() {
        throw new UnsupportedOperationException("stub");
    }

    public int getChildDrawingOrder(int i, int i2) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean getClipToPadding() {
        throw new UnsupportedOperationException("stub");
    }

    public fa1 getCompatAccessibilityDelegate() {
        throw new UnsupportedOperationException("stub");
    }

    public h91 getEdgeEffectFactory() {
        throw new UnsupportedOperationException("stub");
    }

    public j91 getItemAnimator() {
        throw new UnsupportedOperationException("stub");
    }

    public int getItemDecorationCount() {
        throw new UnsupportedOperationException("stub");
    }

    public a getLayoutManager() {
        throw new UnsupportedOperationException("stub");
    }

    public int getMaxFlingVelocity() {
        throw new UnsupportedOperationException("stub");
    }

    public int getMinFlingVelocity() {
        throw new UnsupportedOperationException("stub");
    }

    public long getNanoTime() {
        throw new UnsupportedOperationException("stub");
    }

    public o91 getOnFlingListener() {
        throw new UnsupportedOperationException("stub");
    }

    public boolean getPreserveFocusAfterLayout() {
        throw new UnsupportedOperationException("stub");
    }

    public s91 getRecycledViewPool() {
        throw new UnsupportedOperationException("stub");
    }

    public int getScrollState() {
        throw new UnsupportedOperationException("stub");
    }

    public final void h(da1 da1Var) {
        throw new UnsupportedOperationException("stub");
    }

    public final void h0(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean hasNestedScrollingParent() {
        throw new UnsupportedOperationException("stub");
    }

    public final void i(k91 k91Var) {
        throw new UnsupportedOperationException("stub");
    }

    public final void i0(int i) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean isAttachedToWindow() {
        throw new UnsupportedOperationException("stub");
    }

    public boolean isLayoutSuppressed() {
        throw new UnsupportedOperationException("stub");
    }

    public boolean isNestedScrollingEnabled() {
        throw new UnsupportedOperationException("stub");
    }

    public final void j(q91 q91Var) {
        throw new UnsupportedOperationException("stub");
    }

    public final boolean j0(EdgeEffect edgeEffect, int i, int i2) {
        throw new UnsupportedOperationException("stub");
    }

    public final void k(String str) {
        throw new UnsupportedOperationException("stub");
    }

    public final void k0(int i, int i2, boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public final void l0(int i) {
        throw new UnsupportedOperationException("stub");
    }

    public final void m() {
        throw new UnsupportedOperationException("stub");
    }

    public final void m0() {
        throw new UnsupportedOperationException("stub");
    }

    public final void n(int i, int i2) {
        throw new UnsupportedOperationException("stub");
    }

    public final void n0(boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public final void o0(int i) {
        throw new UnsupportedOperationException("stub");
    }

    public void onAttachedToWindow() {
        throw new UnsupportedOperationException("stub");
    }

    public void onDetachedFromWindow() {
        throw new UnsupportedOperationException("stub");
    }

    public void onDraw(Canvas canvas) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        throw new UnsupportedOperationException("stub");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("stub");
    }

    public void onMeasure(int i, int i2) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        throw new UnsupportedOperationException("stub");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        throw new UnsupportedOperationException("stub");
    }

    public Parcelable onSaveInstanceState() {
        throw new UnsupportedOperationException("stub");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        throw new UnsupportedOperationException("stub");
    }

    public final void p() {
        throw new UnsupportedOperationException("stub");
    }

    public final void q(int i, int i2) {
        throw new UnsupportedOperationException("stub");
    }

    public final void r(View view) {
        throw new UnsupportedOperationException("stub");
    }

    public void removeDetachedView(View view, boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public void requestChildFocus(View view, View view2) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public void requestLayout() {
        throw new UnsupportedOperationException("stub");
    }

    public final void s() {
        throw new UnsupportedOperationException("stub");
    }

    public void scrollBy(int i, int i2) {
        throw new UnsupportedOperationException("stub");
    }

    public void scrollTo(int i, int i2) {
        throw new UnsupportedOperationException("stub");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        throw new UnsupportedOperationException("stub");
    }

    public void setAccessibilityDelegateCompat(fa1 fa1Var) {
        throw new UnsupportedOperationException("stub");
    }

    public void setAdapter(e91 e91Var) {
        throw new UnsupportedOperationException("stub");
    }

    public void setChildDrawingOrderCallback(g91 g91Var) {
        throw new UnsupportedOperationException("stub");
    }

    public void setClipToPadding(boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public void setEdgeEffectFactory(h91 h91Var) {
        throw new UnsupportedOperationException("stub");
    }

    public void setHasFixedSize(boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public void setItemAnimator(j91 j91Var) {
        throw new UnsupportedOperationException("stub");
    }

    public void setItemViewCacheSize(int i) {
        throw new UnsupportedOperationException("stub");
    }

    public void setLayoutFrozen(boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public void setLayoutManager(a aVar) {
        throw new UnsupportedOperationException("stub");
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("stub");
    }

    public void setNestedScrollingEnabled(boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public void setOnFlingListener(o91 o91Var) {
        throw new UnsupportedOperationException("stub");
    }

    public void setOnScrollListener(q91 q91Var) {
        throw new UnsupportedOperationException("stub");
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public void setRecycledViewPool(s91 s91Var) {
        throw new UnsupportedOperationException("stub");
    }

    public void setRecyclerListener(u91 u91Var) {
        throw new UnsupportedOperationException("stub");
    }

    public void setScrollState(int i) {
        throw new UnsupportedOperationException("stub");
    }

    public void setScrollingTouchSlop(int i) {
        throw new UnsupportedOperationException("stub");
    }

    public void setViewCacheExtension(ba1 ba1Var) {
        throw new UnsupportedOperationException("stub");
    }

    public boolean startNestedScroll(int i) {
        throw new UnsupportedOperationException("stub");
    }

    public void stopNestedScroll() {
        throw new UnsupportedOperationException("stub");
    }

    public void suppressLayout(boolean z) {
        throw new UnsupportedOperationException("stub");
    }

    public final void t() {
        throw new UnsupportedOperationException("stub");
    }

    public final void u() {
        throw new UnsupportedOperationException("stub");
    }

    public final int v(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        throw new UnsupportedOperationException("stub");
    }

    public final void w(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        throw new UnsupportedOperationException("stub");
    }

    public final void x(int i, int i2) {
        throw new UnsupportedOperationException("stub");
    }

    public final void y() {
        throw new UnsupportedOperationException("stub");
    }

    public final void z() {
        throw new UnsupportedOperationException("stub");
    }
}
