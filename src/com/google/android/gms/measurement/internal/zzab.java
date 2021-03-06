package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.measurement.AppMeasurement.zza;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;

public class zzab
  extends zzz
{
  private zzab.zza zzaYD;
  private AppMeasurement.zza zzaYE;
  private boolean zzaYF;
  
  protected zzab(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  private void zzDm()
  {
    try
    {
      zzh(Class.forName(zzDn()));
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      zzAo().zzCI().zzfg("Tag Manager is not found and thus will not be used");
    }
  }
  
  private String zzDn()
  {
    return "com.google.android.gms.tagmanager.TagManagerService";
  }
  
  private void zza(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean, String paramString3)
  {
    zza(paramString1, paramString2, paramBundle, paramBoolean, paramString3, zzjl().currentTimeMillis());
  }
  
  private void zza(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean, String paramString3, long paramLong)
  {
    zzx.zzcM(paramString1);
    zzCk().zzfr(paramString2);
    Bundle localBundle = new Bundle();
    if (paramBundle != null)
    {
      int k = zzCp().zzBA();
      Iterator localIterator = paramBundle.keySet().iterator();
      i = 0;
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        zzCk().zzft(str);
        int j = i;
        if (zzaj.zzfq(str))
        {
          j = i + 1;
          if (j > k) {
            break label181;
          }
        }
        label181:
        for (boolean bool = true;; bool = false)
        {
          zzx.zzb(bool, "Event can't contain more then " + k + " params");
          Object localObject = zzCk().zzk(str, paramBundle.get(str));
          i = j;
          if (localObject == null) {
            break;
          }
          zzCk().zza(localBundle, str, localObject);
          i = j;
          break;
        }
      }
    }
    int i = zzCp().zzBD();
    if (paramString1.length() <= i) {}
    for (paramBundle = paramString1;; paramBundle = paramString1.substring(0, i))
    {
      localBundle.putString("_o", paramBundle);
      zza(paramString1, paramString2, paramLong, localBundle, paramBoolean, paramString3);
      return;
    }
  }
  
  private void zza(String paramString1, String paramString2, Object paramObject, long paramLong)
  {
    zzx.zzcM(paramString1);
    zzx.zzcM(paramString2);
    zzjk();
    zzjj();
    zzjv();
    if (!zzCo().zzAr()) {
      zzAo().zzCJ().zzfg("User property not set since app measurement is disabled");
    }
    while (!zzaTV.zzCS()) {
      return;
    }
    zzAo().zzCJ().zze("Setting user property (FE)", paramString2, paramObject);
    paramString1 = new UserAttributeParcel(paramString2, paramLong, paramObject, paramString1);
    zzCi().zza(paramString1);
  }
  
  private void zzas(boolean paramBoolean)
  {
    zzjk();
    zzjj();
    zzjv();
    zzAo().zzCJ().zzj("Setting app measurement enabled (FE)", Boolean.valueOf(paramBoolean));
    zzCo().setMeasurementEnabled(paramBoolean);
    zzCi().zzDo();
  }
  
  private void zzb(String paramString1, String paramString2, long paramLong, Bundle paramBundle, boolean paramBoolean, String paramString3)
  {
    zzx.zzcM(paramString1);
    zzx.zzcM(paramString2);
    zzx.zzz(paramBundle);
    zzjk();
    zzjv();
    if (!zzCo().zzAr()) {
      zzAo().zzCJ().zzfg("Event not sent since app measurement is disabled");
    }
    do
    {
      return;
      if (!zzaYF)
      {
        zzaYF = true;
        zzDm();
      }
      if ((paramBoolean) && (zzaYE != null) && (!zzaj.zzfv(paramString2)))
      {
        zzAo().zzCJ().zze("Passing event to registered event handler (FE)", paramString2, paramBundle);
        zzaYE.zza(paramString1, paramString2, paramBundle, paramLong);
        return;
      }
    } while (!zzaTV.zzCS());
    zzAo().zzCJ().zze("Logging event (FE)", paramString2, paramBundle);
    paramString1 = new EventParcel(paramString2, new EventParams(paramBundle), paramString1, paramLong);
    zzCi().zzb(paramString1, paramString3);
  }
  
  public void setMeasurementEnabled(boolean paramBoolean)
  {
    zzjv();
    zzjj();
    zzCn().zzg(new zzab.1(this, paramBoolean));
  }
  
  public void zzDk()
  {
    if ((getContext().getApplicationContext() instanceof Application))
    {
      Application localApplication = (Application)getContext().getApplicationContext();
      if (zzaYD == null) {
        zzaYD = new zzab.zza(this, null);
      }
      localApplication.unregisterActivityLifecycleCallbacks(zzaYD);
      localApplication.registerActivityLifecycleCallbacks(zzaYD);
      zzAo().zzCK().zzfg("Registered activity lifecycle callback");
    }
  }
  
  public void zzDl()
  {
    zzjk();
    zzjj();
    zzjv();
    if (!zzaTV.zzCS()) {}
    String str;
    do
    {
      return;
      zzCi().zzDl();
      str = zzCo().zzCQ();
    } while ((TextUtils.isEmpty(str)) || (str.equals(zzCh().zzCy())));
    Bundle localBundle = new Bundle();
    localBundle.putString("_po", str);
    zze("auto", "_ou", localBundle);
  }
  
  protected void zza(String paramString1, String paramString2, long paramLong, Bundle paramBundle, boolean paramBoolean, String paramString3)
  {
    zzx.zzz(paramBundle);
    zzCn().zzg(new zzab.2(this, paramString1, paramString2, paramLong, paramBundle, paramBoolean, paramString3));
  }
  
  void zza(String paramString1, String paramString2, long paramLong, Object paramObject)
  {
    zzCn().zzg(new zzab.3(this, paramString1, paramString2, paramObject, paramLong));
  }
  
  public void zza(String paramString1, String paramString2, Object paramObject)
  {
    zzx.zzcM(paramString1);
    long l = zzjl().currentTimeMillis();
    zzCk().zzfs(paramString2);
    if (paramObject != null)
    {
      zzCk().zzl(paramString2, paramObject);
      paramObject = zzCk().zzm(paramString2, paramObject);
      if (paramObject != null) {
        zza(paramString1, paramString2, l, paramObject);
      }
      return;
    }
    zza(paramString1, paramString2, l, null);
  }
  
  public void zze(String paramString1, String paramString2, Bundle paramBundle)
  {
    zzjj();
    zza(paramString1, paramString2, paramBundle, true, null);
  }
  
  public void zzh(Class paramClass)
  {
    try
    {
      paramClass.getDeclaredMethod("initialize", new Class[] { Context.class }).invoke(null, new Object[] { getContext() });
      return;
    }
    catch (Exception paramClass)
    {
      zzAo().zzCF().zzj("Failed to invoke Tag Manager's initialize() method", paramClass);
    }
  }
  
  protected void zziJ() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */