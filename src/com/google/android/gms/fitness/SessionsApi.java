package com.google.android.gms.fitness;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;

public abstract interface SessionsApi
{
  public abstract PendingResult insertSession(GoogleApiClient paramGoogleApiClient, SessionInsertRequest paramSessionInsertRequest);
  
  public abstract PendingResult readSession(GoogleApiClient paramGoogleApiClient, SessionReadRequest paramSessionReadRequest);
  
  public abstract PendingResult registerForSessions(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);
  
  public abstract PendingResult startSession(GoogleApiClient paramGoogleApiClient, Session paramSession);
  
  public abstract PendingResult stopSession(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult unregisterForSessions(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.SessionsApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */