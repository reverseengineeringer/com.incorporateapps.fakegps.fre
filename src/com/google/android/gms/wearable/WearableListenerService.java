package com.google.android.gms.wearable;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.util.List;

public abstract class WearableListenerService
  extends Service
  implements CapabilityApi.CapabilityListener, ChannelApi.ChannelListener, DataApi.DataListener, MessageApi.MessageListener, NodeApi.NodeListener, NodeApi.zza
{
  public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
  private boolean zzQl;
  private String zzTJ;
  private IBinder zzakD;
  private Handler zzbro;
  private final Object zzbrp = new Object();
  
  public final IBinder onBind(Intent paramIntent)
  {
    if ("com.google.android.gms.wearable.BIND_LISTENER".equals(paramIntent.getAction())) {
      return zzakD;
    }
    return null;
  }
  
  public void onCapabilityChanged(CapabilityInfo paramCapabilityInfo) {}
  
  public void onChannelClosed(Channel paramChannel, int paramInt1, int paramInt2) {}
  
  public void onChannelOpened(Channel paramChannel) {}
  
  public void onConnectedNodes(List paramList) {}
  
  public void onCreate()
  {
    super.onCreate();
    if (Log.isLoggable("WearableLS", 3)) {
      Log.d("WearableLS", "onCreate: " + new ComponentName(getPackageName(), getClass().getName()).flattenToShortString());
    }
    zzTJ = getPackageName();
    HandlerThread localHandlerThread = new HandlerThread("WearableListenerService");
    localHandlerThread.start();
    zzbro = new Handler(localHandlerThread.getLooper());
    zzakD = new WearableListenerService.zza(this, null);
  }
  
  public void onDataChanged(DataEventBuffer paramDataEventBuffer) {}
  
  public void onDestroy()
  {
    if (Log.isLoggable("WearableLS", 3)) {
      Log.d("WearableLS", "onDestroy: " + new ComponentName(getPackageName(), getClass().getName()).flattenToShortString());
    }
    synchronized (zzbrp)
    {
      zzQl = true;
      if (zzbro == null) {
        throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
      }
    }
    zzbro.getLooper().quit();
    super.onDestroy();
  }
  
  public void onInputClosed(Channel paramChannel, int paramInt1, int paramInt2) {}
  
  public void onMessageReceived(MessageEvent paramMessageEvent) {}
  
  public void onOutputClosed(Channel paramChannel, int paramInt1, int paramInt2) {}
  
  public void onPeerConnected(Node paramNode) {}
  
  public void onPeerDisconnected(Node paramNode) {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.WearableListenerService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */