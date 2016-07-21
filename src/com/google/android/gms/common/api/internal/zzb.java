package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.zza;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.zzq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class zzb
  extends PendingResult
{
  private boolean zzL;
  private final Object zzagI = new Object();
  protected final zzb.zza zzagJ;
  private final WeakReference zzagK;
  private final ArrayList zzagL = new ArrayList();
  private ResultCallback zzagM;
  private volatile boolean zzagN;
  private boolean zzagO;
  private boolean zzagP;
  private zzq zzagQ;
  private Integer zzagR;
  private volatile zzx zzagS;
  private volatile Result zzagy;
  private final CountDownLatch zzpJ = new CountDownLatch(1);
  
  protected zzb(Looper paramLooper)
  {
    zzagJ = new zzb.zza(paramLooper);
    zzagK = new WeakReference(null);
  }
  
  protected zzb(GoogleApiClient paramGoogleApiClient)
  {
    if (paramGoogleApiClient != null) {}
    for (Looper localLooper = paramGoogleApiClient.getLooper();; localLooper = Looper.getMainLooper())
    {
      zzagJ = new zzb.zza(localLooper);
      zzagK = new WeakReference(paramGoogleApiClient);
      return;
    }
  }
  
  private Result get()
  {
    boolean bool = true;
    synchronized (zzagI)
    {
      if (!zzagN)
      {
        com.google.android.gms.common.internal.zzx.zza(bool, "Result has already been consumed.");
        com.google.android.gms.common.internal.zzx.zza(isReady(), "Result is not ready.");
        Result localResult = zzagy;
        zzagy = null;
        zzagM = null;
        zzagN = true;
        zzpf();
        return localResult;
      }
      bool = false;
    }
  }
  
  private void zzb(Result paramResult)
  {
    zzagy = paramResult;
    zzagQ = null;
    zzpJ.countDown();
    paramResult = zzagy.getStatus();
    if (zzagM != null)
    {
      zzagJ.zzph();
      if (!zzL) {
        zzagJ.zza(zzagM, get());
      }
    }
    Iterator localIterator = zzagL.iterator();
    while (localIterator.hasNext()) {
      ((PendingResult.zza)localIterator.next()).zzu(paramResult);
    }
    zzagL.clear();
  }
  
  public static void zzc(Result paramResult)
  {
    if ((paramResult instanceof Releasable)) {}
    try
    {
      ((Releasable)paramResult).release();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.w("BasePendingResult", "Unable to release " + paramResult, localRuntimeException);
    }
  }
  
  public final Result await()
  {
    boolean bool2 = true;
    boolean bool1;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      bool1 = true;
    }
    for (;;)
    {
      com.google.android.gms.common.internal.zzx.zza(bool1, "await must not be called on the UI thread");
      if (!zzagN)
      {
        bool1 = true;
        label28:
        com.google.android.gms.common.internal.zzx.zza(bool1, "Result has already been consumed");
        if (zzagS != null) {
          break label80;
        }
        bool1 = bool2;
        com.google.android.gms.common.internal.zzx.zza(bool1, "Cannot await if then() has been called.");
      }
      try
      {
        zzpJ.await();
        com.google.android.gms.common.internal.zzx.zza(isReady(), "Result is not ready.");
        return get();
        bool1 = false;
        continue;
        bool1 = false;
        break label28;
        label80:
        bool1 = false;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          zzx(Status.zzagD);
        }
      }
    }
  }
  
  public final Result await(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramLong <= 0L) || (Looper.myLooper() != Looper.getMainLooper())) {
      bool1 = true;
    }
    for (;;)
    {
      com.google.android.gms.common.internal.zzx.zza(bool1, "await must not be called on the UI thread when time is greater than zero.");
      if (!zzagN)
      {
        bool1 = true;
        label38:
        com.google.android.gms.common.internal.zzx.zza(bool1, "Result has already been consumed.");
        if (zzagS != null) {
          break label108;
        }
        bool1 = bool2;
        com.google.android.gms.common.internal.zzx.zza(bool1, "Cannot await if then() has been called.");
      }
      try
      {
        if (!zzpJ.await(paramLong, paramTimeUnit)) {
          zzx(Status.zzagF);
        }
        com.google.android.gms.common.internal.zzx.zza(isReady(), "Result is not ready.");
        return get();
        bool1 = false;
        continue;
        bool1 = false;
        break label38;
        label108:
        bool1 = false;
      }
      catch (InterruptedException paramTimeUnit)
      {
        for (;;)
        {
          zzx(Status.zzagD);
        }
      }
    }
  }
  
  public void cancel()
  {
    synchronized (zzagI)
    {
      if ((zzL) || (zzagN)) {
        return;
      }
      zzq localzzq = zzagQ;
      if (localzzq == null) {}
    }
    try
    {
      zzagQ.cancel();
      zzc(zzagy);
      zzagM = null;
      zzL = true;
      zzb(zzc(Status.zzagG));
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public boolean isCanceled()
  {
    synchronized (zzagI)
    {
      boolean bool = zzL;
      return bool;
    }
  }
  
  public final boolean isReady()
  {
    return zzpJ.getCount() == 0L;
  }
  
  public final void setResultCallback(ResultCallback paramResultCallback)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!zzagN)
    {
      bool1 = true;
      com.google.android.gms.common.internal.zzx.zza(bool1, "Result has already been consumed.");
    }
    for (;;)
    {
      synchronized (zzagI)
      {
        if (zzagS != null) {
          break label129;
        }
        bool1 = bool2;
        com.google.android.gms.common.internal.zzx.zza(bool1, "Cannot set callbacks if then() has been called.");
        if (isCanceled()) {
          return;
        }
        if ((zzagP) && (((GoogleApiClient)zzagK.get() == null) || (!(paramResultCallback instanceof zzx))))
        {
          cancel();
          return;
        }
      }
      if (isReady()) {
        zzagJ.zza(paramResultCallback, get());
      }
      for (;;)
      {
        return;
        zzagM = paramResultCallback;
      }
      bool1 = false;
      break;
      label129:
      bool1 = false;
    }
  }
  
  public final void setResultCallback(ResultCallback paramResultCallback, long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!zzagN)
    {
      bool1 = true;
      com.google.android.gms.common.internal.zzx.zza(bool1, "Result has already been consumed.");
    }
    for (;;)
    {
      synchronized (zzagI)
      {
        if (zzagS != null) {
          break label150;
        }
        bool1 = bool2;
        com.google.android.gms.common.internal.zzx.zza(bool1, "Cannot set callbacks if then() has been called.");
        if (isCanceled()) {
          return;
        }
        if ((zzagP) && (((GoogleApiClient)zzagK.get() == null) || (!(paramResultCallback instanceof zzx))))
        {
          cancel();
          return;
        }
      }
      if (isReady()) {
        zzagJ.zza(paramResultCallback, get());
      }
      for (;;)
      {
        return;
        zzagM = paramResultCallback;
        zzagJ.zza(this, paramTimeUnit.toMillis(paramLong));
      }
      bool1 = false;
      break;
      label150:
      bool1 = false;
    }
  }
  
  public TransformedResult then(ResultTransform paramResultTransform)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!zzagN)
    {
      bool1 = true;
      com.google.android.gms.common.internal.zzx.zza(bool1, "Result has already been consumed.");
    }
    for (;;)
    {
      synchronized (zzagI)
      {
        if (zzagS != null) {
          break label131;
        }
        bool1 = true;
        com.google.android.gms.common.internal.zzx.zza(bool1, "Cannot call then() twice.");
        if (zzagM != null) {
          break label136;
        }
        bool1 = bool2;
        com.google.android.gms.common.internal.zzx.zza(bool1, "Cannot call then() if callbacks are set.");
        zzagS = new zzx(zzagK);
        paramResultTransform = zzagS.then(paramResultTransform);
        if (isReady())
        {
          zzagJ.zza(zzagS, get());
          return paramResultTransform;
        }
        zzagM = zzagS;
      }
      bool1 = false;
      break;
      label131:
      bool1 = false;
      continue;
      label136:
      bool1 = false;
    }
  }
  
  public final void zza(PendingResult.zza paramzza)
  {
    boolean bool2 = true;
    if (!zzagN)
    {
      bool1 = true;
      com.google.android.gms.common.internal.zzx.zza(bool1, "Result has already been consumed.");
      if (paramzza == null) {
        break label88;
      }
    }
    label88:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      com.google.android.gms.common.internal.zzx.zzb(bool1, "Callback cannot be null.");
      synchronized (zzagI)
      {
        if (isReady())
        {
          paramzza.zzu(zzagy.getStatus());
          return;
        }
        zzagL.add(paramzza);
      }
      bool1 = false;
      break;
    }
  }
  
  public final void zza(Result paramResult)
  {
    boolean bool2 = true;
    for (;;)
    {
      synchronized (zzagI)
      {
        if ((zzagO) || (zzL))
        {
          zzc(paramResult);
          return;
        }
        if (!isReady())
        {
          bool1 = true;
          com.google.android.gms.common.internal.zzx.zza(bool1, "Results have already been set");
          if (zzagN) {
            break label84;
          }
          bool1 = bool2;
          com.google.android.gms.common.internal.zzx.zza(bool1, "Result has already been consumed");
          zzb(paramResult);
          return;
        }
      }
      boolean bool1 = false;
      continue;
      label84:
      bool1 = false;
    }
  }
  
  protected final void zza(zzq paramzzq)
  {
    synchronized (zzagI)
    {
      zzagQ = paramzzq;
      return;
    }
  }
  
  protected abstract Result zzc(Status paramStatus);
  
  public Integer zzpa()
  {
    return zzagR;
  }
  
  protected void zzpf() {}
  
  public void zzpg()
  {
    for (;;)
    {
      synchronized (zzagI)
      {
        if ((GoogleApiClient)zzagK.get() == null)
        {
          cancel();
          return;
        }
        if ((zzagM == null) || ((zzagM instanceof zzx)))
        {
          zzagP = true;
          return;
        }
      }
      cancel();
    }
  }
  
  public final void zzx(Status paramStatus)
  {
    synchronized (zzagI)
    {
      if (!isReady())
      {
        zza(zzc(paramStatus));
        zzagO = true;
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */