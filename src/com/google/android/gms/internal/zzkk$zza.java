package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi.ActionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

final class zzkk$zza
  implements AppIndexApi.ActionResult
{
  private zzkk zzUD;
  private PendingResult zzUE;
  private Action zzUF;
  
  zzkk$zza(zzkk paramzzkk, PendingResult paramPendingResult, Action paramAction)
  {
    zzUD = paramzzkk;
    zzUE = paramPendingResult;
    zzUF = paramAction;
  }
  
  public final PendingResult end(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject = paramGoogleApiClient.getContext().getPackageName();
    long l = System.currentTimeMillis();
    localObject = zzkj.zza(zzUF, l, (String)localObject, 2);
    return zzUD.zza(paramGoogleApiClient, new UsageInfo[] { localObject });
  }
  
  public final PendingResult getPendingResult()
  {
    return zzUE;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkk.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */