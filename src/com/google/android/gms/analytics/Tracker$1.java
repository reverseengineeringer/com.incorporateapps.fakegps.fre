package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zza;
import com.google.android.gms.analytics.internal.zzab;
import com.google.android.gms.analytics.internal.zzad;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.analytics.internal.zzu;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.internal.zzps;
import java.util.HashMap;
import java.util.Map;

class Tracker$1
  implements Runnable
{
  Tracker$1(Tracker paramTracker, Map paramMap, boolean paramBoolean1, String paramString1, long paramLong, boolean paramBoolean2, boolean paramBoolean3, String paramString2) {}
  
  public void run()
  {
    boolean bool = true;
    if (Tracker.zza(zzPF).zziM()) {
      zzPy.put("sc", "start");
    }
    zzam.zzd(zzPy, "cid", zzPF.zziC().getClientId());
    Object localObject = (String)zzPy.get("sf");
    if (localObject != null)
    {
      double d = zzam.zza((String)localObject, 100.0D);
      if (zzam.zza(d, (String)zzPy.get("cid")))
      {
        zzPF.zzb("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d));
        return;
      }
    }
    localObject = Tracker.zzb(zzPF);
    if (zzPz)
    {
      zzam.zzb(zzPy, "ate", ((zza)localObject).zziU());
      zzam.zzc(zzPy, "adid", ((zza)localObject).zziY());
      localObject = Tracker.zzc(zzPF).zzjS();
      zzam.zzc(zzPy, "an", ((zzpq)localObject).zzlg());
      zzam.zzc(zzPy, "av", ((zzpq)localObject).zzli());
      zzam.zzc(zzPy, "aid", ((zzpq)localObject).zzwK());
      zzam.zzc(zzPy, "aiid", ((zzpq)localObject).zzAJ());
      zzPy.put("v", "1");
      zzPy.put("_v", zze.zzQm);
      zzam.zzc(zzPy, "ul", Tracker.zzd(zzPF).zzkZ().getLanguage());
      zzam.zzc(zzPy, "sr", Tracker.zze(zzPF).zzla());
      if ((!zzPA.equals("transaction")) && (!zzPA.equals("item"))) {
        break label383;
      }
    }
    label383:
    for (int i = 1;; i = 0)
    {
      if ((i != 0) || (Tracker.zzf(zzPF).zzlw())) {
        break label388;
      }
      Tracker.zzg(zzPF).zzh(zzPy, "Too many hits sent too quickly, rate limiting invoked");
      return;
      zzPy.remove("ate");
      zzPy.remove("adid");
      break;
    }
    label388:
    long l2 = zzam.zzbt((String)zzPy.get("ht"));
    long l1 = l2;
    if (l2 == 0L) {
      l1 = zzPB;
    }
    if (zzPC)
    {
      localObject = new zzab(zzPF, zzPy, l1, zzPD);
      Tracker.zzh(zzPF).zzc("Dry run enabled. Would have sent hit", localObject);
      return;
    }
    localObject = (String)zzPy.get("cid");
    HashMap localHashMap = new HashMap();
    zzam.zza(localHashMap, "uid", zzPy);
    zzam.zza(localHashMap, "an", zzPy);
    zzam.zza(localHashMap, "aid", zzPy);
    zzam.zza(localHashMap, "av", zzPy);
    zzam.zza(localHashMap, "aiid", zzPy);
    String str = zzPE;
    if (!TextUtils.isEmpty((CharSequence)zzPy.get("adid"))) {}
    for (;;)
    {
      localObject = new zzh(0L, (String)localObject, str, bool, 0L, localHashMap);
      l2 = Tracker.zzi(zzPF).zza((zzh)localObject);
      zzPy.put("_s", String.valueOf(l2));
      localObject = new zzab(zzPF, zzPy, l1, zzPD);
      Tracker.zzj(zzPF).zza((zzab)localObject);
      return;
      bool = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.Tracker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */