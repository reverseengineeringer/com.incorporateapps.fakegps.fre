package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzk
  implements Handler.Callback
{
  private final Handler mHandler;
  private final zzk.zza zzalQ;
  private final ArrayList zzalR = new ArrayList();
  final ArrayList zzalS = new ArrayList();
  private final ArrayList zzalT = new ArrayList();
  private volatile boolean zzalU = false;
  private final AtomicInteger zzalV = new AtomicInteger(0);
  private boolean zzalW = false;
  private final Object zzpV = new Object();
  
  public zzk(Looper paramLooper, zzk.zza paramzza)
  {
    zzalQ = paramzza;
    mHandler = new Handler(paramLooper, this);
  }
  
  public final boolean handleMessage(Message arg1)
  {
    if (what == 1)
    {
      GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)obj;
      synchronized (zzpV)
      {
        if ((zzalU) && (zzalQ.isConnected()) && (zzalR.contains(localConnectionCallbacks))) {
          localConnectionCallbacks.onConnected(zzalQ.zzoi());
        }
        return true;
      }
    }
    Log.wtf("GmsClientEvents", "Don't know how to handle message: " + what, new Exception());
    return false;
  }
  
  public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    zzx.zzz(paramConnectionCallbacks);
    synchronized (zzpV)
    {
      boolean bool = zzalR.contains(paramConnectionCallbacks);
      return bool;
    }
  }
  
  public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzx.zzz(paramOnConnectionFailedListener);
    synchronized (zzpV)
    {
      boolean bool = zzalT.contains(paramOnConnectionFailedListener);
      return bool;
    }
  }
  
  public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    zzx.zzz(paramConnectionCallbacks);
    synchronized (zzpV)
    {
      if (zzalR.contains(paramConnectionCallbacks))
      {
        Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + paramConnectionCallbacks + " is already registered");
        if (zzalQ.isConnected()) {
          mHandler.sendMessage(mHandler.obtainMessage(1, paramConnectionCallbacks));
        }
        return;
      }
      zzalR.add(paramConnectionCallbacks);
    }
  }
  
  public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzx.zzz(paramOnConnectionFailedListener);
    synchronized (zzpV)
    {
      if (zzalT.contains(paramOnConnectionFailedListener))
      {
        Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + paramOnConnectionFailedListener + " is already registered");
        return;
      }
      zzalT.add(paramOnConnectionFailedListener);
    }
  }
  
  public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    zzx.zzz(paramConnectionCallbacks);
    synchronized (zzpV)
    {
      if (!zzalR.remove(paramConnectionCallbacks)) {
        Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + paramConnectionCallbacks + " not found");
      }
      while (!zzalW) {
        return;
      }
      zzalS.add(paramConnectionCallbacks);
    }
  }
  
  public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzx.zzz(paramOnConnectionFailedListener);
    synchronized (zzpV)
    {
      if (!zzalT.remove(paramOnConnectionFailedListener)) {
        Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + paramOnConnectionFailedListener + " not found");
      }
      return;
    }
  }
  
  public final void zzbT(int paramInt)
  {
    boolean bool = false;
    if (Looper.myLooper() == mHandler.getLooper()) {
      bool = true;
    }
    zzx.zza(bool, "onUnintentionalDisconnection must only be called on the Handler thread");
    mHandler.removeMessages(1);
    synchronized (zzpV)
    {
      zzalW = true;
      Object localObject2 = new ArrayList(zzalR);
      int i = zzalV.get();
      localObject2 = ((ArrayList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)((Iterator)localObject2).next();
        if ((zzalU) && (zzalV.get() == i)) {
          if (zzalR.contains(localConnectionCallbacks)) {
            localConnectionCallbacks.onConnectionSuspended(paramInt);
          }
        }
      }
    }
    zzalS.clear();
    zzalW = false;
  }
  
  public final void zzk(Bundle paramBundle)
  {
    boolean bool2 = true;
    boolean bool1;
    if (Looper.myLooper() == mHandler.getLooper())
    {
      bool1 = true;
      zzx.zza(bool1, "onConnectionSuccess must only be called on the Handler thread");
    }
    for (;;)
    {
      synchronized (zzpV)
      {
        if (zzalW) {
          break label190;
        }
        bool1 = true;
        zzx.zzab(bool1);
        mHandler.removeMessages(1);
        zzalW = true;
        if (zzalS.size() != 0) {
          break label195;
        }
        bool1 = bool2;
        zzx.zzab(bool1);
        Object localObject2 = new ArrayList(zzalR);
        int i = zzalV.get();
        localObject2 = ((ArrayList)localObject2).iterator();
        if (!((Iterator)localObject2).hasNext()) {
          break label200;
        }
        GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)((Iterator)localObject2).next();
        if ((!zzalU) || (!zzalQ.isConnected()) || (zzalV.get() != i)) {
          break label200;
        }
        if (zzalS.contains(localConnectionCallbacks)) {
          continue;
        }
        localConnectionCallbacks.onConnected(paramBundle);
      }
      bool1 = false;
      break;
      label190:
      bool1 = false;
      continue;
      label195:
      bool1 = false;
    }
    label200:
    zzalS.clear();
    zzalW = false;
  }
  
  public final void zzk(ConnectionResult paramConnectionResult)
  {
    if (Looper.myLooper() == mHandler.getLooper()) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "onConnectionFailure must only be called on the Handler thread");
      mHandler.removeMessages(1);
      synchronized (zzpV)
      {
        Object localObject2 = new ArrayList(zzalT);
        int i = zzalV.get();
        localObject2 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          GoogleApiClient.OnConnectionFailedListener localOnConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener)((Iterator)localObject2).next();
          if ((!zzalU) || (zzalV.get() != i)) {
            return;
          }
          if (zzalT.contains(localOnConnectionFailedListener)) {
            localOnConnectionFailedListener.onConnectionFailed(paramConnectionResult);
          }
        }
      }
      return;
    }
  }
  
  public final void zzqQ()
  {
    zzalU = false;
    zzalV.incrementAndGet();
  }
  
  public final void zzqR()
  {
    zzalU = true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */