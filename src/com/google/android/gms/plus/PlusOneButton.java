package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.plus.internal.zzg;

public final class PlusOneButton
  extends FrameLayout
{
  public static final int ANNOTATION_BUBBLE = 1;
  public static final int ANNOTATION_INLINE = 2;
  public static final int ANNOTATION_NONE = 0;
  public static final int DEFAULT_ACTIVITY_REQUEST_CODE = -1;
  public static final int SIZE_MEDIUM = 1;
  public static final int SIZE_SMALL = 0;
  public static final int SIZE_STANDARD = 3;
  public static final int SIZE_TALL = 2;
  private int mSize;
  private String zzF;
  private View zzbea;
  private int zzbeb;
  private int zzbec;
  private PlusOneButton.OnPlusOneClickListener zzbed;
  
  public PlusOneButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PlusOneButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    mSize = getSize(paramContext, paramAttributeSet);
    zzbeb = getAnnotation(paramContext, paramAttributeSet);
    zzbec = -1;
    zzar(getContext());
    if (isInEditMode()) {}
  }
  
  protected static int getAnnotation(Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = 0;
    paramContext = zzaf.zza("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", paramContext, paramAttributeSet, true, false, "PlusOneButton");
    if ("INLINE".equalsIgnoreCase(paramContext)) {
      i = 2;
    }
    while ("NONE".equalsIgnoreCase(paramContext)) {
      return i;
    }
    return 1;
  }
  
  protected static int getSize(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = zzaf.zza("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", paramContext, paramAttributeSet, true, false, "PlusOneButton");
    if ("SMALL".equalsIgnoreCase(paramContext)) {
      return 0;
    }
    if ("MEDIUM".equalsIgnoreCase(paramContext)) {
      return 1;
    }
    if ("TALL".equalsIgnoreCase(paramContext)) {
      return 2;
    }
    return 3;
  }
  
  private void zzar(Context paramContext)
  {
    if (zzbea != null) {
      removeView(zzbea);
    }
    zzbea = zzg.zza(paramContext, mSize, zzbeb, zzF, zzbec);
    setOnPlusOneClickListener(zzbed);
    addView(zzbea);
  }
  
  public final void initialize(String paramString, int paramInt)
  {
    zzx.zza(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener).");
    zzF = paramString;
    zzbec = paramInt;
    zzar(getContext());
  }
  
  public final void initialize(String paramString, PlusOneButton.OnPlusOneClickListener paramOnPlusOneClickListener)
  {
    zzF = paramString;
    zzbec = 0;
    zzar(getContext());
    setOnPlusOneClickListener(paramOnPlusOneClickListener);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    zzbea.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = zzbea;
    measureChild(localView, paramInt1, paramInt2);
    setMeasuredDimension(localView.getMeasuredWidth(), localView.getMeasuredHeight());
  }
  
  public final void plusOneClick()
  {
    zzbea.performClick();
  }
  
  public final void setAnnotation(int paramInt)
  {
    zzbeb = paramInt;
    zzar(getContext());
  }
  
  public final void setIntent(Intent paramIntent)
  {
    zzbea.setTag(paramIntent);
  }
  
  public final void setOnPlusOneClickListener(PlusOneButton.OnPlusOneClickListener paramOnPlusOneClickListener)
  {
    zzbed = paramOnPlusOneClickListener;
    zzbea.setOnClickListener(new PlusOneButton.DefaultOnPlusOneClickListener(this, paramOnPlusOneClickListener));
  }
  
  public final void setSize(int paramInt)
  {
    mSize = paramInt;
    zzar(getContext());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.PlusOneButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */