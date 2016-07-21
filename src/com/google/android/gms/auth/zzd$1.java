package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.zzas;
import com.google.android.gms.internal.zzas.zza;
import java.io.IOException;

final class zzd$1
  implements zzd.zza
{
  zzd$1(Account paramAccount, String paramString, Bundle paramBundle) {}
  
  public final TokenData zzam(IBinder paramIBinder)
  {
    Object localObject = (Bundle)zzd.zzn(zzas.zza.zza(paramIBinder).zza(zzVg, zzVh, zzVi));
    paramIBinder = TokenData.zzc((Bundle)localObject, "tokenDetails");
    if (paramIBinder != null) {
      return paramIBinder;
    }
    paramIBinder = ((Bundle)localObject).getString("Error");
    localObject = (Intent)((Bundle)localObject).getParcelable("userRecoveryIntent");
    com.google.android.gms.auth.firstparty.shared.zzd localzzd = com.google.android.gms.auth.firstparty.shared.zzd.zzbY(paramIBinder);
    if (com.google.android.gms.auth.firstparty.shared.zzd.zza(localzzd)) {
      throw new UserRecoverableAuthException(paramIBinder, (Intent)localObject);
    }
    if (com.google.android.gms.auth.firstparty.shared.zzd.zzc(localzzd)) {
      throw new IOException(paramIBinder);
    }
    throw new GoogleAuthException(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.zzd.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */