package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.api.internal.zzu;
import com.google.android.gms.common.api.internal.zzx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public abstract class GoogleApiClient
{
  public static final int SIGN_IN_MODE_OPTIONAL = 2;
  public static final int SIGN_IN_MODE_REQUIRED = 1;
  private static final Set zzagg = Collections.newSetFromMap(new WeakHashMap());
  
  public static void dumpAll(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    synchronized (zzagg)
    {
      String str = paramString + "  ";
      Iterator localIterator = zzagg.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        GoogleApiClient localGoogleApiClient = (GoogleApiClient)localIterator.next();
        paramPrintWriter.append(paramString).append("GoogleApiClient#").println(i);
        localGoogleApiClient.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i += 1;
      }
      return;
    }
  }
  
  public static Set zzoV()
  {
    return zzagg;
  }
  
  public abstract ConnectionResult blockingConnect();
  
  public abstract ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit);
  
  public abstract PendingResult clearDefaultAccountAndReconnect();
  
  public abstract void connect();
  
  public void connect(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void disconnect();
  
  public abstract void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract ConnectionResult getConnectionResult(Api paramApi);
  
  public Context getContext()
  {
    throw new UnsupportedOperationException();
  }
  
  public Looper getLooper()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract boolean hasConnectedApi(Api paramApi);
  
  public abstract boolean isConnected();
  
  public abstract boolean isConnecting();
  
  public abstract boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks);
  
  public abstract boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);
  
  public abstract void reconnect();
  
  public abstract void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks);
  
  public abstract void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);
  
  public abstract void stopAutoManage(FragmentActivity paramFragmentActivity);
  
  public abstract void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks);
  
  public abstract void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);
  
  public Api.zzb zza(Api.zzc paramzzc)
  {
    throw new UnsupportedOperationException();
  }
  
  public zza.zza zza(zza.zza paramzza)
  {
    throw new UnsupportedOperationException();
  }
  
  public void zza(zzx paramzzx)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean zza(Api paramApi)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean zza(zzu paramzzu)
  {
    throw new UnsupportedOperationException();
  }
  
  public zza.zza zzb(zza.zza paramzza)
  {
    throw new UnsupportedOperationException();
  }
  
  public void zzb(zzx paramzzx)
  {
    throw new UnsupportedOperationException();
  }
  
  public void zzoW()
  {
    throw new UnsupportedOperationException();
  }
  
  public zzq zzr(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.GoogleApiClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */