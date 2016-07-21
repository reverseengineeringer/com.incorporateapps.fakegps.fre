package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.net.Uri;
import android.widget.ImageView;

public final class zzmc
  extends ImageView
{
  private Uri zzakr;
  private int zzaks;
  private int zzakt;
  private zzmc.zza zzaku;
  private int zzakv;
  private float zzakw;
  
  protected final void onDraw(Canvas paramCanvas)
  {
    if (zzaku != null) {
      paramCanvas.clipPath(zzaku.zzl(getWidth(), getHeight()));
    }
    super.onDraw(paramCanvas);
    if (zzakt != 0) {
      paramCanvas.drawColor(zzakt);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    switch (zzakv)
    {
    default: 
      return;
    case 1: 
      paramInt1 = getMeasuredHeight();
      paramInt2 = (int)(paramInt1 * zzakw);
    }
    for (;;)
    {
      setMeasuredDimension(paramInt2, paramInt1);
      return;
      paramInt2 = getMeasuredWidth();
      paramInt1 = (int)(paramInt2 / zzakw);
    }
  }
  
  public final void zzbO(int paramInt)
  {
    zzaks = paramInt;
  }
  
  public final void zzm(Uri paramUri)
  {
    zzakr = paramUri;
  }
  
  public final int zzqp()
  {
    return zzaks;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzmc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */