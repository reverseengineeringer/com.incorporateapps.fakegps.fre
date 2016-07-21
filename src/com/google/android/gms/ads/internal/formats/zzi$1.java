package com.google.android.gms.ads.internal.formats;

import android.text.TextUtils;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import java.util.Map;

class zzi$1
  implements zzdf
{
  zzi$1(zzi paramzzi) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    zzi.zzc(zzyx).zzhU().zza(new zzi.1.1(this, paramMap));
    paramzzjp = (String)paramMap.get("overlayHtml");
    paramMap = (String)paramMap.get("baseUrl");
    if (TextUtils.isEmpty(paramMap))
    {
      zzi.zzc(zzyx).loadData(paramzzjp, "text/html", "UTF-8");
      return;
    }
    zzi.zzc(zzyx).loadDataWithBaseURL(paramMap, paramzzjp, "text/html", "UTF-8", null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzi.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */