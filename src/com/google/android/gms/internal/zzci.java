package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;

public class zzci
  extends NativeAd.Image
{
  private final Drawable mDrawable;
  private final Uri mUri;
  private final double zzxV;
  private final zzch zzyL;
  
  public zzci(zzch paramzzch)
  {
    zzyL = paramzzch;
    try
    {
      paramzzch = zzyL.zzdJ();
      if (paramzzch == null) {
        break label83;
      }
      paramzzch = (Drawable)zze.zzp(paramzzch);
    }
    catch (RemoteException paramzzch)
    {
      try
      {
        paramzzch = zzyL.getUri();
        mUri = paramzzch;
        double d1 = 1.0D;
        try
        {
          double d2 = zzyL.getScale();
          d1 = d2;
        }
        catch (RemoteException paramzzch)
        {
          for (;;)
          {
            zzb.zzb("Failed to get scale.", paramzzch);
          }
        }
        zzxV = d1;
        return;
        paramzzch = paramzzch;
        zzb.zzb("Failed to get drawable.", paramzzch);
        paramzzch = null;
      }
      catch (RemoteException paramzzch)
      {
        for (;;)
        {
          zzb.zzb("Failed to get uri.", paramzzch);
          paramzzch = (zzch)localObject;
        }
      }
    }
    mDrawable = paramzzch;
  }
  
  public Drawable getDrawable()
  {
    return mDrawable;
  }
  
  public double getScale()
  {
    return zzxV;
  }
  
  public Uri getUri()
  {
    return mUri;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzci
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */