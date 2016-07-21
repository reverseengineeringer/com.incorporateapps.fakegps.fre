package com.google.android.gms.wearable;

import android.os.Binder;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.android.gms.wearable.internal.zzaw.zza;
import java.util.List;

final class WearableListenerService$zza
  extends zzaw.zza
{
  private volatile int zzakz = -1;
  
  private WearableListenerService$zza(WearableListenerService paramWearableListenerService) {}
  
  private void zzIx()
  {
    int i = Binder.getCallingUid();
    if (i == zzakz) {
      return;
    }
    if (GooglePlayServicesUtil.zzf(zzbrq, i))
    {
      zzakz = i;
      return;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }
  
  private boolean zza(Runnable paramRunnable, String paramString, Object paramObject)
  {
    if (!(zzbrq instanceof zzj)) {
      return false;
    }
    return zzb(paramRunnable, paramString, paramObject);
  }
  
  private boolean zzb(Runnable paramRunnable, String arg2, Object paramObject)
  {
    if (Log.isLoggable("WearableLS", 3)) {
      Log.d("WearableLS", String.format("%s: %s %s", new Object[] { ???, WearableListenerService.zza(zzbrq), paramObject }));
    }
    zzIx();
    synchronized (WearableListenerService.zzb(zzbrq))
    {
      if (WearableListenerService.zzc(zzbrq)) {
        return false;
      }
      WearableListenerService.zzd(zzbrq).post(paramRunnable);
      return true;
    }
  }
  
  public final void onConnectedNodes(List paramList)
  {
    zzb(new WearableListenerService.zza.5(this, paramList), "onConnectedNodes", paramList);
  }
  
  public final void zza(AmsEntityUpdateParcelable paramAmsEntityUpdateParcelable)
  {
    zza(new WearableListenerService.zza.8(this, paramAmsEntityUpdateParcelable), "onEntityUpdate", paramAmsEntityUpdateParcelable);
  }
  
  public final void zza(AncsNotificationParcelable paramAncsNotificationParcelable)
  {
    zza(new WearableListenerService.zza.7(this, paramAncsNotificationParcelable), "onNotificationReceived", paramAncsNotificationParcelable);
  }
  
  public final void zza(CapabilityInfoParcelable paramCapabilityInfoParcelable)
  {
    zzb(new WearableListenerService.zza.6(this, paramCapabilityInfoParcelable), "onConnectedCapabilityChanged", paramCapabilityInfoParcelable);
  }
  
  public final void zza(ChannelEventParcelable paramChannelEventParcelable)
  {
    zzb(new WearableListenerService.zza.9(this, paramChannelEventParcelable), "onChannelEvent", paramChannelEventParcelable);
  }
  
  public final void zza(MessageEventParcelable paramMessageEventParcelable)
  {
    zzb(new WearableListenerService.zza.2(this, paramMessageEventParcelable), "onMessageReceived", paramMessageEventParcelable);
  }
  
  public final void zza(NodeParcelable paramNodeParcelable)
  {
    zzb(new WearableListenerService.zza.3(this, paramNodeParcelable), "onPeerConnected", paramNodeParcelable);
  }
  
  public final void zzag(DataHolder paramDataHolder)
  {
    WearableListenerService.zza.1 local1 = new WearableListenerService.zza.1(this, paramDataHolder);
    try
    {
      boolean bool = zzb(local1, "onDataItemChanged", paramDataHolder);
      if (!bool) {}
      return;
    }
    finally
    {
      paramDataHolder.close();
    }
  }
  
  public final void zzb(NodeParcelable paramNodeParcelable)
  {
    zzb(new WearableListenerService.zza.4(this, paramNodeParcelable), "onPeerDisconnected", paramNodeParcelable);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.WearableListenerService.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */