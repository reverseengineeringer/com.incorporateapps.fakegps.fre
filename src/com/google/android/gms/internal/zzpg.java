package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.SessionsApi;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import java.util.concurrent.TimeUnit;

public class zzpg
  implements SessionsApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    return paramGoogleApiClient.zzb(new zzpg.2(this, paramGoogleApiClient, paramString1, paramString2));
  }
  
  public PendingResult insertSession(GoogleApiClient paramGoogleApiClient, SessionInsertRequest paramSessionInsertRequest)
  {
    return paramGoogleApiClient.zza(new zzpg.3(this, paramGoogleApiClient, paramSessionInsertRequest));
  }
  
  public PendingResult readSession(GoogleApiClient paramGoogleApiClient, SessionReadRequest paramSessionReadRequest)
  {
    return paramGoogleApiClient.zza(new zzpg.4(this, paramGoogleApiClient, paramSessionReadRequest));
  }
  
  public PendingResult registerForSessions(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return zza(paramGoogleApiClient, paramPendingIntent, 0);
  }
  
  public PendingResult startSession(GoogleApiClient paramGoogleApiClient, Session paramSession)
  {
    zzx.zzb(paramSession, "Session cannot be null");
    if (paramSession.getEndTime(TimeUnit.MILLISECONDS) == 0L) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Cannot start a session which has already ended");
      return paramGoogleApiClient.zzb(new zzpg.1(this, paramGoogleApiClient, paramSession));
    }
  }
  
  public PendingResult stopSession(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return zza(paramGoogleApiClient, null, paramString);
  }
  
  public PendingResult unregisterForSessions(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.zzb(new zzpg.6(this, paramGoogleApiClient, paramPendingIntent));
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent, int paramInt)
  {
    return paramGoogleApiClient.zzb(new zzpg.5(this, paramGoogleApiClient, paramPendingIntent, paramInt));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */