package com.google.android.gms.internal;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.stats.zzg;
import com.google.android.gms.common.stats.zzi;

public class zzrp
{
  private static boolean DEBUG = false;
  private static String TAG = "WakeLock";
  private static String zzbhl = "*gcore*:";
  private final Context mContext;
  private final String zzanQ;
  private final PowerManager.WakeLock zzbhm;
  private WorkSource zzbhn;
  private final int zzbho;
  private final String zzbhp;
  private boolean zzbhq = true;
  private int zzbhr;
  private int zzbhs;
  
  public zzrp(Context paramContext, int paramInt, String paramString) {}
  
  public zzrp(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    zzx.zzh(paramString1, "Wake lock name can NOT be empty");
    zzbho = paramInt;
    zzbhp = paramString2;
    mContext = paramContext.getApplicationContext();
    if ((!zzni.zzcV(paramString3)) && ("com.google.android.gms" != paramString3))
    {
      zzanQ = (zzbhl + paramString1);
      zzbhm = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(paramInt, paramString1);
      if (zznj.zzaA(mContext))
      {
        paramString1 = paramString3;
        if (zzni.zzcV(paramString3))
        {
          if ((!zzd.zzakE) || (!zzlz.isInitialized())) {
            break label192;
          }
          Log.e(TAG, "callingPackage is not supposed to be empty for wakelock " + zzanQ + "!", new IllegalArgumentException());
        }
      }
    }
    label192:
    for (paramString1 = "com.google.android.gms";; paramString1 = paramContext.getPackageName())
    {
      zzbhn = zznj.zzl(paramContext, paramString1);
      zzc(zzbhn);
      return;
      zzanQ = paramString1;
      break;
    }
  }
  
  private void zzfJ(String paramString)
  {
    boolean bool = zzfK(paramString);
    String str = zzn(paramString, bool);
    if (DEBUG) {
      Log.d(TAG, "Release:\n mWakeLockName: " + zzanQ + "\n mSecondaryName: " + zzbhp + "\nmReferenceCounted: " + zzbhq + "\nreason: " + paramString + "\n mOpenEventCount" + zzbhs + "\nuseWithReason: " + bool + "\ntrackingName: " + str);
    }
    try
    {
      if (zzbhq)
      {
        int i = zzbhr - 1;
        zzbhr = i;
        if ((i == 0) || (bool)) {}
      }
      else
      {
        if ((zzbhq) || (zzbhs != 1)) {
          break label202;
        }
      }
      zzi.zzrZ().zza(mContext, zzg.zza(zzbhm, str), 8, zzanQ, str, zzbho, zznj.zzb(zzbhn));
      zzbhs -= 1;
      label202:
      return;
    }
    finally {}
  }
  
  private boolean zzfK(String paramString)
  {
    return (!TextUtils.isEmpty(paramString)) && (!paramString.equals(zzbhp));
  }
  
  private void zzj(String paramString, long paramLong)
  {
    boolean bool = zzfK(paramString);
    String str = zzn(paramString, bool);
    if (DEBUG) {
      Log.d(TAG, "Acquire:\n mWakeLockName: " + zzanQ + "\n mSecondaryName: " + zzbhp + "\nmReferenceCounted: " + zzbhq + "\nreason: " + paramString + "\nmOpenEventCount" + zzbhs + "\nuseWithReason: " + bool + "\ntrackingName: " + str + "\ntimeout: " + paramLong);
    }
    try
    {
      if (zzbhq)
      {
        int i = zzbhr;
        zzbhr = (i + 1);
        if ((i == 0) || (bool)) {}
      }
      else
      {
        if ((zzbhq) || (zzbhs != 0)) {
          break label218;
        }
      }
      zzi.zzrZ().zza(mContext, zzg.zza(zzbhm, str), 7, zzanQ, str, zzbho, zznj.zzb(zzbhn), paramLong);
      zzbhs += 1;
      label218:
      return;
    }
    finally {}
  }
  
  private String zzn(String paramString, boolean paramBoolean)
  {
    if (zzbhq)
    {
      if (paramBoolean) {
        return paramString;
      }
      return zzbhp;
    }
    return zzbhp;
  }
  
  public void acquire(long paramLong)
  {
    if ((!zzne.zzsg()) && (zzbhq)) {
      Log.wtf(TAG, "Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: " + zzanQ);
    }
    zzj(null, paramLong);
    zzbhm.acquire(paramLong);
  }
  
  public boolean isHeld()
  {
    return zzbhm.isHeld();
  }
  
  public void release()
  {
    zzfJ(null);
    zzbhm.release();
  }
  
  public void setReferenceCounted(boolean paramBoolean)
  {
    zzbhm.setReferenceCounted(paramBoolean);
    zzbhq = paramBoolean;
  }
  
  public void zzc(WorkSource paramWorkSource)
  {
    if ((zznj.zzaA(mContext)) && (paramWorkSource != null))
    {
      if (zzbhn == null) {
        break label42;
      }
      zzbhn.add(paramWorkSource);
    }
    for (;;)
    {
      zzbhm.setWorkSource(zzbhn);
      return;
      label42:
      zzbhn = paramWorkSource;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */