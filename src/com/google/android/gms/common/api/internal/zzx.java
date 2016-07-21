package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

public class zzx
  extends TransformedResult
  implements ResultCallback
{
  private final Object zzagI = new Object();
  private final WeakReference zzagK;
  private ResultTransform zzaiN = null;
  private zzx zzaiO = null;
  private ResultCallbacks zzaiP = null;
  private PendingResult zzaiQ = null;
  private Status zzaiR = null;
  private final zzx.zza zzaiS;
  
  public zzx(WeakReference paramWeakReference)
  {
    com.google.android.gms.common.internal.zzx.zzb(paramWeakReference, "GoogleApiClient reference must not be null");
    zzagK = paramWeakReference;
    paramWeakReference = (GoogleApiClient)zzagK.get();
    if (paramWeakReference != null) {}
    for (paramWeakReference = paramWeakReference.getLooper();; paramWeakReference = Looper.getMainLooper())
    {
      zzaiS = new zzx.zza(this, paramWeakReference);
      return;
    }
  }
  
  private void zzc(Result paramResult)
  {
    if ((paramResult instanceof Releasable)) {}
    try
    {
      ((Releasable)paramResult).release();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.w("TransformedResultImpl", "Unable to release " + paramResult, localRuntimeException);
    }
  }
  
  private void zzpT()
  {
    if ((zzaiN == null) && (zzaiP == null)) {}
    do
    {
      return;
      GoogleApiClient localGoogleApiClient = (GoogleApiClient)zzagK.get();
      if ((zzaiN != null) && (localGoogleApiClient != null)) {
        localGoogleApiClient.zza(this);
      }
      if (zzaiR != null)
      {
        zzz(zzaiR);
        return;
      }
    } while (zzaiQ == null);
    zzaiQ.setResultCallback(this);
  }
  
  private boolean zzpV()
  {
    GoogleApiClient localGoogleApiClient = (GoogleApiClient)zzagK.get();
    return (zzaiP != null) && (localGoogleApiClient != null);
  }
  
  private void zzy(Status paramStatus)
  {
    synchronized (zzagI)
    {
      zzaiR = paramStatus;
      zzz(zzaiR);
      return;
    }
  }
  
  private void zzz(Status paramStatus)
  {
    synchronized (zzagI)
    {
      if (zzaiN != null)
      {
        paramStatus = zzaiN.onFailure(paramStatus);
        com.google.android.gms.common.internal.zzx.zzb(paramStatus, "onFailure must not return null");
        zzaiO.zzy(paramStatus);
      }
      while (!zzpV()) {
        return;
      }
      zzaiP.onFailure(paramStatus);
    }
  }
  
  public void andFinally(ResultCallbacks paramResultCallbacks)
  {
    boolean bool2 = true;
    synchronized (zzagI)
    {
      if (zzaiP == null) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        com.google.android.gms.common.internal.zzx.zza(bool1, "Cannot call andFinally() twice.");
        if (zzaiN != null) {
          break;
        }
        bool1 = bool2;
        com.google.android.gms.common.internal.zzx.zza(bool1, "Cannot call then() and andFinally() on the same TransformedResult.");
        zzaiP = paramResultCallbacks;
        zzpT();
        return;
      }
      bool1 = false;
    }
  }
  
  public void onResult(Result paramResult)
  {
    for (;;)
    {
      synchronized (zzagI)
      {
        if (paramResult.getStatus().isSuccess())
        {
          if (zzaiN != null)
          {
            zzs.zzpN().submit(new zzx.1(this, paramResult));
            return;
          }
          if (!zzpV()) {
            continue;
          }
          zzaiP.onSuccess(paramResult);
        }
      }
      zzy(paramResult.getStatus());
      zzc(paramResult);
    }
  }
  
  public TransformedResult then(ResultTransform paramResultTransform)
  {
    boolean bool2 = true;
    synchronized (zzagI)
    {
      if (zzaiN == null) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        com.google.android.gms.common.internal.zzx.zza(bool1, "Cannot call then() twice.");
        if (zzaiP != null) {
          break;
        }
        bool1 = bool2;
        com.google.android.gms.common.internal.zzx.zza(bool1, "Cannot call then() and andFinally() on the same TransformedResult.");
        zzaiN = paramResultTransform;
        paramResultTransform = new zzx(zzagK);
        zzaiO = paramResultTransform;
        zzpT();
        return paramResultTransform;
      }
      bool1 = false;
    }
  }
  
  public void zza(PendingResult paramPendingResult)
  {
    synchronized (zzagI)
    {
      zzaiQ = paramPendingResult;
      zzpT();
      return;
    }
  }
  
  void zzpU()
  {
    synchronized (zzagI)
    {
      zzaiP = null;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */