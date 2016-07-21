package com.google.android.gms.internal;

import android.hardware.display.VirtualDisplay;
import android.view.Display;
import com.google.android.gms.cast.CastRemoteDisplayApi;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public class zzlq
  implements CastRemoteDisplayApi
{
  private static final zzl zzaaf = new zzl("CastRemoteDisplayApiImpl");
  private Api.zzc zzaeE;
  private VirtualDisplay zzaeF;
  private final zzlu zzaeG = new zzlq.1(this);
  
  public zzlq(Api.zzc paramzzc)
  {
    zzaeE = paramzzc;
  }
  
  private void zzoB()
  {
    if (zzaeF != null)
    {
      if (zzaeF.getDisplay() != null) {
        zzaaf.zzb("releasing virtual display: " + zzaeF.getDisplay().getDisplayId(), new Object[0]);
      }
      zzaeF.release();
      zzaeF = null;
    }
  }
  
  public PendingResult startRemoteDisplay(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzaaf.zzb("startRemoteDisplay", new Object[0]);
    return paramGoogleApiClient.zzb(new zzlq.2(this, paramGoogleApiClient, paramString));
  }
  
  public PendingResult stopRemoteDisplay(GoogleApiClient paramGoogleApiClient)
  {
    zzaaf.zzb("stopRemoteDisplay", new Object[0]);
    return paramGoogleApiClient.zzb(new zzlq.3(this, paramGoogleApiClient));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */