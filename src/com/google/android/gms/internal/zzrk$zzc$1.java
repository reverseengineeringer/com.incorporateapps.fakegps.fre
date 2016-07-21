package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;

class zzrk$zzc$1
  extends zzrk.zza
{
  zzrk$zzc$1(zzrk.zzc paramzzc) {}
  
  public void zza(Status paramStatus, GoogleNowAuthState paramGoogleNowAuthState)
  {
    if (zzrk.zzc.zza(zzbgN)) {
      Log.d("SearchAuth", "GetGoogleNowAuthImpl success");
    }
    zzbgN.zza(new zzrk.zzd(paramStatus, paramGoogleNowAuthState));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrk.zzc.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */