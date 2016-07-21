package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.io.IOException;

public final class Cast$CastApi$zza
  implements Cast.CastApi
{
  public final int getActiveInputState(GoogleApiClient paramGoogleApiClient)
  {
    return ((zze)paramGoogleApiClient.zza(zzk.zzUI)).zzol();
  }
  
  public final ApplicationMetadata getApplicationMetadata(GoogleApiClient paramGoogleApiClient)
  {
    return ((zze)paramGoogleApiClient.zza(zzk.zzUI)).getApplicationMetadata();
  }
  
  public final String getApplicationStatus(GoogleApiClient paramGoogleApiClient)
  {
    return ((zze)paramGoogleApiClient.zza(zzk.zzUI)).getApplicationStatus();
  }
  
  public final int getStandbyState(GoogleApiClient paramGoogleApiClient)
  {
    return ((zze)paramGoogleApiClient.zza(zzk.zzUI)).zzom();
  }
  
  public final double getVolume(GoogleApiClient paramGoogleApiClient)
  {
    return ((zze)paramGoogleApiClient.zza(zzk.zzUI)).zzok();
  }
  
  public final boolean isMute(GoogleApiClient paramGoogleApiClient)
  {
    return ((zze)paramGoogleApiClient.zza(zzk.zzUI)).isMute();
  }
  
  public final PendingResult joinApplication(GoogleApiClient paramGoogleApiClient)
  {
    return zza(paramGoogleApiClient, null, null, null);
  }
  
  public final PendingResult joinApplication(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return zza(paramGoogleApiClient, paramString, null, null);
  }
  
  public final PendingResult joinApplication(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    return zza(paramGoogleApiClient, paramString1, paramString2, null);
  }
  
  public final PendingResult launchApplication(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zzb(new Cast.CastApi.zza.2(this, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult launchApplication(GoogleApiClient paramGoogleApiClient, String paramString, LaunchOptions paramLaunchOptions)
  {
    return paramGoogleApiClient.zzb(new Cast.CastApi.zza.3(this, paramGoogleApiClient, paramString, paramLaunchOptions));
  }
  
  public final PendingResult launchApplication(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean)
  {
    return launchApplication(paramGoogleApiClient, paramString, new LaunchOptions.Builder().setRelaunchIfRunning(paramBoolean).build());
  }
  
  public final PendingResult leaveApplication(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zzb(new Cast.CastApi.zza.5(this, paramGoogleApiClient));
  }
  
  public final void removeMessageReceivedCallbacks(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    try
    {
      ((zze)paramGoogleApiClient.zza(zzk.zzUI)).zzcg(paramString);
      return;
    }
    catch (RemoteException paramGoogleApiClient)
    {
      throw new IOException("service error");
    }
  }
  
  public final void requestStatus(GoogleApiClient paramGoogleApiClient)
  {
    try
    {
      ((zze)paramGoogleApiClient.zza(zzk.zzUI)).zzoj();
      return;
    }
    catch (RemoteException paramGoogleApiClient)
    {
      throw new IOException("service error");
    }
  }
  
  public final PendingResult sendMessage(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    return paramGoogleApiClient.zzb(new Cast.CastApi.zza.1(this, paramGoogleApiClient, paramString1, paramString2));
  }
  
  public final void setMessageReceivedCallbacks(GoogleApiClient paramGoogleApiClient, String paramString, Cast.MessageReceivedCallback paramMessageReceivedCallback)
  {
    try
    {
      ((zze)paramGoogleApiClient.zza(zzk.zzUI)).zza(paramString, paramMessageReceivedCallback);
      return;
    }
    catch (RemoteException paramGoogleApiClient)
    {
      throw new IOException("service error");
    }
  }
  
  public final void setMute(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    try
    {
      ((zze)paramGoogleApiClient.zza(zzk.zzUI)).zzX(paramBoolean);
      return;
    }
    catch (RemoteException paramGoogleApiClient)
    {
      throw new IOException("service error");
    }
  }
  
  public final void setVolume(GoogleApiClient paramGoogleApiClient, double paramDouble)
  {
    try
    {
      ((zze)paramGoogleApiClient.zza(zzk.zzUI)).zzf(paramDouble);
      return;
    }
    catch (RemoteException paramGoogleApiClient)
    {
      throw new IOException("service error");
    }
  }
  
  public final PendingResult stopApplication(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zzb(new Cast.CastApi.zza.6(this, paramGoogleApiClient));
  }
  
  public final PendingResult stopApplication(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zzb(new Cast.CastApi.zza.7(this, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult zza(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, JoinOptions paramJoinOptions)
  {
    return paramGoogleApiClient.zzb(new Cast.CastApi.zza.4(this, paramGoogleApiClient, paramString1, paramString2, paramJoinOptions));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.Cast.CastApi.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */