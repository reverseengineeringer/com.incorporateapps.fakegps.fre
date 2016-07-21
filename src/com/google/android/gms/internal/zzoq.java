package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;

public abstract interface zzoq
  extends IInterface
{
  public abstract void zza(SessionInsertRequest paramSessionInsertRequest);
  
  public abstract void zza(SessionReadRequest paramSessionReadRequest);
  
  public abstract void zza(SessionRegistrationRequest paramSessionRegistrationRequest);
  
  public abstract void zza(SessionStartRequest paramSessionStartRequest);
  
  public abstract void zza(SessionStopRequest paramSessionStopRequest);
  
  public abstract void zza(SessionUnregistrationRequest paramSessionUnregistrationRequest);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzoq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */