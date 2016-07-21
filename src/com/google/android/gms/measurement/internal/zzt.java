package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.measurement.zza;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;

class zzt
  extends zzz
{
  static final Pair zzaXh = new Pair("", Long.valueOf(0L));
  private SharedPreferences zzTh;
  public final zzt.zzc zzaXi = new zzt.zzc(this, "health_monitor", zzCp().zzkX(), null);
  public final zzt.zzb zzaXj = new zzt.zzb(this, "last_upload", 0L);
  public final zzt.zzb zzaXk = new zzt.zzb(this, "last_upload_attempt", 0L);
  public final zzt.zzb zzaXl = new zzt.zzb(this, "backoff", 0L);
  public final zzt.zzb zzaXm = new zzt.zzb(this, "last_delete_stale", 0L);
  public final zzt.zzb zzaXn = new zzt.zzb(this, "midnight_offset", 0L);
  private String zzaXo;
  private boolean zzaXp;
  private long zzaXq;
  private final SecureRandom zzaXr = new SecureRandom();
  public final zzt.zzb zzaXs = new zzt.zzb(this, "time_before_start", 10000L);
  public final zzt.zzb zzaXt = new zzt.zzb(this, "session_timeout", 1800000L);
  public final zzt.zza zzaXu = new zzt.zza(this, "start_new_session", true);
  public final zzt.zzb zzaXv = new zzt.zzb(this, "last_pause_time", 0L);
  public final zzt.zzb zzaXw = new zzt.zzb(this, "time_active", 0L);
  public boolean zzaXx;
  
  zzt(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  private SharedPreferences zzCO()
  {
    zzjk();
    zzjv();
    return zzTh;
  }
  
  void setMeasurementEnabled(boolean paramBoolean)
  {
    zzjk();
    zzAo().zzCK().zzj("Setting measurementEnabled", Boolean.valueOf(paramBoolean));
    SharedPreferences.Editor localEditor = zzCO().edit();
    localEditor.putBoolean("measurement_enabled", paramBoolean);
    localEditor.apply();
  }
  
  boolean zzAr()
  {
    zzjk();
    SharedPreferences localSharedPreferences = zzCO();
    if (!zza.zzAs()) {}
    for (boolean bool = true;; bool = false) {
      return localSharedPreferences.getBoolean("measurement_enabled", bool);
    }
  }
  
  String zzCM()
  {
    byte[] arrayOfByte = new byte[16];
    zzaXr.nextBytes(arrayOfByte);
    return String.format(Locale.US, "%032x", new Object[] { new BigInteger(1, arrayOfByte) });
  }
  
  long zzCN()
  {
    zzjv();
    zzjk();
    long l2 = zzaXn.get();
    long l1 = l2;
    if (l2 == 0L)
    {
      l1 = zzaXr.nextInt(86400000) + 1;
      zzaXn.set(l1);
    }
    return l1;
  }
  
  Boolean zzCP()
  {
    zzjk();
    if (!zzCO().contains("use_service")) {
      return null;
    }
    return Boolean.valueOf(zzCO().getBoolean("use_service", false));
  }
  
  protected String zzCQ()
  {
    zzjk();
    String str1 = zzCO().getString("previous_os_version", null);
    String str2 = zzCh().zzCy();
    if ((!TextUtils.isEmpty(str2)) && (!str2.equals(str1)))
    {
      SharedPreferences.Editor localEditor = zzCO().edit();
      localEditor.putString("previous_os_version", str2);
      localEditor.apply();
    }
    return str1;
  }
  
  void zzar(boolean paramBoolean)
  {
    zzjk();
    zzAo().zzCK().zzj("Setting useService", Boolean.valueOf(paramBoolean));
    SharedPreferences.Editor localEditor = zzCO().edit();
    localEditor.putBoolean("use_service", paramBoolean);
    localEditor.apply();
  }
  
  Pair zzfh(String paramString)
  {
    zzjk();
    long l = zzjl().elapsedRealtime();
    if ((zzaXo != null) && (l < zzaXq)) {
      return new Pair(zzaXo, Boolean.valueOf(zzaXp));
    }
    zzaXq = (l + zzCp().zzeS(paramString));
    AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
    try
    {
      paramString = AdvertisingIdClient.getAdvertisingIdInfo(getContext());
      zzaXo = paramString.getId();
      zzaXp = paramString.isLimitAdTrackingEnabled();
      AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
      return new Pair(zzaXo, Boolean.valueOf(zzaXp));
    }
    catch (Throwable paramString)
    {
      for (;;)
      {
        zzAo().zzCJ().zzj("Unable to get advertising id", paramString);
        zzaXo = "";
      }
    }
  }
  
  String zzfi(String paramString)
  {
    paramString = (String)zzfhfirst;
    MessageDigest localMessageDigest = zzaj.zzbv("MD5");
    if (localMessageDigest == null) {
      return null;
    }
    return String.format(Locale.US, "%032X", new Object[] { new BigInteger(1, localMessageDigest.digest(paramString.getBytes())) });
  }
  
  protected void zziJ()
  {
    zzTh = getContext().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
    zzaXx = zzTh.getBoolean("has_been_opened", false);
    if (!zzaXx)
    {
      SharedPreferences.Editor localEditor = zzTh.edit();
      localEditor.putBoolean("has_been_opened", true);
      localEditor.apply();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */