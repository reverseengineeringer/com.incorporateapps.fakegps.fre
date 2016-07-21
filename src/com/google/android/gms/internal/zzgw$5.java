package com.google.android.gms.internal;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.google.android.gms.ads.internal.formats.zzc;
import java.io.IOException;
import java.io.InputStream;

class zzgw$5
  implements zziw.zza
{
  zzgw$5(zzgw paramzzgw, boolean paramBoolean, double paramDouble, String paramString) {}
  
  public zzc zzg(InputStream paramInputStream)
  {
    try
    {
      paramInputStream = zzna.zzk(paramInputStream);
      if (paramInputStream == null)
      {
        zzGP.zza(2, zzGZ);
        return null;
      }
    }
    catch (IOException paramInputStream)
    {
      for (;;)
      {
        paramInputStream = null;
      }
      paramInputStream = BitmapFactory.decodeByteArray(paramInputStream, 0, paramInputStream.length);
      if (paramInputStream == null)
      {
        zzGP.zza(2, zzGZ);
        return null;
      }
      paramInputStream.setDensity((int)(160.0D * zzHa));
    }
    return new zzc(new BitmapDrawable(Resources.getSystem(), paramInputStream), Uri.parse(zzDr), zzHa);
  }
  
  public zzc zzgo()
  {
    zzGP.zza(2, zzGZ);
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgw.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */