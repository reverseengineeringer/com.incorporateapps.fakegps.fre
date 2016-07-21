package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.zzas;
import com.google.android.gms.internal.zzas.zza;

final class zzd$2
  implements zzd.zza
{
  zzd$2(String paramString, Bundle paramBundle) {}
  
  public final Void zzao(IBinder paramIBinder)
  {
    paramIBinder = (Bundle)zzd.zzn(zzas.zza.zza(paramIBinder).zza(zzVj, zzVk));
    String str = paramIBinder.getString("Error");
    if (!paramIBinder.getBoolean("booleanResult")) {
      throw new GoogleAuthException(str);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.zzd.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */