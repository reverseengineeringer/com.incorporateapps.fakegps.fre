package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public final class zzj$zzg
  extends zzj.zza
{
  public final IBinder zzalP;
  
  public zzj$zzg(zzj paramzzj, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(paramzzj, paramInt, paramBundle);
    zzalP = paramIBinder;
  }
  
  protected final void zzj(ConnectionResult paramConnectionResult)
  {
    if (zzj.zzf(zzalL) != null) {
      zzj.zzf(zzalL).onConnectionFailed(paramConnectionResult);
    }
    zzalL.onConnectionFailed(paramConnectionResult);
  }
  
  protected final boolean zzqL()
  {
    do
    {
      try
      {
        String str = zzalP.getInterfaceDescriptor();
        if (!zzalL.zzgv().equals(str))
        {
          Log.e("GmsClient", "service descriptor mismatch: " + zzalL.zzgv() + " vs. " + str);
          return false;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Log.w("GmsClient", "service probably died");
        return false;
      }
      localObject = zzalL.zzW(zzalP);
    } while ((localObject == null) || (!zzj.zza(zzalL, 2, 3, (IInterface)localObject)));
    Object localObject = zzalL.zzoi();
    if (zzj.zzc(zzalL) != null) {
      zzj.zzc(zzalL).onConnected((Bundle)localObject);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzj.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */