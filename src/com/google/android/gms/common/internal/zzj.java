package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.zza;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class zzj
  implements Api.zzb, zzk.zza
{
  public static final String[] zzalJ = { "service_esmobile", "service_googleme" };
  private final Context mContext;
  final Handler mHandler;
  private final Account zzTI;
  private final Set zzXf;
  private final Looper zzagr;
  private final zzc zzags;
  private final zzf zzahz;
  private GoogleApiClient.zza zzalA = new zzj.zzf(this);
  private IInterface zzalB;
  private final ArrayList zzalC = new ArrayList();
  private zzj.zze zzalD;
  private int zzalE = 1;
  private final GoogleApiClient.ConnectionCallbacks zzalF;
  private final GoogleApiClient.OnConnectionFailedListener zzalG;
  private final int zzalH;
  protected AtomicInteger zzalI = new AtomicInteger(0);
  private int zzals;
  private long zzalt;
  private long zzalu;
  private int zzalv;
  private long zzalw;
  private final zzl zzalx;
  private final Object zzaly = new Object();
  private zzs zzalz;
  private final Object zzpV = new Object();
  
  protected zzj(Context paramContext, Looper paramLooper, int paramInt, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this(paramContext, paramLooper, zzl.zzau(paramContext), zzc.zzoK(), paramInt, paramzzf, (GoogleApiClient.ConnectionCallbacks)zzx.zzz(paramConnectionCallbacks), (GoogleApiClient.OnConnectionFailedListener)zzx.zzz(paramOnConnectionFailedListener));
  }
  
  protected zzj(Context paramContext, Looper paramLooper, zzl paramzzl, zzc paramzzc, int paramInt, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    mContext = ((Context)zzx.zzb(paramContext, "Context must not be null"));
    zzagr = ((Looper)zzx.zzb(paramLooper, "Looper must not be null"));
    zzalx = ((zzl)zzx.zzb(paramzzl, "Supervisor must not be null"));
    zzags = ((zzc)zzx.zzb(paramzzc, "API availability must not be null"));
    mHandler = new zzj.zzb(this, paramLooper);
    zzalH = paramInt;
    zzahz = ((zzf)zzx.zzz(paramzzf));
    zzTI = paramzzf.getAccount();
    zzXf = zza(paramzzf.zzqt());
    zzalF = paramConnectionCallbacks;
    zzalG = paramOnConnectionFailedListener;
  }
  
  private Set zza(Set paramSet)
  {
    Set localSet = zzb(paramSet);
    if (localSet == null) {
      return localSet;
    }
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext()) {
      if (!paramSet.contains((Scope)localIterator.next())) {
        throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
      }
    }
    return localSet;
  }
  
  private boolean zza(int paramInt1, int paramInt2, IInterface paramIInterface)
  {
    synchronized (zzpV)
    {
      if (zzalE != paramInt1) {
        return false;
      }
      zzb(paramInt2, paramIInterface);
      return true;
    }
  }
  
  private void zzb(int paramInt, IInterface paramIInterface)
  {
    boolean bool = true;
    int i;
    int j;
    if (paramInt == 3)
    {
      i = 1;
      if (paramIInterface == null) {
        break label120;
      }
      j = 1;
      label17:
      if (i != j) {
        break label126;
      }
    }
    for (;;)
    {
      zzx.zzac(bool);
      for (;;)
      {
        synchronized (zzpV)
        {
          zzalE = paramInt;
          zzalB = paramIInterface;
          zzc(paramInt, paramIInterface);
          switch (paramInt)
          {
          case 2: 
            return;
            zzqE();
          }
        }
        zza(paramIInterface);
        continue;
        zzqF();
      }
      i = 0;
      break;
      label120:
      j = 0;
      break label17;
      label126:
      bool = false;
    }
  }
  
  private void zzqE()
  {
    if (zzalD != null)
    {
      Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + zzgu());
      zzalx.zzb(zzgu(), zzalD, zzqD());
      zzalI.incrementAndGet();
    }
    zzalD = new zzj.zze(this, zzalI.get());
    if (!zzalx.zza(zzgu(), zzalD, zzqD()))
    {
      Log.e("GmsClient", "unable to connect to service: " + zzgu());
      zzm(8, zzalI.get());
    }
  }
  
  private void zzqF()
  {
    if (zzalD != null)
    {
      zzalx.zzb(zzgu(), zzalD, zzqD());
      zzalD = null;
    }
  }
  
  public void disconnect()
  {
    zzalI.incrementAndGet();
    synchronized (zzalC)
    {
      int j = zzalC.size();
      int i = 0;
      while (i < j)
      {
        ((zzj.zzc)zzalC.get(i)).zzqO();
        i += 1;
      }
      zzalC.clear();
    }
    synchronized (zzaly)
    {
      zzalz = null;
      zzb(1, null);
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public void dump(String paramString, FileDescriptor arg2, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    for (;;)
    {
      synchronized (zzpV)
      {
        int i = zzalE;
        paramArrayOfString = zzalB;
        paramPrintWriter.append(paramString).append("mConnectState=");
        switch (i)
        {
        default: 
          paramPrintWriter.print("UNKNOWN");
          paramPrintWriter.append(" mService=");
          if (paramArrayOfString != null) {
            break label407;
          }
          paramPrintWriter.println("null");
          ??? = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
          if (zzalu > 0L) {
            paramPrintWriter.append(paramString).append("lastConnectedTime=").println(zzalu + " " + ???.format(new Date(zzalu)));
          }
          if (zzalt > 0L) {
            paramPrintWriter.append(paramString).append("lastSuspendedCause=");
          }
          switch (zzals)
          {
          default: 
            paramPrintWriter.append(String.valueOf(zzals));
            paramPrintWriter.append(" lastSuspendedTime=").println(zzalt + " " + ???.format(new Date(zzalt)));
            if (zzalw > 0L)
            {
              paramPrintWriter.append(paramString).append("lastFailedStatus=").append(CommonStatusCodes.getStatusCodeString(zzalv));
              paramPrintWriter.append(" lastFailedTime=").println(zzalw + " " + ???.format(new Date(zzalw)));
            }
            return;
          }
          break;
        }
      }
      paramPrintWriter.print("CONNECTING");
      continue;
      paramPrintWriter.print("CONNECTED");
      continue;
      paramPrintWriter.print("DISCONNECTING");
      continue;
      paramPrintWriter.print("DISCONNECTED");
      continue;
      label407:
      paramPrintWriter.append(zzgv()).append("@").println(Integer.toHexString(System.identityHashCode(paramArrayOfString.asBinder())));
      continue;
      paramPrintWriter.append("CAUSE_SERVICE_DISCONNECTED");
      continue;
      paramPrintWriter.append("CAUSE_NETWORK_LOST");
    }
  }
  
  public final Context getContext()
  {
    return mContext;
  }
  
  public final Looper getLooper()
  {
    return zzagr;
  }
  
  public boolean isConnected()
  {
    synchronized (zzpV)
    {
      if (zzalE == 3)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
  
  public boolean isConnecting()
  {
    synchronized (zzpV)
    {
      if (zzalE == 2)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
  
  protected void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zzalv = paramConnectionResult.getErrorCode();
    zzalw = System.currentTimeMillis();
  }
  
  protected void onConnectionSuspended(int paramInt)
  {
    zzals = paramInt;
    zzalt = System.currentTimeMillis();
  }
  
  protected abstract IInterface zzW(IBinder paramIBinder);
  
  protected void zza(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    mHandler.sendMessage(mHandler.obtainMessage(1, paramInt2, -1, new zzj.zzg(this, paramInt1, paramIBinder, paramBundle)));
  }
  
  protected void zza(IInterface paramIInterface)
  {
    zzalu = System.currentTimeMillis();
  }
  
  public void zza(GoogleApiClient.zza paramzza)
  {
    zzalA = ((GoogleApiClient.zza)zzx.zzb(paramzza, "Connection progress callbacks cannot be null."));
    zzb(2, null);
  }
  
  public void zza(zzp arg1, Set paramSet)
  {
    try
    {
      Object localObject = zzml();
      localObject = new GetServiceRequest(zzalH).zzcG(mContext.getPackageName()).zzj((Bundle)localObject);
      if (paramSet != null) {
        ((GetServiceRequest)localObject).zzd(paramSet);
      }
      if (zzmE()) {
        ((GetServiceRequest)localObject).zzc(zzqq()).zzb(???);
      }
      return;
    }
    catch (DeadObjectException ???)
    {
      synchronized (zzaly)
      {
        while (zzalz != null)
        {
          zzalz.zza(new zzj.zzd(this, zzalI.get()), (GetServiceRequest)localObject);
          return;
          if (zzqK())
          {
            ((GetServiceRequest)localObject).zzc(zzTI);
            continue;
            ??? = ???;
            Log.w("GmsClient", "service died");
            zzbS(1);
            return;
          }
        }
        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
      }
    }
    catch (RemoteException ???)
    {
      Log.w("GmsClient", "Remote exception occurred", ???);
    }
  }
  
  protected Set zzb(Set paramSet)
  {
    return paramSet;
  }
  
  public void zzbS(int paramInt)
  {
    mHandler.sendMessage(mHandler.obtainMessage(4, zzalI.get(), paramInt));
  }
  
  void zzc(int paramInt, IInterface paramIInterface) {}
  
  protected abstract String zzgu();
  
  protected abstract String zzgv();
  
  protected void zzm(int paramInt1, int paramInt2)
  {
    mHandler.sendMessage(mHandler.obtainMessage(5, paramInt2, -1, new zzj.zzh(this, paramInt1)));
  }
  
  public boolean zzmE()
  {
    return false;
  }
  
  protected Bundle zzml()
  {
    return new Bundle();
  }
  
  public boolean zznb()
  {
    return false;
  }
  
  public Intent zznc()
  {
    throw new UnsupportedOperationException("Not a sign in API");
  }
  
  public IBinder zzoT()
  {
    synchronized (zzaly)
    {
      if (zzalz == null) {
        return null;
      }
      IBinder localIBinder = zzalz.asBinder();
      return localIBinder;
    }
  }
  
  public Bundle zzoi()
  {
    return null;
  }
  
  protected final String zzqD()
  {
    return zzahz.zzqw();
  }
  
  public void zzqG()
  {
    int i = zzags.isGooglePlayServicesAvailable(mContext);
    if (i != 0)
    {
      zzb(1, null);
      zzalA = new zzj.zzf(this);
      mHandler.sendMessage(mHandler.obtainMessage(3, zzalI.get(), i));
      return;
    }
    zza(new zzj.zzf(this));
  }
  
  protected final zzf zzqH()
  {
    return zzahz;
  }
  
  protected final void zzqI()
  {
    if (!isConnected()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
  }
  
  public final IInterface zzqJ()
  {
    synchronized (zzpV)
    {
      if (zzalE == 4) {
        throw new DeadObjectException();
      }
    }
    zzqI();
    if (zzalB != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Client is connected but service is null");
      IInterface localIInterface = zzalB;
      return localIInterface;
    }
  }
  
  public boolean zzqK()
  {
    return false;
  }
  
  public final Account zzqq()
  {
    if (zzTI != null) {
      return zzTI;
    }
    return new Account("<<default account>>", "com.google");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */