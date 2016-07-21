package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzk.zza;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.zzmf;
import com.google.android.gms.internal.zzmg;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

public final class zzj
  extends GoogleApiClient
  implements zzp.zza
{
  private final Context mContext;
  private final Lock zzXG;
  private final int zzagp;
  private final Looper zzagr;
  private final zzc zzags;
  final Api.zza zzagt;
  final Map zzahA;
  private final zzk zzahL;
  private zzp zzahM = null;
  final Queue zzahN = new LinkedList();
  private volatile boolean zzahO;
  private long zzahP = 120000L;
  private long zzahQ = 5000L;
  private final zzj.zza zzahR;
  zzj.zzc zzahS;
  final Map zzahT;
  Set zzahU = new HashSet();
  private final Set zzahV = Collections.newSetFromMap(new WeakHashMap());
  final Set zzahW = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
  private zza zzahX;
  private final ArrayList zzahY;
  private Integer zzahZ = null;
  final zzf zzahz;
  Set zzaia = null;
  private final zzj.zzd zzaib = new zzj.1(this);
  private final zzk.zza zzaic = new zzj.2(this);
  
  public zzj(Context paramContext, Lock paramLock, Looper paramLooper, zzf paramzzf, zzc paramzzc, Api.zza paramzza, Map paramMap1, List paramList1, List paramList2, Map paramMap2, int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    mContext = paramContext;
    zzXG = paramLock;
    zzahL = new zzk(paramLooper, zzaic);
    zzagr = paramLooper;
    zzahR = new zzj.zza(this, paramLooper);
    zzags = paramzzc;
    zzagp = paramInt1;
    if (zzagp >= 0) {
      zzahZ = Integer.valueOf(paramInt2);
    }
    zzahA = paramMap1;
    zzahT = paramMap2;
    zzahY = paramArrayList;
    paramContext = paramList1.iterator();
    while (paramContext.hasNext())
    {
      paramLock = (GoogleApiClient.ConnectionCallbacks)paramContext.next();
      zzahL.registerConnectionCallbacks(paramLock);
    }
    paramContext = paramList2.iterator();
    while (paramContext.hasNext())
    {
      paramLock = (GoogleApiClient.OnConnectionFailedListener)paramContext.next();
      zzahL.registerConnectionFailedListener(paramLock);
    }
    zzahz = paramzzf;
    zzagt = paramzza;
  }
  
  private void resume()
  {
    zzXG.lock();
    try
    {
      if (zzpB()) {
        zzpC();
      }
      return;
    }
    finally
    {
      zzXG.unlock();
    }
  }
  
  public static int zza(Iterable paramIterable, boolean paramBoolean)
  {
    int k = 1;
    paramIterable = paramIterable.iterator();
    int i = 0;
    int j = 0;
    if (paramIterable.hasNext())
    {
      Api.zzb localzzb = (Api.zzb)paramIterable.next();
      if (localzzb.zzmE()) {
        j = 1;
      }
      if (!localzzb.zznb()) {
        break label85;
      }
      i = 1;
    }
    label85:
    for (;;)
    {
      break;
      if (j != 0)
      {
        j = k;
        if (i != 0)
        {
          j = k;
          if (paramBoolean) {
            j = 2;
          }
        }
        return j;
      }
      return 3;
    }
  }
  
  private void zza(GoogleApiClient paramGoogleApiClient, zzv paramzzv, boolean paramBoolean)
  {
    zzmf.zzamA.zzf(paramGoogleApiClient).setResultCallback(new zzj.5(this, paramzzv, paramBoolean, paramGoogleApiClient));
  }
  
  private static void zza(zzj.zze paramzze, zza paramzza, IBinder paramIBinder)
  {
    if (paramzze.isReady())
    {
      paramzze.zza(new zzj.zzb(paramzze, paramzza, paramIBinder, null));
      return;
    }
    if ((paramIBinder != null) && (paramIBinder.isBinderAlive()))
    {
      zzj.zzb localzzb = new zzj.zzb(paramzze, paramzza, paramIBinder, null);
      paramzze.zza(localzzb);
      try
      {
        paramIBinder.linkToDeath(localzzb, 0);
        return;
      }
      catch (RemoteException paramIBinder)
      {
        paramzze.cancel();
        paramzza.remove(paramzze.zzpa().intValue());
        return;
      }
    }
    paramzze.zza(null);
    paramzze.cancel();
    paramzza.remove(paramzze.zzpa().intValue());
  }
  
  private void zzbB(int paramInt)
  {
    if (zzahZ == null) {
      zzahZ = Integer.valueOf(paramInt);
    }
    while (zzahM != null)
    {
      return;
      if (zzahZ.intValue() != paramInt) {
        throw new IllegalStateException("Cannot use sign-in mode: " + zzbC(paramInt) + ". Mode was already set to " + zzbC(zzahZ.intValue()));
      }
    }
    Iterator localIterator = zzahT.values().iterator();
    paramInt = 0;
    int i = 0;
    if (localIterator.hasNext())
    {
      Api.zzb localzzb = (Api.zzb)localIterator.next();
      if (localzzb.zzmE()) {
        i = 1;
      }
      if (!localzzb.zznb()) {
        break label313;
      }
      paramInt = 1;
    }
    label313:
    for (;;)
    {
      break;
      switch (zzahZ.intValue())
      {
      }
      do
      {
        do
        {
          zzahM = new zzl(mContext, this, zzXG, zzagr, zzags, zzahT, zzahz, zzahA, zzagt, zzahY, this);
          return;
          if (i == 0) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
          }
        } while (paramInt == 0);
        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
      } while (i == 0);
      zzahM = new zzd(mContext, this, zzXG, zzagr, zzags, zzahT, zzahz, zzahA, zzagt, zzahY);
      return;
    }
  }
  
  static String zzbC(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 3: 
      return "SIGN_IN_MODE_NONE";
    case 1: 
      return "SIGN_IN_MODE_REQUIRED";
    }
    return "SIGN_IN_MODE_OPTIONAL";
  }
  
  private void zzpC()
  {
    zzahL.zzqR();
    zzahM.connect();
  }
  
  private void zzpD()
  {
    zzXG.lock();
    try
    {
      if (zzpF()) {
        zzpC();
      }
      return;
    }
    finally
    {
      zzXG.unlock();
    }
  }
  
  public final ConnectionResult blockingConnect()
  {
    boolean bool2 = true;
    boolean bool1;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      bool1 = true;
    }
    for (;;)
    {
      com.google.android.gms.common.internal.zzx.zza(bool1, "blockingConnect must not be called on the UI thread");
      zzXG.lock();
      try
      {
        if (zzagp >= 0) {
          if (zzahZ != null)
          {
            bool1 = bool2;
            label45:
            com.google.android.gms.common.internal.zzx.zza(bool1, "Sign-in mode should have been set explicitly by auto-manage.");
          }
        }
        do
        {
          for (;;)
          {
            zzbB(zzahZ.intValue());
            zzahL.zzqR();
            ConnectionResult localConnectionResult = zzahM.blockingConnect();
            return localConnectionResult;
            bool1 = false;
            break;
            bool1 = false;
            break label45;
            if (zzahZ != null) {
              break label143;
            }
            zzahZ = Integer.valueOf(zza(zzahT.values(), false));
          }
        } while (zzahZ.intValue() != 2);
      }
      finally
      {
        zzXG.unlock();
      }
    }
    label143:
    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
  }
  
  public final ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool = false;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      bool = true;
    }
    com.google.android.gms.common.internal.zzx.zza(bool, "blockingConnect must not be called on the UI thread");
    com.google.android.gms.common.internal.zzx.zzb(paramTimeUnit, "TimeUnit must not be null");
    zzXG.lock();
    try
    {
      if (zzahZ == null) {
        zzahZ = Integer.valueOf(zza(zzahT.values(), false));
      }
      while (zzahZ.intValue() != 2)
      {
        zzbB(zzahZ.intValue());
        zzahL.zzqR();
        paramTimeUnit = zzahM.blockingConnect(paramLong, paramTimeUnit);
        return paramTimeUnit;
      }
      throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
    }
    finally
    {
      zzXG.unlock();
    }
  }
  
  public final PendingResult clearDefaultAccountAndReconnect()
  {
    com.google.android.gms.common.internal.zzx.zza(isConnected(), "GoogleApiClient is not connected yet.");
    if (zzahZ.intValue() != 2) {}
    zzv localzzv;
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.zzx.zza(bool, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
      localzzv = new zzv(this);
      if (!zzahT.containsKey(zzmf.zzUI)) {
        break;
      }
      zza(this, localzzv, false);
      return localzzv;
    }
    AtomicReference localAtomicReference = new AtomicReference();
    Object localObject = new zzj.3(this, localAtomicReference, localzzv);
    zzj.4 local4 = new zzj.4(this, localzzv);
    localObject = new GoogleApiClient.Builder(mContext).addApi(zzmf.API).addConnectionCallbacks((GoogleApiClient.ConnectionCallbacks)localObject).addOnConnectionFailedListener(local4).setHandler(zzahR).build();
    localAtomicReference.set(localObject);
    ((GoogleApiClient)localObject).connect();
    return localzzv;
  }
  
  public final void connect()
  {
    boolean bool = false;
    zzXG.lock();
    try
    {
      if (zzagp >= 0)
      {
        if (zzahZ != null) {
          bool = true;
        }
        com.google.android.gms.common.internal.zzx.zza(bool, "Sign-in mode should have been set explicitly by auto-manage.");
      }
      do
      {
        for (;;)
        {
          connect(zzahZ.intValue());
          return;
          if (zzahZ != null) {
            break;
          }
          zzahZ = Integer.valueOf(zza(zzahT.values(), false));
        }
      } while (zzahZ.intValue() != 2);
    }
    finally
    {
      zzXG.unlock();
    }
    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
  }
  
  /* Error */
  public final void connect(int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 117	com/google/android/gms/common/api/internal/zzj:zzXG	Ljava/util/concurrent/locks/Lock;
    //   6: invokeinterface 188 1 0
    //   11: iload_3
    //   12: istore_2
    //   13: iload_1
    //   14: iconst_3
    //   15: if_icmpeq +17 -> 32
    //   18: iload_3
    //   19: istore_2
    //   20: iload_1
    //   21: iconst_1
    //   22: if_icmpeq +10 -> 32
    //   25: iload_1
    //   26: iconst_2
    //   27: if_icmpne +45 -> 72
    //   30: iload_3
    //   31: istore_2
    //   32: iload_2
    //   33: new 290	java/lang/StringBuilder
    //   36: dup
    //   37: ldc_w 471
    //   40: invokespecial 295	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   43: iload_1
    //   44: invokevirtual 474	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   47: invokevirtual 309	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: invokestatic 476	com/google/android/gms/common/internal/zzx:zzb	(ZLjava/lang/Object;)V
    //   53: aload_0
    //   54: iload_1
    //   55: invokespecial 382	com/google/android/gms/common/api/internal/zzj:zzbB	(I)V
    //   58: aload_0
    //   59: invokespecial 194	com/google/android/gms/common/api/internal/zzj:zzpC	()V
    //   62: aload_0
    //   63: getfield 117	com/google/android/gms/common/api/internal/zzj:zzXG	Ljava/util/concurrent/locks/Lock;
    //   66: invokeinterface 197 1 0
    //   71: return
    //   72: iconst_0
    //   73: istore_2
    //   74: goto -42 -> 32
    //   77: astore 4
    //   79: aload_0
    //   80: getfield 117	com/google/android/gms/common/api/internal/zzj:zzXG	Ljava/util/concurrent/locks/Lock;
    //   83: invokeinterface 197 1 0
    //   88: aload 4
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	zzj
    //   0	91	1	paramInt	int
    //   12	62	2	bool1	boolean
    //   1	30	3	bool2	boolean
    //   77	12	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   32	62	77	finally
  }
  
  public final void disconnect()
  {
    zzXG.lock();
    for (;;)
    {
      try
      {
        if ((zzahM != null) && (!zzahM.disconnect()))
        {
          bool = true;
          zzaa(bool);
          Iterator localIterator = zzahV.iterator();
          if (!localIterator.hasNext()) {
            break;
          }
          ((zzq)localIterator.next()).clear();
          continue;
        }
        boolean bool = false;
      }
      finally
      {
        zzXG.unlock();
      }
    }
    zzahV.clear();
    Object localObject2 = zzahN.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      zzj.zze localzze = (zzj.zze)((Iterator)localObject2).next();
      localzze.zza(null);
      localzze.cancel();
    }
    zzahN.clear();
    localObject2 = zzahM;
    if (localObject2 == null)
    {
      zzXG.unlock();
      return;
    }
    zzpF();
    zzahL.zzqQ();
    zzXG.unlock();
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("mContext=").println(mContext);
    paramPrintWriter.append(paramString).append("mResuming=").print(zzahO);
    paramPrintWriter.append(" mWorkQueue.size()=").print(zzahN.size());
    paramPrintWriter.append(" mUnconsumedRunners.size()=").println(zzahW.size());
    if (zzahM != null) {
      zzahM.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final ConnectionResult getConnectionResult(Api paramApi)
  {
    zzXG.lock();
    try
    {
      if ((!isConnected()) && (!zzpB())) {
        throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
      }
    }
    finally
    {
      zzXG.unlock();
    }
    if (zzahT.containsKey(paramApi.zzoR()))
    {
      ConnectionResult localConnectionResult = zzahM.getConnectionResult(paramApi);
      if (localConnectionResult == null)
      {
        if (zzpB())
        {
          paramApi = ConnectionResult.zzafB;
          zzXG.unlock();
          return paramApi;
        }
        Log.i("GoogleApiClientImpl", zzpH());
        Log.wtf("GoogleApiClientImpl", paramApi.getName() + " requested in getConnectionResult is not connected but is not present in the failed  connections map", new Exception());
        paramApi = new ConnectionResult(8, null);
        zzXG.unlock();
        return paramApi;
      }
      zzXG.unlock();
      return localConnectionResult;
    }
    throw new IllegalArgumentException(paramApi.getName() + " was never registered with GoogleApiClient");
  }
  
  public final Context getContext()
  {
    return mContext;
  }
  
  public final Looper getLooper()
  {
    return zzagr;
  }
  
  public final int getSessionId()
  {
    return System.identityHashCode(this);
  }
  
  public final boolean hasConnectedApi(Api paramApi)
  {
    paramApi = (Api.zzb)zzahT.get(paramApi.zzoR());
    return (paramApi != null) && (paramApi.isConnected());
  }
  
  public final boolean isConnected()
  {
    return (zzahM != null) && (zzahM.isConnected());
  }
  
  public final boolean isConnecting()
  {
    return (zzahM != null) && (zzahM.isConnecting());
  }
  
  public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return zzahL.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }
  
  public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return zzahL.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }
  
  public final void reconnect()
  {
    disconnect();
    connect();
  }
  
  public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    zzahL.registerConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzahL.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public final void stopAutoManage(FragmentActivity paramFragmentActivity)
  {
    if (zzagp >= 0)
    {
      zzw localzzw = zzw.zza(paramFragmentActivity);
      if (localzzw == null)
      {
        new Handler(mContext.getMainLooper()).post(new zzj.6(this, paramFragmentActivity));
        return;
      }
      localzzw.zzbD(zzagp);
      return;
    }
    throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
  }
  
  public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    zzahL.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzahL.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public final Api.zzb zza(Api.zzc paramzzc)
  {
    paramzzc = (Api.zzb)zzahT.get(paramzzc);
    com.google.android.gms.common.internal.zzx.zzb(paramzzc, "Appropriate Api was not requested.");
    return paramzzc;
  }
  
  public final zza.zza zza(zza.zza paramzza)
  {
    boolean bool;
    if (paramzza.zzoR() != null) {
      bool = true;
    }
    for (;;)
    {
      com.google.android.gms.common.internal.zzx.zzb(bool, "This task can not be enqueued (it's probably a Batch or malformed)");
      com.google.android.gms.common.internal.zzx.zzb(zzahT.containsKey(paramzza.zzoR()), "GoogleApiClient is not configured to use the API required for this call.");
      zzXG.lock();
      try
      {
        if (zzahM == null)
        {
          zzahN.add(paramzza);
          return paramzza;
          bool = false;
          continue;
        }
        paramzza = zzahM.zza(paramzza);
        return paramzza;
      }
      finally
      {
        zzXG.unlock();
      }
    }
  }
  
  public final void zza(zzx paramzzx)
  {
    zzXG.lock();
    try
    {
      if (zzaia == null) {
        zzaia = new HashSet();
      }
      zzaia.add(paramzzx);
      return;
    }
    finally
    {
      zzXG.unlock();
    }
  }
  
  public final boolean zza(Api paramApi)
  {
    return zzahT.containsKey(paramApi.zzoR());
  }
  
  public final boolean zza(zzu paramzzu)
  {
    return (zzahM != null) && (zzahM.zza(paramzzu));
  }
  
  final void zzaa(boolean paramBoolean)
  {
    Iterator localIterator = zzahW.iterator();
    while (localIterator.hasNext())
    {
      zzj.zze localzze = (zzj.zze)localIterator.next();
      if (localzze.zzpa() == null)
      {
        if (paramBoolean)
        {
          localzze.zzpg();
        }
        else
        {
          localzze.cancel();
          zzahW.remove(localzze);
        }
      }
      else
      {
        localzze.zzpe();
        IBinder localIBinder = zza(localzze.zzoR()).zzoT();
        zza(localzze, zzahX, localIBinder);
        zzahW.remove(localzze);
      }
    }
  }
  
  public final zza.zza zzb(zza.zza paramzza)
  {
    if (paramzza.zzoR() != null) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.zzx.zzb(bool, "This task can not be executed (it's probably a Batch or malformed)");
      zzXG.lock();
      try
      {
        if (zzahM != null) {
          break;
        }
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
      }
      finally
      {
        zzXG.unlock();
      }
    }
    if (zzpB())
    {
      zzahN.add(paramzza);
      while (!zzahN.isEmpty())
      {
        zzj.zze localzze = (zzj.zze)zzahN.remove();
        zzb(localzze);
        localzze.zzw(Status.zzagE);
      }
      zzXG.unlock();
      return paramzza;
    }
    paramzza = zzahM.zzb(paramzza);
    zzXG.unlock();
    return paramzza;
  }
  
  final void zzb(zzj.zze paramzze)
  {
    zzahW.add(paramzze);
    paramzze.zza(zzaib);
  }
  
  public final void zzb(zzx paramzzx)
  {
    zzXG.lock();
    for (;;)
    {
      try
      {
        if (zzaia == null)
        {
          Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
          return;
        }
        if (!zzaia.remove(paramzzx))
        {
          Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
          continue;
        }
        if (zzpG()) {
          continue;
        }
      }
      finally
      {
        zzXG.unlock();
      }
      zzahM.zzpj();
    }
  }
  
  public final void zzc(int paramInt, boolean paramBoolean)
  {
    if ((paramInt == 1) && (!paramBoolean)) {
      zzpE();
    }
    Iterator localIterator = zzahW.iterator();
    while (localIterator.hasNext())
    {
      zzj.zze localzze = (zzj.zze)localIterator.next();
      if (paramBoolean) {
        localzze.zzpe();
      }
      localzze.zzx(new Status(8, "The connection to Google Play services was lost"));
    }
    zzahW.clear();
    zzahL.zzbT(paramInt);
    zzahL.zzqQ();
    if (paramInt == 2) {
      zzpC();
    }
  }
  
  public final void zzd(ConnectionResult paramConnectionResult)
  {
    if (!zzags.zzd(mContext, paramConnectionResult.getErrorCode())) {
      zzpF();
    }
    if (!zzpB())
    {
      zzahL.zzk(paramConnectionResult);
      zzahL.zzqQ();
    }
  }
  
  public final void zzi(Bundle paramBundle)
  {
    while (!zzahN.isEmpty()) {
      zzb((zza.zza)zzahN.remove());
    }
    zzahL.zzk(paramBundle);
  }
  
  public final void zzoW()
  {
    if (zzahM != null) {
      zzahM.zzoW();
    }
  }
  
  final boolean zzpB()
  {
    return zzahO;
  }
  
  final void zzpE()
  {
    if (zzpB()) {
      return;
    }
    zzahO = true;
    if (zzahS == null) {
      zzahS = ((zzj.zzc)zzn.zza(mContext.getApplicationContext(), new zzj.zzc(this), zzags));
    }
    zzahR.sendMessageDelayed(zzahR.obtainMessage(1), zzahP);
    zzahR.sendMessageDelayed(zzahR.obtainMessage(2), zzahQ);
  }
  
  final boolean zzpF()
  {
    if (!zzpB()) {
      return false;
    }
    zzahO = false;
    zzahR.removeMessages(2);
    zzahR.removeMessages(1);
    if (zzahS != null)
    {
      zzahS.unregister();
      zzahS = null;
    }
    return true;
  }
  
  final boolean zzpG()
  {
    boolean bool1 = false;
    zzXG.lock();
    try
    {
      Set localSet = zzaia;
      if (localSet == null) {
        return false;
      }
      boolean bool2 = zzaia.isEmpty();
      if (!bool2) {
        bool1 = true;
      }
      return bool1;
    }
    finally
    {
      zzXG.unlock();
    }
  }
  
  final String zzpH()
  {
    StringWriter localStringWriter = new StringWriter();
    dump("", null, new PrintWriter(localStringWriter), null);
    return localStringWriter.toString();
  }
  
  public final zzq zzr(Object paramObject)
  {
    com.google.android.gms.common.internal.zzx.zzb(paramObject, "Listener must not be null");
    zzXG.lock();
    try
    {
      paramObject = new zzq(zzagr, paramObject);
      zzahV.add(paramObject);
      return (zzq)paramObject;
    }
    finally
    {
      zzXG.unlock();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */