package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzr;
import org.json.JSONObject;

public class zzef
  implements zzed
{
  private final zzjp zzpD;
  
  public zzef(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzan paramzzan)
  {
    zzpD = zzr.zzbD().zza(paramContext, new AdSizeParcel(), false, false, paramzzan, paramVersionInfoParcel);
    zzpD.getWebView().setWillNotDraw(true);
  }
  
  private void runOnUiThread(Runnable paramRunnable)
  {
    if (zzn.zzcS().zzhJ())
    {
      paramRunnable.run();
      return;
    }
    zzir.zzMc.post(paramRunnable);
  }
  
  public void destroy()
  {
    zzpD.destroy();
  }
  
  public void zzZ(String paramString)
  {
    runOnUiThread(new zzef.3(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] { paramString })));
  }
  
  public void zza(com.google.android.gms.ads.internal.client.zza paramzza, zzg paramzzg, zzdb paramzzdb, zzp paramzzp, boolean paramBoolean, zzdh paramzzdh, zzdj paramzzdj, zze paramzze, zzft paramzzft)
  {
    zzpD.zzhU().zzb(paramzza, paramzzg, paramzzdb, paramzzp, paramBoolean, paramzzdh, paramzzdj, new zze(false), paramzzft);
  }
  
  public void zza(zzed.zza paramzza)
  {
    zzpD.zzhU().zza(new zzef.6(this, paramzza));
  }
  
  public void zza(String paramString, zzdf paramzzdf)
  {
    zzpD.zzhU().zza(paramString, paramzzdf);
  }
  
  public void zza(String paramString, JSONObject paramJSONObject)
  {
    runOnUiThread(new zzef.1(this, paramString, paramJSONObject));
  }
  
  public void zzaa(String paramString)
  {
    runOnUiThread(new zzef.5(this, paramString));
  }
  
  public void zzab(String paramString)
  {
    runOnUiThread(new zzef.4(this, paramString));
  }
  
  public void zzb(String paramString, zzdf paramzzdf)
  {
    zzpD.zzhU().zzb(paramString, paramzzdf);
  }
  
  public void zzb(String paramString, JSONObject paramJSONObject)
  {
    zzpD.zzb(paramString, paramJSONObject);
  }
  
  public void zze(String paramString1, String paramString2)
  {
    runOnUiThread(new zzef.2(this, paramString1, paramString2));
  }
  
  public zzei zzen()
  {
    return new zzej(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */