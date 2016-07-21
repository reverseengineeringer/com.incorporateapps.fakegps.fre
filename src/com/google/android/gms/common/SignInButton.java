package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzab;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.zzg.zza;

public final class SignInButton
  extends FrameLayout
  implements View.OnClickListener
{
  public static final int COLOR_AUTO = 2;
  public static final int COLOR_DARK = 0;
  public static final int COLOR_LIGHT = 1;
  public static final int SIZE_ICON_ONLY = 2;
  public static final int SIZE_STANDARD = 0;
  public static final int SIZE_WIDE = 1;
  private int mColor;
  private int mSize;
  private Scope[] zzafT;
  private View zzafU;
  private View.OnClickListener zzafV = null;
  
  public SignInButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    zza(paramContext, paramAttributeSet);
    setStyle(mSize, mColor, zzafT);
  }
  
  private static Button zza(Context paramContext, int paramInt1, int paramInt2, Scope[] paramArrayOfScope)
  {
    zzac localzzac = new zzac(paramContext);
    localzzac.zza(paramContext.getResources(), paramInt1, paramInt2, paramArrayOfScope);
    return localzzac;
  }
  
  /* Error */
  private void zza(Context paramContext, AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_1
    //   3: invokevirtual 67	android/content/Context:getTheme	()Landroid/content/res/Resources$Theme;
    //   6: aload_2
    //   7: getstatic 73	com/google/android/gms/R$styleable:SignInButton	[I
    //   10: iconst_0
    //   11: iconst_0
    //   12: invokevirtual 79	android/content/res/Resources$Theme:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   15: astore_1
    //   16: aload_0
    //   17: aload_1
    //   18: getstatic 82	com/google/android/gms/R$styleable:SignInButton_buttonSize	I
    //   21: iconst_0
    //   22: invokevirtual 88	android/content/res/TypedArray:getInt	(II)I
    //   25: putfield 41	com/google/android/gms/common/SignInButton:mSize	I
    //   28: aload_0
    //   29: aload_1
    //   30: getstatic 91	com/google/android/gms/R$styleable:SignInButton_colorScheme	I
    //   33: iconst_2
    //   34: invokevirtual 88	android/content/res/TypedArray:getInt	(II)I
    //   37: putfield 43	com/google/android/gms/common/SignInButton:mColor	I
    //   40: aload_1
    //   41: getstatic 94	com/google/android/gms/R$styleable:SignInButton_scopeUris	I
    //   44: invokevirtual 98	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   47: astore_2
    //   48: aload_2
    //   49: ifnonnull +13 -> 62
    //   52: aload_0
    //   53: aconst_null
    //   54: putfield 45	com/google/android/gms/common/SignInButton:zzafT	[Lcom/google/android/gms/common/api/Scope;
    //   57: aload_1
    //   58: invokevirtual 102	android/content/res/TypedArray:recycle	()V
    //   61: return
    //   62: aload_2
    //   63: invokevirtual 108	java/lang/String:trim	()Ljava/lang/String;
    //   66: ldc 110
    //   68: invokevirtual 114	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   71: astore_2
    //   72: aload_0
    //   73: aload_2
    //   74: arraylength
    //   75: anewarray 116	com/google/android/gms/common/api/Scope
    //   78: putfield 45	com/google/android/gms/common/SignInButton:zzafT	[Lcom/google/android/gms/common/api/Scope;
    //   81: iload_3
    //   82: aload_2
    //   83: arraylength
    //   84: if_icmpge -27 -> 57
    //   87: aload_0
    //   88: getfield 45	com/google/android/gms/common/SignInButton:zzafT	[Lcom/google/android/gms/common/api/Scope;
    //   91: iload_3
    //   92: new 116	com/google/android/gms/common/api/Scope
    //   95: dup
    //   96: aload_2
    //   97: iload_3
    //   98: aaload
    //   99: invokevirtual 119	java/lang/String:toString	()Ljava/lang/String;
    //   102: invokespecial 122	com/google/android/gms/common/api/Scope:<init>	(Ljava/lang/String;)V
    //   105: aastore
    //   106: iload_3
    //   107: iconst_1
    //   108: iadd
    //   109: istore_3
    //   110: goto -29 -> 81
    //   113: astore_2
    //   114: aload_1
    //   115: invokevirtual 102	android/content/res/TypedArray:recycle	()V
    //   118: aload_2
    //   119: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	SignInButton
    //   0	120	1	paramContext	Context
    //   0	120	2	paramAttributeSet	AttributeSet
    //   1	109	3	i	int
    // Exception table:
    //   from	to	target	type
    //   16	48	113	finally
    //   52	57	113	finally
    //   62	81	113	finally
    //   81	106	113	finally
  }
  
  private void zzar(Context paramContext)
  {
    if (zzafU != null) {
      removeView(zzafU);
    }
    try
    {
      zzafU = zzab.zzb(paramContext, mSize, mColor, zzafT);
      addView(zzafU);
      zzafU.setEnabled(isEnabled());
      zzafU.setOnClickListener(this);
      return;
    }
    catch (zzg.zza localzza)
    {
      for (;;)
      {
        Log.w("SignInButton", "Sign in button not found, using placeholder instead");
        zzafU = zza(paramContext, mSize, mColor, zzafT);
      }
    }
  }
  
  public final void onClick(View paramView)
  {
    if ((zzafV != null) && (paramView == zzafU)) {
      zzafV.onClick(this);
    }
  }
  
  public final void setColorScheme(int paramInt)
  {
    setStyle(mSize, paramInt, zzafT);
  }
  
  public final void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    zzafU.setEnabled(paramBoolean);
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    zzafV = paramOnClickListener;
    if (zzafU != null) {
      zzafU.setOnClickListener(this);
    }
  }
  
  public final void setScopes(Scope[] paramArrayOfScope)
  {
    setStyle(mSize, mColor, paramArrayOfScope);
  }
  
  public final void setSize(int paramInt)
  {
    setStyle(paramInt, mColor, zzafT);
  }
  
  public final void setStyle(int paramInt1, int paramInt2)
  {
    setStyle(paramInt1, paramInt2, zzafT);
  }
  
  public final void setStyle(int paramInt1, int paramInt2, Scope[] paramArrayOfScope)
  {
    mSize = paramInt1;
    mColor = paramInt2;
    zzafT = paramArrayOfScope;
    zzar(getContext());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.SignInButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */