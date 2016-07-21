package com.google.android.gms.plus;

import com.google.android.gms.common.internal.zzx;
import java.util.HashSet;
import java.util.Set;

public final class Plus$PlusOptions$Builder
{
  String zzbdY;
  final Set zzbdZ = new HashSet();
  
  public final Builder addActivityTypes(String... paramVarArgs)
  {
    zzx.zzb(paramVarArgs, "activityTypes may not be null.");
    int i = 0;
    while (i < paramVarArgs.length)
    {
      zzbdZ.add(paramVarArgs[i]);
      i += 1;
    }
    return this;
  }
  
  public final Plus.PlusOptions build()
  {
    return new Plus.PlusOptions(this, null);
  }
  
  public final Builder setServerClientId(String paramString)
  {
    zzbdY = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.Plus.PlusOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */