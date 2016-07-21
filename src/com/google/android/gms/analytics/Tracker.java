package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzad;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzan;
import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.analytics.internal.zzn;
import com.google.android.gms.analytics.internal.zzu;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.measurement.zzg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Tracker
  extends zzd
{
  private boolean zzPs;
  private final Map zzPt = new HashMap();
  private final zzad zzPu;
  private final Tracker.zza zzPv;
  private ExceptionReporter zzPw;
  private zzal zzPx;
  private final Map zzxA = new HashMap();
  
  Tracker(zzf paramzzf, String paramString, zzad paramzzad)
  {
    super(paramzzf);
    if (paramString != null) {
      zzxA.put("&tid", paramString);
    }
    zzxA.put("useSecure", "1");
    zzxA.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
    if (paramzzad == null) {}
    for (zzPu = new zzad("tracking", zzjl());; zzPu = paramzzad)
    {
      zzPv = new Tracker.zza(this, paramzzf);
      return;
    }
  }
  
  private static boolean zza(Map.Entry paramEntry)
  {
    String str = (String)paramEntry.getKey();
    paramEntry.getValue();
    return (str.startsWith("&")) && (str.length() >= 2);
  }
  
  private static String zzb(Map.Entry paramEntry)
  {
    if (!zza(paramEntry)) {
      return null;
    }
    return ((String)paramEntry.getKey()).substring(1);
  }
  
  private static void zzb(Map paramMap1, Map paramMap2)
  {
    zzx.zzz(paramMap2);
    if (paramMap1 == null) {}
    for (;;)
    {
      return;
      paramMap1 = paramMap1.entrySet().iterator();
      while (paramMap1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap1.next();
        String str = zzb(localEntry);
        if (str != null) {
          paramMap2.put(str, localEntry.getValue());
        }
      }
    }
  }
  
  private static void zzc(Map paramMap1, Map paramMap2)
  {
    zzx.zzz(paramMap2);
    if (paramMap1 == null) {}
    for (;;)
    {
      return;
      paramMap1 = paramMap1.entrySet().iterator();
      while (paramMap1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap1.next();
        String str = zzb(localEntry);
        if ((str != null) && (!paramMap2.containsKey(str))) {
          paramMap2.put(str, localEntry.getValue());
        }
      }
    }
  }
  
  private boolean zziK()
  {
    return zzPw != null;
  }
  
  static String zzn(Activity paramActivity)
  {
    zzx.zzz(paramActivity);
    paramActivity = paramActivity.getIntent();
    if (paramActivity == null) {}
    do
    {
      return null;
      paramActivity = paramActivity.getStringExtra("android.intent.extra.REFERRER_NAME");
    } while (TextUtils.isEmpty(paramActivity));
    return paramActivity;
  }
  
  public void enableAdvertisingIdCollection(boolean paramBoolean)
  {
    zzPs = paramBoolean;
  }
  
  public void enableAutoActivityTracking(boolean paramBoolean)
  {
    zzPv.enableAutoActivityTracking(paramBoolean);
  }
  
  public void enableExceptionReporting(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        if (zziK() == paramBoolean) {
          return;
        }
        if (paramBoolean)
        {
          Context localContext = getContext();
          zzPw = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), localContext);
          Thread.setDefaultUncaughtExceptionHandler(zzPw);
          zzbd("Uncaught exceptions will be reported to Google Analytics");
          return;
        }
      }
      finally {}
      Thread.setDefaultUncaughtExceptionHandler(zzPw.zziD());
      zzbd("Uncaught exceptions will not be reported to Google Analytics");
    }
  }
  
  public String get(String paramString)
  {
    zzjv();
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      return null;
      if (zzxA.containsKey(paramString)) {
        return (String)zzxA.get(paramString);
      }
      if (paramString.equals("&ul")) {
        return zzam.zza(Locale.getDefault());
      }
      if (paramString.equals("&cid")) {
        return zzjr().zzkk();
      }
      if (paramString.equals("&sr")) {
        return zzju().zzla();
      }
      if (paramString.equals("&aid")) {
        return zzjt().zzjS().zzwK();
      }
      if (paramString.equals("&an")) {
        return zzjt().zzjS().zzlg();
      }
      if (paramString.equals("&av")) {
        return zzjt().zzjS().zzli();
      }
    } while (!paramString.equals("&aiid"));
    return zzjt().zzjS().zzAJ();
  }
  
  public void send(Map paramMap)
  {
    long l = zzjl().currentTimeMillis();
    if (zziC().getAppOptOut())
    {
      zzbe("AppOptOut is set to true. Not sending Google Analytics hit");
      return;
    }
    boolean bool1 = zziC().isDryRunEnabled();
    HashMap localHashMap = new HashMap();
    zzb(zzxA, localHashMap);
    zzb(paramMap, localHashMap);
    boolean bool2 = zzam.zzh((String)zzxA.get("useSecure"), true);
    zzc(zzPt, localHashMap);
    zzPt.clear();
    paramMap = (String)localHashMap.get("t");
    if (TextUtils.isEmpty(paramMap))
    {
      zzjm().zzh(localHashMap, "Missing hit type parameter");
      return;
    }
    String str = (String)localHashMap.get("tid");
    if (TextUtils.isEmpty(str))
    {
      zzjm().zzh(localHashMap, "Missing tracking id parameter");
      return;
    }
    boolean bool3 = zziL();
    try
    {
      if (("screenview".equalsIgnoreCase(paramMap)) || ("pageview".equalsIgnoreCase(paramMap)) || ("appview".equalsIgnoreCase(paramMap)) || (TextUtils.isEmpty(paramMap)))
      {
        int j = Integer.parseInt((String)zzxA.get("&a")) + 1;
        int i = j;
        if (j >= Integer.MAX_VALUE) {
          i = 1;
        }
        zzxA.put("&a", Integer.toString(i));
      }
      zzjo().zzf(new Tracker.1(this, localHashMap, bool3, paramMap, l, bool1, bool2, str));
      return;
    }
    finally {}
  }
  
  public void set(String paramString1, String paramString2)
  {
    zzx.zzb(paramString1, "Key should be non-null");
    if (TextUtils.isEmpty(paramString1)) {
      return;
    }
    zzxA.put(paramString1, paramString2);
  }
  
  public void setAnonymizeIp(boolean paramBoolean)
  {
    set("&aip", zzam.zzK(paramBoolean));
  }
  
  public void setAppId(String paramString)
  {
    set("&aid", paramString);
  }
  
  public void setAppInstallerId(String paramString)
  {
    set("&aiid", paramString);
  }
  
  public void setAppName(String paramString)
  {
    set("&an", paramString);
  }
  
  public void setAppVersion(String paramString)
  {
    set("&av", paramString);
  }
  
  public void setCampaignParamsOnNextHit(Uri paramUri)
  {
    if ((paramUri == null) || (paramUri.isOpaque())) {}
    do
    {
      do
      {
        return;
        paramUri = paramUri.getQueryParameter("referrer");
      } while (TextUtils.isEmpty(paramUri));
      paramUri = Uri.parse("http://hostname/?" + paramUri);
      String str = paramUri.getQueryParameter("utm_id");
      if (str != null) {
        zzPt.put("&ci", str);
      }
      str = paramUri.getQueryParameter("anid");
      if (str != null) {
        zzPt.put("&anid", str);
      }
      str = paramUri.getQueryParameter("utm_campaign");
      if (str != null) {
        zzPt.put("&cn", str);
      }
      str = paramUri.getQueryParameter("utm_content");
      if (str != null) {
        zzPt.put("&cc", str);
      }
      str = paramUri.getQueryParameter("utm_medium");
      if (str != null) {
        zzPt.put("&cm", str);
      }
      str = paramUri.getQueryParameter("utm_source");
      if (str != null) {
        zzPt.put("&cs", str);
      }
      str = paramUri.getQueryParameter("utm_term");
      if (str != null) {
        zzPt.put("&ck", str);
      }
      str = paramUri.getQueryParameter("dclid");
      if (str != null) {
        zzPt.put("&dclid", str);
      }
      str = paramUri.getQueryParameter("gclid");
      if (str != null) {
        zzPt.put("&gclid", str);
      }
      paramUri = paramUri.getQueryParameter("aclid");
    } while (paramUri == null);
    zzPt.put("&aclid", paramUri);
  }
  
  public void setClientId(String paramString)
  {
    set("&cid", paramString);
  }
  
  public void setEncoding(String paramString)
  {
    set("&de", paramString);
  }
  
  public void setHostname(String paramString)
  {
    set("&dh", paramString);
  }
  
  public void setLanguage(String paramString)
  {
    set("&ul", paramString);
  }
  
  public void setLocation(String paramString)
  {
    set("&dl", paramString);
  }
  
  public void setPage(String paramString)
  {
    set("&dp", paramString);
  }
  
  public void setReferrer(String paramString)
  {
    set("&dr", paramString);
  }
  
  public void setSampleRate(double paramDouble)
  {
    set("&sf", Double.toString(paramDouble));
  }
  
  public void setScreenColors(String paramString)
  {
    set("&sd", paramString);
  }
  
  public void setScreenName(String paramString)
  {
    set("&cd", paramString);
  }
  
  public void setScreenResolution(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) && (paramInt2 < 0))
    {
      zzbg("Invalid width or height. The values should be non-negative.");
      return;
    }
    set("&sr", paramInt1 + "x" + paramInt2);
  }
  
  public void setSessionTimeout(long paramLong)
  {
    zzPv.setSessionTimeout(1000L * paramLong);
  }
  
  public void setTitle(String paramString)
  {
    set("&dt", paramString);
  }
  
  public void setUseSecure(boolean paramBoolean)
  {
    set("useSecure", zzam.zzK(paramBoolean));
  }
  
  public void setViewportSize(String paramString)
  {
    set("&vp", paramString);
  }
  
  void zza(zzal paramzzal)
  {
    zzbd("Loading Tracker config values");
    zzPx = paramzzal;
    if (zzPx.zzlT())
    {
      paramzzal = zzPx.getTrackingId();
      set("&tid", paramzzal);
      zza("trackingId loaded", paramzzal);
    }
    if (zzPx.zzlU())
    {
      paramzzal = Double.toString(zzPx.zzlV());
      set("&sf", paramzzal);
      zza("Sample frequency loaded", paramzzal);
    }
    if (zzPx.zzlW())
    {
      int i = zzPx.getSessionTimeout();
      setSessionTimeout(i);
      zza("Session timeout loaded", Integer.valueOf(i));
    }
    boolean bool;
    if (zzPx.zzlX())
    {
      bool = zzPx.zzlY();
      enableAutoActivityTracking(bool);
      zza("Auto activity tracking loaded", Boolean.valueOf(bool));
    }
    if (zzPx.zzlZ())
    {
      bool = zzPx.zzma();
      if (bool) {
        set("&aip", "1");
      }
      zza("Anonymize ip loaded", Boolean.valueOf(bool));
    }
    enableExceptionReporting(zzPx.zzmb());
  }
  
  protected void zziJ()
  {
    zzPv.zza();
    String str = zziI().zzlg();
    if (str != null) {
      set("&an", str);
    }
    str = zziI().zzli();
    if (str != null) {
      set("&av", str);
    }
  }
  
  boolean zziL()
  {
    return zzPs;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.Tracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */