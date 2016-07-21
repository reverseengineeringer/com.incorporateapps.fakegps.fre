package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import java.util.List;

public class zzrf
  extends zzj
{
  private final Context mContext;
  
  public zzrf(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 45, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    mContext = paramContext;
  }
  
  private String zznn()
  {
    try
    {
      Object localObject = mContext.getPackageManager();
      if (localObject == null) {
        return null;
      }
      localObject = ((PackageManager)localObject).getApplicationInfo(mContext.getPackageName(), 128);
      if (localObject == null) {
        return null;
      }
      localObject = metaData;
      if (localObject == null) {
        return null;
      }
      localObject = (String)((Bundle)localObject).get("com.google.android.safetynet.API_KEY");
      return (String)localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  public void zza(zzrc paramzzrc, List paramList, int paramInt, String paramString)
  {
    int[] arrayOfInt = new int[paramList.size()];
    int i = 0;
    while (i < paramList.size())
    {
      arrayOfInt[i] = ((Integer)paramList.get(i)).intValue();
      i += 1;
    }
    ((zzrd)zzqJ()).zza(paramzzrc, zznn(), arrayOfInt, paramInt, paramString);
  }
  
  public void zza(zzrc paramzzrc, byte[] paramArrayOfByte)
  {
    ((zzrd)zzqJ()).zza(paramzzrc, paramArrayOfByte);
  }
  
  protected zzrd zzdW(IBinder paramIBinder)
  {
    return zzrd.zza.zzdV(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.safetynet.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.safetynet.internal.ISafetyNetService";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */