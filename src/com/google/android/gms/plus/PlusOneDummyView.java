package com.google.android.gms.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class PlusOneDummyView
  extends FrameLayout
{
  public static final String TAG = "PlusOneDummyView";
  
  public PlusOneDummyView(Context paramContext, int paramInt)
  {
    super(paramContext);
    paramContext = new Button(paramContext);
    paramContext.setEnabled(false);
    paramContext.setBackgroundDrawable(zzEX().getDrawable(paramInt));
    Point localPoint = zzjG(paramInt);
    addView(paramContext, new FrameLayout.LayoutParams(x, y, 17));
  }
  
  private PlusOneDummyView.zzd zzEX()
  {
    Object localObject2 = new PlusOneDummyView.zzb(getContext(), null);
    Object localObject1 = localObject2;
    if (!((PlusOneDummyView.zzd)localObject2).isValid()) {
      localObject1 = new PlusOneDummyView.zzc(getContext(), null);
    }
    localObject2 = localObject1;
    if (!((PlusOneDummyView.zzd)localObject1).isValid()) {
      localObject2 = new PlusOneDummyView.zza(getContext(), null);
    }
    return (PlusOneDummyView.zzd)localObject2;
  }
  
  private Point zzjG(int paramInt)
  {
    int j = 24;
    int i = 20;
    Point localPoint = new Point();
    switch (paramInt)
    {
    default: 
      paramInt = 38;
      i = 24;
    }
    for (;;)
    {
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      float f1 = TypedValue.applyDimension(1, paramInt, localDisplayMetrics);
      float f2 = TypedValue.applyDimension(1, i, localDisplayMetrics);
      x = ((int)(f1 + 0.5D));
      y = ((int)(f2 + 0.5D));
      return localPoint;
      paramInt = 32;
      continue;
      i = 14;
      paramInt = j;
      continue;
      paramInt = 50;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.PlusOneDummyView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */