package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.search.SearchAuth;

class zzrk$zzb
  extends zza.zza
{
  private final String zzXI;
  private final String zzbgJ;
  private final boolean zzbgK = Log.isLoggable("SearchAuth", 3);
  
  protected zzrk$zzb(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(SearchAuth.zzUI, paramGoogleApiClient);
    zzXI = paramString;
    zzbgJ = paramGoogleApiClient.getContext().getPackageName();
  }
  
  protected void zza(zzrj paramzzrj)
  {
    if (zzbgK) {
      Log.d("SearchAuth", "ClearTokenImpl started");
    }
    zzrk.zzb.1 local1 = new zzrk.zzb.1(this);
    ((zzri)paramzzrj.zzqJ()).zzb(local1, zzbgJ, zzXI);
  }
  
  protected Status zzb(Status paramStatus)
  {
    if (zzbgK) {
      Log.d("SearchAuth", "ClearTokenImpl received failure: " + paramStatus.getStatusMessage());
    }
    return paramStatus;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrk.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */