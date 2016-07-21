package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.q;
import java.util.HashMap;

public final class CustomEventExtras
  implements q
{
  private final HashMap zzOv = new HashMap();
  
  public final Object getExtra(String paramString)
  {
    return zzOv.get(paramString);
  }
  
  public final void setExtra(String paramString, Object paramObject)
  {
    zzOv.put(paramString, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventExtras
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */