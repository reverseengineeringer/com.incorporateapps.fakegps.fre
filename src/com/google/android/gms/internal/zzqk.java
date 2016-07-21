package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.nearby.connection.AppMetadata;

public final class zzqk
  extends zzj
{
  private final long zzaEg = hashCode();
  
  public zzqk(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 54, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  public final void disconnect()
  {
    if (isConnected()) {}
    try
    {
      ((zzqn)zzqJ()).zzF(zzaEg);
      super.disconnect();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", localRemoteException);
      }
    }
  }
  
  public final String zzEj()
  {
    try
    {
      String str = ((zzqn)zzqJ()).zzaj(zzaEg);
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }
  
  public final String zzEk()
  {
    try
    {
      String str = ((zzqn)zzqJ()).zzEk();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }
  
  public final void zzEl()
  {
    try
    {
      ((zzqn)zzqJ()).zzag(zzaEg);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("NearbyConnectionsClient", "Couldn't stop advertising", localRemoteException);
    }
  }
  
  public final void zzEm()
  {
    try
    {
      ((zzqn)zzqJ()).zzai(zzaEg);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("NearbyConnectionsClient", "Couldn't stop all endpoints", localRemoteException);
    }
  }
  
  public final void zza(zza.zzb paramzzb, String paramString, long paramLong, zzq paramzzq)
  {
    ((zzqn)zzqJ()).zza(new zzqk.zzg(paramzzb, paramzzq), paramString, paramLong, zzaEg);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString, AppMetadata paramAppMetadata, long paramLong, zzq paramzzq)
  {
    ((zzqn)zzqJ()).zza(new zzqk.zze(paramzzb, paramzzq), paramString, paramAppMetadata, paramLong, zzaEg);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString1, String paramString2, byte[] paramArrayOfByte, zzq paramzzq1, zzq paramzzq2)
  {
    ((zzqn)zzqJ()).zza(new zzqk.zzd(paramzzb, paramzzq1, paramzzq2), paramString1, paramString2, paramArrayOfByte, zzaEg);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString, byte[] paramArrayOfByte, zzq paramzzq)
  {
    ((zzqn)zzqJ()).zza(new zzqk.zza(paramzzb, paramzzq), paramString, paramArrayOfByte, zzaEg);
  }
  
  public final void zza(String[] paramArrayOfString, byte[] paramArrayOfByte)
  {
    try
    {
      ((zzqn)zzqJ()).zza(paramArrayOfString, paramArrayOfByte, zzaEg);
      return;
    }
    catch (RemoteException paramArrayOfString)
    {
      Log.w("NearbyConnectionsClient", "Couldn't send reliable message", paramArrayOfString);
    }
  }
  
  public final void zzb(String[] paramArrayOfString, byte[] paramArrayOfByte)
  {
    try
    {
      ((zzqn)zzqJ()).zzb(paramArrayOfString, paramArrayOfByte, zzaEg);
      return;
    }
    catch (RemoteException paramArrayOfString)
    {
      Log.w("NearbyConnectionsClient", "Couldn't send unreliable message", paramArrayOfString);
    }
  }
  
  protected final zzqn zzdv(IBinder paramIBinder)
  {
    return zzqn.zza.zzdx(paramIBinder);
  }
  
  public final void zzfA(String paramString)
  {
    try
    {
      ((zzqn)zzqJ()).zzi(paramString, zzaEg);
      return;
    }
    catch (RemoteException paramString)
    {
      Log.w("NearbyConnectionsClient", "Couldn't disconnect from endpoint", paramString);
    }
  }
  
  public final void zzfz(String paramString)
  {
    try
    {
      ((zzqn)zzqJ()).zzh(paramString, zzaEg);
      return;
    }
    catch (RemoteException paramString)
    {
      Log.w("NearbyConnectionsClient", "Couldn't stop discovery", paramString);
    }
  }
  
  protected final String zzgu()
  {
    return "com.google.android.gms.nearby.connection.service.START";
  }
  
  protected final String zzgv()
  {
    return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
  }
  
  public final void zzp(zza.zzb paramzzb, String paramString)
  {
    ((zzqn)zzqJ()).zza(new zzqk.zzc(paramzzb), paramString, zzaEg);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */