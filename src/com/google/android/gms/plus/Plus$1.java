package com.google.android.gms.plus;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.internal.zze;
import java.util.Set;

final class Plus$1
  extends Api.zza
{
  public final int getPriority()
  {
    return 2;
  }
  
  public final zze zza(Context paramContext, Looper paramLooper, zzf paramzzf, Plus.PlusOptions paramPlusOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    Object localObject = paramPlusOptions;
    if (paramPlusOptions == null) {
      localObject = new Plus.PlusOptions(null);
    }
    paramPlusOptions = zzqqname;
    String[] arrayOfString = zznh.zzc(paramzzf.zzqt());
    localObject = (String[])zzbdZ.toArray(new String[0]);
    String str1 = paramContext.getPackageName();
    String str2 = paramContext.getPackageName();
    PlusCommonExtras localPlusCommonExtras = new PlusCommonExtras();
    return new zze(paramContext, paramLooper, paramzzf, new PlusSession(paramPlusOptions, arrayOfString, (String[])localObject, new String[0], str1, str2, null, localPlusCommonExtras), paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.Plus.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */