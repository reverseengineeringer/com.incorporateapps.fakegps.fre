package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class zzc$1
  extends zzc.zza
{
  zzc$1(zzc paramzzc, GoogleApiClient paramGoogleApiClient, GoogleSignInOptions paramGoogleSignInOptions)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected void zza(zzd paramzzd)
  {
    zzq localzzq = zzq.zzaf(paramzzd.getContext());
    ((zzh)paramzzd.zzqJ()).zza(new zzc.1.1(this, localzzq), zzXr);
  }
  
  protected GoogleSignInResult zzn(Status paramStatus)
  {
    return new GoogleSignInResult(null, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzc.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */