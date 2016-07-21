package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast.Listener;
import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zzj;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class zze
  extends zzj
{
  private static final zzl zzaaf = new zzl("CastClientImpl");
  private static final Object zzadP = new Object();
  private static final Object zzadQ = new Object();
  private final Cast.Listener zzZP;
  private double zzabs;
  private boolean zzabt;
  private final long zzadA;
  private zze.zzb zzadB;
  private String zzadC;
  private boolean zzadD;
  private boolean zzadE;
  private boolean zzadF;
  private int zzadG;
  private int zzadH;
  private final AtomicLong zzadI;
  private String zzadJ;
  private String zzadK;
  private Bundle zzadL;
  private final Map zzadM;
  private zza.zzb zzadN;
  private zza.zzb zzadO;
  private ApplicationMetadata zzadx;
  private final CastDevice zzady;
  private final Map zzadz;
  
  public zze(Context paramContext, Looper paramLooper, com.google.android.gms.common.internal.zzf paramzzf, CastDevice paramCastDevice, long paramLong, Cast.Listener paramListener, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 10, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    zzady = paramCastDevice;
    zzZP = paramListener;
    zzadA = paramLong;
    zzadz = new HashMap();
    zzadI = new AtomicLong(0L);
    zzadM = new HashMap();
    zzoh();
  }
  
  private void zza(ApplicationStatus paramApplicationStatus)
  {
    paramApplicationStatus = paramApplicationStatus.zzoe();
    if (!zzf.zza(paramApplicationStatus, zzadC)) {
      zzadC = paramApplicationStatus;
    }
    for (boolean bool = true;; bool = false)
    {
      zzaaf.zzb("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(zzadD) });
      if ((zzZP != null) && ((bool) || (zzadD))) {
        zzZP.onApplicationStatusChanged();
      }
      zzadD = false;
      return;
    }
  }
  
  private void zza(DeviceStatus paramDeviceStatus)
  {
    ApplicationMetadata localApplicationMetadata = paramDeviceStatus.getApplicationMetadata();
    if (!zzf.zza(localApplicationMetadata, zzadx))
    {
      zzadx = localApplicationMetadata;
      zzZP.onApplicationMetadataChanged(zzadx);
    }
    double d = paramDeviceStatus.zzok();
    if ((d != NaN.0D) && (Math.abs(d - zzabs) > 1.0E-7D)) {
      zzabs = d;
    }
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2 = paramDeviceStatus.zzot();
      if (bool2 != zzabt)
      {
        zzabt = bool2;
        bool1 = true;
      }
      zzaaf.zzb("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(zzadE) });
      if ((zzZP != null) && ((bool1) || (zzadE))) {
        zzZP.onVolumeChanged();
      }
      int i = paramDeviceStatus.zzol();
      if (i != zzadG) {
        zzadG = i;
      }
      for (bool1 = true;; bool1 = false)
      {
        zzaaf.zzb("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(zzadE) });
        if ((zzZP != null) && ((bool1) || (zzadE))) {
          zzZP.onActiveInputStateChanged(zzadG);
        }
        i = paramDeviceStatus.zzom();
        if (i != zzadH) {
          zzadH = i;
        }
        for (bool1 = true;; bool1 = false)
        {
          zzaaf.zzb("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(zzadE) });
          if ((zzZP != null) && ((bool1) || (zzadE))) {
            zzZP.onStandbyStateChanged(zzadH);
          }
          zzadE = false;
          return;
        }
      }
    }
  }
  
  private void zza(zza.zzb paramzzb)
  {
    synchronized (zzadP)
    {
      if (zzadN != null) {
        zzadN.zzs(new zze.zza(new Status(2002)));
      }
      zzadN = paramzzb;
      return;
    }
  }
  
  private void zzc(zza.zzb paramzzb)
  {
    synchronized (zzadQ)
    {
      if (zzadO != null)
      {
        paramzzb.zzs(new Status(2001));
        return;
      }
      zzadO = paramzzb;
      return;
    }
  }
  
  private void zzoh()
  {
    zzadF = false;
    zzadG = -1;
    zzadH = -1;
    zzadx = null;
    zzadC = null;
    zzabs = 0.0D;
    zzabt = false;
  }
  
  private void zzon()
  {
    zzaaf.zzb("removing all MessageReceivedCallbacks", new Object[0]);
    synchronized (zzadz)
    {
      zzadz.clear();
      return;
    }
  }
  
  private void zzoo()
  {
    if ((!zzadF) || (zzadB == null) || (zzadB.isDisposed())) {
      throw new IllegalStateException("Not connected to a device");
    }
  }
  
  /* Error */
  public final void disconnect()
  {
    // Byte code:
    //   0: getstatic 55	com/google/android/gms/cast/internal/zze:zzaaf	Lcom/google/android/gms/cast/internal/zzl;
    //   3: ldc_w 266
    //   6: iconst_2
    //   7: anewarray 57	java/lang/Object
    //   10: dup
    //   11: iconst_0
    //   12: aload_0
    //   13: getfield 246	com/google/android/gms/cast/internal/zze:zzadB	Lcom/google/android/gms/cast/internal/zze$zzb;
    //   16: aastore
    //   17: dup
    //   18: iconst_1
    //   19: aload_0
    //   20: invokevirtual 269	com/google/android/gms/cast/internal/zze:isConnected	()Z
    //   23: invokestatic 123	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   26: aastore
    //   27: invokevirtual 129	com/google/android/gms/cast/internal/zzl:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: aload_0
    //   31: getfield 246	com/google/android/gms/cast/internal/zze:zzadB	Lcom/google/android/gms/cast/internal/zze$zzb;
    //   34: astore_1
    //   35: aload_0
    //   36: aconst_null
    //   37: putfield 246	com/google/android/gms/cast/internal/zze:zzadB	Lcom/google/android/gms/cast/internal/zze$zzb;
    //   40: aload_1
    //   41: ifnull +10 -> 51
    //   44: aload_1
    //   45: invokevirtual 273	com/google/android/gms/cast/internal/zze$zzb:zzos	()Lcom/google/android/gms/cast/internal/zze;
    //   48: ifnonnull +17 -> 65
    //   51: getstatic 55	com/google/android/gms/cast/internal/zze:zzaaf	Lcom/google/android/gms/cast/internal/zzl;
    //   54: ldc_w 275
    //   57: iconst_0
    //   58: anewarray 57	java/lang/Object
    //   61: invokevirtual 129	com/google/android/gms/cast/internal/zzl:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: return
    //   65: aload_0
    //   66: invokespecial 277	com/google/android/gms/cast/internal/zze:zzon	()V
    //   69: aload_0
    //   70: invokevirtual 281	com/google/android/gms/cast/internal/zze:zzqJ	()Landroid/os/IInterface;
    //   73: checkcast 283	com/google/android/gms/cast/internal/zzi
    //   76: invokeinterface 285 1 0
    //   81: aload_0
    //   82: invokespecial 286	com/google/android/gms/common/internal/zzj:disconnect	()V
    //   85: return
    //   86: astore_1
    //   87: getstatic 55	com/google/android/gms/cast/internal/zze:zzaaf	Lcom/google/android/gms/cast/internal/zzl;
    //   90: aload_1
    //   91: ldc_w 288
    //   94: iconst_1
    //   95: anewarray 57	java/lang/Object
    //   98: dup
    //   99: iconst_0
    //   100: aload_1
    //   101: invokevirtual 293	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   104: aastore
    //   105: invokevirtual 296	com/google/android/gms/cast/internal/zzl:zzb	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   108: aload_0
    //   109: invokespecial 286	com/google/android/gms/common/internal/zzj:disconnect	()V
    //   112: return
    //   113: astore_1
    //   114: aload_0
    //   115: invokespecial 286	com/google/android/gms/common/internal/zzj:disconnect	()V
    //   118: aload_1
    //   119: athrow
    //   120: astore_1
    //   121: goto -34 -> 87
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	124	0	this	zze
    //   34	11	1	localzzb	zze.zzb
    //   86	15	1	localRemoteException	android.os.RemoteException
    //   113	6	1	localObject	Object
    //   120	1	1	localIllegalStateException	IllegalStateException
    // Exception table:
    //   from	to	target	type
    //   69	81	86	android/os/RemoteException
    //   69	81	113	finally
    //   87	108	113	finally
    //   69	81	120	java/lang/IllegalStateException
  }
  
  public final ApplicationMetadata getApplicationMetadata()
  {
    zzoo();
    return zzadx;
  }
  
  public final String getApplicationStatus()
  {
    zzoo();
    return zzadC;
  }
  
  public final boolean isMute()
  {
    zzoo();
    return zzabt;
  }
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    super.onConnectionFailed(paramConnectionResult);
    zzon();
  }
  
  public final void zzX(boolean paramBoolean)
  {
    ((zzi)zzqJ()).zza(paramBoolean, zzabs, zzabt);
  }
  
  protected final void zza(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    zzaaf.zzb("in onPostInitHandler; statusCode=%d", new Object[] { Integer.valueOf(paramInt1) });
    if ((paramInt1 == 0) || (paramInt1 == 1001))
    {
      zzadF = true;
      zzadD = true;
      zzadE = true;
    }
    for (;;)
    {
      int i = paramInt1;
      if (paramInt1 == 1001)
      {
        zzadL = new Bundle();
        zzadL.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
        i = 0;
      }
      super.zza(i, paramIBinder, paramBundle, paramInt2);
      return;
      zzadF = false;
    }
  }
  
  public final void zza(String paramString, Cast.MessageReceivedCallback paramMessageReceivedCallback)
  {
    zzf.zzch(paramString);
    zzcg(paramString);
    if (paramMessageReceivedCallback != null) {}
    synchronized (zzadz)
    {
      zzadz.put(paramString, paramMessageReceivedCallback);
      ((zzi)zzqJ()).zzcl(paramString);
      return;
    }
  }
  
  public final void zza(String paramString, LaunchOptions paramLaunchOptions, zza.zzb paramzzb)
  {
    zza(paramzzb);
    ((zzi)zzqJ()).zza(paramString, paramLaunchOptions);
  }
  
  public final void zza(String paramString, zza.zzb paramzzb)
  {
    zzc(paramzzb);
    ((zzi)zzqJ()).zzck(paramString);
  }
  
  public final void zza(String paramString1, String paramString2, JoinOptions paramJoinOptions, zza.zzb paramzzb)
  {
    zza(paramzzb);
    paramzzb = paramJoinOptions;
    if (paramJoinOptions == null) {
      paramzzb = new JoinOptions();
    }
    ((zzi)zzqJ()).zza(paramString1, paramString2, paramzzb);
  }
  
  public final void zza(String paramString1, String paramString2, zza.zzb paramzzb)
  {
    if (TextUtils.isEmpty(paramString2)) {
      throw new IllegalArgumentException("The message payload cannot be null or empty");
    }
    if (paramString2.length() > 65536) {
      throw new IllegalArgumentException("Message exceeds maximum size");
    }
    zzf.zzch(paramString1);
    zzoo();
    long l = zzadI.incrementAndGet();
    try
    {
      zzadM.put(Long.valueOf(l), paramzzb);
      ((zzi)zzqJ()).zzb(paramString1, paramString2, l);
      return;
    }
    catch (Throwable paramString1)
    {
      zzadM.remove(Long.valueOf(l));
      throw paramString1;
    }
  }
  
  public final void zza(String paramString, boolean paramBoolean, zza.zzb paramzzb)
  {
    LaunchOptions localLaunchOptions = new LaunchOptions();
    localLaunchOptions.setRelaunchIfRunning(paramBoolean);
    zza(paramString, localLaunchOptions, paramzzb);
  }
  
  protected final zzi zzaE(IBinder paramIBinder)
  {
    return zzi.zza.zzaF(paramIBinder);
  }
  
  public final void zzb(zza.zzb paramzzb)
  {
    zzc(paramzzb);
    ((zzi)zzqJ()).zzou();
  }
  
  public final void zzcg(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    }
    synchronized (zzadz)
    {
      Cast.MessageReceivedCallback localMessageReceivedCallback = (Cast.MessageReceivedCallback)zzadz.remove(paramString);
      if (localMessageReceivedCallback == null) {}
    }
  }
  
  public final void zzf(double paramDouble)
  {
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble))) {
      throw new IllegalArgumentException("Volume cannot be " + paramDouble);
    }
    ((zzi)zzqJ()).zza(paramDouble, zzabs, zzabt);
  }
  
  protected final String zzgu()
  {
    return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
  }
  
  protected final String zzgv()
  {
    return "com.google.android.gms.cast.internal.ICastDeviceController";
  }
  
  protected final Bundle zzml()
  {
    Bundle localBundle = new Bundle();
    zzaaf.zzb("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] { zzadJ, zzadK });
    zzady.putInBundle(localBundle);
    localBundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", zzadA);
    zzadB = new zze.zzb(this);
    localBundle.putParcelable("listener", new BinderWrapper(zzadB.asBinder()));
    if (zzadJ != null)
    {
      localBundle.putString("last_application_id", zzadJ);
      if (zzadK != null) {
        localBundle.putString("last_session_id", zzadK);
      }
    }
    return localBundle;
  }
  
  public final Bundle zzoi()
  {
    if (zzadL != null)
    {
      Bundle localBundle = zzadL;
      zzadL = null;
      return localBundle;
    }
    return super.zzoi();
  }
  
  public final void zzoj()
  {
    ((zzi)zzqJ()).zzoj();
  }
  
  public final double zzok()
  {
    zzoo();
    return zzabs;
  }
  
  public final int zzol()
  {
    zzoo();
    return zzadG;
  }
  
  public final int zzom()
  {
    zzoo();
    return zzadH;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.internal.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */