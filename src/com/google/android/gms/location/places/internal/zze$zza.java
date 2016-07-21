package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.PlacesOptions.Builder;

public class zze$zza
  extends Api.zza
{
  private final String zzaQs;
  
  public zze$zza(String paramString)
  {
    zzaQs = paramString;
  }
  
  public zze zza(Context paramContext, Looper paramLooper, zzf paramzzf, PlacesOptions paramPlacesOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    String str;
    if (zzaQs != null)
    {
      str = zzaQs;
      if (paramPlacesOptions != null) {
        break label58;
      }
      paramPlacesOptions = new PlacesOptions.Builder().build();
    }
    label58:
    for (;;)
    {
      return new zze(paramContext, paramLooper, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener, str, paramPlacesOptions);
      str = paramContext.getPackageName();
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zze.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */