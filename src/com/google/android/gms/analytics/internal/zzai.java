package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.internal.zzmq;

public class zzai
  extends zzd
{
  private SharedPreferences zzTh;
  private long zzTi;
  private long zzTj = -1L;
  private final zzai.zza zzTk = new zzai.zza(this, "monitoring", zzjn().zzkX(), null);
  
  protected zzai(zzf paramzzf)
  {
    super(paramzzf);
  }
  
  public void zzbp(String paramString)
  {
    zzjk();
    zzjv();
    SharedPreferences.Editor localEditor = zzTh.edit();
    if (TextUtils.isEmpty(paramString)) {
      localEditor.remove("installation_campaign");
    }
    for (;;)
    {
      if (!localEditor.commit()) {
        zzbg("Failed to commit campaign data");
      }
      return;
      localEditor.putString("installation_campaign", paramString);
    }
  }
  
  protected void zziJ()
  {
    zzTh = getContext().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
  }
  
  public long zzlF()
  {
    zzjk();
    zzjv();
    long l;
    if (zzTi == 0L)
    {
      l = zzTh.getLong("first_run", 0L);
      if (l == 0L) {
        break label46;
      }
    }
    for (zzTi = l;; zzTi = l)
    {
      return zzTi;
      label46:
      l = zzjl().currentTimeMillis();
      SharedPreferences.Editor localEditor = zzTh.edit();
      localEditor.putLong("first_run", l);
      if (!localEditor.commit()) {
        zzbg("Failed to commit first run time");
      }
    }
  }
  
  public zzaj zzlG()
  {
    return new zzaj(zzjl(), zzlF());
  }
  
  public long zzlH()
  {
    zzjk();
    zzjv();
    if (zzTj == -1L) {
      zzTj = zzTh.getLong("last_dispatch", 0L);
    }
    return zzTj;
  }
  
  public void zzlI()
  {
    zzjk();
    zzjv();
    long l = zzjl().currentTimeMillis();
    SharedPreferences.Editor localEditor = zzTh.edit();
    localEditor.putLong("last_dispatch", l);
    localEditor.apply();
    zzTj = l;
  }
  
  public String zzlJ()
  {
    zzjk();
    zzjv();
    String str = zzTh.getString("installation_campaign", null);
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    return str;
  }
  
  public zzai.zza zzlK()
  {
    return zzTk;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */