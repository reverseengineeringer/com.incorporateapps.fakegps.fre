package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient.zza;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.zzrn;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class zzh$zzb
  extends zzh.zzf
{
  private final Map zzahE;
  
  public zzh$zzb(zzh paramzzh, Map paramMap)
  {
    super(paramzzh, null);
    zzahE = paramMap;
  }
  
  public void zzpt()
  {
    int i = zzh.zzb(zzahC).isGooglePlayServicesAvailable(zzh.zza(zzahC));
    Object localObject;
    if (i != 0)
    {
      localObject = new ConnectionResult(i, null);
      zzh.zzd(zzahC).zza(new zzh.zzb.1(this, zzahC, (ConnectionResult)localObject));
    }
    for (;;)
    {
      return;
      if (zzh.zze(zzahC)) {
        zzh.zzf(zzahC).connect();
      }
      localObject = zzahE.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Api.zzb localzzb = (Api.zzb)((Iterator)localObject).next();
        localzzb.zza((GoogleApiClient.zza)zzahE.get(localzzb));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzh.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */