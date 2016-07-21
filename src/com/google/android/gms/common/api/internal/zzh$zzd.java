package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.SignInResponse;
import com.google.android.gms.signin.internal.zzb;
import java.lang.ref.WeakReference;

class zzh$zzd
  extends zzb
{
  private final WeakReference zzahD;
  
  zzh$zzd(zzh paramzzh)
  {
    zzahD = new WeakReference(paramzzh);
  }
  
  public void zzb(SignInResponse paramSignInResponse)
  {
    zzh localzzh = (zzh)zzahD.get();
    if (localzzh == null) {
      return;
    }
    zzh.zzd(localzzh).zza(new zzh.zzd.1(this, localzzh, localzzh, paramSignInResponse));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzh.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */