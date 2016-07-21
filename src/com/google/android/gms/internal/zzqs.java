package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;

class zzqs
  implements PanoramaApi.PanoramaResult
{
  private final Status zzUX;
  private final Intent zzbdv;
  
  public zzqs(Status paramStatus, Intent paramIntent)
  {
    zzUX = ((Status)zzx.zzz(paramStatus));
    zzbdv = paramIntent;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  public Intent getViewerIntent()
  {
    return zzbdv;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */