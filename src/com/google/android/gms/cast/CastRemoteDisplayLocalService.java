package com.google.android.gms.cast;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v7.media.MediaRouteSelector.Builder;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.text.TextUtils;
import android.view.Display;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.id;
import com.google.android.gms.R.string;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class CastRemoteDisplayLocalService
  extends Service
{
  private static final zzl zzaaf = new zzl("CastRemoteDisplayLocalService");
  private static final int zzaag = R.id.cast_notification_id;
  private static final Object zzaah = new Object();
  private static AtomicBoolean zzaai = new AtomicBoolean(false);
  private static CastRemoteDisplayLocalService zzaax;
  private Handler mHandler;
  private Notification mNotification;
  private String zzZC;
  private GoogleApiClient zzaaj;
  private CastRemoteDisplay.CastRemoteDisplaySessionCallbacks zzaak;
  private CastRemoteDisplayLocalService.Callbacks zzaal;
  private CastRemoteDisplayLocalService.zzb zzaam;
  private CastRemoteDisplayLocalService.NotificationSettings zzaan;
  private boolean zzaao;
  private PendingIntent zzaap;
  private CastDevice zzaaq;
  private Display zzaar;
  private Context zzaas;
  private ServiceConnection zzaat;
  private MediaRouter zzaau;
  private boolean zzaav = false;
  private final MediaRouter.Callback zzaaw = new CastRemoteDisplayLocalService.1(this);
  private final IBinder zzaay = new CastRemoteDisplayLocalService.zza(this, null);
  
  public static CastRemoteDisplayLocalService getInstance()
  {
    synchronized (zzaah)
    {
      CastRemoteDisplayLocalService localCastRemoteDisplayLocalService = zzaax;
      return localCastRemoteDisplayLocalService;
    }
  }
  
  protected static void setDebugEnabled()
  {
    zzaaf.zzY(true);
  }
  
  public static void startService(Context paramContext, Class paramClass, String paramString, CastDevice paramCastDevice, CastRemoteDisplayLocalService.NotificationSettings paramNotificationSettings, CastRemoteDisplayLocalService.Callbacks paramCallbacks)
  {
    zzaaf.zzb("Starting Service", new Object[0]);
    synchronized (zzaah)
    {
      if (zzaax != null)
      {
        zzaaf.zzf("An existing service had not been stopped before starting one", new Object[0]);
        zzS(true);
      }
      zzb(paramContext, paramClass);
      zzx.zzb(paramContext, "activityContext is required.");
      zzx.zzb(paramClass, "serviceClass is required.");
      zzx.zzb(paramString, "applicationId is required.");
      zzx.zzb(paramCastDevice, "device is required.");
      zzx.zzb(paramNotificationSettings, "notificationSettings is required.");
      zzx.zzb(paramCallbacks, "callbacks is required.");
      if ((CastRemoteDisplayLocalService.NotificationSettings.zzb(paramNotificationSettings) == null) && (CastRemoteDisplayLocalService.NotificationSettings.zze(paramNotificationSettings) == null)) {
        throw new IllegalArgumentException("notificationSettings: Either the notification or the notificationPendingIntent must be provided");
      }
    }
    if (zzaai.getAndSet(true))
    {
      zzaaf.zzc("Service is already being started, startService has been called twice", new Object[0]);
      return;
    }
    paramClass = new Intent(paramContext, paramClass);
    paramContext.startService(paramClass);
    paramContext.bindService(paramClass, new CastRemoteDisplayLocalService.4(paramString, paramCastDevice, paramNotificationSettings, paramContext, paramCallbacks), 64);
  }
  
  public static void stopService()
  {
    zzS(false);
  }
  
  private void zzQ(boolean paramBoolean)
  {
    if (mHandler != null)
    {
      if (Looper.myLooper() != Looper.getMainLooper()) {
        mHandler.post(new CastRemoteDisplayLocalService.5(this, paramBoolean));
      }
    }
    else {
      return;
    }
    zzR(paramBoolean);
  }
  
  private void zzR(boolean paramBoolean)
  {
    zzbe("Stopping Service");
    zzx.zzcD("stopServiceInstanceInternal must be called on the main thread");
    if ((!paramBoolean) && (zzaau != null))
    {
      zzbe("Setting default route");
      zzaau.selectRoute(zzaau.getDefaultRoute());
    }
    if (zzaam != null)
    {
      zzbe("Unregistering notification receiver");
      unregisterReceiver(zzaam);
    }
    zznF();
    zznG();
    zznB();
    if (zzaaj != null)
    {
      zzaaj.disconnect();
      zzaaj = null;
    }
    if ((zzaas != null) && (zzaat != null)) {}
    try
    {
      zzaas.unbindService(zzaat);
      zzaat = null;
      zzaas = null;
      zzZC = null;
      zzaaj = null;
      mNotification = null;
      zzaar = null;
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        zzbe("No need to unbind service, already unbound");
      }
    }
  }
  
  private static void zzS(boolean paramBoolean)
  {
    zzaaf.zzb("Stopping Service", new Object[0]);
    zzaai.set(false);
    synchronized (zzaah)
    {
      if (zzaax == null)
      {
        zzaaf.zzc("Service is already being stopped", new Object[0]);
        return;
      }
      CastRemoteDisplayLocalService localCastRemoteDisplayLocalService = zzaax;
      zzaax = null;
      localCastRemoteDisplayLocalService.zzQ(paramBoolean);
      return;
    }
  }
  
  private Notification zzT(boolean paramBoolean)
  {
    zzbe("createDefaultNotification");
    int k = getApplicationInfolabelRes;
    String str3 = CastRemoteDisplayLocalService.NotificationSettings.zzc(zzaan);
    String str2 = CastRemoteDisplayLocalService.NotificationSettings.zzd(zzaan);
    int j;
    int i;
    String str1;
    if (paramBoolean)
    {
      j = R.string.cast_notification_connected_message;
      i = R.drawable.cast_ic_notification_on;
      str1 = str3;
      if (TextUtils.isEmpty(str3)) {
        str1 = getString(k);
      }
      if (!TextUtils.isEmpty(str2)) {
        break label163;
      }
      str2 = getString(j, new Object[] { zzaaq.getFriendlyName() });
    }
    label163:
    for (;;)
    {
      return new NotificationCompat.Builder(this).setContentTitle(str1).setContentText(str2).setContentIntent(CastRemoteDisplayLocalService.NotificationSettings.zze(zzaan)).setSmallIcon(i).setOngoing(true).addAction(17301560, getString(R.string.cast_notification_disconnect), zznH()).build();
      j = R.string.cast_notification_connecting_message;
      i = R.drawable.cast_ic_notification_connecting;
      break;
    }
  }
  
  private GoogleApiClient zza(CastDevice paramCastDevice)
  {
    paramCastDevice = new CastRemoteDisplay.CastRemoteDisplayOptions.Builder(paramCastDevice, zzaak);
    return new GoogleApiClient.Builder(this, new CastRemoteDisplayLocalService.10(this), new CastRemoteDisplayLocalService.2(this)).addApi(CastRemoteDisplay.API, paramCastDevice.build()).build();
  }
  
  private void zza(Display paramDisplay)
  {
    zzaar = paramDisplay;
    if (zzaao)
    {
      mNotification = zzT(true);
      startForeground(zzaag, mNotification);
    }
    if (zzaal != null)
    {
      zzaal.onRemoteDisplaySessionStarted(this);
      zzaal = null;
    }
    onCreatePresentation(zzaar);
  }
  
  private void zza(CastRemoteDisplayLocalService.NotificationSettings paramNotificationSettings)
  {
    zzx.zzcD("updateNotificationSettingsInternal must be called on the main thread");
    if (zzaan == null) {
      throw new IllegalStateException("No current notification settings to update");
    }
    if (zzaao)
    {
      if (CastRemoteDisplayLocalService.NotificationSettings.zzb(paramNotificationSettings) != null) {
        throw new IllegalStateException("Current mode is default notification, notification attribute must not be provided");
      }
      if (CastRemoteDisplayLocalService.NotificationSettings.zze(paramNotificationSettings) != null) {
        CastRemoteDisplayLocalService.NotificationSettings.zza(zzaan, CastRemoteDisplayLocalService.NotificationSettings.zze(paramNotificationSettings));
      }
      if (!TextUtils.isEmpty(CastRemoteDisplayLocalService.NotificationSettings.zzc(paramNotificationSettings))) {
        CastRemoteDisplayLocalService.NotificationSettings.zza(zzaan, CastRemoteDisplayLocalService.NotificationSettings.zzc(paramNotificationSettings));
      }
      if (!TextUtils.isEmpty(CastRemoteDisplayLocalService.NotificationSettings.zzd(paramNotificationSettings))) {
        CastRemoteDisplayLocalService.NotificationSettings.zzb(zzaan, CastRemoteDisplayLocalService.NotificationSettings.zzd(paramNotificationSettings));
      }
      mNotification = zzT(true);
    }
    for (;;)
    {
      startForeground(zzaag, mNotification);
      return;
      zzx.zzb(CastRemoteDisplayLocalService.NotificationSettings.zzb(paramNotificationSettings), "notification is required.");
      mNotification = CastRemoteDisplayLocalService.NotificationSettings.zzb(paramNotificationSettings);
      CastRemoteDisplayLocalService.NotificationSettings.zza(zzaan, mNotification);
    }
  }
  
  private boolean zza(String paramString, CastDevice paramCastDevice, CastRemoteDisplayLocalService.NotificationSettings paramNotificationSettings, Context paramContext, ServiceConnection paramServiceConnection, CastRemoteDisplayLocalService.Callbacks paramCallbacks)
  {
    zzbe("startRemoteDisplaySession");
    zzx.zzcD("Starting the Cast Remote Display must be done on the main thread");
    for (;;)
    {
      synchronized (zzaah)
      {
        if (zzaax != null)
        {
          zzaaf.zzf("An existing service had not been stopped before starting one", new Object[0]);
          return false;
        }
        zzaax = this;
        zzaal = paramCallbacks;
        zzZC = paramString;
        zzaaq = paramCastDevice;
        zzaas = paramContext;
        zzaat = paramServiceConnection;
        zzaau = MediaRouter.getInstance(getApplicationContext());
        paramString = new MediaRouteSelector.Builder().addControlCategory(CastMediaControlIntent.categoryForCast(zzZC)).build();
        zzbe("addMediaRouterCallback");
        zzaau.addCallback(paramString, zzaaw, 4);
        zzaak = new CastRemoteDisplayLocalService.7(this);
        mNotification = CastRemoteDisplayLocalService.NotificationSettings.zzb(paramNotificationSettings);
        zzaam = new CastRemoteDisplayLocalService.zzb(null);
        registerReceiver(zzaam, new IntentFilter("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"));
        zzaan = new CastRemoteDisplayLocalService.NotificationSettings(paramNotificationSettings, null);
        if (CastRemoteDisplayLocalService.NotificationSettings.zzb(zzaan) == null)
        {
          zzaao = true;
          mNotification = zzT(false);
          startForeground(zzaag, mNotification);
          zzaaj = zza(paramCastDevice);
          zzaaj.connect();
          if (zzaal != null) {
            zzaal.onServiceCreated(this);
          }
          return true;
        }
      }
      zzaao = false;
      mNotification = CastRemoteDisplayLocalService.NotificationSettings.zzb(zzaan);
    }
  }
  
  private static void zzb(Context paramContext, Class paramClass)
  {
    try
    {
      paramClass = new ComponentName(paramContext, paramClass);
      paramContext = paramContext.getPackageManager().getServiceInfo(paramClass, 128);
      if ((paramContext != null) && (exported)) {
        throw new IllegalStateException("The service must not be exported, verify the manifest configuration");
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      throw new IllegalStateException("Service not found, did you forget to configure it in the manifest?");
    }
  }
  
  private void zzbe(String paramString)
  {
    zzaaf.zzb("[Instance: %s] %s", new Object[] { this, paramString });
  }
  
  private void zzbh(String paramString)
  {
    zzaaf.zzc("[Instance: %s] %s", new Object[] { this, paramString });
  }
  
  private void zznB()
  {
    if (zzaau != null)
    {
      zzx.zzcD("CastRemoteDisplayLocalService calls must be done on the main thread");
      zzbe("removeMediaRouterCallback");
      zzaau.removeCallback(zzaaw);
    }
  }
  
  private void zznC()
  {
    zzbe("startRemoteDisplay");
    if ((zzaaj == null) || (!zzaaj.isConnected()))
    {
      zzaaf.zzc("Unable to start the remote display as the API client is not ready", new Object[0]);
      return;
    }
    CastRemoteDisplay.CastRemoteDisplayApi.startRemoteDisplay(zzaaj, zzZC).setResultCallback(new CastRemoteDisplayLocalService.8(this));
  }
  
  private void zznD()
  {
    zzbe("stopRemoteDisplay");
    if ((zzaaj == null) || (!zzaaj.isConnected()))
    {
      zzaaf.zzc("Unable to stop the remote display as the API client is not ready", new Object[0]);
      return;
    }
    CastRemoteDisplay.CastRemoteDisplayApi.stopRemoteDisplay(zzaaj).setResultCallback(new CastRemoteDisplayLocalService.9(this));
  }
  
  private void zznE()
  {
    if (zzaal != null)
    {
      zzaal.onRemoteDisplaySessionError(new Status(2200));
      zzaal = null;
    }
    zzS(false);
  }
  
  private void zznF()
  {
    zzbe("stopRemoteDisplaySession");
    zznD();
    onDismissPresentation();
  }
  
  private void zznG()
  {
    zzbe("Stopping the remote display Service");
    stopForeground(true);
    stopSelf();
  }
  
  private PendingIntent zznH()
  {
    if (zzaap == null) {
      zzaap = PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"), 268435456);
    }
    return zzaap;
  }
  
  protected Display getDisplay()
  {
    return zzaar;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    zzbe("onBind");
    return zzaay;
  }
  
  public void onCreate()
  {
    zzbe("onCreate");
    super.onCreate();
    mHandler = new Handler(getMainLooper());
    mHandler.postDelayed(new CastRemoteDisplayLocalService.3(this), 100L);
  }
  
  public abstract void onCreatePresentation(Display paramDisplay);
  
  public abstract void onDismissPresentation();
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    zzbe("onStartCommand");
    zzaav = true;
    return 2;
  }
  
  public void updateNotificationSettings(CastRemoteDisplayLocalService.NotificationSettings paramNotificationSettings)
  {
    zzx.zzb(paramNotificationSettings, "notificationSettings is required.");
    zzx.zzb(mHandler, "Service is not ready yet.");
    mHandler.post(new CastRemoteDisplayLocalService.6(this, paramNotificationSettings));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplayLocalService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */