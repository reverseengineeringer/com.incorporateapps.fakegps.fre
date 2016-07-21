package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzma;
import com.google.android.gms.internal.zzmb;
import com.google.android.gms.internal.zzmd;
import com.google.android.gms.internal.zzmd.zza;

public abstract class zza
{
  final zza.zza zzajO;
  protected int zzajP = 0;
  protected int zzajQ = 0;
  protected boolean zzajR = false;
  protected ImageManager.OnImageLoadedListener zzajS;
  private boolean zzajT = true;
  private boolean zzajU = false;
  private boolean zzajV = true;
  protected int zzajW;
  
  public zza(Uri paramUri, int paramInt)
  {
    zzajO = new zza.zza(paramUri);
    zzajQ = paramInt;
  }
  
  private Drawable zza(Context paramContext, zzmd paramzzmd, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    if (zzajW > 0)
    {
      zzmd.zza localzza = new zzmd.zza(paramInt, zzajW);
      Drawable localDrawable = (Drawable)paramzzmd.get(localzza);
      paramContext = localDrawable;
      if (localDrawable == null)
      {
        localDrawable = localResources.getDrawable(paramInt);
        paramContext = localDrawable;
        if ((zzajW & 0x1) != 0) {
          paramContext = zza(localResources, localDrawable);
        }
        paramzzmd.put(localzza, paramContext);
      }
      return paramContext;
    }
    return localResources.getDrawable(paramInt);
  }
  
  protected Drawable zza(Resources paramResources, Drawable paramDrawable)
  {
    return zzmb.zza(paramResources, paramDrawable);
  }
  
  protected zzma zza(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    if (paramDrawable1 != null)
    {
      localDrawable = paramDrawable1;
      if (!(paramDrawable1 instanceof zzma)) {}
    }
    for (Drawable localDrawable = ((zzma)paramDrawable1).zzqn();; localDrawable = null) {
      return new zzma(localDrawable, paramDrawable2);
    }
  }
  
  void zza(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    zzb.zzv(paramBitmap);
    Bitmap localBitmap = paramBitmap;
    if ((zzajW & 0x1) != 0) {
      localBitmap = zzmb.zzb(paramBitmap);
    }
    paramContext = new BitmapDrawable(paramContext.getResources(), localBitmap);
    if (zzajS != null) {
      zzajS.onImageLoaded(zzajO.uri, paramContext, true);
    }
    zza(paramContext, paramBoolean, false, true);
  }
  
  void zza(Context paramContext, zzmd paramzzmd)
  {
    if (zzajV)
    {
      Drawable localDrawable = null;
      if (zzajP != 0) {
        localDrawable = zza(paramContext, paramzzmd, zzajP);
      }
      zza(localDrawable, false, true, false);
    }
  }
  
  void zza(Context paramContext, zzmd paramzzmd, boolean paramBoolean)
  {
    Drawable localDrawable = null;
    if (zzajQ != 0) {
      localDrawable = zza(paramContext, paramzzmd, zzajQ);
    }
    if (zzajS != null) {
      zzajS.onImageLoaded(zzajO.uri, localDrawable, false);
    }
    zza(localDrawable, paramBoolean, false, false);
  }
  
  protected abstract void zza(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);
  
  protected boolean zzb(boolean paramBoolean1, boolean paramBoolean2)
  {
    return (zzajT) && (!paramBoolean2) && ((!paramBoolean1) || (zzajU));
  }
  
  public void zzbM(int paramInt)
  {
    zzajQ = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.images.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */