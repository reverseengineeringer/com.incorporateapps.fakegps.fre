package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.internal.zzne;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.SubscribeOptions;

class zzm
  extends zzj
{
  private final boolean zzbcv;
  private final ClientAppContext zzbcw;
  private final zzm.zzg zzbcx = new zzm.1(this);
  private final zzm.zzg zzbcy = new zzm.2(this);
  
  zzm(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, com.google.android.gms.common.internal.zzf paramzzf, MessagesOptions paramMessagesOptions)
  {
    super(paramContext, paramLooper, 62, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    paramLooper = paramzzf.zzqv();
    int i = zzaU(paramContext);
    if (paramMessagesOptions != null) {
      zzbcw = new ClientAppContext(paramLooper, zzbbF, zzbbH, i);
    }
    for (zzbcv = zzbbG;; zzbcv = false)
    {
      if ((i == 1) && (zzne.zzsg()))
      {
        paramContext = (Activity)paramContext;
        Log.v("NearbyMessagesClient", String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[] { paramContext.getPackageName() }));
        paramContext.getApplication().registerActivityLifecycleCallbacks(new zzm.zzb(paramContext, this, null));
      }
      return;
      zzbcw = new ClientAppContext(paramLooper, null, false, i);
    }
  }
  
  private static zzq zza(GoogleApiClient paramGoogleApiClient, Object paramObject, zzm.zzg paramzzg)
  {
    paramzzg = paramzzg.zzG(paramObject);
    if (paramzzg != null) {
      return paramzzg.zzEE();
    }
    return paramGoogleApiClient.zzr(paramObject);
  }
  
  private static int zzaU(Context paramContext)
  {
    if ((paramContext instanceof Activity)) {
      return 1;
    }
    if ((paramContext instanceof Application)) {
      return 2;
    }
    if ((paramContext instanceof Service)) {
      return 3;
    }
    return 0;
  }
  
  public void disconnect()
  {
    try
    {
      zzjq(2);
      super.disconnect();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.v("NearbyMessagesClient", String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", new Object[] { localRemoteException }));
      }
    }
  }
  
  zzq zza(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener)
  {
    return zza(paramGoogleApiClient, paramMessageListener, zzbcy);
  }
  
  zzq zza(GoogleApiClient paramGoogleApiClient, StatusCallback paramStatusCallback)
  {
    return zza(paramGoogleApiClient, paramStatusCallback, zzbcx);
  }
  
  void zza(zza.zzb paramzzb, PendingIntent paramPendingIntent)
  {
    paramzzb = new UnsubscribeRequest(null, zzp.zzn(paramzzb), paramPendingIntent, 0, zzbcw);
    ((zzf)zzqJ()).zza(paramzzb);
  }
  
  void zza(zza.zzb paramzzb, PendingIntent paramPendingIntent, SubscribeOptions paramSubscribeOptions)
  {
    paramzzb = new SubscribeRequest(null, paramSubscribeOptions.getStrategy(), zzp.zzn(paramzzb), paramSubscribeOptions.getFilter(), paramPendingIntent, 0, null, zzbcv, zzm.zzf.zzb(paramSubscribeOptions.getCallback()), zzbcw);
    ((zzf)zzqJ()).zza(paramzzb);
  }
  
  void zza(zza.zzb paramzzb, zzq paramzzq, MessageListener paramMessageListener)
  {
    if (zzbcy.zzG(paramMessageListener) == null) {
      return;
    }
    paramzzb = new UnsubscribeRequest((IBinder)zzbcy.zza(paramzzq, paramMessageListener), zzp.zzn(paramzzb), null, 0, zzbcw);
    ((zzf)zzqJ()).zza(paramzzb);
    zzbcy.zzH(paramMessageListener);
  }
  
  void zza(zza.zzb paramzzb, zzq paramzzq, MessageListener paramMessageListener, SubscribeOptions paramSubscribeOptions, byte[] paramArrayOfByte)
  {
    paramzzb = new SubscribeRequest((IBinder)zzbcy.zza(paramzzq, paramMessageListener), paramSubscribeOptions.getStrategy(), zzp.zzn(paramzzb), paramSubscribeOptions.getFilter(), null, 0, paramArrayOfByte, zzbcv, zzm.zzf.zzb(paramSubscribeOptions.getCallback()), zzbcw);
    ((zzf)zzqJ()).zza(paramzzb);
  }
  
  void zza(zza.zzb paramzzb, zzq paramzzq, StatusCallback paramStatusCallback)
  {
    paramzzb = new RegisterStatusCallbackRequest(zzp.zzn(paramzzb), (IBinder)zzbcx.zza(paramzzq, paramStatusCallback), zzbcw);
    zzbcX = true;
    ((zzf)zzqJ()).zza(paramzzb);
  }
  
  void zza(zza.zzb paramzzb, MessageWrapper paramMessageWrapper)
  {
    paramzzb = new UnpublishRequest(paramMessageWrapper, zzp.zzn(paramzzb), zzbcw);
    ((zzf)zzqJ()).zza(paramzzb);
  }
  
  void zza(zza.zzb paramzzb, MessageWrapper paramMessageWrapper, PublishOptions paramPublishOptions)
  {
    paramzzb = new PublishRequest(paramMessageWrapper, paramPublishOptions.getStrategy(), zzp.zzn(paramzzb), zzbcv, zzm.zzd.zzb(paramPublishOptions.getCallback()), zzbcw);
    ((zzf)zzqJ()).zza(paramzzb);
  }
  
  void zzb(zza.zzb paramzzb, zzq paramzzq, StatusCallback paramStatusCallback)
  {
    if (zzbcx.zzG(paramStatusCallback) == null) {
      return;
    }
    paramzzb = new RegisterStatusCallbackRequest(zzp.zzn(paramzzb), (IBinder)zzbcx.zza(paramzzq, paramStatusCallback), zzbcw);
    zzbcX = false;
    ((zzf)zzqJ()).zza(paramzzb);
    zzbcx.zzH(paramStatusCallback);
  }
  
  protected zzf zzdE(IBinder paramIBinder)
  {
    return zzf.zza.zzdA(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
  }
  
  void zzjq(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      Log.w("NearbyMessagesClient", String.format("Received unknown/unforeseen client lifecycle event %d, can't do anything with it.", new Object[] { Integer.valueOf(paramInt) }));
      return;
    }
    for (String str = "ACTIVITY_STOPPED"; isConnected(); str = "CLIENT_DISCONNECTED")
    {
      HandleClientLifecycleEventRequest localHandleClientLifecycleEventRequest = new HandleClientLifecycleEventRequest(zzbcw, paramInt);
      Log.d("NearbyMessagesClient", String.format("Emitting client lifecycle event %s", new Object[] { str }));
      ((zzf)zzqJ()).zza(localHandleClientLifecycleEventRequest);
      return;
    }
    Log.d("NearbyMessagesClient", String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", new Object[] { str }));
  }
  
  void zzm(zza.zzb paramzzb)
  {
    paramzzb = new GetPermissionStatusRequest(zzp.zzn(paramzzb), zzbcw);
    ((zzf)zzqJ()).zza(paramzzb);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */