package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class zzd
  implements zzp
{
  private final Context mContext;
  private final Lock zzXG;
  private final zzj zzagW;
  private final zzl zzagX;
  private final zzl zzagY;
  private final Map zzagZ = new ArrayMap();
  private final Looper zzagr;
  private final Set zzaha = Collections.newSetFromMap(new WeakHashMap());
  private final Api.zzb zzahb;
  private Bundle zzahc;
  private ConnectionResult zzahd = null;
  private ConnectionResult zzahe = null;
  private boolean zzahf = false;
  private int zzahg = 0;
  
  public zzd(Context paramContext, zzj paramzzj, Lock paramLock, Looper paramLooper, com.google.android.gms.common.zzc paramzzc, Map paramMap1, zzf paramzzf, Map paramMap2, Api.zza paramzza, ArrayList paramArrayList)
  {
    mContext = paramContext;
    zzagW = paramzzj;
    zzXG = paramLock;
    zzagr = paramLooper;
    paramzzj = null;
    ArrayMap localArrayMap1 = new ArrayMap();
    ArrayMap localArrayMap2 = new ArrayMap();
    Object localObject2 = paramMap1.keySet().iterator();
    Api.zzc localzzc;
    while (((Iterator)localObject2).hasNext())
    {
      localzzc = (Api.zzc)((Iterator)localObject2).next();
      localObject1 = (Api.zzb)paramMap1.get(localzzc);
      if (((Api.zzb)localObject1).zznb()) {
        paramzzj = (zzj)localObject1;
      }
      if (((Api.zzb)localObject1).zzmE()) {
        localArrayMap1.put(localzzc, localObject1);
      } else {
        localArrayMap2.put(localzzc, localObject1);
      }
    }
    zzahb = paramzzj;
    if (localArrayMap1.isEmpty()) {
      throw new IllegalStateException("CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
    }
    paramzzj = new ArrayMap();
    paramMap1 = new ArrayMap();
    Object localObject1 = paramMap2.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Api)((Iterator)localObject1).next();
      localzzc = ((Api)localObject2).zzoR();
      if (localArrayMap1.containsKey(localzzc)) {
        paramzzj.put(localObject2, paramMap2.get(localObject2));
      } else if (localArrayMap2.containsKey(localzzc)) {
        paramMap1.put(localObject2, paramMap2.get(localObject2));
      } else {
        throw new IllegalStateException("Each API in the apiTypeMap must have a corresponding client in the clients map.");
      }
    }
    paramMap2 = new ArrayList();
    localObject1 = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      localObject2 = (zzc)paramArrayList.next();
      if (paramzzj.containsKey(zzagT)) {
        paramMap2.add(localObject2);
      } else if (paramMap1.containsKey(zzagT)) {
        ((ArrayList)localObject1).add(localObject2);
      } else {
        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
      }
    }
    paramArrayList = new zzd.1(this);
    zzagX = new zzl(paramContext, zzagW, paramLock, paramLooper, paramzzc, localArrayMap2, null, paramMap1, null, (ArrayList)localObject1, paramArrayList);
    paramMap1 = new zzd.2(this);
    zzagY = new zzl(paramContext, zzagW, paramLock, paramLooper, paramzzc, localArrayMap1, paramzzf, paramzzj, paramzza, paramMap2, paramMap1);
    paramContext = localArrayMap2.keySet().iterator();
    while (paramContext.hasNext())
    {
      paramzzj = (Api.zzc)paramContext.next();
      zzagZ.put(paramzzj, zzagX);
    }
    paramContext = localArrayMap1.keySet().iterator();
    while (paramContext.hasNext())
    {
      paramzzj = (Api.zzc)paramContext.next();
      zzagZ.put(paramzzj, zzagY);
    }
  }
  
  private void zzb(int paramInt, boolean paramBoolean)
  {
    zzagW.zzc(paramInt, paramBoolean);
    zzahe = null;
    zzahd = null;
  }
  
  private void zzb(ConnectionResult paramConnectionResult)
  {
    switch (zzahg)
    {
    default: 
      Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
    }
    for (;;)
    {
      zzahg = 0;
      return;
      zzagW.zzd(paramConnectionResult);
      zzpo();
    }
  }
  
  private static boolean zzc(ConnectionResult paramConnectionResult)
  {
    return (paramConnectionResult != null) && (paramConnectionResult.isSuccess());
  }
  
  private boolean zzc(zza.zza paramzza)
  {
    paramzza = paramzza.zzoR();
    zzx.zzb(zzagZ.containsKey(paramzza), "GoogleApiClient is not configured to use the API required for this call.");
    return ((zzl)zzagZ.get(paramzza)).equals(zzagY);
  }
  
  private void zzh(Bundle paramBundle)
  {
    if (zzahc == null) {
      zzahc = paramBundle;
    }
    while (paramBundle == null) {
      return;
    }
    zzahc.putAll(paramBundle);
  }
  
  private void zzpl()
  {
    zzahe = null;
    zzahd = null;
    zzagX.connect();
    zzagY.connect();
  }
  
  private void zzpm()
  {
    if (zzc(zzahd)) {
      if ((zzc(zzahe)) || (zzpp())) {
        zzpn();
      }
    }
    do
    {
      do
      {
        return;
      } while (zzahe == null);
      if (zzahg == 1)
      {
        zzpo();
        return;
      }
      zzb(zzahe);
      zzagX.disconnect();
      return;
      if ((zzahd != null) && (zzc(zzahe)))
      {
        zzagY.disconnect();
        zzb(zzahd);
        return;
      }
    } while ((zzahd == null) || (zzahe == null));
    ConnectionResult localConnectionResult = zzahd;
    if (zzagY.zzair < zzagX.zzair) {
      localConnectionResult = zzahe;
    }
    zzb(localConnectionResult);
  }
  
  private void zzpn()
  {
    switch (zzahg)
    {
    default: 
      Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
    }
    for (;;)
    {
      zzahg = 0;
      return;
      zzagW.zzi(zzahc);
      zzpo();
    }
  }
  
  private void zzpo()
  {
    Iterator localIterator = zzaha.iterator();
    while (localIterator.hasNext()) {
      ((zzu)localIterator.next()).zzna();
    }
    zzaha.clear();
  }
  
  private boolean zzpp()
  {
    return (zzahe != null) && (zzahe.getErrorCode() == 4);
  }
  
  private PendingIntent zzpq()
  {
    if (zzahb == null) {
      return null;
    }
    return PendingIntent.getActivity(mContext, zzagW.getSessionId(), zzahb.zznc(), 134217728);
  }
  
  public ConnectionResult blockingConnect()
  {
    throw new UnsupportedOperationException();
  }
  
  public ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    throw new UnsupportedOperationException();
  }
  
  public void connect()
  {
    zzahg = 2;
    zzahf = false;
    zzpl();
  }
  
  public boolean disconnect()
  {
    boolean bool2 = false;
    zzahe = null;
    zzahd = null;
    zzahg = 0;
    boolean bool3 = zzagX.disconnect();
    boolean bool4 = zzagY.disconnect();
    zzpo();
    boolean bool1 = bool2;
    if (bool3)
    {
      bool1 = bool2;
      if (bool4) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("authClient").println(":");
    zzagY.dump(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.append(paramString).append("anonClient").println(":");
    zzagX.dump(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public ConnectionResult getConnectionResult(Api paramApi)
  {
    if (((zzl)zzagZ.get(paramApi.zzoR())).equals(zzagY))
    {
      if (zzpp()) {
        return new ConnectionResult(4, zzpq());
      }
      return zzagY.getConnectionResult(paramApi);
    }
    return zzagX.getConnectionResult(paramApi);
  }
  
  /* Error */
  public boolean isConnected()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 67	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   6: invokeinterface 347 1 0
    //   11: aload_0
    //   12: getfield 160	com/google/android/gms/common/api/internal/zzd:zzagX	Lcom/google/android/gms/common/api/internal/zzl;
    //   15: invokevirtual 349	com/google/android/gms/common/api/internal/zzl:isConnected	()Z
    //   18: ifeq +44 -> 62
    //   21: iload_3
    //   22: istore_2
    //   23: aload_0
    //   24: invokevirtual 352	com/google/android/gms/common/api/internal/zzd:zzpk	()Z
    //   27: ifne +24 -> 51
    //   30: iload_3
    //   31: istore_2
    //   32: aload_0
    //   33: invokespecial 249	com/google/android/gms/common/api/internal/zzd:zzpp	()Z
    //   36: ifne +15 -> 51
    //   39: aload_0
    //   40: getfield 61	com/google/android/gms/common/api/internal/zzd:zzahg	I
    //   43: istore_1
    //   44: iload_1
    //   45: iconst_1
    //   46: if_icmpne +16 -> 62
    //   49: iload_3
    //   50: istore_2
    //   51: aload_0
    //   52: getfield 67	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   55: invokeinterface 355 1 0
    //   60: iload_2
    //   61: ireturn
    //   62: iconst_0
    //   63: istore_2
    //   64: goto -13 -> 51
    //   67: astore 4
    //   69: aload_0
    //   70: getfield 67	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   73: invokeinterface 355 1 0
    //   78: aload 4
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	zzd
    //   43	4	1	i	int
    //   22	42	2	bool1	boolean
    //   1	49	3	bool2	boolean
    //   67	12	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   11	21	67	finally
    //   23	30	67	finally
    //   32	44	67	finally
  }
  
  /* Error */
  public boolean isConnecting()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 67	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 347 1 0
    //   9: aload_0
    //   10: getfield 61	com/google/android/gms/common/api/internal/zzd:zzahg	I
    //   13: istore_1
    //   14: iload_1
    //   15: iconst_2
    //   16: if_icmpne +16 -> 32
    //   19: iconst_1
    //   20: istore_2
    //   21: aload_0
    //   22: getfield 67	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   25: invokeinterface 355 1 0
    //   30: iload_2
    //   31: ireturn
    //   32: iconst_0
    //   33: istore_2
    //   34: goto -13 -> 21
    //   37: astore_3
    //   38: aload_0
    //   39: getfield 67	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   42: invokeinterface 355 1 0
    //   47: aload_3
    //   48: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	zzd
    //   13	4	1	i	int
    //   20	14	2	bool	boolean
    //   37	11	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	14	37	finally
  }
  
  public zza.zza zza(zza.zza paramzza)
  {
    if (zzc(paramzza))
    {
      if (zzpp())
      {
        paramzza.zzw(new Status(4, null, zzpq()));
        return paramzza;
      }
      return zzagY.zza(paramzza);
    }
    return zzagX.zza(paramzza);
  }
  
  public boolean zza(zzu paramzzu)
  {
    zzXG.lock();
    try
    {
      if (((isConnecting()) || (isConnected())) && (!zzpk()))
      {
        zzaha.add(paramzzu);
        if (zzahg == 0) {
          zzahg = 1;
        }
        zzahe = null;
        zzagY.connect();
        return true;
      }
      return false;
    }
    finally
    {
      zzXG.unlock();
    }
  }
  
  public zza.zza zzb(zza.zza paramzza)
  {
    if (zzc(paramzza))
    {
      if (zzpp())
      {
        paramzza.zzw(new Status(4, null, zzpq()));
        return paramzza;
      }
      return zzagY.zzb(paramzza);
    }
    return zzagX.zzb(paramzza);
  }
  
  /* Error */
  public void zzoW()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 67	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 347 1 0
    //   9: aload_0
    //   10: invokevirtual 373	com/google/android/gms/common/api/internal/zzd:isConnecting	()Z
    //   13: istore_1
    //   14: aload_0
    //   15: getfield 165	com/google/android/gms/common/api/internal/zzd:zzagY	Lcom/google/android/gms/common/api/internal/zzl;
    //   18: invokevirtual 257	com/google/android/gms/common/api/internal/zzl:disconnect	()Z
    //   21: pop
    //   22: aload_0
    //   23: new 211	com/google/android/gms/common/ConnectionResult
    //   26: dup
    //   27: iconst_4
    //   28: invokespecial 381	com/google/android/gms/common/ConnectionResult:<init>	(I)V
    //   31: putfield 57	com/google/android/gms/common/api/internal/zzd:zzahe	Lcom/google/android/gms/common/ConnectionResult;
    //   34: iload_1
    //   35: ifeq +36 -> 71
    //   38: new 383	android/os/Handler
    //   41: dup
    //   42: aload_0
    //   43: getfield 69	com/google/android/gms/common/api/internal/zzd:zzagr	Landroid/os/Looper;
    //   46: invokespecial 386	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   49: new 388	com/google/android/gms/common/api/internal/zzd$3
    //   52: dup
    //   53: aload_0
    //   54: invokespecial 389	com/google/android/gms/common/api/internal/zzd$3:<init>	(Lcom/google/android/gms/common/api/internal/zzd;)V
    //   57: invokevirtual 393	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   60: pop
    //   61: aload_0
    //   62: getfield 67	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   65: invokeinterface 355 1 0
    //   70: return
    //   71: aload_0
    //   72: invokespecial 205	com/google/android/gms/common/api/internal/zzd:zzpo	()V
    //   75: goto -14 -> 61
    //   78: astore_2
    //   79: aload_0
    //   80: getfield 67	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   83: invokeinterface 355 1 0
    //   88: aload_2
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	zzd
    //   13	22	1	bool	boolean
    //   78	11	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	34	78	finally
    //   38	61	78	finally
    //   71	75	78	finally
  }
  
  public void zzpj()
  {
    zzagX.zzpj();
    zzagY.zzpj();
  }
  
  public boolean zzpk()
  {
    return zzagY.isConnected();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */