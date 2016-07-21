package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.search.SearchAuth;
import com.google.android.gms.search.SearchAuthApi.GoogleNowAuthResult;

class zzrk$zzc
  extends zza.zza
{
  private final String zzbgJ;
  private final boolean zzbgK = Log.isLoggable("SearchAuth", 3);
  private final String zzbgM;
  
  protected zzrk$zzc(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(SearchAuth.zzUI, paramGoogleApiClient);
    zzbgM = paramString;
    zzbgJ = paramGoogleApiClient.getContext().getPackageName();
  }
  
  protected void zza(zzrj paramzzrj)
  {
    if (zzbgK) {
      Log.d("SearchAuth", "GetGoogleNowAuthImpl started");
    }
    zzrk.zzc.1 local1 = new zzrk.zzc.1(this);
    ((zzri)paramzzrj.zzqJ()).zza(local1, zzbgJ, zzbgM);
  }
  
  protected SearchAuthApi.GoogleNowAuthResult zzbk(Status paramStatus)
  {
    if (zzbgK) {
      Log.d("SearchAuth", "GetGoogleNowAuthImpl received failure: " + paramStatus.getStatusMessage());
    }
    return new zzrk.zzd(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrk.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */