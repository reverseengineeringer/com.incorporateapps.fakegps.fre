package com.google.android.gms.internal;

import java.util.Map;

public final class zzda
  implements zzdf
{
  private final zzdb zzyW;
  
  public zzda(zzdb paramzzdb)
  {
    zzyW = paramzzdb;
  }
  
  public final void zza(zzjp paramzzjp, Map paramMap)
  {
    paramzzjp = (String)paramMap.get("name");
    if (paramzzjp == null)
    {
      zzin.zzaK("App event with no name parameter.");
      return;
    }
    zzyW.onAppEvent(paramzzjp, (String)paramMap.get("info"));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzda
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */